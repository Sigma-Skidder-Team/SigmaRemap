// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntitySize;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.Pose;
import net.minecraft.util.Direction;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;

import java.util.List;

public class Class863 extends Class860
{
    private static String[] field4606;
    
    public Class863(final EntityType<? extends Class863> class7499, final World class7500) {
        super(class7499, class7500);
    }
    
    public Class863(final World class1847, final BlockPos class1848) {
        super(EntityType.field28995, class1847, class1848);
        this.setPosition(class1848.getX() + 0.5, class1848.getY() + 0.5, class1848.getZ() + 0.5);
        this.method1889(new AxisAlignedBB(this.getPosX() - 0.1875, this.getPosY() - 0.25 + 0.125, this.getPosZ() - 0.1875, this.getPosX() + 0.1875, this.getPosY() + 0.25 + 0.125, this.getPosZ() + 0.1875));
        this.forceSpawn = true;
    }
    
    @Override
    public void setPosition(final double n, final double n2, final double n3) {
        super.setPosition(MathHelper.floor(n) + 0.5, MathHelper.floor(n2) + 0.5, MathHelper.floor(n3) + 0.5);
    }
    
    @Override
    public void method5187() {
        this.method1948(this.field4599.getX() + 0.5, this.field4599.getY() + 0.5, this.field4599.getZ() + 0.5);
    }
    
    @Override
    public void method5186(final Direction class179) {
    }
    
    @Override
    public int method5190() {
        return 9;
    }
    
    @Override
    public int method5191() {
        return 9;
    }
    
    @Override
    public float method1890(final Pose class290, final EntitySize class291) {
        return -0.0625f;
    }
    
    @Override
    public boolean method1753(final double n) {
        return n < 1024.0;
    }
    
    @Override
    public void method5192(final Entity class399) {
        this.method1695(Class8520.field35341, 1.0f, 1.0f);
    }
    
    @Override
    public void method1761(final Class51 class51) {
    }
    
    @Override
    public void method1760(final Class51 class51) {
    }
    
    @Override
    public boolean method1770(final Class512 class512, final Class316 class513) {
        if (!this.world.field10067) {
            int n = 0;
            final List<Class759> method7128 = this.world.method7128((Class<? extends Class759>)Class759.class, new AxisAlignedBB(this.getPosX() - 7.0, this.getPosY() - 7.0, this.getPosZ() - 7.0, this.getPosX() + 7.0, this.getPosY() + 7.0, this.getPosZ() + 7.0));
            for (final Class759 class514 : method7128) {
                if (class514.method4206() != class512) {
                    continue;
                }
                class514.method4207(this, true);
                n = 1;
            }
            if (n == 0) {
                this.method1652();
                if (class512.field3025.field27304) {
                    for (final Class759 class515 : method7128) {
                        if (!class515.method4205()) {
                            continue;
                        }
                        if (class515.method4206() != this) {
                            continue;
                        }
                        class515.method4203(true, false);
                    }
                }
            }
            return true;
        }
        return true;
    }
    
    @Override
    public boolean method5189() {
        return this.world.method6701(this.field4599).method21696().method11785(Class7188.field27911);
    }
    
    public static Class863 method5205(final World class1847, final BlockPos class1848) {
        final int method1074 = class1848.getX();
        final int method1075 = class1848.getY();
        final int method1076 = class1848.getZ();
        for (final Class863 class1849 : class1847.method7128((Class<? extends Class863>)Class863.class, new AxisAlignedBB(method1074 - 1.0, method1075 - 1.0, method1076 - 1.0, method1074 + 1.0, method1075 + 1.0, method1076 + 1.0))) {
            if (!class1849.method5194().equals(class1848)) {
                continue;
            }
            return class1849;
        }
        final Class863 class1850 = new Class863(class1847, class1848);
        class1847.method6886(class1850);
        class1850.method5193();
        return class1850;
    }
    
    @Override
    public void method5193() {
        this.method1695(Class8520.field35342, 1.0f, 1.0f);
    }
    
    @Override
    public IPacket<?> method1932() {
        return new Class4339(this, this.getType(), 0, this.method5194());
    }
}
