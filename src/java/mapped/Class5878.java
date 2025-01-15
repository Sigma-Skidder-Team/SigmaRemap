// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Arrays;

public class Class5878<T extends Class399> extends Class5846<T>
{
    private static String[] field24095;
    private static final int[][] field24096;
    private static final int[][] field24097;
    private static final int field24098;
    private final Class6300[] field24099;
    
    public Class5878() {
        this.field24099 = new Class6300[Class5878.field24098];
        float n = -3.5f;
        for (int i = 0; i < this.field24099.length; ++i) {
            (this.field24099[i] = new Class6300(this, Class5878.field24097[i][0], Class5878.field24097[i][1])).method18636(Class5878.field24096[i][0] * -0.5f, 0.0f, Class5878.field24096[i][2] * -0.5f, (float)Class5878.field24096[i][0], (float)Class5878.field24096[i][1], (float)Class5878.field24096[i][2]);
            this.field24099[i].method18642(0.0f, (float)(24 - Class5878.field24096[i][1]), n);
            if (i < this.field24099.length - 1) {
                n += (Class5878.field24096[i][2] + Class5878.field24096[i + 1][2]) * 0.5f;
            }
        }
    }
    
    @Override
    public Iterable<Class6300> method17570() {
        return Arrays.asList(this.field24099);
    }
    
    @Override
    public void method17557(final T t, final float n, final float n2, final float n3, final float n4, final float n5) {
        for (int i = 0; i < this.field24099.length; ++i) {
            this.field24099[i].field25184 = Class9546.method35639(n3 * 0.9f + i * 0.15f * 3.1415927f) * 3.1415927f * 0.01f * (1 + Math.abs(i - 2));
            this.field24099[i].field25180 = Class9546.method35638(n3 * 0.9f + i * 0.15f * 3.1415927f) * 3.1415927f * 0.1f * Math.abs(i - 2);
        }
    }
    
    static {
        field24096 = new int[][] { { 4, 3, 2 }, { 6, 4, 5 }, { 3, 3, 1 }, { 1, 2, 1 } };
        field24097 = new int[][] { { 0, 0 }, { 0, 5 }, { 0, 14 }, { 0, 18 } };
        field24098 = Class5878.field24096.length;
    }
}
