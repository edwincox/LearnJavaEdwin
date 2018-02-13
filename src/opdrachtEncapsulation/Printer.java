package opdrachtEncapsulation;

public class Printer {

    private int tonerLevel = 100;
    private int numberPagesPrinted = 0;
    private boolean duplexPrinter;

    public Printer(int tonerLevel, boolean duplexPrinter) {
        if (tonerLevel> 0 & tonerLevel <= 100){
            this.tonerLevel = tonerLevel;
        }
        this.duplexPrinter = duplexPrinter;
    }

    public void fillUpToner(int tonerLevelFill){
        // tot 100% vullen
        this.tonerLevel = this.tonerLevel + tonerLevelFill;

        if (this.tonerLevel > 100){
            this.tonerLevel = 100;
        }

    }

    public void printingPaged(int printen){
        // aantal pagin's printed

        if (printen > 0 & !duplexPrinter){
            //int geprint = printen;
            System.out.println("Aantal page printed = " + printen);
            this.numberPagesPrinted += printen;
        }else if (printen > 0 & duplexPrinter){

            //int geprint = printen / 2 +  (printen > 0 ? +1 : +0);
              int geprint = printen / 2 +  (printen % 2);

            System.out.println("Aantal page printed = " + geprint);
            this.numberPagesPrinted += geprint;
        }
        this.tonerLevel = this.tonerLevel - (3 * printen);


    }


    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getNumberPagesPrinted() {
        return numberPagesPrinted;
    }

    public boolean isDuplexPrinter() {
        return duplexPrinter;
    }
}
