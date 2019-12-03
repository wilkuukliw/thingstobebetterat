package com.annamaria.thingstobebetteat;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;

/**
 *
 * @author anna maria
 */

@Controller
public class ThingController {

  private final ThingRepository thingRepository;

  public ThingController(ThingRepository thingRepository) {
    this.thingRepository = thingRepository;
  }

  @GetMapping("/")
  public String getAll(Model model) {
    ArrayList<Thing> things = thingRepository.findAll();
    model.addAttribute("things", things);
    return "index";
  }

  @GetMapping("/delete/{id}")
  public String delete(Model model, @PathVariable("id") int id) {
    thingRepository.deleteById(id);
    return "redirect:/";
  }

  @GetMapping("/add")
  public String addThing(Model model) {
    model.addAttribute("thing", new Thing());
    return "add-thing";
  }

  @PostMapping("/add")
  public String saveNewThing(@ModelAttribute Thing thing, Model model) {
    System.out.println(thing);
    thingRepository.save(thing);
    return "redirect:/";
  }
}