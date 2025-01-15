// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1608 implements Runnable
{
    public final /* synthetic */ Class4960 field8979;
    
    public Class1608(final Class4960 field8979) {
        this.field8979 = field8979;
    }
    
    @Override
    public void run() {
        if (!Class4960.method14964(this.field8979)) {
            Class4960.method14965(this.field8979);
            Class4960.method14966(this.field8979).method15054();
            if (Class1978.field10966 == Class4960.method14966(this.field8979).field21358) {
                Class4960.method14961(this.field8979);
            }
            this.field8979.method14942("connecting", new Object[0]);
        }
    }
}
