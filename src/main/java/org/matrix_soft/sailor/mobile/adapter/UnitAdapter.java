package org.matrix_soft.sailor.mobile.adapter;

import org.matrix_soft.sailor.core.entity.Unit;
import org.matrix_soft.sailor.soap.units.UnitSet;

import java.util.List;

/**
 * Created by Matrix on 24.11.2014.
 */
public interface UnitAdapter {
    public List<Unit> adaptUnits(List<UnitSet> unitSet);

}
