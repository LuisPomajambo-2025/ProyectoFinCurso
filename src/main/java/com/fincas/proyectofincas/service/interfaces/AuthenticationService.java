package com.fincas.proyectofincas.service.interfaces;

import com.fincas.proyectofincas.dao.request.SignInRequest;
import com.fincas.proyectofincas.dao.request.SignUpRequest;
import com.fincas.proyectofincas.dao.response.JwtAuthenticationResponse;

public interface AuthenticationService {
    JwtAuthenticationResponse signup(SignUpRequest request);

    JwtAuthenticationResponse signin(SignInRequest request);

}
