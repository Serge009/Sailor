package org.matrix_soft.sailor.mobile.adapter;

import org.matrix_soft.sailor.core.entity.Firm;

import java.util.List;

/**
 * Created by Matrix on 25.11.2014.
 */
public interface FirmAdapter {
    public List<Firm> adaptFirms(List<org.matrix_soft.sailor.soap.firms.Firm> soapFirms);
}
