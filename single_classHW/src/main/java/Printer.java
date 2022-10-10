public class Printer {

    private int paper;
    private int toner;

    public Printer(int paper, int toner){
        this.paper = paper;
        this.toner = toner;
    }

    public int getPaperLeft(){
        return this.paper;
    }

    public int printPaper(this.paper, copiesNeeded){
        if(copiesNeeded > this.paper) {
            return "Not enough paper"
        } else { this.paper-= copiesNeeded}
    }
}
