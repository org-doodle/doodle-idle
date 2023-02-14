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

import org.doodle.idle.game.server.bag.routing.DefaultBagRoutingController;
import org.doodle.idle.game.server.login.routing.DefaultLoginRoutingController;
import org.doodle.idle.game.server.mail.routing.DefaultMailRoutingController;
import org.doodle.idle.game.server.pay.routing.DefaultPaymentRoutingController;
import org.doodle.idle.game.server.rank.routing.DefaultRankRoutingController;
import org.doodle.idle.game.server.role.routing.DefaultRoleRoutingController;
import org.doodle.idle.game.server.task.routing.DefaultTaskRoutingController;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;

@AutoConfiguration
public class GameServerRoutingAutoConfiguration {

  @Bean
  @ConditionalOnMissingBean
  public DefaultBagRoutingController bagRoutingController() {
    return new DefaultBagRoutingController();
  }

  @Bean
  @ConditionalOnMissingBean
  public DefaultLoginRoutingController loginRoutingController() {
    return new DefaultLoginRoutingController();
  }

  @Bean
  @ConditionalOnMissingBean
  public DefaultMailRoutingController mailRoutingController() {
    return new DefaultMailRoutingController();
  }

  @Bean
  @ConditionalOnMissingBean
  public DefaultPaymentRoutingController paymentRoutingController() {
    return new DefaultPaymentRoutingController();
  }

  @Bean
  @ConditionalOnMissingBean
  public DefaultRankRoutingController rankRoutingController() {
    return new DefaultRankRoutingController();
  }

  @Bean
  @ConditionalOnMissingBean
  public DefaultRoleRoutingController roleRoutingController() {
    return new DefaultRoleRoutingController();
  }

  @Bean
  @ConditionalOnMissingBean
  public DefaultTaskRoutingController taskRoutingController() {
    return new DefaultTaskRoutingController();
  }
}
