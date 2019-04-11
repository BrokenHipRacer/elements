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

package net.e6tech.elements.network.cluster.catalyst.transform;

import net.e6tech.elements.network.cluster.catalyst.Reactor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class IntersectionTransform <T> extends Transform<T, T> {

    private Set<T> dataSet;

    public IntersectionTransform(Set<T> set) {
        dataSet = set;
    }

    @Override
    public Stream<T> transform(Reactor operator, Stream<T> stream) {
        List<T> intersection = new ArrayList<>();
        Iterator<T> iterator = stream.iterator();
        while (iterator.hasNext()) {
            T t = iterator.next();
            if (dataSet.contains(t)) {
                intersection.add(t);
            }
        }
        return intersection.stream();
    }
}
