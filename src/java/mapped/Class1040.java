package mapped;

import com.mojang.serialization.DataResult;
import com.mojang.serialization.Dynamic;

import javax.annotation.Nullable;
import java.util.UUID;

public class Class1040 extends Class1038 implements Class1041 {
   private static final Class9289<Boolean> field5769 = Class9361.<Boolean>method35441(Class1040.class, Class7784.field33398);
   private static final Class9289<Class7921> field5770 = Class9361.<Class7921>method35441(Class1040.class, Class7784.field33406);
   private int field5771;
   private UUID field5772;
   private Class30 field5773;
   private Class39 field5774;
   private int field5775;

   public Class1040(Class8992<? extends Class1040> var1, World var2) {
      super(var1, var2);
      this.method4673(this.method4674().method26574(Class2348.field16090.method9254(this.field5054)));
   }

   @Override
   public void method2850() {
      super.method2850();
      this.field5063.method35442(field5769, false);
      this.field5063.method35442(field5770, new Class7921(Class9564.field44542, Class8395.field36011, 1));
   }

   @Override
   public void method2724(Class39 var1) {
      super.method2724(var1);
      Class7921.field33913
         .encodeStart(Class8063.field34602, this.method4674())
         .resultOrPartial(field5012::error)
         .ifPresent(var1x -> var1.method99("VillagerData", var1x));
      if (this.field5774 != null) {
         var1.method99("Offers", this.field5774);
      }

      if (this.field5773 != null) {
         var1.method99("Gossips", this.field5773);
      }

      var1.method102("ConversionTime", !this.method4667() ? -1 : this.field5771);
      if (this.field5772 != null) {
         var1.method104("ConversionPlayer", this.field5772);
      }

      var1.method102("Xp", this.field5775);
   }

   @Override
   public void method2723(Class39 var1) {
      super.method2723(var1);
      if (var1.method119("VillagerData", 10)) {
         DataResult<Class7921> var4 = Class7921.field33913.parse(new Dynamic<>(Class8063.field34602, var1.method116("VillagerData")));
         var4.resultOrPartial(field5012::error).ifPresent(this::method4673);
      }

      if (var1.method119("Offers", 10)) {
         this.field5774 = var1.method130("Offers");
      }

      if (var1.method119("Gossips", 10)) {
         this.field5773 = var1.method131("Gossips", 10);
      }

      if (var1.method119("ConversionTime", 99) && var1.method122("ConversionTime") > -1) {
         this.method4668(!var1.method106("ConversionPlayer") ? null : var1.method105("ConversionPlayer"), var1.method122("ConversionTime"));
      }

      if (var1.method119("Xp", 3)) {
         this.field5775 = var1.method122("Xp");
      }
   }

   @Override
   public void tick() {
      if (!this.field5024.field9020 && this.method3066() && this.method4667()) {
         int var3 = this.method4670();
         this.field5771 -= var3;
         if (this.field5771 <= 0) {
            this.method4669((ServerWorld)this.field5024);
         }
      }

      super.tick();
   }

   @Override
   public ActionResultType method4285(PlayerEntity var1, Hand var2) {
      ItemStack var5 = var1.getHeldItem(var2);
      if (var5.method32107() != Class8514.field37872) {
         return super.method4285(var1, var2);
      } else if (!this.method3033(Class8254.field35484)) {
         return ActionResultType.field14819;
      } else {
         if (!var1.field4919.field29609) {
            var5.method32182(1);
         }

         if (!this.field5024.field9020) {
            this.method4668(var1.getUniqueID(), this.field5054.nextInt(2401) + 3600);
         }

         return ActionResultType.field14818;
      }
   }

   @Override
   public boolean method4645() {
      return false;
   }

   @Override
   public boolean method4254(double var1) {
      return !this.method4667() && this.field5775 == 0;
   }

   public boolean method4667() {
      return this.method3210().<Boolean>method35445(field5769);
   }

   private void method4668(UUID var1, int var2) {
      this.field5772 = var1;
      this.field5771 = var2;
      this.method3210().method35446(field5769, true);
      this.method3040(Class8254.field35484);
      this.method3035(new Class2023(Class8254.field35471, var2, Math.min(this.field5024.method6997().method8905() - 1, 0)));
      this.field5024.method6786(this, (byte)16);
   }

   @Override
   public void method2866(byte var1) {
      if (var1 != 16) {
         super.method2866(var1);
      } else if (!this.method3245()) {
         this.field5024
            .method6745(
               this.getPosX(),
               this.method3442(),
               this.getPosZ(),
               Class6067.field27301,
               this.method2864(),
               1.0F + this.field5054.nextFloat(),
               this.field5054.nextFloat() * 0.7F + 0.3F,
               false
            );
      }
   }

   private void method4669(ServerWorld var1) {
      Class1042 var4 = this.<Class1042>method4292(Class8992.field41098, false);

      for (Class2106 var8 : Class2106.values()) {
         ItemStack var9 = this.method2943(var8);
         if (!var9.method32105()) {
            if (!Class7858.method26334(var9)) {
               double var10 = (double)this.method4269(var8);
               if (var10 > 1.0) {
                  this.method3302(var9);
               }
            } else {
               var4.method2963(var8.method8773() + 300, var9);
            }
         }
      }

      var4.method4695(this.method4674());
      if (this.field5773 != null) {
         var4.method4725(this.field5773);
      }

      if (this.field5774 != null) {
         var4.method4706(new Class46(this.field5774));
      }

      var4.method4722(this.field5775);
      var4.method4276(var1, var1.method6807(var4.method3432()), Class2202.field14399, (Class5093)null, (Class39)null);
      if (this.field5772 != null) {
         PlayerEntity var12 = var1.method7196(this.field5772);
         if (var12 instanceof Class878) {
            CriteriaTriggers.field44482.method15121((Class878)var12, this, var4);
            var1.method6959(Class8214.field35285, var12, var4);
         }
      }

      var4.method3035(new Class2023(Class8254.field35475, 200, 0));
      if (!this.method3245()) {
         var1.method6869((PlayerEntity)null, 1027, this.method3432(), 0);
      }
   }

   private int method4670() {
      int var3 = 1;
      if (this.field5054.nextFloat() < 0.01F) {
         int var4 = 0;
         Mutable var5 = new Mutable();

         for (int var6 = (int)this.getPosX() - 4; var6 < (int)this.getPosX() + 4 && var4 < 14; var6++) {
            for (int var7 = (int)this.getPosY() - 4; var7 < (int)this.getPosY() + 4 && var4 < 14; var7++) {
               for (int var8 = (int)this.getPosZ() - 4; var8 < (int)this.getPosZ() + 4 && var4 < 14; var8++) {
                  Block var9 = this.field5024.method6738(var5.method8372(var6, var7, var8)).method23383();
                  if (var9 == Blocks.IRON_BARS || var9 instanceof Class3250) {
                     if (this.field5054.nextFloat() < 0.3F) {
                        var3++;
                     }

                     var4++;
                  }
               }
            }
         }
      }

      return var3;
   }

   @Override
   public float method3100() {
      return !this.method3005()
         ? (this.field5054.nextFloat() - this.field5054.nextFloat()) * 0.2F + 1.0F
         : (this.field5054.nextFloat() - this.field5054.nextFloat()) * 0.2F + 2.0F;
   }

   @Override
   public Class9455 method4241() {
      return Class6067.field27299;
   }

   @Override
   public Class9455 method2879(Class8654 var1) {
      return Class6067.field27303;
   }

   @Override
   public Class9455 method2880() {
      return Class6067.field27302;
   }

   @Override
   public Class9455 method4643() {
      return Class6067.field27304;
   }

   @Override
   public ItemStack method4644() {
      return ItemStack.EMPTY;
   }

   public void method4671(Class39 var1) {
      this.field5774 = var1;
   }

   public void method4672(Class30 var1) {
      this.field5773 = var1;
   }

   @Nullable
   @Override
   public Class5093 method4276(Class1659 var1, Class9755 var2, Class2202 var3, Class5093 var4, Class39 var5) {
      this.method4673(this.method4674().method26573(Class9564.method37068(var1.method7178(this.method3432()))));
      return super.method4276(var1, var2, var3, var4, var5);
   }

   public void method4673(Class7921 var1) {
      Class7921 var4 = this.method4674();
      if (var4.method26571() != var1.method26571()) {
         this.field5774 = null;
      }

      this.field5063.method35446(field5770, var1);
   }

   @Override
   public Class7921 method4674() {
      return this.field5063.<Class7921>method35445(field5770);
   }

   public void method4675(int var1) {
      this.field5775 = var1;
   }
}
