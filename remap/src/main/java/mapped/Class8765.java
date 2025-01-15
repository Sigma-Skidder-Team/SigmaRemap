// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import javax.annotation.Nullable;
import com.google.common.collect.Lists;
import java.util.List;

public class Class8765
{
    private static String[] field36849;
    private final List<Class6825> field36850;
    
    public Class8765() {
        this.field36850 = Lists.newArrayList();
    }
    
    public Class8765 method30396(final Class6313 class6313, final int n) {
        if (class6313 != null) {
            this.field36850.add(new Class6825(class6313, n));
        }
        return this;
    }
    
    @Nullable
    public Class6313 method30397() {
        if (!this.field36850.isEmpty()) {
            return (this.field36850.size() != 1) ? new Class6316(this.field36850) : this.field36850.get(0).field26814;
        }
        return null;
    }
}
