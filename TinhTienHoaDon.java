import java.util.Scanner;

public class TinhTienHoaDon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("========= NHẬP THÔNG TIN HÓA ĐƠN =========");

        // 1. Nhập tên khách hàng
        System.out.print("Nhập tên khách hàng: ");
        String tenKhachHangString = scanner.nextLine();

        // 2. Nhập tên sản phẩm
        System.out.print("Nhập tên sản phẩm: ");
        String tenSanPhamString = scanner.nextLine();

        // 3. Nhập giá sản phẩm
        System.out.print("Nhập giá sản phẩm: ");
        double giaSanPhamDouble = Double.parseDouble(scanner.nextLine());

        // 4. Nhập số lượng mua
        System.out.print("Nhập số lượng mua: ");
        int soLuongInt = Integer.parseInt(scanner.nextLine());

        // 5. Nhập thẻ thành viên
        System.out.print("Khách có thẻ thành viên? (true/false): ");
        boolean coTheThanhVienBoolean = Boolean.parseBoolean(scanner.nextLine());

        // --- TÍNH TOÁN CÁC THÔNG SỐ ---
        double thanhTienDouble = giaSanPhamDouble * soLuongInt;

        // Kiểm tra điều kiện có thẻ thành viên bằng câu lệnh if-else
        double giamGiaDouble = 0;
        if (coTheThanhVienBoolean) {
            giamGiaDouble = thanhTienDouble * 0.10; // Giảm 10% nếu có thẻ thành viên
        } else {
            giamGiaDouble = 0; // Không có thẻ thì không giảm
        }

        // Tính tiền VAT 8% trên số tiền sau khi đã giảm giá
        double tienVatDouble = thanhTienDouble * 0.08;

        // Tổng tiền thanh toán
        double tongThanhToanDouble = thanhTienDouble - giamGiaDouble + tienVatDouble;

        // --- HIỂN THỊ HÓA ĐƠN RA MÀN HÌNH ---
        System.out.println("================= HÓA ĐƠN =================");
        System.out.println("Khách hàng : " + tenKhachHangString);
        System.out.println("Sản phẩm   : " + tenSanPhamString);
        System.out.println("Số lượng   : " + soLuongInt);
        System.out.println("Đơn giá    : " + String.format("%,.2f", giaSanPhamDouble) + " VND");
        System.out.println("Thành tiền : " + String.format("%,.2f", thanhTienDouble) + " VND");
        System.out.println("Giảm giá thành viên 10% : " + String.format("%,.2f", giamGiaDouble) + " VND");
        System.out.println("Tiền VAT 8% : " + String.format("%,.2f", tienVatDouble) + " VND");
        System.out.println("Tổng thanh toán: " + String.format("%,.2f", tongThanhToanDouble) + " VND");
        System.out.println("==========================================");

        scanner.close();
    }
}
