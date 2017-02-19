package koikijs.model.person;

import koikijs.model.tag.Tag;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

/**
 * Created by nabuchi on 2017/02/19.
 */
@Entity
public class Person {
    @Id
    private String id;

    private String countryCode;

    private String cityCode;

    private String name;

    private String iconUrl;

    @OneToMany
    private List<Tag> tags;
}
