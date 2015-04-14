class Battleship {
  int w1, h1, w2, h2;

  void setLocation(int x1, int y1, int x2, int y2) {
    if (x1 < 0 || y1 < 0 || x2 < 0 || y2 < 0){
      throw new RuntimeException();
    }
    else if(x2 < x1 || y2 < y1){
      throw new RuntimeException();   
    }

    w1 = x1;
    h1 = y1;
    w2 = x2;
    h2 = y2;
 }
}