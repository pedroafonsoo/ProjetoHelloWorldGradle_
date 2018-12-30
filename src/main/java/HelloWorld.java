

public class HelloWorld{

    public static void imprimeOlaMundo(){
        System.out.println("Hello world");
    }


    public static String RetornaOlaMundo(){
        String str="";
        str="Ola mundo";
        return str;
    }

    public static void main(String
                                    [] args){
        //imprimeOlaMundo();
        System.out.println(""+RetornaOlaMundo());
    }
}