// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class7624 implements Class7622
{
    private static String[] field30198;
    private final ClientPlayerEntity field30199;
    private boolean field30200;
    private boolean field30201;
    
    public Class7624(final ClientPlayerEntity field30199) {
        this.field30201 = true;
        this.field30199 = field30199;
    }
    
    @Override
    public void method23959() {
        final BlockState method6720 = this.field30199.world.method6720(this.field30199.getBoundingBox().grow(0.0, -0.4000000059604645, 0.0).shrink(0.001), Blocks.BUBBLE_COLUMN);
        if (method6720 == null) {
            this.field30200 = false;
        }
        else {
            if (!this.field30200) {
                if (!this.field30201) {
                    if (method6720.getBlock() == Blocks.BUBBLE_COLUMN) {
                        if (!this.field30199.isSpectator()) {
                            if (!method6720.get(Class3858.field17478)) {
                                this.field30199.method1695(Class8520.field35046, 1.0f, 1.0f);
                            }
                            else {
                                this.field30199.method1695(Class8520.field35048, 1.0f, 1.0f);
                            }
                        }
                    }
                }
            }
            this.field30200 = true;
        }
        this.field30201 = false;
    }
}
