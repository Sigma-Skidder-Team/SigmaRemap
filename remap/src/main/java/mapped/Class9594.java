// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.ArrayList;
import java.util.Properties;

public class Class9594
{
    public String field41819;
    public String field41820;
    public ResourceLocation[] field41821;
    public Class9310[] field41822;
    
    public Class9594(final String s, final ResourceLocation[] field41821) {
        this.field41819 = null;
        this.field41820 = null;
        this.field41821 = null;
        this.field41822 = null;
        final Class8652 class8652 = new Class8652("RandomEntities");
        this.field41819 = class8652.method29440(s);
        this.field41820 = class8652.method29441(s);
        this.field41821 = field41821;
    }
    
    public Class9594(final Properties properties, final String s, final ResourceLocation class1932) {
        this.field41819 = null;
        this.field41820 = null;
        this.field41821 = null;
        this.field41822 = null;
        final Class8652 class1933 = new Class8652("RandomEntities");
        this.field41819 = class1933.method29440(s);
        this.field41820 = class1933.method29441(s);
        this.field41822 = this.method35982(properties, s, class1932, class1933);
    }
    
    public ResourceLocation method35981(final ResourceLocation class1932, final Class8444 class1933) {
        if (this.field41822 != null) {
            for (int i = 0; i < this.field41822.length; ++i) {
                final Class9310 class1934 = this.field41822[i];
                if (class1934.method34429(class1933)) {
                    return class1934.method34430(class1932, class1933.method28177());
                }
            }
        }
        if (this.field41821 == null) {
            return class1932;
        }
        return this.field41821[class1933.method28177() % this.field41821.length];
    }
    
    private Class9310[] method35982(final Properties properties, final String s, final ResourceLocation class1932, final Class8652 class1933) {
        final ArrayList list = new ArrayList();
        for (int size = properties.size(), i = 0; i < size; ++i) {
            final int n = i + 1;
            String s2 = properties.getProperty("textures." + n);
            if (s2 == null) {
                s2 = properties.getProperty("skins." + n);
            }
            if (s2 != null) {
                final Class9310 class1934 = new Class9310(properties, s, class1932, n, s2, class1933);
                if (class1934.method34428(s)) {
                    list.add(class1934);
                }
            }
        }
        return (Class9310[])list.toArray(new Class9310[list.size()]);
    }
    
    public boolean method35983(final String str) {
        if (this.field41821 == null && this.field41822 == null) {
            Config.warn("No skins specified: " + str);
            return false;
        }
        if (this.field41822 != null) {
            for (int i = 0; i < this.field41822.length; ++i) {
                if (!this.field41822[i].method34428(str)) {
                    return false;
                }
            }
        }
        if (this.field41821 != null) {
            for (int j = 0; j < this.field41821.length; ++j) {
                final ResourceLocation class1932 = this.field41821[j];
                if (!Config.method28900(class1932)) {
                    Config.warn("Texture not found: " + class1932.method7797());
                    return false;
                }
            }
        }
        return true;
    }
    
    public boolean method35984() {
        return this.field41822 == null && this.field41821 == null;
    }
}
