package com.lcwd.electronic.store.dtos;

import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PageableResponse<T> {

    // jr pageableResponse class ha genric nasta tr to user dto specific asta .
    // PageableResponse ha genric aasel tr  saglayan sati used hoin

    private List<T> content;
    private int pageNumber;
    private int pageSize;
    private long totalElement;
    private int totalpages;
    private boolean lastPage;




}
