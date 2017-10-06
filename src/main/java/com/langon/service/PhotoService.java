package com.langon.service;

import com.langon.model.Photo;
import com.langon.model.User;

import java.util.List;

/**
 * Created by smcgrath on 06/10/2017.
 */
public interface PhotoService {
    Photo save(Photo photo);

    List<Photo> findAll();

    List<Photo> findByUser(User user);

    Photo findByPhotoId(Long photoId);
}

