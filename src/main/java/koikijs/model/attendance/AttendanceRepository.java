package koikijs.model.attendance;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by nabuchi on 2017/02/19.
 */
@Repository
public interface AttendanceRepository extends CrudRepository<Attendance, String> {
}
