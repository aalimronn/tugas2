//Ali Imron
//227064516078
package tugasskuliah2;


public class Main {
    

    public static void main(String[] args) {
        
    Karyawan karyawan1 = new Karyawan();
    karyawan1.karyawan("2003", "Anastasia", "Perempuan");
    
    karyawan1.absenKerja();
    
    karyawan1.hitungGaji();
    
    System.out.println("NIP : " + karyawan1.NIP);
    System.out.println("Nama : " + karyawan1.nama);
    System.out.println("Jenis Kelamin : " + karyawan1.jenisKelamin);
    System.out.println("Total Gaji : " + karyawan1.totalGaji);
    System.out.println("===========================================");
    
    Karyawan karyawan2 = new Karyawan();
    karyawan2.karyawan("2000", "Aminah", "Perempuan");
    
    karyawan2.hitungGaji(30);
    
    System.out.println("NIP : " + karyawan2.NIP);
    System.out.println("Nama : " + karyawan2.nama);
    System.out.println("Jenis Kelamin : " + karyawan2.jenisKelamin);
    System.out.println("Total Gaji : " + karyawan2.totalGaji);
    System.out.println("===========================================");
    
    Dosen dosen1 = new Dosen();
    dosen1.karyawan("1982", "Asepudin", "Laki-laki");
    dosen1.golongan = "b";
    dosen1.jumlah_sks = 5;
    dosen1.jumlahHari = 15;
    
    dosen1.hitungGaji();
    
    System.out.println("NIP : " + dosen1.NIP);
    System.out.println("Nama : " + dosen1.nama);
    System.out.println("Jenis Kelamin : " + dosen1.jenisKelamin);
    System.out.println("Total Gaji : " + dosen1.totalGaji);
    System.out.println("===========================================");
    
    Dosen dosen2 = new Dosen();
    dosen2.karyawan("1202", "Rogeroam", "Laki-laki");
    dosen2.golongan = "a";
    dosen2.jumlah_sks = 7;
    dosen2.jumlahHari = 20;
    
    dosen2.hitungGaji();
    
    System.out.println("NIP : " + dosen2.NIP);
    System.out.println("Nama : " + dosen2.nama);
    System.out.println("Jenis Kelamin : " + dosen2.jenisKelamin);
    System.out.println("Total Gaji : " + dosen2.totalGaji);
    System.out.println("===========================================");
    
    Staff staff1 = new Staff();
    staff1.karyawan("2009", "Kusnandar", "Laki-Laki");
    
    staff1.absenKerja();
    staff1.absenKerja();
    staff1.absenKerja();
    staff1.absenKerja();
    staff1.absenKerja();
    
    staff1.hitungGaji();
    
    System.out.println("NIP : " + staff1.NIP);
    System.out.println("Nama : " + staff1.nama);
    System.out.println("Jenis Kelamin : " + staff1.jenisKelamin);
    System.out.println("Total Gaji : " + staff1.totalGaji);
    System.out.println("===========================================");
    
    Staff staff2 = new Staff();
    staff2.karyawan("2006", "Riska", "Perempuan");
    
    staff2.hitungGaji(31);
    
    System.out.println("NIP : " + staff2.NIP);
    System.out.println("Nama : " + staff2.nama);
    System.out.println("Jenis Kelamin : " + staff2.jenisKelamin);
    System.out.println("Total Gaji : " + staff2.totalGaji);
    System.out.println("===========================================");
}

}