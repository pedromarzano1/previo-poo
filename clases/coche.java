package clases;

public class coche {
    private int ruedas;

    private int largo;

    private int ancho;

    private int motor;

    private int peso_paltaforma;

    private String color;

    private int peso_total;

    private boolean asientos_cuero, climatizador;

    public coche() {
        ruedas = 4;
        largo=2000;
        ancho=300;
        motor=1600;
        peso_paltaforma=500;

    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
    public void configurar_climatizador(String climatizador) {
        if(climatizador=="si"){
            this.climatizador=true;
        }
        else{
            this.climatizador=false;
        }
    };
    public String getClimatizador() {
        if(climatizador){
            return "tiene climatizador";

        }
        else{
            return "no climatizador";
        }
    }

    

}
