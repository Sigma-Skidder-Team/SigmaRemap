// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public enum Class2059
{
    field11751(0, 0.4920635f), 
    field11752(1, 0.52380955f), 
    field11753(2, 0.5555556f), 
    field11754(3, 0.5873016f), 
    field11755(4, 0.61904764f), 
    field11756(5, 0.6666667f), 
    field11757(6, 0.6984127f), 
    field11758(7, 0.74603176f), 
    field11759(8, 0.7936508f), 
    field11760(9, 0.82539684f), 
    field11761(10, 0.8888889f), 
    field11762(11, 0.93650794f), 
    field11763(12, 1.0f), 
    field11764(13, 1.0476191f), 
    field11765(14, 1.1111112f), 
    field11766(15, 1.1746032f), 
    field11767(16, 1.2539682f), 
    field11768(17, 1.3333334f), 
    field11769(18, 1.4126984f), 
    field11770(19, 1.4920635f), 
    field11771(20, 1.5873016f), 
    field11772(21, 1.6666666f), 
    field11773(22, 1.7777778f), 
    field11774(23, 1.8730159f), 
    field11775(24, 2.0f);
    
    public int field11776;
    public float field11777;
    
    Class2059(final int field11776, final float field11777) {
        this.field11776 = field11776;
        this.field11777 = field11777;
    }
    
    public static float method8148(final int n) {
        for (final Class2059 class2059 : values()) {
            if (class2059.field11776 == n) {
                return class2059.field11777;
            }
        }
        return 0.0f;
    }
    
    public static float method8149(final float n) {
        final Class2059[] values = values();
        final int length = values.length;
        int i = 0;
        int n2 = 0;
        float abs = Math.abs(values[0].field11777 - n);
        while (i < length) {
            final float abs2 = Math.abs(values[i].field11777 - n);
            if (abs2 < abs) {
                n2 = i;
                abs = abs2;
            }
            ++i;
        }
        return (float)values[n2].field11776;
    }
}
