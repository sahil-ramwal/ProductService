package security;

import com.productservice.productservice.inheritancerelations.tablePerClass.User;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class JwtDto {
    private String email;
    private Long userId;
    private Date expiryAt;
    private Date createdAt;
    private List<Role> roles;

}
