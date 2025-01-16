// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.INameable;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.text.ITextComponent;

import javax.annotation.Nullable;
import java.util.Random;

public class Class463 extends TileEntity implements INameable, Class439
{
    public int field2727;
    public float field2728;
    public float field2729;
    public float field2730;
    public float field2731;
    public float field2732;
    public float field2733;
    public float field2734;
    public float field2735;
    public float field2736;
    private static final Random field2737;
    private ITextComponent field2738;
    
    public Class463() {
        super(Class5412.field22552);
    }
    
    @Override
    public CompoundNBT method2180(final CompoundNBT class51) {
        super.method2180(class51);
        if (this.hasCustomName()) {
            class51.putString("CustomName", Class5953.method17869(this.field2738));
        }
        return class51;
    }
    
    @Override
    public void method2179(final CompoundNBT class51) {
        super.method2179(class51);
        if (class51.contains("CustomName", 8)) {
            this.field2738 = Class5953.method17871(class51.getString("CustomName"));
        }
    }
    
    @Override
    public void method2229() {
        this.field2733 = this.field2732;
        this.field2735 = this.field2734;
        final PlayerEntity method7132 = this.field2656.method7132(this.field2657.getX() + 0.5f, this.field2657.getY() + 0.5f, this.field2657.getZ() + 0.5f, 3.0, false);
        if (method7132 == null) {
            this.field2736 += 0.02f;
            this.field2732 -= 0.1f;
        }
        else {
            this.field2736 = (float) MathHelper.method35693(method7132.getPosZ() - (this.field2657.getZ() + 0.5), method7132.getPosX() - (this.field2657.getX() + 0.5));
            this.field2732 += 0.1f;
            if (this.field2732 < 0.5f || Class463.field2737.nextInt(40) == 0) {
                final float field2730 = this.field2730;
                do {
                    this.field2730 += Class463.field2737.nextInt(4) - Class463.field2737.nextInt(4);
                } while (field2730 == this.field2730);
            }
        }
        while (this.field2734 >= 3.1415927f) {
            this.field2734 -= 6.2831855f;
        }
        while (this.field2734 < -3.1415927f) {
            this.field2734 += 6.2831855f;
        }
        while (this.field2736 >= 3.1415927f) {
            this.field2736 -= 6.2831855f;
        }
        while (this.field2736 < -3.1415927f) {
            this.field2736 += 6.2831855f;
        }
        float n;
        for (n = this.field2736 - this.field2734; n >= 3.1415927f; n -= 6.2831855f) {}
        while (n < -3.1415927f) {
            n += 6.2831855f;
        }
        this.field2734 += n * 0.4f;
        this.field2732 = MathHelper.clamp(this.field2732, 0.0f, 1.0f);
        ++this.field2727;
        this.field2729 = this.field2728;
        this.field2731 += (MathHelper.clamp((this.field2730 - this.field2728) * 0.4f, -0.2f, 0.2f) - this.field2731) * 0.9f;
        this.field2728 += this.field2731;
    }
    
    @Override
    public ITextComponent getName() {
        return (this.field2738 == null) ? new Class2259("container.enchant", new Object[0]) : this.field2738;
    }
    
    public void method2344(final ITextComponent field2738) {
        this.field2738 = field2738;
    }
    
    @Nullable
    @Override
    public ITextComponent getCustomName() {
        return this.field2738;
    }
    
    static {
        field2737 = new Random();
    }
}
