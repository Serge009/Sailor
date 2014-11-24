package org.matrix_soft.sailor.mobile.adapter.impl;

import org.matrix_soft.sailor.core.entity.Unit;
import org.matrix_soft.sailor.core.entity.UnitDetail;
import org.matrix_soft.sailor.mobile.adapter.UnitAdapter;
import org.matrix_soft.sailor.soap.units.UnitSet;
import org.matrix_soft.sailor.soap.units.UnitSetLine;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Matrix on 24.11.2014.
 */
@Service
public class UnitAdapterImpl implements UnitAdapter {
    @Override
    public List<Unit> adaptUnits(List<UnitSet> unitSet) {
        ArrayList<Unit> units = new ArrayList<>();

        for (UnitSet set : unitSet) {
            Unit unit = new Unit();

            unit.setName(set.getName());
            unit.setVersion(set.getVersion());

            for (UnitSetLine unitSetLine : set.getUnitSetLineList().getUnitSetLine()) {
                unit.addUnitDetail(adaptUnitDetail(unitSetLine));
            }

            units.add(unit);
        }

        return units;
    }


    private UnitDetail adaptUnitDetail(UnitSetLine setLine) {
        UnitDetail unitDetail = new UnitDetail();
        unitDetail.setName(setLine.getName());
        unitDetail.setFrom(setLine.getConvFact1());
        unitDetail.setTo(setLine.getConvFact2());

        return unitDetail;
    }

}
