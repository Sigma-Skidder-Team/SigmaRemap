// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.apache.logging.log4j.LogManager;
import java.util.Iterator;
import java.io.IOException;
import com.google.common.collect.Lists;
import java.util.List;
import org.apache.logging.log4j.Logger;

public class Class1772 extends Class1666
{
    private static final Logger field9846;
    public final List<String> field9847;
    private Class6582 field9848;
    private String field9849;
    
    public Class1772(final String... array) {
        this.field9847 = Lists.newArrayList((Object[])array);
        if (!this.field9847.isEmpty()) {
            return;
        }
        throw new IllegalStateException("Layered texture with no layers.");
    }
    
    @Override
    public void method5871(final Class6582 field9848) throws IOException {
        this.field9848 = field9848;
        final Iterator<String> iterator = this.field9847.iterator();
        final String field9849 = iterator.next();
        this.field9849 = field9849;
        try (final Class1671 method19933 = field9848.method19933(new ResourceLocation(field9849))) {
            Class1846 method19934;
            if (Class9570.field41388.method22605()) {
                method19934 = (Class1846)Class9570.field41388.method22608(new ResourceLocation(field9849), field9848);
            }
            else {
                method19934 = Class1846.method6637(method19933.method5887());
            }
            while (iterator.hasNext()) {
                final String s = iterator.next();
                if (s != null) {
                    try (final Class1671 method19935 = field9848.method19933(new ResourceLocation(s));
                         final Class1846 method19936 = Class1846.method6637(method19935.method5887())) {
                        for (int i = 0; i < method19936.method6645(); ++i) {
                            for (int j = 0; j < method19936.method6644(); ++j) {
                                method19934.method6650(j, i, method19936.method6647(j, i));
                            }
                        }
                    }
                }
            }
            if (!RenderSystem.method29985()) {
                RenderSystem.method29991(() -> this.method6325(method19934));
            }
            else {
                this.method6325(method19934);
            }
        }
        catch (final IOException ex) {
            Class1772.field9846.error("Couldn't load layered image", ex);
        }
    }
    
    private void method6325(final Class1846 class1846) {
        Class8995.method32103(this.method5869(), class1846.method6644(), class1846.method6645());
        class1846.method6652(0, 0, 0, true);
        if (Config.method28955()) {
            Class8990.method32070(this.method5869(), class1846, false, false, this.field9848, new ResourceLocation(this.field9849), this.method5874());
        }
    }
    
    static {
        field9846 = LogManager.getLogger();
    }
}
