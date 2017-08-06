/*
 * Copyright 2017 Futeh Kao
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

package net.e6tech.elements.common.inject.spi;

/**
 * Created by futeh.
 */
class Binding {
    private Class implementation;
    private Object value;

    public Binding() {
    }

    public Binding(Object value) {
        this.value = value;
    }

    public Binding(Class implementation) {
        this.implementation = implementation;
    }

    public Binding(Binding binding) {
        this.implementation = binding.implementation;
        this.value = binding.value;
    }

    public boolean isSingleton() {
        return implementation == null; // value can be null
    }

    public Class getImplementation() {
        return implementation;
    }

    public Object getValue() {
        return value;
    }
}
