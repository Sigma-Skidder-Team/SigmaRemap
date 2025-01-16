// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1106 implements Runnable
{
    public final /* synthetic */ Class9057 field5972;
    
    private Class1106(final Class9057 field5972) {
        this.field5972 = field5972;
    }
    
    @Override
    public void run() {
        if (Class9057.method32607(this.field5972)) {
            this.method5609();
        }
    }
    
    private void method5609() {
        try {
            final RealmsClient method35444 = RealmsClient.func_224911_a();
            if (method35444 != null) {
                Class9057.method32608(this.field5972, method35444.method35450());
                Class9057.method32609(this.field5972).put(Class2099.field12166, true);
            }
        }
        catch (final Exception ex) {
            Class9057.method32610().error("Couldn't get live stats", (Throwable)ex);
        }
    }
}
