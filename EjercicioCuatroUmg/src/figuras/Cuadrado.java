/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figuras;

/**
 *
 */
public class Cuadrado extends FigurasGeometricas {
    
    @Override
    public int calcularPerimetro(int a, int b){
        System.out.println("Calculando el perimetro...");
        int resultado = a * b;
        System.out.println("El perimetro es :"+ resultado);
        return resultado;
    }
    public int calcularArea(int a){
        System.out.println("Calculando el area...");
        int resultado = a * a;
        System.out.println("El area es :"+ resultado);
        return resultado;
    }
    
    public int calcularVolumen(int a){
        System.out.println("Calculando el volumen...");
        int resultado = a * a* a;
        System.out.println("El volumen es :" + resultado);
        return resultado;
    }
    
    
    
}
