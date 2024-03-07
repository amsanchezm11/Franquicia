public class AnimalDomestico extends Animal{
    private boolean vacunado;
    private TipoAnimal tipo;
    private String raza;


    public AnimalDomestico(String nombre, int edad, int peso, boolean vacunado, TipoAnimal tipo) {
        super(nombre, edad, peso);
        this.vacunado=vacunado;
        this.tipo=tipo;
    }

    public boolean isVacunado() {
        return vacunado;
    }

    public TipoAnimal getTipo() {
        return tipo;
    }

    public String getRaza() {
        return raza;
    }

    public void setTipo(TipoAnimal tipo) {
        this.tipo = tipo;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void setVacunado(boolean vacunado) {
        this.vacunado = vacunado;
    }


    @Override
    public void revisarAnimal() {
        if (isVacunado()){
            System.out.println("El "+ this.tipo + " ya está vacunado");
        }else {
            setVacunado(true);
        }
    }
}


