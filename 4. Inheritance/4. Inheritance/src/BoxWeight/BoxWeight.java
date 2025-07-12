package BoxWeight;

import Box.Box;

public class BoxWeight extends Box {
    public double getWeight() {
        return weight;
    }

    double weight;

    public void greeting(){
        System.out.println("######## BoxWeight Class ###############");
    }

    public void greetingWithAncestor(){
        super.greetingWithAncestor();
        System.out.println("######## BoxWeight Class with Ancestor ###############");
    }

    public BoxWeight(){
        super();
        this.weight = -1;
    }

    public BoxWeight(BoxWeight other){
        super(other);
        this.weight = other.weight;
    }

    public BoxWeight(double side, double weight){
        super(side);
        this.weight = weight;
    }

    public BoxWeight(double l, double w, double h, double weight){
        super(l,w,h);
        this.weight = weight;
    }

    public void getAllConfigurations(){
        super.getConfigurations();
        // using the variables super class
        double area = this.getL()*this.getW() + this.getL()*this.getH() + this.getH()*this.getW();
        double volume = super.getL()*super.getW()*super.getH();
        System.out.println("This is area of Box : " + area + " volume is : " + volume);
        System.out.println("This is weight : " + this.weight);
    }
}
