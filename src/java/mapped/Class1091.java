package mapped;

import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;

import javax.annotation.Nullable;
import java.util.Random;

public class Class1091 extends Class1018 implements Class1008, Class1092 {
   private static final Class9289<Boolean> field5976 = Class9361.<Boolean>method35441(Class1091.class, Class7784.field33398);
   private int field5977;
   private int field5978 = 0;
   private boolean field5979 = false;
   public static final ImmutableList<? extends Class7963<? extends Class7882<? super Class1091>>> field5980 = ImmutableList.of(
      Class7963.field34239, Class7963.field34240, Class7963.field34250, Class7963.field34249
   );
   public static final ImmutableList<? extends Class8830<?>> field5981 = ImmutableList.of(
      Class8830.field39829,
      Class8830.field39818,
      Class8830.field39819,
      Class8830.field39822,
      Class8830.field39823,
      Class8830.field39825,
      Class8830.field39824,
      Class8830.field39841,
      Class8830.field39831,
      Class8830.field39826,
      Class8830.field39827,
      Class8830.field39864
   );

   public Class1091(Class8992<? extends Class1091> var1, World var2) {
      super(var1, var2);
      this.field5594 = 5;
   }

   @Override
   public boolean method4295(PlayerEntity var1) {
      return !this.method4296();
   }

   public static Class7037 method5080() {
      return Class1009.method4343()
         .method21849(Class9173.field42105, 40.0)
         .method21849(Class9173.field42108, 0.3F)
         .method21849(Class9173.field42107, 0.6F)
         .method21849(Class9173.field42111, 1.0)
         .method21849(Class9173.field42110, 6.0);
   }

   @Override
   public boolean method3114(Entity var1) {
      if (var1 instanceof Class880) {
         this.field5977 = 10;
         this.field5024.method6786(this, (byte)4);
         this.method2863(Class6067.field26654, 1.0F, this.method3100());
         Class9069.method33785(this, (Class880)var1);
         return Class1092.method5091(this, (Class880)var1);
      } else {
         return false;
      }
   }

   @Override
   public void method3045(Class880 var1) {
      if (this.method5084()) {
         Class1092.method5092(this, var1);
      }
   }

   @Override
   public boolean method2741(Class8654 var1, float var2) {
      boolean var5 = super.method2741(var1, var2);
      if (!this.field5024.field9020) {
         if (var5 && var1.method31109() instanceof Class880) {
            Class9069.method33793(this, (Class880)var1.method31109());
         }

         return var5;
      } else {
         return false;
      }
   }

   @Override
   public Class6971<Class1091> method2993() {
      return Class6947.<Class1091>method21400(field5981, field5980);
   }

   @Override
   public Class6947<?> method2994(Dynamic<?> var1) {
      return Class9069.method33778(this.method2993().method21513(var1));
   }

   @Override
   public Class6947<Class1091> method2992() {
      return (Class6947<Class1091>)super.method2992();
   }

   @Override
   public void method4258() {
      this.field5024.method6820().method22503("hoglinBrain");
      this.method2992().method21432((ServerWorld)this.field5024, this);
      this.field5024.method6820().method22505();
      Class9069.method33784(this);
      if (!this.method5087()) {
         this.field5978 = 0;
      } else {
         this.field5978++;
         if (this.field5978 > 300) {
            this.method5090(Class6067.field26655);
            this.method5083((ServerWorld)this.field5024);
         }
      }
   }

   @Override
   public void method2871() {
      if (this.field5977 > 0) {
         this.field5977--;
      }

      super.method2871();
   }

   @Override
   public void method4679() {
      if (!this.method3005()) {
         this.field5594 = 5;
         this.method3085(Class9173.field42110).method38661(6.0);
      } else {
         this.field5594 = 3;
         this.method3085(Class9173.field42110).method38661(0.5);
      }
   }

   public static boolean method5081(Class8992<Class1091> var0, Class1660 var1, Class2202 var2, BlockPos var3, Random var4) {
      return !var1.method6738(var3.method8313()).method23448(Blocks.field36891);
   }

   @Nullable
   @Override
   public Class5093 method4276(Class1659 var1, Class9755 var2, Class2202 var3, Class5093 var4, Class39 var5) {
      if (var1.method6814().nextFloat() < 0.2F) {
         this.method4308(true);
      }

      return super.method4276(var1, var2, var3, var4, var5);
   }

   @Override
   public boolean method4254(double var1) {
      return !this.method4282();
   }

   @Override
   public float method4339(BlockPos var1, Class1662 var2) {
      if (!Class9069.method33790(this, var1)) {
         return !var2.method6738(var1.method8313()).method23448(Blocks.field37083) ? 0.0F : 10.0F;
      } else {
         return -1.0F;
      }
   }

   @Override
   public double method3310() {
      return (double)this.method3430() - (!this.method3005() ? 0.15 : 0.2);
   }

   @Override
   public ActionResultType method4285(PlayerEntity var1, Hand var2) {
      ActionResultType var5 = super.method4285(var1, var2);
      if (var5.isSuccessOrConsume()) {
         this.method4278();
      }

      return var5;
   }

   @Override
   public void method2866(byte var1) {
      if (var1 != 4) {
         super.method2866(var1);
      } else {
         this.field5977 = 10;
         this.method2863(Class6067.field26654, 1.0F, this.method3100());
      }
   }

   @Override
   public int method5082() {
      return this.field5977;
   }

   @Override
   public boolean method3009() {
      return true;
   }

   @Override
   public int method2937(PlayerEntity var1) {
      return this.field5594;
   }

   private void method5083(ServerWorld var1) {
      Class1093 var4 = this.<Class1093>method4292(Class8992.field41106, true);
      if (var4 != null) {
         var4.method3035(new Class2023(Class8254.field35475, 200, 0));
      }
   }

   @Override
   public boolean method4381(ItemStack var1) {
      return var1.method32107() == Class8514.field37348;
   }

   public boolean method5084() {
      return !this.method3005();
   }

   @Override
   public void method2850() {
      super.method2850();
      this.field5063.method35442(field5976, false);
   }

   @Override
   public void method2724(Class39 var1) {
      super.method2724(var1);
      if (this.method5086()) {
         var1.method115("IsImmuneToZombification", true);
      }

      var1.method102("TimeInOverworld", this.field5978);
      if (this.field5979) {
         var1.method115("CannotBeHunted", true);
      }
   }

   @Override
   public void method2723(Class39 var1) {
      super.method2723(var1);
      this.method5085(var1.method132("IsImmuneToZombification"));
      this.field5978 = var1.method122("TimeInOverworld");
      this.method5088(var1.method132("CannotBeHunted"));
   }

   public void method5085(boolean var1) {
      this.method3210().method35446(field5976, var1);
   }

   private boolean method5086() {
      return this.method3210().<Boolean>method35445(field5976);
   }

   public boolean method5087() {
      return !this.field5024.method6812().method36880() && !this.method5086() && !this.method4305();
   }

   private void method5088(boolean var1) {
      this.field5979 = var1;
   }

   public boolean method5089() {
      return this.method5084() && !this.field5979;
   }

   @Nullable
   @Override
   public Class1045 method4389(ServerWorld var1, Class1045 var2) {
      Class1091 var5 = Class8992.field41037.method33215(var1);
      if (var5 != null) {
         var5.method4278();
      }

      return var5;
   }

   @Override
   public boolean method4502() {
      return !Class9069.method33803(this) && super.method4502();
   }

   @Override
   public Class2266 method2864() {
      return Class2266.field14733;
   }

   @Override
   public Class9455 method4241() {
      return !this.field5024.field9020 ? Class9069.method33798(this).orElse((Class9455)null) : null;
   }

   @Override
   public Class9455 method2879(Class8654 var1) {
      return Class6067.field26657;
   }

   @Override
   public Class9455 method2880() {
      return Class6067.field26656;
   }

   @Override
   public Class9455 method2859() {
      return Class6067.field26685;
   }

   @Override
   public Class9455 method2860() {
      return Class6067.field26684;
   }

   @Override
   public void method3241(BlockPos var1, Class7380 var2) {
      this.method2863(Class6067.field26659, 0.15F, 1.0F);
   }

   public void method5090(Class9455 var1) {
      this.method2863(var1, this.method3099(), this.method3100());
   }

   @Override
   public void method4257() {
      super.method4257();
      Class7393.method23622(this);
   }
}
