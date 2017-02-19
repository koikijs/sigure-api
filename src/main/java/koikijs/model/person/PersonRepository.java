package koikijs.model.person;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by nabuchi on 2017/02/19.
 */
@Repository
public interface PersonRepository extends CrudRepository<Person, String> {
}
