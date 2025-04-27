// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.ImmutableMap;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import java.util.Optional;
import java.util.List;
import javax.annotation.Nullable;
import java.util.Iterator;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Collection;
import com.mojang.datafixers.types.DynamicOps;
import com.mojang.datafixers.Dynamic;
import java.util.function.BiPredicate;
import com.google.common.collect.ImmutableList;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.LightningBoltEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.INBT;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.world.World;

import java.util.Set;
import java.util.Map;

public class Class824 extends Class819 implements Class831, Class825
{
    private static final DataParameter<Class8562> field4399;
    public static final Map<Item, Integer> field4400;
    private static final Set<Item> field4401;
    private int field4402;
    private boolean field4403;
    private PlayerEntity field4404;
    private byte field4405;
    private final Class9470 field4406;
    private long field4407;
    private long field4408;
    private int field4409;
    private long field4410;
    private int field4411;
    private long field4412;
    private static final ImmutableList<Class8233<?>> field4413;
    private static final ImmutableList<Class8033<? extends Class6851<? super Class824>>> field4414;
    public static final Map<Class8233<Class363>, BiPredicate<Class824, Class8912>> field4415;
    
    public Class824(final EntityType<? extends Class824> class7499, final World class7500) {
        this(class7499, class7500, Class7611.field30165);
    }
    
    public Class824(final EntityType<? extends Class824> class7499, final World class7500, final Class7611 class7501) {
        super(class7499, class7500);
        this.field4406 = new Class9470();
        ((Class7747)this.method4150()).method24747(true);
        this.method4150().method24741(true);
        this.method4193(true);
        this.method4869(this.method4870().method28783(class7501).method28784(Class9334.field40060));
        this.field2996 = this.method2619((Dynamic<?>)new Dynamic(Class8453.field34721, new CompoundNBT()));
    }
    
    @Override
    public Class365<Class824> method2618() {
        return (Class365<Class824>)super.method2618();
    }
    
    @Override
    public Class365<?> method2619(final Dynamic<?> dynamic) {
        final Class365 class365 = new Class365(Class824.field4413, Class824.field4414, dynamic);
        this.method4857(class365);
        return class365;
    }
    
    public void method4856(final Class1849 class1849) {
        final Class365<Class824> method2618 = this.method2618();
        method2618.method1212(class1849, this);
        this.field2996 = method2618.method1210();
        this.method4857(this.method2618());
    }
    
    private void method4857(final Class365<Class824> class365) {
        final Class9334 method28781 = this.method4870().method28781();
        final float n = (float)this.method2710(Class8107.field33408).method23950();
        if (!this.method2625()) {
            class365.method1201(Class8771.field36875);
            class365.method1208(Class7635.field30228, Class8829.method30812(method28781, n), (Set)ImmutableSet.of((Object)Pair.of((Object)Class8233.field33801, (Object)Class1952.field10628)));
        }
        else {
            class365.method1201(Class8771.field36874);
            class365.method1207(Class7635.field30229, Class8829.method30813(n));
        }
        class365.method1207(Class7635.field30226, Class8829.method30811(method28781, n));
        class365.method1208(Class7635.field30231, Class8829.method30815(method28781, n), (Set)ImmutableSet.of((Object)Pair.of((Object)Class8233.field33802, (Object)Class1952.field10628)));
        class365.method1207(Class7635.field30230, Class8829.method30814(method28781, n));
        class365.method1207(Class7635.field30227, Class8829.method30816(method28781, n));
        class365.method1207(Class7635.field30232, Class8829.method30817(method28781, n));
        class365.method1207(Class7635.field30234, Class8829.method30818(method28781, n));
        class365.method1207(Class7635.field30233, Class8829.method30819(method28781, n));
        class365.method1207(Class7635.field30235, Class8829.method30820(method28781, n));
        class365.method1202((Set)ImmutableSet.of((Object)Class7635.field30226));
        class365.method1206(Class7635.field30227);
        class365.method1204(Class7635.field30227);
        class365.method1205(this.world.method6755(), this.world.method6754());
    }
    
    @Override
    public void method4355() {
        super.method4355();
        if (this.world instanceof Class1849) {
            this.method4856((Class1849)this.world);
        }
    }
    
    @Override
    public void method2621() {
        super.method2621();
        this.method2710(Class8107.field33408).method23941(0.5);
        this.method2710(Class8107.field33406).method23941(48.0);
    }
    
    @Override
    public void method4172() {
        this.world.method6796().startSection("brain");
        this.method2618().method1211((Class1849)this.world, this);
        this.world.method6796().endSection();
        if (!this.method4824()) {
            if (this.field4402 > 0) {
                --this.field4402;
                if (this.field4402 <= 0) {
                    if (this.field4403) {
                        this.method4881();
                        this.field4403 = false;
                    }
                    this.method2655(new Class1948(Class9439.field40483, 200, 0));
                }
            }
        }
        if (this.field4404 != null) {
            if (this.world instanceof Class1849) {
                ((Class1849)this.world).method6929(Class8156.field33594, this.field4404, this);
                this.world.method6761(this, (byte)14);
                this.field4404 = null;
            }
        }
        if (!this.method4214()) {
            if (this.rand.nextInt(100) == 0) {
                final Class8792 method6927 = ((Class1849)this.world).method6927(new BlockPos(this));
                if (method6927 != null) {
                    if (method6927.method30663()) {
                        if (!method6927.method30618()) {
                            this.world.method6761(this, (byte)42);
                        }
                    }
                }
            }
        }
        if (this.method4870().method28781() == Class9334.field40060) {
            if (this.method4824()) {
                this.method4835();
            }
        }
        super.method4172();
    }
    
    @Override
    public void method1659() {
        super.method1659();
        if (this.method4819() > 0) {
            this.method4820(this.method4819() - 1);
        }
        this.method4890();
    }
    
    @Override
    public boolean method4195(final PlayerEntity playerEntity, final Class316 class513) {
        final ItemStack method2715 = playerEntity.method2715(class513);
        if (method2715.getItem() != Items.field31552) {
            if (method2715.getItem() != Items.field31500) {
                if (this.isAlive()) {
                    if (!this.method4824()) {
                        if (!this.method2783()) {
                            if (this.method2625()) {
                                this.method4858();
                                return super.method4195(playerEntity, class513);
                            }
                            final boolean empty = this.method4825().isEmpty();
                            if (class513 == Class316.field1877) {
                                if (empty) {
                                    if (!this.world.isRemote) {
                                        this.method4858();
                                    }
                                }
                                playerEntity.method2857(Class8276.field34021);
                            }
                            if (!empty) {
                                if (!this.world.isRemote) {
                                    if (!this.field4390.isEmpty()) {
                                        this.method4859(playerEntity);
                                    }
                                }
                                return true;
                            }
                            return super.method4195(playerEntity, class513);
                        }
                    }
                }
            }
            return super.method4195(playerEntity, class513);
        }
        method2715.method27640(playerEntity, this, class513);
        return true;
    }
    
    private void method4858() {
        this.method4820(40);
        if (!this.world.isRemote()) {
            this.method1695(Class8520.field35679, this.method2720(), this.method2721());
        }
    }
    
    private void method4859(final PlayerEntity playerEntity) {
        this.method4867(playerEntity);
        this.method4822(playerEntity);
        this.method4854(playerEntity, this.getDisplayName(), this.method4870().method28782());
    }
    
    @Override
    public void method4822(final PlayerEntity playerEntity) {
        final boolean b = this.method4823() != null && playerEntity == null;
        super.method4822(playerEntity);
        if (b) {
            this.method4835();
        }
    }
    
    @Override
    public void method4835() {
        super.method4835();
        this.method4860();
    }
    
    private void method4860() {
        final Iterator<Class9017> iterator = this.method4825().iterator();
        while (iterator.hasNext()) {
            iterator.next().method32292();
        }
    }
    
    @Override
    public boolean method4853() {
        return true;
    }
    
    public void method4861() {
        this.method4866();
        final Iterator<Class9017> iterator = this.method4825().iterator();
        while (iterator.hasNext()) {
            iterator.next().method32287();
        }
        if (this.method4870().method28781() == Class9334.field40065) {
            this.method4887();
        }
        this.field4410 = this.world.method6754();
        ++this.field4411;
    }
    
    private boolean method4862() {
        final Iterator<Class9017> iterator = this.method4825().iterator();
        while (iterator.hasNext()) {
            if (!iterator.next().method32299()) {
                continue;
            }
            return true;
        }
        return false;
    }
    
    private boolean method4863() {
        return this.field4411 == 0 || (this.field4411 < 2 && this.world.method6754() > this.field4410 + 2400L);
    }
    
    public boolean method4864() {
        final long n = this.field4410 + 12000L;
        final long method6754 = this.world.method6754();
        boolean b = method6754 > n;
        final long method6755 = this.world.method6755();
        if (this.field4412 > 0L) {
            b |= (method6755 / 24000L > this.field4412 / 24000L);
        }
        this.field4412 = method6755;
        if (b) {
            this.field4410 = method6754;
            this.method4898();
        }
        return this.method4863() && this.method4862();
    }
    
    private void method4865() {
        final int n = 2 - this.field4411;
        if (n > 0) {
            final Iterator<Class9017> iterator = this.method4825().iterator();
            while (iterator.hasNext()) {
                iterator.next().method32287();
            }
        }
        for (int i = 0; i < n; ++i) {
            this.method4866();
        }
    }
    
    private void method4866() {
        final Iterator<Class9017> iterator = this.method4825().iterator();
        while (iterator.hasNext()) {
            iterator.next().method32284();
        }
    }
    
    private void method4867(final PlayerEntity playerEntity) {
        final int method4876 = this.method4876(playerEntity);
        if (method4876 != 0) {
            for (final Class9017 class513 : this.method4825()) {
                class513.method32291(-MathHelper.method35642(method4876 * class513.method32295()));
            }
        }
        if (playerEntity.method2653(Class9439.field40505)) {
            final int method4877 = playerEntity.method2654(Class9439.field40505).method7908();
            for (final Class9017 class514 : this.method4825()) {
                class514.method32291(-Math.max((int)Math.floor((0.3 + 0.0625 * method4877) * class514.method32280().method27690()), 1));
            }
        }
    }
    
    @Override
    public void method1649() {
        super.method1649();
        this.dataManager.register(Class824.field4399, new Class8562(Class7611.field30165, Class9334.field40060, 1));
    }
    
    @Override
    public void method1761(final CompoundNBT class51) {
        super.method1761(class51);
        class51.put("VillagerData", this.method4870().method28786(Class8453.field34721));
        class51.putByte("FoodLevel", this.field4405);
        class51.put("Gossips", (INBT)this.field4406.method35243((com.mojang.datafixers.types.DynamicOps<Object>)Class8453.field34721).getValue());
        class51.putInt("Xp", this.field4409);
        class51.putLong("LastRestock", this.field4410);
        class51.putLong("LastGossipDecay", this.field4408);
        class51.putInt("RestocksToday", this.field4411);
    }
    
    @Override
    public void method1760(final CompoundNBT class51) {
        super.method1760(class51);
        if (class51.contains("VillagerData", 10)) {
            this.method4869(new Class8562((Dynamic<?>)new Dynamic(Class8453.field34721, class51.get("VillagerData"))));
        }
        if (class51.contains("Offers", 10)) {
            this.field4390 = new Class57(class51.getCompound("Offers"));
        }
        if (class51.contains("FoodLevel", 1)) {
            this.field4405 = class51.getByte("FoodLevel");
        }
        this.field4406.method35244((Dynamic<?>)new Dynamic(Class8453.field34721, class51.getList("Gossips", 10)));
        if (class51.contains("Xp", 3)) {
            this.field4409 = class51.getInt("Xp");
        }
        this.field4410 = class51.getLong("LastRestock");
        this.field4408 = class51.getLong("LastGossipDecay");
        this.method4193(true);
        if (this.world instanceof Class1849) {
            this.method4856((Class1849)this.world);
        }
        this.field4411 = class51.getInt("RestocksToday");
    }
    
    @Override
    public boolean method4168(final double n) {
        return false;
    }
    
    @Nullable
    @Override
    public Class7795 method4160() {
        if (!this.method2783()) {
            return this.method4824() ? Class8520.field35680 : Class8520.field35675;
        }
        return null;
    }
    
    @Override
    public Class7795 method2683(final DamageSource class7929) {
        return Class8520.field35678;
    }
    
    @Override
    public Class7795 method2684() {
        return Class8520.field35677;
    }
    
    public void method4868() {
        final Class7795 method34578 = this.method4870().method28781().method34578();
        if (method34578 != null) {
            this.method1695(method34578, this.method2720(), this.method2721());
        }
    }
    
    public void method4869(final Class8562 class8562) {
        if (this.method4870().method28781() != class8562.method28781()) {
            this.field4390 = null;
        }
        this.dataManager.set(Class824.field4399, class8562);
    }
    
    @Override
    public Class8562 method4870() {
        return this.dataManager.get(Class824.field4399);
    }
    
    @Override
    public void method4829(final Class9017 class9017) {
        int n = 3 + this.rand.nextInt(4);
        this.field4409 += class9017.method32296();
        this.field4404 = this.method4823();
        if (this.method4880()) {
            this.field4402 = 40;
            this.field4403 = true;
            n += 5;
        }
        if (class9017.method32300()) {
            this.world.method6886(new Class508(this.world, this.getPosX(), this.getPosY() + 0.5, this.getPosZ(), n));
        }
    }
    
    @Override
    public void method2636(final LivingEntity class511) {
        if (class511 != null) {
            if (this.world instanceof Class1849) {
                ((Class1849)this.world).method6929(Class8156.field33592, class511, this);
                if (this.isAlive()) {
                    if (class511 instanceof PlayerEntity) {
                        this.world.method6761(this, (byte)13);
                    }
                }
            }
        }
        super.method2636(class511);
    }
    
    @Override
    public void method2673(final DamageSource class7929) {
        Class824.LOGGER.info("Villager {} died, message: '{}'", this, class7929.method25690(this).getString());
        final Entity method25714 = class7929.method25714();
        if (method25714 != null) {
            this.method4871(method25714);
        }
        this.method4872(Class8233.field33800);
        this.method4872(Class8233.field33801);
        this.method4872(Class8233.field33802);
        super.method2673(class7929);
    }
    
    private void method4871(final Entity class399) {
        if (this.world instanceof Class1849) {
            final Optional<List<LivingEntity>> method1198 = this.field2996.method1198(Class8233.field33805);
            if (method1198.isPresent()) {
                method1198.get().stream().filter(class400 -> class400 instanceof Class831).forEach(class403 -> {
                    final Object o = this.world;
                    class401.method6929(Class8156.field33593, class402, (Class831)class403);
                });
            }
        }
    }
    
    public void method4872(final Class8233<Class363> class8233) {
        if (this.world instanceof Class1849) {
            this.field2996.method1198((Class8233<Object>)class8233).ifPresent(class8236 -> {
                ((Class1849)this.world).getServer();
                class8234.method1481(class8236.method1169());
                final Class1849 class8237;
                class8237.method6921();
                final Class1883 class8238;
                class8238.method7210(class8236.method1170());
                final BiPredicate biPredicate = Class824.field4415.get(class8235);
                final Optional optional;
                if (optional.isPresent()) {
                    if (biPredicate.test(this, optional.get())) {
                        class8238.method7208(class8236.method1170());
                        Class9324.method34534(class8237, class8236.method1170());
                    }
                }
            });
        }
    }
    
    public boolean method4873() {
        return this.field4405 + this.method4886() >= 12 && this.method4351() == 0;
    }
    
    private boolean method4874() {
        return this.field4405 < 12;
    }
    
    private void method4875() {
        if (this.method4874()) {
            if (this.method4886() != 0) {
                for (int i = 0; i < this.method4837().getSizeInventory(); ++i) {
                    final ItemStack method2157 = this.method4837().getStackInSlot(i);
                    if (!method2157.method27620()) {
                        final Integer n = Class824.field4400.get(method2157.getItem());
                        if (n != null) {
                            for (int j = method2157.method27690(); j > 0; --j) {
                                this.field4405 += (byte)(Object)n;
                                this.method4837().method2158(i, 1);
                                if (!this.method4874()) {
                                    return;
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    
    public int method4876(final PlayerEntity playerEntity) {
        return this.field4406.method35241(playerEntity.method1865(), p0 -> true);
    }
    
    private void method4877(final int n) {
        this.field4405 -= (byte)n;
    }
    
    public void method4878() {
        this.method4875();
        this.method4877(12);
    }
    
    public void method4879(final Class57 field4390) {
        this.field4390 = field4390;
    }
    
    private boolean method4880() {
        final int method28782 = this.method4870().method28782();
        return Class8562.method28789(method28782) && this.field4409 >= Class8562.method28788(method28782);
    }
    
    private void method4881() {
        this.method4869(this.method4870().method28785(this.method4870().method28782() + 1));
        this.method4839();
    }
    
    @Override
    public ITextComponent method1842() {
        return new Class2259(this.getType().method23366() + '.' + Registry.field240.getKey(this.method4870().method28781()).method7797());
    }
    
    @Override
    public void method1798(final byte b) {
        if (b != 12) {
            if (b != 13) {
                if (b != 14) {
                    if (b != 42) {
                        super.method1798(b);
                    }
                    else {
                        this.method4836(Class8432.field34646);
                    }
                }
                else {
                    this.method4836(Class8432.field34625);
                }
            }
            else {
                this.method4836(Class8432.field34598);
            }
        }
        else {
            this.method4836(Class8432.field34627);
        }
    }
    
    @Nullable
    @Override
    public Class5496 method4188(final Class1851 class1851, final Class9592 class1852, final Class2101 class1853, final Class5496 class1854, final CompoundNBT class1855) {
        if (class1853 == Class2101.field12178) {
            this.method4869(this.method4870().method28784(Class9334.field40060));
        }
        if (class1853 != Class2101.field12187) {
            if (class1853 != Class2101.field12186) {
                if (class1853 != Class2101.field12176) {
                    if (class1853 != Class2101.field12188) {
                        return super.method4188(class1851, class1852, class1853, class1854, class1855);
                    }
                }
            }
        }
        this.method4869(this.method4870().method28783(Class7611.method23913(class1851.method6959(new BlockPos(this)))));
        return super.method4188(class1851, class1852, class1853, class1854, class1855);
    }
    
    public Class824 method4882(final Class788 class788) {
        final double nextDouble = this.rand.nextDouble();
        Class7611 class789;
        if (nextDouble >= 0.5) {
            if (nextDouble >= 0.75) {
                class789 = ((Class824)class788).method4870().method28780();
            }
            else {
                class789 = this.method4870().method28780();
            }
        }
        else {
            class789 = Class7611.method23913(this.world.method6959(new BlockPos(this)));
        }
        final Class824 class790 = new Class824(EntityType.field29042, this.world, class789);
        class790.method4188(this.world, this.world.method6784(new BlockPos(class790)), Class2101.field12178, null, null);
        return class790;
    }
    
    @Override
    public void onStruckByLightning(final LightningBoltEntity class422) {
        final Class778 class423 = EntityType.field29047.method23371(this.world);
        class423.method1730(this.getPosX(), this.getPosY(), this.getPosZ(), this.rotationYaw, this.rotationPitch);
        class423.method4188(this.world, this.world.method6784(new BlockPos(class423)), Class2101.field12182, null, null);
        class423.method4211(this.method4214());
        if (this.hasCustomName()) {
            class423.method1872(this.getCustomName());
            class423.method1875(this.method1876());
        }
        this.world.method6886(class423);
        this.method1652();
    }
    
    @Override
    public void method4165(final Class427 class427) {
        final ItemStack method2107 = class427.method2107();
        final Item method2108 = method2107.getItem();
        if (this.method4883(method2108)) {
            final Class443 method2109 = this.method4837();
            int n = 0;
            for (int i = 0; i < method2109.getSizeInventory(); ++i) {
                final ItemStack method2110 = method2109.getStackInSlot(i);
                if (method2110.method27620() || (method2110.getItem() == method2108 && method2110.method27690() < method2110.method27628())) {
                    n = 1;
                    break;
                }
            }
            if (n == 0) {
                return;
            }
            final int method2111 = method2109.method2265(method2108);
            if (method2111 == 256) {
                return;
            }
            if (method2111 > 256) {
                method2109.method2257(method2108, method2111 - 256);
                return;
            }
            this.method2746(class427, method2107.method27690());
            final ItemStack method2112 = method2109.method2258(method2107);
            if (!method2112.method27620()) {
                method2107.method27691(method2112.method27690());
            }
            else {
                class427.method1652();
            }
        }
    }
    
    public boolean method4883(final Item class3820) {
        return Class824.field4401.contains(class3820) || this.method4870().method28781().method34576().contains(class3820);
    }
    
    public boolean method4884() {
        return this.method4886() >= 24;
    }
    
    public boolean method4885() {
        return this.method4886() < 12;
    }
    
    private int method4886() {
        return Class824.field4400.entrySet().stream().mapToInt(entry -> {
            this.method4837();
            return class443.method2265(entry.getKey()) * (int)entry.getValue();
        }).sum();
    }
    
    private void method4887() {
        final Class443 method4837 = this.method4837();
        final int n = method4837.method2265(Items.field31315) / 3;
        if (n != 0) {
            method4837.method2257(Items.field31315, n * 3);
            final ItemStack method4838 = method4837.method2258(new ItemStack(Items.field31316, n));
            if (!method4838.method27620()) {
                this.method1767(method4838, 0.5f);
            }
        }
    }
    
    public boolean method4888() {
        return this.method4837().method2266((Set<Item>)ImmutableSet.of(Items.field31314, Items.field31518, Items.field31517, (Object) Items.field31576));
    }
    
    @Override
    public void method4839() {
        final Class8562 method4870 = this.method4870();
        final Int2ObjectMap int2ObjectMap = Class9352.field40128.get(method4870.method28781());
        if (int2ObjectMap != null) {
            if (!int2ObjectMap.isEmpty()) {
                final Class7954[] array = (Class7954[])int2ObjectMap.get(method4870.method28782());
                if (array != null) {
                    this.method4840(this.method4825(), array, 2);
                }
            }
        }
    }
    
    public void method4889(final Class824 class824, final long n) {
        if (n < this.field4407 || n >= this.field4407 + 1200L) {
            if (n < class824.field4407 || n >= class824.field4407 + 1200L) {
                this.field4406.method35240(class824.field4406, this.rand, 10);
                this.field4407 = n;
                this.method4891(class824.field4407 = n, 5);
            }
        }
    }
    
    private void method4890() {
        final long method6754 = this.world.method6754();
        if (this.field4408 != 0L) {
            if (method6754 >= this.field4408 + 24000L) {
                this.field4406.method35236();
                this.field4408 = method6754;
            }
        }
        else {
            this.field4408 = method6754;
        }
    }
    
    public void method4891(final long n, final int n2) {
        if (this.method4894(n)) {
            final List<Entity> method7128 = this.world.method7128(Class824.class, this.getBoundingBox().grow(10.0, 10.0, 10.0));
            if (method7128.stream().filter(class824 -> class824.method4894(n3)).limit(5L).collect((Collector<? super Object, ?, List<? super Object>>)Collectors.toList()).size() >= n2) {
                if (this.method4895() != null) {
                    method7128.forEach(class825 -> class825.method4892(n4));
                }
            }
        }
    }
    
    private void method4892(final long l) {
        this.field2996.method1196(Class8233.field33823, l);
    }
    
    private boolean method4893(final long n) {
        final Optional<Long> method1198 = this.field2996.method1198(Class8233.field33823);
        return method1198.isPresent() && n - method1198.get() <= 600L;
    }
    
    public boolean method4894(final long n) {
        final Class8562 method4870 = this.method4870();
        return method4870.method28781() != Class9334.field40060 && method4870.method28781() != Class9334.field40071 && this.method4901(this.world.method6754()) && !this.method4893(n);
    }
    
    @Nullable
    private Class786 method4895() {
        final BlockPos class354 = new BlockPos(this);
        for (int i = 0; i < 10; ++i) {
            final double n = this.world.rand.nextInt(16) - 8;
            final double n2 = this.world.rand.nextInt(16) - 8;
            double n3 = 6.0;
            for (int j = 0; j >= -12; --j) {
                final BlockPos method1133 = class354.add(n, n3 + j, n2);
                if (this.world.getBlockState(method1133).method21706() || this.world.getBlockState(method1133).method21697().method26438()) {
                    if (this.world.getBlockState(method1133.method1139()).method21697().method26443()) {
                        n3 += j;
                        break;
                    }
                }
            }
            final Class786 class355 = EntityType.field29043.method23358(this.world, null, null, null, class354.add(n, n3, n2), Class2101.field12179, false, false);
            if (class355 != null) {
                if (class355.method4179(this.world, Class2101.field12179) && class355.method4180(this.world)) {
                    this.world.method6886(class355);
                    return class355;
                }
                class355.method1652();
            }
        }
        return null;
    }
    
    @Override
    public void method4896(final Class8156 class8156, final Entity class8157) {
        if (class8156 != Class8156.field33590) {
            if (class8156 != Class8156.field33594) {
                if (class8156 != Class8156.field33592) {
                    if (class8156 == Class8156.field33593) {
                        this.field4406.method35242(class8157.method1865(), Class100.field285, 25);
                    }
                }
                else {
                    this.field4406.method35242(class8157.method1865(), Class100.field286, 25);
                }
            }
            else {
                this.field4406.method35242(class8157.method1865(), Class100.field289, 2);
            }
        }
        else {
            this.field4406.method35242(class8157.method1865(), Class100.field288, 20);
            this.field4406.method35242(class8157.method1865(), Class100.field287, 25);
        }
    }
    
    @Override
    public int method4821() {
        return this.field4409;
    }
    
    public void method4897(final int field4409) {
        this.field4409 = field4409;
    }
    
    private void method4898() {
        this.method4865();
        this.field4411 = 0;
    }
    
    public Class9470 method4899() {
        return this.field4406;
    }
    
    public void method4900(final INBT class41) {
        this.field4406.method35244((Dynamic<?>)new Dynamic(Class8453.field34721, class41));
    }
    
    @Override
    public void method4171() {
        super.method4171();
        Class9324.method34540(this);
    }
    
    @Override
    public void method2784(final BlockPos class354) {
        super.method2784(class354);
        this.field2996.method1196(Class8233.field33824, Class366.method1240(this.world.method6754()));
    }
    
    @Override
    public void method2787() {
        super.method2787();
        this.field2996.method1196(Class8233.field33825, Class366.method1240(this.world.method6754()));
    }
    
    private boolean method4901(final long n) {
        final Optional<Class366> method1198 = this.field2996.method1198(Class8233.field33824);
        final Optional<Class366> method1199 = this.field2996.method1198(Class8233.field33826);
        return method1198.isPresent() && method1199.isPresent() && n - method1198.get().method1238() < 24000L && n - method1199.get().method1238() < 36000L;
    }
    
    static {
        field4399 = EntityDataManager.method33564(Class824.class, Class7709.field30669);
        field4400 = (Map)ImmutableMap.of(Items.field31316, 4, Items.field31518, 1, Items.field31517, 1, (Object) Items.field31575, (Object)1);
        field4401 = (Set)ImmutableSet.of(Items.field31316, Items.field31518, Items.field31517, Items.field31315, Items.field31314, Items.field31575, (Object[])new Item[] { Items.field31576 });
        field4413 = ImmutableList.of((Object)Class8233.field33800, (Object)Class8233.field33801, (Object)Class8233.field33802, (Object)Class8233.field33804, (Object)Class8233.field33805, (Object)Class8233.field33806, (Object)Class8233.field33807, (Object)Class8233.field33808, (Object)Class8233.field33809, (Object)Class8233.field33810, (Object)Class8233.field33811, (Object)Class8233.field33812, (Object[])new Class8233[] { Class8233.field33813, Class8233.field33814, Class8233.field33815, Class8233.field33816, Class8233.field33817, Class8233.field33818, Class8233.field33819, Class8233.field33803, Class8233.field33820, Class8233.field33821, Class8233.field33822, Class8233.field33824, Class8233.field33825, Class8233.field33826, Class8233.field33823 });
        field4414 = ImmutableList.of((Object)Class8033.field33064, (Object)Class8033.field33065, (Object)Class8033.field33066, (Object)Class8033.field33067, (Object)Class8033.field33068, (Object)Class8033.field33069, (Object)Class8033.field33070, (Object)Class8033.field33071, (Object)Class8033.field33072);
        field4415 = (Map)ImmutableMap.of((Object)Class8233.field33800, (p0, class8912) -> class8912 == Class8912.field37476, (Object)Class8233.field33801, (class8913, class8914) -> class8913.method4870().method28781().method34575() == class8914, (Object)Class8233.field33802, (p0, class8915) -> class8915 == Class8912.field37477);
    }
}
