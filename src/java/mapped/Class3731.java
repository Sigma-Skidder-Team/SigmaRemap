// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Class3731 extends Class3703
{
    private final Map<Long, String> field17126;
    
    public Class3731() {
        super("Chapter Box");
        this.field17126 = new HashMap<Long, String>();
    }
    
    @Override
    public void method11381(final Class9131 class9131) throws IOException {
        super.method11381(class9131);
        class9131.method33144(4L);
        for (int method33135 = class9131.method33135(), i = 0; i < method33135; ++i) {
            this.field17126.put(class9131.method33137(8), class9131.method33139(class9131.method33135()));
        }
    }
    
    public Map<Long, String> method11481() {
        return this.field17126;
    }
}
