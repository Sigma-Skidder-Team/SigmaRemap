// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.Iterables;

import java.util.stream.Collectors;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.Collection;

import com.google.common.collect.Ordering;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.text.ITextComponent;

import java.util.List;
import java.util.Map;
import java.util.Random;

public class Class685 extends Class565
{
    private static final ResourceLocation field3749;
    private static final ResourceLocation field3750;
    private static final ResourceLocation field3751;
    private final Random field3752;
    private final Class869 field3753;
    private final Class1796 field3754;
    private final Class684 field3755;
    private int field3756;
    private String field3757;
    private int field3758;
    private boolean field3759;
    public float field3760;
    private int field3761;
    private ItemStack field3762;
    public final Class689 field3763;
    private final Class686 field3764;
    private final Class569 field3765;
    private final Class688 field3766;
    private final Class571 field3767;
    private int field3768;
    private String field3769;
    private String field3770;
    private int field3771;
    private int field3772;
    private int field3773;
    private int field3774;
    private int field3775;
    private long field3776;
    private long field3777;
    private int field3778;
    private int field3779;
    private final Map<Class285, List<Class7894>> field3780;
    
    public Class685(final Class869 field3753) {
        this.field3752 = new Random();
        this.field3757 = "";
        this.field3760 = 1.0f;
        this.field3762 = ItemStack.field34174;
        this.field3769 = "";
        this.field3770 = "";
        this.field3780 = Maps.newHashMap();
        this.field3753 = field3753;
        this.field3754 = field3753.method5307();
        this.field3763 = new Class689(field3753);
        this.field3765 = new Class569(field3753);
        this.field3755 = new Class684(field3753);
        this.field3766 = new Class688(field3753, this);
        this.field3767 = new Class571(field3753);
        this.field3764 = new Class686(field3753);
        final Class285[] values = Class285.values();
        for (int length = values.length, i = 0; i < length; ++i) {
            this.field3780.put(values[i], Lists.newArrayList());
        }
        final Class7895 field3754 = Class7895.field32404;
        this.field3780.get(Class285.field1572).add((Object)new Class7893(field3753));
        this.field3780.get(Class285.field1572).add((Object)field3754);
        this.field3780.get(Class285.field1573).add((Object)new Class7893(field3753));
        this.field3780.get(Class285.field1573).add((Object)field3754);
        this.field3780.get(Class285.field1574).add((Object)new Class7896(field3753));
        this.method3778();
    }
    
    public void method3778() {
        this.field3771 = 10;
        this.field3772 = 70;
        this.field3773 = 20;
    }
    
    public void method3779(final float n) {
        this.field3778 = this.field3753.method5332().method7696();
        this.field3779 = this.field3753.method5332().method7697();
        final Class1844 method3809 = this.method3809();
        Class8726.method30011();
        if (!Config.method28917()) {
            Class8726.method30008();
            Class8726.method30117();
        }
        else {
            this.method3798(this.field3753.method5303());
        }
        final ItemStack method3810 = this.field3753.field4684.field3006.method2370(3);
        if (this.field3753.field4648.field23465 == 0) {
            if (method3810.getItem() == Class7521.field29342.method11704()) {
                this.method3796();
            }
        }
        if (!this.field3753.field4684.method2653(Class9439.field40482)) {
            final float method3811 = MathHelper.method35700(n, this.field3753.field4684.field4096, this.field3753.field4684.field4095);
            if (method3811 > 0.0f) {
                this.method3799(method3811);
            }
        }
        if (this.field3753.field4682.method27336() != Class101.field301) {
            if (!this.field3753.field4648.field23464) {
                this.method3784(n);
            }
        }
        else {
            this.field3765.method3322(n);
        }
        if (!this.field3753.field4648.field23464) {
            Class8726.method30068(1.0f, 1.0f, 1.0f, 1.0f);
            this.field3753.method5290().method5849(Class685.field3363);
            Class8726.method30011();
            Class8726.method29999();
            this.method3781();
            Class8933.method31503();
            Class8726.method30117();
            this.field3753.method5327().startSection("bossHealth");
            this.field3767.method3330();
            this.field3753.method5327().endSection();
            Class8726.method30068(1.0f, 1.0f, 1.0f, 1.0f);
            this.field3753.method5290().method5849(Class685.field3363);
            if (this.field3753.field4682.method27310()) {
                this.method3794();
            }
            this.method3795();
            Class8726.method30012();
            final int n2 = this.field3778 / 2 - 91;
            if (!this.field3753.field4684.method4129()) {
                if (this.field3753.field4682.method27330()) {
                    this.method3786(n2);
                }
            }
            else {
                this.method3785(n2);
            }
            if (this.field3753.field4648.field23400 && this.field3753.field4682.method27336() != Class101.field301) {
                this.method3787();
            }
            else if (this.field3753.field4684.isSpectator()) {
                this.field3765.method3325();
            }
        }
        if (this.field3753.field4684.method2852() > 0) {
            this.field3753.method5327().startSection("sleep");
            Class8726.method30007();
            Class8726.method29998();
            final float n3 = (float)this.field3753.field4684.method2852();
            float n4 = n3 / 100.0f;
            if (n4 > 1.0f) {
                n4 = 1.0f - (n3 - 100.0f) / 10.0f;
            }
            Class565.method3293(0, 0, this.field3778, this.field3779, (int)(220.0f * n4) << 24 | 0x101020);
            Class8726.method29999();
            Class8726.method30008();
            this.field3753.method5327().endSection();
            Class8726.method30068(1.0f, 1.0f, 1.0f, 1.0f);
        }
        if (this.field3753.method5268()) {
            this.method3788();
        }
        this.method3783();
        if (this.field3753.field4648.field23466) {
            this.field3763.method3828();
        }
        Label_0204: {
            if (!this.field3753.field4648.field23464) {
                if (this.field3758 > 0) {
                    this.field3753.method5327().startSection("overlayMessage");
                    final float n5 = this.field3758 - n;
                    int n6 = (int)(n5 * 255.0f / 20.0f);
                    if (n6 > 255) {
                        n6 = 255;
                    }
                    if (n6 > 8) {
                        Class8726.method30059();
                        Class8726.method30065((float)(this.field3778 / 2), (float)(this.field3779 - 68), 0.0f);
                        Class8726.method30011();
                        Class8726.method30117();
                        int n7 = 16777215;
                        if (this.field3759) {
                            n7 = (MathHelper.method35697(n5 / 50.0f, 0.7f, 0.6f) & 0xFFFFFF);
                        }
                        final int n8 = n6 << 24 & 0xFF000000;
                        this.method3780(method3809, -4, method3809.method6617(this.field3757));
                        method3809.method6610(this.field3757, (float)(-method3809.method6617(this.field3757) / 2), -4.0f, n7 | n8);
                        Class8726.method30012();
                        Class8726.method30060();
                    }
                    this.field3753.method5327().endSection();
                }
                if (this.field3768 > 0) {
                    this.field3753.method5327().startSection("titleAndSubtitle");
                    final float n9 = this.field3768 - n;
                    int n10 = 255;
                    if (this.field3768 > this.field3773 + this.field3772) {
                        n10 = (int)((this.field3771 + this.field3772 + this.field3773 - n9) * 255.0f / this.field3771);
                    }
                    if (this.field3768 <= this.field3773) {
                        n10 = (int)(n9 * 255.0f / this.field3773);
                    }
                    final int method3812 = MathHelper.method35651(n10, 0, 255);
                    if (method3812 > 8) {
                        Class8726.method30059();
                        Class8726.method30065((float)(this.field3778 / 2), (float)(this.field3779 / 2), 0.0f);
                        Class8726.method30011();
                        Class8726.method30117();
                        Class8726.method30059();
                        Class8726.method30063(4.0f, 4.0f, 4.0f);
                        final int n11 = method3812 << 24 & 0xFF000000;
                        final int method3813 = method3809.method6617(this.field3769);
                        this.method3780(method3809, -10, method3813);
                        method3809.method6609(this.field3769, (float)(-method3813 / 2), -10.0f, 0xFFFFFF | n11);
                        Class8726.method30060();
                        if (!this.field3770.isEmpty()) {
                            Class8726.method30059();
                            Class8726.method30063(2.0f, 2.0f, 2.0f);
                            final int method3814 = method3809.method6617(this.field3770);
                            this.method3780(method3809, 5, method3814);
                            method3809.method6609(this.field3770, (float)(-method3814 / 2), 5.0f, 0xFFFFFF | n11);
                            Class8726.method30060();
                        }
                        Class8726.method30012();
                        Class8726.method30060();
                    }
                    this.field3753.method5327().endSection();
                }
                this.field3764.method3817();
                final Class6516 method3815 = this.field3753.field4683.method6782();
                Class9290 method3816 = null;
                final Class6749 method3817 = method3815.method19651(this.field3753.field4684.method1867());
                if (method3817 != null) {
                    final int method3818 = method3817.getColor().getColorIndex();
                    if (method3818 >= 0) {
                        method3816 = method3815.method19644(3 + method3818);
                    }
                }
                final Class9290 class9290 = (method3816 == null) ? method3815.method19644(1) : method3816;
                if (class9290 != null) {
                    final Class5726 class9291 = new Class5726(true);
                    Class9463.method35173().method35188().method21097(class9291);
                    if (class9291.method16962()) {
                        return;
                    }
                    this.method3789(class9290);
                    Class9463.method35173().method35188().method21097(new Class5726(false));
                }
                Class8726.method30011();
                Class8726.method30117();
                Class8726.method29998();
                Class8726.method30059();
                Class8726.method30065(0.0f, (float)(this.field3779 - 48), 0.0f);
                this.field3753.method5327().startSection("chat");
                this.field3755.method3757(this.field3756);
                this.field3753.method5327().endSection();
                Class8726.method30060();
                final Class9290 method3819 = method3815.method19644(0);
                Label_1448: {
                    if (this.field3753.field4648.field23449.method1056()) {
                        if (this.field3753.method5283()) {
                            if (this.field3753.field4684.field4069.method17370().size() <= 1) {
                                if (method3819 == null) {
                                    break Label_1448;
                                }
                            }
                        }
                        this.field3766.method3820(true);
                        this.field3766.method3821(this.field3778, method3815, method3819);
                        break Label_0204;
                    }
                }
                this.field3766.method3820(false);
            }
        }
        Class8726.method30068(1.0f, 1.0f, 1.0f, 1.0f);
        Class8726.method29999();
    }
    
    private void method3780(final Class1844 class1844, final int n, final int n2) {
        final int method17115 = this.field3753.field4648.method17115(0.0f);
        if (method17115 != 0) {
            final int n3 = -n2 / 2;
            Class565.method3293(n3 - 2, n - 2, n3 + n2 + 2, n + 9 + 2, method17115);
        }
    }
    
    private void method3781() {
        final Class5760 field4648 = this.field3753.field4648;
        if (field4648.field23465 == 0) {
            if (this.field3753.field4682.method27336() != Class101.field301 || this.method3782(this.field3753.field4691)) {
                if (field4648.field23466) {
                    if (!field4648.field23464) {
                        if (!this.field3753.field4684.method2896()) {
                            if (!field4648.field23425) {
                                Class8726.method30059();
                                Class8726.method30065((float)(this.field3778 / 2), (float)(this.field3779 / 2), (float)this.method3303());
                                final Class6092 method5833 = this.field3753.field4644.method5833();
                                Class8726.method30062(method5833.method18163(), -1.0f, 0.0f, 0.0f);
                                Class8726.method30062(method5833.method18164(), 0.0f, 1.0f, 0.0f);
                                Class8726.method30063(-1.0f, -1.0f, -1.0f);
                                Class8726.method30082(10);
                                Class8726.method30060();
                                return;
                            }
                        }
                    }
                }
                Class8726.method30015(Class2050.field11690, Class2135.field12461, Class2050.field11686, Class2135.field12464);
                this.method3186((this.field3778 - 15) / 2, (this.field3779 - 15) / 2, 0, 0, 15, 15);
                if (this.field3753.field4648.field23408 == Class323.field1926) {
                    final float method5834 = this.field3753.field4684.method2904(0.0f);
                    boolean b = false;
                    if (this.field3753.field4690 != null) {
                        if (this.field3753.field4690 instanceof LivingEntity) {
                            if (method5834 >= 1.0f) {
                                b = (this.field3753.field4684.method2903() > 5.0f & this.field3753.field4690.method1768());
                            }
                        }
                    }
                    final int n = this.field3779 / 2 - 7 + 16;
                    final int n2 = this.field3778 / 2 - 8;
                    if (!b) {
                        if (method5834 < 1.0f) {
                            final int n3 = (int)(method5834 * 17.0f);
                            this.method3186(n2, n, 36, 94, 16, 4);
                            this.method3186(n2, n, 52, 94, n3, 4);
                        }
                    }
                    else {
                        this.method3186(n2, n, 68, 94, 16, 16);
                    }
                }
            }
        }
    }
    
    private boolean method3782(final Class7006 class7006) {
        if (class7006 == null) {
            return false;
        }
        if (class7006.method21449() == Class2165.field12882) {
            return ((Class7007)class7006).method21452() instanceof Class434;
        }
        if (class7006.method21449() != Class2165.field12881) {
            return false;
        }
        final BlockPos method21447 = ((BlockRayTraceResult)class7006).method21447();
        final Class1848 field4683 = this.field3753.field4683;
        return field4683.getBlockState(method21447).method21754(field4683, method21447) != null;
    }
    
    public void method3783() {
        final Collection<Class1948> method2651 = this.field3753.field4684.method2651();
        if (method2651.isEmpty()) {
            return;
        }
        Class8726.method30011();
        int n = 0;
        int n2 = 0;
        this.field3753.method5325();
        final ArrayList arrayListWithExpectedSize = Lists.newArrayListWithExpectedSize(method2651.size());
        this.field3753.method5290().method5849(Class516.field3074);
        for (final Class1948 class1948 : Ordering.natural().reverse().sortedCopy((Iterable)method2651)) {
            final Class5328 class1951 = class1948.method7906();
            if (Class9570.field41350.method22605()) {
                if (!Class9570.method35820(class1948, Class9570.field41350, new Object[0])) {
                    continue;
                }
                this.field3753.method5290().method5849(Class516.field3074);
            }
            if (!class1948.method7911()) {
                continue;
            }
            final int field3778 = this.field3778;
            int i = 1;
            if (this.field3753.method5268()) {
                i += 15;
            }
            int j;
            if (!class1951.method16464()) {
                ++n2;
                j = field3778 - 25 * n2;
                i += 26;
            }
            else {
                ++n;
                j = field3778 - 25 * n;
            }
            Class8726.method30068(1.0f, 1.0f, 1.0f, 1.0f);
            float f = 1.0f;
            if (!class1948.method7909()) {
                this.method3186(j, i, 141, 166, 24, 24);
                if (class1948.method7907() <= 200) {
                    f = MathHelper.clamp(class1948.method7907() / 10.0f / 5.0f * 0.5f, 0.0f, 0.5f) + MathHelper.cos(class1948.method7907() * 3.1415927f / 5.0f) * MathHelper.clamp((10 - class1948.method7907() / 20) / 10.0f * 0.25f, 0.0f, 0.25f);
                }
            }
            else {
                this.method3186(j, i, 165, 166, 24, 24);
            }
            arrayListWithExpectedSize.add(() -> {
                final Class5328 class1951;
                final Class1787 class1950;
                class1950.method6446(class1951);
                this.field3753.method5290().method5849(class1949.method7504().method6340());
                Class8726.method30068(1.0f, 1.0f, 1.0f, n3);
                Class565.method3298(n4 + 3, n5 + 3, this.method3303(), 18, 18, class1949);
                return;
            });
            if (!Class9570.field41351.method22605()) {
                continue;
            }
            Class9570.method35826(class1948, Class9570.field41351, this, j, i, this.method3303(), f);
        }
        arrayListWithExpectedSize.forEach(Runnable::run);
    }
    
    public void method3784(final float n) {
        final PlayerEntity method3790 = this.method3790();
        if (method3790 != null) {
            Class8726.method30068(1.0f, 1.0f, 1.0f, 1.0f);
            this.field3753.method5290().method5849(Class685.field3750);
            final ItemStack method3791 = method3790.method2714();
            final Class2226 method3792 = method3790.method2755().method8419();
            final int n2 = this.field3778 / 2;
            final int method3793 = this.method3303();
            this.method3304(-90);
            this.method3186(n2 - 91, this.field3779 - 22, 0, 0, 182, 22);
            this.method3186(n2 - 91 - 1 + method3790.field3006.field2743 * 20, this.field3779 - 22 - 1, 0, 22, 24, 22);
            if (!method3791.method27620()) {
                if (method3792 != Class2226.field13697) {
                    this.method3186(n2 + 91, this.field3779 - 23, 53, 22, 29, 24);
                }
                else {
                    this.method3186(n2 - 91 - 29, this.field3779 - 23, 24, 22, 29, 24);
                }
            }
            this.method3304(method3793);
            Class8726.method30046();
            Class8726.method30011();
            Class8726.method30117();
            Class9404.method34980(false);
            for (int i = 0; i < 9; ++i) {
                this.method3800(n2 - 90 + i * 20 + 2, this.field3779 - 16 - 3, n, method3790, method3790.field3006.field2739.get(i));
            }
            if (!method3791.method27620()) {
                Class9404.method34980(true);
                final int n3 = this.field3779 - 16 - 3;
                if (method3792 != Class2226.field13697) {
                    this.method3800(n2 + 91 + 10, n3, n, method3790, method3791);
                }
                else {
                    this.method3800(n2 - 91 - 26, n3, n, method3790, method3791);
                }
                Class9404.method34980(false);
            }
            if (this.field3753.field4648.field23408 == Class323.field1927) {
                final float method3794 = this.field3753.field4684.method2904(0.0f);
                if (method3794 < 1.0f) {
                    final int n4 = this.field3779 - 20;
                    int n5 = n2 + 91 + 6;
                    if (method3792 == Class2226.field13698) {
                        n5 = n2 - 91 - 22;
                    }
                    this.field3753.method5290().method5849(Class565.field3363);
                    final int n6 = (int)(method3794 * 19.0f);
                    Class8726.method30068(1.0f, 1.0f, 1.0f, 1.0f);
                    this.method3186(n5, n4, 0, 94, 18, 18);
                    this.method3186(n5, n4 + 18 - n6, 18, 112 - n6, 18, n6);
                }
            }
            Class8726.method30047();
            Class8726.method30012();
        }
    }
    
    public void method3785(final int n) {
        this.field3753.method5327().startSection("jumpBar");
        this.field3753.method5290().method5849(Class565.field3363);
        final int n2 = (int)(this.field3753.field4684.method4130() * 183.0f);
        final int n3 = this.field3779 - 32 + 3;
        this.method3186(n, n3, 0, 84, 182, 5);
        if (n2 > 0) {
            this.method3186(n, n3, 0, 89, n2, 5);
        }
        this.field3753.method5327().endSection();
    }
    
    public void method3786(final int n) {
        this.field3753.method5327().startSection("expBar");
        this.field3753.method5290().method5849(Class565.field3363);
        if (this.field3753.field4684.method2875() > 0) {
            final int n2 = (int)(this.field3753.field4684.field3028 * 183.0f);
            final int n3 = this.field3779 - 32 + 3;
            this.method3186(n, n3, 0, 64, 182, 5);
            if (n2 > 0) {
                this.method3186(n, n3, 0, 69, n2, 5);
            }
        }
        this.field3753.method5327().endSection();
        if (this.field3753.field4684.field3026 > 0) {
            this.field3753.method5327().startSection("expLevel");
            int method30384 = 8453920;
            if (Config.method28945()) {
                method30384 = Class8763.method30384(method30384);
            }
            final String string = "" + this.field3753.field4684.field3026;
            final int n4 = (this.field3778 - this.method3809().method6617(string)) / 2;
            final int n5 = this.field3779 - 31 - 4;
            this.method3809().method6610(string, (float)(n4 + 1), (float)n5, 0);
            this.method3809().method6610(string, (float)(n4 - 1), (float)n5, 0);
            this.method3809().method6610(string, (float)n4, (float)(n5 + 1), 0);
            this.method3809().method6610(string, (float)n4, (float)(n5 - 1), 0);
            this.method3809().method6610(string, (float)n4, (float)n5, method30384);
            this.field3753.method5327().endSection();
        }
    }
    
    public void method3787() {
        this.field3753.method5327().startSection("selectedItemName");
        if (this.field3761 > 0) {
            if (!this.field3762.method27620()) {
                final ITextComponent method8469 = new StringTextComponent("").appendSibling(this.field3762.method27664()).applyTextStyle(this.field3762.method27672().field11190);
                if (this.field3762.method27667()) {
                    method8469.applyTextStyle(TextFormatting.ITALIC);
                }
                String s = method8469.getFormattedText();
                if (Class9570.field41336.method22605()) {
                    s = Class9570.method35825(this.field3762, Class9570.field41336, s);
                }
                final int n = (this.field3778 - this.method3809().method6617(s)) / 2;
                int n2 = this.field3779 - 59;
                if (!this.field3753.field4682.method27310()) {
                    n2 += 14;
                }
                int n3 = (int)(this.field3761 * 256.0f / 10.0f);
                if (n3 > 255) {
                    n3 = 255;
                }
                if (n3 > 0) {
                    Class8726.method30059();
                    Class8726.method30011();
                    Class8726.method30117();
                    Class565.method3293(n - 2, n2 - 2, n + this.method3809().method6617(s) + 2, n2 + 9 + 2, this.field3753.field4648.method17116(0));
                    Class1844 class1844 = null;
                    if (Class9570.field41326.method22605()) {
                        class1844 = (Class1844)Class9570.method35826(this.field3762.getItem(), Class9570.field41326, this.field3762);
                    }
                    if (class1844 == null) {
                        this.method3809().method6609(s, (float)n, (float)n2, 16777215 + (n3 << 24));
                    }
                    else {
                        class1844.method6609(s, (float)((this.field3778 - class1844.method6617(s)) / 2), (float)n2, 16777215 + (n3 << 24));
                    }
                    Class8726.method30012();
                    Class8726.method30060();
                }
            }
        }
        this.field3753.method5327().endSection();
    }
    
    public void method3788() {
        this.field3753.method5327().startSection("demo");
        String s;
        if (this.field3753.field4683.method6754() < 120500L) {
            s = Class8822.method30773("demo.remainingTime", Class8272.method27498((int)(120500L - this.field3753.field4683.method6754())));
        }
        else {
            s = Class8822.method30773("demo.demoExpired", new Object[0]);
        }
        this.method3809().method6609(s, (float)(this.field3778 - this.method3809().method6617(s) - 10), 5.0f, 16777215);
        this.field3753.method5327().endSection();
    }
    
    private void method3789(final Class9290 class9290) {
        final Class6516 method34311 = class9290.method34311();
        final Collection<Class7628> method34312 = method34311.method19637(class9290);
        final List<Object> list = method34312.stream().filter(class9293 -> class9293.method23973() != null && !class9293.method23973().startsWith("#")).collect(Collectors.toList());
        List arrayList;
        if (list.size() <= 15) {
            arrayList = list;
        }
        else {
            arrayList = Lists.newArrayList(Iterables.skip((Iterable)list, method34312.size() - 15));
        }
        final String method34313 = class9290.method34314().getFormattedText();
        int a;
        final int n = a = this.method3809().method6617(method34313);
        for (final Class7628 class9291 : arrayList) {
            a = Math.max(a, this.method3809().method6617(Class6749.method20549(method34311.method19651(class9291.method23973()), new StringTextComponent(class9291.method23973())).getFormattedText() + ": " + TextFormatting.RED + class9291.method23969()));
        }
        final int n2 = this.field3779 / 2 + arrayList.size() * 9 / 3;
        final int n3 = this.field3778 - a - 3;
        int n4 = 0;
        final int method34314 = this.field3753.field4648.method17115(0.3f);
        final int method34315 = this.field3753.field4648.method17115(0.4f);
        for (final Class7628 class9292 : arrayList) {
            ++n4;
            final String method34316 = Class6749.method20549(method34311.method19651(class9292.method23973()), new StringTextComponent(class9292.method23973())).getFormattedText();
            final String string = TextFormatting.RED + "" + class9292.method23969();
            final int n5 = n2 - n4 * 9;
            final int n6 = this.field3778 - 3 + 2;
            Class565.method3293(n3 - 2, n5, n6, n5 + 9, method34314);
            this.method3809().method6610(method34316, (float)n3, (float)n5, -1);
            this.method3809().method6610(string, (float)(n6 - this.method3809().method6617(string)), (float)n5, -1);
            if (n4 != arrayList.size()) {
                continue;
            }
            Class565.method3293(n3 - 2, n5 - 9 - 1, n6, n5 - 1, method34315);
            Class565.method3293(n3 - 2, n5 - 1, n6, n5, method34314);
            this.method3809().method6610(method34313, (float)(n3 + a / 2 - n / 2), (float)(n5 - 9), -1);
        }
    }
    
    private PlayerEntity method3790() {
        return (this.field3753.method5303() instanceof PlayerEntity) ? ((PlayerEntity)this.field3753.method5303()) : null;
    }
    
    private LivingEntity method3791() {
        final PlayerEntity method3790 = this.method3790();
        if (method3790 != null) {
            final Entity method3791 = method3790.method1920();
            if (method3791 == null) {
                return null;
            }
            if (method3791 instanceof LivingEntity) {
                return (LivingEntity)method3791;
            }
        }
        return null;
    }
    
    private int method3792(final LivingEntity class511) {
        if (class511 != null && class511.method1779()) {
            int n = (int)(class511.method2701() + 0.5f) / 2;
            if (n > 30) {
                n = 30;
            }
            return n;
        }
        return 0;
    }
    
    private int method3793(final int n) {
        return (int)Math.ceil(n / 10.0);
    }
    
    private void method3794() {
        final PlayerEntity method3790 = this.method3790();
        if (method3790 != null) {
            final int method3791 = MathHelper.ceil(method3790.method2664());
            final boolean b = this.field3777 > this.field3756 && (this.field3777 - this.field3756) / 3L % 2L == 1L;
            final long method3792 = Class8349.method27837();
            if (method3791 < this.field3774 && method3790.hurtResistantTime > 0) {
                this.field3776 = method3792;
                this.field3777 = this.field3756 + 20;
            }
            else if (method3791 > this.field3774) {
                if (method3790.hurtResistantTime > 0) {
                    this.field3776 = method3792;
                    this.field3777 = this.field3756 + 10;
                }
            }
            if (method3792 - this.field3776 > 1000L) {
                this.field3774 = method3791;
                this.field3775 = method3791;
                this.field3776 = method3792;
            }
            this.field3774 = method3791;
            final int field3775 = this.field3775;
            this.field3752.setSeed(this.field3756 * 312871);
            final int method3793 = method3790.method2877().method33491();
            final Class7619 method3794 = method3790.method2710(Class8107.field33405);
            final int n = this.field3778 / 2 - 91;
            final int n2 = this.field3778 / 2 + 91;
            final int n3 = this.field3779 - 39;
            final float n4 = (float)method3794.method23950();
            final int method3795 = MathHelper.ceil(method3790.method2750());
            final int method3796 = MathHelper.ceil((n4 + method3795) / 2.0f / 10.0f);
            final int max = Math.max(10 - (method3796 - 2), 3);
            final int n5 = n3 - (method3796 - 1) * max - 10;
            int n6 = n3 - 10;
            int n7 = method3795;
            final int method3797 = method3790.method2693();
            int n8 = -1;
            if (method3790.method2653(Class9439.field40483)) {
                n8 = this.field3756 % MathHelper.ceil(n4 + 5.0f);
            }
            this.field3753.method5327().startSection("armor");
            for (int i = 0; i < 10; ++i) {
                if (method3797 > 0) {
                    final int n9 = n + i * 8;
                    if (i * 2 + 1 < method3797) {
                        this.method3186(n9, n5, 34, 9, 9, 9);
                    }
                    if (i * 2 + 1 == method3797) {
                        this.method3186(n9, n5, 25, 9, 9, 9);
                    }
                    if (i * 2 + 1 > method3797) {
                        this.method3186(n9, n5, 16, 9, 9, 9);
                    }
                }
            }
            this.field3753.method5327().method15300("health");
            for (int j = MathHelper.ceil((n4 + method3795) / 2.0f) - 1; j >= 0; --j) {
                int n10 = 16;
                if (!method3790.method2653(Class9439.field40492)) {
                    if (method3790.method2653(Class9439.field40493)) {
                        n10 += 72;
                    }
                }
                else {
                    n10 += 36;
                }
                int n11 = 0;
                if (b) {
                    n11 = 1;
                }
                final int n12 = MathHelper.ceil((j + 1) / 10.0f) - 1;
                final int n13 = n + j % 10 * 8;
                int n14 = n3 - n12 * max;
                if (method3791 <= 4) {
                    n14 += this.field3752.nextInt(2);
                }
                if (n7 <= 0) {
                    if (j == n8) {
                        n14 -= 2;
                    }
                }
                int n15 = 0;
                if (method3790.world.method6764().method29568()) {
                    n15 = 5;
                }
                this.method3186(n13, n14, 16 + n11 * 9, 9 * n15, 9, 9);
                if (b) {
                    if (j * 2 + 1 < field3775) {
                        this.method3186(n13, n14, n10 + 54, 9 * n15, 9, 9);
                    }
                    if (j * 2 + 1 == field3775) {
                        this.method3186(n13, n14, n10 + 63, 9 * n15, 9, 9);
                    }
                }
                if (n7 <= 0) {
                    if (j * 2 + 1 < method3791) {
                        this.method3186(n13, n14, n10 + 36, 9 * n15, 9, 9);
                    }
                    if (j * 2 + 1 == method3791) {
                        this.method3186(n13, n14, n10 + 45, 9 * n15, 9, 9);
                    }
                }
                else if (n7 == method3795 && method3795 % 2 == 1) {
                    this.method3186(n13, n14, n10 + 153, 9 * n15, 9, 9);
                    --n7;
                }
                else {
                    this.method3186(n13, n14, n10 + 144, 9 * n15, 9, 9);
                    n7 -= 2;
                }
            }
            final int method3798 = this.method3792(this.method3791());
            if (method3798 == 0) {
                this.field3753.method5327().method15300("food");
                for (int k = 0; k < 10; ++k) {
                    int n16 = n3;
                    int n17 = 16;
                    int n18 = 0;
                    if (method3790.method2653(Class9439.field40490)) {
                        n17 += 36;
                        n18 = 13;
                    }
                    if (method3790.method2877().method33494() <= 0.0f) {
                        if (this.field3756 % (method3793 * 3 + 1) == 0) {
                            n16 = n3 + (this.field3752.nextInt(3) - 1);
                        }
                    }
                    final int n19 = n2 - k * 8 - 9;
                    this.method3186(n19, n16, 16 + n18 * 9, 27, 9, 9);
                    if (k * 2 + 1 < method3793) {
                        this.method3186(n19, n16, n17 + 36, 27, 9, 9);
                    }
                    if (k * 2 + 1 == method3793) {
                        this.method3186(n19, n16, n17 + 45, 27, 9, 9);
                    }
                }
                n6 -= 10;
            }
            this.field3753.method5327().method15300("air");
            final int method3799 = method3790.getAir();
            final int method3800 = method3790.getMaxAir();
            if (method3790.method1720(Class7324.field28319) || method3799 < method3800) {
                final int n20 = n6 - (this.method3793(method3798) - 1) * 10;
                for (int method3801 = MathHelper.ceil((method3799 - 2) * 10.0 / method3800), n21 = MathHelper.ceil(method3799 * 10.0 / method3800) - method3801, l = 0; l < method3801 + n21; ++l) {
                    if (l >= method3801) {
                        this.method3186(n2 - l * 8 - 9, n20, 25, 18, 9, 9);
                    }
                    else {
                        this.method3186(n2 - l * 8 - 9, n20, 16, 18, 9, 9);
                    }
                }
            }
            this.field3753.method5327().endSection();
        }
    }
    
    private void method3795() {
        final LivingEntity method3791 = this.method3791();
        if (method3791 != null) {
            int i = this.method3792(method3791);
            if (i != 0) {
                final int n = (int)Math.ceil(method3791.method2664());
                this.field3753.method5327().method15300("mountHealth");
                final int n2 = this.field3779 - 39;
                final int n3 = this.field3778 / 2 + 91;
                int n4 = n2;
                int n5 = 0;
                while (i > 0) {
                    final int min = Math.min(i, 10);
                    i -= min;
                    for (int j = 0; j < min; ++j) {
                        final int n6 = 0;
                        final int n7 = n3 - j * 8 - 9;
                        this.method3186(n7, n4, 52 + n6 * 9, 9, 9, 9);
                        if (j * 2 + 1 + n5 < n) {
                            this.method3186(n7, n4, 88, 9, 9, 9);
                        }
                        if (j * 2 + 1 + n5 == n) {
                            this.method3186(n7, n4, 97, 9, 9, 9);
                        }
                    }
                    n4 -= 10;
                    n5 += 20;
                }
            }
        }
    }
    
    private void method3796() {
        Class8726.method30007();
        Class8726.method30010(false);
        Class8726.method30117();
        Class8726.method30068(1.0f, 1.0f, 1.0f, 1.0f);
        Class8726.method29998();
        this.field3753.method5290().method5849(Class685.field3751);
        final Class7392 method22694 = Class7392.method22694();
        final Class4148 method22695 = method22694.method22696();
        method22695.method12390(7, Class9237.field39617);
        method22695.method12432(0.0, this.field3779, -90.0).method12391(0.0f, 1.0f).method12397();
        method22695.method12432(this.field3778, this.field3779, -90.0).method12391(1.0f, 1.0f).method12397();
        method22695.method12432(this.field3778, 0.0, -90.0).method12391(1.0f, 0.0f).method12397();
        method22695.method12432(0.0, 0.0, -90.0).method12391(0.0f, 0.0f).method12397();
        method22694.method22695();
        Class8726.method30010(true);
        Class8726.method30008();
        Class8726.method29999();
        Class8726.method30068(1.0f, 1.0f, 1.0f, 1.0f);
    }
    
    private void method3797(final Entity class399) {
        if (class399 != null) {
            this.field3760 += (float)((MathHelper.clamp(1.0f - class399.method1726(), 0.0f, 1.0f) - this.field3760) * 0.01);
        }
    }
    
    private void method3798(final Entity class399) {
        if (Config.method28917()) {
            final WorldBorder method6787 = this.field3753.field4683.getWorldBorder();
            final float n = (float)method6787.method34782(class399);
            final double max = Math.max(method6787.method34807(), Math.min(method6787.method34804() * method6787.method34805() * 1000.0, Math.abs(method6787.method34793() - method6787.method34791())));
            float n2;
            if (n >= max) {
                n2 = 0.0f;
            }
            else {
                n2 = 1.0f - (float)(n / max);
            }
            Class8726.method30007();
            Class8726.method30010(false);
            Class8726.method30015(Class2050.field11696, Class2135.field12461, Class2050.field11686, Class2135.field12464);
            if (n2 <= 0.0f) {
                Class8726.method30068(this.field3760, this.field3760, this.field3760, 1.0f);
            }
            else {
                Class8726.method30068(0.0f, n2, n2, 1.0f);
            }
            this.field3753.method5290().method5849(Class685.field3749);
            final Class7392 method6788 = Class7392.method22694();
            final Class4148 method6789 = method6788.method22696();
            method6789.method12390(7, Class9237.field39617);
            method6789.method12432(0.0, this.field3779, -90.0).method12391(0.0f, 1.0f).method12397();
            method6789.method12432(this.field3778, this.field3779, -90.0).method12391(1.0f, 1.0f).method12397();
            method6789.method12432(this.field3778, 0.0, -90.0).method12391(1.0f, 0.0f).method12397();
            method6789.method12432(0.0, 0.0, -90.0).method12391(0.0f, 0.0f).method12397();
            method6788.method22695();
            Class8726.method30010(true);
            Class8726.method30008();
            Class8726.method30068(1.0f, 1.0f, 1.0f, 1.0f);
            Class8726.method30117();
        }
        else {
            Class8726.method30008();
            Class8726.method30015(Class2050.field11693, Class2135.field12460, Class2050.field11686, Class2135.field12464);
        }
    }
    
    private void method3799(float n) {
        if (n < 1.0f) {
            n *= n;
            n *= n;
            n = n * 0.8f + 0.2f;
        }
        Class8726.method29998();
        Class8726.method30007();
        Class8726.method30010(false);
        Class8726.method30117();
        Class8726.method30068(1.0f, 1.0f, 1.0f, n);
        this.field3753.method5290().method5849(Class1774.field9853);
        final Class1912 method35427 = this.field3753.method5305().method5787().method35427(Class7521.field29341.getDefaultState());
        final float method35428 = method35427.method7497();
        final float method35429 = method35427.method7500();
        final float method35430 = method35427.method7498();
        final float method35431 = method35427.method7501();
        final Class7392 method35432 = Class7392.method22694();
        final Class4148 method35433 = method35432.method22696();
        method35433.method12390(7, Class9237.field39617);
        method35433.method12432(0.0, this.field3779, -90.0).method12391(method35428, method35431).method12397();
        method35433.method12432(this.field3778, this.field3779, -90.0).method12391(method35430, method35431).method12397();
        method35433.method12432(this.field3778, 0.0, -90.0).method12391(method35430, method35429).method12397();
        method35433.method12432(0.0, 0.0, -90.0).method12391(method35428, method35429).method12397();
        method35432.method22695();
        Class8726.method30010(true);
        Class8726.method30008();
        Class8726.method29999();
        Class8726.method30068(1.0f, 1.0f, 1.0f, 1.0f);
    }
    
    private void method3800(final int n, final int n2, final float n3, final PlayerEntity playerEntity, final ItemStack class513) {
        if (!class513.method27620()) {
            final float n4 = class513.method27688() - n3;
            if (n4 > 0.0f) {
                Class8726.method30059();
                final float n5 = 1.0f + n4 / 5.0f;
                Class8726.method30065((float)(n + 8), (float)(n2 + 12), 0.0f);
                Class8726.method30063(1.0f / n5, (n5 + 1.0f) / 2.0f, 1.0f);
                Class8726.method30065((float)(-(n + 8)), (float)(-(n2 + 12)), 0.0f);
            }
            this.field3754.method6541(playerEntity, class513, n, n2);
            if (n4 > 0.0f) {
                Class8726.method30060();
            }
            this.field3754.method6542(this.field3753.field4643, class513, n, n2);
        }
    }
    
    public void method3801() {
        if (this.field3753.field4683 == null) {
            Class8287.method27536();
        }
        if (this.field3758 > 0) {
            --this.field3758;
        }
        if (this.field3768 > 0) {
            --this.field3768;
            if (this.field3768 <= 0) {
                this.field3769 = "";
                this.field3770 = "";
            }
        }
        ++this.field3756;
        final Entity method5303 = this.field3753.method5303();
        if (method5303 != null) {
            this.method3797(method5303);
        }
        if (this.field3753.field4684 != null) {
            final ItemStack method5304 = this.field3753.field4684.field3006.method2345();
            boolean equals = true;
            if (Class9570.field41336.method22605()) {
                equals = Config.equals(Class9570.method35825(method5304, Class9570.field41336, method5304.method27664().getUnformattedComponentText()), Class9570.method35825(this.field3762, Class9570.field41336, this.field3762.method27664().getUnformattedComponentText()));
            }
            Label_0317: {
                if (!method5304.method27620()) {
                    if (!this.field3762.method27620()) {
                        if (method5304.getItem() == this.field3762.getItem()) {
                            if (method5304.method27664().equals(this.field3762.method27664())) {
                                if (equals) {
                                    if (this.field3761 <= 0) {
                                        break Label_0317;
                                    }
                                    --this.field3761;
                                    break Label_0317;
                                }
                            }
                        }
                    }
                    this.field3761 = 40;
                }
                else {
                    this.field3761 = 0;
                }
            }
            this.field3762 = method5304;
        }
    }
    
    public void method3802(final String s) {
        this.method3803(Class8822.method30773("record.nowPlaying", s), true);
    }
    
    public void method3803(final String field3757, final boolean field3758) {
        this.field3757 = field3757;
        this.field3758 = 60;
        this.field3759 = field3758;
    }
    
    public void method3804(final String field3769, final String field3770, final int field3771, final int field3772, final int field3773) {
        if (field3769 == null) {
            if (field3770 == null) {
                if (field3771 < 0) {
                    if (field3772 < 0) {
                        if (field3773 < 0) {
                            this.field3769 = "";
                            this.field3770 = "";
                            this.field3768 = 0;
                            return;
                        }
                    }
                }
            }
        }
        if (field3769 == null) {
            if (field3770 == null) {
                if (field3771 >= 0) {
                    this.field3771 = field3771;
                }
                if (field3772 >= 0) {
                    this.field3772 = field3772;
                }
                if (field3773 >= 0) {
                    this.field3773 = field3773;
                }
                if (this.field3768 > 0) {
                    this.field3768 = this.field3771 + this.field3772 + this.field3773;
                }
            }
            else {
                this.field3770 = field3770;
            }
        }
        else {
            this.field3769 = field3769;
            this.field3768 = this.field3771 + this.field3772 + this.field3773;
        }
    }
    
    public void method3805(final ITextComponent class2250, final boolean b) {
        this.method3803(class2250.getString(), b);
    }
    
    public void method3806(final Class285 class285, final ITextComponent class286) {
        final Iterator iterator = this.field3780.get(class285).iterator();
        while (iterator.hasNext()) {
            ((Class7894)iterator.next()).method25555(class285, class286);
        }
    }
    
    public Class684 method3807() {
        return this.field3755;
    }
    
    public int method3808() {
        return this.field3756;
    }
    
    public Class1844 method3809() {
        return this.field3753.field4643;
    }
    
    public Class569 method3810() {
        return this.field3765;
    }
    
    public Class688 method3811() {
        return this.field3766;
    }
    
    public void method3812() {
        this.field3766.method3826();
        this.field3767.method3333();
        this.field3753.method5318().method3851();
    }
    
    public Class571 method3813() {
        return this.field3767;
    }
    
    public void method3814() {
        this.field3763.method3827();
    }
    
    static {
        field3749 = new ResourceLocation("textures/misc/vignette.png");
        field3750 = new ResourceLocation("textures/gui/widgets.png");
        field3751 = new ResourceLocation("textures/misc/pumpkinblur.png");
    }
}
