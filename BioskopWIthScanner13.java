import java.util.Scanner;

public interface BioskopWIthScanner13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int baris = 0, kolom = 0, pilihan;
        String nama = "", next;

        String[][] penonton = new String[4][2];

        do{
            System.out.println("-----Menu--------");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan nama: ");
                    nama = sc.nextLine();
                    System.out.print("Masukkan baris (1-4): ");
                    baris = sc.nextInt();
                    System.out.print("Masukkan kolom (1-2): ");
                    kolom = sc.nextInt();
                    sc.nextLine();

                    if(baris>= 1 && baris <=4 && kolom>=1 && kolom <=2){
                        penonton[baris-1][kolom-1] = nama;
                    }
                    break;
                case 2:
                    System.out.println("Daftar Penonton: ");
                    boolean adaPenonton = false;
                    for (int i=0; i<4; i++){
                        for(int j=0; j<2; j++){
                            if (penonton[i][j] != null) {
                                adaPenonton = true;
                                System.out.println("Baris: " + (i+1) + ", Kolom " + (j+1) + ": " + penonton[i][j]);
                            }
                        }
                    } if(!adaPenonton){
                        System.out.println("Belum ada penonton yang terdaftar.");
                    }
                    break; 
                case 3:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silahkan pilih 1, 2, atau 3!");
                    break;
            } 
        } while (pilihan != 3);

    }
}
