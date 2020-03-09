package com.dclup.controller;

import com.dclup.model.UserDto;
import com.dclup.model.UserVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/swagger")
@Api(tags = "用户的增删改查（这里是tags）")
public class SwaggerController {


    /**
     * 根据id获取一个用户信息
     * @param userId
     * @param response
     * @return
     */
    @GetMapping("/user/{userId}")
    @ApiOperation(value = "根据id获取一个用户信息",notes = "id必传")
    public UserVo getUserById(
            @PathVariable("userId") Long userId,
            HttpServletResponse response
    ){
        //模拟查询数据
        if(userId.equals(1L)){
            UserVo userVo = new UserVo();
            userVo.setUserId(1L);
            userVo.setUserName("赵四");
            userVo.setAddress("中国");
            userVo.setPhoneNumber("199-1234-5678");
            return userVo;
        }else {
            response.setStatus(404);
        }
        return null;
    }

    /**
     * 添加一个用户
     * @param userDto
     * @param response
     * @return
     */
    @PostMapping("/user")
    @ApiOperation(value = "添加一个用户",notes = "数据格式要对")
    public UserVo addUser(
            @RequestBody UserDto userDto,
            HttpServletResponse response
            ){
        UserVo userVo = new UserVo();
        userVo.setUserId(2L);
        userVo.setUserName("大侠");
        userVo.setAddress("中国");
        userVo.setPhoneNumber("199-9876-5432");
        return userVo;
    }
}
