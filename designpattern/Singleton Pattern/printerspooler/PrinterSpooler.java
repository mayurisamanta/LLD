package printerspooler;

public class PrinterSpooler {

    private static PrinterSpooler printerSpooler;

    private PrinterSpooler() {

    }

    public synchronized static PrinterSpooler getInstance() {
        if (printerSpooler == null) {
            printerSpooler = new PrinterSpooler();
        }
        return printerSpooler;
    }

    public void addPrintJob() {
        System.out.println("Print job added.");
    }

    public void processPrintJob() {
        System.out.println("Print job processed.");
    }

    public void viewPrintJobs() {
        System.out.println("Viewing print jobs.");
    }

}
