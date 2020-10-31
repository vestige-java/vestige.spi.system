/*
 * Copyright 2017 The Apache Software Foundation.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package fr.gaellalire.vestige.spi.system;

import java.io.InputStream;
import java.io.PrintStream;
import java.net.ContentHandlerFactory;
import java.net.ProxySelector;
import java.net.URLStreamHandler;
import java.net.URLStreamHandlerFactory;
import java.security.Policy;
import java.util.Properties;

/**
 * @author Gael Lalire
 */
public interface VestigeSystem {

    Properties getProperties();

    void setProperties(Properties properties);

    PrintStream getOut();

    void setOut(PrintStream out);

    PrintStream getErr();

    void setErr(PrintStream err);

    InputStream getIn();

    void setIn(InputStream in);

    /**
     * @since 1.1
     */
    URLStreamHandlerFactory getURLStreamHandlerFactory();

    void setURLStreamHandlerFactory(URLStreamHandlerFactory urlStreamHandlerFactory);

    void setURLStreamHandlerForProtocol(String protocol, URLStreamHandler urlStreamHandler);

    ContentHandlerFactory getURLConnectionContentHandlerFactory();

    void setURLConnectionContentHandlerFactory(ContentHandlerFactory contentHandlerFactory);

    ProxySelector getDefaultProxySelector();

    void setDefaultProxySelector(ProxySelector defaultProxySelector);

    void setWhiteListPolicy(Policy policy);

    Policy getWhiteListPolicy();

    void setPolicy(Policy policy);

    Policy getPolicy();

    void setSecurityManager(SecurityManager policy);

    SecurityManager getSecurityManager();

    VestigeSystem createSubSystem(String name);

    VestigeSystem setCurrentSystem();

    VestigeSystemCache pushVestigeSystemCache();

}
