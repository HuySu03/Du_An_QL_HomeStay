package HS.Utils;

import HS.Model.Model_NhanVien;

public class ShareHelper {

    public static Model_NhanVien USER = null;

    // Biến identity
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
     * (Đã bỏ chức năng phân quyền admin/nhân viên)
     * 
     * Mặc định trả về true nếu đã đăng nhập.
     */
    public static boolean authenticated() {
        return auth();
    }

    /**
     * (Đã bỏ chức năng phân quyền nhân viên)
     * 
     * Mặc định trả về true nếu đã đăng nhập.
     */
    public static boolean authenticatedNV() {
        return auth();
    }

    /**
     * Trả về giá trị của biến identity.
     */
    public static int getIdentity() {
        return ShareHelper.identity;
    }
}
