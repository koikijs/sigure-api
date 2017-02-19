package koikijs.model.tag;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by nabuchi on 2017/02/19.
 */
@Entity
@Data
public class Tag {
    @Id
    private String id;

    private String name;
}
