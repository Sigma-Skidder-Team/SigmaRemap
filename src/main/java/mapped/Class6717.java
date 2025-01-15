// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Random;

public class Class6717 extends Class6716
{
    private Class6717() {
        super(null);
    }
    
    @Override
    public String method20398(final Random random) {
        return "1x1_b" + (random.nextInt(4) + 1);
    }
    
    @Override
    public String method20399(final Random random) {
        return "1x1_as" + (random.nextInt(4) + 1);
    }
    
    @Override
    public String method20400(final Random random, final boolean b) {
        return b ? "1x2_c_stairs" : ("1x2_c" + (random.nextInt(4) + 1));
    }
    
    @Override
    public String method20401(final Random random, final boolean b) {
        return b ? "1x2_d_stairs" : ("1x2_d" + (random.nextInt(5) + 1));
    }
    
    @Override
    public String method20402(final Random random) {
        return "1x2_se" + (random.nextInt(1) + 1);
    }
    
    @Override
    public String method20403(final Random random) {
        return "2x2_b" + (random.nextInt(5) + 1);
    }
    
    @Override
    public String method20404(final Random random) {
        return "2x2_s1";
    }
}
