// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;

import javax.annotation.Nullable;
import java.util.Random;

public class Class7958 implements Class7954
{
    private static String[] field32693;
    public final Class5328 field32694;
    public final int field32695;
    public final int field32696;
    private final float field32697;
    
    public Class7958(final Class5328 field32694, final int field32695, final int field32696) {
        this.field32694 = field32694;
        this.field32695 = field32695;
        this.field32696 = field32696;
        this.field32697 = 0.05f;
    }
    
    @Nullable
    @Override
    public Class9017 method25804(final Entity class399, final Random random) {
        final ItemStack class400 = new ItemStack(Items.field31612, 1);
        Class4035.method12228(class400, this.field32694, this.field32695);
        return new Class9017(new ItemStack(Items.field31514, 1), class400, 12, this.field32696, this.field32697);
    }
}
