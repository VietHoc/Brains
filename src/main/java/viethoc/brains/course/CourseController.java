package viethoc.brains.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import viethoc.brains.topic.Topic;
import viethoc.brains.topic.TopicService;

import java.util.List;

@RestController
@RequestMapping("/topics/{topicId}")
public class CourseController {

    @Autowired
    private  CourseService courseService;

    @GetMapping("courses")
    public List<Course> getAll(@PathVariable String topicId) {
        return courseService.getAllCourses(topicId);
    }

    @GetMapping("courses/{id}")
    public Course getTopic(@PathVariable String id) {
        return courseService.getCourse(id);
    }

    @PostMapping("courses")
    public void addTopic(@PathVariable String topicId, @RequestBody Course course) {
        course.setTopic(new Topic().setId(topicId));
        courseService.addCourse(course);
    }

    @PutMapping("courses/{id}")
    public void updateTopic(@PathVariable String topicId, @RequestBody Course course){
        course.setTopic(new Topic().setId(topicId));
        courseService.updateTopic(course);
    }

    @DeleteMapping("courses/{id}")
    public void deleteTopic(@PathVariable String id){
        courseService.deleteTopic(id);
    }
}