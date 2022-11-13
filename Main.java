public class Main {
    public static void main(String[] args) throws Exception {
        final int[] values = {104, 116, 116, 112, 115, 58, 47, 47, 121, 111, 117, 116, 117, 46, 98, 101, 47, 100, 81, 119, 52, 119, 57, 87, 103, 88, 99, 81};
        StringBuilder str = new StringBuilder();

        for (int value : values) str.append((char) value);

        java.awt.Desktop.getDesktop().browse(new java.net.URI(str.toString()));
    }

}
