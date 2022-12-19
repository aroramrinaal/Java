public class Main{
    public static void main(String[] args) {
        Tree myFavoriteOakTree = new Tree(25, 5, "Oak");
        System.out.println(myFavoriteOakTree.treeType);
        System.out.println(myFavoriteOakTree.heightFt);
        System.out.println(myFavoriteOakTree.trunkDiameterInches);
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

    void announceTallTree(){
        if (this.heightFt>100) {
            System.out.println("That's a tall "+(String) this.treeType+" tree.");
        }
    }

}


// Java Practice
// OOPS In Java