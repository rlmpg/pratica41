package utfpr.ct.dainf.if62c.pratica;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author askoda
 */
public class Elipse {
    private double eixo1;
    private double eixo2;
    
    public Elipse(double eixo1, double eixo2) {
        this.eixo1 = eixo1*2;
        this.eixo2 = eixo2*2;
    }
    
    public double getArea(){
        double area;
        area = Math.PI*(eixo2/2)*(eixo1/2);
        
        return area;
    }
    
    public double getPerimetro(){
        double perimetro;
        perimetro = Math.PI*(3*((eixo2/2)+(eixo1/2)) - Math.sqrt(
                (3*(eixo2/2)+(eixo1/2)) + ((eixo2/2)+3*(eixo1/2))));
        
        return perimetro;
    }

    
}
