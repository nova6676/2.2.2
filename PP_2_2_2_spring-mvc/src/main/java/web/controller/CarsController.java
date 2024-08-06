package web.controller;
import CarServis.CarServis;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/cars")
public class CarsController {
    private  CarServis carServis;

    public CarsController(CarServis carServis) {
        this.carServis = carServis;
    }
    @GetMapping("/cars")
    public String getCars(@RequestParam(value = "count",defaultValue = "5") int count, Model model) {
        model.addAttribute("cars",carServis.getCars(count));
        return "cars";
    }
}
