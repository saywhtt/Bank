package org.sberbank.simonov.bank.repository;

import org.sberbank.simonov.bank.model.User;

import java.util.List;

public interface UserRepository {

    String INSERT = "INSERT INTO user(login, password, full_name, role, user_type) VALUES (?, ?, ?, ?, ?)";
    String UPDATE = "UPDATE user SET login = ?, password = ?, full_name = ?, role = ? , user_type = ? WHERE id = ?";
    String GET_BY_ID = "SELECT id, login, password, full_name, role, user_type FROM user WHERE id = ?";
    String GET_ALL_COUNTERPARTIES = "SELECT id, login, password, full_name, role, user_type FROM user WHERE id <> ?";

    boolean save(User user);

    List<User> getAllCounterparties(int currentUserId);

    User getById(int id);
}