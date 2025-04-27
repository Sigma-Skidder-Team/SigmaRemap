// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.apache.commons.lang3.StringUtils;
import com.google.common.collect.Lists;
import java.util.List;

public class Class8418
{
    private String field34562;
    private final List<String> field34563;
    
    private Class8418() {
        this.field34563 = Lists.newArrayList();
    }
    
    private void method28107(final String s) {
        this.field34563.add(0, s);
    }
    
    public String method28108() {
        return StringUtils.join(this.field34563, "->");
    }
    
    @Override
    public String toString() {
        if (this.field34562 == null) {
            return this.field34563.isEmpty() ? "(Unknown file)" : ("(Unknown file) " + this.method28108());
        }
        return this.field34563.isEmpty() ? this.field34562 : (this.field34562 + " " + this.method28108());
    }
}
