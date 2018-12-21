package com.meiguo.carousel.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.meiguo.carousel.domain.BannerDO;
import com.meiguo.carousel.service.BannerService;
import com.meiguo.common.controller.BaseController;
import com.meiguo.common.utils.PageUtils;
import com.meiguo.common.utils.Query;

/**
 * 轮播图
 * 
 * @author wjl
 */
@Controller
@RequestMapping("/carousel/banner")
public class BannerController extends BaseController {

	@Autowired
	private BannerService bannerService;

	@ResponseBody
	@GetMapping("/list")
	public PageUtils list() {
		// 查询列表数据
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("isEnable", "0");
		List<BannerDO> sysFileList = bannerService.list(params);
		PageUtils pageUtils = new PageUtils(sysFileList, sysFileList.size());
		return pageUtils;
	}



}
