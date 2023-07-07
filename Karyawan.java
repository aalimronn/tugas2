//Ali Imron 
//227064516078
package tugasskuliah2;

public class Karyawan {
    String NIP;
    String nama;
    String jenisKelamin;
    int jumlahHari;
    int totalGaji;

    void karyawan(String NIP, String nama, String jenisKelamin) {
        this.NIP = NIP;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
    }

    void absenKerja() {
        jumlahHari++;
    }

    void hitungGaji() {
        totalGaji = jumlahHari * 50000;
    }

     void hitungGaji(int jumlah_hari) {
        totalGaji = jumlah_hari * 50000;
    }
}

    class Dosen extends Karyawan {
        String golongan;
        int jumlah_sks;
        int upah_per_sks;

        @Override
        void hitungGaji() {
            switch (golongan) {
                case "a":
                    upah_per_sks = 200000;
                    break;
                case "b":
                    upah_per_sks = 150000;
                    break;
                case "c":
                    upah_per_sks = 100000;
                    break;
            }
            totalGaji = upah_per_sks * jumlah_sks * jumlahHari;
        }
    }

    class Staff extends Karyawan {

    }