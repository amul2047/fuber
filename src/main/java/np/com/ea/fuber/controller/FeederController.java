package np.com.ea.fuber.controller;

import java.util.HashMap;
import java.util.Map;

import np.com.ea.fuber.model.Feeder;
import np.com.ea.fuber.model.Food;
import np.com.ea.fuber.service.FeederService;
import np.com.ea.fuber.service.FoodService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

@SessionAttributes("USER_ID")
//@SessionAttributes(value = {"one", "two"})
@Controller
@RequestMapping("/feeder")
public class FeederController 
{

}
