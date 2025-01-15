// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.function.BiFunction;
import java.util.function.BiConsumer;
import java.util.function.Function;

public class Class6472 extends Class6470
{
    public Class6472(final String s) {
        this(s, 0.0, 1.0, 0.0f);
    }
    
    public Class6472(final String s, final double n, final double n2, final float n3) {
        super(s, n, n2, n3, null, null, null);
        super.field25826 = this::method19478;
        super.field25827 = this::method19479;
        super.field25828 = this::method19480;
    }
    
    private double method19478(final Class5760 class5760) {
        return class5760.method17131(this);
    }
    
    private void method19479(final Class5760 class5760, final double n) {
        class5760.method17130(this, n);
    }
    
    private String method19480(final Class5760 class5760, final Class6470 class5761) {
        return class5760.method17133(class5761);
    }
}
