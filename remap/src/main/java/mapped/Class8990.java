// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.HashMap;
import java.io.InputStream;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import org.lwjgl.opengl.GL11;
import java.util.Arrays;
import org.lwjgl.BufferUtils;
import java.util.Map;
import java.nio.IntBuffer;
import java.nio.ByteBuffer;

public class Class8990
{
    public static final int field37926 = 1048576;
    public static ByteBuffer field37927;
    public static IntBuffer field37928;
    public static int[] field37929;
    public static final int field37930 = 0;
    public static final int field37931 = -8421377;
    public static final int field37932 = 0;
    public static Map<Integer, Class9025> field37933;
    
    public static IntBuffer method32036(final int n) {
        if (Class8990.field37928.capacity() < n) {
            Class8990.field37927 = BufferUtils.createByteBuffer(method32038(n) * 4);
            Class8990.field37928 = Class8990.field37927.asIntBuffer();
        }
        return Class8990.field37928;
    }
    
    public static int[] method32037(final int n) {
        if (Class8990.field37929 == null) {
            Class8990.field37929 = new int[1048576];
        }
        if (Class8990.field37929.length < n) {
            Class8990.field37929 = new int[method32038(n)];
        }
        return Class8990.field37929;
    }
    
    public static int method32038(final int n) {
        final int n2 = n - 1;
        final int n3 = n2 | n2 >> 1;
        final int n4 = n3 | n3 >> 2;
        final int n5 = n4 | n4 >> 4;
        final int n6 = n5 | n5 >> 8;
        return (n6 | n6 >> 16) + 1;
    }
    
    public static int method32039(final int n) {
        final int n2 = 0;
        final int n3;
        Label_0053_Outer:Label_0032_Outer:
        while (true) {
        Label_0032:
            while (true) {
                while (true) {
                    Label_0080: {
                        if ((n3 & Integer.MAX_VALUE) == 0x0) {
                            break Label_0080;
                        }
                        if ((n3 & Integer.MAX_VALUE) == 0x0) {
                            break Label_0053;
                        }
                        if ((n3 & 0x100) == 0x0) {}
                        if ((n3 & 0x10000000) != 0x0) {
                            break Label_0080;
                        }
                        if ((n3 & Integer.MAX_VALUE) != 0x0 && (n3 & 0x100) == 0x0) {
                            continue Label_0053_Outer;
                        }
                        if ((n3 & 0x800000) != 0x0) {
                            if ((n3 & 0x4) != 0x0) {
                                continue Label_0032;
                            }
                            if ((n3 & 0x8000000) == 0x0) {
                                continue Label_0053_Outer;
                            }
                        }
                    }
                    if ((n3 & 0x8000000) == 0x0) {
                        continue Label_0032_Outer;
                    }
                    break;
                }
                if ((n3 & 0x8000000) == 0x0) {
                    continue Label_0032;
                }
                break;
            }
            if ((n3 & 0x10000000) == 0x0) {
                break;
            }
        }
        return n2;
    }
    
    public static IntBuffer method32040(final int n, final int val) {
        method32037(n);
        method32036(n);
        Arrays.fill(Class8990.field37929, 0, n, val);
        Class8990.field37928.put(Class8990.field37929, 0, n);
        return Class8990.field37928;
    }
    
    public static int[] method32041(final int n) {
        final int[] a = new int[n * 3];
        Arrays.fill(a, 0, n, 0);
        Arrays.fill(a, n, n * 2, -8421377);
        Arrays.fill(a, n * 2, n * 3, 0);
        return a;
    }
    
    public static int[] method32042(final int n, final int val) {
        final int[] a = new int[n * 3];
        Arrays.fill(a, 0, n, val);
        Arrays.fill(a, n, n * 2, -8421377);
        Arrays.fill(a, n * 2, n * 3, 0);
        return a;
    }
    
    public static Class9025 method32043(final Class1666 class1666) {
        Class9025 field9438 = class1666.field9438;
        if (field9438 == null) {
            final int method5869 = class1666.method5869();
            field9438 = Class8990.field37933.get(method5869);
            if (field9438 == null) {
                field9438 = new Class9025(method5869, GL11.glGenTextures(), GL11.glGenTextures());
                Class8990.field37933.put(method5869, field9438);
            }
            class1666.field9438 = field9438;
        }
        return field9438;
    }
    
    public static void method32044(final Class1666 class1666, final int i) {
        final Class9025 field9438 = class1666.field9438;
        if (field9438 != null) {
            class1666.field9438 = null;
            Class8990.field37933.remove(field9438.field38156);
            Class8933.method31616(field9438.field38157);
            Class8933.method31616(field9438.field38158);
            if (field9438.field38156 != i) {
                Class8885.method31271("Error : MultiTexID.base mismatch: " + field9438.field38156 + ", texid: " + i);
                Class8933.method31616(field9438.field38156);
            }
        }
    }
    
    public static void method32045(final int n, final int n2) {
        if (Class9216.field39045) {
            if (Class8933.method31665() == 33984) {
                Class8933.method31608(33985);
                Class8933.method31617(n);
                Class8933.method31608(33987);
                Class8933.method31617(n2);
                Class8933.method31608(33984);
            }
        }
    }
    
    public static void method32046(final Class9025 class9025) {
        method32045(class9025.field38157, class9025.field38158);
    }
    
    public static void method32047(final int n, final int n2, final int n3) {
        if (Class9216.field39045) {
            if (Class8933.method31665() == 33984) {
                Class8933.method31608(33985);
                Class8933.method31617(n2);
                Class8933.method31608(33987);
                Class8933.method31617(n3);
                Class8933.method31608(33984);
            }
        }
        Class8933.method31617(n);
    }
    
    public static void method32048(final Class9025 class9025) {
        if (Class9216.field39045) {
            if (Class8933.method31665() == 33984) {
                if (Class9216.field39313) {
                    Class8933.method31608(33985);
                    Class8933.method31617(class9025.field38157);
                }
                if (Class9216.field39314) {
                    Class8933.method31608(33987);
                    Class8933.method31617(class9025.field38158);
                }
                Class8933.method31608(33984);
            }
        }
        Class8933.method31617(class9025.field38156);
    }
    
    public static void method32049(final Class1666 class1666) {
        class1666.method5869();
        method32048(class1666.method5874());
        if (Class8933.method31665() == 33984) {
            final int field39122 = Class9216.field39122;
            final int field39123 = Class9216.field39123;
            if (!(class1666 instanceof Class1774)) {
                Class9216.field39122 = 0;
                Class9216.field39123 = 0;
            }
            else {
                Class9216.field39122 = ((Class1774)class1666).field9869;
                Class9216.field39123 = ((Class1774)class1666).field9870;
            }
            if (Class9216.field39122 != field39122 || Class9216.field39123 != field39123) {
                Class9216.field39211.method16089(Class9216.field39122, Class9216.field39123);
            }
        }
    }
    
    public static void method32050(final int i) {
        method32048(Class8990.field37933.get(i));
    }
    
    public static void method32051(final Class1773 class1773) {
        final Class9025 method5874 = class1773.method5874();
        final Class1846 method5875 = class1773.method6328();
        final int method5876 = method5875.method6644();
        final int method5877 = method5875.method6645();
        final Class1846 method5878 = method32068(method5876, method5877, -8421377);
        Class8995.method32103(method5874.field38157, method5876, method5877);
        method5878.method6654(0, 0, 0, 0, 0, method5876, method5877, false, false, false, true);
        final Class1846 method5879 = method32068(method5876, method5877, 0);
        Class8995.method32103(method5874.field38158, method5876, method5877);
        method5879.method6654(0, 0, 0, 0, 0, method5876, method5877, false, false, false, true);
        Class8933.method31617(method5874.field38156);
    }
    
    public static void method32052(final int[] src, final int n, final int n2, final int n3, final int n4, final int n5) {
        final int n6 = n * n2;
        final IntBuffer method32036 = method32036(n6);
        method32036.clear();
        final int offset = n5 * n6;
        if (src.length >= offset + n6) {
            method32036.put(src, offset, n6).position().limit(n6);
            Class8969.method31850();
            GL11.glTexSubImage2D(3553, 0, n3, n4, n, n2, 32993, 33639, method32036);
            method32036.clear();
        }
    }
    
    public static Class1666 method32053() {
        final Class1773 class1773 = new Class1773(1, 1, true);
        class1773.method6328().method6648(0, 0, -1);
        class1773.method6327();
        return class1773;
    }
    
    public static void method32054(final int n, final int n2, final int n3, final Class1774 class1774) {
        final Class9025 method32043 = method32043(class1774);
        if (Class9216.field39313) {
            Class8885.method31272("Allocate texture map normal: " + n2 + "x" + n3 + ", mipmaps: " + n);
            Class8995.method32105(method32043.field38157, n, n2, n3);
        }
        if (Class9216.field39314) {
            Class8885.method31272("Allocate texture map specular: " + n2 + "x" + n3 + ", mipmaps: " + n);
            Class8995.method32105(method32043.field38158, n, n2, n3);
        }
        Class8933.method31617(method32043.field38156);
    }
    
    private static Class1846[] method32055(final Class1846 class1846, int n) {
        if (n < 0) {
            n = 0;
        }
        final Class1846[] array = new Class1846[n + 1];
        array[0] = class1846;
        if (n > 0) {
            for (int i = 1; i <= n; ++i) {
                final Class1846 class1847 = array[i - 1];
                final Class1846 class1848 = new Class1846(class1847.method6644() >> 1, class1847.method6645() >> 1, false);
                final int method6644 = class1848.method6644();
                final int method6645 = class1848.method6645();
                for (int j = 0; j < method6644; ++j) {
                    for (int k = 0; k < method6645; ++k) {
                        class1848.method6648(j, k, method32060(class1847.method6647(j * 2 + 0, k * 2 + 0), class1847.method6647(j * 2 + 1, k * 2 + 0), class1847.method6647(j * 2 + 0, k * 2 + 1), class1847.method6647(j * 2 + 1, k * 2 + 1)));
                    }
                }
                array[i] = class1848;
            }
        }
        return array;
    }
    
    public static BufferedImage method32056(final Class1932 class1932) {
        try {
            if (!Class8571.method28900(class1932)) {
                return null;
            }
            final InputStream method28897 = Class8571.method28897(class1932);
            if (method28897 == null) {
                return null;
            }
            final BufferedImage read = ImageIO.read(method28897);
            method28897.close();
            return read;
        }
        catch (final IOException ex) {
            return null;
        }
    }
    
    public static int[][] method32057(final int n, final int n2, final int[][] array) {
        for (int i = 1; i <= n; ++i) {
            if (array[i] == null) {
                final int n3 = n2 >> i;
                final int n4 = n3 * 2;
                final int[] array2 = array[i - 1];
                final int n5 = i;
                final int[] array3 = new int[n3 * n3];
                array[n5] = array3;
                final int[] array4 = array3;
                for (int j = 0; j < n3; ++j) {
                    for (int k = 0; k < n3; ++k) {
                        final int n6 = j * 2 * n4 + k * 2;
                        array4[j * n3 + k] = method32060(array2[n6], array2[n6 + 1], array2[n6 + n4], array2[n6 + n4 + 1]);
                    }
                }
            }
        }
        return array;
    }
    
    public static void method32058(final int[][] array, final int n, final int n2, final int n3, final int n4, final int n5) {
        Class8969.method31850();
        final IntBuffer method32036 = method32036(n * n2);
        final int length = array.length;
        for (int n6 = 0, i = n, n7 = n2, n8 = n3, n9 = n4; i > 0; i >>= 1, n7 >>= 1, n8 >>= 1, n9 >>= 1, ++n6) {
            if (n7 <= 0) {
                break;
            }
            if (n6 >= length) {
                break;
            }
            final int n10 = i * n7;
            final int[] src = array[n6];
            method32036.clear();
            if (src.length >= n10 * (n5 + 1)) {
                method32036.put(src, n10 * n5, n10).position().limit(n10);
                GL11.glTexSubImage2D(3553, n6, n8, n9, i, n7, 32993, 33639, method32036);
            }
        }
        method32036.clear();
    }
    
    public static int method32059(final int n, final int n2, final int n3, final int n4) {
        int n5 = n >>> 24 & 0xFF;
        int n6 = n2 >>> 24 & 0xFF;
        int n7 = n3 >>> 24 & 0xFF;
        int n8 = n4 >>> 24 & 0xFF;
        final int n9 = n5 + n6 + n7 + n8;
        final int n10 = (n9 + 2) / 4;
        int n11;
        if (n9 == 0) {
            n11 = 4;
            n5 = 1;
            n6 = 1;
            n7 = 1;
            n8 = 1;
        }
        else {
            n11 = n9;
        }
        final int n12 = (n11 + 1) / 2;
        return n10 << 24 | ((n >>> 16 & 0xFF) * n5 + (n2 >>> 16 & 0xFF) * n6 + (n3 >>> 16 & 0xFF) * n7 + (n4 >>> 16 & 0xFF) * n8 + n12) / n11 << 16 | ((n >>> 8 & 0xFF) * n5 + (n2 >>> 8 & 0xFF) * n6 + (n3 >>> 8 & 0xFF) * n7 + (n4 >>> 8 & 0xFF) * n8 + n12) / n11 << 8 | ((n >>> 0 & 0xFF) * n5 + (n2 >>> 0 & 0xFF) * n6 + (n3 >>> 0 & 0xFF) * n7 + (n4 >>> 0 & 0xFF) * n8 + n12) / n11 << 0;
    }
    
    public static int method32060(final int n, final int n2, final int n3, final int n4) {
        return ((n >>> 24 & 0xFF) + (n2 >>> 24 & 0xFF) + (n3 >>> 24 & 0xFF) + (n4 >>> 24 & 0xFF) + 2) / 4 << 24 | ((n >>> 16 & 0xFF) + (n2 >>> 16 & 0xFF) + (n3 >>> 16 & 0xFF) + (n4 >>> 16 & 0xFF) + 2) / 4 << 16 | ((n >>> 8 & 0xFF) + (n2 >>> 8 & 0xFF) + (n3 >>> 8 & 0xFF) + (n4 >>> 8 & 0xFF) + 2) / 4 << 8 | ((n >>> 0 & 0xFF) + (n2 >>> 0 & 0xFF) + (n3 >>> 0 & 0xFF) + (n4 >>> 0 & 0xFF) + 2) / 4 << 0;
    }
    
    public static void method32061(final int[] array, final int n, final int a, final int b) {
        Math.min(a, b);
        int n2 = n;
        int i = a;
        int n3 = b;
        int n4 = 0;
        int n5 = 0;
        int j = 0;
        while (i > 1) {
            if (n3 <= 1) {
                break;
            }
            n4 = n2 + i * n3;
            n5 = i / 2;
            final int n6 = n3 / 2;
            for (int k = 0; k < n6; ++k) {
                final int n7 = n4 + k * n5;
                final int n8 = n2 + k * 2 * i;
                for (int l = 0; l < n5; ++l) {
                    array[n7 + l] = method32059(array[n8 + l * 2], array[n8 + l * 2 + 1], array[n8 + i + l * 2], array[n8 + i + l * 2 + 1]);
                }
            }
            ++j;
            i = n5;
            n3 = n6;
            n2 = n4;
        }
        while (j > 0) {
            --j;
            final int n9 = a >> j;
            final int n10 = b >> j;
            int n12;
            final int n11 = n12 = n4 - n9 * n10;
            for (int n13 = 0; n13 < n10; ++n13) {
                for (int n14 = 0; n14 < n9; ++n14) {
                    if (array[n12] == 0) {
                        array[n12] = (array[n4 + n13 / 2 * n5 + n14 / 2] & 0xFFFFFF);
                    }
                    ++n12;
                }
            }
            n4 = n11;
            n5 = n9;
        }
    }
    
    public static void method32062(final int[] array, final int n, final int a, final int b) {
        Math.min(a, b);
        int n2 = n;
        int i = a;
        int n3 = b;
        int n4 = 0;
        int n5 = 0;
        int j = 0;
        while (i > 1) {
            if (n3 <= 1) {
                break;
            }
            n4 = n2 + i * n3;
            n5 = i / 2;
            final int n6 = n3 / 2;
            for (int k = 0; k < n6; ++k) {
                final int n7 = n4 + k * n5;
                final int n8 = n2 + k * 2 * i;
                for (int l = 0; l < n5; ++l) {
                    array[n7 + l] = method32060(array[n8 + l * 2], array[n8 + l * 2 + 1], array[n8 + i + l * 2], array[n8 + i + l * 2 + 1]);
                }
            }
            ++j;
            i = n5;
            n3 = n6;
            n2 = n4;
        }
        while (j > 0) {
            --j;
            final int n9 = a >> j;
            final int n10 = b >> j;
            int n12;
            final int n11 = n12 = n4 - n9 * n10;
            for (int n13 = 0; n13 < n10; ++n13) {
                for (int n14 = 0; n14 < n9; ++n14) {
                    if (array[n12] == 0) {
                        array[n12] = (array[n4 + n13 / 2 * n5 + n14 / 2] & 0xFFFFFF);
                    }
                    ++n12;
                }
            }
            n4 = n11;
            n5 = n9;
        }
    }
    
    public static boolean method32063(final int[] array, final int n, final int n2) {
        final int n3 = n * n2;
        if (array[0] >>> 24 == 255 && array[n3 - 1] == 0) {
            return true;
        }
        for (int i = 0; i < n3; ++i) {
            final int n4 = array[i] >>> 24;
            if (n4 != 0 && n4 != 255) {
                return true;
            }
        }
        return false;
    }
    
    public static void method32064(final int[] array, final int n, final int n2, final int n3, final int n4) {
        int n5 = 0;
        for (int n6 = n, n7 = n2, n8 = n3, n9 = n4; n6 > 0 && n7 > 0; n6 /= 2, n7 /= 2, n8 /= 2, n9 /= 2) {
            GL11.glCopyTexSubImage2D(3553, n5, n8, n9, 0, 0, n6, n7);
            ++n5;
        }
    }
    
    public static void method32065(final Class9025 class9025, final int[] src, final int n, final int n2, final int n3, final int n4, final boolean b, final boolean b2) {
        final int newLimit = n * n2;
        final IntBuffer method32036 = method32036(newLimit);
        Class8969.method31850();
        method32036.clear();
        method32036.put(src, 0, newLimit);
        method32036.position().limit(newLimit);
        Class8933.method31617(class9025.field38156);
        GL11.glTexParameteri(3553, 10241, 9728);
        GL11.glTexParameteri(3553, 10240, 9728);
        GL11.glTexParameteri(3553, 10242, 10497);
        GL11.glTexParameteri(3553, 10243, 10497);
        GL11.glTexSubImage2D(3553, 0, n3, n4, n, n2, 32993, 33639, method32036);
        if (src.length == newLimit * 3) {
            method32036.clear();
            method32036.put(src, newLimit, newLimit).position();
            method32036.position().limit(newLimit);
        }
        Class8933.method31617(class9025.field38157);
        GL11.glTexParameteri(3553, 10241, 9728);
        GL11.glTexParameteri(3553, 10240, 9728);
        GL11.glTexParameteri(3553, 10242, 10497);
        GL11.glTexParameteri(3553, 10243, 10497);
        GL11.glTexSubImage2D(3553, 0, n3, n4, n, n2, 32993, 33639, method32036);
        if (src.length == newLimit * 3) {
            method32036.clear();
            method32036.put(src, newLimit * 2, newLimit);
            method32036.position().limit(newLimit);
        }
        Class8933.method31617(class9025.field38158);
        GL11.glTexParameteri(3553, 10241, 9728);
        GL11.glTexParameteri(3553, 10240, 9728);
        GL11.glTexParameteri(3553, 10242, 10497);
        GL11.glTexParameteri(3553, 10243, 10497);
        GL11.glTexSubImage2D(3553, 0, n3, n4, n, n2, 32993, 33639, method32036);
        Class8933.method31608(33984);
    }
    
    public static Class1932 method32066(final Class1932 class1932, final String str) {
        if (class1932 != null) {
            return new Class1932(class1932.method7798(), class1932.method7797().split(".png")[0] + "_" + str + ".png");
        }
        return null;
    }
    
    private static Class1846 method32067(final Class6582 class6582, final Class1932 class6583, final int n, final int n2, final int n3) {
        Class1846 method32069 = method32069(class6582, class6583, n, n2);
        if (method32069 == null) {
            method32069 = new Class1846(n, n2, false);
            method32069.method6663(0, 0, n, n2, Class8969.method31849(n3));
        }
        return method32069;
    }
    
    private static Class1846 method32068(final int n, final int n2, final int n3) {
        final Class1846 class1846 = new Class1846(n, n2, false);
        class1846.method6675(Class8969.method31849(n3));
        return class1846;
    }
    
    private static Class1846 method32069(final Class6582 class6582, final Class1932 class6583, final int n, final int n2) {
        if (class6583 == null) {
            return null;
        }
        try {
            final Class1846 method6637 = Class1846.method6637(class6582.method19933(class6583).method5887());
            if (method6637 == null) {
                return null;
            }
            if (method6637.method6644() == n && method6637.method6645() == n2) {
                return method6637;
            }
            method6637.close();
            return null;
        }
        catch (final IOException ex) {
            return null;
        }
    }
    
    public static void method32070(final int n, final Class1846 class1846, final boolean b, final boolean b2, final Class6582 class1847, final Class1932 class1848, final Class9025 class1849) {
        final int method6644 = class1846.method6644();
        final int method6645 = class1846.method6645();
        final Class1846 method6646 = method32067(class1847, method32066(class1848, "n"), method6644, method6645, -8421377);
        Class8995.method32105(class1849.field38157, 0, method6644, method6645);
        method6646.method6654(0, 0, 0, 0, 0, method6644, method6645, b, b2, false, true);
        final Class1846 method6647 = method32067(class1847, method32066(class1848, "s"), method6644, method6645, 0);
        Class8995.method32105(class1849.field38158, 0, method6644, method6645);
        method6647.method6654(0, 0, 0, 0, 0, method6644, method6645, b, b2, false, true);
        Class8933.method31617(class1849.field38156);
    }
    
    public static void method32071(final int[] array, final int n, final int n2, final int n3) {
    }
    
    public static int method32072(final int n, final int n2, final int n3) {
        final int n4 = 255 - n3;
        return ((n >>> 24 & 0xFF) * n3 + (n2 >>> 24 & 0xFF) * n4) / 255 << 24 | ((n >>> 16 & 0xFF) * n3 + (n2 >>> 16 & 0xFF) * n4) / 255 << 16 | ((n >>> 8 & 0xFF) * n3 + (n2 >>> 8 & 0xFF) * n4) / 255 << 8 | ((n >>> 0 & 0xFF) * n3 + (n2 >>> 0 & 0xFF) * n4) / 255 << 0;
    }
    
    public static void method32073() {
        final Class1666 method5853 = Class869.method5277().method5290().method5853(Class1774.field9853);
        if (method5853 != null) {
            final Class9025 method5854 = method5853.method5874();
            Class8933.method31617(method5854.field38156);
            GL11.glTexParameteri(3553, 10241, Class9216.field39322[Class9216.field39306]);
            GL11.glTexParameteri(3553, 10240, Class9216.field39323[Class9216.field39309]);
            Class8933.method31617(method5854.field38157);
            GL11.glTexParameteri(3553, 10241, Class9216.field39322[Class9216.field39307]);
            GL11.glTexParameteri(3553, 10240, Class9216.field39323[Class9216.field39310]);
            Class8933.method31617(method5854.field38158);
            GL11.glTexParameteri(3553, 10241, Class9216.field39322[Class9216.field39308]);
            GL11.glTexParameteri(3553, 10240, Class9216.field39323[Class9216.field39311]);
            Class8933.method31617(0);
        }
    }
    
    public static int[][] method32074(final int[][] array, final int n, final int n2, final int n3) {
        final int length = array.length;
        final int[][] array2 = new int[length][];
        for (int i = 0; i < length; ++i) {
            final int[] array3 = array[i];
            if (array3 != null) {
                final int n4 = (n >> i) * (n2 >> i);
                final int[] array4 = new int[n4 * 3];
                array2[i] = array4;
                final int n5 = array3.length / 3;
                final int n6 = n4 * n3;
                final int n7 = 0;
                System.arraycopy(array3, n6, array4, n7, n4);
                final int n8 = n6 + n5;
                final int n9 = n7 + n4;
                System.arraycopy(array3, n8, array4, n9, n4);
                System.arraycopy(array3, n8 + n5, array4, n9 + n4, n4);
            }
        }
        return array2;
    }
    
    public static int[][] method32075(final Class1912 class1912, final int[][] array, final int n, final int n2) {
        return array;
    }
    
    public static void method32076(final Class1912 class1912, final int[] array) {
    }
    
    static {
        Class8990.field37927 = BufferUtils.createByteBuffer(4194304);
        Class8990.field37928 = Class8990.field37927.asIntBuffer();
        Class8990.field37929 = new int[1048576];
        Class8990.field37933 = new HashMap<Integer, Class9025>();
    }
}
