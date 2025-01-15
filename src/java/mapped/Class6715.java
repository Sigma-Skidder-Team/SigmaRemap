// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Random;

public class Class6715 extends Class6716
{
    private Class6715() {
        super(null);
    }
    
    @Override
    public String method20398(final Random random) {
        return "1x1_a" + (random.nextInt(5) + 1);
    }
    
    @Override
    public String method20399(final Random random) {
        return "1x1_as" + (random.nextInt(4) + 1);
    }
    
    @Override
    public String method20400(final Random random, final boolean b) {
        return "1x2_a" + (random.nextInt(9) + 1);
    }
    
    @Override
    public String method20401(final Random random, final boolean b) {
        return "1x2_b" + (random.nextInt(5) + 1);
    }
    
    @Override
    public String method20402(final Random random) {
        return "1x2_s" + (random.nextInt(2) + 1);
    }
    
    @Override
    public String method20403(final Random random) {
        return "2x2_a" + (random.nextInt(4) + 1);
    }
    
    @Override
    public String method20404(final Random random) {
        return "2x2_s1";
    }
}
