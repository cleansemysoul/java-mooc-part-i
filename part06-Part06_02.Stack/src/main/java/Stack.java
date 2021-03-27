
import java.util.ArrayList;

public class Stack {

    private ArrayList<String> stacks;

    public Stack() {
        this.stacks = new ArrayList<>();
    }

    public boolean isEmpty() {
        return stacks.isEmpty();
    }

    public void add(String stack) {
        this.stacks.add(stack);
    }

    public String take() {
        String output = stacks.get(stacks.size() - 1);
        stacks.remove(stacks.size()-1);
        return output;

    }

    public ArrayList<String> values() {
        return stacks;
    }
}
