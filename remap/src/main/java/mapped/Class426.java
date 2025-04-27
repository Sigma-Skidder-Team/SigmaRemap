// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.*;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;
import org.apache.logging.log4j.LogManager;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.StringReader;
import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.Iterator;

import com.google.common.collect.Maps;
import com.google.common.collect.Lists;
import java.util.UUID;
import java.util.Map;
import java.util.List;
import org.apache.logging.log4j.Logger;

public class Class426 extends Entity
{
    private static final Logger field2596;
    private static final DataParameter<Float> field2597;
    private static final DataParameter<Integer> field2598;
    private static final DataParameter<Boolean> field2599;
    private static final DataParameter<IParticleData> field2600;
    private Class8061 field2601;
    private final List<Class1948> field2602;
    private final Map<Entity, Integer> field2603;
    private int field2604;
    private int field2605;
    private int field2606;
    private boolean field2607;
    private int field2608;
    private float field2609;
    private float field2610;
    private LivingEntity field2611;
    private UUID field2612;
    
    public Class426(final EntityType<? extends Class426> class7499, final World class7500) {
        super(class7499, class7500);
        this.field2601 = Class8644.field36250;
        this.field2602 = Lists.newArrayList();
        this.field2603 = Maps.newHashMap();
        this.field2604 = 600;
        this.field2605 = 20;
        this.field2606 = 20;
        this.noClip = true;
        this.method2081(3.0f);
    }
    
    public Class426(final World class1847, final double n, final double n2, final double n3) {
        this(EntityType.field28957, class1847);
        this.setPosition(n, n2, n3);
    }
    
    @Override
    public void method1649() {
        this.method1650().register(Class426.field2598, 0);
        this.method1650().register(Class426.field2597, 0.5f);
        this.method1650().register(Class426.field2599, false);
        this.method1650().register(Class426.field2600, Class8432.field34617);
    }
    
    public void method2081(final float f) {
        if (!this.world.isRemote) {
            this.method1650().set(Class426.field2597, f);
        }
    }
    
    @Override
    public void method1881() {
        final double method1938 = this.getPosX();
        final double method1939 = this.getPosY();
        final double method1940 = this.getPosZ();
        super.method1881();
        this.setPosition(method1938, method1939, method1940);
    }
    
    public float method2082() {
        return this.method1650().get(Class426.field2597);
    }
    
    public void method2083(final Class8061 field2601) {
        this.field2601 = field2601;
        if (!this.field2607) {
            this.method2084();
        }
    }
    
    private void method2084() {
        if (this.field2601 == Class8644.field36250 && this.field2602.isEmpty()) {
            this.method1650().set(Class426.field2598, 0);
        }
        else {
            this.method1650().set(Class426.field2598, Class5333.method16473(Class5333.method16466(this.field2601, this.field2602)));
        }
    }
    
    public void method2085(final Class1948 class1948) {
        this.field2602.add(class1948);
        if (!this.field2607) {
            this.method2084();
        }
    }
    
    public int method2086() {
        return this.method1650().get(Class426.field2598);
    }
    
    public void method2087(final int i) {
        this.field2607 = true;
        this.method1650().set(Class426.field2598, i);
    }
    
    public IParticleData method2088() {
        return this.method1650().get(Class426.field2600);
    }
    
    public void method2089(final IParticleData IParticleData) {
        this.method1650().set(Class426.field2600, IParticleData);
    }
    
    public void method2090(final boolean b) {
        this.method1650().set(Class426.field2599, b);
    }
    
    public boolean method2091() {
        return this.method1650().get(Class426.field2599);
    }
    
    public int method2092() {
        return this.field2604;
    }
    
    public void method2093(final int field2604) {
        this.field2604 = field2604;
    }
    
    @Override
    public void method1659() {
        super.method1659();
        final boolean method2091 = this.method2091();
        float method2092 = this.method2082();
        if (!this.world.isRemote) {
            if (this.ticksExisted >= this.field2605 + this.field2604) {
                this.method1652();
                return;
            }
            final boolean b = this.ticksExisted < this.field2605;
            if (method2091 != b) {
                this.method2090(b);
            }
            if (b) {
                return;
            }
            if (this.field2610 != 0.0f) {
                method2092 += this.field2610;
                if (method2092 < 0.5f) {
                    this.method1652();
                    return;
                }
                this.method2081(method2092);
            }
            if (this.ticksExisted % 5 == 0) {
                final Iterator<Map.Entry<Entity, Integer>> iterator = this.field2603.entrySet().iterator();
                while (iterator.hasNext()) {
                    if (this.ticksExisted < iterator.next().getValue()) {
                        continue;
                    }
                    iterator.remove();
                }
                final ArrayList arrayList = Lists.newArrayList();
                for (final Class1948 class1948 : this.field2601.method26449()) {
                    arrayList.add(new Class1948(class1948.method7906(), class1948.method7907() / 4, class1948.method7908(), class1948.method7909(), class1948.method7910()));
                }
                arrayList.addAll(this.field2602);
                if (!arrayList.isEmpty()) {
                    final List<Entity> method2093 = this.world.method7128(LivingEntity.class, this.getBoundingBox());
                    if (!method2093.isEmpty()) {
                        for (final LivingEntity class1949 : method2093) {
                            if (this.field2603.containsKey(class1949)) {
                                continue;
                            }
                            if (!class1949.method2776()) {
                                continue;
                            }
                            final double n = class1949.getPosX() - this.getPosX();
                            final double n2 = class1949.getPosZ() - this.getPosZ();
                            if (n * n + n2 * n2 > method2092 * method2092) {
                                continue;
                            }
                            this.field2603.put(class1949, this.ticksExisted + this.field2606);
                            for (final Class1948 class1950 : arrayList) {
                                if (!class1950.method7906().method16453()) {
                                    class1949.method2655(new Class1948(class1950));
                                }
                                else {
                                    class1950.method7906().method16452(this, this.method2098(), class1949, class1950.method7908(), 0.5);
                                }
                            }
                            if (this.field2609 != 0.0f) {
                                method2092 += this.field2609;
                                if (method2092 < 0.5f) {
                                    this.method1652();
                                    return;
                                }
                                this.method2081(method2092);
                            }
                            if (this.field2608 == 0) {
                                continue;
                            }
                            this.field2604 += this.field2608;
                            if (this.field2604 > 0) {
                                continue;
                            }
                            this.method1652();
                        }
                    }
                }
                else {
                    this.field2603.clear();
                }
            }
        }
        else {
            final IParticleData method2094 = this.method2088();
            if (!method2091) {
                final float n3 = 3.1415927f * method2092 * method2092;
                for (int n4 = 0; n4 < n3; ++n4) {
                    final float n5 = this.rand.nextFloat() * 6.2831855f;
                    final float n6 = MathHelper.method35640(this.rand.nextFloat()) * method2092;
                    final float n7 = MathHelper.cos(n5) * n6;
                    final float n8 = MathHelper.sin(n5) * n6;
                    if (method2094.method21272() != Class8432.field34617) {
                        this.world.method6711(method2094, this.getPosX() + n7, this.getPosY(), this.getPosZ() + n8, (0.5 - this.rand.nextDouble()) * 0.15, 0.009999999776482582, (0.5 - this.rand.nextDouble()) * 0.15);
                    }
                    else {
                        final int method2095 = this.method2086();
                        this.world.method6711(method2094, this.getPosX() + n7, this.getPosY(), this.getPosZ() + n8, (method2095 >> 16 & 0xFF) / 255.0f, (method2095 >> 8 & 0xFF) / 255.0f, (method2095 & 0xFF) / 255.0f);
                    }
                }
            }
            else if (this.rand.nextBoolean()) {
                for (int i = 0; i < 2; ++i) {
                    final float n9 = this.rand.nextFloat() * 6.2831855f;
                    final float n10 = MathHelper.method35640(this.rand.nextFloat()) * 0.2f;
                    final float n11 = MathHelper.cos(n9) * n10;
                    final float n12 = MathHelper.sin(n9) * n10;
                    if (method2094.method21272() != Class8432.field34617) {
                        this.world.method6711(method2094, this.getPosX() + n11, this.getPosY(), this.getPosZ() + n12, 0.0, 0.0, 0.0);
                    }
                    else {
                        final int n13 = this.rand.nextBoolean() ? 16777215 : this.method2086();
                        this.world.method6711(method2094, this.getPosX() + n11, this.getPosY(), this.getPosZ() + n12, (n13 >> 16 & 0xFF) / 255.0f, (n13 >> 8 & 0xFF) / 255.0f, (n13 & 0xFF) / 255.0f);
                    }
                }
            }
        }
    }
    
    public void method2094(final float field2609) {
        this.field2609 = field2609;
    }
    
    public void method2095(final float field2610) {
        this.field2610 = field2610;
    }
    
    public void method2096(final int field2605) {
        this.field2605 = field2605;
    }
    
    public void method2097(final LivingEntity field2611) {
        this.field2611 = field2611;
        this.field2612 = ((field2611 != null) ? field2611.getUniqueID() : null);
    }
    
    @Nullable
    public LivingEntity method2098() {
        if (this.field2611 == null) {
            if (this.field2612 != null) {
                if (this.world instanceof Class1849) {
                    final Entity method6914 = ((Class1849)this.world).method6914(this.field2612);
                    if (method6914 instanceof LivingEntity) {
                        this.field2611 = (LivingEntity)method6914;
                    }
                }
            }
        }
        return this.field2611;
    }
    
    @Override
    public void method1760(final CompoundNBT class51) {
        this.ticksExisted = class51.getInt("Age");
        this.field2604 = class51.getInt("Duration");
        this.field2605 = class51.getInt("WaitTime");
        this.field2606 = class51.getInt("ReapplicationDelay");
        this.field2608 = class51.getInt("DurationOnUse");
        this.field2609 = class51.getFloat("RadiusOnUse");
        this.field2610 = class51.getFloat("RadiusPerTick");
        this.method2081(class51.getFloat("Radius"));
        this.field2612 = class51.getUniqueId("OwnerUUID");
        if (class51.contains("Particle", 8)) {
            try {
                this.method2089(Class7384.method22674(new StringReader(class51.getString("Particle"))));
            }
            catch (final CommandSyntaxException ex) {
                Class426.field2596.warn("Couldn't load custom particle {}", class51.getString("Particle"), ex);
            }
        }
        if (class51.contains("Color", 99)) {
            this.method2087(class51.getInt("Color"));
        }
        if (class51.contains("Potion", 8)) {
            this.method2083(Class5333.method16475(class51));
        }
        if (class51.contains("Effects", 9)) {
            final ListNBT method328 = class51.getList("Effects", 10);
            this.field2602.clear();
            for (int i = 0; i < method328.size(); ++i) {
                final Class1948 method329 = Class1948.method7918(method328.method346(i));
                if (method329 != null) {
                    this.method2085(method329);
                }
            }
        }
    }
    
    @Override
    public void method1761(final CompoundNBT class51) {
        class51.putInt("Age", this.ticksExisted);
        class51.putInt("Duration", this.field2604);
        class51.putInt("WaitTime", this.field2605);
        class51.putInt("ReapplicationDelay", this.field2606);
        class51.putInt("DurationOnUse", this.field2608);
        class51.putFloat("RadiusOnUse", this.field2609);
        class51.putFloat("RadiusPerTick", this.field2610);
        class51.putFloat("Radius", this.method2082());
        class51.putString("Particle", this.method2088().method21274());
        if (this.field2612 != null) {
            class51.putUniqueId("OwnerUUID", this.field2612);
        }
        if (this.field2607) {
            class51.putInt("Color", this.method2086());
        }
        if (this.field2601 != Class8644.field36250) {
            if (this.field2601 != null) {
                class51.putString("Potion", Registry.field212.getKey(this.field2601).toString());
            }
        }
        if (!this.field2602.isEmpty()) {
            final ListNBT class52 = new ListNBT();
            final Iterator<Class1948> iterator = this.field2602.iterator();
            while (iterator.hasNext()) {
                class52.add(iterator.next().method7916(new CompoundNBT()));
            }
            class51.put("Effects", class52);
        }
    }
    
    @Override
    public void method1880(final DataParameter<?> class8810) {
        if (Class426.field2597.equals(class8810)) {
            this.method1881();
        }
        super.method1880(class8810);
    }
    
    @Override
    public PushReaction method1921() {
        return PushReaction.IGNORE;
    }
    
    @Override
    public IPacket<?> method1932() {
        return new Class4339(this);
    }
    
    @Override
    public EntitySize method1933(final Pose class290) {
        return EntitySize.method27563(this.method2082() * 2.0f, 0.5f);
    }
    
    static {
        field2596 = LogManager.getLogger();
        field2597 = EntityDataManager.method33564(Class426.class, Class7709.field30655);
        field2598 = EntityDataManager.method33564(Class426.class, Class7709.field30654);
        field2599 = EntityDataManager.method33564(Class426.class, Class7709.field30661);
        field2600 = EntityDataManager.method33564(Class426.class, Class7709.field30662);
    }
}
