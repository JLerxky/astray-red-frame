package vip.jler.astray.bean;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author jler
 */
@Entity
public class UserInfo extends PanacheEntityBase {

  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "userInfoSeq")
  Long id;
  String name;
  String username;
  String password;

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

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
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
}
