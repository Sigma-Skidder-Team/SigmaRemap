// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.List;

import net.minecraft.util.text.ITextComponent;
import org.apache.commons.lang3.Validate;

public class Class4044 extends Class4043
{
    public Class4044(final Class3833 class3833, final Class3833 class3834, final Class8959 class3835) {
        super(class3833, class3834, class3835);
        Validate.isInstanceOf((Class)Class3944.class, (Object)class3833);
        Validate.isInstanceOf((Class)Class3944.class, (Object)class3834);
    }
    
    public static void method12243(final ItemStack class8321, final List<ITextComponent> list) {
        final Class51 method27660 = class8321.method27660("BlockEntityTag");
        if (method27660 != null) {
            if (method27660.method315("Patterns")) {
                final Class52 method27661 = method27660.method328("Patterns", 10);
                for (int i = 0; i < method27661.size(); ++i) {
                    if (i >= 6) {
                        break;
                    }
                    final Class51 method27662 = method27661.method346(i);
                    final Class181 method27663 = Class181.method819(method27662.method319("Color"));
                    final Class230 method27664 = Class230.method860(method27662.method323("Pattern"));
                    if (method27664 != null) {
                        list.add(new Class2259("block.minecraft.banner." + method27664.method858() + '.' + method27663.method814(), new Object[0]).method8469(Class2116.field12316));
                    }
                }
            }
        }
    }
    
    public Class181 method12244() {
        return ((Class3944)this.method12240()).method12064();
    }
    
    @Override
    public void method11728(final ItemStack class8321, final Class1847 class8322, final List<ITextComponent> list, final Class1981 class8323) {
        method12243(class8321, list);
    }
}
