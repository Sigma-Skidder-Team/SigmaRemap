// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.lwjgl.opengl.GL20;
import java.nio.IntBuffer;
import java.nio.FloatBuffer;
import java.nio.ByteBuffer;

public class Class8900
{
    private static String[] field37411;
    public int field37412;
    public int field37413;
    public int field37414;
    public int field37415;
    public boolean field37416;
    public boolean field37417;
    public boolean field37418;
    public boolean field37419;
    public long[] field37420;
    public int field37421;
    
    public Class8900() {
        this.field37420 = new long[10];
        this.field37421 = 0;
        this.field37420[this.field37421] = 0L;
    }
    
    public static void method31334(final Class4148 class4148) {
        class4148.field18495 = new Class8900();
    }
    
    public void method31335(final long n) {
        ++this.field37421;
        this.field37420[this.field37421] = n;
    }
    
    public void method31336() {
        this.field37420[this.field37421] = 0L;
        --this.field37421;
    }
    
    public static void method31337(final Class7096 class7096, final Class4150 class7097) {
        if (class7097 instanceof Class4148) {
            ((Class4148)class7097).field18495.method31335(((long)(Class3660.method11271(class7096) & 0xFFFF) << 32) + (((Class3660.method11287(class7096) & 0xFFFF) << 16) + (Class3660.method11269(class7096) & 0xFFFF)));
        }
    }
    
    public static void method31338(final Class4150 class4150) {
        if (class4150 instanceof Class4148) {
            ((Class4148)class4150).field18495.method31336();
        }
    }
    
    public static boolean method31339(final boolean b, final Class4148 class4148) {
        class4148.field18495.method31336();
        return b;
    }
    
    public static void method31340(final Class4148 class4148) {
        final Class8900 field18495 = class4148.field18495;
        final Class9272 method12428 = class4148.method12428();
        field18495.field37412 = method12428.method34194() / 4;
        field18495.field37416 = method12428.method34201();
        field18495.field37417 = field18495.field37416;
        field18495.field37418 = method12428.method34205(0);
        field18495.field37413 = (field18495.field37416 ? (method12428.method34202() / 4) : 0);
        field18495.field37414 = (field18495.field37418 ? (method12428.method34206(0) / 4) : 0);
        field18495.field37415 = 8;
    }
    
    public static void method31341(final Class4148 class4148) {
        if (class4148.method12418() == 0) {
            method31340(class4148);
        }
    }
    
    public static void method31342(final Class4148 class4148) {
        final Class8900 field18495 = class4148.field18495;
        if (field18495.field37412 == 16) {
            if (class4148.method12417() == 7) {
                if (class4148.method12418() % 4 == 0) {
                    field18495.method31346(class4148, class4148.method12426() - 4 * field18495.field37412);
                }
            }
            final long n = field18495.field37420[field18495.field37421];
            final int n2 = class4148.method12426() - 16 + 13 + class4148.method12430();
            class4148.method12425().put(n2, (int)n);
            class4148.method12425().put(n2 + 1, (int)(n >> 32));
        }
    }
    
    public static void method31343(final Class4148 class4148, final int[] array) {
        if (class4148.method12418() == 0) {
            method31340(class4148);
        }
        final Class8900 field18495 = class4148.field18495;
        if (field18495.field37412 == 16) {
            final long n = field18495.field37420[field18495.field37421];
            for (int n2 = 13; n2 + 1 < array.length; n2 += 16) {
                array[n2] = (int)n;
                array[n2 + 1] = (int)(n >> 32);
            }
        }
    }
    
    public static void method31344(final Class4148 class4148, final ByteBuffer byteBuffer) {
        if (class4148.method12418() == 0) {
            method31340(class4148);
        }
        final Class8900 field18495 = class4148.field18495;
        if (field18495.field37412 == 16) {
            final long n = field18495.field37420[field18495.field37421];
            for (int n2 = byteBuffer.limit() / 4, n3 = 13; n3 + 1 < n2; n3 += 16) {
                final int n4 = (int)n;
                final int n5 = (int)(n >> 32);
                byteBuffer.putInt(n3 * 4, n4);
                byteBuffer.putInt((n3 + 1) * 4, n5);
            }
        }
    }
    
    public static void method31345(final Class4148 class4148) {
        final Class8900 field18495 = class4148.field18495;
        if (field18495.field37412 == 16) {
            if (class4148.method12417() == 7) {
                if (class4148.method12418() % 4 == 0) {
                    field18495.method31346(class4148, class4148.method12426() - 4 * field18495.field37412);
                }
            }
        }
    }
    
    public void method31346(final Class4148 class4148, int n) {
        n += class4148.method12430();
        final FloatBuffer method12424 = class4148.method12424();
        final IntBuffer method12425 = class4148.method12425();
        final float value = method12424.get(n + 0 * this.field37412);
        final float value2 = method12424.get(n + 0 * this.field37412 + 1);
        final float value3 = method12424.get(n + 0 * this.field37412 + 2);
        final float value4 = method12424.get(n + 0 * this.field37412 + this.field37414);
        final float value5 = method12424.get(n + 0 * this.field37412 + this.field37414 + 1);
        final float value6 = method12424.get(n + 1 * this.field37412);
        final float value7 = method12424.get(n + 1 * this.field37412 + 1);
        final float value8 = method12424.get(n + 1 * this.field37412 + 2);
        final float value9 = method12424.get(n + 1 * this.field37412 + this.field37414);
        final float value10 = method12424.get(n + 1 * this.field37412 + this.field37414 + 1);
        final float value11 = method12424.get(n + 2 * this.field37412);
        final float value12 = method12424.get(n + 2 * this.field37412 + 1);
        final float value13 = method12424.get(n + 2 * this.field37412 + 2);
        final float value14 = method12424.get(n + 2 * this.field37412 + this.field37414);
        final float value15 = method12424.get(n + 2 * this.field37412 + this.field37414 + 1);
        final float value16 = method12424.get(n + 3 * this.field37412);
        final float value17 = method12424.get(n + 3 * this.field37412 + 1);
        final float value18 = method12424.get(n + 3 * this.field37412 + 2);
        final float value19 = method12424.get(n + 3 * this.field37412 + this.field37414);
        final float value20 = method12424.get(n + 3 * this.field37412 + this.field37414 + 1);
        final float n2 = value11 - value;
        final float n3 = value12 - value2;
        final float n4 = value13 - value3;
        final float n5 = value16 - value6;
        final float n6 = value17 - value7;
        final float n7 = value18 - value8;
        final float n8 = n3 * n7 - n6 * n4;
        final float n9 = n4 * n5 - n7 * n2;
        final float n10 = n2 * n6 - n5 * n3;
        final float n11 = n8 * n8 + n9 * n9 + n10 * n10;
        final float n12 = (n11 == 0.0) ? 1.0f : ((float)(1.0 / Math.sqrt(n11)));
        final float n13 = n8 * n12;
        final float n14 = n9 * n12;
        final float n15 = n10 * n12;
        final float n16 = value6 - value;
        final float n17 = value7 - value2;
        final float n18 = value8 - value3;
        final float n19 = value9 - value4;
        final float n20 = value10 - value5;
        final float n21 = value11 - value;
        final float n22 = value12 - value2;
        final float n23 = value13 - value3;
        final float n24 = value14 - value4;
        final float n25 = value15 - value5;
        final float n26 = n19 * n25 - n24 * n20;
        final float n27 = (n26 == 0.0f) ? 1.0f : (1.0f / n26);
        final float n28 = (n25 * n16 - n20 * n21) * n27;
        final float n29 = (n25 * n17 - n20 * n22) * n27;
        final float n30 = (n25 * n18 - n20 * n23) * n27;
        final float n31 = (n19 * n21 - n24 * n16) * n27;
        final float n32 = (n19 * n22 - n24 * n17) * n27;
        final float n33 = (n19 * n23 - n24 * n18) * n27;
        final float n34 = n28 * n28 + n29 * n29 + n30 * n30;
        final float n35 = (n34 == 0.0) ? 1.0f : ((float)(1.0 / Math.sqrt(n34)));
        final float n36 = n28 * n35;
        final float n37 = n29 * n35;
        final float n38 = n30 * n35;
        final float n39 = n31 * n31 + n32 * n32 + n33 * n33;
        final float n40 = (n39 == 0.0) ? 1.0f : ((float)(1.0 / Math.sqrt(n39)));
        final float n41 = (n31 * n40 * (n15 * n37 - n14 * n38) + n32 * n40 * (n13 * n38 - n15 * n36) + n33 * n40 * (n14 * n36 - n13 * n37) >= 0.0f) ? 1.0f : -1.0f;
        final int n42 = (((int)(n15 * 127.0f) & 0xFF) << 16) + (((int)(n14 * 127.0f) & 0xFF) << 8) + ((int)(n13 * 127.0f) & 0xFF);
        method12425.put(n + 0 * this.field37412 + this.field37413, n42);
        method12425.put(n + 1 * this.field37412 + this.field37413, n42);
        method12425.put(n + 2 * this.field37412 + this.field37413, n42);
        method12425.put(n + 3 * this.field37412 + this.field37413, n42);
        final int n43 = ((int)(n36 * 32767.0f) & 0xFFFF) + (((int)(n37 * 32767.0f) & 0xFFFF) << 16);
        final int n44 = ((int)(n38 * 32767.0f) & 0xFFFF) + (((int)(n41 * 32767.0f) & 0xFFFF) << 16);
        method12425.put(n + 0 * this.field37412 + 11, n43);
        method12425.put(n + 0 * this.field37412 + 11 + 1, n44);
        method12425.put(n + 1 * this.field37412 + 11, n43);
        method12425.put(n + 1 * this.field37412 + 11 + 1, n44);
        method12425.put(n + 2 * this.field37412 + 11, n43);
        method12425.put(n + 2 * this.field37412 + 11 + 1, n44);
        method12425.put(n + 3 * this.field37412 + 11, n43);
        method12425.put(n + 3 * this.field37412 + 11 + 1, n44);
        final float n45 = (value4 + value9 + value14 + value19) / 4.0f;
        final float n46 = (value5 + value10 + value15 + value20) / 4.0f;
        method12424.put(n + 0 * this.field37412 + 9, n45);
        method12424.put(n + 0 * this.field37412 + 9 + 1, n46);
        method12424.put(n + 1 * this.field37412 + 9, n45);
        method12424.put(n + 1 * this.field37412 + 9 + 1, n46);
        method12424.put(n + 2 * this.field37412 + 9, n45);
        method12424.put(n + 2 * this.field37412 + 9 + 1, n46);
        method12424.put(n + 3 * this.field37412 + 9, n45);
        method12424.put(n + 3 * this.field37412 + 9 + 1, n46);
    }
    
    public static void method31347(final Class4148 class4148) {
        if (class4148.method12428().method34201()) {
            if (class4148.method12417() == 7) {
                if (class4148.method12418() % 4 == 0) {
                    final Class8900 field18495 = class4148.field18495;
                    method31340(class4148);
                    for (int n = class4148.method12418() * field18495.field37412, i = 0; i < n; i += field18495.field37412 * 4) {
                        field18495.method31346(class4148, i);
                    }
                }
            }
        }
    }
    
    public static void method31348(final int n, final int n2, final int n3, final Class4148 class4148) {
        if (n3 != 0) {
            final int method34194 = class4148.method12428().method34194();
            if (method34194 != 64) {
                Class8933.method31657(n, n2, n3);
            }
            else {
                final ByteBuffer method34195 = class4148.method12423();
                method34195.position();
                GL20.glVertexAttribPointer(Class9216.field39111, 2, 5126, false, method34194, method34195);
                method34195.position();
                GL20.glVertexAttribPointer(Class9216.field39112, 4, 5122, false, method34194, method34195);
                method34195.position();
                GL20.glVertexAttribPointer(Class9216.field39110, 3, 5122, false, method34194, method34195);
                method34195.position();
                GL20.glEnableVertexAttribArray(Class9216.field39111);
                GL20.glEnableVertexAttribArray(Class9216.field39112);
                GL20.glEnableVertexAttribArray(Class9216.field39110);
                Class8933.method31657(n, n2, n3);
                GL20.glDisableVertexAttribArray(Class9216.field39111);
                GL20.glDisableVertexAttribArray(Class9216.field39112);
                GL20.glDisableVertexAttribArray(Class9216.field39110);
            }
        }
    }
}
