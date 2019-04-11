/*
 * Copyright 2015-2019 Futeh Kao
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package net.e6tech.elements.network.cluster;

import akka.actor.Actor;
import net.e6tech.elements.common.util.SystemException;

import java.io.Serializable;
import java.lang.reflect.Method;

public class Invoker implements Serializable {
    private static final long serialVersionUID = -7148919144897051958L;

    public Object invoke(Actor actor, Object target, Method method, Object[] arguments) {
        try {
            return method.invoke(target, arguments);
        } catch (Exception e) {
            throw new SystemException(e);
        }
    }
}
