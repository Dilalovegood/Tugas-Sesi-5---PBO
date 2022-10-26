
package sesi5;

import java.util.ArrayList;

/**
 *
 * @author Dila
 */
public class Mahasiswa extends Person{
    private int jumlah_matkul;
    private ArrayList<String> mata_kuliah;
    private ArrayList<Integer> nilai;
    
    public Mahasiswa (String name, String address){
        super(name, address);
        mata_kuliah = new ArrayList<>();
        nilai = new ArrayList<>();
    }
    
    public void addmata_kuliahGrade (String mata_kuliah, int grade){
        this.mata_kuliah.add(mata_kuliah);
        this.nilai.add(grade);
        jumlah_matkul++;
        
    }
    
    public void printnilai(){
        for(int i=0; i< jumlah_matkul; i++){
            System.out.println("mata kuliah: " + mata_kuliah.get(i) + " grade: " + nilai.get(i));
        }
    }
    
    public double getAverageGrade(){
        int jumlah = 0;
        for (int i = 0; i<jumlah_matkul; i++){
            jumlah += nilai.get(i);
        }
        return jumlah/jumlah_matkul;
    }
    
    public String toString(){
        return
        super.toString()+
        "Jumlah mata kuliah yang diambil: " + this.jumlah_matkul +
        "\nRata-rata nilai: " + getAverageGrade();
    }
}
