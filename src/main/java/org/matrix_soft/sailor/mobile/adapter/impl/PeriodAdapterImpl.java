package org.matrix_soft.sailor.mobile.adapter.impl;

import org.matrix_soft.sailor.core.entity.Period;
import org.matrix_soft.sailor.mobile.adapter.PeriodAdapter;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Matrix on 25.11.2014.
 */
@Service
public class PeriodAdapterImpl implements PeriodAdapter {
    @Override
    public List<Period> adaptPeriods(List<org.matrix_soft.sailor.soap.firms.Period> soapPeriods) {
        List<Period> periods = new ArrayList<>();

        for (org.matrix_soft.sailor.soap.firms.Period soapPeriod : soapPeriods) {
            Period period = new Period();

            period.setLogicalRef(soapPeriod.getLogicalRef());
            period.setNr(soapPeriod.getNr());
            period.setFirmNr(soapPeriod.getFirmNr());
            period.setActive(soapPeriod.isActive());
            period.setBegDate(soapPeriod.getBegDate());
            period.setEndDate(soapPeriod.getEndDate());

            periods.add(period);
        }

        return periods;
    }
}
