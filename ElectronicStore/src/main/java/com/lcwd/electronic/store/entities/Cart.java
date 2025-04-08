package com.lcwd.electronic.store.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "cart")
public class Cart {

    // kota card kontya user cha aahe all detail yein indirectly

    @Id
    private String cartId;
    private Date createdAt;
    @OneToOne
    private User user;
// mapping cart-item
    @OneToMany(mappedBy = "cart", cascade = CascadeType.ALL,fetch = FetchType.EAGER)
// EAGER ---> lagech data pahije asel tr
    private List<CarItem> items= new ArrayList<>();



}
