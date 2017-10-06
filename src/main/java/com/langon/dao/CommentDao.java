package com.langon.dao;

import com.langon.model.Comment;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by smcgrath on 06/10/2017.
 */
public interface CommentDao extends CrudRepository<Comment, Long> {
    Comment save(Comment comment);

    Comment findOne(Long commentId);

    List<Comment> findByPhotoId(Long photoId);
}
