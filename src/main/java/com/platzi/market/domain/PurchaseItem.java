package com.platzi.market.domain;

import com.platzi.market.persistence.entity.ComprasProductoPK;

public class PurchaseItem {
    private int productId;

    private int quantity;

    private double total;

    private boolean active;

    public int getProductId() {
        return productId;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getTotal() {
        return total;
    }

    public boolean isActive() {
        return active;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
