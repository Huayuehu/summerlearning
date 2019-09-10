package study0801;

public class IntList {
    public int first;
    public IntList rest;

    public IntList(int f, IntList r) {
        first = f;
        rest = r;
    }

    /**
     * Return the size of the list using... recursion!
     */
    public int size() {
        if (rest == null) {
            return 1;
        }
        return 1 + this.rest.size();
    }

    /**
     * Return the size of the list using no recursion!
     */
    public int iterativeSize() {
        IntList p = this;
        int totalSize = 0;
        while (p != null) {
            totalSize += 1;
            p = p.rest;
        }
        return totalSize;
    }

    /**
     * Returns the ith item of this IntList.
     */
    //version1
    /*public int get(int i) {
        IntList g = this;
        int j = i;
        int result;
        while (j > 0) {
            g = g.rest;
            j--;
        }
        return result = g.first;
    }
    */

    //version2
    public int get(int i) {
        if (i == 0) {
            return this.first;
        }
        return this.rest.get(i-1);
    }


    public static void main(String[] args) {
        IntList L = new IntList(15, null);
        L = new IntList(10, L);
        L = new IntList(5, L);

        System.out.println(L.get(1));
    }

    public String print() {
        IntList p = this;
        String s = "";
        while(p != null){
            s += p.first + " ";
            p = p.rest;
        }
        return s;
    }
}
