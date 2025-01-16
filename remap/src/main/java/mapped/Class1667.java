// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import javax.annotation.Nullable;
import java.io.Closeable;

public class Class1667 extends Class1666 implements Closeable
{
    private static String[] field9441;
    private final ResourceLocation field9442;
    private final Class6332 field9443;
    private final Class6332 field9444;
    private final boolean field9445;
    private final Class7448 field9446;
    
    public Class1667(final ResourceLocation field9442, final boolean field9443) {
        this.field9442 = field9442;
        this.field9445 = field9443;
        this.field9446 = new Class7448(0, 0, 256, 256, null);
        Class8995.method32104(field9443 ? Class2063.field11809 : Class2063.field11813, this.method5869(), 256, 256);
        this.field9443 = Class6332.method18787(field9442);
        this.field9444 = Class6332.method18788(field9442);
    }
    
    @Override
    public void method5871(final Class6582 class6582) {
    }
    
    @Override
    public void close() {
        this.method5870();
    }
    
    @Nullable
    public Class8048 method5879(final Class2022 class2022) {
        if (class2022.method8073() != this.field9445) {
            return null;
        }
        final Class7448 method22910 = this.field9446.method22910(class2022);
        if (method22910 == null) {
            return null;
        }
        this.method5872();
        class2022.method8072(Class7448.method22911(method22910), Class7448.method22912(method22910));
        return new Class8048(this.field9443, this.field9444, (Class7448.method22911(method22910) + 0.01f) / 256.0f, (Class7448.method22911(method22910) - 0.01f + class2022.method8068()) / 256.0f, (Class7448.method22912(method22910) + 0.01f) / 256.0f, (Class7448.method22912(method22910) - 0.01f + class2022.method8069()) / 256.0f, class2022.method8075(), class2022.method8076(), class2022.method8077(), class2022.method8078());
    }
    
    public ResourceLocation method5880() {
        return this.field9442;
    }
}
