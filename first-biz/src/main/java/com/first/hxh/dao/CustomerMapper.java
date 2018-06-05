package com.first.hxh.dao;

import com.first.hxh.entity.Customer;

public interface CustomerMapper {
    Customer selectByPrimaryKey(Long custId);
}