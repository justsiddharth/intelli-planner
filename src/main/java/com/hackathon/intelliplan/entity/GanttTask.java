package com.hackathon.intelliplan.entity;

import java.time.LocalDate;

/**
 * Created by sjain on 11/14/17.
 */
public class GanttTask {

    private String id;

    private String name;

    private String toDependency;

    private String fromDependency;

    private LocalDate startDate;

    private LocalDate endDate;

    private int percentage;

    private String color;
    
}
