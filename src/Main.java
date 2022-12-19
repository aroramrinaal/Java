public class Main{
    public static void main(String[] args) {
        Tree myFavoriteOakTree = new Tree(25, 5, "Oak");
    }
}

class Tree{
    double heightFt;
    double trunkDiameterInches;
    String treeType;

    Tree(double heightFt,double trunkDiameterInches,String treeType){
        this.heightFt = heightFt;
        this.trunkDiameterInches = trunkDiameterInches;
        this.treeType = treeType;
    }

    void grow(){
        this.heightFt = this.heightFt + 10;
        this.trunkDiameterInches = this.trunkDiameterInches+1;
    }


}


// Java Practice
// OOPS In Java