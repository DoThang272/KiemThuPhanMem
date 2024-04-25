package KiemThuPhanMem;
package JavaC;
import java.util.Scanner;

public class TriangleClassifier {
    public static String classifyTriangle(int side1, int side2, int side3) {
        // Kiểm tra xem các cạnh có dương không
        if (side1 <= 0 || side2 <= 0 || side3 <= 0) {
            return "NotATriangle";
        }
        
        // Kiểm tra điều kiện tồn tại của tam giác
        if (side1 + side2 <= side3 || side1 + side3 <= side2 || side2 + side3 <= side1) {
            return "NotATriangle";
        }
        
        // Xác định loại tam giác
        if (side1 == side2 && side2 == side3) {
            return "Equilateral"; // Tam giác đều
        } else if (side1 == side2 || side1 == side3 || side2 == side3) {
            return "Isosceles"; // Tam giác cân
        } else if(side1 * side1 == side2*side2 + side3*side3 || side2 * side2 == side1*side1 + side3*side3 || side3 * side3 == side2*side2 + side1*side1){
            return "right triangle";
        }else {
            return "Scalene"; // Tam giác thường
        } 
    }

    public static void main(String[] args) {
        // Kiểm tra nếu không có đủ 3 đối số đầu vào
      
        Scanner scanner = new Scanner(System.in);
        try {
        System.out.println("Nhập độ dài cạnh thứ nhất:");
        int side1 = scanner.nextInt();
        System.out.println("Nhập độ dài cạnh thứ hai:");
        int side2 = scanner.nextInt();
        System.out.println("Nhập độ dài cạnh thứ ba:");
        int side3 = scanner.nextInt();

        // Chuyển các đối số từ chuỗi sang số nguyên

        // Xác định và in ra loại tam giác
        String triangleType = classifyTriangle(side1, side2, side3);
        System.out.println("Loai tam giac: " + triangleType);
        }
        finally {
            scanner.close();
        }
    }
}   
