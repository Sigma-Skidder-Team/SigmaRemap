// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.Random;
import java.util.UUID;

public class Class828 extends Class827
{
    private static final UUID field4434;
    private static final Class7919 field4435;
    private int field4436;
    private int field4437;
    private UUID field4438;
    
    public Class828(final EntityType<? extends Class828> class7499, final World class7500) {
        super(class7499, class7500);
        this.method4145(Class257.field1210, 8.0f);
    }
    
    @Override
    public void method2636(final LivingEntity class511) {
        super.method2636(class511);
        if (class511 != null) {
            this.field4438 = class511.getUniqueID();
        }
    }
    
    @Override
    public void method4157() {
        this.field4114.method22062(2, new Class3583(this, 1.0, false));
        this.field4114.method22062(7, new Class3517(this, 1.0));
        this.field4115.method22062(1, new Class3549(this));
        this.field4115.method22062(2, new Class3561(this));
    }
    
    @Override
    public void method2621() {
        super.method2621();
        this.method2710(Class828.field4423).method23941(0.0);
        this.method2710(Class8107.field33408).method23941(0.23000000417232513);
        this.method2710(Class8107.field33410).method23941(5.0);
    }
    
    @Override
    public boolean method4912() {
        return false;
    }
    
    @Override
    public void method4172() {
        final Class7619 method2710 = this.method2710(Class8107.field33408);
        final LivingEntity method2711 = this.method2634();
        if (!this.method4938()) {
            if (method2710.method23944(Class828.field4435)) {
                method2710.method23947(Class828.field4435);
            }
        }
        else {
            if (!this.method2625()) {
                if (!method2710.method23944(Class828.field4435)) {
                    method2710.method23946(Class828.field4435);
                }
            }
            --this.field4436;
            final LivingEntity class511 = (method2711 == null) ? this.method4152() : method2711;
            if (!this.method4938()) {
                if (class511 != null) {
                    if (this.method2747(class511)) {
                        this.field4436 = this.method4937();
                    }
                    else {
                        this.method2636(null);
                        this.method4153(null);
                    }
                }
            }
        }
        if (this.field4437 > 0) {
            if (--this.field4437 == 0) {
                this.method1695(Class8520.field35764, this.method2720() * 2.0f, ((this.rand.nextFloat() - this.rand.nextFloat()) * 0.2f + 1.0f) * 1.8f);
            }
        }
        if (this.method4938()) {
            if (this.field4438 != null) {
                if (method2711 == null) {
                    final PlayerEntity method2712 = this.world.getPlayerByUuid(this.field4438);
                    this.method2636(method2712);
                    this.field2956 = method2712;
                    this.field2957 = this.method2635();
                }
            }
        }
        super.method4172();
    }
    
    public static boolean method4935(final EntityType<Class828> class7499, final Class1851 class7500, final Class2101 class7501, final BlockPos class7502, final Random random) {
        return class7500.method6954() != Class2113.field12290;
    }
    
    @Override
    public boolean method4180(final Class1852 class1852) {
        return class1852.method6975(this) && !class1852.method6968(this.getBoundingBox());
    }
    
    @Override
    public void method1761(final CompoundNBT class51) {
        super.method1761(class51);
        class51.putShort("Anger", (short)this.field4436);
        if (this.field4438 == null) {
            class51.putString("HurtBy", "");
        }
        else {
            class51.putString("HurtBy", this.field4438.toString());
        }
    }
    
    @Override
    public void method1760(final CompoundNBT class51) {
        super.method1760(class51);
        this.field4436 = class51.getShort("Anger");
        final String method323 = class51.getString("HurtBy");
        if (!method323.isEmpty()) {
            this.field4438 = UUID.fromString(method323);
            final PlayerEntity method324 = this.world.getPlayerByUuid(this.field4438);
            this.method2636(method324);
            if (method324 != null) {
                this.field2956 = method324;
                this.field2957 = this.method2635();
            }
        }
    }
    
    @Override
    public boolean attackEntityFrom(final DamageSource class7929, final float n) {
        if (!this.method1849(class7929)) {
            final Entity method25714 = class7929.method25714();
            if (method25714 instanceof PlayerEntity) {
                if (!((PlayerEntity)method25714).method2889()) {
                    if (this.method2747(method25714)) {
                        this.method4936((LivingEntity)method25714);
                    }
                }
            }
            return super.attackEntityFrom(class7929, n);
        }
        return false;
    }
    
    private boolean method4936(final LivingEntity class511) {
        this.field4436 = this.method4937();
        this.field4437 = this.rand.nextInt(40);
        this.method2636(class511);
        return true;
    }
    
    private int method4937() {
        return 400 + this.rand.nextInt(400);
    }
    
    private boolean method4938() {
        return this.field4436 > 0;
    }
    
    @Override
    public Class7795 method4160() {
        return Class8520.field35763;
    }
    
    @Override
    public Class7795 method2683(final DamageSource class7929) {
        return Class8520.field35766;
    }
    
    @Override
    public Class7795 method2684() {
        return Class8520.field35765;
    }
    
    @Override
    public void method4184(final Class9592 class9592) {
        this.method1803(Class2215.field13600, new ItemStack(Items.field31302));
    }
    
    @Override
    public ItemStack method4918() {
        return ItemStack.EMPTY;
    }
    
    @Override
    public boolean method4232(final PlayerEntity playerEntity) {
        return this.method4938();
    }
    
    static {
        field4434 = UUID.fromString("49455A49-7EC5-45BA-B886-3B90B23A1718");
        field4435 = new Class7919(Class828.field4434, "Attacking speed boost", 0.05, Class2157.field12809).method25640(false);
    }
}
