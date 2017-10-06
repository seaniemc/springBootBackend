package com.langon.service;

import com.langon.model.Comment;

import java.util.List;

/**
 * Created by smcgrath on 06/10/2017.
 */
public interface CommentService {
    Comment save(Comment comment);

    List<Comment> findByPhotoId(Long photoId);

    Comment findOne(Long commentId);
}
