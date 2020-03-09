package com.dclup.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class UserVo {
    @ApiModelProperty(value ="用户id",name="userId",dataType="Long",required = false,example = "1")
    private Long userId;
    @ApiModelProperty(value ="姓名",name="userName",dataType="String",required = false,example = "王五")
    private String userName;
    @ApiModelProperty(value ="电话",name="phoneNumber",dataType="String",required = false,example = "199-1234-5678")
    private String phoneNumber;
    @ApiModelProperty(value ="地址",name="phoneNumber",dataType="String",required = false,example = "中国")
    private String address;
}
