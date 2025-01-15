// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.function.Consumer;

public class Class6812
{
    private final String field26750;
    private final String field26751;
    private final String field26752;
    private final boolean field26753;
    private final Consumer<Class9152> field26754;
    private final int field26755;
    private final long field26756;
    
    private Class6812() {
        this.field26750 = "";
        this.field26751 = "";
        this.field26752 = "";
        this.field26753 = true;
        this.field26754 = (p0 -> {});
        this.field26755 = 0;
        this.field26756 = 0L;
    }
    
    public void method20848(final Class9152 class9152) {
        this.field26754.accept(class9152);
    }
    
    public String method20849() {
        return this.field26751;
    }
    
    public String method20850() {
        return this.field26752;
    }
    
    @Override
    public String toString() {
        return this.field26751;
    }
    
    public int method20851() {
        return this.field26755;
    }
    
    public boolean method20852() {
        return this.field26753;
    }
    
    public String method20853() {
        return this.field26750;
    }
    
    public long method20854() {
        return this.field26756;
    }
}
