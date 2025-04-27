// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.EntityType;
import net.minecraft.item.ItemStack;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

import javax.annotation.Nullable;

public class Class843 extends Class763
{
    public static final DataParameter<Byte> field4491;
    private Class759 field4492;
    private BlockPos field4493;
    private boolean field4494;
    private int field4495;
    
    public Class843(final EntityType<? extends Class843> class7499, final World class7500) {
        super(class7499, class7500);
        this.field4110 = new Class6565(this, this);
        this.field4108 = 3;
    }
    
    @Override
    public void method1671(final Class2160 class2160, final Vec3d class2161) {
        super.method1671(class2160, class2161);
        this.method1689();
    }
    
    @Override
    public void method1659() {
        this.noClip = true;
        super.method1659();
        this.noClip = false;
        this.method1699(true);
        if (this.field4494) {
            if (--this.field4495 <= 0) {
                this.field4495 = 20;
                this.attackEntityFrom(DamageSource.field32570, 1.0f);
            }
        }
    }
    
    @Override
    public void method4142() {
        super.method4142();
        this.field4114.method22062(0, new Class3490(this));
        this.field4114.method22062(4, new Class3510(this));
        this.field4114.method22062(8, new Class3530(this));
        this.field4114.method22062(9, new Class3628(this, PlayerEntity.class, 3.0f, 1.0f));
        this.field4114.method22062(10, new Class3628(this, Class759.class, 8.0f));
        this.field4115.method22062(1, new Class3547(this, new Class[] { Class776.class }).method11100(new Class[0]));
        this.field4115.method22062(2, new Class3570(this, this));
        this.field4115.method22062(3, new Class3555<Object>(this, PlayerEntity.class, true));
    }
    
    @Override
    public void method2621() {
        super.method2621();
        this.method2710(Class8107.field33405).method23941(14.0);
        this.method2710(Class8107.field33410).method23941(4.0);
    }
    
    @Override
    public void method1649() {
        super.method1649();
        this.dataManager.register(Class843.field4491, (Byte)0);
    }
    
    @Override
    public void method1760(final CompoundNBT class51) {
        super.method1760(class51);
        if (class51.contains("BoundX")) {
            this.field4493 = new BlockPos(class51.getInt("BoundX"), class51.getInt("BoundY"), class51.getInt("BoundZ"));
        }
        if (class51.contains("LifeTicks")) {
            this.method5044(class51.getInt("LifeTicks"));
        }
    }
    
    @Override
    public void method1761(final CompoundNBT class51) {
        super.method1761(class51);
        if (this.field4493 != null) {
            class51.putInt("BoundX", this.field4493.getX());
            class51.putInt("BoundY", this.field4493.getY());
            class51.putInt("BoundZ", this.field4493.getZ());
        }
        if (this.field4494) {
            class51.putInt("LifeTicks", this.field4495);
        }
    }
    
    public Class759 method5036() {
        return this.field4492;
    }
    
    @Nullable
    public BlockPos method5037() {
        return this.field4493;
    }
    
    public void method5038(final BlockPos field4493) {
        this.field4493 = field4493;
    }
    
    private boolean method5039(final int n) {
        return (this.dataManager.get(Class843.field4491) & n) != 0x0;
    }
    
    private void method5040(final int n, final boolean b) {
        final byte byteValue = this.dataManager.get(Class843.field4491);
        int n2;
        if (!b) {
            n2 = (byteValue & ~n);
        }
        else {
            n2 = (byteValue | n);
        }
        this.dataManager.set(Class843.field4491, (byte)(n2 & 0xFF));
    }
    
    public boolean method5041() {
        return this.method5039(1);
    }
    
    public void method5042(final boolean b) {
        this.method5040(1, b);
    }
    
    public void method5043(final Class759 field4492) {
        this.field4492 = field4492;
    }
    
    public void method5044(final int field4495) {
        this.field4494 = true;
        this.field4495 = field4495;
    }
    
    @Override
    public Class7795 method4160() {
        return Class8520.field35671;
    }
    
    @Override
    public Class7795 method2684() {
        return Class8520.field35673;
    }
    
    @Override
    public Class7795 method2683(final DamageSource class7929) {
        return Class8520.field35674;
    }
    
    @Override
    public float method1726() {
        return 1.0f;
    }
    
    @Nullable
    @Override
    public ILivingEntityData method4188(final Class1851 class1851, final Class9592 class1852, final Class2101 class1853, final ILivingEntityData class1854, final CompoundNBT class1855) {
        this.method4184(class1852);
        this.method4187(class1852);
        return super.method4188(class1851, class1852, class1853, class1854, class1855);
    }
    
    @Override
    public void method4184(final Class9592 class9592) {
        this.method1803(Class2215.field13600, new ItemStack(Items.field31286));
        this.method4191(Class2215.field13600, 0.0f);
    }
    
    static {
        field4491 = EntityDataManager.method33564(Class843.class, Class7709.field30653);
    }
}
