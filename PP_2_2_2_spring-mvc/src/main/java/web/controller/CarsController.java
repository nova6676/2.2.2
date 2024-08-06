package web.controller;
import CarServis.CarInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CarsController {

    @Autowired
    private CarInterface carServis;

    @GetMapping("/cars")
    public String getCars(@RequestParam(value = "count",defaultValue = "5") int count, Model model) {
        model.addAttribute("cars",carServis.getCars(count));
        return "cars";
    }
}
