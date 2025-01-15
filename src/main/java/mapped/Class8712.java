// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;
import java.util.List;

public final class Class8712 implements Class8711
{
    private final List<Class6814> field36598;
    private final Class8904 field36599;
    private final Class7811 field36600;
    private final Class5040 field36601;
    private final int field36602;
    private final Class8596 field36603;
    private int field36604;
    
    public Class8712(final List<Class6814> field36598, final Class8904 field36599, final Class7811 field36600, final Class5040 field36601, final int field36602, final Class8596 field36603) {
        this.field36598 = field36598;
        this.field36601 = field36601;
        this.field36599 = field36599;
        this.field36600 = field36600;
        this.field36602 = field36602;
        this.field36603 = field36603;
    }
    
    @Override
    public Class5039 method29907() {
        return this.field36601;
    }
    
    public Class8904 method29908() {
        return this.field36599;
    }
    
    public Class7811 method29909() {
        return this.field36600;
    }
    
    @Override
    public Class8596 method29905() {
        return this.field36603;
    }
    
    @Override
    public Class1753 method29906(final Class8596 class8596) throws IOException {
        return this.method29910(class8596, this.field36599, this.field36600, this.field36601);
    }
    
    public Class1753 method29910(final Class8596 class8596, final Class8904 class8597, final Class7811 class8598, final Class5040 class8599) throws IOException {
        if (this.field36602 >= this.field36598.size()) {
            throw new AssertionError();
        }
        ++this.field36604;
        if (this.field36600 != null && !this.field36601.method15342(class8596.method29109())) {
            throw new IllegalStateException("network interceptor " + this.field36598.get(this.field36602 - 1) + " must retain the same host and port");
        }
        if (this.field36600 != null && this.field36604 > 1) {
            throw new IllegalStateException("network interceptor " + this.field36598.get(this.field36602 - 1) + " must call proceed() exactly once");
        }
        final Class8712 class8600 = new Class8712(this.field36598, class8597, class8598, class8599, this.field36602 + 1, class8596);
        final Class6814 class8601 = this.field36598.get(this.field36602);
        final Class1753 method20856 = class8601.method20856(class8600);
        if (class8598 != null) {
            if (this.field36602 + 1 < this.field36598.size()) {
                if (class8600.field36604 != 1) {
                    throw new IllegalStateException("network interceptor " + class8601 + " must call proceed() exactly once");
                }
            }
        }
        if (method20856 != null) {
            return method20856;
        }
        throw new NullPointerException("interceptor " + class8601 + " returned null");
    }
}
