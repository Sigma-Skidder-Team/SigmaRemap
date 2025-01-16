// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.EntityType;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.world.World;

public class Class429 extends Class428
{
    private static final DataParameter<String> field2637;
    private static final DataParameter<ITextComponent> field2638;
    private final Class865 field2639;
    private int field2640;
    
    public Class429(final EntityType<? extends Class429> class7499, final World class7500) {
        super(class7499, class7500);
        this.field2639 = new Class866(this);
    }
    
    public Class429(final World class1847, final double n, final double n2, final double n3) {
        super(EntityType.field29001, class1847, n, n2, n3);
        this.field2639 = new Class866(this);
    }
    
    @Override
    public void method1649() {
        super.method1649();
        this.method1650().register(Class429.field2637, "");
        this.method1650().register((DataParameter<StringTextComponent>)Class429.field2638, new StringTextComponent(""));
    }
    
    @Override
    public void method1760(final CompoundNBT class51) {
        super.method1760(class51);
        this.field2639.method5210(class51);
        this.method1650().set(Class429.field2637, this.method2149().method5212());
        this.method1650().set(Class429.field2638, this.method2149().method5208());
    }
    
    @Override
    public void method1761(final CompoundNBT class51) {
        super.method1761(class51);
        this.field2639.method5209(class51);
    }
    
    @Override
    public Class2080 method2139() {
        return Class2080.field12030;
    }
    
    @Override
    public BlockState method2141() {
        return Blocks.field29416.getDefaultState();
    }
    
    public Class865 method2149() {
        return this.field2639;
    }
    
    @Override
    public void method2126(final int n, final int n2, final int n3, final boolean b) {
        if (b) {
            if (this.ticksExisted - this.field2640 >= 4) {
                this.method2149().method5213(this.world);
                this.field2640 = this.ticksExisted;
            }
        }
    }
    
    @Override
    public boolean method1770(final PlayerEntity playerEntity, final Class316 class513) {
        this.field2639.method5221(playerEntity);
        return true;
    }
    
    @Override
    public void method1880(final DataParameter<?> class8810) {
        super.method1880(class8810);
        if (Class429.field2638.equals(class8810)) {
            try {
                this.field2639.method5218(this.method1650().get(Class429.field2638));
            }
            catch (final Throwable t) {}
        }
        else if (Class429.field2637.equals(class8810)) {
            this.field2639.method5211(this.method1650().get(Class429.field2637));
        }
    }
    
    @Override
    public boolean method1905() {
        return true;
    }
    
    static {
        field2637 = EntityDataManager.method33564(Class429.class, Class7709.field30656);
        field2638 = EntityDataManager.method33564(Class429.class, Class7709.field30657);
    }
}
