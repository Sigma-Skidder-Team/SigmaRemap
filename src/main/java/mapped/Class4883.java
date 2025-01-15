// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class4883 extends Class4841
{
    public Class3167 field20878;
    
    public Class4883(final Class4803 class4803, final String s, final int n, final int n2, final int n3, final int n4, final Class3167 field20878) {
        super(class4803, s, n, n2, n3, n4, false);
        this.field20878 = field20878;
        final Class4864 class4804;
        this.method14239(class4804 = new Class4864(this, "enable", 114, 9, 40, 18));
        class4804.method14589(field20878.method9906());
        class4804.method14516(class3169 -> field20878.method9909(class4804.method14588()));
        if (field20878.method9899().size() > 0) {
            final Class4888 class4805;
            this.method14239(class4805 = new Class4888(this, "gear", 132, 32));
            class4805.method14260((class3168, n) -> ((Class4808)this.method14267()).method14328(field20878));
        }
    }
    
    @Override
    public void method14205(final float n) {
        Class8154.method26889(Class9493.field40808, (float)(this.field20478 + 10), (float)(this.field20479 + 8), this.field20878.method9900(), Class6430.method19118(Class265.field1273.field1292, this.field20878.method9906() ? 0.9f : 0.5f));
        Class8154.method26889(Class9493.field40809, (float)(this.field20478 + 15), (float)(this.field20479 + 33), "Bind", Class6430.method19118(Class265.field1273.field1292, 1.0f));
        Class8154.method26889(Class9493.field40809, (float)(this.field20478 + 15), (float)(this.field20479 + 52), Class6430.method19166(this.field20878.method9885("Keybind")), Class6430.method19118(Class265.field1273.field1292, 0.7f));
        if (this.field20878.method9899().size() > 1) {
            Class8154.method26889(Class9493.field40810, (float)(this.field20478 + 84), (float)(this.field20479 + 34), "Settings", Class6430.method19118(Class265.field1273.field1292, 1.0f));
        }
        super.method14205(n);
    }
}
