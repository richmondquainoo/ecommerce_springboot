package com.example.ecommerceproject.Promo;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PromoService {
    private final PromoRepository promoRepository;

    public List<Promo> getAllPromos(){
        return promoRepository.findAll();
    }

    public Promo savePromo(Promo promo){
        return promoRepository.save(promo);
    }
}
