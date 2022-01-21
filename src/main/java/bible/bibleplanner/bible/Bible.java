package bible.bibleplanner.bible;

public class Bible {
    private Long book;
    private Long chapter;
    private Long verse;
    private String content;

    public Long getBook() {
        return book;
    }

    public void setBook(Long book) {
        this.book = book;
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
