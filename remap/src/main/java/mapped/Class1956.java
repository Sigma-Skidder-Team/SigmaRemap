// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.ImmutableList;
import java.util.List;

public enum Class1956
{
    field10648(new ItemStack[] { new ItemStack(Class7739.field31375) }),
    field10649(new ItemStack[] { new ItemStack(Class7521.field29282) }),
    field10650(new ItemStack[] { new ItemStack(Class7739.field31354) }),
    field10651(new ItemStack[] { new ItemStack(Class7739.field31276), new ItemStack(Class7739.field31302) }),
    field10652(new ItemStack[] { new ItemStack(Class7739.field31351), new ItemStack(Class7739.field31278) }),
    field10653(new ItemStack[] { new ItemStack(Class7739.field31375) }),
    field10654(new ItemStack[] { new ItemStack(Class7739.field31338) }),
    field10655(new ItemStack[] { new ItemStack(Class7521.field29148) }),
    field10656(new ItemStack[] { new ItemStack(Class7739.field31351), new ItemStack(Class7739.field31514) }),
    field10657(new ItemStack[] { new ItemStack(Class7739.field31375) }),
    field10658(new ItemStack[] { new ItemStack(Class7521.field29325) }),
    field10659(new ItemStack[] { new ItemStack(Class7739.field31274), new ItemStack(Class7739.field31335) }),
    field10660(new ItemStack[] { new ItemStack(Class7739.field31375) }),
    field10661(new ItemStack[] { new ItemStack(Class7739.field31338) }),
    field10662(new ItemStack[] { new ItemStack(Class7739.field30962) }),
    field10663(new ItemStack[] { new ItemStack(Class7739.field31338) });
    
    private final List<ItemStack> field10664;
    
    private Class1956(final ItemStack[] array) {
        this.field10664 = (List<ItemStack>)ImmutableList.copyOf((Object[])array);
    }
    
    public List<ItemStack> method7942() {
        return this.field10664;
    }
}
