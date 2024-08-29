package mapped;

import javax.annotation.Nullable;
import java.util.UUID;

public class Class1074 extends AbstractHorseEntity {
   private static final UUID field5916 = UUID.fromString("556E1665-8B10-40C8-8F9D-CF9B1667F295");
   private static final DataParameter<Integer> field5917 = EntityDataManager.<Integer>method35441(Class1074.class, Class7784.field33391);

   public Class1074(EntityType<? extends Class1074> var1, World var2) {
      super(var1, var2);
   }

   @Override
   public void method4925() {
      this.method3085(Class9173.field42105).method38661((double)this.method4971());
      this.method3085(Class9173.field42108).method38661(this.method4973());
      this.method3085(Class9173.field42117).method38661(this.method4972());
   }

   @Override
   public void registerData() {
      super.registerData();
      this.dataManager.register(field5917, 0);
   }

   @Override
   public void method2724(CompoundNBT var1) {
      super.method2724(var1);
      var1.method102("Variant", this.method4993());
      if (!this.field5890.method3618(1).isEmpty()) {
         var1.put("ArmorItem", this.field5890.method3618(1).method32112(new CompoundNBT()));
      }
   }

   public ItemStack method4990() {
      return this.method2943(Class2106.field13735);
   }

   private void method4991(ItemStack var1) {
      this.method2944(Class2106.field13735, var1);
      this.method4279(Class2106.field13735, 0.0F);
   }

   @Override
   public void method2723(CompoundNBT var1) {
      super.method2723(var1);
      this.method4992(var1.method122("Variant"));
      if (var1.method119("ArmorItem", 10)) {
         ItemStack var4 = ItemStack.method32104(var1.getCompound("ArmorItem"));
         if (!var4.isEmpty() && this.method4900(var4)) {
            this.field5890.method3621(1, var4);
         }
      }

      this.method4903();
   }

   private void method4992(int var1) {
      this.dataManager.method35446(field5917, var1);
   }

   private int method4993() {
      return this.dataManager.<Integer>method35445(field5917);
   }

   private void method4994(Class2190 var1, Class2102 var2) {
      this.method4992(var1.method8899() & 0xFF | var2.method8766() << 8 & 0xFF00);
   }

   public Class2190 method4995() {
      return Class2190.method8900(this.method4993() & 0xFF);
   }

   public Class2102 method4996() {
      return Class2102.method8767((this.method4993() & 0xFF00) >> 8);
   }

   @Override
   public void method4903() {
      if (!this.world.field9020) {
         super.method4903();
         this.method4997(this.field5890.method3618(1));
         this.method4279(Class2106.field13735, 0.0F);
      }
   }

   private void method4997(ItemStack var1) {
      this.method4991(var1);
      if (!this.world.field9020) {
         this.method3085(Class9173.field42113).method38671(field5916);
         if (this.method4900(var1)) {
            int var4 = ((Class3275)var1.getItem()).method11798();
            if (var4 != 0) {
               this.method3085(Class9173.field42113).method38667(new Class9689(field5916, "Horse armor bonus", (double)var4, Class2045.field13352));
            }
         }
      }
   }

   @Override
   public void method4902(Class920 var1) {
      ItemStack var4 = this.method4990();
      super.method4902(var1);
      ItemStack var5 = this.method4990();
      if (this.ticksExisted > 20 && this.method4900(var5) && var4 != var5) {
         this.method2863(Sounds.field26669, 0.5F, 1.0F);
      }
   }

   @Override
   public void method4950(Class8447 var1) {
      super.method4950(var1);
      if (this.rand.nextInt(10) == 0) {
         this.method2863(Sounds.field26670, var1.method29710() * 0.6F, var1.method29711());
      }
   }

   @Override
   public Class9455 method4241() {
      super.method4241();
      return Sounds.field26667;
   }

   @Override
   public Class9455 method2880() {
      super.method2880();
      return Sounds.field26671;
   }

   @Nullable
   @Override
   public Class9455 method4894() {
      return Sounds.field26672;
   }

   @Override
   public Class9455 method2879(Class8654 var1) {
      super.method2879(var1);
      return Sounds.field26674;
   }

   @Override
   public Class9455 method4893() {
      super.method4893();
      return Sounds.field26668;
   }

   @Override
   public ActionResultType method4285(PlayerEntity var1, Hand var2) {
      ItemStack var5 = var1.getHeldItem(var2);
      if (!this.method3005()) {
         if (this.method4932() && var1.method2851()) {
            this.openGUI(var1);
            return ActionResultType.method9002(this.world.field9020);
         }

         if (this.isBeingRidden()) {
            return super.method4285(var1, var2);
         }
      }

      if (!var5.isEmpty()) {
         if (this.method4381(var5)) {
            return this.method4953(var1, var5);
         }

         ActionResultType var6 = var5.method32125(var1, this, var2);
         if (var6.isSuccessOrConsume()) {
            return var6;
         }

         if (!this.method4932()) {
            this.method4896();
            return ActionResultType.method9002(this.world.field9020);
         }

         boolean var7 = !this.method3005() && !this.method4943() && var5.getItem() == Items.field37886;
         if (this.method4900(var5) || var7) {
            this.openGUI(var1);
            return ActionResultType.method9002(this.world.field9020);
         }
      }

      if (!this.method3005()) {
         this.method4920(var1);
         return ActionResultType.method9002(this.world.field9020);
      } else {
         return super.method4285(var1, var2);
      }
   }

   @Override
   public boolean method4386(Class1018 var1) {
      if (var1 != this) {
         return !(var1 instanceof Class1067) && !(var1 instanceof Class1074) ? false : this.method4961() && ((AbstractHorseEntity)var1).method4961();
      } else {
         return false;
      }
   }

   @Override
   public Class1045 method4389(ServerWorld var1, Class1045 var2) {
      AbstractHorseEntity var6;
      if (!(var2 instanceof Class1067)) {
         Class1074 var5 = (Class1074)var2;
         var6 = EntityType.field41038.method33215(var1);
         int var7 = this.rand.nextInt(9);
         Class2190 var8;
         if (var7 >= 4) {
            if (var7 >= 8) {
               var8 = Util.<Class2190>method38518(Class2190.values(), this.rand);
            } else {
               var8 = var5.method4995();
            }
         } else {
            var8 = this.method4995();
         }

         int var9 = this.rand.nextInt(5);
         Class2102 var10;
         if (var9 >= 2) {
            if (var9 >= 4) {
               var10 = Util.<Class2102>method38518(Class2102.values(), this.rand);
            } else {
               var10 = var5.method4996();
            }
         } else {
            var10 = this.method4996();
         }

         ((Class1074)var6).method4994(var8, var10);
      } else {
         var6 = EntityType.field41057.method33215(var1);
      }

      this.method4962(var2, var6);
      return var6;
   }

   @Override
   public boolean method4898() {
      return true;
   }

   @Override
   public boolean method4900(ItemStack var1) {
      return var1.getItem() instanceof Class3275;
   }

   @Nullable
   @Override
   public Class5093 method4276(Class1659 var1, Class9755 var2, Class2202 var3, Class5093 var4, CompoundNBT var5) {
      Class2190 var8;
      if (!(var4 instanceof Class5098)) {
         var8 = Util.<Class2190>method38518(Class2190.values(), this.rand);
         var4 = new Class5098(var8);
      } else {
         var8 = ((Class5098)var4).field23195;
      }

      this.method4994(var8, Util.<Class2102>method38518(Class2102.values(), this.rand));
      return super.method4276(var1, var2, var3, (Class5093)var4, var5);
   }
}
