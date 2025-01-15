// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public abstract class Class416 extends Class419 implements Class407
{
    private static final Class8810<ItemStack> field2524;
    
    public Class416(final EntityType<? extends Class416> class7499, final Class1847 class7500) {
        super(class7499, class7500);
    }
    
    public Class416(final EntityType<? extends Class416> class7499, final double n, final double n2, final double n3, final double n4, final double n5, final double n6, final Class1847 class7500) {
        super(class7499, n, n2, n3, n4, n5, n6, class7500);
    }
    
    public Class416(final EntityType<? extends Class416> class7499, final Class511 class7500, final double n, final double n2, final double n3, final Class1847 class7501) {
        super(class7499, class7500, n, n2, n3, class7501);
    }
    
    public void method2029(final ItemStack class8321) {
        if (class8321.method27622() != Class7739.field31511 || class8321.method27656()) {
            this.method1650().method33569(Class416.field2524, (ItemStack)Class8349.method27851((T)class8321.method27641(), class8322 -> class8322.method27691(1)));
        }
    }
    
    public ItemStack method2030() {
        return this.method1650().method33568(Class416.field2524);
    }
    
    @Override
    public ItemStack method2005() {
        final ItemStack method2030 = this.method2030();
        return method2030.method27620() ? new ItemStack(Class7739.field31511) : method2030;
    }
    
    @Override
    public void method1649() {
        this.method1650().method33565(Class416.field2524, ItemStack.field34174);
    }
    
    @Override
    public void method1761(final Class51 class51) {
        super.method1761(class51);
        final ItemStack method2030 = this.method2030();
        if (!method2030.method27620()) {
            class51.method295("Item", method2030.method27627(new Class51()));
        }
    }
    
    @Override
    public void method1760(final Class51 class51) {
        super.method1760(class51);
        this.method2029(ItemStack.method27619(class51.method327("Item")));
    }
    
    static {
        field2524 = Class9184.method33564(Class416.class, Class7709.field30659);
    }
}
