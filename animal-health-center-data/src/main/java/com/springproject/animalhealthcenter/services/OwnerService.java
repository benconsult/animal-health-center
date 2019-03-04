package com.springproject.animalhealthcenter.services;

import com.springproject.animalhealthcenter.model.Owner;



public interface OwnerService extends CrudService<Owner, Long> {
    Owner findByLastName(String lastName);


}
