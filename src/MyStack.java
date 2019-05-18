import java.util.ArrayList;
import java.util.List;

public class MyStack {
    List<String> stack;

    public MyStack(){
        stack = new ArrayList<String>();
    }

    public String pop(){
        if(!stack.isEmpty()) {
            String result = stack.get(0);
            stack.remove(0);
            return result;
        }
        return null;
    }

    public void push(String input){
        stack.add(input);
    }

    public void pushAtFirst(String input){
        List<String> newStack = new ArrayList<>();
        newStack.add(input);
        newStack.addAll(stack);
        stack = newStack;
    }

    public int getLength(){
        return stack.size();
    }
}
