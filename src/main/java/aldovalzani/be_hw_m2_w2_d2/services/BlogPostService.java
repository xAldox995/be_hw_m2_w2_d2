package aldovalzani.be_hw_m2_w2_d2.services;

import aldovalzani.be_hw_m2_w2_d2.entities.BlogPostEn;
import aldovalzani.be_hw_m2_w2_d2.exceptions.NotFoundException;
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

    public BlogPostEn savePost(BlogPostPL body) {
        BlogPostEn newBlog =
                new BlogPostEn(body.getCategoria(), body.getContenuto(), body.getTempoDiLettura(), body.getTitolo());
        this.blogPostEnList.add(newBlog);
        return newBlog;
    }

    public BlogPostEn findBlogById(int blogId) {
        BlogPostEn blogFound = null;
        for (BlogPostEn blog : this.blogPostEnList) {
            if (blog.getId() == blogId) blogFound = blog;
        }
        if (blogFound == null) throw new NotFoundException(blogId);
        return blogFound;
    }

    public BlogPostEn findBlogByIdAndUpdate(int blogId, BlogPostPL body) {
        BlogPostEn blogFound = null;
        for (BlogPostEn blog : this.blogPostEnList) {
            if (blog.getId() == blogId) {
                blogFound = blog;
                blogFound.setCategoria(body.getCategoria());
                blogFound.setContenuto(body.getContenuto());
                blogFound.setTempoDiLettura(body.getTempoDiLettura());
                blogFound.setTitolo(body.getTitolo());

            }
        }
        if (blogFound == null) throw new NotFoundException(blogId);
        return blogFound;
    }

    public void findBlogByIdAdnDel(int blogId) {
        BlogPostEn blogFound = null;
        for (BlogPostEn blog : this.blogPostEnList) {
            if (blog.getId() == blogId) blogFound = blog;
        }
        if (blogFound == null) throw new NotFoundException(blogId);
        this.blogPostEnList.remove(blogFound);
    }
}
