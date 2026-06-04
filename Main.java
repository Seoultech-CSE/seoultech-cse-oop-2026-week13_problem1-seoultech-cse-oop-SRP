import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        Book myBook = new Book(
            "Clean Code", 
            "Robert C. Martin", 
            "Even bad code can function. But if code isn't clean, it can bring a development organization to its knees."
        );

        System.out.println("=== SRP Refactoring Practice ===");
        
        // Note: Reflection is used here so you DO NOT need to modify Main.java.
        // It will automatically detect if you have created the BookPrinter class!
        try {
            // 1. After Refactoring: Check if BookPrinter exists in the default package
            Class<?> printerClass = Class.forName("BookPrinter");
            Object printer = printerClass.getDeclaredConstructor().newInstance();
            
            // Execute BookPrinter.printTextToConsole(myBook)
            Method printMethod = printerClass.getMethod("printTextToConsole", Book.class);
            printMethod.invoke(printer, myBook);
            System.out.println("\n✅ [Success] Successfully used the newly created BookPrinter class!");

        } catch (ClassNotFoundException e) {
            // 2. Before Refactoring: Fallback to the original Book's method
            try {
                Method oldPrintMethod = Book.class.getMethod("printTextToConsole");
                oldPrintMethod.invoke(myBook);
                System.out.println("\n⚠️ [Warning] Currently using the Book class for printing. Please refactor and create BookPrinter!");
            } catch (Exception ex) {
                System.out.println("Could not find a printing method. Check your implementation.");
            }
        } catch (Exception e) {
            System.out.println("An error occurred during execution: " + e.getMessage());
        }
    }
}