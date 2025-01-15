// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import it.unimi.dsi.fastutil.doubles.DoubleArrayList;
import java.util.Arrays;
import it.unimi.dsi.fastutil.doubles.DoubleList;

public final class Class7704 extends Class7702
{
    private final DoubleList field30621;
    private final DoubleList field30622;
    private final DoubleList field30623;
    
    public Class7704(final Class8260 class8260, final double[] original, final double[] original2, final double[] original3) {
        this(class8260, (DoubleList)DoubleArrayList.wrap(Arrays.copyOf(original, class8260.method27431() + 1)), (DoubleList)DoubleArrayList.wrap(Arrays.copyOf(original2, class8260.method27432() + 1)), (DoubleList)DoubleArrayList.wrap(Arrays.copyOf(original3, class8260.method27433() + 1)));
    }
    
    public Class7704(final Class8260 class8260, final DoubleList field30621, final DoubleList field30622, final DoubleList field30623) {
        super(class8260);
        final int n = class8260.method27431() + 1;
        final int n2 = class8260.method27432() + 1;
        final int n3 = class8260.method27433() + 1;
        if (n == field30621.size()) {
            if (n2 == field30622.size()) {
                if (n3 == field30623.size()) {
                    this.field30621 = field30621;
                    this.field30622 = field30622;
                    this.field30623 = field30623;
                    return;
                }
            }
        }
        throw Class8349.method27859(new IllegalArgumentException("Lengths of point arrays must be consistent with the size of the VoxelShape."));
    }
    
    @Override
    public DoubleList method24539(final Class111 class111) {
        switch (Class9522.field40999[class111.ordinal()]) {
            case 1: {
                return this.field30621;
            }
            case 2: {
                return this.field30622;
            }
            case 3: {
                return this.field30623;
            }
            default: {
                throw new IllegalArgumentException();
            }
        }
    }
}
