package com.zxin.handlers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller    // 表示当前类是一个处理器
@RequestMapping("/zxin")     // 命名空间
public class MyController {

	@RequestMapping("/some.do")
	public String doSome() {
		return "/WEB-INF/jsp/welcome.jsp";  // 物理视图
	}
}


















