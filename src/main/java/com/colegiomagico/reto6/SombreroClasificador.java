package com.colegiomagico.reto6;

/**
 * Usa Switch. Gryffindor -> Valentia, Ravenclaw -> Inteligencia, otro -> Desconocido.
 */
public class SombreroClasificador {

    public static String clasificar(String casa) {
    switch (casa) {
      case "Gryffindor":
        return "Valentia";
      case "Ravenclaw":
        return "Inteligencia";
        default:
            return "Desconocido"; // (Usé IA y un ejemplo anteriormente explicado en la calse 1)
            } 
        
    }

    public static void main(String[] args) {
        System.out.println("Gryffindor: " + clasificar("Gryffindor"));
    }
}
