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

    public void printPaper(int pages, int copiesNeeded) {
        int paperValue = pages * copiesNeeded;
        if (this.paper > paperValue) {
            this.paper -= paperValue;
            this.toner -= paperValue;
        } else {
            System.out.println("Need more paper");
        }
    };

    public int measureToner(){
        return this.toner;
    }
}
