// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.OptionalDouble;
import java.util.HashMap;
import java.util.function.Supplier;
import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public abstract class Class6332 extends Class6322
{
    private static final Class6332 field25326;
    private static final Class6332 field25327;
    private static final Class6332 field25328;
    private static final Class6332 field25329;
    private static final Class6332 field25330;
    private static final Class6332 field25331;
    private static final Class6332 field25332;
    private static final Class6332 field25333;
    private static final Class6332 field25334;
    private static final Class6332 field25335;
    public static final Class6333 field25336;
    private final Class9272 field25337;
    private final int field25338;
    private final int field25339;
    private final boolean field25340;
    private final boolean field25341;
    private final Optional<Class6332> field25342;
    private int field25343;
    public static final Class6332[] field25344;
    private static Map<Class9100, Class6332> field25345;
    
    public int method18759() {
        return this.field25343;
    }
    
    private static Class6332[] method18760() {
        final Class6332[] array = method18795().toArray(new Class6332[0]);
        for (int i = 0; i < array.length; array[i].field25343 = i++) {}
        return array;
    }
    
    public static Class6332 method18761() {
        return Class6332.field25326;
    }
    
    public static Class6332 method18762() {
        return Class6332.field25327;
    }
    
    public static Class6332 method18763() {
        return Class6332.field25328;
    }
    
    private static Class6304 method18764() {
        return Class6304.method18666().method28321(Class6332.field25288).method28325(Class6332.field25296).method28318(Class6332.field25289).method28319(Class6332.field25282).method28333(true);
    }
    
    public static Class6332 method18765() {
        return Class6332.field25329;
    }
    
    public static Class6332 method18766() {
        return Class6332.field25330;
    }
    
    public static Class6332 method18767(ResourceLocation method32643) {
        if (Config.method28941()) {
            method32643 = Class9066.method32643(method32643);
        }
        return method18803("entity_solid", method32643, () -> method18793("entity_solid", Class9237.field39608, 7, 256, true, false, Class6304.method18666().method28318(new Class6340(class1932, false, false)).method28319(Class6332.field25277).method28320(Class6332.field25300).method28325(Class6332.field25296).method28326(Class6332.field25298).method28333(true)));
    }
    
    public static Class6332 method18768(ResourceLocation method32643) {
        if (Config.method28941()) {
            method32643 = Class9066.method32643(method32643);
        }
        return method18803("entity_cutout", method32643, () -> method18793("entity_cutout", Class9237.field39608, 7, 256, true, false, Class6304.method18666().method28318(new Class6340(class1932, false, false)).method28319(Class6332.field25277).method28320(Class6332.field25300).method28322(Class6332.field25284).method28325(Class6332.field25296).method28326(Class6332.field25298).method28333(true)));
    }
    
    public static Class6332 method18769(ResourceLocation method32643, final boolean b) {
        if (Config.method28941()) {
            method32643 = Class9066.method32643(method32643);
        }
        return method18804("entity_cutout_no_cull", method32643, b, () -> method18793("entity_cutout_no_cull", Class9237.field39608, 7, 256, true, false, Class6304.method18666().method28318(new Class6340(class1932, false, false)).method28319(Class6332.field25277).method28320(Class6332.field25300).method28322(Class6332.field25284).method28324(Class6332.field25303).method28325(Class6332.field25296).method28326(Class6332.field25298).method28333(b2)));
    }
    
    public static Class6332 method18770(final ResourceLocation class1932) {
        return method18769(class1932, true);
    }
    
    public static Class6332 method18771(ResourceLocation method32643) {
        if (Config.method28941()) {
            method32643 = Class9066.method32643(method32643);
        }
        return method18803("entity_translucent_cull", method32643, () -> method18793("entity_translucent_cull", Class9237.field39608, 7, 256, true, true, Class6304.method18666().method28318(new Class6340(class1932, false, false)).method28319(Class6332.field25282).method28320(Class6332.field25300).method28322(Class6332.field25284).method28325(Class6332.field25296).method28326(Class6332.field25298).method28333(true)));
    }
    
    public static Class6332 method18772(ResourceLocation method32643, final boolean b) {
        if (Config.method28941()) {
            method32643 = Class9066.method32643(method32643);
        }
        return method18804("entity_translucent", method32643, b, () -> method18793("entity_translucent", Class9237.field39608, 7, 256, true, true, Class6304.method18666().method28318(new Class6340(class1932, false, false)).method28319(Class6332.field25282).method28320(Class6332.field25300).method28322(Class6332.field25284).method28324(Class6332.field25303).method28325(Class6332.field25296).method28326(Class6332.field25298).method28333(b2)));
    }
    
    public static Class6332 method18773(final ResourceLocation class1932) {
        return method18772(class1932, true);
    }
    
    public static Class6332 method18774(ResourceLocation method32643) {
        if (Config.method28941()) {
            method32643 = Class9066.method32643(method32643);
        }
        return method18803("entity_smooth_cutout", method32643, () -> method18792("entity_smooth_cutout", Class9237.field39608, 7, 256, Class6304.method18666().method28318(new Class6340(class1932, false, false)).method28322(Class6332.field25285).method28320(Class6332.field25300).method28321(Class6332.field25288).method28324(Class6332.field25303).method28325(Class6332.field25296).method28333(true)));
    }
    
    public static Class6332 method18775(ResourceLocation method32643, final boolean b) {
        if (Config.method28941()) {
            method32643 = Class9066.method32643(method32643);
        }
        return method18804("beacon_beam", method32643, b, () -> method18793("beacon_beam", Class9237.field39607, 7, 256, false, true, Class6304.method18666().method28318(new Class6340(class1932, false, false)).method28319(b2 ? Class6332.field25282 : Class6332.field25277).method28331(b2 ? Class6332.field25308 : Class6332.field25307).method28327(Class6332.field25313).method28333(false)));
    }
    
    public static Class6332 method18776(ResourceLocation method32643) {
        if (Config.method28941()) {
            method32643 = Class9066.method32643(method32643);
        }
        return method18803("entity_decal", method32643, () -> method18792("entity_decal", Class9237.field39608, 7, 256, Class6304.method18666().method28318(new Class6340(class1932, false, false)).method28320(Class6332.field25300).method28322(Class6332.field25284).method28323(Class6332.field25305).method28324(Class6332.field25303).method28325(Class6332.field25296).method28326(Class6332.field25298).method28333(false)));
    }
    
    public static Class6332 method18777(ResourceLocation method32643) {
        if (Config.method28941()) {
            method32643 = Class9066.method32643(method32643);
        }
        return method18803("entity_no_outline", method32643, () -> method18793("entity_no_outline", Class9237.field39608, 7, 256, false, true, Class6304.method18666().method28318(new Class6340(class1932, false, false)).method28319(Class6332.field25282).method28320(Class6332.field25300).method28322(Class6332.field25284).method28324(Class6332.field25303).method28325(Class6332.field25296).method28326(Class6332.field25298).method28331(Class6332.field25308).method28333(false)));
    }
    
    public static Class6332 method18778(ResourceLocation method32643, final float n) {
        if (Config.method28941()) {
            method32643 = Class9066.method32643(method32643);
        }
        return method18805("entity_alpha", method32643, n, () -> method18792("entity_alpha", Class9237.field39608, 7, 256, Class6304.method18666().method28318(new Class6340(class1932, false, false)).method28322(new Class6321(n2)).method28324(Class6332.field25303).method28333(true)));
    }
    
    public static Class6332 method18779(ResourceLocation method32643) {
        if (Config.method28941()) {
            method32643 = Class9066.method32643(method32643);
        }
        return method18803("eyes", method32643, () -> method18793("eyes", Class9237.field39608, 7, 256, false, true, Class6304.method18666().method28318(new Class6340(class1932, false, false)).method28319(Class6332.field25278).method28331(Class6332.field25308).method28327(Class6332.field25315).method28333(false)));
    }
    
    public static Class6332 method18780(ResourceLocation method32643, final float n, final float n2) {
        if (Config.method28941()) {
            method32643 = Class9066.method32643(method32643);
        }
        return method18806("energy_swirl", method32643, n, n2, () -> method18793("energy_swirl", Class9237.field39608, 7, 256, false, true, Class6304.method18666().method28318(new Class6340(class1932, false, false)).method28330(new Class6324(n3, n4)).method28327(Class6332.field25315).method28319(Class6332.field25278).method28320(Class6332.field25300).method28322(Class6332.field25284).method28324(Class6332.field25303).method28325(Class6332.field25296).method28326(Class6332.field25298).method28333(false)));
    }
    
    public static Class6332 method18781() {
        return Class6332.field25331;
    }
    
    public static Class6332 method18782() {
        return Class6332.field25332;
    }
    
    public static Class6332 method18783(final ResourceLocation class1932) {
        return method18803("outline", class1932, () -> method18792("outline", Class9237.field39618, 7, 256, Class6304.method18666().method28318(new Class6340(class1933, false, false)).method28324(Class6332.field25303).method28323(Class6332.field25304).method28322(Class6332.field25284).method28330(Class6332.field25293).method28327(Class6332.field25313).method28329(Class6332.field25317).method28334(Class2017.field11497)));
    }
    
    public static Class6332 method18784() {
        return Class6332.field25333;
    }
    
    public static Class6332 method18785() {
        return Class6332.field25334;
    }
    
    public static Class6332 method18786(final ResourceLocation class1932) {
        return method18803("crumbling", class1932, () -> method18793("crumbling", Class9237.field39607, 7, 256, false, true, Class6304.method18666().method28318(new Class6340(class1933, false, false)).method28322(Class6332.field25284).method28319(Class6332.field25281).method28331(Class6332.field25308).method28328(Class6332.field25311).method28333(false)));
    }
    
    public static Class6332 method18787(final ResourceLocation class1932) {
        return method18803("text", class1932, () -> method18793("text", Class9237.field39620, 7, 256, false, true, Class6304.method18666().method28318(new Class6340(class1933, false, false)).method28322(Class6332.field25284).method28319(Class6332.field25282).method28325(Class6332.field25296).method28333(false)));
    }
    
    public static Class6332 method18788(final ResourceLocation class1932) {
        return method18803("text_see_through", class1932, () -> method18793("text_see_through", Class9237.field39620, 7, 256, false, true, Class6304.method18666().method28318(new Class6340(class1933, false, false)).method28322(Class6332.field25284).method28319(Class6332.field25282).method28325(Class6332.field25296).method28323(Class6332.field25304).method28331(Class6332.field25308).method28333(false)));
    }
    
    public static Class6332 method18789() {
        return Class6332.field25335;
    }
    
    public static Class6332 method18790(final int n) {
        return method18807("end_portal", n, () -> {
            Class6331 class6331;
            Class6340 class6332;
            if (n2 > 1) {
                class6331 = Class6332.field25278;
                class6332 = new Class6340(Class4171.field18585, false, false);
            }
            else {
                class6331 = Class6332.field25282;
                class6332 = new Class6340(Class4171.field18584, false, false);
            }
            return method18793("end_portal", Class9237.field39615, 7, 256, false, true, Class6304.method18666().method28319(class6331).method28318(class6332).method28330(new Class6325(n2)).method28327(Class6332.field25315).method28333(false));
        });
    }
    
    public static Class6332 method18791() {
        return Class6332.field25336;
    }
    
    public Class6332(final String s, final Class9272 field25337, final int field25338, final int field25339, final boolean field25340, final boolean field25341, final Runnable runnable, final Runnable runnable2) {
        super(s, runnable, runnable2);
        this.field25343 = -1;
        this.field25337 = field25337;
        this.field25338 = field25338;
        this.field25339 = field25339;
        this.field25340 = field25340;
        this.field25341 = field25341;
        this.field25342 = Optional.of(this);
    }
    
    public static Class6333 method18792(final String s, final Class9272 class9272, final int n, final int n2, final Class6304 class9273) {
        return method18793(s, class9272, n, n2, false, false, class9273);
    }
    
    public static Class6333 method18793(final String s, final Class9272 class9272, final int n, final int n2, final boolean b, final boolean b2, final Class6304 class9273) {
        return Class6333.method18829(s, class9272, n, n2, b, b2, class9273);
    }
    
    public void method18794(final Class4148 class4148, final int n, final int n2, final int n3) {
        if (class4148.method12405()) {
            if (this.field25341) {
                class4148.method12385((float)n, (float)n2, (float)n3);
            }
            if (class4148.field18497 != null) {
                Class7663.method24286(class4148.field18497);
            }
            class4148.method12393();
            this.method18709();
            if (Config.method28955()) {
                Class7778.method24960(this, class4148);
            }
            Class8475.method28282(class4148);
            if (Config.method28955()) {
                Class7778.method24961(this, class4148);
            }
            this.method18710();
        }
    }
    
    @Override
    public String toString() {
        return this.field25274;
    }
    
    public static List<Class6332> method18795() {
        return (List<Class6332>)ImmutableList.of((Object)method18761(), (Object)method18762(), (Object)method18763(), (Object)method18765());
    }
    
    public int method18796() {
        return this.field25339;
    }
    
    public Class9272 method18797() {
        return this.field25337;
    }
    
    public int method18798() {
        return this.field25338;
    }
    
    public Optional<Class6332> method18799() {
        return Optional.empty();
    }
    
    public boolean method18800() {
        return false;
    }
    
    public boolean method18801() {
        return this.field25340;
    }
    
    public Optional<Class6332> method18802() {
        return this.field25342;
    }
    
    private static Class6332 method18803(final String s, final ResourceLocation class1932, final Supplier<Class6332> supplier) {
        return method18808(new Class9100(s, class1932), supplier);
    }
    
    private static Class6332 method18804(final String s, final ResourceLocation class1932, final boolean b, final Supplier<Class6332> supplier) {
        return method18808(new Class9100(s, class1932, b), supplier);
    }
    
    private static Class6332 method18805(final String s, final ResourceLocation class1932, final float f, final Supplier<Class6332> supplier) {
        return method18808(new Class9100(s, class1932, f), supplier);
    }
    
    private static Class6332 method18806(final String s, final ResourceLocation class1932, final float f, final float f2, final Supplier<Class6332> supplier) {
        return method18808(new Class9100(s, class1932, f, f2), supplier);
    }
    
    private static Class6332 method18807(final String s, final int i, final Supplier<Class6332> supplier) {
        return method18808(new Class9100(s, i), supplier);
    }
    
    private static Class6332 method18808(final Class9100 class9100, final Supplier<Class6332> supplier) {
        if (Class6332.field25345 == null) {
            Class6332.field25345 = new HashMap<Class9100, Class6332>();
        }
        final Class6332 class9101 = Class6332.field25345.get(class9100);
        if (class9101 == null) {
            final Class6332 class9102 = supplier.get();
            Class6332.field25345.put(class9100, class9102);
            return class9102;
        }
        return class9101;
    }
    
    static {
        field25326 = method18793("solid", Class9237.field39607, 7, 2097152, true, false, Class6304.method18666().method28321(Class6332.field25288).method28325(Class6332.field25296).method28318(Class6332.field25289).method28333(true));
        field25327 = method18793("cutout_mipped", Class9237.field39607, 7, 131072, true, false, Class6304.method18666().method28321(Class6332.field25288).method28325(Class6332.field25296).method28318(Class6332.field25289).method28322(Class6332.field25286).method28333(true));
        field25328 = method18793("cutout", Class9237.field39607, 7, 131072, true, false, Class6304.method18666().method28321(Class6332.field25288).method28325(Class6332.field25296).method28318(Class6332.field25290).method28322(Class6332.field25285).method28333(true));
        field25329 = method18793("translucent", Class9237.field39607, 7, 262144, true, true, method18764());
        field25330 = method18793("translucent_no_crumbling", Class9237.field39607, 7, 262144, false, true, method18764());
        field25331 = method18792("leash", Class9237.field39616, 7, 256, Class6304.method18666().method28318(Class6332.field25291).method28324(Class6332.field25303).method28325(Class6332.field25296).method28333(false));
        field25332 = method18792("water_mask", Class9237.field39614, 7, 256, Class6304.method18666().method28318(Class6332.field25291).method28331(Class6332.field25309).method28333(false));
        field25333 = method18792("glint", Class9237.field39617, 7, 256, Class6304.method18666().method28318(new Class6340(Class1796.field9950, true, false)).method28331(Class6332.field25308).method28324(Class6332.field25303).method28323(Class6332.field25305).method28319(Class6332.field25280).method28330(Class6332.field25294).method28333(false));
        field25334 = method18792("entity_glint", Class9237.field39617, 7, 256, Class6304.method18666().method28318(new Class6340(Class1796.field9950, true, false)).method28331(Class6332.field25308).method28324(Class6332.field25303).method28323(Class6332.field25305).method28319(Class6332.field25280).method28330(Class6332.field25295).method28333(false));
        field25335 = method18793("lightning", Class9237.field39615, 7, 256, false, true, Class6304.method18666().method28331(Class6332.field25308).method28319(Class6332.field25279).method28321(Class6332.field25288).method28333(false));
        field25336 = method18792("lines", Class9237.field39615, 1, 256, Class6304.method18666().method28332(new Class6327(OptionalDouble.empty())).method28328(Class6332.field25312).method28319(Class6332.field25282).method28331(Class6332.field25308).method28333(false));
        field25344 = method18760();
    }
}
