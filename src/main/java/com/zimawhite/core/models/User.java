package com.zimawhite.core.models;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Getter
@Setter
@Entity
//@Table(name = "users") todo: table users
@EqualsAndHashCode(callSuper = true)
public class User extends AbstractEntity implements Serializable {

    private static final long serialVersionUID = 1607443690519043430L;

    private String username;
    private String password;
}
