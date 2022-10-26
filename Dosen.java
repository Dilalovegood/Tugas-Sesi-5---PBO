
package sesi5;
import java.util.ArrayList;

/**
 *
 * @author Dila
 */
public class Dosen extends Person{
    private int jumlah_matkul;
    private ArrayList<String> listMatkul;
    
    public Dosen(String name, String address){
        super(name, address);
        jumlah_matkul = 0;
        listMatkul = new ArrayList<>();
        
    }
    
    public boolean addCourse (String course){
        if(!listMatkul.contains(course)){
            System.out.println("mata kuliah sudah ada");
            return false;
            
        }
        
        //menambahkan
        jumlah_matkul++;
        listMatkul.add(course);
        return true;
    }
    
    public boolean removeCourse (String course){
        if(!listMatkul.contains(course)){
            System.out.println("mata kuliah yang akan dihapus tidak ada");
            return false;
            
        }
        
        //if remove
        jumlah_matkul--;
        listMatkul.remove(course);
        return true;
    }
    
        public int getjumlah_matkul(){
            return jumlah_matkul;
        }
        
        public String toString(){
            return
            super.toString() +
                    "\n Jumlah mata kuliah yang diampu : " + getjumlah_matkul();
        }
        
}
