// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public class Class2348 extends IOException
{
    private static String[] field14132;
    private final boolean field14133;
    
    public Class2348(final String s) {
        this(s, false);
    }
    
    public Class2348(final String message, final boolean field14133) {
        super(message);
        this.field14133 = field14133;
    }
    
    public Class2348(final Throwable cause) {
        super(cause);
        this.field14133 = false;
    }
    
    public boolean method9491() {
        return this.field14133;
    }
}
