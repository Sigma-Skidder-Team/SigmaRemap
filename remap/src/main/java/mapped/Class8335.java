// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.MathHelper;

import javax.annotation.Nullable;
import java.util.Random;

public class Class8335
{
    private static String[] field34221;
    private final Random field34222;
    private final Class1849 field34223;
    private int field34224;
    private int field34225;
    private int field34226;
    
    public Class8335(final Class1849 field34223) {
        this.field34222 = new Random();
        this.field34223 = field34223;
        this.field34224 = 1200;
        final Class8660 method6764 = field34223.method6764();
        this.field34225 = method6764.method29612();
        this.field34226 = method6764.method29614();
        if (this.field34225 == 0) {
            if (this.field34226 == 0) {
                method6764.method29613(this.field34225 = 24000);
                method6764.method29615(this.field34226 = 25);
            }
        }
    }
    
    public void method27773() {
        if (this.field34223.method6765().method31216(Class8878.field37345)) {
            if (--this.field34224 <= 0) {
                this.field34224 = 1200;
                final Class8660 method6764 = this.field34223.method6764();
                method6764.method29613(this.field34225 -= 1200);
                if (this.field34225 <= 0) {
                    this.field34225 = 24000;
                    if (this.field34223.method6765().method31216(Class8878.field37318)) {
                        final int field34226 = this.field34226;
                        method6764.method29615(this.field34226 = MathHelper.method35651(this.field34226 + 25, 25, 75));
                        if (this.field34222.nextInt(100) <= field34226) {
                            if (this.method27774()) {
                                this.field34226 = 25;
                            }
                        }
                    }
                }
            }
        }
    }
    
    private boolean method27774() {
        final Class513 method6884 = this.field34223.method6884();
        if (method6884 == null) {
            return true;
        }
        if (this.field34222.nextInt(10) == 0) {
            final BlockPos method6885 = method6884.method1894();
            final BlockPos class354 = this.field34223.method6921().method7204(Class8912.field37477.method31396(), p0 -> true, method6885, 48, Class2045.field11652).orElse(method6885);
            final BlockPos method6886 = this.method27776(class354, 48);
            if (method6886 != null) {
                if (this.method27777(method6886)) {
                    if (this.field34223.method6959(method6886) == Class7102.field27683) {
                        return false;
                    }
                    final Class821 class355 = Class7499.field29046.method23357(this.field34223, null, null, null, method6886, Class2101.field12181, false, false);
                    if (class355 != null) {
                        for (int i = 0; i < 2; ++i) {
                            this.method27775(class355, 4);
                        }
                        this.field34223.method6764().method29616(class355.method1865());
                        class355.method4841(48000);
                        class355.method4844(class354);
                        class355.method4198(class354, 16);
                        return true;
                    }
                }
            }
            return false;
        }
        return false;
    }
    
    private void method27775(final Class821 class821, final int n) {
        final BlockPos method27776 = this.method27776(new BlockPos(class821), n);
        if (method27776 != null) {
            final Class816 class822 = Class7499.field29033.method23357(this.field34223, null, null, null, method27776, Class2101.field12181, false, false);
            if (class822 != null) {
                class822.method4207(class821, true);
            }
        }
    }
    
    @Nullable
    private BlockPos method27776(final BlockPos class354, final int n) {
        BlockPos class355 = null;
        for (int i = 0; i < 10; ++i) {
            final int n2 = class354.getX() + this.field34222.nextInt(n * 2) - n;
            final int n3 = class354.getZ() + this.field34222.nextInt(n * 2) - n;
            final BlockPos class356 = new BlockPos(n2, this.field34223.method6699(Class2020.field11522, n2, n3), n3);
            if (Class8532.method28621(Class2194.field13354, this.field34223, class356, Class7499.field29046)) {
                class355 = class356;
                break;
            }
        }
        return class355;
    }
    
    private boolean method27777(final BlockPos class354) {
        for (final BlockPos class355 : BlockPos.method1154(class354, class354.method1134(1, 2, 1))) {
            if (this.field34223.method6701(class355).method21727(this.field34223, class355).method24540()) {
                continue;
            }
            return false;
        }
        return true;
    }
}
