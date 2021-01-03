package com.web.dealer.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.web.dealer.model.Accounts;
import com.web.dealer.repository.AccountsRepository;

@Controller
public class AppController {
	
	@Autowired
	private AccountsRepository accountsRepository;
	
	@GetMapping({"home","/","index"})
	public String home(Model model) {
		model.addAttribute("msg", "");
		return "index";
	} 
	
	
	  @GetMapping("me")	  
	  @ResponseBody public String index(@RequestParam long id, @RequestParam String
	  fname, @RequestParam String lname) {
	  
	  return "Id is "+id+" and name is "+fname+" "+ lname; }
	 
	  @GetMapping("applyforcredit")	
		public String applyforcredit(Model model) {
			model.addAttribute("msg", "Print the application below, fill it out, and bring it in for a credit check.");
			//model.addAttribute("success", "Success!");
			return "credit";
		} 

	  
	  
	@GetMapping("about")	
	public String about(Model model) {
		model.addAttribute("msg", "");
		//model.addAttribute("success", "Success!");
		return "about";
	} 

	@GetMapping("contact")
	public String contact(Model model) {
		model.addAttribute("success", "");
		return "contact";
	} 
	
	@GetMapping("register")
	public String register(Model model) {
		model.addAttribute("accounts", new Accounts());
		model.addAttribute("msg", "Register");
		return "signup";
	} 
	
	@PostMapping("signup")
	public String signup(Model model, RedirectAttributes red, @ModelAttribute("accounts") Accounts account) {
		
		Optional<Accounts> a=accountsRepository.findByEmail(account.getEmail());
		
		if(a.isPresent()) {
			red.addFlashAttribute("error", "Sorry email already exists");
			return "redirect:/register";
		}
		
		accountsRepository.save(account);
		red.addFlashAttribute("user", account);
		red.addFlashAttribute("success", "Hi "+ account.getFname()+ " " + account.getLname());
		
		return "redirect:/profile";
	}
		
	@GetMapping("profile")
	public String profile(Model model) {
		
		model.addAttribute("msg", "");
		
		return "profile";

	}
	
	@GetMapping("admin")
	public String admins(Model model) {
		model.addAttribute("list", accountsRepository.findAll());
		model.addAttribute("msg", "Admin Page");
		
		return "admin";

	}
	
	@GetMapping("deleteaccount")
	public String remove(@RequestParam Long id, RedirectAttributes red) {
		
		try {
			accountsRepository.deleteById(id);
			red.addFlashAttribute("success", "Delete success");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return "redirect:/admin";
		
	}
	
			
	@GetMapping("removeaccount")
	public String removeaccount(@RequestParam String email, RedirectAttributes red) {
		
		try {
			Accounts a=accountsRepository.findByEmail(email).get();			
			accountsRepository.delete(a);
			
			red.addFlashAttribute("success", "Delete success");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return "redirect:/admin";
		
	}
	
	@PostMapping("search")
	public String search(Model model, @RequestParam String keyword) {
		
		model.addAttribute("list", accountsRepository.search(keyword));
		
		return "admin";
	}
	
	
	@PostMapping("updateUsers")
	@Transactional
	public String updateUsers(@ModelAttribute Accounts user) {
		
		try {
			//accountsRepository.save(user);			
			  accountsRepository.findById(user.getId()).ifPresent(a->{
			  a.setFname(user.getFname());
			  a.setLname(user.getLname());
			  //accountsRepository.save(a);
			  });
			 
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return "redirect:admin";
	}
	
	 @PostMapping("customersearch")
     public String customersearch(@RequestParam String email, @RequestParam String name, Model model) {		 
			model.addAttribute("page", "Admin");
			List<Accounts> users=accountsRepository.search(name, email);
			if(users.isEmpty()) {
				model.addAttribute("msg", " No match found");
			}else {
			model.addAttribute("list", users);
			model.addAttribute("msg", users.size()+ " found");
			}
			return "admin";
	}
	 
	@GetMapping("login")	
    public String login(Model model) {
		 
		model.addAttribute("msg", "Login");
		//model.addAttribute("msg", );

		return "login";
	} 
	
	
	@PostMapping("login")
    public String login(@RequestParam String email, @RequestParam String password, Model model) {		 
	
		if(accountsRepository.login(email, password).isPresent()) {
			 return "redirect:profile";
		}
		
		model.addAttribute("error", "Invalid credentials");
		
	 return "login";
	}
	 
	 @ModelAttribute("user")
	   public Accounts user() {		
	   return new Accounts();		
	 }
	
}
