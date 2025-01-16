// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.world.World;

import java.util.List;

public class Class3822 extends Class3821
{
    private final EntityType<?> field17374;
    
    public Class3822(final EntityType<?> field17374, final Fluid class7255, final Class8959 class7256) {
        super(class7255, class7256);
        this.field17374 = field17374;
    }
    
    @Override
    public void method11753(final World class1847, final ItemStack class1848, final BlockPos class1849) {
        if (!class1847.isRemote) {
            this.method11757(class1847, class1848, class1849);
        }
    }
    
    @Override
    public void method11756(final PlayerEntity playerEntity, final Class1851 class513, final BlockPos class514) {
        class513.method6705(playerEntity, class514, Class8520.field35050, Class286.field1584, 1.0f, 1.0f);
    }
    
    private void method11757(final World class1847, final ItemStack class1848, final BlockPos class1849) {
        final Entity method23356 = this.field17374.method23356(class1847, class1848, null, class1849, Class2101.field12185, true, false);
        if (method23356 != null) {
            ((Class833)method23356).method4954(true);
        }
    }
    
    @Override
    public void method11728(final ItemStack class8321, final World class8322, final List<ITextComponent> list, final Class1981 class8323) {
        if (this.field17374 == EntityType.field29034) {
            final CompoundNBT method27657 = class8321.method27657();
            if (method27657 != null) {
                if (method27657.contains("BucketVariantTag", 3)) {
                    final int method27658 = method27657.getInt("BucketVariantTag");
                    final TextFormatting[] array = { TextFormatting.ITALIC, TextFormatting.GRAY};
                    final String string = "color.minecraft." + Class835.method4974(method27658);
                    final String string2 = "color.minecraft." + Class835.method4975(method27658);
                    for (int i = 0; i < Class835.field4451.length; ++i) {
                        if (method27658 == Class835.field4451[i]) {
                            list.add(new Class2259(Class835.method4973(i), new Object[0]).applyTextStyles(array));
                            return;
                        }
                    }
                    list.add(new Class2259(Class835.method4976(method27658), new Object[0]).applyTextStyles(array));
                    final Class2259 class8324 = new Class2259(string, new Object[0]);
                    if (!string.equals(string2)) {
                        class8324.appendText(", ").appendSibling(new Class2259(string2, new Object[0]));
                    }
                    class8324.applyTextStyles(array);
                    list.add(class8324);
                }
            }
        }
    }
}
