// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Map;

public class Class906 extends Thread
{
    private static String[] field4857;
    private final String field4858;
    private final Map field4859;
    private final byte[] field4860;
    private final Class8890 field4861;
    
    public Class906(final String field4858, final Map field4859, final byte[] field4860, final Class8890 field4861) {
        this.field4858 = field4858;
        this.field4859 = field4859;
        this.field4860 = field4860;
        this.field4861 = field4861;
    }
    
    @Override
    public void run() {
        try {
            Class8337.method27788(this.field4858, this.field4859, this.field4860);
            this.field4861.method31286(this.field4858, this.field4860, null);
        }
        catch (final Exception ex) {
            this.field4861.method31286(this.field4858, this.field4860, ex);
        }
    }
    
    public String method5405() {
        return this.field4858;
    }
    
    public byte[] method5406() {
        return this.field4860;
    }
    
    public Class8890 method5407() {
        return this.field4861;
    }
}
