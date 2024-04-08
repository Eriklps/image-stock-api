package com.example.imageliteapi.domain.service;

import com.example.imageliteapi.domain.entity.Image;
import com.example.imageliteapi.domain.enums.ImageExtension;

import java.util.List;
import java.util.Optional;

public interface ImageService {
    Image save(Image image);

    Optional<Image> getById(String id);

    List<Image> search(ImageExtension extension, String query);
}