package mapped;

import com.google.common.collect.Maps;
import net.minecraft.client.util.Util;
import net.minecraft.entity.*;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.SoundEvent;

import javax.annotation.Nullable;
import java.util.Map;
import java.util.function.Predicate;

public class Class1098 extends Class1013 {
   private static final Class120 field6036 = Class120.method339(Items.field37909, Items.field37910);
   private static final DataParameter<Integer> field6037 = EntityDataManager.<Integer>createKey(Class1098.class, DataSerializers.field33391);
   private static final DataParameter<Boolean> field6038 = EntityDataManager.<Boolean>createKey(Class1098.class, DataSerializers.field33398);
   private static final DataParameter<Boolean> field6039 = EntityDataManager.<Boolean>createKey(Class1098.class, DataSerializers.field33398);
   private static final DataParameter<Integer> field6040 = EntityDataManager.<Integer>createKey(Class1098.class, DataSerializers.field33391);
   public static final Map<Integer, ResourceLocation> field6041 = Util.<Map<Integer, ResourceLocation>>make(Maps.newHashMap(), var0 -> {
      var0.put(0, new ResourceLocation("textures/entity/cat/tabby.png"));
      var0.put(1, new ResourceLocation("textures/entity/cat/black.png"));
      var0.put(2, new ResourceLocation("textures/entity/cat/red.png"));
      var0.put(3, new ResourceLocation("textures/entity/cat/siamese.png"));
      var0.put(4, new ResourceLocation("textures/entity/cat/british_shorthair.png"));
      var0.put(5, new ResourceLocation("textures/entity/cat/calico.png"));
      var0.put(6, new ResourceLocation("textures/entity/cat/persian.png"));
      var0.put(7, new ResourceLocation("textures/entity/cat/ragdoll.png"));
      var0.put(8, new ResourceLocation("textures/entity/cat/white.png"));
      var0.put(9, new ResourceLocation("textures/entity/cat/jellie.png"));
      var0.put(10, new ResourceLocation("textures/entity/cat/all_black.png"));
   });
   private Class2774<PlayerEntity> field6042;
   private Class2680 field6043;
   private float field6044;
   private float field6045;
   private float field6046;
   private float field6047;
   private float field6048;
   private float field6049;

   public Class1098(EntityType<? extends Class1098> var1, World var2) {
      super(var1, var2);
   }

   public ResourceLocation method5249() {
      return field6041.getOrDefault(this.method5250(), field6041.get(0));
   }

   @Override
   public void method4219() {
      this.field6043 = new Class2682(this, 0.6, field6036, true);
      this.field5600.method20002(1, new Class2603(this));
      this.field5600.method20002(1, new Class2778(this));
      this.field5600.method20002(2, new Class2784(this));
      this.field5600.method20002(3, this.field6043);
      this.field5600.method20002(5, new Class2631(this, 1.1, 8));
      this.field5600.method20002(6, new Class2725(this, 1.0, 10.0F, 5.0F, false));
      this.field5600.method20002(7, new Class2637(this, 0.8));
      this.field5600.method20002(8, new Class2745(this, 0.3F));
      this.field5600.method20002(9, new Class2695(this));
      this.field5600.method20002(10, new Class2785(this, 0.8));
      this.field5600.method20002(11, new Class2737(this, 0.8, 1.0000001E-5F));
      this.field5600.method20002(12, new Class2612(this, PlayerEntity.class, 10.0F));
      this.field5601.method20002(1, new Class2716<Class1094>(this, Class1094.class, false, (Predicate<LivingEntity>)null));
      this.field5601.method20002(1, new Class2716<Class1088>(this, Class1088.class, false, Class1088.field5963));
   }

   public int method5250() {
      return this.dataManager.<Integer>method35445(field6037);
   }

   public void method5251(int var1) {
      if (var1 < 0 || var1 >= 11) {
         var1 = this.rand.nextInt(10);
      }

      this.dataManager.method35446(field6037, var1);
   }

   public void method5252(boolean var1) {
      this.dataManager.method35446(field6038, var1);
   }

   public boolean method5253() {
      return this.dataManager.<Boolean>method35445(field6038);
   }

   public void method5254(boolean var1) {
      this.dataManager.method35446(field6039, var1);
   }

   public boolean method5255() {
      return this.dataManager.<Boolean>method35445(field6039);
   }

   public Class112 method5256() {
      return Class112.method315(this.dataManager.<Integer>method35445(field6040));
   }

   public void method5257(Class112 var1) {
      this.dataManager.method35446(field6040, var1.method309());
   }

   @Override
   public void registerData() {
      super.registerData();
      this.dataManager.register(field6037, 1);
      this.dataManager.register(field6038, false);
      this.dataManager.register(field6039, false);
      this.dataManager.register(field6040, Class112.field400.method309());
   }

   @Override
   public void method2724(CompoundNBT var1) {
      super.method2724(var1);
      var1.method102("CatType", this.method5250());
      var1.method100("CollarColor", (byte)this.method5256().method309());
   }

   @Override
   public void method2723(CompoundNBT var1) {
      super.method2723(var1);
      this.method5251(var1.method122("CatType"));
      if (var1.method119("CollarColor", 99)) {
         this.method5257(Class112.method315(var1.method122("CollarColor")));
      }
   }

   @Override
   public void method4258() {
      if (!this.method4228().method20811()) {
         this.method3211(Pose.STANDING);
         this.setSprinting(false);
      } else {
         double var3 = this.method4228().method20812();
         if (var3 != 0.6) {
            if (var3 != 1.33) {
               this.method3211(Pose.STANDING);
               this.setSprinting(false);
            } else {
               this.method3211(Pose.STANDING);
               this.setSprinting(true);
            }
         } else {
            this.method3211(Pose.field13624);
            this.setSprinting(false);
         }
      }
   }

   @Nullable
   @Override
   public SoundEvent method4241() {
      if (!this.method4393()) {
         return Sounds.field26434;
      } else if (!this.method4507()) {
         return this.rand.nextInt(4) != 0 ? Sounds.field26433 : Sounds.field26441;
      } else {
         return Sounds.field26440;
      }
   }

   @Override
   public int method4236() {
      return 120;
   }

   public void method5258() {
      this.method2863(Sounds.field26437, this.method3099(), this.method3100());
   }

   @Override
   public SoundEvent method2879(Class8654 var1) {
      return Sounds.field26439;
   }

   @Override
   public SoundEvent method2880() {
      return Sounds.field26435;
   }

   public static Class7037 method5259() {
      return Class1006.method4220().method21849(Attributes.field42105, 10.0).method21849(Attributes.MOVEMENT_SPEED, 0.3F).method21849(Attributes.field42110, 3.0);
   }

   @Override
   public boolean method2921(float var1, float var2) {
      return false;
   }

   @Override
   public void method4501(PlayerEntity var1, ItemStack var2) {
      if (this.method4381(var2)) {
         this.method2863(Sounds.field26436, 1.0F, 1.0F);
      }

      super.method4501(var1, var2);
   }

   private float method5260() {
      return (float)this.method3086(Attributes.field42110);
   }

   @Override
   public boolean method3114(Entity var1) {
      return var1.method2741(Class8654.method31115(this), this.method5260());
   }

   @Override
   public void tick() {
      super.tick();
      if (this.field6043 != null && this.field6043.method10900() && !this.method4393() && this.ticksExisted % 100 == 0) {
         this.method2863(Sounds.field26438, 1.0F, 1.0F);
      }

      this.method5261();
   }

   private void method5261() {
      if ((this.method5253() || this.method5255()) && this.ticksExisted % 5 == 0) {
         this.method2863(Sounds.field26440, 0.6F + 0.4F * (this.rand.nextFloat() - this.rand.nextFloat()), 1.0F);
      }

      this.method5262();
      this.method5263();
   }

   private void method5262() {
      this.field6045 = this.field6044;
      this.field6047 = this.field6046;
      if (!this.method5253()) {
         this.field6044 = Math.max(0.0F, this.field6044 - 0.22F);
         this.field6046 = Math.max(0.0F, this.field6046 - 0.13F);
      } else {
         this.field6044 = Math.min(1.0F, this.field6044 + 0.15F);
         this.field6046 = Math.min(1.0F, this.field6046 + 0.08F);
      }
   }

   private void method5263() {
      this.field6049 = this.field6048;
      if (!this.method5255()) {
         this.field6048 = Math.max(0.0F, this.field6048 - 0.13F);
      } else {
         this.field6048 = Math.min(1.0F, this.field6048 + 0.1F);
      }
   }

   public float method5264(float var1) {
      return MathHelper.lerp(var1, this.field6045, this.field6044);
   }

   public float method5265(float var1) {
      return MathHelper.lerp(var1, this.field6047, this.field6046);
   }

   public float method5266(float var1) {
      return MathHelper.lerp(var1, this.field6049, this.field6048);
   }

   public Class1098 method4389(ServerWorld var1, Class1045 var2) {
      Class1098 var5 = EntityType.field41012.method33215(var1);
      if (var2 instanceof Class1098) {
         if (!this.rand.nextBoolean()) {
            var5.method5251(((Class1098)var2).method5250());
         } else {
            var5.method5251(this.method5250());
         }

         if (this.method4393()) {
            var5.method4398(this.method4397());
            var5.method4379(true);
            if (!this.rand.nextBoolean()) {
               var5.method5257(((Class1098)var2).method5256());
            } else {
               var5.method5257(this.method5256());
            }
         }
      }

      return var5;
   }

   @Override
   public boolean method4386(Class1018 var1) {
      if (this.method4393()) {
         if (!(var1 instanceof Class1098)) {
            return false;
         } else {
            Class1098 var4 = (Class1098)var1;
            return var4.method4393() && super.method4386(var1);
         }
      } else {
         return false;
      }
   }

   @Nullable
   @Override
   public Class5093 method4276(Class1659 var1, Class9755 var2, Class2202 var3, Class5093 var4, CompoundNBT var5) {
      var4 = super.method4276(var1, var2, var3, var4, var5);
      if (!(var1.method7000() > 0.9F)) {
         this.method5251(this.rand.nextInt(10));
      } else {
         this.method5251(this.rand.nextInt(11));
      }

      ServerWorld var8 = var1.method6970();
      if (var8 instanceof ServerWorld && var8.method6893().method24345(this.getPosition(), true, Structure.field18066).method17117()) {
         this.method5251(10);
         this.method4278();
      }

      return var4;
   }

   @Override
   public ActionResultType method4285(PlayerEntity var1, Hand var2) {
      ItemStack var5 = var1.getHeldItem(var2);
      Item var6 = var5.getItem();
      if (!this.world.isRemote) {
         if (!this.method4393()) {
            if (this.method4381(var5)) {
               this.method4501(var1, var5);
               if (this.rand.nextInt(3) != 0) {
                  this.world.method6786(this, (byte)6);
               } else {
                  this.method4399(var1);
                  this.method4403(true);
                  this.world.method6786(this, (byte)7);
               }

               this.method4278();
               return ActionResultType.field14819;
            }
         } else if (this.method4401(var1)) {
            if (!(var6 instanceof Class3321)) {
               if (var6.method11744() && this.method4381(var5) && this.getHealth() < this.method3075()) {
                  this.method4501(var1, var5);
                  this.method3041((float)var6.method11745().method36157());
                  return ActionResultType.field14819;
               }

               ActionResultType var9 = super.method4285(var1, var2);
               if (!var9.isSuccessOrConsume() || this.method3005()) {
                  this.method4403(!this.method4402());
               }

               return var9;
            }

            Class112 var7 = ((Class3321)var6).method11876();
            if (var7 != this.method5256()) {
               this.method5257(var7);
               if (!var1.abilities.isCreativeMode) {
                  var5.method32182(1);
               }

               this.method4278();
               return ActionResultType.field14819;
            }
         }

         ActionResultType var8 = super.method4285(var1, var2);
         if (var8.isSuccessOrConsume()) {
            this.method4278();
         }

         return var8;
      } else if (this.method4393() && this.method4401(var1)) {
         return ActionResultType.field14818;
      } else {
         return this.method4381(var5) && (this.getHealth() < this.method3075() || !this.method4393()) ? ActionResultType.field14818 : ActionResultType.field14820;
      }
   }

   @Override
   public boolean method4381(ItemStack var1) {
      return field6036.test(var1);
   }

   @Override
   public float method2957(Pose var1, EntitySize var2) {
      return var2.field39969 * 0.5F;
   }

   @Override
   public boolean method4254(double var1) {
      return !this.method4393() && this.ticksExisted > 2400;
   }

   @Override
   public void method4394() {
      if (this.field6042 == null) {
         this.field6042 = new Class2774<PlayerEntity>(this, PlayerEntity.class, 16.0F, 0.8, 1.33);
      }

      this.field5600.method20003(this.field6042);
      if (!this.method4393()) {
         this.field5600.method20002(4, this.field6042);
      }
   }
}
