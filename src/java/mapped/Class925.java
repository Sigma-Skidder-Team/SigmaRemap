// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class925 extends Thread
{
    public final /* synthetic */ int field4907;
    public final /* synthetic */ Class5073 field4908;
    
    public Class925(final Class5073 field4908, final String name, final int field4909) {
        this.field4908 = field4908;
        this.field4907 = field4909;
        super(name);
    }
    
    @Override
    public void run() {
        try {
            Class9513.method35444().method35478(Class5073.method15664(this.field4908).method15535().get(this.field4907).field3604.field28703);
            Class7847.method25361(() -> {
                final Object field4907 = this.field4907;
                Class5073.method15671(this.field4908, n);
            });
        }
        catch (final Class2330 class2330) {
            Class5073.method15662().error("Couldn't reject invite");
        }
    }
}
