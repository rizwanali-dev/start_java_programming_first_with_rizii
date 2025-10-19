public class string_mathods {
    public static void main(String[] args) {
        String a= "HaRry";
        //System.out.print(a);
        int value=a.length();
        System.out.println(value);
        String lstring=a.toLowerCase();
        System.out.println(lstring);
        String ustring=a.toUpperCase();
        System.out.println(ustring);
        String nonTrimedString = "    rizi    ";
        System.out.println(nonTrimedString);
        String TRimed = nonTrimedString.trim();
        System.out.println(TRimed);
        System.out.println(a.substring(1,5));
        System.out.println(a.replace("H","f"));
        System.out.println(a.replace("H","arr"));
        System.out.println(a.startsWith("ar"));
        System.out.println(a.endsWith("y"));
        System.out.println(a.charAt(2));
        System.out.println(a.indexOf("y"));
        System.out.println(a.lastIndexOf("harry"));
        System.out.println(a.equals("HaRay"));
        System.out.println(a.equalsIgnoreCase("harry"));

        //SCAPE SEQUENCE

        System.out.println("\\i\n am scape \n sequence \"double quote");

    }
}
