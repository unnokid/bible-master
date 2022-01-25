package bible.bibleplanner.bible;

import javax.persistence.*;


@Entity
@IdClass(BibleID.class)
@Table(name="bible_korhrv")
public class Bible {

    @Id
    private Long book;
    @Id
    private Long chapter;
    @Id
    private Long verse;

    private String content;

    public void setBook(Long book) {
        this.book = book;
    }

    public Long getBook() {
        return book;
    }

    public Long getChapter() {
        return chapter;
    }

    public void setChapter(Long chapter) {
        this.chapter = chapter;
    }

    public Long getVerse() {
        return verse;
    }

    public void setVerse(Long verse) {
        this.verse = verse;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
