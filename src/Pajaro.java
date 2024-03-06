public class Pajaro extends Animal{
    private String especie;
    private int pesoIdeal;


    public Pajaro(String nombre, int edad, int peso, String especie, int pesoIdeal) {
        super(nombre, edad, peso);
        this.especie=especie;
        this.pesoIdeal=pesoIdeal;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getPesoIdeal() {
        return pesoIdeal;
    }

    public void setPesoIdeal(int pesoIdeal) {
        this.pesoIdeal = pesoIdeal;
    }

    public void revisarAnimal(){
        if (this.getPeso()==pesoIdeal){
            System.out.println("El pajaro está bien");
        }else{
            System.out.println("EL pajaro necesita una dieta especial");
        }
    }

    @Override
    public String toString() {
        return "Pajaro{" +
                "nombre='" + this.getNombre() + '\'' +
                ", edad=" + this.getEdad() +
                ", id=" + this.getId() +
                ", peso=" + this.getPeso() +
                ", especie='" + especie + '\'' +
                ", pesoIdeal=" + pesoIdeal +
                '}';
    }
}
