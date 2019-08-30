package com.elsoproject.controller;

import com.elsoproject.domain.Story;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import javax.servlet.http.HttpServletRequest;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.MissingPathVariableException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

  @RequestMapping("/")
  public String stories(Model model, Locale locale) {
    model.addAttribute("pageTitle", "Minden napra egy sztori...");
    model.addAttribute("stories", getStories());
    System.out.println(String.format("Request received. Language: %s, Country: %s\n", locale.getLanguage(), locale.getDisplayCountry()));
    return "stories.html";
  }
  
  @RequestMapping({"/user/{id}", "/user/", "/user"})
  public String searchForUser(@PathVariable(value="id") String id, Model model) {
/*
    if (id == null) {
      System.out.println("/user/{id} and id = null"); // it seems never get here
      throw new Exception("Nincs ilyen ID-vel felhasználó");
    }
*/
    
    model.addAttribute("userid", id);
    return "user";
  }
/*  
  @RequestMapping({"/user/", "/user"})
  public String searchForUser(Model model) throws Exception {
    String id = null;
    if (id == null) {
      System.out.println("id = null");
      throw new Exception("Nincs ilyen ID-vel felhasználó");
    }
    
    model.addAttribute("userid", id);
    return "user";
  }
*/  
  @ExceptionHandler(MissingPathVariableException.class)
  @Order(Ordered.LOWEST_PRECEDENCE)
  public String exceptionHandler(HttpServletRequest request, Exception ex, Model model) {
    System.out.println("Exception Handler of HomeController");
    model.addAttribute("errMessage", "Nincs ilyen ID-jű felhasználó");
    return "exceptionHandlerOfHC";
  }
  
  private ArrayList<Story> getStories() {
    ArrayList<Story> stories = new ArrayList<>();
/*    
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
*/    
    return stories;
  }
}
