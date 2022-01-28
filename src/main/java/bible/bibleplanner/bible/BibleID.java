package bible.bibleplanner.bible;



import java.io.Serializable;
import java.util.Objects;

public class BibleID implements Serializable {

    private int book;
    private int chapter;
    private int verse;

    public BibleID() {}

    public BibleID(int book, int chapter, int verse) {
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
        return book == bibleID.book && chapter == bibleID.chapter
                && verse == bibleID.verse;
    }

    @Override
    public int hashCode(){
        return Objects.hash(book,chapter,verse);
    }

}
