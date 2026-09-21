package Modelo;

public class Mascota 
{
    private String nombre;
    private String tipo;
    private int edad;
    //constructor
    public Mascota(){} //él hace la diferencia
    //gett y set
    public String getNombre() {return nombre;}

    public void setNombre(String nombre) {this.nombre = nombre;}

    public String getTipo() {return tipo;}

    public void setTipo(String tipo) {this.tipo = tipo;}

    public int getEdad() {return edad;}

    public void setEdad(int edad) {this.edad = edad;}
    //metodo registrar en tabla
    public Object[] RegistrarDatos() 
    {
        Object[] fila = {nombre,tipo,edad,calEdaHumana()};
        return fila;
    }
    //Metodo calcular edad humana
public int calEdaHumana()
{
    return calEdaHumana(7);
}

//Metodo sobrecargado
public int calEdaHumana(int multiplicador)
{
    return edad * multiplicador;
}
    //Procesos de creacion:
        //Constructor con parámetros (con identidad): formulario, variables(asigna valores), objeto
        //Constructor sin parámetros (sin identidad): formulario, objeto, variables(asigna valores)
}
