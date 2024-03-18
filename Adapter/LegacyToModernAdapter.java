public class LegacyToModernAdapter implements Printer{
    private LegacyPrinterMachine legacyPrinterMachine;
    public LegacyToModernAdapter(LegacyPrinterMachine legacyPrinterMachine){
        this.legacyPrinterMachine = legacyPrinterMachine;
    }
    @Override
    public void print() {
        legacyPrinterMachine.printInOldWay();
    }

    @Override
    public void scan() {
        legacyPrinterMachine.write();
    }
}
