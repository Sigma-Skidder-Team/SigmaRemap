// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import javax.annotation.Nullable;
import java.util.regex.Matcher;
import java.util.Collections;
import java.util.Iterator;
import com.google.common.collect.Lists;
import net.minecraft.util.math.MathHelper;

import java.util.List;
import java.util.regex.Pattern;

public class Class683 extends Class565
{
    private static final ResourceLocation field3727;
    private static final Pattern field3728;
    private final Class572 field3729;
    private final Class8863 field3730;
    private final Class7339 field3731;
    private final String field3732;
    private final int field3733;
    private final List<String> field3734;
    private final Minecraft field3735;
    private Class683 field3736;
    private final List<Class683> field3737;
    private Class348 field3738;
    private final int field3739;
    private final int field3740;
    
    public Class683(final Class572 field3729, final Minecraft field3730, final Class8863 field3731, final Class7339 field3732) {
        this.field3737 = Lists.newArrayList();
        this.field3729 = field3729;
        this.field3730 = field3731;
        this.field3731 = field3732;
        this.field3735 = field3730;
        this.field3732 = field3730.fontRenderer.method6619(field3732.method22527().getFormattedText(), 163);
        this.field3739 = MathHelper.method35642(field3732.method22532() * 28.0f);
        this.field3740 = MathHelper.method35642(field3732.method22533() * 27.0f);
        final int method31040 = field3731.method31040();
        final int length = String.valueOf(method31040).length();
        int max = 29 + field3730.fontRenderer.method6617(this.field3732) + ((method31040 <= 1) ? 0 : (field3730.fontRenderer.method6617("  ") + field3730.fontRenderer.method6617("0") * length * 2 + field3730.fontRenderer.method6617("/")));
        this.field3734 = this.method3744(field3732.method22528().getFormattedText(), max);
        final Iterator<String> iterator = this.field3734.iterator();
        while (iterator.hasNext()) {
            max = Math.max(max, field3730.fontRenderer.method6617(iterator.next()));
        }
        this.field3733 = max + 3 + 5;
    }
    
    private List<String> method3744(final String s, final int n) {
        if (s.isEmpty()) {
            return Collections.emptyList();
        }
        final List<String> method6626 = this.field3735.fontRenderer.method6626(s, n);
        if (method6626.size() < 2) {
            return method6626;
        }
        final String s2 = method6626.get(0);
        final int method6627 = this.field3735.fontRenderer.method6617(s2 + ' ' + method6626.get(1).split(" ")[0]);
        if (method6627 - n > 10) {
            final Matcher matcher = Class683.field3728.matcher(s2);
            if (matcher.matches()) {
                final int method6628 = this.field3735.fontRenderer.method6617(matcher.group(1));
                if (n - method6628 <= 10) {
                    return this.field3735.fontRenderer.method6626(s, method6628);
                }
            }
            return method6626;
        }
        return this.field3735.fontRenderer.method6626(s, method6627);
    }
    
    @Nullable
    private Class683 method3745(Class8863 method31035) {
        do {
            method31035 = method31035.method31035();
        } while (method31035 != null && method31035.method31036() == null);
        return (method31035 != null && method31035.method31036() != null) ? this.field3729.method3348(method31035) : null;
    }
    
    public void method3746(final int n, final int n2, final boolean b) {
        if (this.field3736 != null) {
            final int n3 = n + this.field3736.field3739 + 13;
            final int n4 = n + this.field3736.field3739 + 26 + 4;
            final int n5 = n2 + this.field3736.field3740 + 13;
            final int n6 = n + this.field3739 + 13;
            final int n7 = n2 + this.field3740 + 13;
            final int n8 = b ? -16777216 : -1;
            if (!b) {
                this.method3291(n4, n3, n5, n8);
                this.method3291(n6, n4, n7, n8);
                this.method3292(n4, n7, n5, n8);
            }
            else {
                this.method3291(n4, n3, n5 - 1, n8);
                this.method3291(n4 + 1, n3, n5, n8);
                this.method3291(n4, n3, n5 + 1, n8);
                this.method3291(n6, n4 - 1, n7 - 1, n8);
                this.method3291(n6, n4 - 1, n7, n8);
                this.method3291(n6, n4 - 1, n7 + 1, n8);
                this.method3292(n4 - 1, n7, n5, n8);
                this.method3292(n4 + 1, n7, n5, n8);
            }
        }
        final Iterator<Class683> iterator = this.field3737.iterator();
        while (iterator.hasNext()) {
            iterator.next().method3746(n, n2, b);
        }
    }
    
    public void method3747(final int n, final int n2) {
        Label_0035: {
            if (this.field3731.method22536()) {
                if (this.field3738 == null) {
                    break Label_0035;
                }
                if (!this.field3738.method1031()) {
                    break Label_0035;
                }
            }
            Class1999 class1999;
            if (((this.field3738 != null) ? this.field3738.method1038() : 0.0f) < 1.0f) {
                class1999 = Class1999.field11193;
            }
            else {
                class1999 = Class1999.field11192;
            }
            this.field3735.method5290().method5849(Class683.field3727);
            this.method3186(n + this.field3739 + 3, n2 + this.field3740, this.field3731.method22531().method8016(), 128 + class1999.method8019() * 26, 26, 26);
            this.field3735.getItemRenderer().method6541(null, this.field3731.method22529(), n + this.field3739 + 8, n2 + this.field3740 + 5);
        }
        final Iterator<Class683> iterator = this.field3737.iterator();
        while (iterator.hasNext()) {
            iterator.next().method3747(n, n2);
        }
    }
    
    public void method3748(final Class348 field3738) {
        this.field3738 = field3738;
    }
    
    public void method3749(final Class683 class683) {
        this.field3737.add(class683);
    }
    
    public void method3750(final int n, final int n2, final float n3, final int n4, final int n5) {
        final boolean b = n4 + n + this.field3739 + this.field3733 + 26 >= this.field3729.method3349().width;
        final String s = (this.field3738 != null) ? this.field3738.method1039() : null;
        final int n6 = (s != null) ? this.field3735.fontRenderer.method6617(s) : 0;
        final boolean b2 = 113 - n2 - this.field3740 - 26 <= 6 + this.field3734.size() * 9;
        final float n7 = (this.field3738 != null) ? this.field3738.method1038() : 0.0f;
        int method35642 = MathHelper.method35642(n7 * this.field3733);
        Class1999 class1999;
        Class1999 class2000;
        Class1999 class2001;
        if (n7 < 1.0f) {
            if (method35642 >= 2) {
                if (method35642 <= this.field3733 - 2) {
                    class1999 = Class1999.field11192;
                    class2000 = Class1999.field11193;
                    class2001 = Class1999.field11193;
                }
                else {
                    method35642 = this.field3733 / 2;
                    class1999 = Class1999.field11192;
                    class2000 = Class1999.field11192;
                    class2001 = Class1999.field11193;
                }
            }
            else {
                method35642 = this.field3733 / 2;
                class1999 = Class1999.field11193;
                class2000 = Class1999.field11193;
                class2001 = Class1999.field11193;
            }
        }
        else {
            method35642 = this.field3733 / 2;
            class1999 = Class1999.field11192;
            class2000 = Class1999.field11192;
            class2001 = Class1999.field11192;
        }
        final int n8 = this.field3733 - method35642;
        this.field3735.method5290().method5849(Class683.field3727);
        Class8726.method30068(1.0f, 1.0f, 1.0f, 1.0f);
        Class8726.method30011();
        final int n9 = n2 + this.field3740;
        int n10;
        if (!b) {
            n10 = n + this.field3739;
        }
        else {
            n10 = n + this.field3739 - this.field3733 + 26 + 6;
        }
        final int n11 = 32 + this.field3734.size() * 9;
        if (!this.field3734.isEmpty()) {
            if (!b2) {
                this.method3751(n10, n9, this.field3733, n11, 10, 200, 26, 0, 52);
            }
            else {
                this.method3751(n10, n9 + 26 - n11, this.field3733, n11, 10, 200, 26, 0, 52);
            }
        }
        this.method3186(n10, n9, 0, class1999.method8019() * 26, method35642, 26);
        this.method3186(n10 + method35642, n9, 200 - n8, class2000.method8019() * 26, n8, 26);
        this.method3186(n + this.field3739 + 3, n2 + this.field3740, this.field3731.method22531().method8016(), 128 + class2001.method8019() * 26, 26, 26);
        if (!b) {
            this.field3735.fontRenderer.method6609(this.field3732, (float)(n + this.field3739 + 32), (float)(n2 + this.field3740 + 9), -1);
            if (s != null) {
                this.field3735.fontRenderer.method6609(s, (float)(n + this.field3739 + this.field3733 - n6 - 5), (float)(n2 + this.field3740 + 9), -1);
            }
        }
        else {
            this.field3735.fontRenderer.method6609(this.field3732, (float)(n10 + 5), (float)(n2 + this.field3740 + 9), -1);
            if (s != null) {
                this.field3735.fontRenderer.method6609(s, (float)(n + this.field3739 - n6), (float)(n2 + this.field3740 + 9), -1);
            }
        }
        if (!b2) {
            for (int i = 0; i < this.field3734.size(); ++i) {
                this.field3735.fontRenderer.method6610(this.field3734.get(i), (float)(n10 + 5), (float)(n2 + this.field3740 + 9 + 17 + i * 9), -5592406);
            }
        }
        else {
            for (int j = 0; j < this.field3734.size(); ++j) {
                this.field3735.fontRenderer.method6610(this.field3734.get(j), (float)(n10 + 5), (float)(n9 + 26 - n11 + 7 + j * 9), -5592406);
            }
        }
        this.field3735.getItemRenderer().method6541(null, this.field3731.method22529(), n + this.field3739 + 8, n2 + this.field3740 + 5);
    }
    
    public void method3751(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final int n8, final int n9) {
        this.method3186(n, n2, n8, n9, n5, n5);
        this.method3752(n + n5, n2, n3 - n5 - n5, n5, n8 + n5, n9, n6 - n5 - n5, n7);
        this.method3186(n + n3 - n5, n2, n8 + n6 - n5, n9, n5, n5);
        this.method3186(n, n2 + n4 - n5, n8, n9 + n7 - n5, n5, n5);
        this.method3752(n + n5, n2 + n4 - n5, n3 - n5 - n5, n5, n8 + n5, n9 + n7 - n5, n6 - n5 - n5, n7);
        this.method3186(n + n3 - n5, n2 + n4 - n5, n8 + n6 - n5, n9 + n7 - n5, n5, n5);
        this.method3752(n, n2 + n5, n5, n4 - n5 - n5, n8, n9 + n5, n6, n7 - n5 - n5);
        this.method3752(n + n5, n2 + n5, n3 - n5 - n5, n4 - n5 - n5, n8 + n5, n9 + n5, n6 - n5 - n5, n7 - n5 - n5);
        this.method3752(n + n3 - n5, n2 + n5, n5, n4 - n5 - n5, n8 + n6 - n5, n9 + n5, n6, n7 - n5 - n5);
    }
    
    public void method3752(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int a, final int a2) {
        for (int i = 0; i < n3; i += a) {
            final int n7 = n + i;
            final int min = Math.min(a, n3 - i);
            for (int j = 0; j < n4; j += a2) {
                this.method3186(n7, n2 + j, n5, n6, min, Math.min(a2, n4 - j));
            }
        }
    }
    
    public boolean method3753(final int n, final int n2, final int n3, final int n4) {
        if (this.field3731.method22536() && (this.field3738 == null || !this.field3738.method1031())) {
            return false;
        }
        final int n5 = n + this.field3739;
        final int n6 = n5 + 26;
        final int n7 = n2 + this.field3740;
        final int n8 = n7 + 26;
        if (n3 >= n5) {
            if (n3 <= n6) {
                if (n4 >= n7) {
                    if (n4 <= n8) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
    public void method3754() {
        if (this.field3736 == null) {
            if (this.field3730.method31035() != null) {
                this.field3736 = this.method3745(this.field3730);
                if (this.field3736 != null) {
                    this.field3736.method3749(this);
                }
            }
        }
    }
    
    public int method3755() {
        return this.field3740;
    }
    
    public int method3756() {
        return this.field3739;
    }
    
    static {
        field3727 = new ResourceLocation("textures/gui/advancements/widgets.png");
        field3728 = Pattern.compile("(.+) \\S+");
    }
}
