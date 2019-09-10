package study0801;

public class Lists1Exercise {
    /**
     * Returns an IntList identical to L, but with
     * each element incremented by x. L is not allowed
     * to change.
     */
    public static IntList incrList(IntList L, int x) {
        IntList Q = new IntList(L.first + x, null);
        Q.rest = new IntList(L.rest.first + x, null);
        Q.rest.rest = new IntList(L.rest.rest.first + x, null);
        return Q;
    }

    /**
     * Returns an IntList identical to L, but with
     * each element incremented by x. Not allowed to use
     * the 'new' keyword.
     */
    public static IntList dincrList(IntList L, int x) {
        IntList Q = L;
        while (Q != null) {
            Q.first += x;
            Q = Q.rest;
        }
        Q.first += x;
        return L;
    }

    public static void main(String[] args) {
        IntList L = new IntList(5, null);
        L.rest = new IntList(7, null);
        L.rest.rest = new IntList(9, null);
        System.out.println(L.print());

        // System.out.println(L.size());
        // System.out.println(L.iterativeSize());

        // Test your answers by uncommenting. Or copy and paste the
        // code for incrList and dincrList into IntList.java and
        // run it in the visualizer.
        // System.out.println(L.get(1));
        System.out.println(incrList(L, 3).print());
        System.out.println(dincrList(L, 3).print());
    }
}
