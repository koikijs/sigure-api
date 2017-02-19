package koikijs.model.attendance;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;

/**
 * Created by nabuchi on 2017/02/19.
 */
@Entity
public class Attendance {
    @Id
    private String id;

    private String personId;

    private LocalDateTime startDateTime;

    private LocalDateTime endDateTime;

    private String reasonType;

    private String countryCode;

    private String cityCode;
}
