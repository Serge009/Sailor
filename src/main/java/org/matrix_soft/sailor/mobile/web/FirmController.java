package org.matrix_soft.sailor.mobile.web;

import org.matrix_soft.sailor.core.entity.Firm;
import org.matrix_soft.sailor.mobile.service.FirmService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;
import java.util.List;

/**
 * Created by Matrix on 25.11.2014.
 */
@RestController
public class FirmController {

    @Inject
    private FirmService firmService;

    @RequestMapping("/mobile/firms")
    public List<Firm> getFirmList() {
        return firmService.getFirmList();
    }
}
