package com.server.repos;

import com.server.domain.User;
import com.server.domain.dto.UserDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepo extends JpaRepository<User, Long> {

    @Query("select new com.server.domain.dto.UserDto(u) " +
            "from User u " +
            "where u.username =:username")
    UserDto findDtoByUsername(String username);

    User findByUsername(String username);
}
