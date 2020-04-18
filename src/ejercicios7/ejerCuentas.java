package ejercicios7;

public class ejerCuentas {
    public static void main(String[] args) {
         Cuenta cuenta = new Cuenta("Lander", 198.5);
         cuenta.ingresar(-789.233);
         cuenta.retirar(200);
    }
}

class Cuenta {
    private String titular;
    private double cantidad = 0;

    Cuenta(String titular) {
        this.titular = titular;
    }

    Cuenta(String titular, double cantidad) {
        this.titular = titular;
        this.cantidad = cantidad;
    }

    public void ingresar(double amount) {
        if (amount >= 0) {
            this.cantidad += amount;
        } else {
            try {
                throw new Exception("La cantidad introducida no puede ser negativa.");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public void retirar(double amount) {
        double newAmount = this.cantidad -= amount;
        if (newAmount < 0)
            this.cantidad = 0;
    }

    public double getCantidad() {
        return cantidad;
    }

    public String getTitular() {
        return titular;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }
}