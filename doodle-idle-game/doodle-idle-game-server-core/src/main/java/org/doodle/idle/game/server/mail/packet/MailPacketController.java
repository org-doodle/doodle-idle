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
package org.doodle.idle.game.server.mail.packet;

import static org.doodle.idle.game.server.mail.packet.MailPacketCmd.DATA_REQUEST;

import org.doodle.boot.gsocket.messaging.GSocketRequester;
import org.doodle.design.messaging.PacketMapping;
import org.doodle.design.messaging.PacketMapping.Inbound;
import org.doodle.idle.excel.mail.MailExcelProperties;
import org.doodle.idle.game.server.bag.RoleBag;
import org.doodle.idle.game.server.login.RoleLogin;
import org.doodle.idle.game.server.mail.RoleMail;
import org.doodle.idle.game.server.payment.RolePayment;
import org.doodle.idle.game.server.role.RoleBase;
import org.doodle.idle.game.server.role.RoleRequester;
import org.doodle.idle.game.server.task.RoleTask;

public class MailPacketController<
        MailExcelPropertiesT extends MailExcelProperties,
        RoleMailT extends RoleMail,
        RoleRequesterT extends
            RoleRequester<
                    ? extends RoleBag,
                    RoleMailT,
                    ? extends RoleTask,
                    ? extends RoleLogin,
                    ? extends RolePayment,
                    ? extends RoleBase<? extends RoleLogin, ? extends RolePayment>>,
        MailDataRequestT extends MailDataRequest>
    extends org.doodle.design.mail.MailPacketController<
        MailExcelPropertiesT, RoleMailT, GSocketRequester> {

  public MailPacketController(MailExcelPropertiesT excel) {
    super(excel);
  }

  @PacketMapping(inbound = @Inbound(DATA_REQUEST))
  public void onDataRequest(RoleRequesterT role, MailDataRequestT request) {}
}
