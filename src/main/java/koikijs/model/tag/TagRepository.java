package koikijs.model.tag;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by nabuchi on 2017/02/19.
 */
@Repository
public interface TagRepository extends CrudRepository<Tag, String> {
}
