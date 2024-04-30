package travelservice.discountservice;

import java.util.List;

public interface DiscountService {
    List<Discount> getDiscounts();
    Discount getDiscountById(String id);
    Discount createDiscount(Discount discount);
    Discount updateDiscount(String id, Discount discount);
    void deleteDiscount(String id);
    double applyDiscount(double price, double discount);
}
