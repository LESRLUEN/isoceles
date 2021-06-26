/*
 * Programa que obtenga el area de un triangulo en base a su base y altura
 *  y en base a ello mostrar el mas alto
 */
package Isoceles;

/**
 *
 * @author Viking
 */
public class Isoceles {
    
    private double base;
    private double lado;
    public Isoceles(double base, double lado) {
    this.base = base;
    this.lado = lado;
}
    public double calcularPerimetro(){
    double perimetro=2*lado+base;
    return perimetro;
}
    public double calcularArea(){
double area=base*Math.sqrt((lado*lado)-((base*base)/4))/2;
    return area;
}
    public String mostrarDatos(){
    return "Base: "+base+"\nLado: "+lado+"\nPerimetro: "
    +calcularPerimetro()+"\nArea: "+calcularArea();
}

    
    
}