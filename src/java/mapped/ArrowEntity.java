package mapped;

import com.google.common.collect.Sets;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.projectile.AbstractArrowEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.nbt.ListNBT;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.potion.EffectInstance;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.World;

import java.util.List;
import java.util.Set;

public class ArrowEntity extends AbstractArrowEntity {
   private static final DataParameter<Integer> field5116 = EntityDataManager.<Integer>createKey(ArrowEntity.class, DataSerializers.VARINT);
   private Class8812 field5117 = Class8137.field34976;
   private final Set<EffectInstance> field5118 = Sets.newHashSet();
   private boolean field5119;

   public ArrowEntity(EntityType<? extends ArrowEntity> var1, World var2) {
      super(var1, var2);
   }

   public ArrowEntity(World var1, double var2, double var4, double var6) {
      super(EntityType.ARROW, var2, var4, var6, var1);
   }

   public ArrowEntity(World var1, LivingEntity var2) {
      super(EntityType.ARROW, var2, var1);
   }

   public void method3497(ItemStack var1) {
      if (var1.getItem() != Items.field38117) {
         if (var1.getItem() == Items.field37797) {
            this.field5117 = Class8137.field34976;
            this.field5118.clear();
            this.dataManager.method35446(field5116, -1);
         }
      } else {
         this.field5117 = Class9741.method38185(var1);
         List<EffectInstance> var4 = Class9741.method38179(var1);
         if (!var4.isEmpty()) {
            for (EffectInstance var6 : var4) {
               this.field5118.add(new EffectInstance(var6));
            }
         }

         int var7 = method3498(var1);
         if (var7 != -1) {
            this.method3503(var7);
         } else {
            this.method3499();
         }
      }
   }

   public static int method3498(ItemStack var0) {
      CompoundNBT var3 = var0.getTag();
      return var3 != null && var3.contains("CustomPotionColor", 99) ? var3.getInt("CustomPotionColor") : -1;
   }

   private void method3499() {
      this.field5119 = false;
      if (this.field5117 == Class8137.field34976 && this.field5118.isEmpty()) {
         this.dataManager.method35446(field5116, -1);
      } else {
         this.dataManager.method35446(field5116, Class9741.method38184(Class9741.method38177(this.field5117, this.field5118)));
      }
   }

   public void method3500(EffectInstance var1) {
      this.field5118.add(var1);
      this.getDataManager().method35446(field5116, Class9741.method38184(Class9741.method38177(this.field5117, this.field5118)));
   }

   @Override
   public void registerData() {
      super.registerData();
      this.dataManager.register(field5116, -1);
   }

   @Override
   public void tick() {
      super.tick();
      if (!this.world.isRemote) {
         if (this.field5100 && this.field5101 != 0 && !this.field5118.isEmpty() && this.field5101 >= 600) {
            this.world.setEntityState(this, (byte)0);
            this.field5117 = Class8137.field34976;
            this.field5118.clear();
            this.dataManager.method35446(field5116, -1);
         }
      } else if (!this.field5100) {
         this.method3501(2);
      } else if (this.field5101 % 5 == 0) {
         this.method3501(1);
      }
   }

   private void method3501(int var1) {
      int var4 = this.method3502();
      if (var4 != -1 && var1 > 0) {
         double var5 = (double)(var4 >> 16 & 0xFF) / 255.0;
         double var7 = (double)(var4 >> 8 & 0xFF) / 255.0;
         double var9 = (double)(var4 >> 0 & 0xFF) / 255.0;

         for (int var11 = 0; var11 < var1; var11++) {
            this.world.addParticle(ParticleTypes.field34068, this.getPosXRandom(0.5), this.getPosYRandom(), this.getPosZRandom(0.5), var5, var7, var9);
         }
      }
   }

   public int method3502() {
      return this.dataManager.<Integer>method35445(field5116);
   }

   private void method3503(int var1) {
      this.field5119 = true;
      this.dataManager.method35446(field5116, var1);
   }

   @Override
   public void writeAdditional(CompoundNBT var1) {
      super.writeAdditional(var1);
      if (this.field5117 != Class8137.field34976 && this.field5117 != null) {
         var1.putString("Potion", Registry.field16076.getKey(this.field5117).toString());
      }

      if (this.field5119) {
         var1.putInt("Color", this.method3502());
      }

      if (!this.field5118.isEmpty()) {
         ListNBT var4 = new ListNBT();

         for (EffectInstance var6 : this.field5118) {
            var4.add(var6.write(new CompoundNBT()));
         }

         var1.put("CustomPotionEffects", var4);
      }
   }

   @Override
   public void readAdditional(CompoundNBT var1) {
      super.readAdditional(var1);
      if (var1.contains("Potion", 8)) {
         this.field5117 = Class9741.method38186(var1);
      }

      for (EffectInstance var5 : Class9741.method38180(var1)) {
         this.method3500(var5);
      }

      if (!var1.contains("Color", 99)) {
         this.method3499();
      } else {
         this.method3503(var1.getInt("Color"));
      }
   }

   @Override
   public void method3478(LivingEntity var1) {
      super.method3478(var1);

      for (EffectInstance var5 : this.field5117.method31816()) {
         var1.addPotionEffect(new EffectInstance(var5.getPotion(), Math.max(var5.getDuration() / 8, 1), var5.getAmplifier(), var5.isAmbient(), var5.doesShowParticles()));
      }

      if (!this.field5118.isEmpty()) {
         for (EffectInstance var7 : this.field5118) {
            var1.addPotionEffect(var7);
         }
      }
   }

   @Override
   public ItemStack method3480() {
      if (this.field5118.isEmpty() && this.field5117 == Class8137.field34976) {
         return new ItemStack(Items.field37797);
      } else {
         ItemStack var3 = new ItemStack(Items.field38117);
         Class9741.method38187(var3, this.field5117);
         Class9741.method38188(var3, this.field5118);
         if (this.field5119) {
            var3.getOrCreateTag().putInt("CustomPotionColor", this.method3502());
         }

         return var3;
      }
   }

   @Override
   public void handleStatusUpdate(byte var1) {
      if (var1 != 0) {
         super.handleStatusUpdate(var1);
      } else {
         int var4 = this.method3502();
         if (var4 != -1) {
            double var5 = (double)(var4 >> 16 & 0xFF) / 255.0;
            double var7 = (double)(var4 >> 8 & 0xFF) / 255.0;
            double var9 = (double)(var4 >> 0 & 0xFF) / 255.0;

            for (int var11 = 0; var11 < 20; var11++) {
               this.world.addParticle(ParticleTypes.field34068, this.getPosXRandom(0.5), this.getPosYRandom(), this.getPosZRandom(0.5), var5, var7, var9);
            }
         }
      }
   }
}
