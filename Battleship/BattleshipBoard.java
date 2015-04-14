import java.util.*;

class BattleshipBoard {
  ArrayList<Battleship> ships = new ArrayList<>();
  int width, height;
  
  void printBoard(){
    System.out.println("tamanho:"+ width + "x" + height);

    for (int line = height-1; line >= 0; line--) {
       printBoardLine(line);
    }
  }

  void printBoardLine(int line){
    for (int column = 0; column < width; column++) {
      if (hit(column, line)){
        System.out.print("[X]");
      }
      else {
        System.out.print("[ ]");        
      }
    }
    System.out.print("\n");
  }

  void setBoard(int widthX, int heightX){
    width = widthX;
    height = heightX;
  }

  void addShip(Battleship ship){
    ships.add(ship);
  }

  String fire(String sx, String sy){
    int x = Integer.parseInt(sx);
    int y = Integer.parseInt(sy);
    
    if (hit(x,y)) {
      return "hit";
    }
    else{
      return "miss";
    }
  }

  boolean hit(int x, int y){
    // percorre todos navios
    for (int i = 0; i < ships.size(); i++) {
      // pega o navio na posicao i
      Battleship ship = ships.get(i);

      // verifica se a coordenada esta dentro do navio
      if (x >= ship.w1 && x <= ship.w2 &&
          y >= ship.h1 && y <= ship.h2){
        return true;
      }
    }
    return false;
  }
}