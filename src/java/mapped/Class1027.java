package mapped;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.EntitySize;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.Pose;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.SoundEvent;

import java.util.List;
import java.util.UUID;
import java.util.function.Predicate;

public class Class1027 extends Class1026 implements Class1022 {
   private static final UUID field5718 = UUID.fromString("5CD17E52-A79A-43D3-A529-90FDE04B181E");
   private static final Class9689 field5719 = new Class9689(field5718, "Drinking speed penalty", -0.25, AttributeModifierOperation.ADDITION);
   private static final DataParameter<Boolean> field5720 = EntityDataManager.<Boolean>createKey(Class1027.class, DataSerializers.field33398);
   private int field5721;
   private Class2712<Class1026> field5722;
   private Class2711<PlayerEntity> field5723;

   public Class1027(EntityType<? extends Class1027> var1, World var2) {
      super(var1, var2);
   }

   @Override
   public void method4219() {
      super.method4219();
      this.field5722 = new Class2712<Class1026>(
         this, Class1026.class, true, var1 -> var1 != null && this.method4552() && var1.getType() != EntityType.field41101
      );
      this.field5723 = new Class2711<PlayerEntity>(this, PlayerEntity.class, 10, true, false, (Predicate<LivingEntity>)null);
      this.field5600.method20002(1, new Class2603(this));
      this.field5600.method20002(2, new Class2598(this, 1.0, 60, 10.0F));
      this.field5600.method20002(2, new Class2737(this, 1.0));
      this.field5600.method20002(3, new Class2612(this, PlayerEntity.class, 8.0F));
      this.field5600.method20002(3, new Class2668(this));
      this.field5601.method20002(1, new Class2704(this, Class1026.class));
      this.field5601.method20002(2, this.field5722);
      this.field5601.method20002(3, this.field5723);
   }

   @Override
   public void registerData() {
      super.registerData();
      this.method3210().register(field5720, false);
   }

   @Override
   public SoundEvent method4241() {
      return Sounds.field27233;
   }

   @Override
   public SoundEvent method2879(Class8654 var1) {
      return Sounds.field27237;
   }

   @Override
   public SoundEvent method2880() {
      return Sounds.field27235;
   }

   public void method4567(boolean var1) {
      this.method3210().method35446(field5720, var1);
   }

   public boolean method4568() {
      return this.method3210().<Boolean>method35445(field5720);
   }

   public static Class7037 method4569() {
      return Class1009.method4343().method21849(Attributes.field42105, 26.0).method21849(Attributes.MOVEMENT_SPEED, 0.25);
   }

   @Override
   public void method2871() {
      if (!this.world.isRemote && this.isAlive()) {
         this.field5722.method10927();
         if (this.field5722.method10926() > 0) {
            this.field5723.method10925(false);
         } else {
            this.field5723.method10925(true);
         }

         if (!this.method4568()) {
            Class8812 var7 = null;
            if (this.rand.nextFloat() < 0.15F && this.method3263(Class8953.field40469) && !this.method3033(Effects.WATER_BREATHING)) {
               var7 = Class8137.field34999;
            } else if (this.rand.nextFloat() < 0.15F
               && (this.method3327() || this.method3047() != null && this.method3047().method31141())
               && !this.method3033(Effects.FIRE_RESISTANCE)) {
               var7 = Class8137.field34988;
            } else if (this.rand.nextFloat() < 0.05F && this.getHealth() < this.method3075()) {
               var7 = Class8137.field35001;
            } else if (this.rand.nextFloat() < 0.5F
               && this.method4232() != null
               && !this.method3033(Effects.SPEED)
               && this.method4232().getDistanceSq(this) > 121.0) {
               var7 = Class8137.field34990;
            }

            if (var7 != null) {
               this.method2944(Class2106.field13731, Class9741.method38187(new ItemStack(Items.field37971), var7));
               this.field5721 = this.method3090().method32137();
               this.method4567(true);
               if (!this.method3245()) {
                  this.world
                     .method6743(
                        (PlayerEntity)null,
                        this.getPosX(),
                        this.getPosY(),
                        this.getPosZ(),
                        Sounds.field27236,
                        this.method2864(),
                        1.0F,
                        0.8F + this.rand.nextFloat() * 0.4F
                     );
               }

               Class9805 var8 = this.method3085(Attributes.MOVEMENT_SPEED);
               var8.method38670(field5719);
               var8.method38667(field5719);
            }
         } else if (this.field5721-- <= 0) {
            this.method4567(false);
            ItemStack var3 = this.method3090();
            this.method2944(Class2106.field13731, ItemStack.EMPTY);
            if (var3.getItem() == Items.field37971) {
               List<Class2023> var4 = Class9741.method38176(var3);
               if (var4 != null) {
                  for (Class2023 var6 : var4) {
                     this.method3035(new Class2023(var6));
                  }
               }
            }

            this.method3085(Attributes.MOVEMENT_SPEED).method38670(field5719);
         }

         if (this.rand.nextFloat() < 7.5E-4F) {
            this.world.method6786(this, (byte)15);
         }
      }

      super.method2871();
   }

   @Override
   public SoundEvent method4546() {
      return Sounds.field27234;
   }

   @Override
   public void method2866(byte var1) {
      if (var1 != 15) {
         super.method2866(var1);
      } else {
         for (int var4 = 0; var4 < this.rand.nextInt(35) + 10; var4++) {
            this.world
               .method6746(
                  Class7940.field34100,
                  this.getPosX() + this.rand.nextGaussian() * 0.13F,
                  this.getBoundingBox().field28453 + 0.5 + this.rand.nextGaussian() * 0.13F,
                  this.getPosZ() + this.rand.nextGaussian() * 0.13F,
                  0.0,
                  0.0,
                  0.0
               );
         }
      }
   }

   @Override
   public float method3072(Class8654 var1, float var2) {
      var2 = super.method3072(var1, var2);
      if (var1.method31109() == this) {
         var2 = 0.0F;
      }

      if (var1.method31144()) {
         var2 = (float)((double)var2 * 0.15);
      }

      return var2;
   }

   @Override
   public void method4530(LivingEntity var1, float var2) {
      if (!this.method4568()) {
         Vector3d var5 = var1.method3433();
         double var6 = var1.getPosX() + var5.x - this.getPosX();
         double var8 = var1.method3442() - 1.1F - this.getPosY();
         double var10 = var1.getPosZ() + var5.z - this.getPosZ();
         float var12 = MathHelper.method37766(var6 * var6 + var10 * var10);
         Class8812 var13 = Class8137.field35003;
         if (!(var1 instanceof Class1026)) {
            if (var12 >= 8.0F && !var1.method3033(Effects.SLOWNESS)) {
               var13 = Class8137.field34993;
            } else if (var1.getHealth() >= 8.0F && !var1.method3033(Effects.POISON)) {
               var13 = Class8137.field35005;
            } else if (var12 <= 3.0F && !var1.method3033(Effects.WEAKNESS) && this.rand.nextFloat() < 0.25F) {
               var13 = Class8137.field35014;
            }
         } else {
            if (!(var1.getHealth() <= 4.0F)) {
               var13 = Class8137.field35008;
            } else {
               var13 = Class8137.field35001;
            }

            this.method4233((LivingEntity)null);
         }

         Class896 var14 = new Class896(this.world, this);
         var14.method3511(Class9741.method38187(new ItemStack(Items.field38115), var13));
         var14.rotationPitch -= -20.0F;
         var14.shoot(var6, var8 + (double)(var12 * 0.2F), var10, 0.75F, 8.0F);
         if (!this.method3245()) {
            this.world
               .method6743(
                  (PlayerEntity)null,
                  this.getPosX(),
                  this.getPosY(),
                  this.getPosZ(),
                  Sounds.field27238,
                  this.method2864(),
                  1.0F,
                  0.8F + this.rand.nextFloat() * 0.4F
               );
         }

         this.world.method6916(var14);
      }
   }

   @Override
   public float method2957(Pose var1, EntitySize var2) {
      return 1.62F;
   }

   @Override
   public void method4545(int var1, boolean var2) {
   }

   @Override
   public boolean method4570() {
      return false;
   }
}
