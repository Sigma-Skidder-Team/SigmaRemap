// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.Direction;

import java.util.BitSet;

public class Class9436
{
    private static String[] field40463;
    private final float[] field40464;
    private final int[] field40465;
    private Class384 field40466;
    
    public Class9436() {
        this(null);
    }
    
    public Class9436(final Class9144 class9144) {
        this.field40464 = new float[4];
        this.field40465 = new int[4];
        this.field40466 = new Class384();
    }
    
    public void method35061() {
        final int n = 240;
        final int[] field40465 = this.field40465;
        final int n2 = 0;
        field40465[n2] |= n;
        final int[] field40466 = this.field40465;
        final int n3 = 1;
        field40466[n3] |= n;
        final int[] field40467 = this.field40465;
        final int n4 = 2;
        field40467[n4] |= n;
        final int[] field40468 = this.field40465;
        final int n5 = 3;
        field40468[n5] |= n;
        this.field40464[0] = 1.0f;
        this.field40464[1] = 1.0f;
        this.field40464[2] = 1.0f;
        this.field40464[3] = 1.0f;
    }
    
    public void method35062(final Class1856 class1856, final BlockState class1857, final BlockPos class1858, final Direction class1859, final float[] array, final BitSet set) {
        final BlockPos class1860 = set.get(0) ? class1858.method1149(class1859) : class1858;
        final Class1973 method7975 = Class1973.method7975(class1859);
        final Class384 field40466 = this.field40466;
        Class9144.method33372();
        field40466.method1281(class1860, Class1973.method7977(method7975)[0]);
        final BlockState method7976 = class1856.getBlockState(field40466);
        final int method7977 = Class7781.method24980(method7976, class1856, field40466);
        final float method7978 = Class7781.method24979(method7976, class1856, field40466);
        field40466.method1281(class1860, Class1973.method7977(method7975)[1]);
        final BlockState method7979 = class1856.getBlockState(field40466);
        final int method7980 = Class7781.method24980(method7979, class1856, field40466);
        final float method7981 = Class7781.method24979(method7979, class1856, field40466);
        field40466.method1281(class1860, Class1973.method7977(method7975)[2]);
        final BlockState method7982 = class1856.getBlockState(field40466);
        final int method7983 = Class7781.method24980(method7982, class1856, field40466);
        final float method7984 = Class7781.method24979(method7982, class1856, field40466);
        field40466.method1281(class1860, Class1973.method7977(method7975)[3]);
        final BlockState method7985 = class1856.getBlockState(field40466);
        final int method7986 = Class7781.method24980(method7985, class1856, field40466);
        final float method7987 = Class7781.method24979(method7985, class1856, field40466);
        field40466.method1282(class1860, Class1973.method7977(method7975)[0], class1859);
        final boolean b = class1856.getBlockState(field40466).getOpacity(class1856, field40466) == 0;
        field40466.method1282(class1860, Class1973.method7977(method7975)[1], class1859);
        final boolean b2 = class1856.getBlockState(field40466).getOpacity(class1856, field40466) == 0;
        field40466.method1282(class1860, Class1973.method7977(method7975)[2], class1859);
        final boolean b3 = class1856.getBlockState(field40466).getOpacity(class1856, field40466) == 0;
        field40466.method1282(class1860, Class1973.method7977(method7975)[3], class1859);
        final boolean b4 = class1856.getBlockState(field40466).getOpacity(class1856, field40466) == 0;
        float method7988;
        int method7989;
        if (!b3 && !b) {
            method7988 = method7978;
            method7989 = method7977;
        }
        else {
            field40466.method1282(class1860, Class1973.method7977(method7975)[0], Class1973.method7977(method7975)[2]);
            final BlockState method7990 = class1856.getBlockState(field40466);
            method7988 = Class7781.method24979(method7990, class1856, field40466);
            method7989 = Class7781.method24980(method7990, class1856, field40466);
        }
        float method7991;
        int method7992;
        if (!b4 && !b) {
            method7991 = method7978;
            method7992 = method7977;
        }
        else {
            field40466.method1282(class1860, Class1973.method7977(method7975)[0], Class1973.method7977(method7975)[3]);
            final BlockState method7993 = class1856.getBlockState(field40466);
            method7991 = Class7781.method24979(method7993, class1856, field40466);
            method7992 = Class7781.method24980(method7993, class1856, field40466);
        }
        float method7994;
        int method7995;
        if (!b3 && !b2) {
            method7994 = method7978;
            method7995 = method7977;
        }
        else {
            field40466.method1282(class1860, Class1973.method7977(method7975)[1], Class1973.method7977(method7975)[2]);
            final BlockState method7996 = class1856.getBlockState(field40466);
            method7994 = Class7781.method24979(method7996, class1856, field40466);
            method7995 = Class7781.method24980(method7996, class1856, field40466);
        }
        float method7997;
        int method7998;
        if (!b4 && !b2) {
            method7997 = method7978;
            method7998 = method7977;
        }
        else {
            field40466.method1282(class1860, Class1973.method7977(method7975)[1], Class1973.method7977(method7975)[3]);
            final BlockState method7999 = class1856.getBlockState(field40466);
            method7997 = Class7781.method24979(method7999, class1856, field40466);
            method7998 = Class7781.method24980(method7999, class1856, field40466);
        }
        int n = Class7781.method24980(class1857, class1856, class1858);
        field40466.method1281(class1858, class1859);
        final BlockState method8000 = class1856.getBlockState(field40466);
        if (set.get(0) || !method8000.isOpaqueCube(class1856, field40466)) {
            n = Class7781.method24980(method8000, class1856, field40466);
        }
        final float n2 = set.get(0) ? Class7781.method24979(class1856.getBlockState(class1860), class1856, class1860) : Class7781.method24979(class1856.getBlockState(class1858), class1856, class1858);
        final Class99 method8001 = Class99.method577(class1859);
        if (set.get(1) && Class1973.method7978(method7975)) {
            final float n3 = (method7987 + method7978 + method7991 + n2) * 0.25f;
            final float n4 = (method7984 + method7978 + method7988 + n2) * 0.25f;
            final float n5 = (method7984 + method7981 + method7994 + n2) * 0.25f;
            final float n6 = (method7987 + method7981 + method7997 + n2) * 0.25f;
            final float n7 = array[Class2018.method8059(Class1973.method7979(method7975)[0])] * array[Class2018.method8059(Class1973.method7979(method7975)[1])];
            final float n8 = array[Class2018.method8059(Class1973.method7979(method7975)[2])] * array[Class2018.method8059(Class1973.method7979(method7975)[3])];
            final float n9 = array[Class2018.method8059(Class1973.method7979(method7975)[4])] * array[Class2018.method8059(Class1973.method7979(method7975)[5])];
            final float n10 = array[Class2018.method8059(Class1973.method7979(method7975)[6])] * array[Class2018.method8059(Class1973.method7979(method7975)[7])];
            final float n11 = array[Class2018.method8059(Class1973.method7980(method7975)[0])] * array[Class2018.method8059(Class1973.method7980(method7975)[1])];
            final float n12 = array[Class2018.method8059(Class1973.method7980(method7975)[2])] * array[Class2018.method8059(Class1973.method7980(method7975)[3])];
            final float n13 = array[Class2018.method8059(Class1973.method7980(method7975)[4])] * array[Class2018.method8059(Class1973.method7980(method7975)[5])];
            final float n14 = array[Class2018.method8059(Class1973.method7980(method7975)[6])] * array[Class2018.method8059(Class1973.method7980(method7975)[7])];
            final float n15 = array[Class2018.method8059(Class1973.method7981(method7975)[0])] * array[Class2018.method8059(Class1973.method7981(method7975)[1])];
            final float n16 = array[Class2018.method8059(Class1973.method7981(method7975)[2])] * array[Class2018.method8059(Class1973.method7981(method7975)[3])];
            final float n17 = array[Class2018.method8059(Class1973.method7981(method7975)[4])] * array[Class2018.method8059(Class1973.method7981(method7975)[5])];
            final float n18 = array[Class2018.method8059(Class1973.method7981(method7975)[6])] * array[Class2018.method8059(Class1973.method7981(method7975)[7])];
            final float n19 = array[Class2018.method8059(Class1973.method7982(method7975)[0])] * array[Class2018.method8059(Class1973.method7982(method7975)[1])];
            final float n20 = array[Class2018.method8059(Class1973.method7982(method7975)[2])] * array[Class2018.method8059(Class1973.method7982(method7975)[3])];
            final float n21 = array[Class2018.method8059(Class1973.method7982(method7975)[4])] * array[Class2018.method8059(Class1973.method7982(method7975)[5])];
            final float n22 = array[Class2018.method8059(Class1973.method7982(method7975)[6])] * array[Class2018.method8059(Class1973.method7982(method7975)[7])];
            this.field40464[Class99.method579(method8001)] = n3 * n7 + n4 * n8 + n5 * n9 + n6 * n10;
            this.field40464[Class99.method580(method8001)] = n3 * n11 + n4 * n12 + n5 * n13 + n6 * n14;
            this.field40464[Class99.method581(method8001)] = n3 * n15 + n4 * n16 + n5 * n17 + n6 * n18;
            this.field40464[Class99.method582(method8001)] = n3 * n19 + n4 * n20 + n5 * n21 + n6 * n22;
            final int method8002 = this.method35063(method7986, method7977, method7992, n);
            final int method8003 = this.method35063(method7983, method7977, method7989, n);
            final int method8004 = this.method35063(method7983, method7980, method7995, n);
            final int method8005 = this.method35063(method7986, method7980, method7998, n);
            this.field40465[Class99.method579(method8001)] = this.method35064(method8002, method8003, method8004, method8005, n7, n8, n9, n10);
            this.field40465[Class99.method580(method8001)] = this.method35064(method8002, method8003, method8004, method8005, n11, n12, n13, n14);
            this.field40465[Class99.method581(method8001)] = this.method35064(method8002, method8003, method8004, method8005, n15, n16, n17, n18);
            this.field40465[Class99.method582(method8001)] = this.method35064(method8002, method8003, method8004, method8005, n19, n20, n21, n22);
        }
        else {
            final float n23 = (method7987 + method7978 + method7991 + n2) * 0.25f;
            final float n24 = (method7984 + method7978 + method7988 + n2) * 0.25f;
            final float n25 = (method7984 + method7981 + method7994 + n2) * 0.25f;
            final float n26 = (method7987 + method7981 + method7997 + n2) * 0.25f;
            this.field40465[Class99.method579(method8001)] = this.method35063(method7986, method7977, method7992, n);
            this.field40465[Class99.method580(method8001)] = this.method35063(method7983, method7977, method7989, n);
            this.field40465[Class99.method581(method8001)] = this.method35063(method7983, method7980, method7995, n);
            this.field40465[Class99.method582(method8001)] = this.method35063(method7986, method7980, method7998, n);
            this.field40464[Class99.method579(method8001)] = n23;
            this.field40464[Class99.method580(method8001)] = n24;
            this.field40464[Class99.method581(method8001)] = n25;
            this.field40464[Class99.method582(method8001)] = n26;
        }
    }
    
    private int method35063(int n, int n2, int n3, final int n4) {
        if (n == 0) {
            n = n4;
        }
        if (n2 == 0) {
            n2 = n4;
        }
        if (n3 == 0) {
            n3 = n4;
        }
        return n + n2 + n3 + n4 >> 2 & 0xFF00FF;
    }
    
    private int method35064(final int n, final int n2, final int n3, final int n4, final float n5, final float n6, final float n7, final float n8) {
        return ((int)((n >> 16 & 0xFF) * n5 + (n2 >> 16 & 0xFF) * n6 + (n3 >> 16 & 0xFF) * n7 + (n4 >> 16 & 0xFF) * n8) & 0xFF) << 16 | ((int)((n & 0xFF) * n5 + (n2 & 0xFF) * n6 + (n3 & 0xFF) * n7 + (n4 & 0xFF) * n8) & 0xFF);
    }
}
