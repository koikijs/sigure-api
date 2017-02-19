package koikijs.model.attendance;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * Created by nabuchi on 2017/02/19.
 */

@RunWith(SpringRunner.class)
public class AttendanceRepositoryTest {

    @Autowired
    AttendanceRepository attendanceRepository;

    @Test
    public void test() {
        Attendance attendance = new Attendance();
        attendanceRepository.save(attendance);
    }
}