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

import java.util.Objects;
import org.doodle.idle.excel.DefaultExcelProperties;
import org.doodle.idle.excel.bag.DefaultBagExcelProperties;
import org.doodle.idle.excel.login.DefaultLoginExcelProperties;
import org.doodle.idle.excel.mail.DefaultMailExcelProperties;
import org.doodle.idle.excel.payment.DefaultPaymentExcelProperties;
import org.doodle.idle.excel.rank.DefaultRankExcelProperties;
import org.doodle.idle.excel.role.DefaultRoleExcelProperties;
import org.doodle.idle.excel.task.DefaultTaskExcelProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

@SuppressWarnings("unused")
@AutoConfiguration
@EnableConfigurationProperties(DefaultExcelProperties.class)
public class GameServerExcelAutoConfiguration {

  private final DefaultExcelProperties excelProperties;

  @Autowired
  public GameServerExcelAutoConfiguration(DefaultExcelProperties excelProperties) {
    this.excelProperties = Objects.requireNonNull(excelProperties);
  }

  @Bean
  @ConditionalOnMissingBean
  public DefaultBagExcelProperties defaultBagExcelProperties() {
    return excelProperties.bag();
  }

  @Bean
  @ConditionalOnMissingBean
  public DefaultLoginExcelProperties defaultLoginExcelProperties() {
    return excelProperties.login();
  }

  @Bean
  @ConditionalOnMissingBean
  public DefaultMailExcelProperties defaultMailExcelProperties() {
    return excelProperties.mail();
  }

  @Bean
  @ConditionalOnMissingBean
  public DefaultPaymentExcelProperties defaultPaymentExcelProperties() {
    return excelProperties.payment();
  }

  @Bean
  @ConditionalOnMissingBean
  public DefaultRankExcelProperties defaultRankExcelProperties() {
    return excelProperties.rank();
  }

  @Bean
  @ConditionalOnMissingBean
  public DefaultRoleExcelProperties defaultRoleExcelProperties() {
    return excelProperties.role();
  }

  @Bean
  @ConditionalOnMissingBean
  public DefaultTaskExcelProperties defaultTaskExcelProperties() {
    return excelProperties.task();
  }
}
