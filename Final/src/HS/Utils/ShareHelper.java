package HS.Utils;

import HS.Model.Model_Nhan_Vien;

public class ShareHelper {

    public static Model_Nhan_Vien USER = null;

    // Biến identity, sửa lại chính tả thành 'identity'
    public static int identity = 0;

    /**
     * Đăng xuất người dùng (logoff).
     */
    public static void logoff() {
        ShareHelper.USER = null;
    }

    /**
     * Kiểm tra xem người dùng đã đăng nhập chưa.
     * 
     * @return true nếu người dùng đã đăng nhập, false nếu chưa.
     */
    public static boolean auth() {
        return ShareHelper.USER != null;
    }

    /**
     * Kiểm tra xem người dùng đã được xác thực và có quyền admin chưa.
     * 
     * @return true nếu người dùng là admin, false nếu không.
     */
    public static boolean authenticated() {
        return ShareHelper.auth() && USER.isChucvu();  // Thay isChucVu() bằng isAdmin()
    }

    /**
     * Kiểm tra xem người dùng đã được xác thực và là nhân viên bình thường chưa.
     * 
     * @return true nếu người dùng là nhân viên, false nếu không.
     */
    public static boolean authenticatedNV() {
        return ShareHelper.auth() && !USER.isChucvu();  // Thay isChucVu() bằng isAdmin()
    }

    /**
     * Trả về giá trị của biến identity.
     * 
     * @return identity.
     */
    public static int getIdentity() {
        return ShareHelper.identity;  // Trả về trực tiếp giá trị identity, tránh đệ quy
    }
}
