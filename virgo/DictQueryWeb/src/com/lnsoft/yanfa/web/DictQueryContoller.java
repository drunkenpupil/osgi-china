package com.lnsoft.yanfa.web;

import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.lnsoft.yanfa.service.DictQueryService;




@Controller
public class DictQueryContoller {
	@Resource
	private DictQueryService dictQueryService ;

	@RequestMapping({ "/", "/search" })
	public String search(Map<String, Object> model,HttpServletRequest req) {
//		WebApplicationContext ctx = WebApplicationContextUtils.getWebApplicationContext(req.getSession().getServletContext());
//
//		DictQueryService ss=(DictQueryService)ctx.getBean("localService");
		
		String key = req.getParameter("key");
		String content = dictQueryService.search(key);
		req.setAttribute("key", content);
		return "hello";
	}

}
