/**
 *   Copyright 2015 Royce Remulla
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License. 
 */
package ph.rye.spring01;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import ph.rye.spring01.config.HelloConfig;


/**
 * Hello world!
 */
public final class App {


    private App() {}


    public static void main(final String[] args) {

        final AbstractApplicationContext appContext =
                new AnnotationConfigApplicationContext(HelloConfig.class);

        final HelloWorldBean hello = appContext.getBean(HelloWorldBean.class);
        hello.greet();

        appContext.close();
    }

}
