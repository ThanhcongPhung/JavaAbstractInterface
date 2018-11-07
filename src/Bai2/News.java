package Bai2;

public class News implements INews {
    int ID;
    String Title;
    String PublishDate;
    String Author;
    String Content;
    float AverageRate;
    int[] RateList = new int[3];

    public News() {
    }

    public News(int ID, String Title, String PublishDate, String Author, String Content, float AverageRate) {
        this.ID = ID;
        this.Title = Title;
        this.PublishDate = PublishDate;
        this.Author = Author;
        this.Content = Content;
        this.AverageRate = AverageRate;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getPublishDate() {
        return PublishDate;
    }

    public void setPublishDate(String publishDate) {
        PublishDate = publishDate;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public float getAverageRate() {
        return AverageRate;
    }

    public void Calculate() {
        AverageRate = (RateList[0] + RateList[1] + RateList[2]) / 3.0f;
    }

    @Override
    public void Display() {
        System.out.println("Title: " + Title);
        System.out.println("PublishDate: " + PublishDate);
        System.out.println("Author: " + Author);
        System.out.println("Content: " + Content);
        System.out.println("AverageRate: " + AverageRate);
    }
}
