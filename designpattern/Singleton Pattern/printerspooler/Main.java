package printerspooler;

public class Main {

    public static void main(String[] args) {
        PrinterSpooler printerSpooler = PrinterSpooler.getInstance();
        printerSpooler.addPrintJob();
        printerSpooler.processPrintJob();
        printerSpooler.viewPrintJobs();
    }
}
