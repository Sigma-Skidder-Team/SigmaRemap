// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import javax.annotation.Nullable;
import java.util.List;

public final class Request
{
    public final Class8846 field36099;
    public final String field36100;
    public final Class6957 field36101;
    public final Class7173 field36102;
    public final Object field36103;
    private volatile Class6668 field36104;
    
    public Request(final Class8896 class8896) {
        this.field36099 = class8896.field37402;
        this.field36100 = class8896.field37403;
        this.field36101 = class8896.field37404.method29384();
        this.field36102 = class8896.field37405;
        this.field36103 = ((class8896.field37406 == null) ? this : class8896.field37406);
    }
    
    public Class8846 url() {
        return this.field36099;
    }
    
    public String method29110() {
        return this.field36100;
    }
    
    public Class6957 method29111() {
        return this.field36101;
    }
    
    public String method29112(final String s) {
        return this.field36101.method21360(s);
    }
    
    public List<String> method29113(final String s) {
        return this.field36101.values(s);
    }
    
    @Nullable
    public Class7173 method29114() {
        return this.field36102;
    }
    
    public Object method29115() {
        return this.field36103;
    }
    
    public Class8896 method29116() {
        return new Class8896(this);
    }
    
    public Class6668 method29117() {
        final Class6668 field36104 = this.field36104;
        return (field36104 == null) ? (this.field36104 = Class6668.method20294(this.field36101)) : field36104;
    }
    
    public boolean method29118() {
        return this.field36099.method30931();
    }
    
    @Override
    public String toString() {
        return "Request{method=" + this.field36100 + ", url=" + this.field36099 + ", tag=" + ((this.field36103 == this) ? null : this.field36103) + '}';
    }
}
