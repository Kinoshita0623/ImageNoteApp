package jp.kinoshita.imagenoteapp;

public class Note {

    private int imageResourceId;
    private String title;
    private String text;

    public Note(int imageResourceId, String title, String text) {
        this.imageResourceId = imageResourceId;
        this.title = title;
        this.text = text;
    }


    public int getImageResourceId() {
        return imageResourceId;
    }

    public String getTitle() {
        return title;
    }

    public String getText() {
        return text;
    }
}
