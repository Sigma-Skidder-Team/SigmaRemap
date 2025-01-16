// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.Maps;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;

import java.util.Map;

public abstract class Class1834<T extends LivingEntity, M extends Class5853<T>, A extends Class5853<T>> extends Class1799<T, M>
{
    public final A field10014;
    public final A field10015;
    private static final Map<String, ResourceLocation> field10016;
    
    public Class1834(final Class4778<T, M> class4778, final A field10014, final A field10015) {
        super(class4778);
        this.field10014 = field10014;
        this.field10015 = field10015;
    }
    
    public void method6551(final Class7351 class7351, final Class7807 class7352, final int n, final T t, final float n2, final float n3, final float n4, final float n5, final float n6, final float n7) {
        this.method6595(class7351, class7352, t, n2, n3, n4, n5, n6, n7, Class2215.field13604, n);
        this.method6595(class7351, class7352, t, n2, n3, n4, n5, n6, n7, Class2215.field13603, n);
        this.method6595(class7351, class7352, t, n2, n3, n4, n5, n6, n7, Class2215.field13602, n);
        this.method6595(class7351, class7352, t, n2, n3, n4, n5, n6, n7, Class2215.field13605, n);
    }
    
    private void method6595(final Class7351 class7351, final Class7807 class7352, final T t, final float n, final float n2, final float n3, final float n4, final float n5, final float n6, final Class2215 class7353, final int n7) {
        final ItemStack method2718 = t.method2718(class7353);
        if (method2718.getItem() instanceof Class4055) {
            final Class4055 class7354 = (Class4055)method2718.getItem();
            if (class7354.method12257() == class7353) {
                Class5853<T> class7355 = this.method6598(class7353);
                if (Class9570.field41282.method22623()) {
                    class7355 = this.method6603(t, method2718, class7353, class7355);
                }
                this.method6559().method17583(class7355);
                class7355.method17579(t, n, n2, n3);
                this.method6601((A)class7355, class7353);
                class7355.method17580(t, n, n2, n4, n5, n6);
                this.method6599(class7353);
                final boolean method2719 = method2718.method27671();
                if (!(class7354 instanceof Class4053)) {
                    this.method6597(class7351, class7352, n7, method2719, (A)class7355, 1.0f, 1.0f, 1.0f, this.method6604(t, method2718, class7353, null));
                }
                else {
                    final int method2720 = ((Class4053)class7354).method12252(method2718);
                    this.method6597(class7351, class7352, n7, method2719, (A)class7355, (method2720 >> 16 & 0xFF) / 255.0f, (method2720 >> 8 & 0xFF) / 255.0f, (method2720 & 0xFF) / 255.0f, this.method6604(t, method2718, class7353, null));
                    this.method6597(class7351, class7352, n7, method2719, (A)class7355, 1.0f, 1.0f, 1.0f, this.method6604(t, method2718, class7353, "overlay"));
                }
            }
        }
    }
    
    private void method6596(final Class7351 class7351, final Class7807 class7352, final int n, final Class4055 class7353, final boolean b, final A a, final boolean b2, final float n2, final float n3, final float n4, final String s) {
        this.method6597(class7351, class7352, n, b, a, n2, n3, n4, this.method6600(class7353, b2, s));
    }
    
    private void method6597(final Class7351 class7351, final Class7807 class7352, final int n, final boolean b, final A a, final float n2, final float n3, final float n4, final ResourceLocation class7353) {
        a.method17564(class7351, Class1796.method6532(class7352, Class6332.method18770(class7353), false, b), n, Class1904.field10335, n2, n3, n4, 1.0f);
    }
    
    public A method6598(final Class2215 class2215) {
        return this.method6599(class2215) ? this.field10014 : this.field10015;
    }
    
    private boolean method6599(final Class2215 class2215) {
        return class2215 == Class2215.field13603;
    }
    
    private ResourceLocation method6600(final Class4055 class4055, final boolean b, final String str) {
        return Class1834.field10016.computeIfAbsent("textures/models/armor/" + class4055.method12258().method8101() + "_layer_" + (b ? 2 : 1) + ((str != null) ? ("_" + str) : "") + ".png", ResourceLocation::new);
    }
    
    public abstract void method6601(final A p0, final Class2215 p1);
    
    public abstract void method6602(final A p0);
    
    public A method6603(final T t, final ItemStack class8321, final Class2215 class8322, final A a) {
        return a;
    }
    
    public ResourceLocation method6604(final Entity class399, final ItemStack class400, final Class2215 class401, final String s) {
        String s2 = ((Class4055)class400.getItem()).method12258().method8101();
        String substring = "minecraft";
        final int index = s2.indexOf(58);
        if (index != -1) {
            substring = s2.substring(0, index);
            s2 = s2.substring(index + 1);
        }
        String s3 = String.format("%s:textures/models/armor/%s_layer_%d%s.png", substring, s2, this.method6599(class401) ? 2 : 1, (s != null) ? String.format("_%s", s) : "");
        if (Class9570.field41291.method22605()) {
            s3 = Class9570.method35817(Class9570.field41291, class399, class400, s3, class401, s);
        }
        ResourceLocation class402 = Class1834.field10016.get(s3);
        if (class402 == null) {
            class402 = new ResourceLocation(s3);
            Class1834.field10016.put(s3, class402);
        }
        return class402;
    }
    
    static {
        field10016 = Maps.newHashMap();
    }
}
