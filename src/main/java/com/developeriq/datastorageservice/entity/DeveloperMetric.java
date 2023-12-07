package com.developeriq.datastorageservice.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "developer_metrics")
@Getter
@Setter
public class DeveloperMetric {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "user_id")
    private String userId;

    @Column(name = "commit_count")
    private Integer commitCount;

    @Column(name = "issues_count")
    private Integer issuesCount;

    @Column(name = "pr_count")
    private Integer prCount;

    @Column(name = "issue_participation_count")
    private Integer issueParticipationCount;

}

