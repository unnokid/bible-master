package bible.bibleplanner.bible;


import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface BibleRepository {

    List<Bible> findAll();
}
