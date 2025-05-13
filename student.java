class student{
    int age;
    String name;
    void display(){
        System.out.println("My name is "+name+" i am "+age+" years old");
    }
    void sayhello(String newname){
      System.out.println("hello "+newname+" my name is "+name);  
    }
    public static void main(String args[]){
        student s1 = new student();
        s1.name = "sai";
        s1.age = 20;
        s1.display();
        s1.sayhello("murali");
    }
}
