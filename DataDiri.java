public class DataDiri {
    String Siswa = "Danu";
}

class Kontak extends DataDiri {
    String MyPhone = "6281313";
}

class Main {
    public static void main(String[] args) {
        DataDiri daftar = new DataDiri();
        try {
            System.out.println("Nama 1 = " + daftar.Siswa);
        } catch (Exception e) {
            System.out.println("Data Tidak Ada");
        }

        // System.out.println("Nama 2 = " + daftar.Siswa2);
    }
}