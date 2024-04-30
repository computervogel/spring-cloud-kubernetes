package travelservice.discountservice;

import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;

public class DiscountServiceImpl implements DiscountService {
    private final List<Discount> discounts = new ArrayList<>();

    @Override
    public List<Discount> getDiscounts() {
        return discounts;
    }

    @Override
    public Discount getDiscountById(String id) {
        for (Discount discount : discounts) {
            if (discount.getId().equals(id)) {
                return discount;
            }
        }
        return null;
    }

    @Override
    public Discount createDiscount(Discount discount) {
        discounts.add(discount);
        return discount;
    }

    @Override
    public Discount updateDiscount(String id, Discount discount) {
        for(int i = 0; i < discounts.size(); i++) {
            if(discounts.get(i).getId().equals(id)) {
                discounts.set(i, discount);
                return discount;
            }
        }
        return null;
    }

    @Override
    public void deleteDiscount(String id) {
        discounts.removeIf(discount -> discount.getId().equals(id));
    }

    @Override
    public double applyDiscount(double price, double discount) {
        return price - discount;
    }
}
