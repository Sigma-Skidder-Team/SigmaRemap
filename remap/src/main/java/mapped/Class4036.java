// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.item.ItemStack;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.world.World;

import java.util.Map;
import java.util.List;
import javax.annotation.Nullable;

public class Class4036 extends Item
{
    @Deprecated
    private final Class3833 field18131;
    
    public Class4036(final Class3833 field18131, final Class8959 class8959) {
        super(class8959);
        this.field18131 = field18131;
    }
    
    @Override
    public Class2201 method11694(final Class7075 class7075) {
        final Class2201 method12229 = this.method12229(new Class7074(class7075));
        return (method12229 != Class2201.field13400 && this.method11743()) ? this.method11695(class7075.field27554, class7075.field27551, class7075.field27552).method34672() : method12229;
    }
    
    public Class2201 method12229(final Class7074 class7074) {
        if (!class7074.method21640()) {
            return Class2201.field13403;
        }
        final Class7074 method12231 = this.method12231(class7074);
        if (method12231 == null) {
            return Class2201.field13403;
        }
        final Class7096 method12232 = this.method12233(method12231);
        if (method12232 == null) {
            return Class2201.field13403;
        }
        if (this.method12238(method12231, method12232)) {
            final BlockPos method12233 = method12231.method21639();
            final World method12234 = method12231.method21654();
            final Class512 method12235 = method12231.method21652();
            final ItemStack method12236 = method12231.method21651();
            Class7096 class7075 = method12234.method6701(method12233);
            final Class3833 method12237 = class7075.method21696();
            if (method12237 == method12232.method21696()) {
                class7075 = this.method12234(method12233, method12234, method12236, class7075);
                this.method12232(method12233, method12234, method12235, method12236, class7075);
                method12237.method11853(method12234, method12233, class7075, method12235, method12236);
                if (method12235 instanceof Class513) {
                    Class7770.field31799.method13836((Class513)method12235, method12233, method12236);
                }
            }
            final Class7696 method12238 = class7075.method21759();
            method12234.method6705(method12235, method12233, this.method12230(class7075), Class286.field1582, (method12238.method24477() + 1.0f) / 2.0f, method12238.method24478() * 0.8f);
            method12236.method27693(1);
            return Class2201.field13400;
        }
        return Class2201.field13403;
    }
    
    public Class7795 method12230(final Class7096 class7096) {
        return class7096.method21759().method24481();
    }
    
    @Nullable
    public Class7074 method12231(final Class7074 class7074) {
        return class7074;
    }
    
    public boolean method12232(final BlockPos class354, final World class355, final Class512 class356, final ItemStack class357, final Class7096 class358) {
        return method12239(class355, class356, class354, class357);
    }
    
    @Nullable
    public Class7096 method12233(final Class7074 class7074) {
        final Class7096 method11846 = this.method12240().method11846(class7074);
        return (method11846 != null && this.method12236(class7074, method11846)) ? method11846 : null;
    }
    
    private Class7096 method12234(final BlockPos class354, final World class355, final ItemStack class356, final Class7096 class357) {
        Class7096 method12235 = class357;
        final Class51 method12236 = class356.method27657();
        if (method12236 != null) {
            final Class51 method12237 = method12236.method327("BlockStateTag");
            final Class9104<Class3833, Class7096> method12238 = class357.method21696().method11876();
            for (final String s : method12237.method293()) {
                final Class7111 method12239 = method12238.method32906(s);
                if (method12239 == null) {
                    continue;
                }
                method12235 = method12235(method12235, method12239, method12237.method313(s).getString());
            }
        }
        if (method12235 != class357) {
            class355.method6688(class354, method12235, 2);
        }
        return method12235;
    }
    
    private static <T extends Comparable<T>> Class7096 method12235(final Class7096 other, final Class7111<T> class7111, final String s) {
        return class7111.method21830(s).map(comparable -> ((Class7097<O, Class7096>)class7112).method21773((Class7111<Comparable>)class7113, comparable)).orElse(other);
    }
    
    public boolean method12236(final Class7074 class7074, final Class7096 class7075) {
        final Class512 method21652 = class7074.method21652();
        final ISelectionContext class7076 = (method21652 != null) ? ISelectionContext.forEntity(method21652) : ISelectionContext.dummy();
        if (!this.method12237() || class7075.method21752(class7074.method21654(), class7074.method21639())) {
            if (class7074.method21654().method6974(class7075, class7074.method21639(), class7076)) {
                return true;
            }
        }
        return false;
    }
    
    public boolean method12237() {
        return true;
    }
    
    public boolean method12238(final Class7074 class7074, final Class7096 class7075) {
        return class7074.method21654().method6688(class7074.method21639(), class7075, 11);
    }
    
    public static boolean method12239(final World class1847, final Class512 class1848, final BlockPos class1849, final ItemStack class1850) {
        if (class1847.getServer() != null) {
            final Class51 method27660 = class1850.method27660("BlockEntityTag");
            if (method27660 != null) {
                final TileEntity method27661 = class1847.method6727(class1849);
                if (method27661 != null) {
                    if (!class1847.isRemote) {
                        if (method27661.method2178()) {
                            if (class1848 == null || !class1848.method2908()) {
                                return false;
                            }
                        }
                    }
                    final Class51 method27662 = method27661.method2180(new Class51());
                    final Class51 method27663 = method27662.method333();
                    method27662.method338(method27660);
                    method27662.method298("x", class1849.getX());
                    method27662.method298("y", class1849.getY());
                    method27662.method298("z", class1849.getZ());
                    if (!method27662.equals(method27663)) {
                        method27661.method2179(method27662);
                        method27661.method2161();
                        return true;
                    }
                }
            }
            return false;
        }
        return false;
    }
    
    @Override
    public String method11717() {
        return this.method12240().method11856();
    }
    
    @Override
    public void method11735(final Class7207 class7207, final Class2265<ItemStack> class7208) {
        if (this.method11736(class7207)) {
            this.method12240().method11863(class7207, class7208);
        }
    }
    
    @Override
    public void method11728(final ItemStack class8321, final World class8322, final List<ITextComponent> list, final Class1981 class8323) {
        super.method11728(class8321, class8322, list, class8323);
        this.method12240().method11883(class8321, class8322, list, class8323);
    }
    
    public Class3833 method12240() {
        return this.field18131;
    }
    
    public void method12241(final Map<Class3833, Item> map, final Item class3820) {
        map.put(this.method12240(), class3820);
    }
}
