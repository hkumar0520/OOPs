package Box;

public class Box {

    double l;
    double w;
    double h;

    public void greeting(){
        System.out.println("##########  Box Class is Called #############");
    }

    public void greetingWithAncestor(){
        System.out.println("######## Box Class with Ancestor ###############");
    }

    public Box(){
        this.l = -1;
        this.w = -1;
        this.h = -1;
    }

    public Box(double side){
        this.l = side;
        this.w = side;
        this.h = side;
    }

    public Box(double l, double w, double h){
        this.l = l;
        this.w = w;
        this.h = h;
    }

    public Box(Box old){
        this.l = old.l;
        this.w = old.w;
        this.h = old.h;
    }

    public void getConfigurations(){
        System.out.println("l : " + this.l);
        System.out.println("w : " + this.w);
        System.out.println("h : " + this.h);
    }


    public double getW() {
        return w;
    }

    public double getL() {
        return l;
    }

    public double getH() {
        return h;
    }
//
//    public void setW(double w) {
//        this.w = w;
//    }
//
//
//    public void setL(double l) {
//        this.l = l;
//    }
//
//    public double getH() {
//        return h;
//    }
//
//    public void setH(double h) {
//        this.h = h;
//    }

}











