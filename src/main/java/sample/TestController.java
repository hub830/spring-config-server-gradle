package sample;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("test")
public class TestController {
	private static final Logger log = LoggerFactory.getLogger(TestController.class);

	@Value("${foo:123456789}")
	private  String foo;
	

	@RequestMapping(value = "/test1")
	@ResponseBody
	public String test1() {
		log.info("--------------------------------------------------------------------------------");
		log.info(foo);
		log.info("--------------------------------------------------------------------------------");
		return foo;
	}

}
