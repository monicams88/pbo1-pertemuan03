package Percabangan;

public class Switch {
    public static void main(String [] args){
        char nilai='C';
        switch (nilai){
            case 'A':
                System.out.println("Mhs   : \"Terima kasih pak\"");
                System.out.println("Dosen  : \"Selamat nak lah\"");
                break;
            case 'B':
                System.out.println("Mhs   : \"Kenapa ulun kada dapat A, pak?\"");
                System.out.println("Dosen  : \"makanya belajar bujur bujur\"");
                break;
            case 'C':
                System.out.println("Mhs   : \"ulun turun tarus, tugas ulun gawi jua\"");
                System.out.println("Dosen  : \"Tapi ujian bisa aja lah menjawab?\"");
                System.out.println("Mhs   : \"ngalih banar pa ai,\"");
                break;
            default:
                System.out.println("Mhs   : \"ulun turun tarus, tugas ulun gawi jua\"");
                System.out.println("Dosen  : \"bujur juakan, hadang bapa cek dulu\"");
                System.out.println("Dosen  : \"salah soal km sekalinya nak ai, paksa meulang lah\"");
                System.out.println("Mhs   : \"titik banyu mata ulun pa\"");
                break;


        }
    }
}
