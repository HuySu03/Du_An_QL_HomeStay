--Quản lý khách hàng
-- Thêm khách hàng mới
INSERT INTO Khach_Hang (id_KH, ho_ten, sdt, cccd, dia_chi, gioi_tinh, tuoi)
VALUES (...);

-- Cập nhật thông tin khách
UPDATE Khach_Hang 
SET dia_chi = N'Địa chỉ mới', sdt = '0987654321' 
WHERE id_KH = 'KH001';

-- Tìm kiếm khách hàng theo tên/SĐT
SELECT * FROM Khach_Hang 
WHERE ho_ten LIKE N'%Nguyễn Văn A%' OR sdt = '0912345678';

-- Xem lịch sử đặt phòng của khách
SELECT OHS.*, HS.ten_HS 
FROM Order_HomeStay OHS
JOIN HomeStay HS ON OHS.id_HS = HS.id_HS
WHERE OHS.id_KH = 'KH001';



--Quản lý homestay
-- Thêm homestay mới
INSERT INTO HomeStay (id_HS, ten_HS, gia_HS, dia_chi, dien_tich, sdt, mo_ta)
VALUES (...);

-- Cập nhật giá homestay
UPDATE HomeStay 
SET gia_HS = 2500000 
WHERE id_HS = 'HS001';

-- Tìm homestay theo tiêu chí
SELECT * FROM HomeStay
WHERE gia_HS BETWEEN 1000000 AND 3000000
AND dia_chi LIKE N'%Đà Lạt%'
AND dien_tich >= 100;

-- Kiểm tra phòng trống theo ngày
SELECT HS.* 
FROM HomeStay HS
WHERE NOT EXISTS (
    SELECT 1 
    FROM Order_HomeStay OHS 
    WHERE OHS.id_HS = HS.id_HS 
    AND '2023-12-25' BETWEEN OHS.check_in AND OHS.check_out
);

--booking
-- Tạo đơn đặt phòng
BEGIN TRANSACTION;
INSERT INTO Order_HomeStay 
VALUES ('OHS016', GETDATE(), '2023-12-24', '2023-12-26', 'HS001', 'KH001', 'NV002');

UPDATE Trang_Thai 
SET trang_thai = 1 
WHERE id_HS = 'HS001';
COMMIT;

-- Thêm dịch vụ kèm theo
INSERT INTO Order_Dich_Vu 
VALUES ('ODV016', 'DV003', 'HS001', GETDATE(), N'Thuê xe máy 3 ngày');

-- Tính tổng tiền tạm tính
SELECT 
    HS.gia_HS * DATEDIFF(day, OHS.check_in, OHS.check_out) AS TienPhong,
    SUM(DV.gia_DV) AS TienDichVu,
    (HS.gia_HS * DATEDIFF(day, OHS.check_in, OHS.check_out) + SUM(DV.gia_DV)) AS TongTamTinh
FROM Order_HomeStay OHS
JOIN HomeStay HS ON OHS.id_HS = HS.id_HS
LEFT JOIN Order_Dich_Vu ODV ON OHS.id_order_HS = ODV.id_order_DV
LEFT JOIN Dich_Vu DV ON ODV.id_DV = DV.id_DV
WHERE OHS.id_order_HS = 'OHS001'
GROUP BY HS.gia_HS, OHS.check_in, OHS.check_out;



--Quản lý thanh toán
-- Tạo hóa đơn với voucher
INSERT INTO Hoa_Don 
VALUES ('HD016', 'VC001', 'ODV016', 'OHS016', 'KH001', 'NV002', GETDATE(), 1, 
        (tong_tien_calculated), 1, N'Đã thanh toán qua ví điện tử');

-- Xem hóa đơn chi tiết
SELECT HD.*, V.ten_Voucher, V.chiet_khau, HS.ten_HS, KH.ho_ten
FROM Hoa_Don HD
LEFT JOIN Voucher V ON HD.id_Voucher = V.id_Voucher
JOIN HomeStay HS ON HD.id_order_HS = HS.id_HS
JOIN Khach_Hang KH ON HD.id_KH = KH.id_KH
WHERE HD.id_HD = 'HD001';

-- Thống kê doanh thu theo tháng
SELECT 
    YEAR(ngay_tao) AS Nam,
    MONTH(ngay_tao) AS Thang,
    SUM(tong_tien) AS DoanhThu
FROM Hoa_Don
GROUP BY YEAR(ngay_tao), MONTH(ngay_tao)
ORDER BY Nam, Thang;


--Đánh giá
-- Thêm đánh giá mới
INSERT INTO Danh_Gia 
VALUES ('DG016', 'KH001', 'HS001', 5, N'Trải nghiệm tuyệt vời', GETDATE());

-- Xem đánh giá theo homestay
SELECT DG.*, KH.ho_ten 
FROM Danh_Gia DG
JOIN Khach_Hang KH ON DG.id_KH = KH.id_KH
WHERE DG.id_HS = 'HS001';

-- Tính điểm đánh giá trung bình
SELECT id_HS, AVG(danh_gia) AS DiemTrungBinh
FROM Danh_Gia
GROUP BY id_HS;

--voucher
-- Kiểm tra voucher hợp lệ
SELECT * FROM Voucher
WHERE ngay_het_han >= GETDATE()
AND trang_thai = 1
AND ten_Voucher LIKE N'%Summer Sale%';

-- Cập nhật trạng thái voucher
UPDATE Voucher 
SET trang_thai = 0 
WHERE id_Voucher = 'VC001';

-- Thống kê voucher sử dụng
SELECT 
    V.ten_Voucher,
    COUNT(HD.id_HD) AS SoLuotDung,
    SUM(HD.tong_tien) AS TongDoanhThu
FROM Voucher V
LEFT JOIN Hoa_Don HD ON V.id_Voucher = HD.id_Voucher
GROUP BY V.ten_Voucher;



--báo cáo và thống kê
-- Top 5 homestay đặt nhiều nhất
SELECT TOP 5 
    HS.id_HS,
    HS.ten_HS,
    COUNT(OHS.id_order_HS) AS SoLuotDat
FROM Order_HomeStay OHS
JOIN HomeStay HS ON OHS.id_HS = HS.id_HS
GROUP BY HS.id_HS, HS.ten_HS
ORDER BY SoLuotDat DESC;

-- Doanh thu theo nhân viên
SELECT 
    NV.id_NV,
    NV.ho_ten,
    COUNT(HD.id_HD) AS SoHoaDon,
    SUM(HD.tong_tien) AS TongDoanhThu
FROM Hoa_Don HD
JOIN Nhan_Vien NV ON HD.id_NV = NV.id_NV
GROUP BY NV.id_NV, NV.ho_ten;


--Quản lý người dùng
-- Đăng nhập
SELECT NV.*, U.tai_khoan 
FROM Users U
JOIN Nhan_Vien NV ON U.id_NV = NV.id_NV
WHERE U.tai_khoan = 'manager' AND U.mat_khau = 'manager123';

-- Phân quyền theo chức vụ
CREATE ROLE QuanLy;
GRANT SELECT, INSERT, UPDATE, DELETE ON ALL TABLES TO QuanLy;

CREATE ROLE LeTan;
GRANT SELECT, INSERT ON Order_HomeStay, Order_Dich_Vu TO LeTan;


--procedures
-- SP Đặt phòng check trống
CREATE PROCEDURE sp_DatPhong
    @id_order_HS VARCHAR(10),
    @id_HS VARCHAR(10),
    @id_KH VARCHAR(10),
    @id_NV VARCHAR(10),
    @check_in DATE,
    @check_out DATE
AS
BEGIN
    BEGIN TRY
        BEGIN TRANSACTION
        
        -- Kiểm tra phòng trống
        IF EXISTS (
            SELECT 1 
            FROM Order_HomeStay 
            WHERE id_HS = @id_HS 
            AND (
                (@check_in BETWEEN check_in AND check_out) OR
                (@check_out BETWEEN check_in AND check_out)
            )
        BEGIN
            RAISERROR('Phòng không trống trong khoảng thời gian này', 16, 1)
            RETURN
        END

        -- Tạo đơn đặt
        INSERT INTO Order_HomeStay 
        VALUES (@id_order_HS, GETDATE(), @check_in, @check_out, @id_HS, @id_KH, @id_NV)

        -- Cập nhật trạng thái
        UPDATE Trang_Thai SET trang_thai = 1 WHERE id_HS = @id_HS
        
        COMMIT
    END TRY
    BEGIN CATCH
        ROLLBACK
        THROW
    END CATCH
END

--tính tổng tiền hóa đơn tự động
CREATE PROCEDURE sp_TaoHoaDon
    @id_HD VARCHAR(10),
    @id_Voucher VARCHAR(10) = NULL,
    @id_order_HS VARCHAR(10)
AS
BEGIN
    DECLARE @tienPhong MONEY,
            @tienDichVu MONEY,
            @chietKhau INT,
            @tongTien MONEY

    -- Tính tiền phòng
    SELECT @tienPhong = DATEDIFF(day, check_in, check_out) * gia_HS
    FROM Order_HomeStay OHS
    JOIN HomeStay HS ON OHS.id_HS = HS.id_HS
    WHERE OHS.id_order_HS = @id_order_HS

    -- Tính tiền dịch vụ
    SELECT @tienDichVu = SUM(DV.gia_DV)
    FROM Order_Dich_Vu ODV
    JOIN Dich_Vu DV ON ODV.id_DV = DV.id_DV
    WHERE ODV.id_order_HS = @id_order_HS

    -- Lấy chiết khấu voucher
    SELECT @chietKhau = ISNULL(chiet_khau, 0)
    FROM Voucher 
    WHERE id_Voucher = @id_Voucher 
    AND ngay_het_han >= GETDATE()
    AND trang_thai = 1

    -- Tính tổng
    SET @tongTien = (@tienPhong + ISNULL(@tienDichVu, 0)) * (1 - @chietKhau/100.0)

    -- Tạo hóa đơn
    INSERT INTO Hoa_Don (id_HD, id_Voucher, id_order_HS, id_KH, id_NV, ngay_tao, loai_thanh_toan, tong_tien, trang_thai)
    SELECT @id_HD, @id_Voucher, @id_order_HS, OHS.id_KH, OHS.id_NV, GETDATE(), 0, @tongTien, 1
    FROM Order_HomeStay OHS
    WHERE OHS.id_order_HS = @id_order_HS
END


--triggers
--Tự động cập nhật trạng thái phòng
CREATE TRIGGER trg_CapNhatTrangThai
ON Order_HomeStay
AFTER INSERT, UPDATE, DELETE
AS
BEGIN
    UPDATE Trang_Thai
    SET trang_thai = CASE 
        WHEN EXISTS (
            SELECT 1 
            FROM Order_HomeStay 
            WHERE id_HS = Trang_Thai.id_HS 
            AND GETDATE() BETWEEN check_in AND check_out
        ) THEN 1 ELSE 0 END
    FROM Trang_Thai
END

--Kiểm tra ngày hợp lệ khi đặt phòng
CREATE TRIGGER trg_KiemTraNgayDat
ON Order_HomeStay
AFTER INSERT, UPDATE
AS
BEGIN
    IF EXISTS (
        SELECT 1 
        FROM inserted 
        WHERE check_in >= check_out OR check_in < GETDATE()
    )
    BEGIN
        RAISERROR('Ngày check-in không hợp lệ', 16, 1)
        ROLLBACK
    END
END


--Tự động hủy đơn dịch vụ khi hủy đơn phòng 
CREATE TRIGGER trg_HuyDichVuKhiHuyPhong
ON Order_HomeStay
AFTER DELETE
AS
BEGIN
    DELETE FROM Order_Dich_Vu
    WHERE id_order_HS IN (SELECT id_order_HS FROM deleted)
    
    UPDATE Trang_Thai
    SET trang_thai = 0
    WHERE id_HS IN (SELECT id_HS FROM deleted)
END

--check đánh giá
CREATE PROCEDURE sp_ThemDanhGia
    @id_DG VARCHAR(10),
    @id_KH VARCHAR(10),
    @id_HS VARCHAR(10),
    @danh_gia TINYINT,
    @noiDung NVARCHAR(255)
AS
BEGIN
    IF @danh_gia < 1 OR @danh_gia > 5
    BEGIN
        RAISERROR('Đánh giá phải từ 1-5 sao', 16, 1)
        RETURN
    END

    IF NOT EXISTS (
        SELECT 1 
        FROM Order_HomeStay 
        WHERE id_KH = @id_KH 
        AND id_HS = @id_HS
    )
    BEGIN
        RAISERROR('Khách hàng chưa từng đặt phòng này', 16, 1)
        RETURN
    END

    INSERT INTO Danh_Gia
    VALUES (@id_DG, @id_KH, @id_HS, @danh_gia, @noiDung, GETDATE())
END


--Trigger kiểm tra voucher khi dùng
CREATE TRIGGER trg_KiemTraVoucher
ON Hoa_Don
BEFORE INSERT
AS
BEGIN
    IF EXISTS (
        SELECT 1 
        FROM inserted i
        LEFT JOIN Voucher v ON i.id_Voucher = v.id_Voucher
        WHERE v.trang_thai = 0 
           OR v.ngay_het_han < GETDATE()
           OR v.id_Voucher IS NULL
    )
    BEGIN
        RAISERROR('Voucher không hợp lệ hoặc đã hết hạn', 16, 1)
        ROLLBACK
    END
END

--trigg Đặt Phongg
EXEC sp_DatPhong 
    @id_order_HS = 'OHS016',
    @id_HS = 'HS001',
    @id_KH = 'KH001',
    @id_NV = 'NV002',
    @check_in = '2023-12-24',
    @check_out = '2023-12-26'

	--Tạo hóa đơn
	EXEC sp_TaoHoaDon 
    @id_HD = 'HD016',
    @id_Voucher = 'VC001',
    @id_order_HS = 'OHS001'

	--Thêm đánh giá
	EXEC sp_ThemDanhGia 
    @id_DG = 'DG016',
    @id_KH = 'KH001',
    @id_HS = 'HS001',
    @danh_gia = 5,
    @noiDung = N'Dịch vụ tuyệt vời'