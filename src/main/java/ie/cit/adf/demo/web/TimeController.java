package ie.cit.adf.demo.web;

import ie.cit.adf.demo.TimeService;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TimeController {
	private TimeService timeService;
	
	public void setTimeService(TimeService timeService) {
		this.timeService = timeService;
	}

	@RequestMapping("time")
	public String time(Model model){
		model.addAttribute("time",timeService.getCurrentDate());
		return "index.jsp";
	}
}
