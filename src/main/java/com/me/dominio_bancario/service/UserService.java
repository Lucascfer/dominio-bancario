package com.me.dominio_bancario.service;

import com.me.dominio_bancario.domain.model.User;

public interface UserService {
    User findById(Long id);

    User create(User userToCreate);
}
