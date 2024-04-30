package travelservice.discountservice;

import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/discount")
public class DiscountController {

    private final DiscountService discountService;

    public DiscountController(DiscountService discountService) {
        this.discountService = discountService;
    }

    @GetMapping
    public List<Discount> getAllDiscounts(){
        return discountService.getDiscounts();
    }

    @GetMapping("/{id}")
    public Discount getDiscountById(@PathVariable String id){
        return discountService.getDiscountById(id);
    }

    @PostMapping
    public Discount createDiscount(@RequestBody Discount discount){
        return discountService.createDiscount(discount);
    }

    @PutMapping("/{id}")
    public Discount updateDiscount(@PathVariable String id, @RequestBody Discount discount){
        return discountService.updateDiscount(id, discount);
    }

    @DeleteMapping("/{id}")
    public void deleteDiscount(@PathVariable String id){
        discountService.deleteDiscount(id);
    }
}
