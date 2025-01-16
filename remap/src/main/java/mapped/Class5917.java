// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.ImmutableList;
import net.minecraft.util.math.MathHelper;

import java.util.List;

public class Class5917 extends Class5901
{
    private static String[] field24306;
    private final Class6300 field24307;
    private final Class6300 field24308;
    private final Class6300 field24309;
    private final Class6300 field24310;
    private final Class6300 field24311;
    private final Class6300 field24312;
    private final Class6300 field24313;
    private final List<Class6300> field24314;
    
    public Class5917() {
        super(Class6332::method18767);
        this.field24307 = new Class6300(64, 32, 0, 0).method18636(-6.0f, -5.0f, -0.005f, 6.0f, 10.0f, 0.005f);
        this.field24308 = new Class6300(64, 32, 16, 0).method18636(0.0f, -5.0f, -0.005f, 6.0f, 10.0f, 0.005f);
        this.field24313 = new Class6300(64, 32, 12, 0).method18636(-1.0f, -5.0f, 0.0f, 2.0f, 10.0f, 0.005f);
        this.field24309 = new Class6300(64, 32, 0, 10).method18636(0.0f, -4.0f, -0.99f, 5.0f, 8.0f, 1.0f);
        this.field24310 = new Class6300(64, 32, 12, 10).method18636(0.0f, -4.0f, -0.01f, 5.0f, 8.0f, 1.0f);
        this.field24311 = new Class6300(64, 32, 24, 10).method18636(0.0f, -4.0f, 0.0f, 5.0f, 8.0f, 0.005f);
        this.field24312 = new Class6300(64, 32, 24, 10).method18636(0.0f, -4.0f, 0.0f, 5.0f, 8.0f, 0.005f);
        this.field24314 = (List<Class6300>)ImmutableList.of((Object)this.field24307, (Object)this.field24308, (Object)this.field24313, (Object)this.field24309, (Object)this.field24310, (Object)this.field24311, (Object)this.field24312);
        this.field24307.method18642(0.0f, 0.0f, -1.0f);
        this.field24308.method18642(0.0f, 0.0f, 1.0f);
        this.field24313.field25184 = 1.5707964f;
    }
    
    @Override
    public void method17564(final MatrixStack class7351, final Class4150 class7352, final int n, final int n2, final float n3, final float n4, final float n5, final float n6) {
        this.method17787(class7351, class7352, n, n2, n3, n4, n5, n6);
    }
    
    public void method17787(final MatrixStack class7351, final Class4150 class7352, final int n, final int n2, final float n3, final float n4, final float n5, final float n6) {
        this.field24314.forEach(class7355 -> class7355.method18644(class7353, class7354, n7, n8, n9, n10, n11, n12));
    }
    
    public void method17788(final float n, final float n2, final float n3, final float n4) {
        final float field25184 = (MathHelper.sin(n * 0.02f) * 0.1f + 1.25f) * n4;
        this.field24307.field25184 = 3.1415927f + field25184;
        this.field24308.field25184 = -field25184;
        this.field24309.field25184 = field25184;
        this.field24310.field25184 = -field25184;
        this.field24311.field25184 = field25184 - field25184 * 2.0f * n2;
        this.field24312.field25184 = field25184 - field25184 * 2.0f * n3;
        this.field24309.field25180 = MathHelper.sin(field25184);
        this.field24310.field25180 = MathHelper.sin(field25184);
        this.field24311.field25180 = MathHelper.sin(field25184);
        this.field24312.field25180 = MathHelper.sin(field25184);
    }
}
