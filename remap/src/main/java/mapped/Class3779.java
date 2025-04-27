// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Collections;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Class3779 extends Class3703
{
    private long field17253;
    private final List<Long> field17254;
    
    public Class3779() {
        super("Track Selection Box");
        this.field17254 = new ArrayList<Long>();
    }
    
    @Override
    public void method11381(final Class9131 class9131) throws IOException {
        super.method11381(class9131);
        this.field17253 = class9131.method33137(4);
        while (this.method11491(class9131) > 3L) {
            this.field17254.add(class9131.method33137(4));
        }
    }
    
    public long method11586() {
        return this.field17253;
    }
    
    public List<Long> method11587() {
        return Collections.unmodifiableList(this.field17254);
    }
}
