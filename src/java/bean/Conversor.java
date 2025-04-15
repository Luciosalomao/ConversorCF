package bean;

import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;
import java.io.Serializable;

@Named("conversor")
@SessionScoped
public class Conversor implements Serializable {
    double celsius;
    double fahrenheit;
    boolean naocalculado = true;
    
    public Conversor() {
        
    }
    
    public void converterCpF() {
        fahrenheit = (celsius * 9/5) + 32;
        naocalculado = false;
    }

    public double getCelsius() {
        return celsius;
    }

    public void setCelsius(double celsius) {
        this.celsius = celsius;
    }

    public double getFahrenheit() {
        return fahrenheit;
    }

    public void setFahrenheit(double fahrenheit) {
        this.fahrenheit = fahrenheit;
    }

    public boolean isNaocalculado() {
        return naocalculado;
    }

    public void setNaocalculado(boolean naocalculado) {
        this.naocalculado = naocalculado;
    }
    
    
}
