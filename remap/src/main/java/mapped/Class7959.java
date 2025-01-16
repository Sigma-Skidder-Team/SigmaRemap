// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;

import javax.annotation.Nullable;
import java.util.Random;
import java.util.Map;

public class Class7959 implements Class7954
{
    private final Map<Class7611, Item> field32698;
    private final int field32699;
    private final int field32700;
    private final int field32701;
    
    public Class7959(final int field32699, final int field32700, final int field32701, final Map<Class7611, Item> field32702) {
        Registry.field239.method509().filter(class7611 -> !map.containsKey(class7611)).findAny().ifPresent(class7612 -> {
            new IllegalStateException("Missing trade for villager type: " + Registry.field239.getKey(class7612));
            throw;
        });
        this.field32698 = field32702;
        this.field32699 = field32699;
        this.field32700 = field32700;
        this.field32701 = field32701;
    }
    
    @Nullable
    @Override
    public Class9017 method25804(final Entity class399, final Random random) {
        if (!(class399 instanceof Class825)) {
            return null;
        }
        return new Class9017(new ItemStack(this.field32698.get(((Class825)class399).method4870().method28780()), this.field32699), new ItemStack(Items.field31514), this.field32700, this.field32701, 0.05f);
    }
}
