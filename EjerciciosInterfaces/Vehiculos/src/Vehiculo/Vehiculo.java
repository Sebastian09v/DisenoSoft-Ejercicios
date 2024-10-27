package Vehiculo;

abstract class Vehiculo {
    protected int gasolina;

    public Vehiculo(int gasolinaInicial) {
        this.gasolina = gasolinaInicial;
    }

    public void conducir() {
        if (gasolina > 0) {
            System.out.println("El vehículo está conduciendo.");
            gasolina--;
        } else {
            System.out.println("No hay suficiente gasolina para conducir.");
        }
    }

    public boolean retanquear(int cantidad) {
        if (cantidad > 0) {
            gasolina += cantidad;
            System.out.println("Se ha tanqueado con " + cantidad + " unidades de gasolina.");
            return true;
        } else {
            System.out.println("Cantidad de gasolina no válida.");
            return false;
        }
    }
}
