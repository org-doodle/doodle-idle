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
package org.doodle.idle.game.server.payment.packet;

import org.doodle.boot.gsocket.messaging.GSocketRequester;
import org.doodle.idle.game.server.bag.RoleBag;
import org.doodle.idle.game.server.login.RoleLogin;
import org.doodle.idle.game.server.mail.RoleMail;
import org.doodle.idle.game.server.payment.RolePayment;
import org.doodle.idle.game.server.role.RoleBase;
import org.doodle.idle.game.server.role.RoleRequester;
import org.doodle.idle.game.server.task.RoleTask;

public class PaymentPacketController<
        RolePaymentT extends RolePayment,
        RoleRequesterT extends
            RoleRequester<
                    ? extends RoleBag,
                    ? extends RoleMail,
                    ? extends RoleTask,
                    ? extends RoleLogin,
                    RolePaymentT,
                    ? extends RoleBase<? extends RoleLogin, RolePaymentT>>>
    extends org.doodle.design.role.payment.PaymentPacketController<
        RolePaymentT, GSocketRequester> {}
