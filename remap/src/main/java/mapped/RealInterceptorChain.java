// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;
import java.util.List;

public final class RealInterceptorChain implements Class8711
{
    private final List<Class6814> field36598;
    private final StreamAllocation field36599;
    private final Class7811 field36600;
    private final Class5040 field36601;
    private final int field36602;
    private final Request field36603;
    private int field36604;
    
    public RealInterceptorChain(final List<Class6814> field36598, final StreamAllocation field36599, final Class7811 field36600, final Class5040 field36601, final int field36602, final Request field36603) {
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
    
    public StreamAllocation method29908() {
        return this.field36599;
    }
    
    public Class7811 method29909() {
        return this.field36600;
    }
    
    @Override
    public Request method29905() {
        return this.field36603;
    }
    
    @Override
    public Response proceed(final Request request) throws IOException {
        return this.method29910(request, this.field36599, this.field36600, this.field36601);
    }
    
    public Response method29910(final Request request, final StreamAllocation class8597, final Class7811 class8598, final Class5040 class8599) throws IOException {
        if (this.field36602 >= this.field36598.size()) {
            throw new AssertionError();
        }
        ++this.field36604;
        if (this.field36600 != null && !this.field36601.method15342(request.url())) {
            throw new IllegalStateException("network interceptor " + this.field36598.get(this.field36602 - 1) + " must retain the same host and port");
        }
        if (this.field36600 != null && this.field36604 > 1) {
            throw new IllegalStateException("network interceptor " + this.field36598.get(this.field36602 - 1) + " must call proceed() exactly once");
        }
        final RealInterceptorChain class8600 = new RealInterceptorChain(this.field36598, class8597, class8598, class8599, this.field36602 + 1, request);
        final Class6814 class8601 = this.field36598.get(this.field36602);
        final Response method20856 = class8601.method20856(class8600);
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
