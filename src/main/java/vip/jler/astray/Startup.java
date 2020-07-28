package vip.jler.astray;

import io.quarkus.runtime.StartupEvent;
import vip.jler.astray.bean.Role;
import vip.jler.astray.bean.UserInfo;

import javax.enterprise.event.Observes;
import javax.inject.Singleton;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;


@Singleton
public class Startup {
//  @Transactional
//  public void loadRoles(@Observes StartupEvent evt) {
//    Role.deleteAll();
//    Role.add("public");
//    Role.add("admin");
//  }
  @Transactional
  public void loadUsers(@Observes StartupEvent evt) {
    UserInfo.deleteAll();
    Role r1 = new Role("admin");
    Role r2 = new Role("public");
    List<Role> roles1 = new ArrayList<>();
    roles1.add(r1);
    UserInfo.add("admin", "123", roles1);
    List<Role> roles2 = new ArrayList<>();
    roles2.add(r2);
    UserInfo.add("user", "123", roles2);
  }
}
