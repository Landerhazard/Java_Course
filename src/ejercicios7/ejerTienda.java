package ejercicios7;

public class ejerTienda {
    public static void main(String[] args) {
        Tienda tienda1 = new Tienda();
        Tienda tienda2 = new Tienda(1500);
        tienda2.setCodigoPostal(28098);
        tienda2.cambiarDireccion("Calle2");
        tienda2.motrarDatos();
        tienda2.motrarDatos(2);
        tienda2.comprar(1000);
        tienda2.vender(1600);
        TiendaDiscos tiendaDis = new TiendaDiscos(5000);
        tiendaDis.cambiarDireccion("Vaca2");
        tiendaDis.motrarDatos();
        tiendaDis.vender(400);
    }
}

class Tienda {
    protected int identificador;
    protected int codigoPostal;
    protected String direccion;
    protected double dineroCaja;
    protected static int tiendasID = 0;

    Tienda() {
        this.identificador = tiendasID;
        this.dineroCaja = 0;
        tiendasID++;
    }

    Tienda(double dineroCaja) {
        this.identificador = tiendasID;
        this.dineroCaja = dineroCaja;
        tiendasID++;
    }

    public void cambiarDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void motrarDatos() {
        String mensaje = "Identificador:\t" + this.identificador + "\nCódigo postal:\t" + this.codigoPostal
                + "\nDirección:\t" + this.direccion;
        System.out.println(mensaje);
    }

    public void motrarDatos(int cualquiera) {
        String mensaje = "Identificador:\t" + this.identificador + "\nCódigo postal:\t" + this.codigoPostal
                + "\nDinero en caja:\t" + this.dineroCaja;
        System.out.println(mensaje);
    }

    public void comprar(double gasto) {
        double dinerofinal = this.dineroCaja - gasto;
        if (dinerofinal <= 0) {
            try {
                throw new Exception("No se puede comprar ya que no hay dinero en la caja.");
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        } else {
            this.dineroCaja -= gasto;
        }
    }

    public void vender(double valor) {
        this.dineroCaja += valor;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setCodigoPostal(int codigoPostal) {
        this.codigoPostal = codigoPostal;
    }
}

class TiendaDiscos extends Tienda {
    private String zonaQueSeEncuentra;
    private double dineroCajaB;

    TiendaDiscos() {
        super();
    }

    TiendaDiscos(double dineroCaja) {
        super(dineroCaja);
    }

    @Override
    public void cambiarDireccion(String direccion) {
        this.direccion = direccion;
        this.zonaQueSeEncuentra = direccion;
    }

    public void motrarDatos() {
        String mensaje = "Dirección:\t" + this.direccion + "\nZona:\t" + this.zonaQueSeEncuentra + "\nDinero en caja:\t"
                + this.dineroCaja;
        System.out.println(mensaje);
    }

    @Override
    public void vender(double valor) {
        this.dineroCaja += valor / 2;
        this.dineroCajaB += valor / 2;
    }
}