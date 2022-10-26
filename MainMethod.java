
package sesi5;

import java.util.Scanner;

/**
 *
 * @author Dila
 */
public class MainMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Input nama dosen: ");
        String nama = sc.nextLine();
        System.out.println("Input alamat dosen: ");
        String alamat = sc.nextLine();
        
        Dosen lecturer = new Dosen (nama, alamat);
        
for(int i=0; i<3; i++){
    System.out.print("Input mata kuliah yang diampu: ");
    String matkul = sc.nextLine();
    lecturer.addCourse(matkul);
}

        System.out.println(lecturer);
    }
}