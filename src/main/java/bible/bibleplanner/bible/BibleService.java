package bible.bibleplanner.bible;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BibleService {
    private BibleRepository bibleRepository;


    public BibleService(BibleRepository bibleRepository) {
        this.bibleRepository = bibleRepository;
    }

    public List<Bible> findBibles(){
        return bibleRepository.findAll();
    }

}
