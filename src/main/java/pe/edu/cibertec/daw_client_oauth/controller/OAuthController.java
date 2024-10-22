package pe.edu.cibertec.daw_client_oauth.controller;


import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class OAuthController {
    @GetMapping("/public")
    public String publicApi(){
        return "Este es un Mensaje Público";
    }
    @GetMapping("/private")
    public String privateApi(){
        return "Este es un Mensaje Privado";
    }
    @GetMapping("/admin")
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public String adminApi() {
        return "Este es un Mensaje para Todos los Administradores";
    }
}
