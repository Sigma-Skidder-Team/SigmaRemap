// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class9536
{
    private static String[] field41044;
    private final Class9094[] field41045;
    public final float field41046;
    public final float field41047;
    public final float field41048;
    public final float field41049;
    public final float field41050;
    public final float field41051;
    
    public Class9536(final int n, final int n2, float field41046, float field41047, float field41048, final float n3, final float n4, final float n5, final float n6, final float n7, final float n8, final boolean b, final float n9, final float n10) {
        this.field41046 = field41046;
        this.field41047 = field41047;
        this.field41048 = field41048;
        this.field41049 = field41046 + n3;
        this.field41050 = field41047 + n4;
        this.field41051 = field41048 + n5;
        this.field41045 = new Class9094[6];
        final float n11 = field41046 + n3;
        final float n12 = field41047 + n4;
        final float n13 = field41048 + n5;
        field41046 -= n6;
        field41047 -= n7;
        field41048 -= n8;
        float n14 = n11 + n6;
        final float n15 = n12 + n7;
        final float n16 = n13 + n8;
        if (b) {
            final float n17 = n14;
            n14 = field41046;
            field41046 = n17;
        }
        final Class8741 class8741 = new Class8741(field41046, field41047, field41048, 0.0f, 0.0f);
        final Class8741 class8742 = new Class8741(n14, field41047, field41048, 0.0f, 8.0f);
        final Class8741 class8743 = new Class8741(n14, n15, field41048, 8.0f, 8.0f);
        final Class8741 class8744 = new Class8741(field41046, n15, field41048, 8.0f, 0.0f);
        final Class8741 class8745 = new Class8741(field41046, field41047, n16, 0.0f, 0.0f);
        final Class8741 class8746 = new Class8741(n14, field41047, n16, 0.0f, 8.0f);
        final Class8741 class8747 = new Class8741(n14, n15, n16, 8.0f, 8.0f);
        final Class8741 class8748 = new Class8741(field41046, n15, n16, 8.0f, 0.0f);
        final float n18 = (float)n;
        final float n19 = n + n5;
        final float n20 = n + n5 + n3;
        final float n21 = n + n5 + n3 + n3;
        final float n22 = n + n5 + n3 + n5;
        final float n23 = n + n5 + n3 + n5 + n3;
        final float n24 = (float)n2;
        final float n25 = n2 + n5;
        final float n26 = n2 + n5 + n4;
        this.field41045[2] = new Class9094(new Class8741[] { class8746, class8745, class8741, class8742 }, n19, n24, n20, n25, n9, n10, b, Class179.field511);
        this.field41045[3] = new Class9094(new Class8741[] { class8743, class8744, class8748, class8747 }, n20, n25, n21, n24, n9, n10, b, Class179.field512);
        this.field41045[1] = new Class9094(new Class8741[] { class8741, class8745, class8748, class8744 }, n18, n25, n19, n26, n9, n10, b, Class179.field515);
        this.field41045[4] = new Class9094(new Class8741[] { class8742, class8741, class8744, class8743 }, n19, n25, n20, n26, n9, n10, b, Class179.field513);
        this.field41045[0] = new Class9094(new Class8741[] { class8746, class8742, class8743, class8747 }, n20, n25, n22, n26, n9, n10, b, Class179.field516);
        this.field41045[5] = new Class9094(new Class8741[] { class8745, class8746, class8747, class8748 }, n22, n25, n23, n26, n9, n10, b, Class179.field514);
    }
    
    public Class9536(final int[][] array, float field41046, float field41047, float field41048, final float n, final float n2, final float n3, final float n4, final float n5, final float n6, final boolean b, final float n7, final float n8) {
        this.field41046 = field41046;
        this.field41047 = field41047;
        this.field41048 = field41048;
        this.field41049 = field41046 + n;
        this.field41050 = field41047 + n2;
        this.field41051 = field41048 + n3;
        this.field41045 = new Class9094[6];
        final float n9 = field41046 + n;
        final float n10 = field41047 + n2;
        final float n11 = field41048 + n3;
        field41046 -= n4;
        field41047 -= n5;
        field41048 -= n6;
        float n12 = n9 + n4;
        final float n13 = n10 + n5;
        final float n14 = n11 + n6;
        if (b) {
            final float n15 = n12;
            n12 = field41046;
            field41046 = n15;
        }
        final Class8741 class8741 = new Class8741(field41046, field41047, field41048, 0.0f, 0.0f);
        final Class8741 class8742 = new Class8741(n12, field41047, field41048, 0.0f, 8.0f);
        final Class8741 class8743 = new Class8741(n12, n13, field41048, 8.0f, 8.0f);
        final Class8741 class8744 = new Class8741(field41046, n13, field41048, 8.0f, 0.0f);
        final Class8741 class8745 = new Class8741(field41046, field41047, n14, 0.0f, 0.0f);
        final Class8741 class8746 = new Class8741(n12, field41047, n14, 0.0f, 8.0f);
        final Class8741 class8747 = new Class8741(n12, n13, n14, 8.0f, 8.0f);
        final Class8741 class8748 = new Class8741(field41046, n13, n14, 8.0f, 0.0f);
        this.field41045[2] = this.method35603(new Class8741[] { class8746, class8745, class8741, class8742 }, array[1], true, n7, n8, b, Class179.field511);
        this.field41045[3] = this.method35603(new Class8741[] { class8743, class8744, class8748, class8747 }, array[0], true, n7, n8, b, Class179.field512);
        this.field41045[1] = this.method35603(new Class8741[] { class8741, class8745, class8748, class8744 }, array[5], false, n7, n8, b, Class179.field515);
        this.field41045[4] = this.method35603(new Class8741[] { class8742, class8741, class8744, class8743 }, array[2], false, n7, n8, b, Class179.field513);
        this.field41045[0] = this.method35603(new Class8741[] { class8746, class8742, class8743, class8747 }, array[4], false, n7, n8, b, Class179.field516);
        this.field41045[5] = this.method35603(new Class8741[] { class8745, class8746, class8747, class8748 }, array[3], false, n7, n8, b, Class179.field514);
    }
    
    private Class9094 method35603(final Class8741[] array, final int[] array2, final boolean b, final float n, final float n2, final boolean b2, final Class179 class179) {
        if (array2 != null) {
            return b ? new Class9094(array, (float)array2[2], (float)array2[3], (float)array2[0], (float)array2[1], n, n2, b2, class179) : new Class9094(array, (float)array2[0], (float)array2[1], (float)array2[2], (float)array2[3], n, n2, b2, class179);
        }
        return null;
    }
}
