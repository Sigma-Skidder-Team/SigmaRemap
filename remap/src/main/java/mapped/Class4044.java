// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.List;

import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.world.World;
import org.apache.commons.lang3.Validate;

public class Class4044 extends Class4043
{
    public Class4044(final Block class3833, final Block class3834, final Class8959 class3835) {
        super(class3833, class3834, class3835);
        Validate.isInstanceOf((Class)Class3944.class, (Object)class3833);
        Validate.isInstanceOf((Class)Class3944.class, (Object)class3834);
    }
    
    public static void method12243(final ItemStack class8321, final List<ITextComponent> list) {
        final CompoundNBT method27660 = class8321.method27660("BlockEntityTag");
        if (method27660 != null) {
            if (method27660.contains("Patterns")) {
                final ListNBT method27661 = method27660.getList("Patterns", 10);
                for (int i = 0; i < method27661.size(); ++i) {
                    if (i >= 6) {
                        break;
                    }
                    final CompoundNBT method27662 = method27661.method346(i);
                    final Class181 method27663 = Class181.method819(method27662.getInt("Color"));
                    final Class230 method27664 = Class230.method860(method27662.getString("Pattern"));
                    if (method27664 != null) {
                        list.add(new Class2259("block.minecraft.banner." + method27664.method858() + '.' + method27663.method814(), new Object[0]).applyTextStyle(TextFormatting.GRAY));
                    }
                }
            }
        }
    }
    
    public Class181 method12244() {
        return ((Class3944)this.method12240()).method12064();
    }
    
    @Override
    public void method11728(final ItemStack class8321, final World class8322, final List<ITextComponent> list, final Class1981 class8323) {
        method12243(class8321, list);
    }
}
