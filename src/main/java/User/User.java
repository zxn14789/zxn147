package User;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.*;
import java.io.Serializable;

public class User implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer id;

    @NotBlank(message = "用户名不能为空")
    private String username;

    @Length(min = 6,message = "密码长度大于6位")
    private String password;

    @NotNull(message = "年龄不能为空")
    @Range(min = 0,max = 100,message = "年龄必须在0-100之间")
    private Integer age;
}