// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Collections;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Class3767 extends Class3736
{
    private String field17226;
    private final List<Long> field17227;
    
    public Class3767() {
        super("Track Reference Box");
        this.field17227 = new ArrayList<Long>();
    }
    
    @Override
    public void method11381(final Class9131 class9131) throws IOException {
        this.field17226 = class9131.method33139(4);
        while (this.method11491(class9131) > 3L) {
            this.field17227.add(class9131.method33137(4));
        }
    }
    
    public String method11572() {
        return this.field17226;
    }
    
    public List<Long> method11573() {
        return Collections.unmodifiableList(this.field17227);
    }
}
