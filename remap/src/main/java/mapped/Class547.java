// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import it.unimi.dsi.fastutil.booleans.BooleanConsumer;

public class Class547 extends Class546
{
    private final String field3296;
    private final String field3297;
    private final String field3298;
    private final boolean field3299;
    
    public Class547(final BooleanConsumer booleanConsumer, final String field3298, final boolean b) {
        super(booleanConsumer, new Class2259(b ? "chat.link.confirmTrusted" : "chat.link.confirm", new Object[0]), new StringTextComponent(field3298));
        this.field3292 = Class8822.method30773(b ? "chat.link.open" : "gui.yes", new Object[0]);
        this.field3293 = Class8822.method30773(b ? "gui.cancel" : "gui.no", new Object[0]);
        this.field3297 = Class8822.method30773("chat.copy", new Object[0]);
        this.field3296 = Class8822.method30773("chat.link.warning", new Object[0]);
        this.field3299 = !b;
        this.field3298 = field3298;
    }
    
    @Override
    public void method2969() {
        super.method2969();
        this.field3154.clear();
        this.field3149.clear();
        this.method3029(new Class654(this.field3152 / 2 - 50 - 105, this.field3153 / 6 + 96, 100, 20, this.field3292, class654 -> this.field3295.accept(true)));
        this.method3029(new Class654(this.field3152 / 2 - 50, this.field3153 / 6 + 96, 100, 20, this.field3297, class654 -> {
            this.method3212();
            this.field3295.accept(false);
        }));
        this.method3029(new Class654(this.field3152 / 2 - 50 + 105, this.field3153 / 6 + 96, 100, 20, this.field3293, class654 -> this.field3295.accept(false)));
    }
    
    public void method3212() {
        this.field3150.field4651.method22508(this.field3298);
    }
    
    @Override
    public void method2975(final int n, final int n2, final float n3) {
        super.method2975(n, n2, n3);
        if (this.field3299) {
            this.method3295(this.field3156, this.field3296, this.field3152 / 2, 110, 16764108);
        }
    }
}