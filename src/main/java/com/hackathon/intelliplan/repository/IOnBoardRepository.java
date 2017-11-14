package com.hackathon.intelliplan.repository;

import com.hackathon.intelliplan.entity.OnBoard;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface IOnBoardRepository extends ElasticsearchRepository<OnBoard, String> {
}
