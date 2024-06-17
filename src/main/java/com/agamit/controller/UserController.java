package com.agamit.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class UserController {

	@GetMapping(value = {"/","login"})
	public String loginForm() {
		return "login";
	}

	@PostMapping("/login")
	public String loginCheck(HttpServletRequest req,RedirectAttributes ra, Model model) {
		String uname = req.getParameter("uname");
		String pwd = req.getParameter("pwd");

		if (uname.equals("admin") && pwd.equals("admin@123")) {
			ra.addFlashAttribute("uname",uname);
			return "redirect:/buildDeshBoard";
		}
		model.addAttribute("msg", "Invalid credentails");
		return "login";
	}

	@GetMapping("/buildDeshBoard")
	public String buildDashBoard(RedirectAttributes ra,Model model) {
		//Object uname=ra.getFlashAttributes().get("uname");
		//model.addAttribute("uname",uname);
		System.out.println("Deshborad Is here.....................!!");
		return "deshBoard";

	}

}
