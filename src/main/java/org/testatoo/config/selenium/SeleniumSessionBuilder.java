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

package org.testatoo.config.selenium;

import com.thoughtworks.selenium.CommandProcessor;
import com.thoughtworks.selenium.Selenium;
import org.testatoo.config.ProviderBuilder;

public interface SeleniumSessionBuilder extends ProviderBuilder<Selenium> {

    SeleniumSessionBuilder serverHost(String host);

    SeleniumSessionBuilder serverPort(int port);

    SeleniumSessionBuilder website(String website);

    SeleniumSessionBuilder browser(String browser);

    SeleniumSessionBuilder from(CommandProcessor commandProcessor);
}
