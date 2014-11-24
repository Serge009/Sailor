package org.matrix_soft.sailor.soap.managers;

import org.matrix_soft.sailor.soap.units.UnitSet;
import org.matrix_soft.sailor.soap.units.UnitSetService;
import org.matrix_soft.sailor.soap.units.UnitSetServiceSoap;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

/**
 * Created by Matrix on 24.11.2014.
 */
@Service
public class UnitsServiceManager {

    private UnitSetServiceSoap unitSetServiceSoap;

    @PostConstruct
    private void init() {
        this.unitSetServiceSoap = new UnitSetService().getUnitSetServiceSoap();
    }

    public List<UnitSet> getUnits(String sessionId, long version) {
        return unitSetServiceSoap.getUnitSetList(sessionId, version).getUnitSetList().getUnitSet();
    }

}
