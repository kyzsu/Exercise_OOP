package Calculator;

import java.util.Scanner;

final class OperasiBilanganAbsCetak {

    private void cetakSemua(OperasiBilanganAbs[] OB, double a, double b){
        for (OperasiBilanganAbs operasiBilanganAbs : OB) {
            operasiBilanganAbs.setA(a);
            operasiBilanganAbs.setB(b);
            operasiBilanganAbs.setC();
            operasiBilanganAbs.tampil();
        }
    }

    public static void main(String[] args) {
        final double a,b;
        OperasiBilanganAbs[] OB = {
                new OperasiPenjumlahan(),
                new OperasiPengurangan(),
                new OperasiPerkalian(),
                new OperasiPembagian(),
        };
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Masukan nilai a: ");
            a = scanner.nextDouble();
            System.out.print("Masukkan nilai b: ");
            b = scanner.nextDouble();
            OperasiBilanganAbsCetak ob = new OperasiBilanganAbsCetak();
            ob.cetakSemua(OB,a,b);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
