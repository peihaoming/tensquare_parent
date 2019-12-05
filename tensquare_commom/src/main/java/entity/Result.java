package entity;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author phm
 * @Description: 返回类型
 * @date 2019/12/4 16:33
 */
@Data
@AllArgsConstructor
public class Result<T> {

    private Integer code;

    private String message;

    private Boolean flag;

    private T data;

    public Result(int code, String message, boolean flag ,T data) {
        this.code=code;
        this.message=message;
        this.flag=false;
        this.data=data;
    }

    public Result(int code, String message, boolean flag ) {
        this.code=code;
        this.message=message;
        this.flag=false;
    }
}
