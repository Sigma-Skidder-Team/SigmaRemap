// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.EntityType;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;

public abstract class Class770 extends Class772
{
    private static final DataParameter<Byte> field4161;
    public int field4162;
    private Class2107 field4163;
    
    public Class770(final EntityType<? extends Class770> class7499, final World class7500) {
        super(class7499, class7500);
        this.field4163 = Class2107.field12213;
    }
    
    @Override
    public void method1649() {
        super.method1649();
        this.dataManager.register(Class770.field4161, (Byte)0);
    }
    
    @Override
    public void method1760(final Class51 class51) {
        super.method1760(class51);
        this.field4162 = class51.method319("SpellTicks");
    }
    
    @Override
    public void method1761(final Class51 class51) {
        super.method1761(class51);
        class51.method298("SpellTicks", this.field4162);
    }
    
    @Override
    public Class259 method4264() {
        if (!this.method4265()) {
            return this.method4296() ? Class259.field1240 : Class259.field1234;
        }
        return Class259.field1236;
    }
    
    public boolean method4265() {
        if (!this.world.isRemote) {
            return this.field4162 > 0;
        }
        return this.dataManager.get(Class770.field4161) > 0;
    }
    
    public void method4266(final Class2107 field4163) {
        this.field4163 = field4163;
        this.dataManager.set(Class770.field4161, (byte)Class2107.method8228(field4163));
    }
    
    public Class2107 method4267() {
        return this.world.isRemote ? Class2107.method8227(this.dataManager.get(Class770.field4161)) : this.field4163;
    }
    
    @Override
    public void method4172() {
        super.method4172();
        if (this.field4162 > 0) {
            --this.field4162;
        }
    }
    
    @Override
    public void method1659() {
        super.method1659();
        if (this.world.isRemote) {
            if (this.method4265()) {
                final Class2107 method4267 = this.method4267();
                final double n = Class2107.method8229(method4267)[0];
                final double n2 = Class2107.method8229(method4267)[1];
                final double n3 = Class2107.method8229(method4267)[2];
                final float n4 = this.field2951 * 0.017453292f + MathHelper.cos(this.ticksExisted * 0.6662f) * 0.25f;
                final float method4268 = MathHelper.cos(n4);
                final float method4269 = MathHelper.sin(n4);
                this.world.method6709(Class8432.field34617, this.getPosX() + method4268 * 0.6, this.getPosY() + 1.8, this.getPosZ() + method4269 * 0.6, n, n2, n3);
                this.world.method6709(Class8432.field34617, this.getPosX() - method4268 * 0.6, this.getPosY() + 1.8, this.getPosZ() - method4269 * 0.6, n, n2, n3);
            }
        }
    }
    
    public int method4268() {
        return this.field4162;
    }
    
    public abstract Class7795 method4262();
    
    static {
        field4161 = EntityDataManager.method33564(Class770.class, Class7709.field30653);
    }
}
