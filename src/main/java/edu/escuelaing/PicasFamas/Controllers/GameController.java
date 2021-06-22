package edu.escuelaing.PicasFamas.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import edu.escuelaing.PicasFamas.Game.*;

@Controller
@SessionAttributes("game")
public class GameController {
    private PicasYFamasGame gameModel;

    @GetMapping("/")
    public String getIndex(Model model){
        gameModel= new PicasYFamasGame();
        model.addAttribute("game", gameModel);
        return "index";
    }

    /**
     * updates the page with the information of the game state 
     * @param model
     * @return 
     */
    @GetMapping("/MyGame")
    public String  gameInfo(Model model){
        if (!gameModel.isWinState()){
            gameModel.checkNumber();
        }
        System.out.println("Random number : " + gameModel.getNumber());
        System.out.println("picas: " + gameModel.getPicas());
        System.out.println("famas: " + gameModel.getFamas());
        System.out.println("winstate: " + gameModel.isWinState());
        System.out.println("trynumber: " + gameModel.getTryNumber());
        
        model.addAttribute("famas",gameModel.getFamas());
        model.addAttribute("picas",gameModel.getPicas());
        model.addAttribute("game", gameModel);
        model.addAttribute("tryNumber", gameModel.getTryNumber());
        return "MyGame";
    }

    /**
     * get the information from the server
     * @param value
     * @return
     */
    @PostMapping("/MyGame")
    public String play(@RequestParam(value= "attempt",defaultValue = "0000") String attempt){
        gameModel.setTryNumber(attempt);
        return "redirect:MyGame";
    }
}
