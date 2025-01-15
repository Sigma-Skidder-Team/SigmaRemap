// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.ImmutableList$Builder;
import java.util.Arrays;
import com.google.common.collect.ImmutableList;

public class Class5896<T extends Class399> extends Class5846<T>
{
    private static String[] field24212;
    private final Class6300[] field24213;
    private final Class6300[] field24214;
    private final ImmutableList<Class6300> field24215;
    private final float[] field24216;
    private static final int[][] field24217;
    private static final int[][] field24218;
    
    public Class5896() {
        this.field24216 = new float[7];
        this.field24213 = new Class6300[7];
        float n = -3.5f;
        for (int i = 0; i < this.field24213.length; ++i) {
            (this.field24213[i] = new Class6300(this, Class5896.field24218[i][0], Class5896.field24218[i][1])).method18636(Class5896.field24217[i][0] * -0.5f, 0.0f, Class5896.field24217[i][2] * -0.5f, (float)Class5896.field24217[i][0], (float)Class5896.field24217[i][1], (float)Class5896.field24217[i][2]);
            this.field24213[i].method18642(0.0f, (float)(24 - Class5896.field24217[i][1]), n);
            this.field24216[i] = n;
            if (i < this.field24213.length - 1) {
                n += (Class5896.field24217[i][2] + Class5896.field24217[i + 1][2]) * 0.5f;
            }
        }
        this.field24214 = new Class6300[3];
        (this.field24214[0] = new Class6300(this, 20, 0)).method18636(-5.0f, 0.0f, Class5896.field24217[2][2] * -0.5f, 10.0f, 8.0f, (float)Class5896.field24217[2][2]);
        this.field24214[0].method18642(0.0f, 16.0f, this.field24216[2]);
        (this.field24214[1] = new Class6300(this, 20, 11)).method18636(-3.0f, 0.0f, Class5896.field24217[4][2] * -0.5f, 6.0f, 4.0f, (float)Class5896.field24217[4][2]);
        this.field24214[1].method18642(0.0f, 20.0f, this.field24216[4]);
        (this.field24214[2] = new Class6300(this, 20, 18)).method18636(-3.0f, 0.0f, Class5896.field24217[4][2] * -0.5f, 6.0f, 5.0f, (float)Class5896.field24217[1][2]);
        this.field24214[2].method18642(0.0f, 19.0f, this.field24216[1]);
        final ImmutableList$Builder builder = ImmutableList.builder();
        builder.addAll((Iterable)Arrays.asList(this.field24213));
        builder.addAll((Iterable)Arrays.asList(this.field24214));
        this.field24215 = (ImmutableList<Class6300>)builder.build();
    }
    
    public ImmutableList<Class6300> method17611() {
        return this.field24215;
    }
    
    @Override
    public void method17557(final T t, final float n, final float n2, final float n3, final float n4, final float n5) {
        for (int i = 0; i < this.field24213.length; ++i) {
            this.field24213[i].field25184 = Class9546.method35639(n3 * 0.9f + i * 0.15f * 3.1415927f) * 3.1415927f * 0.05f * (1 + Math.abs(i - 2));
            this.field24213[i].field25180 = Class9546.method35638(n3 * 0.9f + i * 0.15f * 3.1415927f) * 3.1415927f * 0.2f * Math.abs(i - 2);
        }
        this.field24214[0].field25184 = this.field24213[2].field25184;
        this.field24214[1].field25184 = this.field24213[4].field25184;
        this.field24214[1].field25180 = this.field24213[4].field25180;
        this.field24214[2].field25184 = this.field24213[1].field25184;
        this.field24214[2].field25180 = this.field24213[1].field25180;
    }
    
    static {
        field24217 = new int[][] { { 3, 2, 2 }, { 4, 3, 2 }, { 6, 4, 3 }, { 3, 3, 3 }, { 2, 2, 3 }, { 2, 1, 2 }, { 1, 1, 2 } };
        field24218 = new int[][] { { 0, 0 }, { 0, 4 }, { 0, 9 }, { 0, 16 }, { 0, 22 }, { 11, 0 }, { 13, 4 } };
    }
}
