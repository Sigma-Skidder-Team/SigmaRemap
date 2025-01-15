// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Map;

public class Class981 implements Runnable
{
    public final /* synthetic */ Map field5233;
    public final /* synthetic */ Class9344 field5234;
    
    public Class981(final Class9344 field5234, final Map field5235) {
        this.field5234 = field5234;
        this.field5233 = field5235;
    }
    
    @Override
    public void run() {
        this.field5234.field40118.method14942("responseHeaders", this.field5233);
        Class4964.method15009(this.field5234.field40118);
    }
}
