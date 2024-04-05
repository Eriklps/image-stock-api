package com.example.imageliteapi.application.images;

import com.example.imageliteapi.domain.entity.Image;
import com.example.imageliteapi.domain.service.ImageService;
import com.example.imageliteapi.infra.repository.ImageRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class ImageServiceImpl implements ImageService {
    private final ImageRepository repository;
    @Override
    @Transactional
    public Image save(Image image) {
        return repository.save(image);
    }
}
