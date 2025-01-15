// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Class3802 extends Class3703
{
    private final Map<Long, String> field17311;
    
    public Class3802() {
        super("Group ID To Name Box");
        this.field17311 = new HashMap<Long, String>();
    }
    
    @Override
    public void method11381(final Class9131 class9131) throws IOException {
        super.method11381(class9131);
        for (int n = (int)class9131.method33137(2), i = 0; i < n; ++i) {
            this.field17311.put(class9131.method33137(4), class9131.method33140((int)this.method11491(class9131), "UTF-8"));
        }
    }
    
    public Map<Long, String> method11648() {
        return this.field17311;
    }
}
