package com.anjuxing.platform.authority.model;

import lombok.*;
import lombok.experimental.Tolerate;

/**
 * @author xiongt
 * @Description
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class SysLog extends BaseModel {


    private Integer type;

    private Integer targetId;


}
