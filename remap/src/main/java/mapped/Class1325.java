// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1325 implements Runnable
{
    public final /* synthetic */ Class9057 field7277;
    
    private Class1325(final Class9057 field7277) {
        this.field7277 = field7277;
    }
    
    @Override
    public void run() {
        if (Class9057.method32607(this.field7277)) {
            this.method5618();
        }
    }
    
    private void method5618() {
        try {
            final RealmsClient method35444 = RealmsClient.func_224911_a();
            if (method35444 != null) {
                Class9057.method32611(this.field7277, method35444.method35473());
                Class9057.method32609(this.field7277).put(Class2099.field12164, true);
            }
        }
        catch (final Exception ex) {
            Class9057.method32610().error("Couldn't get pending invite count", (Throwable)ex);
        }
    }
}
