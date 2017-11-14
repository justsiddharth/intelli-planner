package com.hackathon.intelliplan.service;

import com.hackathon.intelliplan.entity.OnBoard;
import java.util.Map;
import org.springframework.data.domain.Page;

public interface IOnBoardService {

    long count();

    OnBoard create(OnBoard resource);

    Page<OnBoard> findAll();

    void delete(String id);

    Page<OnBoard> findAllPaginatedAndSorted(int page, int size, String sortBy, String sortOrder);

    Page<OnBoard> search(int page, int size, String sortBy, String sortOrder, Map<String, String[]> filters);

    void update(String id, OnBoard resource);

    OnBoard findOne(String id);
}

