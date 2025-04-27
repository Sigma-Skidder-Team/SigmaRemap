// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Direction;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.text.ITextComponent;

import java.util.stream.IntStream;
import javax.annotation.Nullable;
import java.util.List;

public class Class440 extends Class456 implements Class441, Class439
{
    private static final int[] field2665;
    private NonNullList<ItemStack> field2666;
    private int field2667;
    private Class2100 field2668;
    private float field2669;
    private float field2670;
    private Class181 field2671;
    private boolean field2672;
    
    public Class440(final Class181 field2671) {
        super(Class5412.field22563);
        this.field2666 = NonNullList.withSize(27, ItemStack.EMPTY);
        this.field2668 = Class2100.field12169;
        this.field2671 = field2671;
    }
    
    public Class440() {
        this(null);
        this.field2672 = true;
    }
    
    @Override
    public void method2229() {
        this.method2233();
        if (this.field2668 == Class2100.field12170 || this.field2668 == Class2100.field12172) {
            this.method2238();
        }
    }
    
    public void method2233() {
        this.field2670 = this.field2669;
        switch (Class9309.field39949[this.field2668.ordinal()]) {
            case 1: {
                this.field2669 = 0.0f;
                break;
            }
            case 2: {
                this.field2669 += 0.1f;
                if (this.field2669 >= 1.0f) {
                    this.method2238();
                    this.field2668 = Class2100.field12171;
                    this.field2669 = 1.0f;
                    this.method2240();
                    break;
                }
                break;
            }
            case 3: {
                this.field2669 -= 0.1f;
                if (this.field2669 <= 0.0f) {
                    this.field2668 = Class2100.field12169;
                    this.field2669 = 0.0f;
                    this.method2240();
                    break;
                }
                break;
            }
            case 4: {
                this.field2669 = 1.0f;
                break;
            }
        }
    }
    
    public Class2100 method2234() {
        return this.field2668;
    }
    
    public AxisAlignedBB method2235(final Class7096 class7096) {
        return this.method2236(class7096.method21772(Class3942.field17832));
    }
    
    public AxisAlignedBB method2236(final Direction class179) {
        final float method2251 = this.method2251(1.0f);
        return VoxelShapes.fullCube().getBoundingBox().expand(0.5f * method2251 * class179.getXOffset(), 0.5f * method2251 * class179.getYOffset(), 0.5f * method2251 * class179.getZOffset());
    }
    
    private AxisAlignedBB method2237(final Direction class179) {
        final Direction method782 = class179.getOpposite();
        return this.method2236(class179).contract(method782.getXOffset(), method782.getYOffset(), method782.getZOffset());
    }
    
    private void method2238() {
        final Class7096 method6701 = this.field2656.getBlockState(this.getPos());
        if (method6701.method21696() instanceof Class3942) {
            final Direction class179 = method6701.method21772(Class3942.field17832);
            final AxisAlignedBB method6702 = this.method2237(class179).offset(this.field2657);
            final List<Entity> method6703 = this.field2656.method7127(null, method6702);
            if (!method6703.isEmpty()) {
                for (int i = 0; i < method6703.size(); ++i) {
                    final Entity class180 = method6703.get(i);
                    if (class180.method1921() != PushReaction.IGNORE) {
                        double n = 0.0;
                        double n2 = 0.0;
                        double n3 = 0.0;
                        final AxisAlignedBB method6704 = class180.getBoundingBox();
                        switch (Class9309.field39950[class179.getAxis().ordinal()]) {
                            case 1: {
                                double n4;
                                if (class179.getAxisDirection() == AxisDirection.POSITIVE) {
                                    n4 = method6702.maxX - method6704.minX;
                                }
                                else {
                                    n4 = method6704.maxX - method6702.minX;
                                }
                                n = n4 + 0.01;
                                break;
                            }
                            case 2: {
                                double n5;
                                if (class179.getAxisDirection() == AxisDirection.POSITIVE) {
                                    n5 = method6702.maxY - method6704.minY;
                                }
                                else {
                                    n5 = method6704.maxY - method6702.minY;
                                }
                                n2 = n5 + 0.01;
                                break;
                            }
                            case 3: {
                                double n6;
                                if (class179.getAxisDirection() == AxisDirection.POSITIVE) {
                                    n6 = method6702.maxZ - method6704.minZ;
                                }
                                else {
                                    n6 = method6704.maxZ - method6702.minZ;
                                }
                                n3 = n6 + 0.01;
                                break;
                            }
                        }
                        class180.method1671(Class2160.field12829, new Vec3d(n * class179.getXOffset(), n2 * class179.getYOffset(), n3 * class179.getZOffset()));
                    }
                }
            }
        }
    }
    
    @Override
    public int getSizeInventory() {
        return this.field2666.size();
    }
    
    @Override
    public boolean method2200(final int n, final int field2667) {
        if (n != 1) {
            return super.method2200(n, field2667);
        }
        if ((this.field2667 = field2667) == 0) {
            this.field2668 = Class2100.field12172;
            this.method2240();
        }
        if (field2667 == 1) {
            this.field2668 = Class2100.field12170;
            this.method2240();
        }
        return true;
    }
    
    private void method2240() {
        this.method2194().method21735(this.method2186(), this.getPos(), 3);
    }
    
    @Override
    public void method2241(final PlayerEntity playerEntity) {
        if (!playerEntity.isSpectator()) {
            if (this.field2667 < 0) {
                this.field2667 = 0;
            }
            ++this.field2667;
            this.field2656.method6763(this.field2657, this.method2194().getBlock(), 1, this.field2667);
            if (this.field2667 == 1) {
                this.field2656.method6705(null, this.field2657, Class8520.field35550, Class286.field1582, 0.5f, this.field2656.rand.nextFloat() * 0.1f + 0.9f);
            }
        }
    }
    
    @Override
    public void method2242(final PlayerEntity playerEntity) {
        if (!playerEntity.isSpectator()) {
            --this.field2667;
            this.field2656.method6763(this.field2657, this.method2194().getBlock(), 1, this.field2667);
            if (this.field2667 <= 0) {
                this.field2656.method6705(null, this.field2657, Class8520.field35549, Class286.field1582, 0.5f, this.field2656.rand.nextFloat() * 0.1f + 0.9f);
            }
        }
    }
    
    @Override
    public ITextComponent method2243() {
        return new Class2259("container.shulkerBox");
    }
    
    @Override
    public void method2179(final CompoundNBT class51) {
        super.method2179(class51);
        this.method2244(class51);
    }
    
    @Override
    public CompoundNBT method2180(final CompoundNBT class51) {
        super.method2180(class51);
        return this.method2245(class51);
    }
    
    public void method2244(final CompoundNBT class51) {
        this.field2666 = NonNullList.withSize(this.getSizeInventory(), ItemStack.EMPTY);
        if (!this.method2324(class51)) {
            if (class51.contains("Items", 9)) {
                Class8508.method28426(class51, this.field2666);
            }
        }
    }
    
    public CompoundNBT method2245(final CompoundNBT class51) {
        if (!this.method2325(class51)) {
            Class8508.method28425(class51, this.field2666, false);
        }
        return class51;
    }
    
    @Override
    public NonNullList<ItemStack> method2246() {
        return this.field2666;
    }
    
    @Override
    public void method2247(final NonNullList<ItemStack> field2666) {
        this.field2666 = field2666;
    }
    
    @Override
    public int[] method2248(final Direction class179) {
        return Class440.field2665;
    }
    
    @Override
    public boolean method2249(final int n, final ItemStack class8321, final Direction class8322) {
        return !(Block.method11776(class8321.getItem()) instanceof Class3942);
    }
    
    @Override
    public boolean method2250(final int n, final ItemStack class8321, final Direction class8322) {
        return true;
    }
    
    public float method2251(final float n) {
        return MathHelper.method35700(n, this.field2670, this.field2669);
    }
    
    @Nullable
    public Class181 method2252() {
        if (this.field2672) {
            this.field2671 = Class3942.method12058(this.method2194().getBlock());
            this.field2672 = false;
        }
        return this.field2671;
    }
    
    @Override
    public Class3418 method2253(final int n, final Class464 class464) {
        return new Class3435(n, class464, this);
    }
    
    static {
        field2665 = IntStream.range(0, 27).toArray();
    }
}
