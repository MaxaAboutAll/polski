import jdk.nashorn.internal.runtime.regexp.joni.exception.ValueException;

class CalculateClass {
    private static MyStack temp;

    CalculateClass(){
        temp = new MyStack();
    }

    String calculate(String input){
        temp = new MyStack();
        String[] parsingInput = input.split(" ");
        String numRegex   = ".*[0-9].*";
        for (String s : parsingInput) {
            try {
                if (s.matches(numRegex)) {
                    temp.push(s);
                    continue;
                }
                switch (s) {
                    case "+":
                        temp.pushAtFirst(String.valueOf(Double.valueOf(temp.pop()) + Double.valueOf(temp.pop())));
                        break;
                    case "-":
                        temp.pushAtFirst(String.valueOf(Double.valueOf(temp.pop()) - Double.valueOf(temp.pop())));
                        break;
                    case "*":
                        temp.pushAtFirst(String.valueOf(Double.valueOf(temp.pop()) * Double.valueOf(temp.pop())));
                        break;
                    case "/":
                        temp.pushAtFirst(String.valueOf(Double.valueOf(temp.pop()) / Double.valueOf(temp.pop())));
                        break;
                    default:
                        return "Невозможный символ";
                }
            }catch (Exception e) {
                return "Не верная строка";
            }
        }
        return temp.pop();
    }
}
