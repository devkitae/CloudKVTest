package ktds.cloud.cloudkvtest.controller;

import jakarta.servlet.http.HttpServletRequest;
import ktds.cloud.cloudkvtest.service.CheckAccessInfoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created By Cheetah on 2025-06-18.
 */
@Controller
@RequiredArgsConstructor
public class AccessInfo {

    private final CheckAccessInfoService checkAccessInfoService;

    @GetMapping("/accessinfo")
    public String checkAccessInfo(HttpServletRequest request, Model model) throws Exception  {

        ktds.cloud.cloudkvtest.entity.AccessInfo accessInfo = ktds.cloud.cloudkvtest.entity.AccessInfo.builder()
            .ip(checkAccessInfoService.getIp(request))
            .os(checkAccessInfoService.getOs(request))
            .browser(checkAccessInfoService.getBrowser(request))
            .device(checkAccessInfoService.getDevice(request))
            .build();

        model.addAttribute("accessInfo", accessInfo);

        return "accessInfo";
    }

}
