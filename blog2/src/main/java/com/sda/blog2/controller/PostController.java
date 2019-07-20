package com.sda.blog2.controller;

import com.sda.blog2.model.CategoryEnum;
import com.sda.blog2.model.Post;
import com.sda.blog2.service.CommentService;
import com.sda.blog2.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class PostController {

    PostService postService;
    CommentService commentService;

    @Autowired
    public PostController(PostService postService, CommentService commentService) {
        this.postService = postService;
        this.commentService = commentService;
    }

    @GetMapping("/addpost")
    public String addPost(Model model) {
        model.addAttribute("post", new Post());
        List<CategoryEnum> categories =
                new ArrayList<>(Arrays.asList(CategoryEnum.values()));
        System.out.println(categories);

        model.addAttribute("categories", categories);
        return "addpost";
    }

    @PostMapping("/addpost")
    public String addPost(@ModelAttribute Post post) {
        postService.addPost(post);

        return "redirect:/post-add-success";
    }

    @ResponseBody
    @GetMapping("/post-add-success")
    public String postAddSuccess() {
        return "Post został pomyślnie dodany!";
    }

    @ResponseBody
    @GetMapping("/showposts")
    public List<Post> showAllPosts() {

        return postService.getPosts();
    }

}
