package koikijs.model.person;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by nabuchi on 2017/02/19.
 */
@Entity
public class Person {
    @Id
    private Long id;

    private String name;

    private String iconUrl;

    private String city;
}
