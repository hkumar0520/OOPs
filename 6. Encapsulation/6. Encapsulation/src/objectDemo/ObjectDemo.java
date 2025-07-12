package objectDemo;

public class ObjectDemo {

    String name;
    float gpa;

    public ObjectDemo(String name, float gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    @Override
    public String toString(){
        System.out.println("To String method is called ");
        return super.toString();
    }

    @Override
    public void finalize() throws Throwable{
        System.out.println("Object is Destoryed");
        super.finalize();
    }

    @Override
    public int hashCode(){
        System.out.println("HashCode Method is called " + name.hashCode() + gpa);
        System.out.println("Name : " + getClass().toString());
        System.out.println("Super HashCode : " + super.hashCode());
        return (int)(name.hashCode());
    }

    @Override
    public boolean equals(Object object){
        if(this == object)  return true;
        if(object == null || getClass() != object.getClass())   return false;

        ObjectDemo obj = (ObjectDemo) object;

        return (name.equals(obj.name)) && (gpa == obj.gpa);

//        return this.name == ((ObjectDemo)object).name;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) {
        ObjectDemo obj1 = new ObjectDemo("obj1", 5);
        ObjectDemo obj2 = new ObjectDemo("obj2", 4);
        ObjectDemo obj3 = new ObjectDemo("obj1", 5);
        System.out.println(obj1.toString());

        // finalize is called to destory unused instances
//        for(int i = 0; i<1e7; i++)
//            obj1 = new ObjectDemo(i, i+1);



        System.out.println("##################  HashCode Check ######################");
        System.out.println(obj1.hashCode());
        System.out.println(obj2.hashCode());
        System.out.println(obj3.hashCode());

        System.out.println("##################  Equals Check ######################");
        System.out.println("Obj1 equals to Obj2 :" + obj1.equals(obj2));
        System.out.println("Obj1 equals to Obj3 :" + obj1.equals(obj3));
        System.out.println("Obj2 equals to Obj3 :" + obj2.equals(obj3));

    }
}
