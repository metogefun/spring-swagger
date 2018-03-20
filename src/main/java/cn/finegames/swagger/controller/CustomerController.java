package cn.finegames.swagger.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

/**
 * TODO
 *
 * @author wang zhaohui
 * @since 1.0.0
 */
@RestController
@Api("Customer API")
public final class CustomerController {

    @ApiOperation(value = "添加Customer")
    @ApiImplicitParam(name = "customerId", value = "Customer's id", required = true, dataTypeClass = Long.class)
    @PostMapping("/customers")
    public String addCustomer(Long customerId) {
        return "添加 " + customerId + " 成功";
    }

    @ApiOperation(value = "获取Customer")
    @ApiImplicitParam(name = "customerId", value = "Customer's id", paramType = "path", required = true, dataTypeClass = Long.class)
    @GetMapping("/customers/{customerId}")
    public Long getCustomer(@PathVariable Long customerId) {
        return customerId;
    }


    @ApiOperation(value = "修改Customer")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "customerId", value = "Customer's id", required = true, dataTypeClass = Long.class),
            @ApiImplicitParam(name = "phone", value = "客户手机号", required = true, dataTypeClass = String.class)
    })
    @PutMapping("/customers/{customerId}")
    public String modifyCustomer(@PathVariable Long customerId, String phone) {
        return "修改" + customerId + "手机号: " + phone;
    }

    @ApiOperation(value = "删除客户")
    @DeleteMapping("/customers/{customerId}")
    public String deleteCustomer(@PathVariable Long customerId) {
        return "删除用户: " + customerId;
    }
}
