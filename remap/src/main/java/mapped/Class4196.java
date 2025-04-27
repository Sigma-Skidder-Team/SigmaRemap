// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Arrays;
import net.sourceforge.jaad.aac.AACException;

public class Class4196 implements Class4178
{
    private static final float[] field18769;
    private final int field18770;
    private final int[] field18771;
    private int field18772;
    private int field18773;
    private int field18774;
    private boolean field18775;
    private boolean[] field18776;
    private boolean[] field18777;
    private boolean[] field18778;
    private int[] field18779;
    
    public Class4196(final int field18770) {
        this.field18770 = field18770;
        this.field18771 = new int[4 * field18770];
    }
    
    public void method12601(final Class8157 class8157, final Class4182 class8158, final Class2002 class8159) throws AACException {
        this.field18773 = 0;
        if (!class8159.equals(Class2002.field11227)) {
            this.field18773 = class8157.method26940(11);
        }
        else if (this.field18775 = class8157.method26942()) {
            this.field18773 = class8157.method26940(10);
        }
        if (this.field18773 <= this.field18770 << 1) {
            this.field18772 = class8157.method26940(3);
            final int method12553 = class8158.method12553();
            if (!class8158.method12557()) {
                this.field18774 = Math.min(class8158.method12549(), 40);
                this.field18778 = new boolean[this.field18774];
                for (int i = 0; i < this.field18774; ++i) {
                    this.field18778[i] = class8157.method26942();
                }
            }
            else {
                this.field18776 = new boolean[method12553];
                this.field18777 = new boolean[method12553];
                this.field18779 = new int[method12553];
                for (int j = 0; j < method12553; ++j) {
                    if (this.field18776[j] = class8157.method26942()) {
                        if (this.field18777[j] = class8157.method26942()) {
                            this.field18779[j] = class8157.method26940(4);
                        }
                    }
                }
            }
            return;
        }
        throw new Class2348("LTP lag too large: " + this.field18773);
    }
    
    public void method12602(final int n) {
        if (this.field18778 != null) {
            this.field18778[n] = false;
        }
    }
    
    public void method12603(final Class4192 class4192, final float[] array, final Class4185 class4193, final Class2077 class4194) {
        final Class4182 method12588 = class4192.method12588();
        if (!method12588.method12557()) {
            final int n = this.field18770 << 1;
            final float[] array2 = new float[2048];
            final float[] array3 = new float[2048];
            for (int i = 0; i < n; ++i) {
                array2[i] = this.field18771[n + i - this.field18773] * Class4196.field18769[this.field18772];
            }
            class4193.method12572(method12588.method12556(), method12588.method12558(1), method12588.method12558(0), array2, array3);
            if (class4192.method12592()) {
                class4192.method12593().method12546(class4192, array3, class4194, true);
            }
            final int[] method12589 = method12588.method12551();
            final int method12590 = method12588.method12552();
            for (int j = 0; j < this.field18774; ++j) {
                if (this.field18778[j]) {
                    final int n2 = method12589[j];
                    for (int min = Math.min(method12589[j + 1], method12590), k = n2; k < min; ++k) {
                        final int n3 = k;
                        array[n3] += array3[k];
                    }
                }
            }
        }
    }
    
    public void method12604(final float[] array, final float[] array2, final Class2002 class2002) {
        if (!class2002.equals(Class2002.field11227)) {
            for (int i = 0; i < this.field18770; ++i) {
                this.field18771[i] = this.field18771[i + this.field18770];
                this.field18771[this.field18770 + i] = Math.round(array[i]);
                this.field18771[this.field18770 * 2 + i] = Math.round(array2[i]);
            }
        }
        else {
            for (int j = 0; j < this.field18770; ++j) {
                this.field18771[j] = this.field18771[j + this.field18770];
                this.field18771[this.field18770 + j] = this.field18771[j + this.field18770 * 2];
                this.field18771[this.field18770 * 2 + j] = Math.round(array[j]);
                this.field18771[this.field18770 * 3 + j] = Math.round(array2[j]);
            }
        }
    }
    
    public static boolean method12605(final Class2002 class2002) {
        if (!class2002.equals(Class2002.field11223)) {
            if (!class2002.equals(Class2002.field11230)) {
                return class2002.equals(Class2002.field11227);
            }
        }
        return true;
    }
    
    public void method12606(final Class4196 class4196) {
        System.arraycopy(class4196.field18771, 0, this.field18771, 0, this.field18771.length);
        this.field18772 = class4196.field18772;
        this.field18773 = class4196.field18773;
        this.field18774 = class4196.field18774;
        this.field18775 = class4196.field18775;
        this.field18776 = Arrays.copyOf(class4196.field18776, class4196.field18776.length);
        this.field18777 = Arrays.copyOf(class4196.field18777, class4196.field18777.length);
        this.field18779 = Arrays.copyOf(class4196.field18779, class4196.field18779.length);
        this.field18778 = Arrays.copyOf(class4196.field18778, class4196.field18778.length);
    }
    
    static {
        field18769 = new float[] { 0.570829f, 0.696616f, 0.813004f, 0.911304f, 0.9849f, 1.067894f, 1.194601f, 1.369533f };
    }
}
