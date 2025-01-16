// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1182 implements Runnable
{
    public final /* synthetic */ Class9057 field6405;
    
    private Class1182(final Class9057 field6405) {
        this.field6405 = field6405;
    }
    
    @Override
    public void run() {
        if (Class9057.method32607(this.field6405)) {
            this.method5616();
        }
    }
    
    private void method5616() {
        try {
            final RealmsClient method35444 = RealmsClient.func_224911_a();
            if (method35444 != null) {
                Class9057.method32614(this.field6405, method35444.method35482());
                Class9057.method32609(this.field6405).put(Class2099.field12165, true);
            }
        }
        catch (final Exception ex) {
            Class9057.method32610().error("Couldn't get trial availability", (Throwable)ex);
        }
    }
}
