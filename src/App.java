import Controllers.MetodosBusqueda;
import Models.Persona;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("\n----------Programa funcionando----------\n");
//-------------------------------------------------------------------------------------------------------------
        /* 
        int[] arr = { 12, -7, 25, 0, -15, 33, 19, -22, 5, 48, -3, 27, -30, 14, 7, -1, 41, 20, -11, 8 };;
        int num = 5;

        MetodosBusqueda mB = new MetodosBusqueda();

        int pos = mB.busquedaLineal(arr, num);

        System.out.print("Arreglo: ");
        mB.imprimirArreglo(arr);

        System.out.println("\nEl numero ("+ num +") esta en la posicion: " + pos);
        System.out.println(); 
        */
//-------------------------------------------------------------------------------------------------------------
        Persona[] personas = new Persona[7];

        personas[0] = new Persona(101, "Juan");
        personas[1] = new Persona(102, "Maria");
        personas[2] = new Persona(103, "Carlos");
        personas[3] = new Persona(104, "Ana");
        personas[4] = new Persona(105, "Luis");
        personas[5] = new Persona(106, "Sofia");
        personas[6] = new Persona(107, "Pedro");

        MetodosBusqueda mB = new MetodosBusqueda(personas);

        mB.showPersonaByName();
    }

}
