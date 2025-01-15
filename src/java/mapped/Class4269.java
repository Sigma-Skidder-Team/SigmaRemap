// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import javax.annotation.Nullable;
import java.io.IOException;

public class Class4269 implements Class4252<Class5800>
{
    private static String[] field19149;
    private Class1932 field19150;
    
    public Class4269() {
    }
    
    public Class4269(final Class1932 field19150) {
        this.field19150 = field19150;
    }
    
    public void method12764(final Class5800 class5800) {
        class5800.method17323(this);
    }
    
    @Override
    public void method12754(final Class8654 class8654) throws IOException {
        if (class8654.readBoolean()) {
            this.field19150 = class8654.method29516();
        }
    }
    
    @Override
    public void method12755(final Class8654 class8654) throws IOException {
        class8654.writeBoolean(this.field19150 != null);
        if (this.field19150 != null) {
            class8654.method29517(this.field19150);
        }
    }
    
    @Nullable
    public Class1932 method12812() {
        return this.field19150;
    }
}
