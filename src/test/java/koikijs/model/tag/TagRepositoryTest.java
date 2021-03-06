package koikijs.model.tag;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Java6Assertions.assertThat;

/**
 * Created by nabuchi on 2017/02/19.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment= SpringBootTest.WebEnvironment.RANDOM_PORT)
public class TagRepositoryTest {
    @Autowired
    TagRepository tagRepository;

    @Test
    public void findOne() {
        Tag tag = new Tag();
        tag.setId("id");
        tag.setName("name");
        tagRepository.save(tag);
        Tag savedTag = tagRepository.findOne("id");

        assertThat(savedTag.getName()).isEqualTo("name");
    }
}