import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Tienda {
    private int id;
    private static int ids=0;
    private String ubicacion;
    private List<Animal>listaAnimales;
    private int phPecera;
    private Scanner teclado = new Scanner(System.in);

    public Tienda(String ubicacion, List<Animal> listaAnimales) {
        this.id = ++ids;
        this.ubicacion = ubicacion;
        this.listaAnimales = listaAnimales;
    }

    // METODOS

    public void mostrarAnimales(){
        for (Animal a:listaAnimales) {
            System.out.println(a);
        }
    }

    public boolean borrarAnimal(int id){
        boolean resultado = false;
        Iterator<Animal> iter = listaAnimales.iterator();

        while (iter.hasNext()){
            Animal a = iter.next();
            if (a.getId()==id){
                iter.remove();
                resultado=true;
                System.out.println("El animal se ha borrado correctamente");
            }else {
                System.out.println("EL animal no está en la tienda");
                resultado=false;
            }
        }



        return resultado;
    }

    public void agregarAnimal(){

        System.out.println("Nombre del animal: ");
        String nombre = teclado.nextLine();
        System.out.println("Edad: ");
        int edad = teclado.nextInt();
        System.out.println("Peso: ");
        int peso = teclado.nextInt();

        System.out.println("¿Que tipo de animal deseas agregar?");
        String color = teclado.nextLine();

        switch (teclado.nextLine().toUpperCase()){
            case "PEZ" -> registrarPez(nombre,edad,peso);
            case "PAJARO" -> registrarPajaro(nombre,edad,peso);
        }

    }

    public void registrarPez( String nombre, int edad,int peso){

        System.out.println("¿De que color es el pez?");
        String color = teclado.nextLine();
        System.out.println("¿Cual es su PH ideal?");
        int phIdeal = teclado.nextInt();

        listaAnimales.add(new Pez(nombre,edad,peso,color,phIdeal));
    }

    public void registrarPajaro( String nombre, int edad,int peso){

        System.out.println("¿De que especie es el pajaro?");
        String especie = teclado.nextLine();
        System.out.println("¿Cual es su peso ideal?");
        int pesoIdeal = teclado.nextInt();

        listaAnimales.add(new Pez(nombre,edad,peso,especie,pesoIdeal));
    }

    public void registrarAnimalDomestico( String nombre, int edad,int peso){

        boolean vacunado;
        TipoAnimal tipo;
        String raza;
        int vacunadoP;

        System.out.println("¿Es un perro o un gato?");
        String tipoAnimal = teclado.nextLine();

        if (tipoAnimal.equalsIgnoreCase("PERRO")){
             tipo = TipoAnimal.PERRO;

            System.out.println("¿De que raza es el perro?");
            raza = teclado.nextLine();

            System.out.println("¿Está vacunado? [1-SI][2-NO]");
            vacunadoP = teclado.nextInt();
            if (vacunadoP==1){
                vacunado = true;
            }else vacunado = false;

            listaAnimales.add(new AnimalDomestico(nombre,edad,peso,vacunado,tipo,raza));
        }else{
            tipo = TipoAnimal.GATO;

            System.out.println("¿De que raza es el gato?");
             raza = teclado.nextLine();

            System.out.println("¿Está vacunado? [1-SI][2-NO]");
            vacunadoP = teclado.nextInt();
            if (vacunadoP==1){
                vacunado = true;
            }else vacunado = false;

            listaAnimales.add(new AnimalDomestico(nombre,edad,peso,vacunado,tipo,raza));
        }




    }
}
