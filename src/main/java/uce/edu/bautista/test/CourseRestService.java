package uce.edu.bautista.test;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;

@Path("/courses")
public class CourseRestService {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Course> fetchAll() {
        List<Course> courses = new ArrayList<Course>();
        courses.add(new Course(1, "Configure Jersey with annotation"));
        courses.add(new Course(2, "Configure Jersey without web.xml"));
        return courses;
    }

}
