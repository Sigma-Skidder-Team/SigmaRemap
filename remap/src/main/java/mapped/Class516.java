// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.datafixers.util.Pair;
import com.google.common.collect.Sets;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.text.ITextComponent;

import java.util.Set;

public abstract class Class516<T extends Class3418> extends Class527 implements Class725<T>
{
    public static final Class1932 field3074;
    public int field3075;
    public int field3076;
    public final T field3077;
    public final Class464 field3078;
    public int field3079;
    public int field3080;
    public Class6601 field3081;
    private Class6601 field3082;
    private boolean field3083;
    private ItemStack field3084;
    private int field3085;
    private int field3086;
    private Class6601 field3087;
    private long field3088;
    private ItemStack field3089;
    private Class6601 field3090;
    private long field3091;
    public final Set<Class6601> field3092;
    public boolean field3093;
    private int field3094;
    private int field3095;
    private boolean field3096;
    private int field3097;
    private long field3098;
    private Class6601 field3099;
    private int field3100;
    private boolean field3101;
    private ItemStack field3102;
    
    public Class516(final T field3077, final Class464 field3078, final ITextComponent class2250) {
        super(class2250);
        this.field3075 = 176;
        this.field3076 = 166;
        this.field3084 = ItemStack.field34174;
        this.field3089 = ItemStack.field34174;
        this.field3092 = Sets.newHashSet();
        this.field3102 = ItemStack.field34174;
        this.field3077 = field3077;
        this.field3078 = field3078;
        this.field3096 = true;
    }
    
    @Override
    public void method2969() {
        super.method2969();
        this.field3079 = (this.field3152 - this.field3075) / 2;
        this.field3080 = (this.field3153 - this.field3076) / 2;
    }
    
    @Override
    public void method2975(final int n, final int n2, final float n3) {
        final int field3079 = this.field3079;
        final int field3080 = this.field3080;
        this.method2976(n3, n, n2);
        Class8726.method30047();
        Class8726.method30007();
        super.method2975(n, n2, n3);
        Class8726.method30059();
        Class8726.method30065((float)field3079, (float)field3080, 0.0f);
        Class8726.method30068(1.0f, 1.0f, 1.0f, 1.0f);
        Class8726.method30046();
        this.field3081 = null;
        Class8726.method30084(33986, 240.0f, 240.0f);
        Class8726.method30068(1.0f, 1.0f, 1.0f, 1.0f);
        for (int i = 0; i < this.field3077.field16151.size(); ++i) {
            final Class6601 field3081 = this.field3077.field16151.get(i);
            if (field3081.method20062()) {
                this.method2979(field3081);
            }
            if (this.method2986(field3081, n, n2)) {
                if (field3081.method20062()) {
                    this.field3081 = field3081;
                    Class8726.method30007();
                    final int field3082 = field3081.field26175;
                    final int field3083 = field3081.field26176;
                    Class8726.method30049(true, true, true, false);
                    this.method3189(field3082, field3083, field3082 + 16, field3083 + 16, -2130706433, -2130706433);
                    Class8726.method30049(true, true, true, true);
                    Class8726.method30008();
                }
            }
        }
        this.method2973(n, n2);
        final Class464 field3084 = this.field3150.field4684.field3006;
        ItemStack class8321 = this.field3084.method27620() ? field3084.method2375() : this.field3084;
        if (!class8321.method27620()) {
            final int n4 = this.field3084.method27620() ? 8 : 16;
            String string = null;
            if (!this.field3084.method27620() && this.field3083) {
                class8321 = class8321.method27641();
                class8321.method27691(MathHelper.method35649(class8321.method27690() / 2.0f));
            }
            else if (this.field3093) {
                if (this.field3092.size() > 1) {
                    class8321 = class8321.method27641();
                    class8321.method27691(this.field3097);
                    if (class8321.method27620()) {
                        string = "" + TextFormatting.YELLOW + "0";
                    }
                }
            }
            this.method2978(class8321, n - field3079 - 8, n2 - field3080 - n4, string);
        }
        if (!this.field3089.method27620()) {
            float n5 = (Class8349.method27837() - this.field3088) / 100.0f;
            if (n5 >= 1.0f) {
                n5 = 1.0f;
                this.field3089 = ItemStack.field34174;
            }
            this.method2978(this.field3089, this.field3085 + (int)((this.field3087.field26175 - this.field3085) * n5), this.field3086 + (int)((this.field3087.field26176 - this.field3086) * n5), null);
        }
        Class8726.method30060();
        Class8726.method30008();
    }
    
    public void method2977(final int n, final int n2) {
        if (this.field3150.field4684.field3006.method2375().method27620()) {
            if (this.field3081 != null) {
                if (this.field3081.method20054()) {
                    this.method3014(this.field3081.method20053(), n, n2);
                }
            }
        }
    }
    
    private void method2978(final ItemStack class8321, final int n, final int n2, final String s) {
        Class8726.method30065(0.0f, 0.0f, 32.0f);
        this.method3304(200);
        this.field3151.field9952 = 200.0f;
        this.field3151.method6540(class8321, n, n2);
        this.field3151.method6543(this.field3156, class8321, n, n2 - (this.field3084.method27620() ? 0 : 8), s);
        this.method3304(0);
        this.field3151.field9952 = 0.0f;
    }
    
    public void method2973(final int n, final int n2) {
    }
    
    public abstract void method2976(final float p0, final int p1, final int p2);
    
    private void method2979(final Class6601 class6601) {
        final int field26175 = class6601.field26175;
        final int field26176 = class6601.field26176;
        ItemStack class6602 = class6601.method20053();
        boolean b = false;
        int n = 0;
        Label_0060: {
            if (class6601 == this.field3082) {
                if (!this.field3084.method27620()) {
                    if (!this.field3083) {
                        n = 1;
                        break Label_0060;
                    }
                }
            }
            n = 0;
        }
        int n2 = n;
        final ItemStack method2375 = this.field3150.field4684.field3006.method2375();
        String string = null;
        Label_0095: {
            if (class6601 == this.field3082) {
                if (!this.field3084.method27620()) {
                    if (this.field3083) {
                        if (!class6602.method27620()) {
                            class6602 = class6602.method27641();
                            class6602.method27691(class6602.method27690() / 2);
                            break Label_0095;
                        }
                    }
                }
            }
            if (this.field3093) {
                if (this.field3092.contains(class6601)) {
                    if (!method2375.method27620()) {
                        if (this.field3092.size() == 1) {
                            return;
                        }
                        if (Class3418.method10894(class6601, method2375, true) && this.field3077.method10896(class6601)) {
                            class6602 = method2375.method27641();
                            b = true;
                            Class3418.method10895(this.field3092, this.field3094, class6602, class6601.method20053().method27620() ? 0 : class6601.method20053().method27690());
                            final int min = Math.min(class6602.method27628(), class6601.method20058(class6602));
                            if (class6602.method27690() > min) {
                                string = TextFormatting.YELLOW.toString() + min;
                                class6602.method27691(min);
                            }
                        }
                        else {
                            this.field3092.remove(class6601);
                            this.method2980();
                        }
                    }
                }
            }
        }
        this.method3304(100);
        this.field3151.field9952 = 100.0f;
        if (class6602.method27620()) {
            if (class6601.method20062()) {
                final Pair<Class1932, Class1932> method2376 = class6601.method20059();
                if (method2376 != null) {
                    final Class1912 class6603 = this.field3150.method5296((Class1932)method2376.getFirst()).apply((Class1932)method2376.getSecond());
                    this.field3150.method5290().method5849(class6603.method7504().method6340());
                    Class565.method3298(field26175, field26176, this.method3303(), 16, 16, class6603);
                    n2 = 1;
                }
            }
        }
        if (n2 == 0) {
            if (b) {
                Class565.method3293(field26175, field26176, field26175 + 16, field26176 + 16, -2130706433);
            }
            Class8726.method30008();
            this.field3151.method6541(this.field3150.field4684, class6602, field26175, field26176);
            this.field3151.method6543(this.field3156, class6602, field26175, field26176, string);
        }
        this.field3151.field9952 = 0.0f;
        this.method3304(0);
    }
    
    private void method2980() {
        final ItemStack method2375 = this.field3150.field4684.field3006.method2375();
        if (!method2375.method27620()) {
            if (this.field3093) {
                if (this.field3094 != 2) {
                    this.field3097 = method2375.method27690();
                    for (final Class6601 class6601 : this.field3092) {
                        final ItemStack method2376 = method2375.method27641();
                        final ItemStack method2377 = class6601.method20053();
                        final int n = method2377.method27620() ? 0 : method2377.method27690();
                        Class3418.method10895(this.field3092, this.field3094, method2376, n);
                        final int min = Math.min(method2376.method27628(), class6601.method20058(method2376));
                        if (method2376.method27690() > min) {
                            method2376.method27691(min);
                        }
                        this.field3097 -= method2376.method27690() - n;
                    }
                }
                else {
                    this.field3097 = method2375.method27628();
                }
            }
        }
    }
    
    private Class6601 method2981(final double n, final double n2) {
        for (int i = 0; i < this.field3077.field16151.size(); ++i) {
            final Class6601 class6601 = this.field3077.field16151.get(i);
            if (this.method2986(class6601, n, n2) && class6601.method20062()) {
                return class6601;
            }
        }
        return null;
    }
    
    @Override
    public boolean method2982(final double n, final double n2, final int n3) {
        if (!super.method2982(n, n2, n3)) {
            final boolean method1067 = this.field3150.field4648.field23447.method1067(n3);
            final Class6601 method1068 = this.method2981(n, n2);
            final long method1069 = Class8349.method27837();
            boolean field3101 = false;
            Label_0091: {
                if (this.field3099 == method1068) {
                    if (method1069 - this.field3098 < 250L) {
                        if (this.field3100 == n3) {
                            field3101 = true;
                            break Label_0091;
                        }
                    }
                }
                field3101 = false;
            }
            this.field3101 = field3101;
            this.field3096 = false;
            Label_0162: {
                if (n3 != 0) {
                    if (n3 != 1) {
                        if (!method1067) {
                            break Label_0162;
                        }
                    }
                }
                final boolean method1070 = this.method2983(n, n2, this.field3079, this.field3080, n3);
                int field3102 = -1;
                if (method1068 != null) {
                    field3102 = method1068.field26174;
                }
                if (method1070) {
                    field3102 = -999;
                }
                if (this.field3150.field4648.field23429) {
                    if (method1070) {
                        if (this.field3150.field4684.field3006.method2375().method27620()) {
                            this.field3150.method5244(null);
                            return true;
                        }
                    }
                }
                if (field3102 != -1) {
                    if (!this.field3150.field4648.field23429) {
                        if (!this.field3093) {
                            if (!this.field3150.field4684.field3006.method2375().method27620()) {
                                this.field3093 = true;
                                this.field3095 = n3;
                                this.field3092.clear();
                                if (n3 != 0) {
                                    if (n3 != 1) {
                                        if (this.field3150.field4648.field23447.method1067(n3)) {
                                            this.field3094 = 2;
                                        }
                                    }
                                    else {
                                        this.field3094 = 1;
                                    }
                                }
                                else {
                                    this.field3094 = 0;
                                }
                            }
                            else {
                                if (!this.field3150.field4648.field23447.method1067(n3)) {
                                    final boolean b = field3102 != -999 && (Class8341.method27798(Class869.method5277().method5332().method7690(), 340) || Class8341.method27798(Class869.method5277().method5332().method7690(), 344));
                                    Class2133 class2133 = Class2133.field12437;
                                    if (!b) {
                                        if (field3102 == -999) {
                                            class2133 = Class2133.field12441;
                                        }
                                    }
                                    else {
                                        this.field3102 = ((method1068 != null && method1068.method20054()) ? method1068.method20053().method27641() : ItemStack.field34174);
                                        class2133 = Class2133.field12438;
                                    }
                                    this.method2988(method1068, field3102, n3, class2133);
                                }
                                else {
                                    this.method2988(method1068, field3102, n3, Class2133.field12440);
                                }
                                this.field3096 = true;
                            }
                        }
                    }
                    else if (method1068 != null && method1068.method20054()) {
                        this.field3082 = method1068;
                        this.field3084 = ItemStack.field34174;
                        this.field3083 = (n3 == 1);
                    }
                    else {
                        this.field3082 = null;
                    }
                }
            }
            this.field3099 = method1068;
            this.field3098 = method1069;
            this.field3100 = n3;
            return true;
        }
        return true;
    }
    
    public boolean method2983(final double n, final double n2, final int n3, final int n4, final int n5) {
        if (n >= n3) {
            if (n2 >= n4) {
                if (n < n3 + this.field3075) {
                    if (n2 < n4 + this.field3076) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
    
    @Override
    public boolean method2984(final double n, final double n2, final int n3, final double n4, final double n5) {
        final Class6601 method2981 = this.method2981(n, n2);
        final ItemStack method2982 = this.field3150.field4684.field3006.method2375();
        if (this.field3082 != null && this.field3150.field4648.field23429) {
            if (n3 == 0 || n3 == 1) {
                if (!this.field3084.method27620()) {
                    if (this.field3084.method27690() > 1) {
                        if (method2981 != null) {
                            if (Class3418.method10894(method2981, this.field3084, false)) {
                                final long method2983 = Class8349.method27837();
                                if (this.field3090 != method2981) {
                                    this.field3090 = method2981;
                                    this.field3091 = method2983;
                                }
                                else if (method2983 - this.field3091 > 500L) {
                                    this.method2988(this.field3082, this.field3082.field26174, 0, Class2133.field12437);
                                    this.method2988(method2981, method2981.field26174, 1, Class2133.field12437);
                                    this.method2988(this.field3082, this.field3082.field26174, 0, Class2133.field12437);
                                    this.field3091 = method2983 + 750L;
                                    this.field3084.method27693(1);
                                }
                            }
                        }
                    }
                }
                else if (method2981 != this.field3082) {
                    if (!this.field3082.method20053().method27620()) {
                        this.field3084 = this.field3082.method20053().method27641();
                    }
                }
            }
        }
        else if (this.field3093) {
            if (method2981 != null) {
                if (!method2982.method27620()) {
                    if (method2982.method27690() > this.field3092.size() || this.field3094 == 2) {
                        if (Class3418.method10894(method2981, method2982, true)) {
                            if (method2981.method20046(method2982)) {
                                if (this.field3077.method10896(method2981)) {
                                    this.field3092.add(method2981);
                                    this.method2980();
                                }
                            }
                        }
                    }
                }
            }
        }
        return true;
    }
    
    @Override
    public boolean method2985(final double n, final double n2, final int n3) {
        final Class6601 method2981 = this.method2981(n, n2);
        final int field3079 = this.field3079;
        final int field3080 = this.field3080;
        final boolean method2982 = this.method2983(n, n2, field3079, field3080, n3);
        int field3081 = -1;
        if (method2981 != null) {
            field3081 = method2981.field26174;
        }
        if (method2982) {
            field3081 = -999;
        }
        Label_0101: {
            if (this.field3101) {
                if (method2981 != null) {
                    if (n3 == 0) {
                        if (this.field3077.method10857(ItemStack.field34174, method2981)) {
                            if (!Class527.method3047()) {
                                this.method2988(method2981, field3081, n3, Class2133.field12443);
                            }
                            else if (!this.field3102.method27620()) {
                                for (final Class6601 class6601 : this.field3077.field16151) {
                                    if (class6601 == null) {
                                        continue;
                                    }
                                    if (!class6601.method20061(this.field3150.field4684)) {
                                        continue;
                                    }
                                    if (!class6601.method20054()) {
                                        continue;
                                    }
                                    if (class6601.field26173 != method2981.field26173) {
                                        continue;
                                    }
                                    if (!Class3418.method10894(class6601, this.field3102, true)) {
                                        continue;
                                    }
                                    this.method2988(class6601, class6601.field26174, n3, Class2133.field12438);
                                }
                            }
                            this.field3101 = false;
                            this.field3098 = 0L;
                            break Label_0101;
                        }
                    }
                }
            }
            if (this.field3093 && this.field3095 != n3) {
                this.field3093 = false;
                this.field3092.clear();
                return this.field3096 = true;
            }
            if (this.field3096) {
                this.field3096 = false;
                return true;
            }
            if (this.field3082 != null && this.field3150.field4648.field23429) {
                if (n3 == 0 || n3 == 1) {
                    if (this.field3084.method27620()) {
                        if (method2981 != this.field3082) {
                            this.field3084 = this.field3082.method20053();
                        }
                    }
                    final boolean method2983 = Class3418.method10894(method2981, this.field3084, false);
                    Label_0469: {
                        if (field3081 != -1) {
                            if (!this.field3084.method27620()) {
                                if (method2983) {
                                    this.method2988(this.field3082, this.field3082.field26174, n3, Class2133.field12437);
                                    this.method2988(method2981, field3081, 0, Class2133.field12437);
                                    if (!this.field3150.field4684.field3006.method2375().method27620()) {
                                        this.method2988(this.field3082, this.field3082.field26174, n3, Class2133.field12437);
                                        this.field3085 = MathHelper.floor(n - field3079);
                                        this.field3086 = MathHelper.floor(n2 - field3080);
                                        this.field3087 = this.field3082;
                                        this.field3089 = this.field3084;
                                        this.field3088 = Class8349.method27837();
                                        break Label_0469;
                                    }
                                    this.field3089 = ItemStack.field34174;
                                    break Label_0469;
                                }
                            }
                        }
                        if (!this.field3084.method27620()) {
                            this.field3085 = MathHelper.floor(n - field3079);
                            this.field3086 = MathHelper.floor(n2 - field3080);
                            this.field3087 = this.field3082;
                            this.field3089 = this.field3084;
                            this.field3088 = Class8349.method27837();
                        }
                    }
                    this.field3084 = ItemStack.field34174;
                    this.field3082 = null;
                }
            }
            else if (this.field3093 && !this.field3092.isEmpty()) {
                this.method2988(null, -999, Class3418.method10891(0, this.field3094), Class2133.field12442);
                for (final Class6601 class6602 : this.field3092) {
                    this.method2988(class6602, class6602.field26174, Class3418.method10891(1, this.field3094), Class2133.field12442);
                }
                this.method2988(null, -999, Class3418.method10891(2, this.field3094), Class2133.field12442);
            }
            else if (!this.field3150.field4684.field3006.method2375().method27620()) {
                if (!this.field3150.field4648.field23447.method1067(n3)) {
                    final boolean b = field3081 != -999 && (Class8341.method27798(Class869.method5277().method5332().method7690(), 340) || Class8341.method27798(Class869.method5277().method5332().method7690(), 344));
                    if (b) {
                        this.field3102 = ((method2981 != null && method2981.method20054()) ? method2981.method20053().method27641() : ItemStack.field34174);
                    }
                    this.method2988(method2981, field3081, n3, b ? Class2133.field12438 : Class2133.field12437);
                }
                else {
                    this.method2988(method2981, field3081, n3, Class2133.field12440);
                }
            }
        }
        if (this.field3150.field4684.field3006.method2375().method27620()) {
            this.field3098 = 0L;
        }
        this.field3093 = false;
        return true;
    }
    
    private boolean method2986(final Class6601 class6601, final double n, final double n2) {
        return this.method2987(class6601.field26175, class6601.field26176, 16, 16, n, n2);
    }
    
    public boolean method2987(final int n, final int n2, final int n3, final int n4, double n5, double n6) {
        final int field3079 = this.field3079;
        final int field3080 = this.field3080;
        n5 -= field3079;
        n6 -= field3080;
        if (n5 >= n - 1) {
            if (n5 < n + n3 + 1) {
                if (n6 >= n2 - 1) {
                    if (n6 < n2 + n4 + 1) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
    public void method2988(final Class6601 class6601, int field26174, final int n, final Class2133 class6602) {
        if (class6601 != null) {
            field26174 = class6601.field26174;
        }
        this.field3150.field4682.method27324(this.field3077.field16154, field26174, n, class6602, this.field3150.field4684);
    }
    
    @Override
    public boolean method2989() {
        return false;
    }
    
    @Override
    public boolean method2972(final int n, final int n2, final int n3) {
        if (!super.method2972(n, n2, n3)) {
            if (n == 256 || this.field3150.field4648.field23442.method1066(n, n2)) {
                this.field3150.field4684.method2814();
            }
            this.method2990(n, n2);
            if (this.field3081 != null) {
                if (this.field3081.method20054()) {
                    if (!this.field3150.field4648.field23447.method1066(n, n2)) {
                        if (this.field3150.field4648.field23444.method1066(n, n2)) {
                            this.method2988(this.field3081, this.field3081.field26174, Class527.method3046() ? 1 : 0, Class2133.field12441);
                        }
                    }
                    else {
                        this.method2988(this.field3081, this.field3081.field26174, 0, Class2133.field12440);
                    }
                }
            }
            return true;
        }
        return true;
    }
    
    public boolean method2990(final int n, final int n2) {
        if (this.field3150.field4684.field3006.method2375().method27620()) {
            if (this.field3081 != null) {
                for (int i = 0; i < 9; ++i) {
                    if (this.field3150.field4648.field23457[i].method1066(n, n2)) {
                        this.method2988(this.field3081, this.field3081.field26174, i, Class2133.field12439);
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
    @Override
    public void method2971() {
        if (this.field3150.field4684 != null) {
            this.field3077.method10859(this.field3150.field4684);
        }
    }
    
    @Override
    public boolean method2991() {
        return false;
    }
    
    @Override
    public void method2992() {
        super.method2992();
        if (!this.field3150.field4684.method1768() || this.field3150.field4684.removed) {
            this.field3150.field4684.method2814();
        }
    }
    
    @Override
    public T method2993() {
        return this.field3077;
    }
    
    static {
        field3074 = new Class1932("textures/gui/container/inventory.png");
    }
}
