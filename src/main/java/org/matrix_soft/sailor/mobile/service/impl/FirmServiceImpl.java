package org.matrix_soft.sailor.mobile.service.impl;

import org.matrix_soft.sailor.core.entity.Firm;
import org.matrix_soft.sailor.mobile.adapter.FirmAdapter;
import org.matrix_soft.sailor.mobile.service.FirmService;
import org.matrix_soft.sailor.soap.managers.FirmServiceManager;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.List;

/**
 * Created by Matrix on 25.11.2014.
 */
@Service
public class FirmServiceImpl implements FirmService {

    //TODO:
    private String password = "bjk1903@Sailor2014@!QwEhFkk";
    private String adminUsername = "LOGO";
    private String adminPassword = "LOGO";
    private int firmId = 1;

    @Inject
    private FirmServiceManager firmServiceManager;

    @Inject
    private FirmAdapter firmAdapter;

    @Override
    public List<Firm> getFirm() {
        List<org.matrix_soft.sailor.soap.firms.Firm> firms = firmServiceManager.getFirm(password, adminUsername, adminPassword, firmId);
        return firmAdapter.adaptFirms(firms);
    }

    @Override
    public List<Firm> getFirmList() {
        List<org.matrix_soft.sailor.soap.firms.Firm> firms = firmServiceManager.getFirmList(password, adminUsername, adminPassword);
        return firmAdapter.adaptFirms(firms);
    }


}
