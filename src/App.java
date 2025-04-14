public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("----------Programa funcionando----------\n");

        int[] arr = { 12, -7, 25, 0, -15, 33, 19, -22, 5, 48, -3, 27, -30, 14, 7, -1, 41, 20, -11, 8 };;
        int num = 5;

        MetodosBusqueda mB = new MetodosBusqueda();

        int pos = mB.busquedaLineal(arr, num);

        System.out.print("Arreglo: ");
        mB.imprimirArreglo(arr);

        System.out.println("\nEl numero ("+ num +") esta en la posicion: " + pos);
        System.out.println();
    }
}
