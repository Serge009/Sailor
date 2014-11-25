package org.matrix_soft.sailor.mobile.adapter;

import org.matrix_soft.sailor.core.entity.Period;

import java.util.List;

/**
 * Created by Matrix on 25.11.2014.
 */
public interface PeriodAdapter {
    public List<Period> adaptPeriods(List<org.matrix_soft.sailor.soap.firms.Period> soapPeriods);
}
