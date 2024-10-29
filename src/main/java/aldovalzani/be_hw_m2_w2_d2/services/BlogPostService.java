package aldovalzani.be_hw_m2_w2_d2.services;

import aldovalzani.be_hw_m2_w2_d2.entities.BlogPostEn;
import aldovalzani.be_hw_m2_w2_d2.payloads.BlogPostPL;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BlogPostService {
    private List<BlogPostEn> blogPostEnList = new ArrayList<>();

    public List<BlogPostEn> findAllPosts() {
        return this.blogPostEnList;
    }

    public BlogPostEn savePost(BlogPostPL blog) {
        BlogPostEn newBlog =
                new BlogPostEn(blog.getCategoria(), blog.getContenuto(), blog.getTempoDiLettura(), blog.getTitolo());
        this.blogPostEnList.add(newBlog);
        return newBlog;
    }
}
