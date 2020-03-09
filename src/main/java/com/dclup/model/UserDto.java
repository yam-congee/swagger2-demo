package com.dclup.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(description = "User接收数据对象")
public class UserDto {
    @ApiModelProperty(value ="用户id",name="userId",dataType="Long",required = false,example = "1",hidden = true )
    private Long userId;
    @ApiModelProperty(value ="用户密码",name="password",dataType="String",required = false,example = "123456" )
    private Long password;
}
