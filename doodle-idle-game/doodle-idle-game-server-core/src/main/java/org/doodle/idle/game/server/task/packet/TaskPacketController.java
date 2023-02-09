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
package org.doodle.idle.game.server.task.packet;

import static org.doodle.idle.game.server.PacketGroup.TASK;
import static org.doodle.idle.game.server.task.packet.TaskPacketCmd.DATA_REQUEST;

import org.doodle.design.messaging.PacketMapping;
import org.doodle.design.messaging.PacketMapping.Inbound;
import org.doodle.idle.game.server.PacketController;
import org.doodle.idle.game.server.role.RoleRequester;

@PacketMapping(inbound = @Inbound(TASK))
public class TaskPacketController<
        RoleRequesterT extends RoleRequester, TaskDataRequestT extends TaskDataRequest>
    implements PacketController<RoleRequesterT> {

  @PacketMapping(inbound = @Inbound(DATA_REQUEST))
  public void onDataRequest(RoleRequesterT role, TaskDataRequestT request) {}
}
