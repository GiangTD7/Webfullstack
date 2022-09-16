package tech.getarrays.employeemanager.security;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.List;

@Setter
@Getter
@Component
@AllArgsConstructor
@NoArgsConstructor
public class JwtRespone {
    String token;
    List<String> roles;
}
