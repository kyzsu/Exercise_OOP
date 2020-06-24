package Computer;

public class PersonalComputer extends Komputer{
    @Override
    void hidupkanOS() {
        System.out.println("PC dihidupkan");
    }

    @Override
    void matikanOS() {
        System.out.println("PC dimatikan");
    }

    @Override
    public void klikKanan() {
        System.out.println("Tombol kanan mouse ditekan");
    }

    @Override
    public void klikKiri() {
        System.out.println("Tombol kiri mouse ditekan");
    }

    @Override
    public void enter() {
        System.out.println("Tombol enter ditekan");
    }

    @Override
    public void cetakData() {
        System.out.println("Mencetak data . . .");
    }
}
