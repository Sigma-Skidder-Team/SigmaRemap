// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.InputStream;
import java.net.URL;

public class Class7377 implements Class7378
{
    private static String[] field28432;
    
    @Override
    public URL method22652(final String s) {
        return Class8834.class.getClassLoader().getResource(s.replace('\\', '/'));
    }
    
    @Override
    public InputStream method22653(final String s) {
        return Class8834.class.getClassLoader().getResourceAsStream(s.replace('\\', '/'));
    }
}
