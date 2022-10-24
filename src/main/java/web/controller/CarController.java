package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import web.service.CarService;

import javax.servlet.http.HttpServletRequest;

@Controller
public class CarController {

    @Autowired
    CarService carService;

//    @GetMapping("/cars")
//    public String showCars(HttpServletRequest request, Model model) {
//        String countParam = request.getParameter("count");
//        List<Car> ourCarList = new ArrayList<>();
//        if(countParam==null) {
//            ourCarList = carService.getCarList();
//        } else if(Integer.parseInt(countParam) < 5) {
//            for (int i = 0; i < Integer.parseInt(countParam); i++) {
//                ourCarList.add(carService.getCarList().get(i));
//            }
//        } else {
//            ourCarList = carService.getCarList();
//        }
//        model.addAttribute("ourCars", ourCarList);
//        return "cars";
//    }

    @GetMapping("/cars")
    public String showCars(HttpServletRequest request, Model model) {
        String countParam = request.getParameter("count");
        model.addAttribute("ourCars", carService.getCarList(countParam));
        return "cars";
    }
}
