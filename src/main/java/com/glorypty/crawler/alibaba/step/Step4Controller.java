/*
 *Project: glorypty-crawler
 *File: com.glorypty.crawler.yiyao.stepStep1Controller.java
 ****************************************************************
 * 版权所有@2015 国裕网络科技  保留所有权利.
 ***************************************************************/
package com.glorypty.crawler.alibaba.step;

import java.util.List;

import com.glorypty.crawler.base.BaseController;
import edu.uci.ics.crawler4j.crawler.CrawlController;

/**
 * @author yiwen
 * @date 2015年6月24日
 * @version 1.0
 */
public class Step4Controller extends BaseController {
	
	@Override
	public void door(List<String> lstUrls) throws Exception {
		if(null==lstUrls || lstUrls.isEmpty())
			return;
		
		CrawlController crawlController = this.getController(0);
		for(String link : lstUrls){
			crawlController.addSeed(link);
		}
		lstUrls.clear();

		crawlController.start(Step4Crawler.class, 1);
	}

	@Override
	protected void doorError() {
		// TODO Auto-generated method stub

	}

}

