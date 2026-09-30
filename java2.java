class Calculator{

    int num1=20;
    int num2=10;

    //methos 1
    // non parameterized |non return type
    void addnumbers(){
        //method scope
        int tot=num1+num2;
        system.out.printIn("Add:" + tot);
    }
    //method type 2
    //parameterized| non return=void method
   void  subNumbers(int a, int b){
    int sub=a-b;
    system.out.printIn("Sub:" + sub);

    }
}