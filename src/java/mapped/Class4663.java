// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class4663 implements Class4659
{
    public final /* synthetic */ Class9198 field20176;
    
    public Class4663(final Class9198 field20176) {
        this.field20176 = field20176;
    }
    
    @Override
    public void method13945(final Object... array) {
        Class9198.method33666(this.field20176).method14942("my other event", "hi");
        final Class4405 class4405 = new Class4405();
        class4405.method13301("session", "TOMYGAMESTESTINGID");
        Class9198.method33666(this.field20176).method14942("login", class4405);
        System.out.println("hey");
    }
}
