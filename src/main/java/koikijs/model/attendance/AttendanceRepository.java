package koikijs.model.attendance;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

/**
 * Created by nabuchi on 2017/02/19.
 */
@Repository
public interface AttendanceRepository extends JpaRepository<Attendance, String>, JpaSpecificationExecutor<Attendance> {
}
