// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.INameable;
import net.minecraft.util.text.ITextComponent;

import javax.annotation.Nullable;

public abstract class Class460 extends TileEntity implements IInventory, Class434, INameable
{
    private Class9115 field2716;
    private ITextComponent field2717;
    
    public Class460(final Class5412<?> class5412) {
        super(class5412);
        this.field2716 = Class9115.field38616;
    }
    
    @Override
    public void method2179(final CompoundNBT class51) {
        super.method2179(class51);
        this.field2716 = Class9115.method32978(class51);
        if (class51.contains("CustomName", 8)) {
            this.field2717 = Class5953.method17871(class51.getString("CustomName"));
        }
    }
    
    @Override
    public CompoundNBT method2180(final CompoundNBT class51) {
        super.method2180(class51);
        this.field2716.method32977(class51);
        if (this.field2717 != null) {
            class51.putString("CustomName", Class5953.method17869(this.field2717));
        }
        return class51;
    }
    
    public void method2335(final ITextComponent field2717) {
        this.field2717 = field2717;
    }
    
    @Override
    public ITextComponent getName() {
        return (this.field2717 == null) ? this.method2243() : this.field2717;
    }
    
    @Override
    public ITextComponent getDisplayName() {
        return this.getName();
    }
    
    @Nullable
    @Override
    public ITextComponent getCustomName() {
        return this.field2717;
    }
    
    public abstract ITextComponent method2243();
    
    public boolean method2328(final PlayerEntity playerEntity) {
        return method2336(playerEntity, this.field2716, this.getDisplayName());
    }
    
    public static boolean method2336(final PlayerEntity playerEntity, final Class9115 class513, final ITextComponent class514) {
        if (!playerEntity.isSpectator() && !class513.method32976(playerEntity.getHeldItemMainhand())) {
            playerEntity.method2853(new Class2259("container.isLocked", new Object[] { class514 }), true);
            playerEntity.method2812(Class8520.field35066, Class286.field1582, 1.0f, 1.0f);
            return false;
        }
        return true;
    }
    
    @Nullable
    @Override
    public Class3418 method2166(final int n, final Class464 class464, final PlayerEntity class465) {
        return this.method2328(class465) ? this.method2253(n, class464) : null;
    }
    
    public abstract Class3418 method2253(final int p0, final Class464 p1);
}
