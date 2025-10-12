package com.alquiler_service.alquiler.domain.shared;

public interface PasswordEncoderPort {
    String encode (String raw);
    boolean matches (String raw, String encoded);
}
