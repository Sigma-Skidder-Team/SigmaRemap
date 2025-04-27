// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.AbstractList;
import java.util.HashMap;

import com.google.common.collect.Maps;
import net.minecraft.client.renderer.Quaternion;
import net.minecraft.client.renderer.Vector3f;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

import javax.annotation.Nullable;

public class Class773 extends Class772 implements Class774, Class768
{
    private static final DataParameter<Boolean> field4166;
    private final Class443 field4167;
    
    public Class773(final EntityType<? extends Class773> class7499, final World class7500) {
        super(class7499, class7500);
        this.field4167 = new Class443(5);
    }
    
    @Override
    public void method4142() {
        super.method4142();
        this.field4114.method22062(0, new Class3490(this));
        this.field4114.method22062(2, new Class3459(this, this, 10.0f));
        this.field4114.method22062(3, new Class3595<Object>(this, 1.0, 8.0f));
        this.field4114.method22062(8, new Class3514(this, 0.6));
        this.field4114.method22062(9, new Class3628(this, PlayerEntity.class, 15.0f, 1.0f));
        this.field4114.method22062(10, new Class3628(this, Class759.class, 15.0f));
        this.field4115.method22062(1, new Class3547(this, new Class[] { Class776.class }).method11100(new Class[0]));
        this.field4115.method22062(2, new Class3555<Object>(this, PlayerEntity.class, true));
        this.field4115.method22062(3, new Class3555<Object>(this, Class819.class, false));
        this.field4115.method22062(3, new Class3555<Object>(this, Class786.class, true));
    }
    
    @Override
    public void method2621() {
        super.method2621();
        this.method2710(Class8107.field33408).method23941(0.3499999940395355);
        this.method2710(Class8107.field33405).method23941(24.0);
        this.method2710(Class8107.field33410).method23941(5.0);
        this.method2710(Class8107.field33406).method23941(32.0);
    }
    
    @Override
    public void method1649() {
        super.method1649();
        this.dataManager.register(Class773.field4166, false);
    }
    
    public boolean method4279() {
        return this.dataManager.get(Class773.field4166);
    }
    
    @Override
    public void method4280(final boolean b) {
        this.dataManager.set(Class773.field4166, b);
    }
    
    @Override
    public void method1761(final CompoundNBT class51) {
        super.method1761(class51);
        final ListNBT class52 = new ListNBT();
        for (int i = 0; i < this.field4167.getSizeInventory(); ++i) {
            final ItemStack method2157 = this.field4167.getStackInSlot(i);
            if (!method2157.method27620()) {
                class52.add(method2157.method27627(new CompoundNBT()));
            }
        }
        class51.put("Inventory", class52);
    }
    
    @Override
    public Class259 method4264() {
        if (this.method4279()) {
            return Class259.field1239;
        }
        if (!this.method4218(Items.field31611)) {
            return this.method4216() ? Class259.field1235 : Class259.field1241;
        }
        return Class259.field1238;
    }
    
    @Override
    public void method1760(final CompoundNBT class51) {
        super.method1760(class51);
        final ListNBT method328 = class51.getList("Inventory", 10);
        for (int i = 0; i < method328.size(); ++i) {
            final ItemStack method329 = ItemStack.method27619(method328.method346(i));
            if (!method329.method27620()) {
                this.field4167.method2258(method329);
            }
        }
        this.method4193(true);
    }
    
    @Override
    public float method4228(final BlockPos class354, final Class1852 class355) {
        final Block method21696 = class355.getBlockState(class354.method1139()).getBlock();
        return (method21696 != Blocks.GRASS_BLOCK && method21696 != Blocks.field29175) ? (0.5f - class355.method6963(class354)) : 10.0f;
    }
    
    @Override
    public int method4181() {
        return 1;
    }
    
    @Nullable
    @Override
    public Class5496 method4188(final Class1851 class1851, final Class9592 class1852, final Class2101 class1853, final Class5496 class1854, final CompoundNBT class1855) {
        this.method4184(class1852);
        this.method4187(class1852);
        return super.method4188(class1851, class1852, class1853, class1854, class1855);
    }
    
    @Override
    public void method4184(final Class9592 class9592) {
        final ItemStack class9593 = new ItemStack(Items.field31611);
        if (this.rand.nextInt(300) == 0) {
            final HashMap hashMap = Maps.newHashMap();
            hashMap.put(Class7882.field32381, 1);
            Class8742.method30198(hashMap, class9593);
        }
        this.method1803(Class2215.field13600, class9593);
    }
    
    @Override
    public boolean method1826(final Entity class399) {
        return super.method1826(class399) || (class399 instanceof LivingEntity && ((LivingEntity)class399).method2712() == Class6363.field25463 && this.getTeam() == null && class399.getTeam() == null);
    }
    
    @Override
    public Class7795 method4160() {
        return Class8520.field35465;
    }
    
    @Override
    public Class7795 method2684() {
        return Class8520.field35467;
    }
    
    @Override
    public Class7795 method2683(final DamageSource class7929) {
        return Class8520.field35468;
    }
    
    @Override
    public void method4252(final LivingEntity class511, final float n) {
        final Class316 method23100 = Class7476.method23100(this, Items.field31611);
        final ItemStack method23101 = this.method2715(method23100);
        if (this.method4218(Items.field31611)) {
            Class4086.method12304(this.world, this, method23100, method23101, 1.6f, (float)(14 - this.world.method6954().method8235() * 4));
        }
        this.field2959 = 0;
    }
    
    @Override
    public void method4281(final LivingEntity class511, final ItemStack class512, final Class401 class513, final float n) {
        final Entity class514 = (Entity)class513;
        final double n2 = class511.getPosX() - this.getPosX();
        final double n3 = class511.getPosZ() - this.getPosZ();
        final Vector3f method4282 = this.method4282(new Vec3d(n2, class511.method1942(0.3333333333333333) - class514.getPosY() + MathHelper.sqrt(n2 * n2 + n3 * n3) * 0.20000000298023224, n3), n);
        class513.method1958(method4282.getX(), method4282.getY(), method4282.getZ(), 1.6f, (float)(14 - this.world.method6954().method8235() * 4));
        this.method1695(Class8520.field35112, 1.0f, 1.0f / (this.method2633().nextFloat() * 0.4f + 0.8f));
    }
    
    private Vector3f method4282(final Vec3d class5487, final float n) {
        final Vec3d method16738 = class5487.normalize();
        Vec3d class5488 = method16738.crossProduct(new Vec3d(0.0, 1.0, 0.0));
        if (class5488.lengthSquared() <= 1.0E-7) {
            class5488 = method16738.crossProduct(this.method1745(1.0f));
        }
        final Quaternion class5489 = new Quaternion(new Vector3f(class5488), 90.0f, true);
        final Vector3f class5490 = new Vector3f(method16738);
        class5490.transform(class5489);
        final Quaternion class5491 = new Quaternion(class5490, n, true);
        final Vector3f class5492 = new Vector3f(method16738);
        class5492.transform(class5491);
        return class5492;
    }
    
    @Override
    public void method4165(final Class427 class427) {
        final ItemStack method2107 = class427.method2107();
        if (!(method2107.getItem() instanceof Class4044)) {
            if (this.method4283(method2107.getItem())) {
                final ItemStack method2108 = this.field4167.method2258(method2107);
                if (!method2108.method27620()) {
                    method2107.method27691(method2108.method27690());
                }
                else {
                    class427.method1652();
                }
            }
        }
        else {
            super.method4165(class427);
        }
    }
    
    private boolean method4283(final Item class3820) {
        return this.method4293() && class3820 == Items.field31556;
    }
    
    @Override
    public boolean method1893(final int n, final ItemStack class8321) {
        if (super.method1893(n, class8321)) {
            return true;
        }
        final int n2 = n - 300;
        if (n2 >= 0 && n2 < this.field4167.getSizeInventory()) {
            this.field4167.method2160(n2, class8321);
            return true;
        }
        return false;
    }
    
    @Override
    public void method4263(final int n, final boolean b) {
        final Class8792 method4292 = this.method4292();
        if (this.rand.nextFloat() <= method4292.method30666()) {
            final ItemStack class8321 = new ItemStack(Items.field31611);
            final HashMap hashMap = Maps.newHashMap();
            if (n <= method4292.method30665(Class2113.field12292)) {
                if (n > method4292.method30665(Class2113.field12291)) {
                    hashMap.put(Class7882.field32380, 1);
                }
            }
            else {
                hashMap.put(Class7882.field32380, 2);
            }
            hashMap.put(Class7882.field32379, 1);
            Class8742.method30198(hashMap, class8321);
            this.method1803(Class2215.field13600, class8321);
        }
    }
    
    @Override
    public Class7795 method4260() {
        return Class8520.field35466;
    }
    
    static {
        field4166 = EntityDataManager.method33564(Class773.class, Class7709.field30661);
    }
}
