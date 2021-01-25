package com.ibm.examples.spring.git;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GitInfoController {
	@Autowired
	private GitInfo gitInfoBean;

	public GitInfo getGitInfoBean() {
		return gitInfoBean;
	}
	public void setGitInfoBean(GitInfo gitInfoBean) {
		this.gitInfoBean = gitInfoBean;
	}
	
    @RequestMapping("/git-info")
    public GitInfo getCommitId() {
        return getGitInfoBean();
    }
}
