// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.Lists;
import java.util.List;

public class Class8776 implements Class8775
{
    private static String[] field36891;
    private final List<Class122> field36892;
    
    public Class8776(final Class8775... array) {
        this.field36892 = Lists.newArrayList();
        for (int length = array.length, i = 0; i < length; ++i) {
            this.field36892.add(array[i].method30479());
        }
    }
    
    @Override
    public Class8776 method30481(final Class8775 class8775) {
        this.field36892.add(class8775.method30479());
        return this;
    }
    
    @Override
    public Class122 method30479() {
        return new Class161(this.field36892.toArray(new Class122[0]), null);
    }
}
