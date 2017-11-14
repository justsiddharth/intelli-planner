package com.hackathon.intelliplan.entity;

import java.util.List;
import javax.validation.constraints.NotNull;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Data
@Document(indexName = "onboarding", type = "onboard", shards = 1, replicas = 0)
public class OnBoard {

    @Id
    private String id;

    @NotNull
    private String name;

    private String projectId;

    private Template template;

    private List<TemplateEntities> entities;

    private boolean requireMockData;

    private String ownedBy;

    private Task ganttTask;
}

