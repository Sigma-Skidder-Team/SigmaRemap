// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1167 implements Runnable
{
    public final /* synthetic */ Class1621 field6331;
    
    public Class1167(final Class1621 field6331) {
        this.field6331 = field6331;
    }
    
    @Override
    public void run() {
        Class4967.method15073().fine(String.format("connect attempt timed out after %d", this.field6331.field9051));
        this.field6331.field9052.method12753();
        this.field6331.field9053.method15125();
        this.field6331.field9053.method14942("error", new Class2346("timeout"));
        Class4967.method15079(this.field6331.field9054, "connect_timeout", new Object[] { this.field6331.field9051 });
    }
}
