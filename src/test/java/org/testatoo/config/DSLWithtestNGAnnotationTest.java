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

import org.testatoo.config.annotation.TestatooModules;
import org.testatoo.config.testng.TestatooTestNGTest;
import org.testng.annotations.Test;

import static org.hamcrest.Matchers.is;
import static org.testatoo.core.ComponentFactory.*;

@TestatooModules(MyModule.class)
public final class DSLWithtestNGAnnotationTest extends TestatooTestNGTest {

    @Test
    public void test1() {
        System.out.println("==========> TEST1");
        page().open("/index.xhtml");
        assertThat(textfield("lang").value(), is("x"));
    }

    @Test
    public void test2() {
        System.out.println("==========> TEST2");
        page().open("/index.xhtml");
        assertThat(textfield("lang").value(), is("x"));
    }

    @Test
    public void test3() {
        throw new IllegalStateException("This test shoul be skipped by MethodInterceptor in module MyModule");
    }

}