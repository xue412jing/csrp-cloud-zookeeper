package csrp.york.controller;

import java.util.List;

import javax.annotation.Resource;

import org.csrp.cloud.entity.OrderBean;
import org.csrp.cloud.entity.TbSupplierBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.york.provider.IProviderService;

import csrp.york.service.ICumsterService;

@RestController
@RequestMapping("cumster")
public class CumsterController {

	private String usr_path = "http://csrp-provider/";
	@Autowired
	private RestTemplate restTemplate;
	@Autowired
	private ICumsterService cumsterService;
	@Autowired
	private IProviderService iProviderService;
	@GetMapping("getOrderById/{id}")
	public OrderBean getOrderById(@PathVariable("id") String id){
		OrderBean bean = restTemplate.getForObject(usr_path+"order/getOrderById/"+id, OrderBean.class);
		return bean;
	}
	@GetMapping("getById/{id}")
	public TbSupplierBean getById(@PathVariable("id") String id){
		TbSupplierBean bean = restTemplate.getForObject(usr_path+"order/getById/"+id, TbSupplierBean.class);
		return bean;
	}
	@GetMapping("selectList")
	public List<TbSupplierBean> selectList(){
		List<TbSupplierBean>  list = cumsterService.selectList();
		return list;
	}
	
}
