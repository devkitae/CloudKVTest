package ktds.cloud.cloudkvtest.controller;

import jakarta.servlet.http.HttpServletRequest;
import ktds.cloud.cloudkvtest.service.CheckAccessInfoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created By Cheetah on 2025-06-18.
 */
@RestController
@RequiredArgsConstructor
public class CheckAccessInfo {
    private final CheckAccessInfoService checkAccessInfoService;

    @RequestMapping("/accessinfo")
    public String checkAccessInfo(HttpServletRequest request) throws Exception  {
        String ip = CheckAccessInfoService.getIp(request);

        return ip;
    }


}
