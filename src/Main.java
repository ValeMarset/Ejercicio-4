public class Main {
    public static void main(String[] args) {

     //Condicional
        int numeroif = 5;

        if (numeroif > 0){
            System.out.println("La varianle numeroif contiene el número positivo " + numeroif);
        } else if (numeroif == 0){
            System.out.println("La variable numeroif contiene el número que es igual a cero " + numeroif);
        } else if (numeroif < 0) {
            System.out.println("La variable numeroif contiene el número negativo " + numeroif);
        }

    //Bucle while

        int numeroWhile = 0;

        while (numeroWhile < 3){

            numeroWhile++;
            System.out.println("El valor de la variable numeroWhile es: " + numeroWhile);
        }

    //Bucle Do While
        //Esto imprimira 4 ya que al salir del bucle while la variable numeroWhile queda con el valor 3. Por ende el do while se ejecuta una sola vez.

        do {
            numeroWhile++;
            System.out.println("El valor de la variable numeroWhile es: " + numeroWhile);
        }    while (numeroWhile < 3);


    //Bucle For

    for (int numeroFor=0; numeroFor <= 3; numeroFor++){
        System.out.println("El valor de la varibale numeroFor es: " + numeroFor );
    }


    //Switch
        String estacion = "Invierno";

        switch (estacion){

            case "Verano":
                System.out.println("Estamos en Verano");
                break;

            case "Otoño":
                System.out.println("Estamos en Otoño");
                break;

            case "Invierno":
                System.out.println("Estamos en Invierno");
                break;

            case "Primavera":
                System.out.println("Estamos en Primavera");
                break;

            default:
                System.out.println("El valor ingresado es invalido");
        }


    }




}

