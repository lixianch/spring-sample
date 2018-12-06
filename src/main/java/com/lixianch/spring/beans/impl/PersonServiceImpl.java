package com.lixianch.spring.beans.impl;

import com.lixianch.spring.beans.PersonService;

/**
 * Created by lixianch on 2018/12/6.
 */
public class PersonServiceImpl implements PersonService {
    @Override
    public String getName() {
        return "lixianch";
    }
}
