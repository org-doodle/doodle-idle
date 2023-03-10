/*
 * Copyright (c) 2022-present Doodle. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.doodle.idle.game.server.role;

import lombok.Data;
import org.doodle.idle.game.server.login.RoleLogin;
import org.doodle.idle.game.server.payment.RolePayment;

@Data
public class RoleBase<RoleLoginT extends RoleLogin, RolePaymentT extends RolePayment>
    extends org.doodle.design.role.RoleBase<RoleLoginT, RolePaymentT> {
  protected RoleLoginT login;
  protected RolePaymentT payment;

  @Override
  public RoleLoginT login() {
    return this.login;
  }

  @Override
  public RolePaymentT payment() {
    return this.payment;
  }
}
