package org.launchcode.skillstracker.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping
@ResponseBody
public class SkillsController {

    @GetMapping
    public String greetPage(){
        return "<html>" +
                "<h1>Skills Tracker</h1>" +
                "<h2> We have a few skills we would like to learn. Here is the list!</h2>" +
                "<ol>" +
                "<li>JavaScript</li>" +
                "<li>Java</li>" +
                "<li>Python</li>" +
                "</ol>";
    }

    @GetMapping("form")
    public String greetQuestion(){

        return "<html>" +
                    "<body>" +
                        "<form action='favorite' method='POST'>" +
                            "<label>Name: " +
                            "<br><input type='text' name='name'>" +
                            "</label>" +
                            "<br><label>My favorite language: " +
                                "<br><select name='language1'>" +
                                 "<option value='Java'>Java</option>" +
                                    "<option value='JavaScript'>JavaScript</option>" +
                                    "<option value='Python'>Python</option>" +
                                "</select>" +
                            "</label>" +
                            "<br><label>My Second favorite language: " +
                                "<br><select name='languages2'>" +
                                    "<option value='Java'>Java</option>" +
                                    "<option value='JavaScript'>JavaScript</option>" +
                                    "<option value='Python'>Python</option>" +
                                "</select>" +
                            "</label>" +
                             "<br><label>My third favorite language: " +
                                "<br><select name='languages3'>" +
                                "<option value='Java'>Java</option>" +
                                "<option value='JavaScript'>JavaScript</option>" +
                                "<option value='Python'>Python</option>" +
                                "</select>" +
                             "</label>" +
                             "<br><input type='submit' value='submit'>" +
                            "</form>" +
                    "</body>" +
                "</html>";
    }

    @RequestMapping(method={RequestMethod.GET,RequestMethod.POST},value= "favorite")
    public String postFavorite(@RequestParam String name, @RequestParam String language1, @RequestParam String languages2, @RequestParam String languages3){
        return "<html>" +
                    "<h1>"+ name + "</h1>" +
                        "<body>" +
//                            "<ol>" +
//                                "<li>" +language1 + "</li>" +
//                                "<li>" +languages2+ "</li>" +
//                               "<li>" +languages3 + "</li>" +
//                             "</ol>"+
                        "<table border='1'>" +
                            "<tr>" +
                                "<td>Most favorte " + "</td>" +
                                 "<td> " + language1+ "</td>" +
                            "</tr>"+
                             "<tr>" +
                                "<td>second  favorte " + "</td>" +
                                 "<td> " + languages2+ "</td>" +
                             "</tr>"+
                             "<tr>" +
                                 "<td>third favorte " + "</td>" +
                                 "<td> " + languages3+ "</td>" +
                            "</tr>"+
                        "</table>" +
                     "</body>" +
                "</html>";
    }
}
