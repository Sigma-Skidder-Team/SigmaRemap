// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1180 implements Runnable
{
    public final /* synthetic */ Class4965 field6396;
    public final /* synthetic */ Class1189 field6397;
    
    public Class1180(final Class1189 field6397, final Class4965 field6398) {
        this.field6397 = field6397;
        this.field6396 = field6398;
    }
    
    @Override
    public void run() {
        Class4965.method15024().fine("paused");
        Class4965.method15025(this.field6396, Class2086.field12063);
        this.field6397.field6441.run();
    }
}
