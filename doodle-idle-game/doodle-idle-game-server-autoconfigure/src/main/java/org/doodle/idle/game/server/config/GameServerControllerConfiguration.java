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

import org.doodle.idle.game.server.bag.BagController;
import org.doodle.idle.game.server.login.LoginController;
import org.doodle.idle.game.server.mail.MailController;
import org.doodle.idle.game.server.rank.RankController;
import org.doodle.idle.game.server.role.RoleController;
import org.doodle.idle.game.server.role.RoleRequester;
import org.doodle.idle.game.server.task.TaskController;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;

@AutoConfiguration
public class GameServerControllerConfiguration {
  @Bean
  @ConditionalOnMissingBean
  public BagController<RoleRequester> bagController() {
    return new BagController();
  }

  @Bean
  @ConditionalOnMissingBean
  public LoginController<RoleRequester> loginController() {
    return new LoginController<>();
  }

  @Bean
  @ConditionalOnMissingBean
  public MailController<RoleRequester> mailController() {
    return new MailController<>();
  }

  @Bean
  @ConditionalOnMissingBean
  public RankController<RoleRequester> rankController() {
    return new RankController<>();
  }

  @Bean
  @ConditionalOnMissingBean
  public RoleController<RoleRequester> roleController() {
    return new RoleController<>();
  }

  @Bean
  @ConditionalOnMissingBean
  public TaskController<RoleRequester> taskController() {
    return new TaskController();
  }
}
