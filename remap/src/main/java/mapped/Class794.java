// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.UUID;
import java.util.Optional;

public abstract class Class794 extends Class789
{
    public static final DataParameter<Byte> field4243;
    public static final DataParameter<Optional<UUID>> field4244;
    public Class3495 field4245;
    
    public Class794(final EntityType<? extends Class794> class7499, final World class7500) {
        super(class7499, class7500);
        this.method4482();
    }
    
    @Override
    public void method1649() {
        super.method1649();
        this.dataManager.register(Class794.field4243, (Byte)0);
        this.dataManager.register(Class794.field4244, Optional.empty());
    }
    
    @Override
    public void method1761(final CompoundNBT class51) {
        super.method1761(class51);
        if (this.method4485() != null) {
            class51.putString("OwnerUUID", this.method4485().toString());
        }
        else {
            class51.putString("OwnerUUID", "");
        }
        class51.putBoolean("Sitting", this.method4483());
    }
    
    @Override
    public void method1760(final CompoundNBT class51) {
        super.method1760(class51);
        String name;
        if (class51.contains("OwnerUUID", 8)) {
            name = class51.getString("OwnerUUID");
        }
        else {
            name = Class7450.method22924(this.method1897(), class51.getString("Owner"));
        }
        if (!name.isEmpty()) {
            try {
                this.method4486(UUID.fromString(name));
                this.method4481(true);
            }
            catch (final Throwable t) {
                this.method4481(false);
            }
        }
        if (this.field4245 != null) {
            this.field4245.method11058(class51.getBoolean("Sitting"));
        }
        this.method4484(class51.getBoolean("Sitting"));
    }
    
    @Override
    public boolean method4204(final PlayerEntity playerEntity) {
        return !this.method4205();
    }
    
    public void method4479(final boolean b) {
        Class6908 class6908 = Class8432.field34627;
        if (!b) {
            class6908 = Class8432.field34639;
        }
        for (int i = 0; i < 7; ++i) {
            this.world.method6709(class6908, this.method1940(1.0), this.method1943() + 0.5, this.method1947(1.0), this.rand.nextGaussian() * 0.02, this.rand.nextGaussian() * 0.02, this.rand.nextGaussian() * 0.02);
        }
    }
    
    @Override
    public void method1798(final byte b) {
        if (b != 7) {
            if (b != 6) {
                super.method1798(b);
            }
            else {
                this.method4479(false);
            }
        }
        else {
            this.method4479(true);
        }
    }
    
    public boolean method4480() {
        return (this.dataManager.get(Class794.field4243) & 0x4) != 0x0;
    }
    
    public void method4481(final boolean b) {
        final byte byteValue = this.dataManager.get(Class794.field4243);
        if (!b) {
            this.dataManager.set(Class794.field4243, (byte)(byteValue & 0xFFFFFFFB));
        }
        else {
            this.dataManager.set(Class794.field4243, (byte)(byteValue | 0x4));
        }
        this.method4482();
    }
    
    public void method4482() {
    }
    
    public boolean method4483() {
        return (this.dataManager.get(Class794.field4243) & 0x1) != 0x0;
    }
    
    public void method4484(final boolean b) {
        final byte byteValue = this.dataManager.get(Class794.field4243);
        if (!b) {
            this.dataManager.set(Class794.field4243, (byte)(byteValue & 0xFFFFFFFE));
        }
        else {
            this.dataManager.set(Class794.field4243, (byte)(byteValue | 0x1));
        }
    }
    
    @Nullable
    public UUID method4485() {
        return this.dataManager.get(Class794.field4244).orElse(null);
    }
    
    public void method4486(final UUID value) {
        this.dataManager.set(Class794.field4244, Optional.ofNullable(value));
    }
    
    public void method4487(final PlayerEntity playerEntity) {
        this.method4481(true);
        this.method4486(playerEntity.getUniqueID());
        if (playerEntity instanceof Class513) {
            Class7770.field31798.method13773((Class513) playerEntity, this);
        }
    }
    
    @Nullable
    public LivingEntity method4488() {
        try {
            final UUID method4485 = this.method4485();
            return (method4485 == null) ? null : this.world.method7143(method4485);
        }
        catch (final IllegalArgumentException ex) {
            return null;
        }
    }
    
    @Override
    public boolean method2646(final LivingEntity class511) {
        return !this.method4489(class511) && super.method2646(class511);
    }
    
    public boolean method4489(final LivingEntity class511) {
        return class511 == this.method4488();
    }
    
    public Class3495 method4490() {
        return this.field4245;
    }
    
    public boolean method4491(final LivingEntity class511, final LivingEntity class512) {
        return true;
    }
    
    @Override
    public Team getTeam() {
        if (this.method4480()) {
            final LivingEntity method4488 = this.method4488();
            if (method4488 != null) {
                return method4488.getTeam();
            }
        }
        return super.getTeam();
    }
    
    @Override
    public boolean method1826(final Entity class399) {
        if (this.method4480()) {
            final LivingEntity method4488 = this.method4488();
            if (class399 == method4488) {
                return true;
            }
            if (method4488 != null) {
                return method4488.method1826(class399);
            }
        }
        return super.method1826(class399);
    }
    
    @Override
    public void method2673(final DamageSource class7929) {
        if (!this.world.isRemote) {
            if (this.world.method6765().method31216(Class8878.field37326)) {
                if (this.method4488() instanceof Class513) {
                    this.method4488().sendMessage(this.method2699().method35595());
                }
            }
        }
        super.method2673(class7929);
    }
    
    static {
        field4243 = EntityDataManager.method33564(Class794.class, Class7709.field30653);
        field4244 = EntityDataManager.method33564(Class794.class, Class7709.field30667);
    }
}
