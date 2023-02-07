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

import static org.doodle.idle.game.server.PacketGroups.ROLE;
import static org.doodle.idle.game.server.role.RolePackets.CREATE_REQUEST;
import static org.doodle.idle.game.server.role.RolePackets.CREATE_RESPONSE;
import static org.doodle.idle.game.server.role.RolePackets.GROUP;

import org.doodle.design.messaging.PacketMapping;
import org.doodle.design.messaging.PacketMapping.Inbound;
import org.doodle.design.messaging.PacketMapping.Outbound;
import org.doodle.design.messaging.PacketMapping.Protocol;
import org.doodle.idle.game.server.role.RolePackets.CreateRequest;
import org.doodle.idle.game.server.role.RolePackets.CreateResponse;
import org.springframework.stereotype.Controller;

@PacketMapping(inbound = @Inbound(ROLE))
@Controller
public class RoleController<RoleRequesterT extends RoleRequester> {

  @PacketMapping(
      inbound = @Inbound(value = CREATE_REQUEST, target = CreateRequest.class),
      outbound =
          @Outbound(targets = @Protocol(value = CREATE_RESPONSE, target = CreateResponse.class)))
  public void onCreateRole(RoleRequesterT role, CreateRequest request) {
    role.requester().route(GROUP, CREATE_RESPONSE).data(new CreateResponse()).send().subscribe();
  }
}
