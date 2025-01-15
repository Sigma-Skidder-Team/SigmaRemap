// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.Lists;
import java.util.List;

public class Class4945 implements Class4946<Class4945>, Class4944<Class4945>
{
    private final List<Class6368> field21229;
    private final List<Class122> field21230;
    private final List<Class125> field21231;
    private Class5770 field21232;
    private Class5772 field21233;
    
    public Class4945() {
        this.field21229 = Lists.newArrayList();
        this.field21230 = Lists.newArrayList();
        this.field21231 = Lists.newArrayList();
        this.field21232 = new Class5772(1.0f);
        this.field21233 = new Class5772(0.0f, 0.0f);
    }
    
    public Class4945 method14895(final Class5770 field21232) {
        this.field21232 = field21232;
        return this;
    }
    
    public Class4945 method14896() {
        return this;
    }
    
    public Class4945 method14897(final Class4950<?> class4950) {
        this.field21229.add(class4950.method14912());
        return this;
    }
    
    public Class4945 method14898(final Class8775 class8775) {
        this.field21230.add(class8775.method30479());
        return this;
    }
    
    public Class4945 method14899(final Class4942 class4942) {
        this.field21231.add(class4942.method14888());
        return this;
    }
    
    public Class9320 method14900() {
        if (this.field21232 != null) {
            return new Class9320(this.field21229.toArray(new Class6368[0]), this.field21230.toArray(new Class122[0]), this.field21231.toArray(new Class125[0]), this.field21232, this.field21233, null);
        }
        throw new IllegalArgumentException("Rolls not set");
    }
}
