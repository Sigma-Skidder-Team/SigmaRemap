// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.ImmutableList$Builder;
import java.util.Random;
import com.google.common.collect.ImmutableList;

public class Class5890<T extends Class399> extends Class5846<T>
{
    private static String[] field24182;
    private final Class6300[] field24183;
    private final ImmutableList<Class6300> field24184;
    
    public Class5890() {
        this.field24183 = new Class6300[9];
        final ImmutableList$Builder builder = ImmutableList.builder();
        final Class6300 class6300 = new Class6300(this, 0, 0);
        class6300.method18636(-8.0f, -8.0f, -8.0f, 16.0f, 16.0f, 16.0f);
        class6300.field25181 = 17.6f;
        builder.add((Object)class6300);
        final Random random = new Random(1660L);
        for (int i = 0; i < this.field24183.length; ++i) {
            this.field24183[i] = new Class6300(this, 0, 0);
            final float field25180 = ((i % 3 - i / 3 % 2 * 0.5f + 0.25f) / 2.0f * 2.0f - 1.0f) * 5.0f;
            final float field25181 = (i / 3 / 2.0f * 2.0f - 1.0f) * 5.0f;
            this.field24183[i].method18636(-1.0f, 0.0f, -1.0f, 2.0f, (float)(random.nextInt(7) + 8), 2.0f);
            this.field24183[i].field25180 = field25180;
            this.field24183[i].field25182 = field25181;
            this.field24183[i].field25181 = 24.6f;
            builder.add((Object)this.field24183[i]);
        }
        this.field24184 = (ImmutableList<Class6300>)builder.build();
    }
    
    @Override
    public void method17557(final T t, final float n, final float n2, final float n3, final float n4, final float n5) {
        for (int i = 0; i < this.field24183.length; ++i) {
            this.field24183[i].field25183 = 0.2f * Class9546.method35638(n3 * 0.3f + i) + 0.4f;
        }
    }
    
    @Override
    public Iterable<Class6300> method17570() {
        return (Iterable<Class6300>)this.field24184;
    }
}
