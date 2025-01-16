// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.text.ITextComponent;

import java.io.InputStream;
import java.io.IOException;
import java.util.function.Supplier;

public class Class1922 extends Class1921
{
    private Class1846 field10452;
    private ResourceLocation field10453;
    
    public Class1922(final String s, final boolean b, final Supplier<Class1727> supplier, final Class1727 class1727, final Class8545 class1728, final Class2043 class1729) {
        super(s, b, supplier, class1727, class1728, class1729);
        Class1846 method6637 = null;
        try (final InputStream method6638 = class1727.method6096("pack.png")) {
            method6637 = Class1846.method6637(method6638);
        }
        catch (final IllegalArgumentException | IOException ex) {}
        this.field10452 = method6637;
    }
    
    public Class1922(final String s, final boolean b, final Supplier<Class1727> supplier, final ITextComponent class2250, final ITextComponent class2251, final Class2009 class2252, final Class2043 class2253, final boolean b2, final Class1846 field10452) {
        super(s, b, supplier, class2250, class2251, class2252, class2253, b2);
        this.field10452 = field10452;
    }
    
    public void method7626(final Class1663 class1663) {
        if (this.field10453 == null) {
            if (this.field10452 != null) {
                this.field10453 = class1663.method5854("texturepackicon", new Class1773(this.field10452));
            }
            else {
                this.field10453 = new ResourceLocation("textures/misc/unknown_pack.png");
            }
        }
        class1663.method5849(this.field10453);
    }
    
    @Override
    public void close() {
        super.close();
        if (this.field10452 != null) {
            this.field10452.close();
            this.field10452 = null;
        }
    }
}
