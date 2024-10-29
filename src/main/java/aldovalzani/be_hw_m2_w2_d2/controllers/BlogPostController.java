package aldovalzani.be_hw_m2_w2_d2.controllers;

import aldovalzani.be_hw_m2_w2_d2.entities.BlogPostEn;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/blog_post")
public class BlogPostController {

    @GetMapping
    public List<BlogPostEn> getPosts() {

    }

}
