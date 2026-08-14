package tools;

public class EBook extends Book {
    private double fileSizeMB;
    public EBook(String title,String author,double price, double fileSizeMB) {
        super(title, author, price);
        this.fileSizeMB = fileSizeMB;
    }

    public double getFileSizeMB() {
        return fileSizeMB;
    }

    public void setFileSizeMB(double fileSizeMB) {
        this.fileSizeMB = fileSizeMB;
    }
    public void displayFileSize(){
        System.out.println(getTitle()+" file size: "+fileSizeMB+"MB");
    }
}
