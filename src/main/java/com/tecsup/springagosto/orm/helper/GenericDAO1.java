
package com.tecsup.springagosto.orm.helper;

import com.tecsup.springagosto.helper.*;
import java.util.List;

public interface GenericDAO1<T> {
    List<T> all();
    T find(Long id);
    void save(T t);
    void update(T t);
    void delete(Long id);
}
