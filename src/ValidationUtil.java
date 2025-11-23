public class ValidationUtil {

    public static void requireNonNull(Object obj, String message){

        if(obj == null)
            throw new IllegalArgumentException(message);
    }

    public static void requireNonEmpty(String str, String message){

        if(str.isEmpty())
            throw new IllegalArgumentException(message);
    }

    // Bu class tam oyle bir class
}
