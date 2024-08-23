package fundamentos;

public class ConversaoParaString {
    public static void main(String[] args) {
        //com Wrapper
        Integer numero1 = 123456;
        System.out.println(numero1.toString().length());

        //Com Wrapper (uso diferente)
        int numero2 = 1234567;
        System.out.println(Integer.toString(numero2));
    }
}
