// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1087 implements Runnable
{
    public final /* synthetic */ Class9057 field5869;
    
    private Class1087(final Class9057 field5869) {
        this.field5869 = field5869;
    }
    
    @Override
    public void run() {
        if (Class9057.method32607(this.field5869)) {
            this.method5606();
        }
    }
    
    private void method5606() {
        try {
            final Class9513 method35444 = Class9513.method35444();
            if (method35444 != null) {
                Class7439 method35445 = null;
                try {
                    method35445 = method35444.method35480();
                }
                catch (final Exception ex) {}
                final Class8907 method35446 = Class8584.method29061();
                if (method35445 != null) {
                    final String field28696 = method35445.field28696;
                    if (field28696 != null && !field28696.equals(method35446.field37448)) {
                        method35446.field37449 = true;
                        method35446.field37448 = field28696;
                        Class8584.method29062(method35446);
                    }
                }
                Class9057.method32615(this.field5869, method35446.field37449);
                Class9057.method32616(this.field5869, method35446.field37448);
                Class9057.method32609(this.field5869).put(Class2099.field12167, true);
            }
        }
        catch (final Exception ex2) {
            Class9057.method32610().error("Couldn't get unread news", (Throwable)ex2);
        }
    }
}
