// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1371 implements Runnable
{
    public final /* synthetic */ String field7529;
    public final /* synthetic */ Runnable field7530;
    public final /* synthetic */ Class4968 field7531;
    
    public Class1371(final Class4968 field7531, final String field7532, final Runnable field7533) {
        this.field7531 = field7531;
        this.field7529 = field7532;
        this.field7530 = field7533;
    }
    
    @Override
    public void run() {
        Class4968.method15151(this.field7531, "message", this.field7529, this.field7530);
    }
}
