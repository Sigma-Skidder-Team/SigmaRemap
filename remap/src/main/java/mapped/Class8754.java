// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util2.Direction;

public class Class8754
{
    public int[] field36765;
    public final int field36766;
    public Direction field36767;
    public Class1912 field36768;
    private int[] field36769;
    public boolean field36770;
    private Class9496 field36771;
    private boolean field36772;
    private Class8754 field36773;
    
    public Class8754(final int[] field36765, final int field36766, final Direction field36767, final Class1912 field36768, final boolean field36769) {
        this.field36769 = null;
        this.field36770 = Class9570.field41285.method22605();
        this.field36765 = field36765;
        this.field36766 = field36766;
        this.field36767 = field36767;
        this.field36768 = field36768;
        this.field36770 = field36769;
        this.method30302();
    }
    
    public Class8754(final int[] field36765, final int field36766, final Direction field36767, final Class1912 field36768) {
        this.field36769 = null;
        this.field36770 = Class9570.field41285.method22605();
        this.field36765 = field36765;
        this.field36766 = field36766;
        this.field36767 = field36767;
        this.field36768 = field36768;
        this.method30302();
    }
    
    public int[] method30291() {
        this.method30302();
        return this.field36765;
    }
    
    public boolean method30292() {
        return this.field36766 != -1;
    }
    
    public int method30293() {
        return this.field36766;
    }
    
    public Direction method30294() {
        if (this.field36767 == null) {
            this.field36767 = Class6225.method18530(this.method30291());
        }
        return this.field36767;
    }
    
    public Class1912 method30295() {
        if (this.field36768 == null) {
            this.field36768 = method30301(this.method30291());
        }
        return this.field36768;
    }
    
    public int[] method30296() {
        if (this.field36769 == null) {
            this.field36769 = method30297(this.method30291(), this.method30295());
        }
        return this.field36769;
    }
    
    private static int[] method30297(final int[] array, final Class1912 class1912) {
        final int[] array2 = array.clone();
        final int n = array2.length / 4;
        for (int i = 0; i < 4; ++i) {
            final int n2 = i * n;
            final float intBitsToFloat = Float.intBitsToFloat(array2[n2 + 4]);
            final float intBitsToFloat2 = Float.intBitsToFloat(array2[n2 + 4 + 1]);
            final float method7524 = class1912.method7524(intBitsToFloat);
            final float method7525 = class1912.method7525(intBitsToFloat2);
            array2[n2 + 4] = Float.floatToRawIntBits(method7524);
            array2[n2 + 4 + 1] = Float.floatToRawIntBits(method7525);
        }
        return array2;
    }
    
    public void method30298(final Class7063 class7063) {
        Class9570.method35811(Class9570.field41381, class7063, this);
    }
    
    public boolean method30299() {
        return this.field36770;
    }
    
    public Class1912 method30300() {
        return this.field36768;
    }
    
    private static Class1912 method30301(final int[] array) {
        float min = 1.0f;
        float min2 = 1.0f;
        float max = 0.0f;
        float max2 = 0.0f;
        final int n = array.length / 4;
        for (int i = 0; i < 4; ++i) {
            final int n2 = i * n;
            final float intBitsToFloat = Float.intBitsToFloat(array[n2 + 4]);
            final float intBitsToFloat2 = Float.intBitsToFloat(array[n2 + 4 + 1]);
            min = Math.min(min, intBitsToFloat);
            min2 = Math.min(min2, intBitsToFloat2);
            max = Math.max(max, intBitsToFloat);
            max2 = Math.max(max2, intBitsToFloat2);
        }
        return Config.method29001().method6356((min + max) / 2.0f, (min2 + max2) / 2.0f);
    }
    
    public void method30302() {
        if (!Config.method28955()) {
            if (this.field36765.length == Class9237.field39612) {
                this.field36765 = method30304(this.field36765);
            }
        }
        else if (this.field36765.length == Class9237.field39611) {
            this.field36765 = method30303(this.field36765);
        }
    }
    
    private static int[] method30303(final int[] array) {
        final int n = array.length / 4;
        final int n2 = n * 2;
        final int[] array2 = new int[n2 * 4];
        for (int i = 0; i < 4; ++i) {
            System.arraycopy(array, i * n, array2, i * n2, n);
        }
        return array2;
    }
    
    private static int[] method30304(final int[] array) {
        final int n = array.length / 4;
        final int n2 = n / 2;
        final int[] array2 = new int[n2 * 4];
        for (int i = 0; i < 4; ++i) {
            System.arraycopy(array, i * n, array2, i * n2, n2);
        }
        return array2;
    }
    
    public Class9496 method30305() {
        if (this.field36771 == null) {
            this.field36771 = new Class9496(this.method30291());
        }
        return this.field36771;
    }
    
    public float method30306() {
        final Class9496 method30305 = this.method30305();
        return (method30305.method35351() + method30305.method35348()) / 2.0f;
    }
    
    public double method30307() {
        final Class9496 method30305 = this.method30305();
        return (method30305.method35352() + method30305.method35349()) / 2.0f;
    }
    
    public double method30308() {
        final Class9496 method30305 = this.method30305();
        return (method30305.method35353() + method30305.method35350()) / 2.0f;
    }
    
    public boolean method30309() {
        return this.method30305().method35354(this.field36767);
    }
    
    public boolean method30310() {
        return this.method30305().method35355(this.field36767);
    }
    
    public boolean method30311() {
        return this.method30310() && this.method30309();
    }
    
    public Class8754 method30312() {
        if (!this.field36772) {
            if (this.field36773 == null) {
                if (this.field36768 != null) {
                    if (this.field36768.field10394 != null) {
                        this.field36773 = new Class8755(this, this.field36768.field10394);
                    }
                }
            }
            this.field36772 = true;
            return this.field36773;
        }
        return this.field36773;
    }
    
    public boolean method30313() {
        return this.field36770;
    }
    
    @Override
    public String toString() {
        return "vertexData: " + this.field36765.length + ", tint: " + this.field36766 + ", facing: " + this.field36767 + ", sprite: " + this.field36768;
    }
}
