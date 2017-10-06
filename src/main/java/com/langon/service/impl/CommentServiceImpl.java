package com.langon.service.impl;

import com.langon.dao.CommentDao;
import com.langon.model.Comment;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by smcgrath on 06/10/2017.
 */
public class CommentServiceImpl {

    @Autowired
    private CommentDao commentDao;

    public Comment save(Comment comment){
        return commentDao.save(comment);
    }
    public Comment findOne(Long commentId){
        return commentDao.findOne(commentId);
    }
    public List<Comment> findoByPhotoId(Long photoId){
        return commentDao.findByPhotoId(photoId);
    }

}
