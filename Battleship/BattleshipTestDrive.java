public class BattleshipTestDrive {
    public static void main(String[] args)
    {
        BattleshipBoard board = new BattleshipBoard();
        board.setBoard(20,20);

        Battleship ship = new Battleship();
        ship.setLocation(0,0,2,0);
        board.addShip(ship);

        Battleship ship2 = new Battleship();
        ship2.setLocation(19,0,19,10);
        board.addShip(ship2);

        Battleship squareShip = new Battleship();
        squareShip.setLocation(10,10,12,12);
        board.addShip(squareShip);

        try {
            // Esse código tem que gerar um Runtime Exception!
            Battleship badShip = new Battleship();
            badShip.setLocation(12,12,10,10);
        }
        catch (RuntimeException name){
            System.out.println("Coordenadas invertidas deram erro! -- ok!");
        }

        System.out.println("\nCoordenadas tem que ser positivas");
        try {   // Podia ser melhor!
            Battleship shipB = new Battleship();
            shipB.setLocation(-1,0,0,0);
            shipB.setLocation(0,-10,0,0);
            shipB.setLocation(0,0,-20,0);
            shipB.setLocation(0,0,0,-200);
        } catch (RuntimeException name) {
            System.out.println("Coordenadas negativas deram erro! -- ok!");
        }

        System.out.println("Fambuleiro:");

        board.printBoard();

        System.out.println("\nPalpites dentro do navio tem que ser 'hit'");
        System.out.println(board.fire("2","0"));
        System.out.println(board.fire("0","0"));
        System.out.println(board.fire("20","0"));
        System.out.println(board.fire("20","9"));
        System.out.println(board.fire("11","11"));

        System.out.println("\nPalpites fora do navio tem que ser 'miss'");
        System.out.println(board.fire("2","2"));
        System.out.println(board.fire("3","3"));
        System.out.println(board.fire("12","13"));

        // System.out.println("\nPalpites com localização errada tem que ser 'ERRO'");
        // System.out.println(board.fire("A",     "0"));
        // System.out.println(board.fire("0.123", "a"));
        // System.out.println(board.fire("ã", "1"));
        // System.out.println(board.fire("#", "1"));
        // System.out.println(board.fire("abcde", "1"));

        // System.out.println("\nPalpites fora do tabuleiro tem que ser 'ERRO(FORA)'");
        // System.out.println(board.fire("-1", "0"));
        // System.out.println(board.fire("0", "21"));
    }
}

