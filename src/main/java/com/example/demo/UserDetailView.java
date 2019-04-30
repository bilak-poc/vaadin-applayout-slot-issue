package com.example.demo;

import static com.example.demo.UserConstants.USERS_VIEW;

import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.router.BeforeEvent;
import com.vaadin.flow.router.HasUrlParameter;
import com.vaadin.flow.router.Route;


@Route(value = USERS_VIEW)
public class UserDetailView extends HorizontalLayout implements HasUrlParameter<String> {


    @Override
    public void setParameter(BeforeEvent event, String parameter) {

    }
}
