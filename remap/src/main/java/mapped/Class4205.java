// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.logging.Level;
import net.sourceforge.jaad.aac.AACException;

public class Class4205 implements Class4178
{
    private final Class4179 field18950;
    private boolean field18951;
    private boolean field18952;
    private int field18953;
    private final Class4208 field18954;
    private final Class4176[] field18955;
    private final Class4175[] field18956;
    private final Class4207[] field18957;
    private final Class4177[] field18958;
    private int field18959;
    private int field18960;
    private int field18961;
    private int field18962;
    private float[][] field18963;
    
    public Class4205(final Class4179 field18950) {
        this.field18950 = field18950;
        this.field18954 = new Class4208();
        this.field18955 = new Class4176[64];
        this.field18956 = new Class4175[16];
        this.field18957 = new Class4207[16];
        this.field18958 = new Class4177[16];
        this.method12653();
    }
    
    public final void method12653() {
        this.field18959 = 0;
        this.field18960 = 0;
        this.field18961 = 0;
        this.field18962 = 0;
        this.field18951 = false;
        this.field18952 = false;
        this.field18953 = 0;
    }
    
    public void method12654(final Class8157 class8157) throws AACException {
        final int method26937 = class8157.method26937();
        Class4176 class8158 = null;
        final boolean b = true;
        if (!this.field18950.method12531().method8029()) {
            int method26938;
            while (b && (method26938 = class8157.method26940(3)) != 7) {
                switch (method26938) {
                    case 0:
                    case 3: {
                        Class4205.field18616.finest("SCE");
                        class8158 = this.method12655(class8157);
                        continue;
                    }
                    case 1: {
                        Class4205.field18616.finest("CPE");
                        class8158 = this.method12656(class8157);
                        continue;
                    }
                    case 2: {
                        Class4205.field18616.finest("CCE");
                        this.method12657(class8157);
                        class8158 = null;
                        continue;
                    }
                    case 4: {
                        Class4205.field18616.finest("DSE");
                        this.method12658(class8157);
                        class8158 = null;
                        continue;
                    }
                    case 5: {
                        Class4205.field18616.finest("PCE");
                        this.method12659(class8157);
                        class8158 = null;
                        continue;
                    }
                    case 6: {
                        Class4205.field18616.finest("FIL");
                        this.method12660(class8157, class8158);
                        class8158 = null;
                        continue;
                    }
                }
            }
            Class4205.field18616.finest("END");
        }
        else {
            switch (Class8759.field36781[this.field18950.method12520().ordinal()]) {
                case 1: {
                    this.method12655(class8157);
                    break;
                }
                case 2: {
                    this.method12656(class8157);
                    break;
                }
                case 3: {
                    this.method12655(class8157);
                    this.method12656(class8157);
                    break;
                }
                case 4: {
                    this.method12655(class8157);
                    this.method12656(class8157);
                    this.method12655(class8157);
                    break;
                }
                case 5: {
                    this.method12655(class8157);
                    this.method12656(class8157);
                    this.method12656(class8157);
                    break;
                }
                case 6: {
                    this.method12655(class8157);
                    this.method12656(class8157);
                    this.method12656(class8157);
                    this.method12655(class8157);
                    break;
                }
                case 7: {
                    this.method12655(class8157);
                    this.method12656(class8157);
                    this.method12656(class8157);
                    this.method12656(class8157);
                    this.method12655(class8157);
                    break;
                }
                default: {
                    throw new Class2348("unsupported channel configuration for error resilience: " + this.field18950.method12520());
                }
            }
        }
        class8157.method26935();
        this.field18953 = class8157.method26937() - method26937;
    }
    
    private Class4176 method12655(final Class8157 class8157) throws AACException {
        if (this.field18955[this.field18959] == null) {
            this.field18955[this.field18959] = new Class4209(this.field18950.method12528());
        }
        ((Class4209)this.field18955[this.field18959]).method12677(class8157, this.field18950);
        ++this.field18959;
        return this.field18955[this.field18959 - 1];
    }
    
    private Class4176 method12656(final Class8157 class8157) throws AACException {
        if (this.field18955[this.field18959] == null) {
            this.field18955[this.field18959] = new Class4188(this.field18950.method12528());
        }
        ((Class4188)this.field18955[this.field18959]).method12574(class8157, this.field18950);
        ++this.field18959;
        return this.field18955[this.field18959 - 1];
    }
    
    private void method12657(final Class8157 class8157) throws AACException {
        if (this.field18960 != 16) {
            if (this.field18956[this.field18960] == null) {
                this.field18956[this.field18960] = new Class4175(this.field18950.method12528());
            }
            this.field18956[this.field18960].method12507(class8157, this.field18950);
            ++this.field18960;
            return;
        }
        throw new Class2348("too much CCE elements");
    }
    
    private void method12658(final Class8157 class8157) throws AACException {
        if (this.field18961 != 16) {
            if (this.field18957[this.field18961] == null) {
                this.field18957[this.field18961] = new Class4207();
            }
            this.field18957[this.field18961].method12671(class8157);
            ++this.field18961;
            return;
        }
        throw new Class2348("too much CCE elements");
    }
    
    private void method12659(final Class8157 class8157) throws AACException {
        this.field18954.method12672(class8157);
        this.field18950.method12532(this.field18954.method12674());
        this.field18950.method12534(this.field18954.method12675());
        this.field18950.method12521(Class2001.method8022(this.field18954.method12676()));
    }
    
    private void method12660(final Class8157 class8157, final Class4176 class8158) throws AACException {
        if (this.field18962 != 16) {
            if (this.field18958[this.field18962] == null) {
                this.field18958[this.field18962] = new Class4177(this.field18950.method12536());
            }
            this.field18958[this.field18962].method12516(class8157, class8158, this.field18950.method12533(), this.field18950.method12537(), this.field18950.method12529());
            ++this.field18962;
            if (class8158 != null) {
                if (class8158.method12514()) {
                    this.field18951 = true;
                    if (!this.field18952) {
                        if (class8158.method12515().method12630()) {
                            this.field18952 = true;
                        }
                    }
                }
            }
            return;
        }
        throw new Class2348("too much FIL elements");
    }
    
    public void method12661(final Class4185 class4185) throws AACException {
        final Class2002 method12531 = this.field18950.method12531();
        final Class2077 method12532 = this.field18950.method12533();
        int method12533 = this.field18950.method12520().method8023();
        if (method12533 == 1) {
            if (this.field18952) {
                ++method12533;
            }
        }
        final int n = this.field18951 ? 2 : 1;
        Label_0134: {
            if (this.field18963 != null) {
                if (method12533 == this.field18963.length) {
                    if (n * this.field18950.method12528() == this.field18963[0].length) {
                        break Label_0134;
                    }
                }
            }
            this.field18963 = new float[method12533][n * this.field18950.method12528()];
        }
        for (int n2 = 0, n3 = 0; n3 < this.field18955.length && n2 < method12533; ++n3) {
            final Class4176 class4186 = this.field18955[n3];
            if (class4186 != null) {
                if (!(class4186 instanceof Class4209)) {
                    if (!(class4186 instanceof Class4188)) {
                        if (class4186 instanceof Class4175) {
                            ((Class4175)class4186).method12508();
                            ++n2;
                        }
                    }
                    else {
                        this.method12663((Class4188)class4186, class4185, n2, method12531, method12532);
                        n2 += 2;
                    }
                }
                else {
                    n2 += this.method12662((Class4209)class4186, class4185, n2, method12531, method12532);
                }
            }
        }
    }
    
    private int method12662(final Class4209 class4209, final Class4185 class4210, final int n, final Class2002 class4211, final Class2077 class4212) throws AACException {
        final Class4192 method12678 = class4209.method12678();
        final Class4182 method12679 = method12678.method12588();
        final Class4196 method12680 = method12679.method12562();
        final int method12681 = class4209.method12512();
        final float[] method12682 = method12678.method12587();
        if (class4211.equals(Class2002.field11220)) {
            if (method12679.method12559()) {
                method12679.method12560().method34583(method12678, method12682, class4212);
            }
        }
        if (Class4196.method12605(class4211)) {
            if (method12679.method12561()) {
                method12680.method12603(method12678, method12682, class4210, class4212);
            }
        }
        this.method12665(false, method12681, 0, method12682, null);
        if (method12678.method12592()) {
            method12678.method12593().method12546(method12678, method12682, class4212, false);
        }
        this.method12665(false, method12681, 1, method12682, null);
        class4210.method12571(method12679.method12556(), method12679.method12558(1), method12679.method12558(0), method12682, this.field18963[n], n);
        if (Class4196.method12605(class4211)) {
            method12680.method12604(this.field18963[n], class4210.method12573(n), class4211);
        }
        this.method12664(false, method12681, this.field18963[n], null);
        if (method12678.method12598()) {
            method12678.method12599().method20341(method12682, method12679.method12558(1), method12679.method12558(0), method12679.method12556());
        }
        int n2 = 1;
        if (this.field18951) {
            if (this.field18950.method12537()) {
                if (this.field18963[n].length == this.field18950.method12528()) {
                    Class4205.field18616.log(Level.WARNING, "SBR data present, but buffer has normal size!");
                }
                if (!class4209.method12515().method12630()) {
                    class4209.method12515().method12628(this.field18963[n], false);
                }
                else {
                    n2 = 2;
                    class4209.method12515().method12627(this.field18963[n], this.field18963[n + 1], false);
                }
            }
        }
        return n2;
    }
    
    private void method12663(final Class4188 class4188, final Class4185 class4189, final int n, final Class2002 class4190, final Class2077 class4191) throws AACException {
        final Class4192 method12575 = class4188.method12575();
        final Class4192 method12576 = class4188.method12576();
        final Class4182 method12577 = method12575.method12588();
        final Class4182 method12578 = method12576.method12588();
        final Class4196 method12579 = method12577.method12562();
        final Class4196 class4192 = class4188.method12580() ? method12577.method12564() : method12578.method12562();
        final int method12580 = class4188.method12512();
        final float[] method12581 = method12575.method12587();
        final float[] method12582 = method12576.method12587();
        if (class4188.method12580()) {
            if (class4188.method12579()) {
                Class4195.method12600(class4188, method12581, method12582);
            }
        }
        if (class4190.equals(Class2002.field11220)) {
            if (method12577.method12559()) {
                method12577.method12560().method34583(method12575, method12581, class4191);
            }
            if (method12578.method12559()) {
                method12578.method12560().method34583(method12576, method12582, class4191);
            }
        }
        Class4189.method12581(class4188, method12581, method12582);
        if (Class4196.method12605(class4190)) {
            if (method12577.method12561()) {
                method12579.method12603(method12575, method12581, class4189, class4191);
            }
            if (class4188.method12580() && method12577.method12563()) {
                class4192.method12603(method12576, method12582, class4189, class4191);
            }
            else if (method12578.method12561()) {
                class4192.method12603(method12576, method12582, class4189, class4191);
            }
        }
        this.method12665(true, method12580, 0, method12581, method12582);
        if (method12575.method12592()) {
            method12575.method12593().method12546(method12575, method12581, class4191, false);
        }
        if (method12576.method12592()) {
            method12576.method12593().method12546(method12576, method12582, class4191, false);
        }
        this.method12665(true, method12580, 1, method12581, method12582);
        class4189.method12571(method12577.method12556(), method12577.method12558(1), method12577.method12558(0), method12581, this.field18963[n], n);
        class4189.method12571(method12578.method12556(), method12578.method12558(1), method12578.method12558(0), method12582, this.field18963[n + 1], n + 1);
        if (Class4196.method12605(class4190)) {
            method12579.method12604(this.field18963[n], class4189.method12573(n), class4190);
            class4192.method12604(this.field18963[n + 1], class4189.method12573(n + 1), class4190);
        }
        this.method12664(true, method12580, this.field18963[n], this.field18963[n + 1]);
        if (method12575.method12598()) {
            method12575.method12599().method20341(method12581, method12577.method12558(1), method12577.method12558(0), method12577.method12556());
        }
        if (method12576.method12598()) {
            method12576.method12599().method20341(method12582, method12578.method12558(1), method12578.method12558(0), method12578.method12556());
        }
        if (this.field18951) {
            if (this.field18950.method12537()) {
                if (this.field18963[n].length == this.field18950.method12528()) {
                    Class4205.field18616.log(Level.WARNING, "SBR data present, but buffer has normal size!");
                }
                class4188.method12515().method12627(this.field18963[n], this.field18963[n + 1], false);
            }
        }
    }
    
    private void method12664(final boolean b, final int n, final float[] array, final float[] array2) {
        for (int i = 0; i < this.field18956.length; ++i) {
            final Class4175 class4175 = this.field18956[i];
            int n2 = 0;
            if (class4175 != null) {
                if (class4175.method12502() == 2) {
                    for (int j = 0; j <= class4175.method12503(); ++j) {
                        final int method12506 = class4175.method12506(j);
                        if (class4175.method12504(j) == b && class4175.method12505(j) == n) {
                            if (method12506 != 1) {
                                class4175.method12509(n2, array);
                                if (method12506 != 0) {
                                    ++n2;
                                }
                            }
                            if (method12506 != 2) {
                                class4175.method12509(n2, array2);
                                ++n2;
                            }
                        }
                        else {
                            n2 += 1 + ((method12506 == 3) ? 1 : 0);
                        }
                    }
                }
            }
        }
    }
    
    private void method12665(final boolean b, final int n, final int n2, final float[] array, final float[] array2) {
        for (int i = 0; i < this.field18956.length; ++i) {
            final Class4175 class4175 = this.field18956[i];
            int n3 = 0;
            if (class4175 != null) {
                if (class4175.method12502() == n2) {
                    for (int j = 0; j <= class4175.method12503(); ++j) {
                        final int method12506 = class4175.method12506(j);
                        if (class4175.method12504(j) == b && class4175.method12505(j) == n) {
                            if (method12506 != 1) {
                                class4175.method12510(n3, array);
                                if (method12506 != 0) {
                                    ++n3;
                                }
                            }
                            if (method12506 != 2) {
                                class4175.method12510(n3, array2);
                                ++n3;
                            }
                        }
                        else {
                            n3 += 1 + ((method12506 == 3) ? 1 : 0);
                        }
                    }
                }
            }
        }
    }
    
    public void method12666(final Class9157 class9157) {
        final boolean method33424 = class9157.method33424();
        final int length = this.field18963.length;
        final int n = (this.field18951 && this.field18950.method12537()) ? 2 : 1;
        final int n2 = n * this.field18950.method12528();
        final int n3 = n * this.field18950.method12533().method8183();
        byte[] method33425 = class9157.method33417();
        if (method33425.length != length * n2 * 2) {
            method33425 = new byte[length * n2 * 2];
        }
        for (int i = 0; i < length; ++i) {
            final float[] array = this.field18963[i];
            for (int j = 0; j < n2; ++j) {
                final short n4 = (short)Math.max(Math.min(Math.round(array[j]), 32767), -32768);
                final int n5 = (j * length + i) * 2;
                if (!method33424) {
                    method33425[n5 + 1] = (byte)(n4 >> 8 & 0xFF);
                    method33425[n5] = (byte)(n4 & 0xFF);
                }
                else {
                    method33425[n5] = (byte)(n4 >> 8 & 0xFF);
                    method33425[n5 + 1] = (byte)(n4 & 0xFF);
                }
            }
        }
        class9157.method33426(method33425, n3, length, 16, this.field18953);
    }
}
