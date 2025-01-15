// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Class3702 extends Class3703
{
    private Map<Long, Long> field17024;
    
    public Class3702() {
        super("Progressive Download Information Box");
        this.field17024 = new HashMap<Long, Long>();
    }
    
    @Override
    public void method11381(final Class9131 class9131) throws IOException {
        super.method11381(class9131);
        while (this.method11491(class9131) > 0L) {
            this.field17024.put(class9131.method33137(4), class9131.method33137(4));
        }
    }
    
    public Map<Long, Long> method11382() {
        return this.field17024;
    }
}
