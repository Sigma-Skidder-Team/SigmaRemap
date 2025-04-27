// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Collections;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Class3720 extends Class3703
{
    private List<Class5775> field17092;
    
    public Class3720() {
        super("IPMP Info Box");
    }
    
    @Override
    public void method11381(final Class9131 class9131) throws IOException {
        super.method11381(class9131);
        this.field17092 = new ArrayList<Class5775>();
        while (this.method11491(class9131) > 0L) {
            this.field17092.add(Class5775.method17219(class9131));
        }
    }
    
    public List<Class5775> method11446() {
        return Collections.unmodifiableList(this.field17092);
    }
}
