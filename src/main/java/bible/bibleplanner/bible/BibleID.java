package bible.bibleplanner.bible;



import java.io.Serializable;
import java.util.Objects;

public class BibleID implements Serializable {

    private Long book;
    private Long chapter;
    private Long verse;

    public BibleID() {}

    public BibleID(Long book, Long chapter, Long verse) {
        this.book = book;
        this.chapter = chapter;
        this.verse = verse;
    }

    @Override
    public boolean equals(Object o){
        if(this == o){
            return true;
        }
        if(o == null || getClass() != o.getClass()){
            return false;
        }
        BibleID bibleID = (BibleID) o;
        return book.equals(bibleID.book) && chapter.equals(bibleID.chapter)
                && verse.equals(bibleID.verse);
    }

    @Override
    public int hashCode(){
        return Objects.hash(book,chapter,verse);
    }

}
