package com.langon.dao;

import com.langon.model.Comment;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by smcgrath on 06/10/2017.
 */
@Repository
public interface CommentDao extends CrudRepository<Comment, Long> {
    Comment save(Comment comment);

    Comment findOne(Long commentId);

    List<Comment> findByPhotoId(Long photoId);
}
