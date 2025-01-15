// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public final class Class926 extends Thread
{
    private static String[] field4909;
    public final /* synthetic */ Class395 field4910;
    
    public Class926(final String name, final Class395 field4910) {
        this.field4910 = field4910;
        super(name);
    }
    
    @Override
    public void run() {
        this.field4910.method1456(true);
    }
}
