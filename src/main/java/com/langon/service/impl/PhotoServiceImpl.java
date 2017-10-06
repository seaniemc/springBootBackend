package com.langon.service.impl;

import com.langon.dao.PhotoDao;
import com.langon.model.Photo;
import com.langon.model.User;
import com.langon.service.PhotoService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by smcgrath on 06/10/2017.
 */
public class PhotoServiceImpl implements PhotoService {
    @Autowired
    private PhotoDao photoDao;

    public Photo save(Photo photo) {
        return photoDao.save(photo);
    }

    public List<Photo> findAll() {
        return photoDao.findAll();
    }

    public List<Photo> findByUser(User user) {
        return photoDao.findByUser(user);
    }

    public Photo findByPhotoId(Long photoId) {
        return photoDao.findByPhotoId(photoId);
    }
}
