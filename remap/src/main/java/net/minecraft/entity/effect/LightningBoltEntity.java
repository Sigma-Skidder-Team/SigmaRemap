// 
// Decompiled by Procyon v0.6.0
// 

package net.minecraft.entity.effect;

import mapped.*;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.Iterator;
import java.util.List;

public class LightningBoltEntity extends Entity
{
    private static String[] field2536;
    private int field2537;
    public long field2538;
    private int field2539;
    private final boolean field2540;
    private Class513 field2541;
    
    public LightningBoltEntity(final World class1847, final double n, final double n2, final double n3, final boolean field2540) {
        super(EntityType.field29057, class1847);
        this.ignoreFrustumCheck = true;
        this.method1730(n, n2, n3, 0.0f, 0.0f);
        this.field2537 = 2;
        this.field2538 = this.rand.nextLong();
        this.field2539 = this.rand.nextInt(3) + 1;
        this.field2540 = field2540;
        final Class2113 method6954 = class1847.method6954();
        if (method6954 == Class2113.field12292 || method6954 == Class2113.field12293) {
            this.method2039(4);
        }
    }
    
    @Override
    public Class286 method1922() {
        return Class286.field1581;
    }
    
    public void method2038(final Class513 field2541) {
        this.field2541 = field2541;
    }
    
    @Override
    public void method1659() {
        super.method1659();
        if (this.field2537 == 2) {
            this.world.method6706(null, this.getPosX(), this.getPosY(), this.getPosZ(), Class8520.field35345, Class286.field1581, 10000.0f, 0.8f + this.rand.nextFloat() * 0.2f);
            this.world.method6706(null, this.getPosX(), this.getPosY(), this.getPosZ(), Class8520.field35344, Class286.field1581, 2.0f, 0.5f + this.rand.nextFloat() * 0.2f);
        }
        --this.field2537;
        if (this.field2537 < 0) {
            if (this.field2539 != 0) {
                if (this.field2537 < -this.rand.nextInt(10)) {
                    --this.field2539;
                    this.field2537 = 1;
                    this.field2538 = this.rand.nextLong();
                    this.method2039(0);
                }
            }
            else {
                this.method1652();
            }
        }
        if (this.field2537 >= 0) {
            if (!this.world.isRemote) {
                if (!this.field2540) {
                    final List<Entity> method6737 = this.world.method6737(this, new AxisAlignedBB(this.getPosX() - 3.0, this.getPosY() - 3.0, this.getPosZ() - 3.0, this.getPosX() + 3.0, this.getPosY() + 6.0 + 3.0, this.getPosZ() + 3.0), Entity::method1768);
                    final Iterator<Entity> iterator = method6737.iterator();
                    while (iterator.hasNext()) {
                        iterator.next().onStruckByLightning(this);
                    }
                    if (this.field2541 != null) {
                        Class7770.field31805.method13719(this.field2541, method6737);
                    }
                }
            }
            else {
                this.world.method6786(2);
            }
        }
    }
    
    private void method2039(final int n) {
        if (!this.field2540) {
            if (!this.world.isRemote) {
                if (this.world.method6765().method31216(Class8878.field37315)) {
                    final Class7096 method11878 = Class7521.field29289.getDefaultState();
                    final BlockPos class354 = new BlockPos(this);
                    if (this.world.getBlockState(class354).method21706()) {
                        if (method11878.method21752(this.world, class354)) {
                            this.world.method6692(class354, method11878);
                        }
                    }
                    for (int i = 0; i < n; ++i) {
                        final BlockPos method11879 = class354.add(this.rand.nextInt(3) - 1, this.rand.nextInt(3) - 1, this.rand.nextInt(3) - 1);
                        if (this.world.getBlockState(method11879).method21706()) {
                            if (method11878.method21752(this.world, method11879)) {
                                this.world.method6692(method11879, method11878);
                            }
                        }
                    }
                }
            }
        }
    }
    
    @Override
    public boolean method1753(final double n) {
        final double n2 = 64.0 * method1869();
        return n < n2 * n2;
    }
    
    @Override
    public void method1649() {
    }
    
    @Override
    public void method1760(final CompoundNBT class51) {
    }
    
    @Override
    public void method1761(final CompoundNBT class51) {
    }
    
    @Override
    public IPacket<?> method1932() {
        return new Class4318(this);
    }
}
