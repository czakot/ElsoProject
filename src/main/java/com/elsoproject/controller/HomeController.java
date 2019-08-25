package com.elsoproject.controller;

import com.elsoproject.domain.Story;
import java.util.ArrayList;
import java.util.Date;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

  @RequestMapping("/")
  public String stories(Model model) {
    model.addAttribute("pageTitle", "Minden napra egy sztori...");
    model.addAttribute("stories", getStories());
    return "stories.html";
  }
  
  private ArrayList<Story> getStories() {
    ArrayList<Story> stories = new ArrayList<>();
    
    Story story1 = new Story();
    story1.setTitle("Első sztorim");
    story1.setPosted(new Date());
    story1.setAuthor("Krisz");
    story1.setContent("<p>Na ez már éles adat.</p>");
    
    Story story2 = new Story();
    story2.setTitle("Második sztorim");
    story2.setPosted(new Date());
    story2.setAuthor("Gyula");
    story2.setContent("<p>Gyula sztorija nem érdekel senkit.</p>");
    
    stories.add(story1);
    stories.add(story2);
    
    return stories;
  }
}
