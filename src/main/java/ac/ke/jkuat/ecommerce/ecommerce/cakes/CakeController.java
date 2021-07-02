package ac.ke.jkuat.ecommerce.ecommerce.cakes;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CakeController {
    
    @GetMapping("/cakes")
    public  ModelAndView cakes(Map<String, Object> model){

        List<Cake> cakes = List.of(new Cake(
            "Velvet Cake", 1200, "https://sugargeekshow.com/wp-content/uploads/2018/01/red-velvet-cake-featured.jpg"
        ),
        new Cake(  "Cheese cake",
                1200,
                "https://sugarspunrun.com/wp-content/uploads/2019/01/Best-Cheesecake-Recipe-2-1-of-1-4.jpg"
        ),
        new Cake(
            "Chocolate cake",
                1200,
                "https://cdn.sallysbakingaddiction.com/wp-content/uploads/2013/04/triple-chocolate-cake-4.jpg"
        )
        );
        model.put("cakes", cakes);

        return new ModelAndView("cakes", model);
    }

    @GetMapping("/aboutus")
    public String aboutus(Model model){
       
        return "aboutus";
    }

    @GetMapping("/contactus")
    public String contactus(Model model){
       
        return "contactus";
    }


   
}
