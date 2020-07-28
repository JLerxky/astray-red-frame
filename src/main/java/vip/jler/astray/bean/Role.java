package vip.jler.astray.bean;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.quarkus.hibernate.orm.panache.PanacheEntity;
import io.quarkus.security.jpa.RolesValue;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "test_role")
public class Role extends PanacheEntity {

  @JsonIgnore
  @ManyToMany(mappedBy = "roles")
  public List<UserInfo> users;

  @RolesValue
  public String role;

  public static void add(String r) {
    Role role = new Role();
    role.role = r;
    role.persist();
  }

  public Role() {
  }

  public Role(String role) {
    this.role = role;
  }

  public Role(List<UserInfo> users, String role) {
    this.users = users;
    this.role = role;
  }

  public List<UserInfo> getUsers() {
    return users;
  }

  public void setUsers(List<UserInfo> users) {
    this.users = users;
  }

  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }
}
