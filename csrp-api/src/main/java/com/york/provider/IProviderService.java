package com.york.provider;

import java.util.List;

import org.csrp.cloud.entity.TbSupplierBean;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "csrp-provider")
public interface IProviderService {
	 @RequestMapping(value="/order/selectList",method=RequestMethod.GET )
	 List<TbSupplierBean> selectList();
}
