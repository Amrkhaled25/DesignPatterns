public class Main {
    public static void main(String[] args) {
        Printer legacyPrinter = new LegacyToModernAdapter(new LegacyPrinterMachine());
        legacyPrinter.print();
        legacyPrinter.scan();

        System.out.println("-------------");

        Printer modernPrinter = new ModernPrinterMachine();
        modernPrinter.print();
        modernPrinter.scan();


    }
}

/*
* Adapter Design Pattern is a structural design pattern that allows objects with incompatible interfaces to collaborate.
* in this example, we have a LegacyPrinterMachine that has two different methods that we have in Printer interface.
* So we create an adapter class that implements the Printer interface and has a reference to the LegacyPrinterMachine.
* In the adapter class, we implement the methods of the Printer interface by calling the methods of the LegacyPrinterMachine.
*
*
* */
