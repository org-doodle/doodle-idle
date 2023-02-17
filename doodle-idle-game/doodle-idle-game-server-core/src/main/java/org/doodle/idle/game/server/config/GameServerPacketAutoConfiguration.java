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
package org.doodle.idle.game.server.config;

import org.doodle.idle.game.server.login.packet.DefaultLoginPacketController;
import org.doodle.idle.game.server.mail.packet.DefaultMailPacketController;
import org.doodle.idle.game.server.pay.packet.DefaultPaymentPacketController;
import org.doodle.idle.game.server.rank.packet.DefaultRankPacketController;
import org.doodle.idle.game.server.role.packet.DefaultRolePacketController;
import org.doodle.idle.game.server.task.packet.DefaultTaskPacketController;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;

@AutoConfiguration
public class GameServerPacketAutoConfiguration {
  @Bean
  @ConditionalOnMissingBean
  public DefaultLoginPacketController bagPacketController() {
    return new DefaultLoginPacketController();
  }

  @Bean
  @ConditionalOnMissingBean
  public DefaultLoginPacketController loginPacketController() {
    return new DefaultLoginPacketController();
  }

  @Bean
  @ConditionalOnMissingBean
  public DefaultMailPacketController mailPacketController() {
    return new DefaultMailPacketController();
  }

  @Bean
  @ConditionalOnMissingBean
  public DefaultPaymentPacketController paymentPacketController() {
    return new DefaultPaymentPacketController();
  }

  @Bean
  @ConditionalOnMissingBean
  public DefaultRankPacketController rankPacketController() {
    return new DefaultRankPacketController();
  }

  @Bean
  @ConditionalOnMissingBean
  public DefaultRolePacketController rolePacketController() {
    return new DefaultRolePacketController();
  }

  @Bean
  @ConditionalOnMissingBean
  public DefaultTaskPacketController taskPacketController() {
    return new DefaultTaskPacketController();
  }
}
