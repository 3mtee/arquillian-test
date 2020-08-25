package org.painsomnia;

import com.atlassian.plugin.spring.scanner.annotation.imports.ComponentImport;
import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.Archive;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.painsomnia.api.MyPluginComponent;

import javax.inject.Inject;

@RunWith(Arquillian.class)
public class ArquillianTest {
    @ComponentImport
    @Inject
    public MyPluginComponent component;

    @Deployment
    public static Archive<?> deployTests() {
        return ShrinkWrap.create(JavaArchive.class, "tests.jar");
    }

    @Test
    public void componentShouldWork() {
        Assert.assertNotNull(component.getName());
    }
}
