package classes;

public class BoardCoord {
    private int coord1; 
    private int coord2;

    void setCoord1(int coord1){
        this.coord1 = coord1;
    };
    void setCoord2(int coord2){
        this.coord2 = coord2;
    };
    public int getCoord1() {
        return this.coord1;
    }
    public int getCoord2() {
        return this.coord2;
    }

    @Override
    public boolean equals(Object obj) {
       
        if(this == obj){
            return true;
        }

        if(!(obj instanceof BoardCoord)){
            return false;
        }

        BoardCoord b = (BoardCoord) obj;

        return this.getCoord1() == b.getCoord1() && this.getCoord2() == b.getCoord2();
    }
}
