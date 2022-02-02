package Primitives.ForceEquations;

public class NewtSecLaw {
    double f, m, a;

    public NewtSecLaw(double f, double m){
        this.f = f;
        this.m = m;
    }
    public NewtSecLaw(double m, double a){
        this.m = m;
        this.a = a;
    }
    public NewtSecLaw(double a){
        this.a = a;
    }
    public NewtSecLaw(){

    }
    private void calculateForce(){
        f = m * a;
    }
    private void calculateMass(){
        m = f / a;
    }
    private void calculateAcceleration(){
        a = f / m;
    }

}
