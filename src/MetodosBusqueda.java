public class MetodosBusqueda {
    public int busquedaLineal(int[] arr, int num) {
        int tam = arr.length;

        for (int i = 0; i < tam; i++ ) {
            if (arr[i] == num) {
                return i; 
            }
        }
        return 0;
    }
//-------------------------------------------------------------------------------------------------------------
    public void imprimirArreglo(int[] arreglo){
        int tam = arreglo.length;
    
        for(int i = 0; i < tam; i ++){   

            System.out.print( arreglo[i] + " / ");
        }
        System.out.println();
    }
}
