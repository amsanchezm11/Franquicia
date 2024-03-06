import java.util.Scanner;

public class Pez extends Animal{
    private String color;
    private int phOptimo;
    private Scanner teclado = new Scanner(System.in);

    public Pez(String nombre, int edad, int peso, String color, int phOptimo) {
        super(nombre, edad, peso);
        this.color=color;
        this.phOptimo=phOptimo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPhOptimo() {
        return phOptimo;
    }

    public void setPhOptimo(int phOptimo) {
        this.phOptimo = phOptimo;
    }

    @Override
    public void revisarAnimal() {
        System.out.println("¿Cual es el PH de la pecera?");
        int phPecera = teclado.nextInt();
        if (phOptimo==phPecera){
            System.out.println("El PH es correcto");
        }else{
            System.out.println("Se debe ajustar el PH");
        }
    }



    @Override
    public String toString() {
        return "Pez{" +
                "nombre='" + this.getNombre() + '\'' +
                ", edad=" + this.getEdad() +
                ", id=" + this.getId() +
                ", peso=" + this.getPeso() +
                ", color='" + color + '\'' +
                ", phOptimo=" + phOptimo +
                '}';
    }
}
