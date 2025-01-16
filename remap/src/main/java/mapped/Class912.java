// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class912 extends Thread
{
    public final /* synthetic */ int field4871;
    public final /* synthetic */ Class5073 field4872;
    
    public Class912(final Class5073 field4872, final String name, final int field4873) {
        this.field4872 = field4872;
        this.field4871 = field4873;
        super(name);
    }
    
    @Override
    public void run() {
        try {
            RealmsClient.func_224911_a().method35475(Class5073.method15664(this.field4872).method15535().get(this.field4871).field3604.field28703);
            Realms.method25361(() -> {
                final Object field4871 = this.field4871;
                Class5073.method15671(this.field4872, n);
            });
        }
        catch (final RealmsServiceException class2330) {
            Class5073.method15662().error("Couldn't accept invite");
        }
    }
}
