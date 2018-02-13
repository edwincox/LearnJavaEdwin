package opdrachtEncapsulation;

public class Main {

    public static void main(String[] args) {

        Printer canon = new Printer(200, false);

//        System.out.println("Toner level = " + canon.getTonerLevel());
//        canon.fillUpToner(20);
//        System.out.println("Toner levelm, aftervullen = " + canon.getTonerLevel());
//
//        canon.printingPaged(4);
//        System.out.println("Toner level = " + canon.getTonerLevel());
//
//        canon.fillUpToner(20);
//        System.out.println("Toner level = " + canon.getTonerLevel());
//
//        canon.printingPaged(4);
//        System.out.println("Toner level = " + canon.getTonerLevel());



        System.out.println("=====================================");
        Printer hp = new Printer(200, true);


        System.out.println("Toner level = " + hp.getTonerLevel());
        hp.fillUpToner(20);

        hp.printingPaged(7);
        System.out.println("Toner level 7 page = " + hp.getTonerLevel());

        hp.printingPaged(4);
        hp.printingPaged(4);


        System.out.println("Aantal pagina printed voor hp printer " + hp.getNumberPagesPrinted() + " duplex printer" + hp.isDuplexPrinter());

//        System.out.println("=====================================");
//
//        Printer brother = new Printer(70, false);
//        System.out.println("Toner level = " + brother.getTonerLevel());
//        System.out.println("Aantal page printed brother " + brother.getNumberPagesPrinted());
//        brother.printingPaged(4);
//        brother.printingPaged(4);
//        System.out.println("Toner level = " + brother.getTonerLevel());
//        System.out.println("Aantal page printed brother " + brother.getNumberPagesPrinted());
//
//        brother.fillUpToner(8);
//        System.out.println("Toner level = " + brother.getTonerLevel() + "  moet 54 zijn" );
    }
}
