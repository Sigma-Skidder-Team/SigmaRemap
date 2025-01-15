// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.List;

public class Class7238 implements Class7237<Object>
{
    private List<Object> field28052;
    private int field28053;
    private boolean field28054;
    
    @Override
    public void method22141(final List<Object> list) {
        if (!this.field28054) {
            this.field28052 = list;
            this.field28053 = 0;
            this.field28054 = (list != null && this.field28053 < list.size());
            return;
        }
        throw new RuntimeException("Iterator still used, oldList: " + this.field28052 + ", newList: " + list);
    }
    
    @Override
    public Object next() {
        if (this.field28054) {
            final Object value = this.field28052.get(this.field28053);
            ++this.field28053;
            this.field28054 = (this.field28053 < this.field28052.size());
            return value;
        }
        return null;
    }
    
    @Override
    public boolean hasNext() {
        if (this.field28054) {
            return this.field28054;
        }
        Class9562.method35783(this);
        return false;
    }
}
