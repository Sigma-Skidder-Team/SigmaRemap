// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.Optional;

public class Class858 extends Entity
{
    private static final DataParameter<Optional<BlockPos>> field4590;
    private static final DataParameter<Boolean> field4591;
    public int field4592;
    
    public Class858(final EntityType<? extends Class858> class7499, final World class7500) {
        super(class7499, class7500);
        this.preventEntitySpawning = true;
        this.field4592 = this.rand.nextInt(100000);
    }
    
    public Class858(final World class1847, final double n, final double n2, final double n3) {
        this(EntityType.field28975, class1847);
        this.setPosition(n, n2, n3);
    }
    
    @Override
    public boolean method1700() {
        return false;
    }
    
    @Override
    public void method1649() {
        this.method1650().register(Class858.field4590, Optional.empty());
        this.method1650().register(Class858.field4591, true);
    }
    
    @Override
    public void method1659() {
        ++this.field4592;
        if (!this.world.isRemote) {
            final BlockPos class354 = new BlockPos(this);
            if (this.world.dimension instanceof Class6738) {
                if (this.world.method6701(class354).method21706()) {
                    this.world.method6692(class354, Class7521.field29289.method11878());
                }
            }
        }
    }
    
    @Override
    public void method1761(final Class51 class51) {
        if (this.method5183() != null) {
            class51.method295("BeamTarget", Class9346.method34646(this.method5183()));
        }
        class51.method312("ShowBottom", this.method5185());
    }
    
    @Override
    public void method1760(final Class51 class51) {
        if (class51.method316("BeamTarget", 10)) {
            this.method5182(Class9346.method34645(class51.method327("BeamTarget")));
        }
        if (class51.method316("ShowBottom", 1)) {
            this.method5184(class51.method329("ShowBottom"));
        }
    }
    
    @Override
    public boolean method1749() {
        return true;
    }
    
    @Override
    public boolean attackEntityFrom(final DamageSource class7929, final float n) {
        if (this.method1849(class7929)) {
            return false;
        }
        if (!(class7929.method25714() instanceof Class852)) {
            if (!this.removed) {
                if (!this.world.isRemote) {
                    this.method1652();
                    if (!class7929.method25707()) {
                        this.world.method6722(null, this.getPosX(), this.getPosY(), this.getPosZ(), 6.0f, Class2196.field13367);
                    }
                    this.method5181(class7929);
                }
            }
            return true;
        }
        return false;
    }
    
    @Override
    public void method1648() {
        this.method5181(DamageSource.field32575);
        super.method1648();
    }
    
    private void method5181(final DamageSource class7929) {
        if (this.world.dimension instanceof Class6738) {
            final Class8619 method20509 = ((Class6738)this.world.dimension).method20509();
            if (method20509 != null) {
                method20509.method29251(this, class7929);
            }
        }
    }
    
    public void method5182(final BlockPos value) {
        this.method1650().set(Class858.field4590, Optional.ofNullable(value));
    }
    
    @Nullable
    public BlockPos method5183() {
        return this.method1650().get(Class858.field4590).orElse(null);
    }
    
    public void method5184(final boolean b) {
        this.method1650().set(Class858.field4591, b);
    }
    
    public boolean method5185() {
        return this.method1650().get(Class858.field4591);
    }
    
    @Override
    public boolean method1753(final double n) {
        return super.method1753(n) || this.method5183() != null;
    }
    
    @Override
    public IPacket<?> method1932() {
        return new Class4339(this);
    }
    
    static {
        field4590 = EntityDataManager.method33564(Class858.class, Class7709.field30665);
        field4591 = EntityDataManager.method33564(Class858.class, Class7709.field30661);
    }
}
