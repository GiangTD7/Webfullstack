//package tech.getarrays.employeemanager.controller;
//
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.context.SecurityContextHolder;
//import org.springframework.web.bind.annotation.*;
//import tech.getarrays.employeemanager.dto.UserDTO;
//import tech.getarrays.employeemanager.model.Permission;
//import tech.getarrays.employeemanager.model.Role;
//import tech.getarrays.employeemanager.model.User;
//import tech.getarrays.employeemanager.repo.UserRepo;
//import tech.getarrays.employeemanager.security.JwtRespone;
//import tech.getarrays.employeemanager.security.JwtTokenProvider;
//
//import java.util.ArrayList;
//import java.util.List;
//
//
//@RestController
//
//public class AuthController {
//
//
//    private AuthenticationManager authenticationManager;
//
//    private JwtTokenProvider jwtTokenProvider;
//
//    private UserRepo userRepository;
//
//    @PostMapping("/login")
//    public JwtRespone login(@RequestBody UserDTO userDTO) {
//        Authentication authentication = authenticationManager.authenticate(
//                new UsernamePasswordAuthenticationToken(userDTO.getUsername(), userDTO.getPassword()));
//        SecurityContextHolder.getContext().setAuthentication(authentication);
//
//        String jwt = jwtTokenProvider.generateToken(userDTO);
//        User user = userRepository.findByEmail(userDTO.getUsername());
//        List<Role> roles =  user.getRoles();
//        List<Permission> permissions = new ArrayList<>();
//        for (int i = 0; i < roles.size(); i++) {
//            for (int j = 0; j < roles.get(i).getPermissions().size(); j++) {
//                permissions.add(roles.get(i).getPermissions().get(j));
//            }
//        }
//        List<String> p = new ArrayList<>();
//        for (tech.getarrays.employeemanager.model.Permission permission : permissions) {
//            p.add(permission.getName());
//        }
//
//        JwtRespone jwtResponse = new JwtRespone();
//        jwtResponse.setRoles(p);
//        jwtResponse.setToken(jwt);
//        return jwtResponse;
//    }
//
//}
