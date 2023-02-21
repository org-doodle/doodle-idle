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

import org.doodle.idle.excel.bag.DefaultBagExcelProperties;
import org.doodle.idle.excel.login.DefaultLoginExcelProperties;
import org.doodle.idle.excel.mail.DefaultMailExcelProperties;
import org.doodle.idle.excel.payment.DefaultPaymentExcelProperties;
import org.doodle.idle.excel.rank.DefaultRankExcelProperties;
import org.doodle.idle.excel.role.DefaultRoleExcelProperties;
import org.doodle.idle.excel.task.DefaultTaskExcelProperties;
import org.doodle.idle.game.server.bag.packet.DefaultBagPacketController;
import org.doodle.idle.game.server.login.packet.DefaultLoginPacketController;
import org.doodle.idle.game.server.mail.packet.DefaultMailPacketController;
import org.doodle.idle.game.server.payment.packet.DefaultPaymentPacketController;
import org.doodle.idle.game.server.rank.packet.DefaultRankPacketController;
import org.doodle.idle.game.server.role.packet.DefaultRolePacketController;
import org.doodle.idle.game.server.task.packet.DefaultTaskPacketController;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;

@SuppressWarnings("unused")
@AutoConfiguration(after = GameServerExcelAutoConfiguration.class)
public class GameServerPacketAutoConfiguration {
  @Bean
  @ConditionalOnMissingBean
  public DefaultBagPacketController bagPacketController(
      DefaultBagExcelProperties bagExcelProperties) {
    return new DefaultBagPacketController(bagExcelProperties);
  }

  @Bean
  @ConditionalOnMissingBean
  public DefaultLoginPacketController loginPacketController(
      DefaultLoginExcelProperties loginExcelProperties) {
    return new DefaultLoginPacketController(loginExcelProperties);
  }

  @Bean
  @ConditionalOnMissingBean
  public DefaultMailPacketController mailPacketController(
      DefaultMailExcelProperties mailExcelProperties) {
    return new DefaultMailPacketController(mailExcelProperties);
  }

  @Bean
  @ConditionalOnMissingBean
  public DefaultPaymentPacketController paymentPacketController(
      DefaultPaymentExcelProperties paymentExcelProperties) {
    return new DefaultPaymentPacketController(paymentExcelProperties);
  }

  @Bean
  @ConditionalOnMissingBean
  public DefaultRankPacketController rankPacketController(
      DefaultRankExcelProperties rankExcelProperties) {
    return new DefaultRankPacketController(rankExcelProperties);
  }

  @Bean
  @ConditionalOnMissingBean
  public DefaultRolePacketController rolePacketController(
      DefaultRoleExcelProperties roleExcelProperties) {
    return new DefaultRolePacketController(roleExcelProperties);
  }

  @Bean
  @ConditionalOnMissingBean
  public DefaultTaskPacketController taskPacketController(
      DefaultTaskExcelProperties taskExcelProperties) {
    return new DefaultTaskPacketController(taskExcelProperties);
  }
}
