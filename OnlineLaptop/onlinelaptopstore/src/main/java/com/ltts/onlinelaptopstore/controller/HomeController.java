package com.ltts.onlinelaptopstore.controller;

import java.time.LocalDate;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.data.repository.CrudRepository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.ltts.demoproject.model.Movie;
import com.ltts.onlinelaptopstore.bo.LaptopBo;
import com.ltts.onlinelaptopstore.bo.SalesBo;
import com.ltts.onlinelaptopstore.bo.UserBo;
import com.ltts.onlinelaptopstore.model.Laptop;
import com.ltts.onlinelaptopstore.model.User;

@RestController
public class HomeController {
	
	@Autowired
	UserBo ud;
	
	@Autowired
	LaptopBo lp;
	
	@Autowired
	SalesBo sl;
	
	@RequestMapping("/")
	public ModelAndView m1()
	{
		return new ModelAndView("index");
	}
	
	@RequestMapping("/register")
	public ModelAndView m2()
	{
		return new ModelAndView("register");
	}
	@RequestMapping(value="registeruser", method=RequestMethod.POST)
	public ModelAndView m3(HttpServletRequest request)
	{	
		String username=request.getParameter("user");
		//AnnotationConfigApplicationContext ac=new AnnotationConfigApplicationContext();
		//ac.scan("com.ltts.onlinelaptopstore.model");
		//ac.refresh();
		String password=request.getParameter("pass");
		String name=request.getParameter("name");
		String dob=request.getParameter("dob");
		String address=request.getParameter("address");
		//User u=ac.getBean(User.class);
		User u=new User(name,username,password,dob,address);
		/*u.setCust_name(name);
		u.setDob(dob);
		u.setAddress(address);
		u.setUsername(username);
		u.setPassword(password);*/
		
		//System.out.println(username+" " + password + " " + name + " " + dob + " "+ address);
		System.out.println(u);
		//((CrudRepository<Laptop, Integer>) ud).save(u);
		boolean b=ud.insertUser(u);
		return new ModelAndView("success");
	}
	
	@RequestMapping(value="login")
	public ModelAndView m4(HttpServletRequest request,Model model)
	{
		ModelAndView mv=null;
		String username=request.getParameter("uname");
		String password=request.getParameter("pass");
		User u=((UserBo) ud).checkUserByUsername(username);
		System.out.println("********* Username is " + u + " ***************");
		if(u==null)
		{
			model.addAttribute("msg","Your username is incorrect");
			mv=new ModelAndView("index");
			//return mv;
		}
		else
		{
			if(u.getUsername().equals(username)){
				if(password.equals(u.getPassword())){
					model.addAttribute("name",u.getCust_name());
					model.addAttribute("cust_name", u.getUsername());
					mv=new ModelAndView("welcome");
					}	
				else{
				model.addAttribute("msg","Your password is wrong");
				mv=new ModelAndView("index");
					}
			}
			else
			{
				model.addAttribute("msg","Your username is wrong");
				mv=new ModelAndView("index");
			}
		}
		
		return mv;
	}
	
	@RequestMapping("/addlaptop")
	public ModelAndView m7()
	{
		return new ModelAndView("addlaptop");
	}
	@RequestMapping(value="insertlaptop", method=RequestMethod.POST)
	public ModelAndView m5(  Model model, HttpServletRequest request)
	{
		/*AnnotationConfigApplicationContext ac=new AnnotationConfigApplicationContext();
		ac.scan("com.ltts.onlinelaptopstore");
		ac.refresh();*/
		//Laptop l=ac.getBean(Laptop.class);
		int id=Integer.parseInt(request.getParameter("id"));
		String brand=request.getParameter("brand");
		int cost=Integer.parseInt(request.getParameter("cost"));
		int model2=Integer.parseInt(request.getParameter("model"));
		int year=Integer.parseInt(request.getParameter("year"));
		int ram=Integer.parseInt(request.getParameter("ram"));
		String processor=request.getParameter("processor");
		Laptop l=new Laptop(brand,processor,id,cost,model2,ram,year);
		l.setBrandname(brand);
		l.setProcessor(processor);
		l.setLaptop_id(id);
		l.setCost(cost);
		l.setModel_no(model2);
		l.setRam(ram);
		l.setYear(year);
		lp.save(l);
		return new ModelAndView("welcome");
	}
	
	@RequestMapping("/updateuser")
	public ModelAndView m6(@RequestParam String cust_name,Model model)
	{
		ModelAndView mv=new ModelAndView("updateuser");
		User u=ud.checkUserByUsername(cust_name);
		if(u==null)
				System.out.println("User is null");
		else
				System.out.println("User is not null");
		model.addAttribute("user",u);
		
		return mv;
	}
	
	@RequestMapping(value="update", method=RequestMethod.POST)
	public ModelAndView m8(HttpServletRequest request, Model model)
	{
		String name=request.getParameter("cust");
		String user= request.getParameter("user");
		String pass=request.getParameter("pass");
		String dob= request.getParameter("dob");
		String addr=request.getParameter("addr");
		String pic= request.getParameter("pic");
		
		User u= new User(name,user,pass,dob,addr);
		boolean b=ud.updateUser(u);
		 
		if(b==false)
		{
			model.addAttribute("msg", "Failed to update");
			ModelAndView mv=new ModelAndView("welcome");
			return mv;
		}
		else
		{
			model.addAttribute("msg", "Updated successfully");
			ModelAndView mv=new ModelAndView("welcome");
			return mv;
		}
	}
	
	@RequestMapping("/purchase")
	public ModelAndView m9(Model model)
	{
		ModelAndView mv=new ModelAndView("purchase");
		List<Laptop> li=lp.findAll();
		model.addAttribute("list", li);
		return mv;
		//return new ModelAndView("purchase");
	}
	
	
}
