package Calculator;

final class OperasiBilanganAbsCetak {

    private void cetakSemua(OperasiBilanganAbs[] OB, double a, double b){
        for(int i = 0; i < OB.length; i++){
            OB[i].setA(a);
            OB[i].setB(b);
            OB[i].setC();
            OB[i].tampil();
        }
    }

    public static void main(String[] args) {
        final double a = 10.5, b = 2.5;

        OperasiBilanganAbs[] OB = {
                new OperasiPenjumlahan(),
                new OperasiPengurangan(),
                new OperasiPerkalian(),
                new OperasiPembagian(),
        };

        OperasiBilanganAbsCetak ob = new OperasiBilanganAbsCetak();
        ob.cetakSemua(OB,a,b);
    }
}
