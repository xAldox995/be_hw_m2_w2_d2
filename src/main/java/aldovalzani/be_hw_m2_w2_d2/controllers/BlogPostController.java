package aldovalzani.be_hw_m2_w2_d2.controllers;

import aldovalzani.be_hw_m2_w2_d2.entities.BlogPostEn;
import aldovalzani.be_hw_m2_w2_d2.services.BlogPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/blog_posts")
public class BlogPostController {

    @Autowired
    private BlogPostService blogPostService;

    @GetMapping
    public List<BlogPostEn> getPosts() {
        return this.blogPostService.findAllPosts();
    }

}
