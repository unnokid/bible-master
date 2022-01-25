package bible.bibleplanner.bible;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class JpaBibleRepository implements BibleRepository{

    private EntityManager em;

    public JpaBibleRepository(EntityManager em) {
        this.em = em;
    }

    @Override
    public List<Bible> findAll() {
        List<Bible> result = em.createQuery("select b from Bible b",Bible.class)
                .getResultList();
        return result;
    }

    @Override
    public List<Bible> searchAll() {
        return null;
    }
}
