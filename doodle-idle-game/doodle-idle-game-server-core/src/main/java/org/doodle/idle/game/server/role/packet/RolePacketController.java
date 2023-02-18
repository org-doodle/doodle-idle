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
package org.doodle.idle.game.server.role.packet;

import static org.doodle.idle.game.server.role.packet.RolePacketCmd.CREATE_REQUEST;

import org.doodle.boot.gsocket.messaging.GSocketRequester;
import org.doodle.design.messaging.PacketMapping;
import org.doodle.design.messaging.PacketMapping.Inbound;
import org.doodle.idle.game.server.PacketController;
import org.doodle.idle.game.server.bag.RoleBag;
import org.doodle.idle.game.server.login.RoleLogin;
import org.doodle.idle.game.server.mail.RoleMail;
import org.doodle.idle.game.server.payment.RolePayment;
import org.doodle.idle.game.server.role.RoleBase;
import org.doodle.idle.game.server.role.RoleRequester;
import org.doodle.idle.game.server.task.RoleTask;

public class RolePacketController<
        RoleBagT extends RoleBag,
        RoleMailT extends RoleMail,
        RoleTaskT extends RoleTask,
        RoleLoginT extends RoleLogin,
        RolePaymentT extends RolePayment,
        RoleBaseT extends RoleBase<RoleLoginT, RolePaymentT>,
        RoleRequesterT extends
            RoleRequester<RoleBagT, RoleMailT, RoleTaskT, RoleLoginT, RolePaymentT, RoleBaseT>,
        RoleCreateRequestT extends RoleCreateRequest>
    extends org.doodle.design.role.RolePacketController<
        RoleLoginT, RolePaymentT, RoleBaseT, GSocketRequester, RoleRequesterT>
    implements PacketController<
        RoleBagT, RoleMailT, RoleTaskT, RoleLoginT, RolePaymentT, RoleBaseT, RoleRequesterT> {

  @PacketMapping(inbound = @Inbound(CREATE_REQUEST))
  public void onCreateRoleRequest(RoleRequesterT role, RoleCreateRequestT request) {}
}
