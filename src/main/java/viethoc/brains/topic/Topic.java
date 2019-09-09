package viethoc.brains.topic;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.experimental.Accessors;
import org.springframework.boot.autoconfigure.*;


@Data
@Entity
@EnableAutoConfiguration
@Accessors(chain = true)
public class Topic {
    @Id
    private String id;
    private String name;
    private String description;
}
