// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.ImmutableList;
import net.minecraft.item.ItemStack;

import java.util.List;

public enum Class1956
{
    field10648(new ItemStack[] { new ItemStack(Items.field31375) }),
    field10649(new ItemStack[] { new ItemStack(Blocks.BRICKS) }),
    field10650(new ItemStack[] { new ItemStack(Items.field31354) }),
    field10651(new ItemStack[] { new ItemStack(Items.field31276), new ItemStack(Items.field31302) }),
    field10652(new ItemStack[] { new ItemStack(Items.field31351), new ItemStack(Items.field31278) }),
    field10653(new ItemStack[] { new ItemStack(Items.field31375) }),
    field10654(new ItemStack[] { new ItemStack(Items.field31338) }),
    field10655(new ItemStack[] { new ItemStack(Blocks.STONE) }),
    field10656(new ItemStack[] { new ItemStack(Items.field31351), new ItemStack(Items.field31514) }),
    field10657(new ItemStack[] { new ItemStack(Items.field31375) }),
    field10658(new ItemStack[] { new ItemStack(Blocks.field29325) }),
    field10659(new ItemStack[] { new ItemStack(Items.field31274), new ItemStack(Items.field31335) }),
    field10660(new ItemStack[] { new ItemStack(Items.field31375) }),
    field10661(new ItemStack[] { new ItemStack(Items.field31338) }),
    field10662(new ItemStack[] { new ItemStack(Items.field30962) }),
    field10663(new ItemStack[] { new ItemStack(Items.field31338) });
    
    private final List<ItemStack> field10664;
    
    Class1956(final ItemStack[] array) {
        this.field10664 = (List<ItemStack>)ImmutableList.copyOf((Object[])array);
    }
    
    public List<ItemStack> method7942() {
        return this.field10664;
    }
}
