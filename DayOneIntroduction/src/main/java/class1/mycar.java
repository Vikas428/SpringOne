package class1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class mycar {
	public String name="Vikas";
	@GetMapping("/mycar")
	public String getName()
	{
		return "welcome "+name;
	}
	

}
