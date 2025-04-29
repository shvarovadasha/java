public class Main {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Не передано аргументов!");
            return;
        }

        for (int i = args.length - 1; i >= 0; i--) {
            System.out.print(reverseString(args[i]) + " ");
        }
    }

    public static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }
}
