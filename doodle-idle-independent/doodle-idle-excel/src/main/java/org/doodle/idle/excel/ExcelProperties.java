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
package org.doodle.idle.excel;

import java.util.Objects;
import org.doodle.idle.excel.bag.BagExcelProperties;
import org.doodle.idle.excel.login.LoginExcelProperties;
import org.doodle.idle.excel.mail.MailExcelProperties;
import org.doodle.idle.excel.payment.PaymentExcelProperties;
import org.doodle.idle.excel.rank.RankExcelProperties;
import org.doodle.idle.excel.role.RoleExcelProperties;
import org.doodle.idle.excel.task.TaskExcelProperties;

public abstract class ExcelProperties<
    BagExcelPropertiesT extends BagExcelProperties,
    LoginExcelPropertiesT extends LoginExcelProperties,
    MailExcelPropertiesT extends MailExcelProperties,
    PaymentExcelPropertiesT extends PaymentExcelProperties,
    RankExcelPropertiesT extends RankExcelProperties,
    RoleExcelPropertiesT extends RoleExcelProperties,
    TaskExcelPropertiesT extends TaskExcelProperties> {

  protected final BagExcelPropertiesT bag;
  protected final LoginExcelPropertiesT login;
  protected final MailExcelPropertiesT mail;
  protected final PaymentExcelPropertiesT payment;
  protected final RankExcelPropertiesT rank;
  protected final RoleExcelPropertiesT role;
  protected final TaskExcelPropertiesT task;

  public ExcelProperties(
      BagExcelPropertiesT bag,
      LoginExcelPropertiesT login,
      MailExcelPropertiesT mail,
      PaymentExcelPropertiesT payment,
      RankExcelPropertiesT rank,
      RoleExcelPropertiesT role,
      TaskExcelPropertiesT task) {
    this.bag = Objects.requireNonNull(bag);
    this.login = Objects.requireNonNull(login);
    this.mail = Objects.requireNonNull(mail);
    this.payment = Objects.requireNonNull(payment);
    this.rank = Objects.requireNonNull(rank);
    this.role = Objects.requireNonNull(role);
    this.task = Objects.requireNonNull(task);
  }

  public BagExcelPropertiesT bag() {
    return this.bag;
  }

  public LoginExcelPropertiesT login() {
    return this.login;
  }

  public MailExcelPropertiesT mail() {
    return this.mail;
  }

  public PaymentExcelPropertiesT payment() {
    return this.payment;
  }

  public RankExcelPropertiesT rank() {
    return this.rank;
  }

  public RoleExcelPropertiesT role() {
    return this.role;
  }

  public TaskExcelPropertiesT task() {
    return this.task;
  }
}
