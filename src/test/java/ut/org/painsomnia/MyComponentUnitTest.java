package ut.org.painsomnia;

import org.junit.Test;
import org.painsomnia.api.MyPluginComponent;
import org.painsomnia.impl.MyPluginComponentImpl;

import static org.junit.Assert.assertEquals;

public class MyComponentUnitTest
{
    @Test
    public void testMyName()
    {
        MyPluginComponent component = new MyPluginComponentImpl(null);
        assertEquals("names do not match!", "myComponent",component.getName());
    }
}