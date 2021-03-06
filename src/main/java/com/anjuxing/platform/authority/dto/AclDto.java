package com.anjuxing.platform.authority.dto;

import com.anjuxing.platform.authority.model.SysAcl;
import lombok.*;
import lombok.experimental.Tolerate;
import org.springframework.beans.BeanUtils;

import java.security.acl.Acl;

/**
 * @author xiongt
 * @Description
 */
@Getter
@Setter
@ToString
public class AclDto extends SysAcl {


    // 是否要默认选中
    private boolean checked = false;

    // 是否有权限操作
    private boolean hasAcl = false;

    public static AclDto adapt(SysAcl sysAcl){
        AclDto aclDto = new AclDto();
        BeanUtils.copyProperties(sysAcl,aclDto);
        return aclDto;
    }
}
