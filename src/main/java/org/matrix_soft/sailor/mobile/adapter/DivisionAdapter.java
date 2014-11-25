package org.matrix_soft.sailor.mobile.adapter;

import org.matrix_soft.sailor.core.entity.Division;

import java.util.List;

/**
 * Created by Matrix on 25.11.2014.
 */
public interface DivisionAdapter {
    public List<Division> adaptDivisions(List<org.matrix_soft.sailor.soap.firms.Division> soapDivisions);
}
