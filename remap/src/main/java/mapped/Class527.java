// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.Sets;
import net.minecraft.client.renderer.Matrix4f;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import org.apache.logging.log4j.LogManager;
import java.io.File;
import java.util.Locale;
import java.net.URISyntaxException;
import com.google.gson.JsonSyntaxException;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import java.net.URI;
import java.util.List;
import java.util.Set;
import org.apache.logging.log4j.Logger;

public abstract class Class527 extends Class598 implements Class563
{
    private static final Logger field3146;
    private static final Set<String> field3147;
    public final ITextComponent field3148;
    public final List<Class574> field3149;
    public Class869 field3150;
    public Class1796 field3151;
    public int field3152;
    public int field3153;
    public final List<Class573> field3154;
    public boolean field3155;
    public Class1844 field3156;
    private URI field3157;
    
    public Class527(final ITextComponent field3148) {
        this.field3149 = Lists.newArrayList();
        this.field3154 = Lists.newArrayList();
        this.field3148 = field3148;
    }
    
    public ITextComponent method3026() {
        return this.field3148;
    }
    
    public String method3027() {
        return this.method3026().getString();
    }
    
    @Override
    public void method2975(final int n, final int n2, final float n3) {
        for (int i = 0; i < this.field3154.size(); ++i) {
            this.field3154.get(i).method2975(n, n2, n3);
        }
    }
    
    @Override
    public boolean method2972(final int n, final int n2, final int n3) {
        if (n == 256 && this.method2989()) {
            this.method3028();
            return true;
        }
        if (n != 258) {
            return super.method2972(n, n2, n3);
        }
        final boolean b = !method3047();
        if (!this.method3281(b)) {
            this.method3281(b);
        }
        return true;
    }
    
    public boolean method2989() {
        return true;
    }
    
    public void method3028() {
        this.field3150.method5244(null);
    }
    
    public <T extends Class573> T method3029(final T t) {
        this.field3154.add(t);
        this.field3149.add(t);
        return t;
    }
    
    public void method3014(final ItemStack class8321, final int n, final int n2) {
        this.method3032(this.method3030(class8321), n, n2);
    }
    
    public List<String> method3030(final ItemStack class8321) {
        final List<ITextComponent> method27668 = class8321.method27668(this.field3150.field4684, this.field3150.field4648.field23394 ? Class1980.field10973 : Class1980.field10972);
        final ArrayList arrayList = Lists.newArrayList();
        final Iterator<ITextComponent> iterator = method27668.iterator();
        while (iterator.hasNext()) {
            arrayList.add(iterator.next().getFormattedText());
        }
        return arrayList;
    }
    
    public void method3031(final String s, final int n, final int n2) {
        this.method3032(Arrays.asList(s), n, n2);
    }
    
    public void method3032(final List<String> list, final int n, final int n2) {
        if (!list.isEmpty()) {
            Class8726.method30047();
            Class8726.method30007();
            int n3 = 0;
            final Iterator iterator = list.iterator();
            while (iterator.hasNext()) {
                final int method6617 = this.field3156.method6617((String)iterator.next());
                if (method6617 <= n3) {
                    continue;
                }
                n3 = method6617;
            }
            int n4 = n + 12;
            int n5 = n2 - 12;
            int n6 = 8;
            if (list.size() > 1) {
                n6 += 2 + (list.size() - 1) * 10;
            }
            if (n4 + n3 > this.field3152) {
                n4 -= 28 + n3;
            }
            if (n5 + n6 + 6 > this.field3153) {
                n5 = this.field3153 - n6 - 6;
            }
            this.method3304(300);
            this.field3151.field9952 = 300.0f;
            this.method3189(n4 - 3, n5 - 4, n4 + n3 + 3, n5 - 3, -267386864, -267386864);
            this.method3189(n4 - 3, n5 + n6 + 3, n4 + n3 + 3, n5 + n6 + 4, -267386864, -267386864);
            this.method3189(n4 - 3, n5 - 3, n4 + n3 + 3, n5 + n6 + 3, -267386864, -267386864);
            this.method3189(n4 - 4, n5 - 3, n4 - 3, n5 + n6 + 3, -267386864, -267386864);
            this.method3189(n4 + n3 + 3, n5 - 3, n4 + n3 + 4, n5 + n6 + 3, -267386864, -267386864);
            this.method3189(n4 - 3, n5 - 3 + 1, n4 - 3 + 1, n5 + n6 + 3 - 1, 1347420415, 1344798847);
            this.method3189(n4 + n3 + 2, n5 - 3 + 1, n4 + n3 + 3, n5 + n6 + 3 - 1, 1347420415, 1344798847);
            this.method3189(n4 - 3, n5 - 3, n4 + n3 + 3, n5 - 3 + 1, 1347420415, 1347420415);
            this.method3189(n4 - 3, n5 + n6 + 2, n4 + n3 + 3, n5 + n6 + 3, 1344798847, 1344798847);
            final Class7351 class7351 = new Class7351();
            final Class7808 method6618 = Class7807.method25212(Class7392.method22694().method22696());
            class7351.method22564(0.0, 0.0, this.field3151.field9952);
            final Matrix4f method6619 = class7351.method22569().method32111();
            for (int i = 0; i < list.size(); ++i) {
                final String s = list.get(i);
                if (s != null) {
                    this.field3156.method6613(s, (float)n4, (float)n5, -1, true, method6619, method6618, false, 0, 15728880);
                }
                if (i == 0) {
                    n5 += 2;
                }
                n5 += 10;
            }
            method6618.method25216();
            this.method3304(0);
            this.field3151.field9952 = 0.0f;
            Class8726.method30008();
            Class8726.method30046();
        }
    }
    
    public void method3033(final ITextComponent class2250, final int n, final int n2) {
        if (class2250 != null && class2250.getStyle().method30411() != null) {
            final Class9390 method30411 = class2250.getStyle().method30411();
            if (method30411.method34911() == Class1961.field10698) {
                ItemStack class2251 = ItemStack.field34174;
                try {
                    final Class51 method30412 = Class5704.method16938(method30411.method34912().getString());
                    if (method30412 instanceof Class51) {
                        class2251 = ItemStack.method27619(method30412);
                    }
                }
                catch (final CommandSyntaxException ex) {}
                if (class2251.method27620()) {
                    this.method3031(TextFormatting.RED + "Invalid Item!", n, n2);
                }
                else {
                    this.method3014(class2251, n, n2);
                }
            }
            else if (method30411.method34911() == Class1961.field10699) {
                if (this.field3150.field4648.field23394) {
                    try {
                        final Class51 method30413 = Class5704.method16938(method30411.method34912().getString());
                        final ArrayList arrayList = Lists.newArrayList();
                        final ITextComponent method30414 = Class5953.method17871(method30413.method323("name"));
                        if (method30414 != null) {
                            arrayList.add(method30414.getFormattedText());
                        }
                        if (method30413.method316("type", 8)) {
                            arrayList.add("Type: " + method30413.method323("type"));
                        }
                        arrayList.add(method30413.method323("id"));
                        this.method3032(arrayList, n, n2);
                    }
                    catch (final CommandSyntaxException | JsonSyntaxException ex2) {
                        this.method3031(TextFormatting.RED + "Invalid Entity!", n, n2);
                    }
                }
            }
            else if (method30411.method34911() == Class1961.field10697) {
                this.method3032(this.field3150.field4643.method6626(method30411.method34912().getFormattedText(), Math.max(this.field3152 / 2, 200)), n, n2);
            }
        }
    }
    
    public void method3034(final String s, final boolean b) {
    }
    
    public boolean method3035(final ITextComponent class2250) {
        if (class2250 == null) {
            return false;
        }
        final Class9485 method30410 = class2250.getStyle().method30410();
        if (method3047()) {
            if (class2250.getStyle().method30412() != null) {
                this.method3034(class2250.getStyle().method30412(), false);
            }
        }
        else if (method30410 != null) {
            if (method30410.method35309() == Class2075.field11971) {
                if (!this.field3150.field4648.field23417) {
                    return false;
                }
                try {
                    final URI field3157 = new URI(method30410.method35310());
                    final String scheme = field3157.getScheme();
                    if (scheme == null) {
                        throw new URISyntaxException(method30410.method35310(), "Missing protocol");
                    }
                    if (!Class527.field3147.contains(scheme.toLowerCase(Locale.ROOT))) {
                        throw new URISyntaxException(method30410.method35310(), "Unsupported protocol: " + scheme.toLowerCase(Locale.ROOT));
                    }
                    if (this.field3150.field4648.field23418) {
                        this.field3157 = field3157;
                        this.field3150.method5244(new Class547(this::method3044, method30410.method35310(), false));
                    }
                    else {
                        this.method3045(field3157);
                    }
                }
                catch (final URISyntaxException ex) {
                    Class527.field3146.error("Can't open url for {}", (Object)method30410, (Object)ex);
                }
            }
            else if (method30410.method35309() == Class2075.field11972) {
                this.method3045(new File(method30410.method35310()).toURI());
            }
            else if (method30410.method35309() == Class2075.field11974) {
                this.method3034(method30410.method35310(), true);
            }
            else if (method30410.method35309() == Class2075.field11973) {
                this.method3037(method30410.method35310(), false);
            }
            else if (method30410.method35309() == Class2075.field11976) {
                this.field3150.field4651.method22508(method30410.method35310());
            }
            else {
                Class527.field3146.error("Don't know how to handle {}", (Object)method30410);
            }
            return true;
        }
        return false;
    }
    
    public void method3036(final String s) {
        this.method3037(s, true);
    }
    
    public void method3037(final String s, final boolean b) {
        if (b) {
            this.field3150.field4647.method3807().method3766(s);
        }
        this.field3150.field4684.method4114(s);
    }
    
    public void method3038(final Class869 field3150, final int field3151, final int field3152) {
        this.field3150 = field3150;
        this.field3151 = field3150.method5307();
        this.field3156 = field3150.field4643;
        this.field3152 = field3151;
        this.field3153 = field3152;
        this.field3154.clear();
        this.field3149.clear();
        this.method3470(null);
        this.method2969();
    }
    
    public void method3039(final int field3152, final int field3153) {
        this.field3152 = field3152;
        this.field3153 = field3153;
    }
    
    @Override
    public List<? extends Class574> method3040() {
        return this.field3149;
    }
    
    public void method2969() {
    }
    
    public void method2992() {
    }
    
    public void method2971() {
    }
    
    public void method3041() {
        this.method3042(0);
    }
    
    public void method3042(final int n) {
        if (this.field3150.field4683 == null) {
            this.method3043(n);
        }
        else {
            this.method3189(0, 0, this.field3152, this.field3153, -1072689136, -804253680);
        }
    }
    
    public void method3043(final int n) {
        final Class7392 method22694 = Class7392.method22694();
        final Class4148 method22695 = method22694.method22696();
        this.field3150.method5290().method5849(Class527.field3361);
        Class8726.method30068(1.0f, 1.0f, 1.0f, 1.0f);
        method22695.method12390(7, Class9237.field39619);
        method22695.method12432(0.0, this.field3153, 0.0).method12391(0.0f, this.field3153 / 32.0f + n).method12399(64, 64, 64, 255).method12397();
        method22695.method12432(this.field3152, this.field3153, 0.0).method12391(this.field3152 / 32.0f, this.field3153 / 32.0f + n).method12399(64, 64, 64, 255).method12397();
        method22695.method12432(this.field3152, 0.0, 0.0).method12391(this.field3152 / 32.0f, (float)n).method12399(64, 64, 64, 255).method12397();
        method22695.method12432(0.0, 0.0, 0.0).method12391(0.0f, (float)n).method12399(64, 64, 64, 255).method12397();
        method22694.method22695();
    }
    
    public boolean method2991() {
        return true;
    }
    
    private void method3044(final boolean b) {
        if (b) {
            this.method3045(this.field3157);
        }
        this.field3157 = null;
        this.field3150.method5244(this);
    }
    
    private void method3045(final URI uri) {
        Util.method27845().method977(uri);
    }
    
    public static boolean method3046() {
        if (!Class869.field4623) {
            return Class8341.method27798(Class869.method5277().method5332().method7690(), 341) || Class8341.method27798(Class869.method5277().method5332().method7690(), 345);
        }
        return Class8341.method27798(Class869.method5277().method5332().method7690(), 343) || Class8341.method27798(Class869.method5277().method5332().method7690(), 347);
    }
    
    public static boolean method3047() {
        return Class8341.method27798(Class869.method5277().method5332().method7690(), 340) || Class8341.method27798(Class869.method5277().method5332().method7690(), 344);
    }
    
    public static boolean method3048() {
        return Class8341.method27798(Class869.method5277().method5332().method7690(), 342) || Class8341.method27798(Class869.method5277().method5332().method7690(), 346);
    }
    
    public static boolean method3049(final int n) {
        if (n == 88) {
            if (method3046()) {
                if (!method3047()) {
                    if (!method3048()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
    public static boolean method3050(final int n) {
        if (n == 86) {
            if (method3046()) {
                if (!method3047()) {
                    if (!method3048()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
    public static boolean method3051(final int n) {
        if (n == 67) {
            if (method3046()) {
                if (!method3047()) {
                    if (!method3048()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
    public static boolean method3052(final int n) {
        if (n == 65) {
            if (method3046()) {
                if (!method3047()) {
                    if (!method3048()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
    public void method2970(final Class869 class869, final int n, final int n2) {
        this.method3038(class869, n, n2);
    }
    
    public static void method3053(final Runnable runnable, final String s, final String s2) {
        try {
            runnable.run();
        }
        catch (final Throwable t) {
            final Class7689 method24421 = Class7689.method24421(t, s);
            method24421.method24418("Affected screen").method16296("Screen name", () -> s3);
            throw new Class2365(method24421);
        }
    }
    
    public boolean method3054(final String s, final char c, final int n) {
        final int index = s.indexOf(58);
        final int index2 = s.indexOf(47);
        if (c == ':') {
            if (index2 == -1 || n <= index2) {
                if (index == -1) {
                    return true;
                }
            }
            return false;
        }
        if (c != '/') {
            if (c != '_') {
                if (c != '-') {
                    if (c < 'a' || c > 'z') {
                        if (c < '0' || c > '9') {
                            if (c != '.') {
                                return false;
                            }
                        }
                    }
                }
            }
            return true;
        }
        return n > index;
    }
    
    @Override
    public boolean method3055(final double n, final double n2) {
        return true;
    }
    
    static {
        field3146 = LogManager.getLogger();
        field3147 = Sets.newHashSet((Object[])new String[] { "http", "https" });
    }
}
