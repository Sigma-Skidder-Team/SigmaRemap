// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;

import java.util.Random;

public class Class7961 implements Class7954
{
    private static String[] field32711;
    private final ItemStack field32712;
    private final int field32713;
    private final int field32714;
    private final int field32715;
    private final int field32716;
    private final float field32717;
    
    public Class7961(final Class3833 class3833, final int n, final int n2, final int n3, final int n4) {
        this(new ItemStack(class3833), n, n2, n3, n4);
    }
    
    public Class7961(final Item class3820, final int n, final int n2, final int n3) {
        this(new ItemStack(class3820), n, n2, 12, n3);
    }
    
    public Class7961(final Item class3820, final int n, final int n2, final int n3, final int n4) {
        this(new ItemStack(class3820), n, n2, n3, n4);
    }
    
    public Class7961(final ItemStack class8321, final int n, final int n2, final int n3, final int n4) {
        this(class8321, n, n2, n3, n4, 0.05f);
    }
    
    public Class7961(final ItemStack field32712, final int field32713, final int field32714, final int field32715, final int field32716, final float field32717) {
        this.field32712 = field32712;
        this.field32713 = field32713;
        this.field32714 = field32714;
        this.field32715 = field32715;
        this.field32716 = field32716;
        this.field32717 = field32717;
    }
    
    @Override
    public Class9017 method25804(final Entity class399, final Random random) {
        return new Class9017(new ItemStack(Items.field31514, this.field32713), new ItemStack(this.field32712.getItem(), this.field32714), this.field32715, this.field32716, this.field32717);
    }
}
