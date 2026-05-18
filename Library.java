class Library {

    String bookName = "Java Programming";
    String author = "James Gosling";

    void display() {
        System.out.println("Book Name: " + bookName);
        System.out.println("Author: " + author);
    }

    public static void main(String args[]) {

        Library l = new Library();

        l.display();
    }
}
