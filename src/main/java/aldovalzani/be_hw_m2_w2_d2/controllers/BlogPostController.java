package aldovalzani.be_hw_m2_w2_d2.controllers;

import aldovalzani.be_hw_m2_w2_d2.entities.BlogPostEn;
import aldovalzani.be_hw_m2_w2_d2.payloads.BlogPostPL;
import aldovalzani.be_hw_m2_w2_d2.services.BlogPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public BlogPostEn createBlog(@RequestBody BlogPostPL body) {
        return this.blogPostService.savePost(body);
    }

    @GetMapping("/{blogId}")
    public BlogPostEn findBlogById(@PathVariable int blogId) {
        return this.blogPostService.findBlogById(blogId);
    }

}
