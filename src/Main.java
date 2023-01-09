public class Main {
    public static void main(String[] args) {
//        MyStack<String> strings = new MyArrayList<>();
//        strings.push("1");
//        strings.push("+");
//        strings.push("1");
//        System.out.println(strings.toString());
//        strings.push("-");
//        strings.push("2");
//        strings.push("-");
//        strings.push("8");
//        System.out.println(strings.toString());
//        String popped;
//        while(!strings.isEmpty()) {
//            try {
//                popped = strings.pop();
//                System.out.println(popped);
//            } catch (StackException e){
//                System.out.println(e);
//            }
//        }
//        System.out.println(strings.toString());
//        String peeked;
//        try {
//            peeked = strings.peek();
//            System.out.println(peeked);
//        } catch (StackException e){
//            System.out.println(e);
//        }

        // test IntCalculator
        String input = "2^3^2^2";
        System.out.println("Input: "+input);
        IntCalculator calculator = new IntCalculator(input);
        try {
            System.out.println("Postfix: "+calculator.infixToPostfix());
        } catch (StackException e) {
            System.out.println(e);
        }
        try {
            System.out.println("Evaluation: "+calculator.evaluatePostfix());
        } catch (Exception e) {
            System.out.println(e);
        }



    }
}
