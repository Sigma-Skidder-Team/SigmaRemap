// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.Multimap;
import net.minecraft.entity.Entity;
import net.minecraft.util.Direction;

import java.util.List;
import java.util.function.Predicate;
import java.util.UUID;

public class Class4055 extends Class3820
{
    private static final UUID[] field18146;
    public static final Class6423 field18147;
    public final Class2215 field18148;
    public final int field18149;
    public final float field18150;
    public final Class2035 field18151;
    
    public static boolean method12256(final Class5491 class5491, final ItemStack class5492) {
        final List<Entity> method6739 = class5491.method16763().method6739((Class<? extends Entity>)Class511.class, new AxisAlignedBB(class5491.method16764().method1149(class5491.method16765().method21772((Class7111<Direction>)Class3955.field17859))), (Predicate<? super Entity>)Class9170.field38850.and(new Class168(class5492)));
        if (!method6739.isEmpty()) {
            final Class511 class5493 = method6739.get(0);
            final Class2215 method6740 = Class759.method4185(class5492);
            class5493.method1803(method6740, class5492.method27621(1));
            if (class5493 instanceof Class759) {
                ((Class759)class5493).method4191(method6740, 2.0f);
                ((Class759)class5493).method4190();
            }
            return true;
        }
        return false;
    }
    
    public Class4055(final Class2035 field18151, final Class2215 field18152, final Class8959 class8959) {
        super(class8959.method31783(field18151.method8096(field18152)));
        this.field18151 = field18151;
        this.field18148 = field18152;
        this.field18149 = field18151.method8097(field18152);
        this.field18150 = field18151.method8102();
        Class3955.method12069(this, Class4055.field18147);
    }
    
    public Class2215 method12257() {
        return this.field18148;
    }
    
    @Override
    public int method11734() {
        return this.field18151.method8098();
    }
    
    public Class2035 method12258() {
        return this.field18151;
    }
    
    @Override
    public boolean method11738(final ItemStack class8321, final ItemStack class8322) {
        return this.field18151.method8100().test(class8322) || super.method11738(class8321, class8322);
    }
    
    @Override
    public Class9355<ItemStack> method11695(final Class1847 class1847, final Class512 class1848, final Class316 class1849) {
        final ItemStack method2715 = class1848.method2715(class1849);
        final Class2215 method2716 = Class759.method4185(method2715);
        if (!class1848.method2718(method2716).method27620()) {
            return Class9355.method34677(method2715);
        }
        class1848.method1803(method2716, method2715.method27641());
        method2715.method27691(0);
        return Class9355.method34674(method2715);
    }
    
    @Override
    public Multimap<String, Class7919> method11739(final Class2215 class2215) {
        final Multimap<String, Class7919> method11739 = super.method11739(class2215);
        if (class2215 == this.field18148) {
            method11739.put((Object)Class8107.field33413.method29978(), (Object)new Class7919(Class4055.field18146[class2215.method8402()], "Armor modifier", this.field18149, Class2157.field12809));
            method11739.put((Object)Class8107.field33414.method29978(), (Object)new Class7919(Class4055.field18146[class2215.method8402()], "Armor toughness", this.field18150, Class2157.field12809));
        }
        return method11739;
    }
    
    public int method12259() {
        return this.field18149;
    }
    
    static {
        field18146 = new UUID[] { UUID.fromString("845DB27C-C624-495F-8C9F-6020A9A58B6B"), UUID.fromString("D8499B04-0E66-4726-AB29-64469D734E0D"), UUID.fromString("9F3D476D-C118-4544-8365-64846904B48E"), UUID.fromString("2AD3F246-FEE1-4E67-B886-69FD380BB150") };
        field18147 = new Class6406();
    }
}
