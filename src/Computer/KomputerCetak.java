package Computer;

final class KomputerCetak {

    public static void main(String[] args) {

        Komputer[] a = {
                new PersonalComputer(),
                new Notebook(),
                new Netbook(),
        };

        for (Komputer komputer : a) {
            komputer.hidupkanOS();
            komputer.klikKiri();
            komputer.klikKanan();
            komputer.enter();
            komputer.cetakData();
            komputer.matikanOS();
            System.out.println("-----------");
        }
    }
}
