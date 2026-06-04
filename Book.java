public class Book {
    private String name;
    private String author;
    private String text;

    public Book(String name, String author, String text) {
        this.name = name;
        this.author = author;
        this.text = text;
    }

    // Getters
    public String getName() { return name; }
    public String getAuthor() { return author; }
    public String getText() { return text; }

    // Methods related to book properties
    public String replaceWordInText(String word, String replacementWord) {
        return text.replaceAll(word, replacementWord);
    }

    public boolean isWordInText(String word) {
        return text.contains(word);
    }

    // ========================================================
    // [TODO] The following methods violate the Single Responsibility Principle (SRP).
    // Create a new class named 'BookPrinter' and move these printing 
    // responsibilities there to refactor the code.
    // ========================================================

    public void printTextToConsole() {
        System.out.println("=== " + name + " by " + author + " ===");
        System.out.println(text);
        System.out.println("======================================");
    }

    public void printTextToFile(String filePath) {
        // Simulating writing to a file by printing to the console
        System.out.println("Writing book content to file: " + filePath);
        System.out.println(text);
        System.out.println("Write complete.\n");
    }
}