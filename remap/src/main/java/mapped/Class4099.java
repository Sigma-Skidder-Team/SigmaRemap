// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.world.World;

import java.util.List;

public class Class4099 extends Item
{
    private static String[] field18201;
    private final Class3833 field18202;
    
    public Class4099(final Class3833 field18202, final Class8959 class8959) {
        super(class8959);
        this.field18202 = field18202;
    }
    
    @Override
    public String method11717() {
        return this.field18202.method11856();
    }
    
    @Override
    public void method11728(final ItemStack class8321, final World class8322, final List<ITextComponent> list, final Class1981 class8323) {
        super.method11728(class8321, class8322, list, class8323);
        this.field18202.method11883(class8321, class8322, list, class8323);
    }
}
