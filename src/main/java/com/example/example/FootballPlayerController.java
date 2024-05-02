package com.example.example;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/players")
public class FootballPlayerController {
    private DataBase dataBase = new DataBase();

    @GetMapping
    public String viewMainPage(Model model){
        model.addAttribute("players", dataBase.getFootballPlayers());
        return "main";
    }

    @PostMapping("/add")
    public String addPlayer(@RequestParam String name,
                            @RequestParam String team,
                            @RequestParam Integer age,
                            @RequestParam(required = false, defaultValue = "0") Integer coast){

        var newPlayer = new FootballPlayer(name, team, age, coast);
        dataBase.addFootballPlayer(newPlayer);
        return "redirect:/players";
    }
    @PostMapping("/delete")
    public String deletePlayer(@RequestParam String name){
        var playerName = dataBase.getFootballPlayers().stream()
                .filter(x->x.getName().equals(name)).findFirst().orElse(null);
        System.out.println(playerName);
        dataBase.deleteFootballPlayer(playerName);
        return "redirect:/players";
    }
}
