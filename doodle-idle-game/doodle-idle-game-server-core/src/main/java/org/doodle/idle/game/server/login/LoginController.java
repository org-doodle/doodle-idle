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
package org.doodle.idle.game.server.login;

import static org.doodle.idle.game.server.PacketGroups.LOGIN;
import static org.doodle.idle.game.server.login.LoginPackets.LOGIN_REQUEST;
import static org.doodle.idle.game.server.login.LoginPackets.LOGIN_RESPONSE;

import org.doodle.design.messaging.PacketMapping;
import org.doodle.design.messaging.PacketMapping.Inbound;
import org.doodle.design.messaging.PacketMapping.Outbound;
import org.doodle.design.messaging.PacketMapping.Protocol;
import org.doodle.design.messaging.PacketRequester;
import org.doodle.idle.game.server.login.LoginPackets.LoginRequest;
import org.doodle.idle.game.server.login.LoginPackets.LoginResponse;
import org.doodle.idle.game.server.role.RoleRequester;
import org.springframework.stereotype.Controller;

@PacketMapping(inbound = @Inbound(LOGIN))
@Controller
public class LoginController<RoleRequesterT extends RoleRequester> {

  @PacketMapping(
      inbound = @Inbound(value = LOGIN_REQUEST, target = LoginRequest.class),
      outbound =
          @Outbound(targets = @Protocol(value = LOGIN_RESPONSE, target = LoginResponse.class)))
  public void onLogin(PacketRequester requester, LoginRequest request) {}
}
