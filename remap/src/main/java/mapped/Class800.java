// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.Maps;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntitySize;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.Pose;
import net.minecraft.item.ItemStack;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.Map;

public class Class800 extends Class794
{
    private static final Ingredient field4285;
    private static final DataParameter<Integer> field4286;
    private static final DataParameter<Boolean> field4287;
    private static final DataParameter<Boolean> field4288;
    private static final DataParameter<Integer> field4289;
    public static final Map<Integer, ResourceLocation> field4290;
    private Class3451<PlayerEntity> field4291;
    private Class3472 field4292;
    private float field4293;
    private float field4294;
    private float field4295;
    private float field4296;
    private float field4297;
    private float field4298;
    
    public Class800(final EntityType<? extends Class800> class7499, final World class7500) {
        super(class7499, class7500);
    }
    
    public ResourceLocation method4606() {
        return Class800.field4290.getOrDefault(this.method4607(), Class800.field4290.get(0));
    }
    
    @Override
    public void method4142() {
        this.field4245 = new Class3495(this);
        this.field4292 = new Class3473(this, 0.6, Class800.field4285, true);
        this.field4114.method22062(1, new Class3490(this));
        this.field4114.method22062(1, new Class3523(this));
        this.field4114.method22062(2, this.field4245);
        this.field4114.method22062(3, this.field4292);
        this.field4114.method22062(5, new Class3481(this, 1.1, 8));
        this.field4114.method22062(6, new Class3528(this, 1.0, 10.0f, 5.0f, false));
        this.field4114.method22062(7, new Class3487(this, 0.8));
        this.field4114.method22062(8, new Class3526(this, 0.3f));
        this.field4114.method22062(9, new Class3475(this));
        this.field4114.method22062(10, new Class3587(this, 0.8));
        this.field4114.method22062(11, new Class3517(this, 0.8, 1.0000001E-5f));
        this.field4114.method22062(12, new Class3628(this, PlayerEntity.class, 10.0f));
        this.field4115.method22062(1, new Class3560<Object>(this, Class792.class, false, null));
        this.field4115.method22062(1, new Class3560<Object>(this, Class793.class, false, Class793.field4242));
    }
    
    public int method4607() {
        return this.dataManager.get(Class800.field4286);
    }
    
    public void method4608(int nextInt) {
        if (nextInt < 0 || nextInt >= 11) {
            nextInt = this.rand.nextInt(10);
        }
        this.dataManager.set(Class800.field4286, nextInt);
    }
    
    public void method4609(final boolean b) {
        this.dataManager.set(Class800.field4287, b);
    }
    
    public boolean method4610() {
        return this.dataManager.get(Class800.field4287);
    }
    
    public void method4611(final boolean b) {
        this.dataManager.set(Class800.field4288, b);
    }
    
    public boolean method4612() {
        return this.dataManager.get(Class800.field4288);
    }
    
    public Class181 method4613() {
        return Class181.method819(this.dataManager.get(Class800.field4289));
    }
    
    public void method4614(final Class181 class181) {
        this.dataManager.set(Class800.field4289, class181.method813());
    }
    
    @Override
    public void method1649() {
        super.method1649();
        this.dataManager.register(Class800.field4286, 1);
        this.dataManager.register(Class800.field4287, false);
        this.dataManager.register(Class800.field4288, false);
        this.dataManager.register(Class800.field4289, Class181.field551.method813());
    }
    
    @Override
    public void method1761(final CompoundNBT class51) {
        super.method1761(class51);
        class51.putInt("CatType", this.method4607());
        class51.putByte("CollarColor", (byte)this.method4613().method813());
    }
    
    @Override
    public void method1760(final CompoundNBT class51) {
        super.method1760(class51);
        this.method4608(class51.getInt("CatType"));
        if (class51.contains("CollarColor", 99)) {
            this.method4614(Class181.method819(class51.getInt("CollarColor")));
        }
    }
    
    @Override
    public void method4172() {
        if (!this.method4148().method19905()) {
            this.method1653(Pose.field1663);
            this.method1816(false);
        }
        else {
            final double method19906 = this.method4148().method19906();
            if (method19906 != 0.6) {
                if (method19906 != 1.33) {
                    this.method1653(Pose.field1663);
                    this.method1816(false);
                }
                else {
                    this.method1653(Pose.field1663);
                    this.method1816(true);
                }
            }
            else {
                this.method1653(Pose.field1668);
                this.method1816(false);
            }
        }
    }
    
    @Nullable
    @Override
    public Class7795 method4160() {
        if (!this.method4480()) {
            return Class8520.field35057;
        }
        if (!this.method4363()) {
            return (this.rand.nextInt(4) != 0) ? Class8520.field35056 : Class8520.field35064;
        }
        return Class8520.field35063;
    }
    
    @Override
    public int method4155() {
        return 120;
    }
    
    public void method4615() {
        this.method1695(Class8520.field35060, this.method2720(), this.method2721());
    }
    
    @Override
    public Class7795 method2683(final DamageSource class7929) {
        return Class8520.field35062;
    }
    
    @Override
    public Class7795 method2684() {
        return Class8520.field35058;
    }
    
    @Override
    public void method2621() {
        super.method2621();
        this.method2710(Class8107.field33405).method23941(10.0);
        this.method2710(Class8107.field33408).method23941(0.30000001192092896);
        this.method2711().method20873(Class8107.field33410).method23941(3.0);
    }
    
    @Override
    public boolean method1705(final float n, final float n2) {
        return false;
    }
    
    @Override
    public void method4358(final PlayerEntity playerEntity, final ItemStack class513) {
        if (this.method4357(class513)) {
            this.method1695(Class8520.field35059, 1.0f, 1.0f);
        }
        super.method4358(playerEntity, class513);
    }
    
    private float method4616() {
        return (float)this.method2710(Class8107.field33410).method23950();
    }
    
    @Override
    public boolean method2734(final Entity class399) {
        return class399.attackEntityFrom(DamageSource.method25693(this), this.method4616());
    }
    
    @Override
    public void method1659() {
        super.method1659();
        if (this.field4292 != null) {
            if (this.field4292.method11040()) {
                if (!this.method4480()) {
                    if (this.ticksExisted % 100 == 0) {
                        this.method1695(Class8520.field35061, 1.0f, 1.0f);
                    }
                }
            }
        }
        this.method4617();
    }
    
    private void method4617() {
        if (this.method4610() || this.method4612()) {
            if (this.ticksExisted % 5 == 0) {
                this.method1695(Class8520.field35063, 0.6f + 0.4f * (this.rand.nextFloat() - this.rand.nextFloat()), 1.0f);
            }
        }
        this.method4618();
        this.method4619();
    }
    
    private void method4618() {
        this.field4294 = this.field4293;
        this.field4296 = this.field4295;
        if (!this.method4610()) {
            this.field4293 = Math.max(0.0f, this.field4293 - 0.22f);
            this.field4295 = Math.max(0.0f, this.field4295 - 0.13f);
        }
        else {
            this.field4293 = Math.min(1.0f, this.field4293 + 0.15f);
            this.field4295 = Math.min(1.0f, this.field4295 + 0.08f);
        }
    }
    
    private void method4619() {
        this.field4298 = this.field4297;
        if (!this.method4612()) {
            this.field4297 = Math.max(0.0f, this.field4297 - 0.13f);
        }
        else {
            this.field4297 = Math.min(1.0f, this.field4297 + 0.1f);
        }
    }
    
    public float method4620(final float n) {
        return MathHelper.method35700(n, this.field4294, this.field4293);
    }
    
    public float method4621(final float n) {
        return MathHelper.method35700(n, this.field4296, this.field4295);
    }
    
    public float method4622(final float n) {
        return MathHelper.method35700(n, this.field4298, this.field4297);
    }
    
    public Class800 method4623(final Class788 class788) {
        final Class800 class789 = EntityType.field28964.method23371(this.world);
        if (class788 instanceof Class800) {
            if (!this.rand.nextBoolean()) {
                class789.method4608(((Class800)class788).method4607());
            }
            else {
                class789.method4608(this.method4607());
            }
            if (this.method4480()) {
                class789.method4486(this.method4485());
                class789.method4481(true);
                if (!this.rand.nextBoolean()) {
                    class789.method4614(((Class800)class788).method4613());
                }
                else {
                    class789.method4614(this.method4613());
                }
            }
        }
        return class789;
    }
    
    @Override
    public boolean method4365(final Class789 class789) {
        return this.method4480() && class789 instanceof Class800 && ((Class800)class789).method4480() && super.method4365(class789);
    }
    
    @Nullable
    @Override
    public ILivingEntityData method4188(final Class1851 class1851, final Class9592 class1852, final Class2101 class1853, ILivingEntityData method4188, final CompoundNBT class1854) {
        method4188 = super.method4188(class1851, class1852, class1853, method4188, class1854);
        if (class1851.method6951() <= 0.9f) {
            this.method4608(this.rand.nextInt(10));
        }
        else {
            this.method4608(this.rand.nextInt(11));
        }
        if (Class4535.field19965.method13590(class1851, new BlockPos(this))) {
            this.method4608(10);
            this.method4190();
        }
        return method4188;
    }
    
    @Override
    public boolean method4195(final PlayerEntity playerEntity, final Class316 class513) {
        final ItemStack method2715 = playerEntity.method2715(class513);
        final Item method2716 = method2715.getItem();
        if (method2715.getItem() instanceof Class3831) {
            return super.method4195(playerEntity, class513);
        }
        if (!this.world.isRemote) {
            if (!this.method4480()) {
                if (this.method4357(method2715)) {
                    this.method4358(playerEntity, method2715);
                    if (this.rand.nextInt(3) != 0) {
                        this.world.method6761(this, (byte)6);
                    }
                    else {
                        this.method4487(playerEntity);
                        this.field4245.method11058(true);
                        this.world.method6761(this, (byte)7);
                    }
                    this.method4190();
                    return true;
                }
            }
            else if (this.method4489(playerEntity)) {
                if (!(method2716 instanceof Class3829)) {
                    if (method2716.method11743()) {
                        if (this.method4357(method2715)) {
                            if (this.method2664() < this.method2701()) {
                                this.method4358(playerEntity, method2715);
                                this.method2663((float)method2716.method11744().method32744());
                                return true;
                            }
                        }
                    }
                    final boolean method2717 = super.method4195(playerEntity, class513);
                    if (!method2717 || this.method2625()) {
                        this.field4245.method11058(!this.method4483());
                    }
                    return method2717;
                }
                final Class181 method2718 = ((Class3829)method2716).method11767();
                if (method2718 != this.method4613()) {
                    this.method4614(method2718);
                    if (!playerEntity.field3025.field27304) {
                        method2715.method27693(1);
                    }
                    this.method4190();
                    return true;
                }
            }
            final boolean method2719 = super.method4195(playerEntity, class513);
            if (method2719) {
                this.method4190();
            }
            return method2719;
        }
        return (this.method4480() && this.method4489(playerEntity)) || this.method4357(method2715);
    }
    
    @Override
    public boolean method4357(final ItemStack class8321) {
        return Class800.field4285.test(class8321);
    }
    
    @Override
    public float method2789(final Pose class290, final EntitySize class291) {
        return class291.field34098 * 0.5f;
    }
    
    @Override
    public boolean method4168(final double n) {
        return !this.method4480() && this.ticksExisted > 2400;
    }
    
    @Override
    public void method4482() {
        if (this.field4291 == null) {
            this.field4291 = new Class3451<PlayerEntity>(this, PlayerEntity.class, 16.0f, 0.8, 1.33);
        }
        this.field4114.method22063(this.field4291);
        if (!this.method4480()) {
            this.field4114.method22062(4, this.field4291);
        }
    }
    
    static {
        field4285 = Ingredient.method618(Items.field31379, Items.field31380);
        field4286 = EntityDataManager.method33564(Class800.class, Class7709.field30654);
        field4287 = EntityDataManager.method33564(Class800.class, Class7709.field30661);
        field4288 = EntityDataManager.method33564(Class800.class, Class7709.field30661);
        field4289 = EntityDataManager.method33564(Class800.class, Class7709.field30654);
        field4290 = Util.method27851(Maps.newHashMap(), hashMap -> {
            hashMap.put(0, new ResourceLocation("textures/entity/cat/tabby.png"));
            hashMap.put(1, new ResourceLocation("textures/entity/cat/black.png"));
            hashMap.put(2, new ResourceLocation("textures/entity/cat/red.png"));
            hashMap.put(3, new ResourceLocation("textures/entity/cat/siamese.png"));
            hashMap.put(4, new ResourceLocation("textures/entity/cat/british_shorthair.png"));
            hashMap.put(5, new ResourceLocation("textures/entity/cat/calico.png"));
            hashMap.put(6, new ResourceLocation("textures/entity/cat/persian.png"));
            hashMap.put(7, new ResourceLocation("textures/entity/cat/ragdoll.png"));
            hashMap.put(8, new ResourceLocation("textures/entity/cat/white.png"));
            hashMap.put(9, new ResourceLocation("textures/entity/cat/jellie.png"));
            hashMap.put(10, new ResourceLocation("textures/entity/cat/all_black.png"));
        });
    }
}
