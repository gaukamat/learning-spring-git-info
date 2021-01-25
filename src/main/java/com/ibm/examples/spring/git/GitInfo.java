package com.ibm.examples.spring.git;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class GitInfo {
    @Value("${git.commit.message.short}")
    private String commitMessage;

    @Value("${git.branch}")
    private String branch;

    @Value("${git.commit.id}")
    private String commitId;
    
    public GitInfo() {
    	super();
    }

	public String getCommitMessage() {
		return commitMessage;
	}
	public String getBranch() {
		return branch;
	}
	public String getCommitId() {
		return commitId;
	}
    
}
