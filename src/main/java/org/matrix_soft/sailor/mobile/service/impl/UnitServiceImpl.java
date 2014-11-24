package org.matrix_soft.sailor.mobile.service.impl;

import org.matrix_soft.sailor.core.entity.Unit;
import org.matrix_soft.sailor.mobile.adapter.UnitAdapter;
import org.matrix_soft.sailor.mobile.service.UnitService;
import org.matrix_soft.sailor.soap.managers.UnitsServiceManager;
import org.matrix_soft.sailor.soap.units.UnitSet;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.List;

/**
 * Created by Matrix on 24.11.2014.
 */
@Service
public class UnitServiceImpl implements UnitService {

    //TODO:
    private String sessionId = "992e2581-c9f6-4350-ad1e-f97104dfa3a9";

    @Inject
    private UnitsServiceManager unitsServiceManager;

    @Inject
    private UnitAdapter unitAdapter;

    @Override
    public List<Unit> getUnits() {
        List<UnitSet> units = unitsServiceManager.getUnits(sessionId, 0);
        return unitAdapter.adaptUnits(units);
    }
}
