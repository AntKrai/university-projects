public class ScreeningRoom{
    public boolean[][] places;

    public ScreeningRoom(int i, int j){
        places = new boolean[i][j];
    }
    public ScreeningRoom(){
    }
    public boolean reserve_place(int row, int seat){
        if(places[row][seat] == true){ 
            System.out.println("The place is already taken!");
            return false;
        }
        else{
             places[row][seat] = true;
             System.out.println("Succesfully reserved the place!");
             return true;
            }
    }
    public void display_room_status(int row, int seat){
        for (int i = 0; i < row; i++){
            for(int j=0; j < seat; j++){
              if(places[i][j] == true)  System.out.print("[X]");
              else System.out.print("[]");
            }
            System.out.println(" ");
        }
    }
    public void main(String[] args){    
        ScreeningRoom sr = new ScreeningRoom(5, 10);
        sr.reserve_place(4, 9);
        sr.reserve_place(1, 9);
        sr.reserve_place(1, 9);
        sr.display_room_status(5, 10);
        
    }
}