// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1170 implements Runnable
{
    public final /* synthetic */ Class4968 field6344;
    public final /* synthetic */ Class893 field6345;
    
    public Class1170(final Class893 field6345, final Class4968 field6346) {
        this.field6345 = field6345;
        this.field6344 = field6346;
    }
    
    @Override
    public void run() {
        this.field6344.method14942("error", new Class2347("No transports available"));
    }
}
