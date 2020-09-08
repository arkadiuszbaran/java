//zad. 71
//ćw. 1

public class Pair <T, V>{
        private T tType;
        private V vType;

    public Pair(T tType, V vType) {
        this.tType = tType;
        this.vType = vType;
    }

    public T gettType() {
        return tType;
    }

    public void settType(T tType) {
        this.tType = tType;
    }

    public V getvType() {
        return vType;
    }

    public void setvType(V vType) {
        this.vType = vType;
    }
}

