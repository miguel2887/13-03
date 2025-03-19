
class Vehiculo {
    private String marca;
    private String modelo;
    private int año;

    public Vehiculo(String marca, String modelo, int año) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
    }


    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }


    public void describir() {
        System.out.println("Vehículo: " + marca + " " + modelo + ", Año: " + año);
    }
}

class Coche extends Vehiculo {
    private int puertas;


    public Coche(String marca, String modelo, int año, int puertas) {
        super(marca, modelo, año);  // Llamada al constructor de la clase base
        this.puertas = puertas;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    @Override
    public void describir() {
        super.describir();
        System.out.println("Este coche tiene " + puertas + " puertas.");
    }

    public void arrancar() {
        System.out.println("El coche está arrancando...");
    }
}

class Motocicleta extends Vehiculo {
    private boolean tieneSidecar;

    public Motocicleta(String marca, String modelo, int año, boolean tieneSidecar) {
        super(marca, modelo, año);
        this.tieneSidecar = tieneSidecar;
    }

    public boolean tieneSidecar() {
        return tieneSidecar;
    }

    public void setSidecar(boolean tieneSidecar) {
        this.tieneSidecar = tieneSidecar;
    }

    @Override
    public void describir() {
        super.describir();
        if (tieneSidecar) {
            System.out.println("Esta motocicleta tiene un sidecar.");
        } else {
            System.out.println("Esta motocicleta no tiene sidecar.");
        }
    }

    public void acelerar() {
        System.out.println("La motocicleta está acelerando...");
    }
}

public class Main {
    public static void main(String[] args) {
        Coche coche1 = new Coche("Toyota", "Corolla", 2020, 4);
        Motocicleta moto1 = new Motocicleta("Harley-Davidson", "Sportster", 2023, true);

        coche1.describir();
        coche1.arrancar();
        System.out.println();
        moto1.describir();
        moto1.acelerar();
    }
}
