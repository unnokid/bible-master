package bible.bibleplanner.bible;

import javax.persistence.*;


@Entity
@IdClass(BibleID.class)
@Table(name="bible_korhrv")
public class Bible {

    @Id
    private int book;
    @Id
    private int chapter;
    @Id
    private int verse;

    private String content;

    public void setBook(int book) {
        this.book = book;
    }

    public int getBook() {
        return book;
    }

    public int getChapter() {
        return chapter;
    }

    public void setChapter(int chapter) {
        this.chapter = chapter;
    }

    public int getVerse() {
        return verse;
    }

    public void setVerse(int verse) {
        this.verse = verse;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
