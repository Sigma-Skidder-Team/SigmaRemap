// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.apache.logging.log4j.LogManager;
import java.io.IOException;
import org.apache.logging.log4j.Logger;

public class Class4320 implements Class4252<Class5800>
{
    private static String[] field19355;
    private static final Logger field19356;
    private BlockPos field19357;
    private Class7096 field19358;
    public Class2003 field19359;
    private boolean field19360;
    
    public Class4320() {
    }
    
    public Class4320(final BlockPos class354, final Class7096 field19358, final Class2003 field19359, final boolean field19360, final String s) {
        this.field19357 = class354.method1153();
        this.field19358 = field19358;
        this.field19359 = field19359;
        this.field19360 = field19360;
    }
    
    @Override
    public void method12754(final Class8654 class8654) throws IOException {
        this.field19357 = class8654.method29494();
        this.field19358 = Class3833.field17391.method499(class8654.method29501());
        this.field19359 = class8654.method29499(Class2003.class);
        this.field19360 = class8654.readBoolean();
    }
    
    @Override
    public void method12755(final Class8654 class8654) throws IOException {
        class8654.method29495(this.field19357);
        class8654.method29505(Class3833.method11774(this.field19358));
        class8654.method29500(this.field19359);
        class8654.writeBoolean(this.field19360);
    }
    
    public void method12764(final Class5800 class5800) {
        class5800.method17367(this);
    }
    
    public Class7096 method12981() {
        return this.field19358;
    }
    
    public BlockPos method12982() {
        return this.field19357;
    }
    
    public boolean method12983() {
        return this.field19360;
    }
    
    public Class2003 method12984() {
        return this.field19359;
    }
    
    static {
        field19356 = LogManager.getLogger();
    }
}
