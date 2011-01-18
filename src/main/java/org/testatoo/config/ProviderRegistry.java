/**
 * Copyright (C) 2008 Ovea <dev@testatoo.org>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.testatoo.config;

public interface ProviderRegistry<T, E> {

    /**
     * Register in Testatoo an exetrnal built implementation.
     * It will be managed (started, stopped, ...) by Testatoo.
     *
     * @param instance The object instance to register. I.e. Selenium Server, Selenium Session, WebDriver, ...
     * @return this
     */
    E register(T instance);

    /**
     * Register in Testatoo an implementation provider.
     * It will be managed (started, stopped, ...) by Testatoo.
     * <p/>
     * {@link org.testatoo.config.Provider} are usually created by builders with the create...() methods
     * in Tesatoo module configuration. But you can provide you own implementation if you need.
     *
     * @param provider A {@link org.testatoo.config.Provider} which will return the implementation when called
     * @return this
     */
    E register(Provider<T> provider);

}
