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

import org.doodle.idle.game.server.bag.routing.BagRoutingController;
import org.doodle.idle.game.server.login.routing.LoginRoutingController;
import org.doodle.idle.game.server.mail.routing.MailRoutingController;
import org.doodle.idle.game.server.rank.routing.RankRoutingController;
import org.doodle.idle.game.server.role.routing.RoleRoutingController;
import org.doodle.idle.game.server.task.routing.TaskRoutingController;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;

@AutoConfiguration
public class GameServerRoutingAutoConfiguration {

  @Bean
  @ConditionalOnMissingBean
  public BagRoutingController bagRoutingController() {
    return new BagRoutingController();
  }

  @Bean
  @ConditionalOnMissingBean
  public LoginRoutingController loginRoutingController() {
    return new LoginRoutingController();
  }

  @Bean
  @ConditionalOnMissingBean
  public MailRoutingController mailRoutingController() {
    return new MailRoutingController();
  }

  @Bean
  @ConditionalOnMissingBean
  public RankRoutingController rankRoutingController() {
    return new RankRoutingController();
  }

  @Bean
  @ConditionalOnMissingBean
  public RoleRoutingController roleRoutingController() {
    return new RoleRoutingController();
  }

  @Bean
  @ConditionalOnMissingBean
  public TaskRoutingController taskRoutingController() {
    return new TaskRoutingController();
  }
}
