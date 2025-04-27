// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.command.ICommandSource;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.text.ITextComponent;

public class Class435 extends TileEntity implements Class447, INamedContainerProvider
{
    private final IInventory field2649;
    private final Class7604 field2650;
    private ItemStack field2651;
    private int field2652;
    private int field2653;
    
    public Class435() {
        super(Class5412.field22569);
        this.field2649 = new Class452(this);
        this.field2650 = new Class7603(this);
        this.field2651 = ItemStack.EMPTY;
    }
    
    public ItemStack method2168() {
        return this.field2651;
    }
    
    public boolean method2169() {
        final Item method27622 = this.field2651.getItem();
        return method27622 == Items.field31512 || method27622 == Items.field31513;
    }
    
    public void method2170(final ItemStack class8321) {
        this.method2172(class8321, null);
    }
    
    private void method2171() {
        this.field2652 = 0;
        this.field2653 = 0;
        Class3930.method12042(this.method2186(), this.getPos(), this.method2194(), false);
    }
    
    public void method2172(final ItemStack class8321, final PlayerEntity class8322) {
        this.field2651 = this.method2176(class8321, class8322);
        this.field2652 = 0;
        this.field2653 = Class4096.method12341(this.field2651);
        this.method2161();
    }
    
    private void method2173(final int n) {
        final int method35651 = MathHelper.method35651(n, 0, this.field2653 - 1);
        if (method35651 != this.field2652) {
            this.field2652 = method35651;
            this.method2161();
            Class3930.method12043(this.method2186(), this.getPos(), this.method2194());
        }
    }
    
    public int method2174() {
        return this.field2652;
    }
    
    public int method2175() {
        return MathHelper.method35642(((this.field2653 <= 1) ? 1.0f : (this.method2174() / (this.field2653 - 1.0f))) * 14.0f) + (this.method2169() ? 1 : 0);
    }
    
    private ItemStack method2176(final ItemStack class8321, final PlayerEntity class8322) {
        if (this.field2656 instanceof Class1849) {
            if (class8321.getItem() == Items.field31513) {
                Class4096.method12342(class8321, this.method2177(class8322), class8322);
            }
        }
        return class8321;
    }
    
    private Class7492 method2177(final PlayerEntity playerEntity) {
        String string;
        ITextComponent method1871;
        if (playerEntity != null) {
            string = playerEntity.getName().getString();
            method1871 = playerEntity.getDisplayName();
        }
        else {
            string = "Lectern";
            method1871 = new StringTextComponent("Lectern");
        }
        return new Class7492(ICommandSource.DUMMY, new Vec3d(this.field2657.getX() + 0.5, this.field2657.getY() + 0.5, this.field2657.getZ() + 0.5), Vec2f.ZERO, (Class1849)this.field2656, 2, string, method1871, this.field2656.getServer(), playerEntity);
    }
    
    @Override
    public boolean method2178() {
        return true;
    }
    
    @Override
    public void method2179(final CompoundNBT class51) {
        super.method2179(class51);
        if (!class51.contains("Book", 10)) {
            this.field2651 = ItemStack.EMPTY;
        }
        else {
            this.field2651 = this.method2176(ItemStack.method27619(class51.getCompound("Book")), null);
        }
        this.field2653 = Class4096.method12341(this.field2651);
        this.field2652 = MathHelper.method35651(class51.getInt("Page"), 0, this.field2653 - 1);
    }
    
    @Override
    public CompoundNBT method2180(final CompoundNBT class51) {
        super.method2180(class51);
        if (!this.method2168().method27620()) {
            class51.put("Book", this.method2168().method27627(new CompoundNBT()));
            class51.putInt("Page", this.field2652);
        }
        return class51;
    }
    
    @Override
    public void method2164() {
        this.method2170(ItemStack.EMPTY);
    }
    
    @Override
    public Class3418 method2166(final int n, final Class464 class464, final PlayerEntity class465) {
        return new Class3420(n, this.field2649, this.field2650);
    }
    
    @Override
    public ITextComponent method1871() {
        return new Class2259("container.lectern");
    }
}
