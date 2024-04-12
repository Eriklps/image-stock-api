package com.example.imageliteapi.application.images;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Data
@Builder
public class ImageDTO {
    private String url;
    private String name;
    private String extension;
    private Long size;
    @JsonFormat(pattern = "MM/dd/yyyy")
    private LocalDate uploadDate;
}
