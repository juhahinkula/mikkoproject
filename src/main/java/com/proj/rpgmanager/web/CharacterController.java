package com.proj.rpgmanager.web;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.proj.rpgmanager.domain.CharacterRepository;
import com.proj.rpgmanager.domain.GroupRepository;
import com.proj.rpgmanager.domain.PlayerRepository;


@Controller
public class CharacterController {
		@Autowired
		private CharacterRepository characterRepository;
		
		@Autowired
		private GroupRepository groupRepository;
		
		@Autowired
		private PlayerRepository playerRepository;
	
		@RequestMapping("/charlist")
		public String characterList(Model model) {
			model.addAttribute("characters", characterRepository.findAll());
			return "charlist";
		}
		
		
		
		
		@RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
		public String deleteCharacter(@PathVariable("id") long id, Model model) {
			characterRepository.deleteById(id);
			return "redirect:../charlist";
		}
		
		//edit
		@RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
		public String editCharacter(@PathVariable("id") long id, Model model) {

			model.addAttribute("character", characterRepository.findById(id));
			model.addAttribute("groups", characterRepository.findAll());
			return "editchar";
		}
		
		
		
		
		
		
		@RequestMapping(value = "/book/{id}", method=RequestMethod.DELETE)
		@ResponseBody
		public String deleteRest(@PathVariable("id") Long id){
			
			String characterName = characterRepository.findById(id).get().getName();
			
			characterRepository.deleteById(id);
			
			return characterName + " deleted";
		}
		
		 @RequestMapping(value="/login")
		  public String login() {
		    return "login";
		  }
		
}
