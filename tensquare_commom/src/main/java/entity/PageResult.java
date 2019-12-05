package entity;

import lombok.Data;

import java.util.List;

/**
 * @author phm
 * @Description:
 * @date 2019/12/4 17:10
 */
@Data
public class PageResult<T> {

    private Long total;

    private List<T> rows;

}
