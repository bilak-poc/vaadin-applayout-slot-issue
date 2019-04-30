package com.example.demo;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.HtmlImport;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouteAlias;
import com.vaadin.flow.templatemodel.TemplateModel;


@Tag("master-view")
@Route(value = "users", absolute = true)
@RouteAlias(value = "", layout = MainLayout.class)
@HtmlImport("view/user-master-view.html")
public class UserMasterView extends PolymerTemplate<TemplateModel> {


    @Id("textField")
    private TextField textField;

    public UserMasterView() {
        getElement().setAttribute("slot", "master-content");
    }
}
