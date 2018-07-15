package com.sdjtu.taotao.service;



import com.sdjtu.taotao.pojo.Product;
import com.sdjtu.taotao.pojo.PropertyValue;

import java.util.List;

public interface PropertyValueService {
    void init(Product p);
    void update(PropertyValue pv);

    PropertyValue get(int ptid, int pid);
    List<PropertyValue> list(int pid);
}

