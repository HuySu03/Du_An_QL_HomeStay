/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Du_An_1.DAO;
import Du_An_1.Entity.BookingPhong;
import Du_An_1.Untils.DBConnect;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author admin
 */
public class BookingPhongDAO extends HomStayDAO<BookingPhong, String>{
    String INSERT_SQL = "INSERT INTO Booking_Phong(id_booking_phong, ngay_dat, check_in, check_out, id_phong, id_KH, id_NV)  \n" +
"VALUES (?,?,?,?,?,?,?)";
    String UPDATE_SQL = "UPDATE<ChiTietDichVu SET MaDV = ?, SoLuong = ?, ThanhTien = ? WHERE MaPhong = ?";
    String DELETE_SQL = "DELETE FROM Booking_Phong WHERE id_booking_phong = ?;";
    String SELECTALL_SQL = "SELECT * FROM<Booking_Phong";
    String SELECT_BY_ID_SQL = "SELECT * FROM<Booking_Phong WHERE id_booking_phong = ?";

    @Override
    public void insert(BookingPhong enity) {
    DBConnect.update(INSERT_SQL,
            enity.getIDBooking(),
            enity.getNgayDat(),
            enity.getCheckIn(),
            enity.getCheckOut(),
            enity.getIdPhong(),
            enity.getIdKH(),
            enity.getIdNV());
    }

    @Override
    public void Update(BookingPhong enity) {
        DBConnect.update(DELETE_SQL
                , enity.getIDBooking()
        ,enity.getNgayDat()
        ,enity.getCheckIn()
        ,enity.getCheckOut()
        ,enity.getIdPhong()
        ,enity.getIdKH()
        ,enity.getIdNV()
        );
    }

    @Override
    public void delete(String key) {
       DBConnect.update(DELETE_SQL, key);
    }

    @Override
    public List<BookingPhong> selectAll() {
       return this.selectBySql(SELECTALL_SQL);
    }

    @Override
    public BookingPhong selectByID(String key) {
    List<BookingPhong> list= this.selectBySql(SELECT_BY_ID_SQL, key);
    if(list.isEmpty()){
        return null;
    }
    return list.get(0);
    }

    @Override
    protected List<BookingPhong> selectBySql(String sql, Object... args) {
        List<BookingPhong> list= new ArrayList<>();
        try {
            ResultSet rs = DBConnect.query(sql, args);
            while(rs.next()){
            BookingPhong entity = new BookingPhong();
            entity.setIdPhong(rs.getNString("IdPhong"));
            entity.setNgayDat(rs.getDate("NgayDat"));
            entity.setCheckIn(rs.getDate("CheckIn"));
            entity.setCheckOut(rs.getDate("CheckOut"));
            entity.setIdPhong(rs.getString("IdPhong"));
            entity.setIdKH(rs.getString("IdKH"));
            entity.setIdNV(rs.getString("IdNV"));
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
