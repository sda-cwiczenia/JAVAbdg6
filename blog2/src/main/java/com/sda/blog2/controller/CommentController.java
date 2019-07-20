package com.sda.blog2.controller;

import com.sda.blog2.model.Comment;
import com.sda.blog2.model.Post;
import com.sda.blog2.model.User;
import com.sda.blog2.service.CommentService;
import com.sda.blog2.service.PostService;
import com.sda.blog2.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class CommentController {

    PostService postService;
    CommentService commentService;
    UserService userService;
    User loggedUser;

    @Autowired
    public CommentController(PostService postService, CommentService commentService, UserService userService) {
        this.postService = postService;
        this.commentService = commentService;
        this.userService = userService;
    }

    @GetMapping("/addcomment/{post_id}")
    public String addCommentForm(Model model, @PathVariable("post_id") Long post_id) {
        Comment comment = new Comment();
        Post post = new Post();
        post = postService.getPost(post_id);
        model.addAttribute("post", post);

        model.addAttribute("comment", comment);

//        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
//        System.out.println("AUTH ma wartosc: "+auth);
//        User loggedUser = userService.findUserByEmail(auth.getName());

        model.addAttribute("loggedUser", loggedUser);

        return "addcomment";
    }

    @ResponseBody
    @PostMapping("/addcomment/{post_id}")
    public String addComment(@ModelAttribute("comment") Comment comment, @PathVariable("post_id") Long post_id) {

        commentService.addComment(post_id, loggedUser.getId(), comment);

        return "Komentarz do postu id: "+post_id+" został dodany!";
    }

    @ModelAttribute
    public void atStart() {

        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        System.out.println("AUTH ma wartosc: " + auth);
        User loggedUser = userService.findUserByEmail(auth.getName());
        this.loggedUser = loggedUser;

    }


}
