package mapped;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import net.minecraft.block.material.PushReaction;
import net.minecraft.entity.*;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.nbt.ListNBT;
import net.minecraft.network.IPacket;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.network.play.server.SSpawnObjectPacket;
import net.minecraft.particles.IParticleData;
import net.minecraft.potion.EffectInstance;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.annotation.Nullable;
import java.util.*;
import java.util.Map.Entry;

public class Class999 extends Entity {
   private static final Logger field5497 = LogManager.getLogger();
   private static final DataParameter<Float> field5498 = EntityDataManager.<Float>createKey(Class999.class, DataSerializers.FLOAT);
   private static final DataParameter<Integer> field5499 = EntityDataManager.<Integer>createKey(Class999.class, DataSerializers.VARINT);
   private static final DataParameter<Boolean> field5500 = EntityDataManager.<Boolean>createKey(Class999.class, DataSerializers.field33398);
   private static final DataParameter<IParticleData> field5501 = EntityDataManager.<IParticleData>createKey(Class999.class, DataSerializers.field33399);
   private Class8812 field5502 = Class8137.field34976;
   private final List<EffectInstance> field5503 = Lists.newArrayList();
   private final Map<Entity, Integer> field5504 = Maps.newHashMap();
   private int field5505 = 600;
   private int field5506 = 20;
   private int field5507 = 20;
   private boolean field5508;
   private int field5509;
   private float field5510;
   private float field5511;
   private LivingEntity field5512;
   private UUID field5513;

   public Class999(EntityType<? extends Class999> var1, World var2) {
      super(var1, var2);
      this.noClip = true;
      this.method4097(3.0F);
   }

   public Class999(World var1, double var2, double var4, double var6) {
      this(EntityType.AREA_EFFECT_CLOUD, var1);
      this.setPosition(var2, var4, var6);
   }

   @Override
   public void registerData() {
      this.getDataManager().register(field5499, 0);
      this.getDataManager().register(field5498, 0.5F);
      this.getDataManager().register(field5500, false);
      this.getDataManager().register(field5501, ParticleTypes.field34068);
   }

   public void method4097(float var1) {
      if (!this.world.isRemote) {
         this.getDataManager().method35446(field5498, var1);
      }
   }

   @Override
   public void recalculateSize() {
      double var3 = this.getPosX();
      double var5 = this.getPosY();
      double var7 = this.getPosZ();
      super.recalculateSize();
      this.setPosition(var3, var5, var7);
   }

   public float method4098() {
      return this.getDataManager().<Float>method35445(field5498);
   }

   public void method4099(Class8812 var1) {
      this.field5502 = var1;
      if (!this.field5508) {
         this.method4100();
      }
   }

   private void method4100() {
      if (this.field5502 == Class8137.field34976 && this.field5503.isEmpty()) {
         this.getDataManager().method35446(field5499, 0);
      } else {
         this.getDataManager().method35446(field5499, Class9741.method38184(Class9741.method38177(this.field5502, this.field5503)));
      }
   }

   public void method4101(EffectInstance var1) {
      this.field5503.add(var1);
      if (!this.field5508) {
         this.method4100();
      }
   }

   public int method4102() {
      return this.getDataManager().<Integer>method35445(field5499);
   }

   public void method4103(int var1) {
      this.field5508 = true;
      this.getDataManager().method35446(field5499, var1);
   }

   public IParticleData method4104() {
      return this.getDataManager().<IParticleData>method35445(field5501);
   }

   public void method4105(IParticleData var1) {
      this.getDataManager().method35446(field5501, var1);
   }

   public void method4106(boolean var1) {
      this.getDataManager().method35446(field5500, var1);
   }

   public boolean method4107() {
      return this.getDataManager().<Boolean>method35445(field5500);
   }

   public int method4108() {
      return this.field5505;
   }

   public void method4109(int var1) {
      this.field5505 = var1;
   }

   @Override
   public void tick() {
      super.tick();
      boolean var3 = this.method4107();
      float var4 = this.method4098();
      if (!this.world.isRemote) {
         if (this.ticksExisted >= this.field5506 + this.field5505) {
            this.remove();
            return;
         }

         boolean var5 = this.ticksExisted < this.field5506;
         if (var3 != var5) {
            this.method4106(var5);
         }

         if (var5) {
            return;
         }

         if (this.field5511 != 0.0F) {
            var4 += this.field5511;
            if (var4 < 0.5F) {
               this.remove();
               return;
            }

            this.method4097(var4);
         }

         if (this.ticksExisted % 5 == 0) {
            Iterator var6 = this.field5504.entrySet().iterator();

            while (var6.hasNext()) {
               Entry var7 = (Entry)var6.next();
               if (this.ticksExisted >= (Integer)var7.getValue()) {
                  var6.remove();
               }
            }

           List<EffectInstance> var27 = Lists.newArrayList();

            for (EffectInstance var9 : this.field5502.method31816()) {
               var27.add(new EffectInstance(var9.getPotion(), var9.getDuration() / 4, var9.getAmplifier(), var9.isAmbient(), var9.doesShowParticles()));
            }

            var27.addAll(this.field5503);
            if (!var27.isEmpty()) {
               List<LivingEntity> var30 = this.world.<LivingEntity>getEntitiesWithinAABB(LivingEntity.class, this.getBoundingBox());
               if (!var30.isEmpty()) {
                  for (LivingEntity var10 : var30) {
                     if (!this.field5504.containsKey(var10) && var10.canBeHitWithPotion()) {
                        double var16 = var10.getPosX() - this.getPosX();
                        double var18 = var10.getPosZ() - this.getPosZ();
                        double var20 = var16 * var16 + var18 * var18;
                        if (var20 <= (double)(var4 * var4)) {
                           this.field5504.put(var10, this.ticksExisted + this.field5507);

                           for (EffectInstance var23 : var27) {
                              if (!var23.getPotion().isInstant()) {
                                 var10.addPotionEffect(new EffectInstance(var23));
                              } else {
                                 var23.getPotion().affectEntity(this, this.method4114(), var10, var23.getAmplifier(), 0.5);
                              }
                           }

                           if (this.field5510 != 0.0F) {
                              var4 += this.field5510;
                              if (var4 < 0.5F) {
                                 this.remove();
                                 return;
                              }

                              this.method4097(var4);
                           }

                           if (this.field5509 != 0) {
                              this.field5505 = this.field5505 + this.field5509;
                              if (this.field5505 <= 0) {
                                 this.remove();
                                 return;
                              }
                           }
                        }
                     }
                  }
               }
            } else {
               this.field5504.clear();
            }
         }
      } else {
         IParticleData var24 = this.method4104();
         if (!var3) {
            float var25 = (float) Math.PI * var4 * var4;

            for (int var28 = 0; (float)var28 < var25; var28++) {
               float var31 = this.rand.nextFloat() * (float) (Math.PI * 2);
               float var34 = MathHelper.sqrt(this.rand.nextFloat()) * var4;
               float var36 = MathHelper.cos(var31) * var34;
               float var11 = MathHelper.sin(var31) * var34;
               if (var24.getType() != ParticleTypes.field34068) {
                  this.world
                     .method6748(
                        var24,
                        this.getPosX() + (double)var36,
                        this.getPosY(),
                        this.getPosZ() + (double)var11,
                        (0.5 - this.rand.nextDouble()) * 0.15,
                        0.01F,
                        (0.5 - this.rand.nextDouble()) * 0.15
                     );
               } else {
                  int var12 = this.method4102();
                  int var13 = var12 >> 16 & 0xFF;
                  int var14 = var12 >> 8 & 0xFF;
                  int var15 = var12 & 0xFF;
                  this.world
                     .method6748(
                        var24,
                        this.getPosX() + (double)var36,
                        this.getPosY(),
                        this.getPosZ() + (double)var11,
                        (double)((float)var13 / 255.0F),
                        (double)((float)var14 / 255.0F),
                        (double)((float)var15 / 255.0F)
                     );
               }
            }
         } else if (this.rand.nextBoolean()) {
            for (int var26 = 0; var26 < 2; var26++) {
               float var29 = this.rand.nextFloat() * (float) (Math.PI * 2);
               float var32 = MathHelper.sqrt(this.rand.nextFloat()) * 0.2F;
               float var35 = MathHelper.cos(var29) * var32;
               float var37 = MathHelper.sin(var29) * var32;
               if (var24.getType() != ParticleTypes.field34068) {
                  this.world.method6748(var24, this.getPosX() + (double)var35, this.getPosY(), this.getPosZ() + (double)var37, 0.0, 0.0, 0.0);
               } else {
                  int var38 = !this.rand.nextBoolean() ? this.method4102() : 16777215;
                  int var39 = var38 >> 16 & 0xFF;
                  int var40 = var38 >> 8 & 0xFF;
                  int var41 = var38 & 0xFF;
                  this.world
                     .method6748(
                        var24,
                        this.getPosX() + (double)var35,
                        this.getPosY(),
                        this.getPosZ() + (double)var37,
                        (double)((float)var39 / 255.0F),
                        (double)((float)var40 / 255.0F),
                        (double)((float)var41 / 255.0F)
                     );
               }
            }
         }
      }
   }

   public void method4110(float var1) {
      this.field5510 = var1;
   }

   public void method4111(float var1) {
      this.field5511 = var1;
   }

   public void method4112(int var1) {
      this.field5506 = var1;
   }

   public void method4113(LivingEntity var1) {
      this.field5512 = var1;
      this.field5513 = var1 != null ? var1.getUniqueID() : null;
   }

   @Nullable
   public LivingEntity method4114() {
      if (this.field5512 == null && this.field5513 != null && this.world instanceof ServerWorld) {
         Entity var3 = ((ServerWorld)this.world).getEntityByUuid(this.field5513);
         if (var3 instanceof LivingEntity) {
            this.field5512 = (LivingEntity)var3;
         }
      }

      return this.field5512;
   }

   @Override
   public void readAdditional(CompoundNBT var1) {
      this.ticksExisted = var1.getInt("Age");
      this.field5505 = var1.getInt("Duration");
      this.field5506 = var1.getInt("WaitTime");
      this.field5507 = var1.getInt("ReapplicationDelay");
      this.field5509 = var1.getInt("DurationOnUse");
      this.field5510 = var1.getFloat("RadiusOnUse");
      this.field5511 = var1.getFloat("RadiusPerTick");
      this.method4097(var1.getFloat("Radius"));
      if (var1.hasUniqueID("Owner")) {
         this.field5513 = var1.getUniqueID("Owner");
      }

      if (var1.contains("Particle", 8)) {
         try {
            this.method4105(Class8050.method27650(new StringReader(var1.getString("Particle"))));
         } catch (CommandSyntaxException var7) {
            field5497.warn("Couldn't load custom particle {}", var1.getString("Particle"), var7);
         }
      }

      if (var1.contains("Color", 99)) {
         this.method4103(var1.getInt("Color"));
      }

      if (var1.contains("Potion", 8)) {
         this.method4099(Class9741.method38186(var1));
      }

      if (var1.contains("Effects", 9)) {
         ListNBT var4 = var1.getList("Effects", 10);
         this.field5503.clear();

         for (int var5 = 0; var5 < var4.size(); var5++) {
            EffectInstance var6 = EffectInstance.read(var4.getCompound(var5));
            if (var6 != null) {
               this.method4101(var6);
            }
         }
      }
   }

   @Override
   public void writeAdditional(CompoundNBT var1) {
      var1.putInt("Age", this.ticksExisted);
      var1.putInt("Duration", this.field5505);
      var1.putInt("WaitTime", this.field5506);
      var1.putInt("ReapplicationDelay", this.field5507);
      var1.putInt("DurationOnUse", this.field5509);
      var1.putFloat("RadiusOnUse", this.field5510);
      var1.putFloat("RadiusPerTick", this.field5511);
      var1.putFloat("Radius", this.method4098());
      var1.putString("Particle", this.method4104().getParameters());
      if (this.field5513 != null) {
         var1.putUniqueID("Owner", this.field5513);
      }

      if (this.field5508) {
         var1.putInt("Color", this.method4102());
      }

      if (this.field5502 != Class8137.field34976 && this.field5502 != null) {
         var1.putString("Potion", Registry.field16076.getKey(this.field5502).toString());
      }

      if (!this.field5503.isEmpty()) {
         ListNBT var4 = new ListNBT();

         for (EffectInstance var6 : this.field5503) {
            var4.add(var6.write(new CompoundNBT()));
         }

         var1.put("Effects", var4);
      }
   }

   @Override
   public void notifyDataManagerChange(DataParameter<?> var1) {
      if (field5498.equals(var1)) {
         this.recalculateSize();
      }

      super.notifyDataManagerChange(var1);
   }

   @Override
   public PushReaction method3422() {
      return PushReaction.field15865;
   }

   @Override
   public IPacket<?> createSpawnPacket() {
      return new SSpawnObjectPacket(this);
   }

   @Override
   public EntitySize getSize(Pose var1) {
      return EntitySize.method32101(this.method4098() * 2.0F, 0.5F);
   }
}
