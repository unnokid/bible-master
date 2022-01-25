package bible.bibleplanner.bible;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class BibleService {
    private BibleRepository bibleRepository;


    public BibleService(BibleRepository bibleRepository) {
        this.bibleRepository = bibleRepository;
    }

    public List<Bible> searchBibles(){
        return bibleRepository.searchAll();
    }

    public List<Bible> findBibles(){
        return bibleRepository.findAll();
    }

}
