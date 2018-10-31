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
@Builder
public class SysUserRole extends BaseModel{



    private Integer userId;

    private Integer roleId;

}
