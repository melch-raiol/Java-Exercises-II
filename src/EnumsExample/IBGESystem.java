package EnumsExample;

public class IBGESystem {
    public static void main(String[] args) {
        // for (State e : State.values()) {
        // System.out.println(e.getName() + " (" + e.getUf() + ")");
        // }

        State brazilianState = State.SANTA_CATARINA;

        System.out.println(brazilianState.getName());
        System.out.println(brazilianState.getUf());
        System.out.println(brazilianState.getNameUpperCase());
    }
}
