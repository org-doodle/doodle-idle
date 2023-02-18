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

import org.doodle.idle.game.server.bag.DefaultRoleBag;
import org.doodle.idle.game.server.login.DefaultRoleLogin;
import org.doodle.idle.game.server.mail.DefaultRoleMail;
import org.doodle.idle.game.server.payment.DefaultRolePayment;
import org.doodle.idle.game.server.role.DefaultRoleBase;
import org.doodle.idle.game.server.role.DefaultRoleRequester;
import org.doodle.idle.game.server.task.DefaultRoleTask;

public class DefaultPaymentPacketController
    extends PaymentPacketController<
        DefaultRoleBag,
        DefaultRoleMail,
        DefaultRoleTask,
        DefaultRoleLogin,
        DefaultRolePayment,
        DefaultRoleBase,
        DefaultRoleRequester> {}
