// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util2.Direction;
import net.minecraft.util.math.MathHelper;

public class Class4166 extends Class4158<Class495>
{
    public static final Class3687 field18565;
    private final Class6300 field18566;
    
    public Class4166(final Class9550 class9550) {
        super(class9550);
        (this.field18566 = new Class6300(32, 32, 0, 0)).method18636(-3.0f, -6.0f, -3.0f, 6.0f, 7.0f, 6.0f);
        this.field18566.method18642(8.0f, 12.0f, 8.0f);
        final Class6300 class9551 = new Class6300(32, 32, 0, 13);
        class9551.method18636(4.0f, 4.0f, 4.0f, 8.0f, 2.0f, 8.0f);
        class9551.method18642(-8.0f, -12.0f, -8.0f);
        this.field18566.method18633(class9551);
    }
    
    public void method12474(final Class495 class495, final float n, final Class7351 class496, final Class7807 class497, final int n2, final int n3) {
        final float n4 = class495.field2843 + n;
        float field25183 = 0.0f;
        float field25184 = 0.0f;
        if (class495.field2844) {
            final float n5 = MathHelper.sin(n4 / 3.1415927f) / (4.0f + n4 / 3.0f);
            if (class495.field2845 != Direction.NORTH) {
                if (class495.field2845 != Direction.SOUTH) {
                    if (class495.field2845 != Direction.EAST) {
                        if (class495.field2845 == Direction.WEST) {
                            field25184 = n5;
                        }
                    }
                    else {
                        field25184 = -n5;
                    }
                }
                else {
                    field25183 = n5;
                }
            }
            else {
                field25183 = -n5;
            }
        }
        this.field18566.field25183 = field25183;
        this.field18566.field25185 = field25184;
        this.field18566.method18643(class496, Class4166.field18565.method11334(class497, Class6332::method18767), n2, n3);
    }
    
    static {
        field18565 = new Class3687(Class1774.field9853, new ResourceLocation("entity/bell/bell_body"));
    }
}
