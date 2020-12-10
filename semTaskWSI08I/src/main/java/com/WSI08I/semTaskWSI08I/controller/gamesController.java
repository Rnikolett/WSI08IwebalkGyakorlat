package com.WSI08I.semTaskWSI08I.controller;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.WSI08I.semTaskWSI08I.entity.games;
import com.WSI08I.semTaskWSI08I.repository.gamesRepository;
import com.WSI08I.semTaskWSI08I.service.gamesService;

@Controller
public class gamesController {
	@Autowired
	private gamesService gService;

    @GetMapping("/games")
    public String index(Model model) throws IOException {
        model.addAttribute("list", gService.findAll());
        return "games";
    }

    @GetMapping("/new={ID}")
    public String formUpdate(@PathVariable(value = "ID") String id, Model model) throws IOException {
        try {
            model.addAttribute("games", gService.findById(Integer.parseInt(id)));
        } catch (NumberFormatException e) {
        }
        return "new";
    }

    @GetMapping("/view={ID}")
    public String formView(@PathVariable(value = "ID") String id, Model model) throws IOException {
        try {
            model.addAttribute("games", gService.findById(Integer.parseInt(id)));
        } catch (NumberFormatException e) {
        }
        return "view";
    }

    @GetMapping("/new")
    public String formInsert(Model model) throws IOException {
        model.addAttribute("games", new games());
        return "new";
    }

    @PostMapping("/save")
    public String formSubmit(@ModelAttribute games g, Model model) {
        model.addAttribute("games", g);
        gService.save(g);
        return "redirect:/games";
    }

    @GetMapping("/delete={ID}")
    public String delete(@PathVariable(value = "ID") String id, Model model) throws IOException {
        try {
            gService.delete(gService.findById(Integer.parseInt(id)));
        } catch (NumberFormatException e) {
        }
        return "redirect:/games";

    }
	
	
	
	
	/*@Autowired
	    private gamesService gService;
	   
	   
	    @GetMapping("/games")
	    public String index(Model m) throws IOException {
	        m.addAttribute("list", gService.findAll());
	        return "games";
	    }
	    
	    @GetMapping("/update={ID}")
	    public String gameUpdate(@PathVariable(value = "ID") String id, Model model) throws IOException {
	    	try {
				model.addAttribute("games",gService.findById(Integer.parseInt(id)));
				//gService.delete(gService.findById(Integer.parseInt(id)));
			} catch (NumberFormatException nfe) {
				
			}
	    	return "newGames";
	    }
	    
	   

	    @PostMapping("/update")
	    public String gameSubmit(Model model) {
	    	model.addAttribute("games", new games());
	    	
			return "redirect:/newGames";
	    }
	    
	    @GetMapping("/new")
		private String newGame (Model model) {
			games g=new games();
			model.addAttribute("games", g);
			System.out.println("game: " + g.toString());
			return "newGames";
		}
	    
	    @PostMapping("/new")
		private String saveGame(games g, Model model ) {
			System.out.println("new:" + g.toString());
			model.addAttribute("games", g);
			gService.save(g);
			return "redirect:/games";
		}

	    @GetMapping("/delete={ID}")
	    public String delete(@PathVariable(value = "ID") String id, Model m) throws IOException {
	        try {
	            gService.delete(gService.findById(Integer.parseInt(id)));
	        } catch (NumberFormatException e) {

	        }
	        return "redirect:/games";

	    }*/
}
