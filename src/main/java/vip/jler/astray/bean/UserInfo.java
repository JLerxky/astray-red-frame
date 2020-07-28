package vip.jler.astray.bean;

import io.quarkus.elytron.security.common.BcryptUtil;
import io.quarkus.hibernate.orm.panache.PanacheEntity;
import io.quarkus.security.jpa.Password;
import io.quarkus.security.jpa.Roles;
import io.quarkus.security.jpa.UserDefinition;
import io.quarkus.security.jpa.Username;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author jler
 */
@Entity
@Table(name = "test_user")
@UserDefinition
public class UserInfo extends PanacheEntity {

  String name;

  @Username
  String username;

  @Password
  String password;

  @ManyToMany(cascade = CascadeType.PERSIST)
  @Roles
  public List<Role> roles = new ArrayList<>();

  public static void add(String username, String password, List<Role> roles) {
    UserInfo user = new UserInfo();
    user.username = username;
    user.password = BcryptUtil.bcryptHash(password);
    user.roles = roles;
    user.persist();
  }

  public UserInfo() {
  }

  public UserInfo(Long id) {
    this.id = id;
  }

  public UserInfo(String name, String username, String password) {
    this.name = name;
    this.username = username;
    this.password = password;
  }

  public UserInfo(Long id, String name, String username, String password) {
    this.id = id;
    this.name = name;
    this.username = username;
    this.password = password;
  }

  public UserInfo(String name, String username, String password, List<Role> roles) {
    this.name = name;
    this.username = username;
    this.password = password;
    this.roles = roles;
  }

  public UserInfo(Long id, String name, String username, String password, List<Role> roles) {
    this.id = id;
    this.name = name;
    this.username = username;
    this.password = password;
    this.roles = roles;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public List<Role> getRoles() {
    return roles;
  }

  public void setRoles(List<Role> roles) {
    this.roles = roles;
  }
}
