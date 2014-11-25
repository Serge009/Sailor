package org.matrix_soft.sailor.soap.managers;

import org.matrix_soft.sailor.soap.firms.Firm;
import org.matrix_soft.sailor.soap.firms.FirmService;
import org.matrix_soft.sailor.soap.firms.FirmServiceSoap;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

/**
 * Created by Matrix on 25.11.2014.
 */
@Service
public class FirmServiceManager {

    private FirmServiceSoap firmServiceSoap;

    @PostConstruct
    private void init() {
        firmServiceSoap = new FirmService().getFirmServiceSoap();
    }

    public List<Firm> getFirm(String password, String adminUsername, String adminPassword, int firmId) {
        return firmServiceSoap.getFirm(password, adminUsername, adminPassword, firmId).getFirmList().getFirm();
    }

    public List<Firm> getFirmList(String password, String adminUsername, String adminPassword) {
        return firmServiceSoap.getFirmList(password, adminUsername, adminPassword).getFirmList().getFirm();
    }
}
