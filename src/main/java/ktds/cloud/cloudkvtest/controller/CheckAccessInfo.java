package ktds.cloud.cloudkvtest.controller;

import jakarta.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;
import ktds.cloud.cloudkvtest.entity.AccessInfo;
import ktds.cloud.cloudkvtest.service.CheckAccessInfoService;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created By Cheetah on 2025-06-18.
 */
@RestController
@RequiredArgsConstructor
public class CheckAccessInfo {

    private final CheckAccessInfoService checkAccessInfoService;

    @GetMapping("/accessinfo")
    public AccessInfo checkAccessInfo(HttpServletRequest request) throws Exception  {

        AccessInfo accessInfo = AccessInfo.builder()
            .ip(checkAccessInfoService.getIp(request))
            .os(checkAccessInfoService.getOs(request))
            .browser(checkAccessInfoService.getBrowser(request))
            .device(checkAccessInfoService.getDevice(request))
            .build();

        return accessInfo;
    }

}
