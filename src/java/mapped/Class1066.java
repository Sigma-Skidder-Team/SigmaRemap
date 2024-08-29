package mapped;

import net.minecraft.entity.EntityType;
import net.minecraft.util.ActionResultType;

public abstract class Class1066 extends AbstractHorseEntity {
   private static final DataParameter<Boolean> field5877 = EntityDataManager.<Boolean>method35441(Class1066.class, Class7784.field33398);

   public Class1066(EntityType<? extends Class1066> var1, World var2) {
      super(var1, var2);
      this.field5900 = false;
   }

   @Override
   public void method4925() {
      this.method3085(Class9173.field42105).method38661((double)this.method4971());
   }

   @Override
   public void registerData() {
      super.registerData();
      this.dataManager.register(field5877, false);
   }

   public static Class7037 method4926() {
      return method4951().method21849(Class9173.field42108, 0.175F).method21849(Class9173.field42117, 0.5);
   }

   public boolean method4927() {
      return this.dataManager.<Boolean>method35445(field5877);
   }

   public void method4928(boolean var1) {
      this.dataManager.method35446(field5877, var1);
   }

   @Override
   public int method4891() {
      return !this.method4927() ? super.method4891() : 17;
   }

   @Override
   public double method3310() {
      return super.method3310() - 0.25;
   }

   @Override
   public void method2877() {
      super.method2877();
      if (this.method4927()) {
         if (!this.world.isRemote) {
            this.method3300(Blocks.CHEST);
         }

         this.method4928(false);
      }
   }

   @Override
   public void method2724(CompoundNBT var1) {
      super.method2724(var1);
      var1.method115("ChestedHorse", this.method4927());
      if (this.method4927()) {
         ListNBT var4 = new ListNBT();

         for (int var5 = 2; var5 < this.field5890.method3629(); var5++) {
            ItemStack var6 = this.field5890.method3618(var5);
            if (!var6.isEmpty()) {
               CompoundNBT var7 = new CompoundNBT();
               var7.method100("Slot", (byte)var5);
               var6.method32112(var7);
               var4.add(var7);
            }
         }

         var1.put("Items", var4);
      }
   }

   @Override
   public void method2723(CompoundNBT var1) {
      super.method2723(var1);
      this.method4928(var1.method132("ChestedHorse"));
      if (this.method4927()) {
         ListNBT var4 = var1.method131("Items", 10);
         this.method4948();

         for (int var5 = 0; var5 < var4.size(); var5++) {
            CompoundNBT var6 = var4.method153(var5);
            int var7 = var6.method120("Slot") & 255;
            if (var7 >= 2 && var7 < this.field5890.method3629()) {
               this.field5890.method3621(var7, ItemStack.method32104(var6));
            }
         }
      }

      this.method4903();
   }

   @Override
   public boolean method2963(int var1, ItemStack var2) {
      if (var1 == 499) {
         if (this.method4927() && var2.isEmpty()) {
            this.method4928(false);
            this.method4948();
            return true;
         }

         if (!this.method4927() && var2.getItem() == Blocks.CHEST.method11581()) {
            this.method4928(true);
            this.method4948();
            return true;
         }
      }

      return super.method2963(var1, var2);
   }

   @Override
   public ActionResultType method4285(PlayerEntity var1, Hand var2) {
      ItemStack var5 = var1.getHeldItem(var2);
      if (!this.method3005()) {
         if (this.method4932() && var1.method2851()) {
            this.openGUI(var1);
            return ActionResultType.method9002(this.world.isRemote);
         }

         if (this.isBeingRidden()) {
            return super.method4285(var1, var2);
         }
      }

      if (!var5.isEmpty()) {
         if (this.method4381(var5)) {
            return this.method4953(var1, var5);
         }

         if (!this.method4932()) {
            this.method4896();
            return ActionResultType.method9002(this.world.isRemote);
         }

         if (!this.method4927() && var5.getItem() == Blocks.CHEST.method11581()) {
            this.method4928(true);
            this.method4895();
            if (!var1.abilities.isCreativeMode) {
               var5.method32182(1);
            }

            this.method4948();
            return ActionResultType.method9002(this.world.isRemote);
         }

         if (!this.method3005() && !this.method4943() && var5.getItem() == Items.field37886) {
            this.openGUI(var1);
            return ActionResultType.method9002(this.world.isRemote);
         }
      }

      if (!this.method3005()) {
         this.method4920(var1);
         return ActionResultType.method9002(this.world.isRemote);
      } else {
         return super.method4285(var1, var2);
      }
   }

   public void method4895() {
      this.method2863(Sounds.field26510, 1.0F, (this.rand.nextFloat() - this.rand.nextFloat()) * 0.2F + 1.0F);
   }

   public int method4897() {
      return 5;
   }
}
