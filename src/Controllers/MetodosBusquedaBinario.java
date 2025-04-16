package Controllers;

import Models.Persona;      //siempre importar
import Views.ShowConsole;

public class MetodosBusquedaBinario {
    private Persona[] people;   //Explica: es una clase tipo publica privada que llega con una lista de personas
    private ShowConsole consola;    
//-------------------------------------------------------------------------------------------------------------
    public MetodosBusquedaBinario(Persona[] people) {
        this.people = people;  
        this.consola = new ShowConsole();
        consola.showMessage("\n----------Metodo de busqueda binaria----------"); 
    }
//-------------------------------------------------------------------------------------------------------------
    private int findPersonaByCode(int code){
        int bajo = 0;
        int alto = people.length -1;

        while(alto >= bajo){        //Para que se repita o para q deje de ejecutarse
            int central = (alto + bajo) / 2;    //Para encontrar el central

            if (people[central].getCode() == code){
                return central;
            }
            if (people[central].getCode() > code){  //me voy a la izquierda
                alto = central-1;
            }else{                  //el [central (+ o -)] es para obiar el central o para ya no usarlo
                bajo = central+1;
            }
        }
        return -1;
    }
//-------------------------------------------------------------------------------------------------------------
    public void showPersonaByCode(){
        int codeToFinde = consola.inputCode();
        int indexPersona = findPersonaByCode(codeToFinde);

        if (indexPersona == -1){
            consola.showMessage("\nPersona con codigo " + codeToFinde + " no encontrada");
        }else{
            consola.showMessage("\nPersona con codigo " + codeToFinde + "  encontrada");
            consola.showMessage(people[indexPersona].toString());
        }
    }
//-------------------------------------------------------------------------------------------------------------
    public void showPersonaByName(){
        String nameToFind = consola.inputName();
        int indexPersona = findPersonaByName(nameToFind);

        if (indexPersona == -1){
            consola.showMessage("\nPersona con nombre \"" + nameToFind + "\" no encontrada");
        } else {
            consola.showMessage("\nPersona con nombre \"" + nameToFind + "\" encontrada");
            consola.showMessage(people[indexPersona].toString());
        }
    }
//-------------------------------------------------------------------------------------------------------------
public Persona[] ordenar(){
    int tam = people.length;

    for (int i = 0; i < tam - 1; i++){

        for (int j = 0; j < tam - 1 - i; j++){

            if (people[j].getName().compareTo(people[j + 1].getName()) > 0){

                Persona aux = people[j];
                people[j] = people[j + 1];
                people[j + 1] = aux;
                }
            }
        }
        return people;
    }
//-------------------------------------------------------------------------------------------------------------
    public int findPersonaByName(String name){
        ordenar();
        int bajo = 0;
        int alto = people.length - 1;

        while(alto >= bajo){ 
            int central = (alto + bajo) / 2;

                if (people[central].getName().compareTo(name) == 0) {
                    return central;
                } 
                if (people[central].getName().compareTo(name) > 0) {
                    alto = central - 1; 
                } else {
                    bajo = central + 1;
                }
            }
        return -1;
        }
//-------------------------------------------------------------------------------------------------------------
}

