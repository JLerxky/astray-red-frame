package vip.jler.astray.resource;

import io.quarkus.hibernate.orm.rest.data.panache.PanacheEntityResource;
import io.quarkus.rest.data.panache.ResourceProperties;
import vip.jler.astray.bean.UserInfo;

/**
 * @author jler
 */
@ResourceProperties(path = "user")
public interface UserInfoResource extends PanacheEntityResource<UserInfo, Long> {

}
