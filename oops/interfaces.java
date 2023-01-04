package oops;

public class interfaces {
    public static void main(String[] args){
        Rook rk = new Rook();
        rk.moves();
        Queen qu = new Queen();
        qu.moves();
        Bare br = new Bare();
        br.eats();
        br.drinks();
    }
}
interface ChessPlayer {
    void moves();
}

class Queen implements ChessPlayer {
    public void moves(){
        System.out.println("up, down, left, right, diagonal (in all 4 directions)");
    }
}

class Rook implements ChessPlayer {
    public void moves(){
        System.out.println("up, down, left, right");
    }
}

interface Herbivore {
    void eats();
}
interface Carnivore {
    void drinks();
}
class Bare implements Herbivore, Carnivore {
    public void eats(){
        System.out.println("bare eats all things");
    }
    public void drinks(){
        System.out.println("bare drinks water and honey");
    }
}