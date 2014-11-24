package org.matrix_soft.sailor.mobile.web;

import org.matrix_soft.sailor.core.entity.Unit;
import org.matrix_soft.sailor.mobile.service.UnitService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;
import java.util.List;

/**
 * Created by Matrix on 24.11.2014.
 */
@RestController
public class UnitController {

    @Inject
    private UnitService service;

    @RequestMapping("/mobile/units")
    public List<Unit> getCustomersList() {
        return service.getUnits();
    }
}
