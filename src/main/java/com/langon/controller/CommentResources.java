package com.langon.controller;

import com.langon.model.Comment;
import com.langon.model.Photo;
import com.langon.service.CommentService;
import com.langon.service.PhotoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by smcgrath on 06/10/2017.
 */
@RestController
@RequestMapping("/rest")
public class CommentResources {

    @Autowired
    private PhotoService photoService;

    @Autowired
    private CommentService commentService;

    @RequestMapping(value = "/comment/add", method = RequestMethod.POST)
    public void addComment(@RequestBody Comment comment){
        Photo photo = photoService.findByPhotoId(comment.getPhotoId());
        List<Comment> commentList = photo.getCommentList();
        comment.setPhoto(photo);
        commentService.save(comment);
    }
}
