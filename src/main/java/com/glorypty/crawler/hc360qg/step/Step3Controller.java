/*
 *Project: glorypty-crawler
 *File: com.glorypty.crawler.hc360.step.Step0Controller.java <2015年12月17日>
 ****************************************************************
 * 版权所有@2015 国裕网络科技  保留所有权利.
 ***************************************************************/
package com.glorypty.crawler.hc360qg.step;

import java.util.List;

import com.glorypty.crawler.base.BaseController;
import com.glorypty.crawler.common.ConstantsCrawler;
import com.glorypty.crawler.hc360qg.Hc360QgConstants;

import edu.uci.ics.crawler4j.crawler.CrawlController;

/**
 * 爬虫列表分页控制器
 * @author ZhangLujun 
 * @Date 2015年12月17日 上午10:56:15
 * @version 1.0
 */
public class Step3Controller extends BaseController {

	@Override
	public void door(List<String> lstUrls) throws Exception {
		if(null==lstUrls || lstUrls.isEmpty())
			return;
		
//		CrawlController crawlController = this.getController(0);
		CrawlController crawlController = this.getController(ConstantsCrawler.CRAWL_STORAGE + Hc360QgConstants.RECORD_DIR, true, 0);
		for(String link : lstUrls){
			crawlController.addSeed(link);
		}
		
		lstUrls.clear();

//		CrawlController crawlController = this.getController(0);
//		crawlController.addSeed("http://b2b.hc360.com/buy/505169342.html");
		
		crawlController.start(Step3Crawler.class, 1);
	}

	@Override
	protected void doorError() {

	}

}
