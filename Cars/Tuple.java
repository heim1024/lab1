package Cars;

public class Pair<Integer, Integer> {
    private int x;
    private int y;

    public Tuple(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int fst(){
        return x;
    }
    public int snd(){
        return y;
    }

    public void main(String[] args){
        Tuple<Integer, Integer> tuple = new Tuple<>(20, 20);
        tuple.fst();
        tuple.snd();
    }
}