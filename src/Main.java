import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static Scanner teclado = new Scanner(System.in);
    public static List<Tienda> listaTiendas = new ArrayList<>();

    public static void mostrarTiendas(List<Tienda>listaTiendas){
        for (Tienda t: listaTiendas){
            System.out.println(t);
        }
    }

    public static void venderAnimal(Tienda t){
        t.mostrarAnimales();
        System.out.println("¿Que animal deseas vender?");
        t.borrarAnimal(teclado.nextInt());
    }

    public static boolean existeTienda(List<Tienda>listaTiendas, int id){

        if (listaTiendas.contains(listaTiendas.get(id))){
            System.out.println("La tienda existe");
            return true;
        }else {
            System.out.println("La tienda no existe");
            return false;
        }
    }

    public static  void menuSecundario(){

        mostrarTiendas(listaTiendas);
        System.out.println("¿Cual tienda quieres gestionar?");

        int id = teclado.nextInt();

        if (existeTienda(listaTiendas,id)){
            Tienda tAux = listaTiendas.get(id);

            System.out.println("[1] - NUEVO ANIMAL");
            System.out.println("[2] - VENDER ANIMAL");
            System.out.println("[3] - REVISION");
            System.out.println("[4] - MOSTRAR ANIMALES");
            System.out.print("\n\n¿Que quieres hacer? --> Respuesta:");

            //int respuesta = teclado.nextInt();

            switch (teclado.nextInt()){
                case 1 -> tAux.agregarAnimal();
                case 2 -> venderAnimal(tAux);
                case 3 -> tAux.revisarAnimales();
                case 4 -> tAux.mostrarAnimales();
            }
        }

    }


    public static void main(String[] args) {



        // MENU

        Scanner teclado = new Scanner(System.in);

        boolean salir=false;

        do {
            System.out.println("-----MENU----");
            System.out.println("[1] - GESTION DE TIENDA");
            System.out.println("[2] - SALIR");

            System.out.print("\n ELIGE UNA OPCION-->");

            switch (teclado.nextInt()){
                case 1 -> {
                    System.out.println("[1] - GESTION DE TIENDA");
                    menuSecundario();
                }
                case 2 -> salir=true;
            }
        }while (!salir);

    }
}
