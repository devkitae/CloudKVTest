package ktds.cloud.cloudkvtest.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Created By Cheetah on 2025-06-18.
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Builder
@ToString
public class AccessInfo {

    private String ip;
    private String os;
    private String browser;
    private String device;

}
