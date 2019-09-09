package viethoc.brains.course;

import lombok.Data;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import viethoc.brains.topic.Topic;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Data
@Entity
@EnableAutoConfiguration
public class Course {
    @Id
    private String id;
    private String name;
    private String description;
    @ManyToOne
    private Topic topic;
}
