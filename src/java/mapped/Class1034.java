package mapped;

import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;

import javax.annotation.Nullable;
import java.util.List;
import java.util.Random;
import java.util.UUID;

public class Class1034 extends Class1035 implements Class1023 {
   private static final Class9289<Boolean> field5741 = Class9361.<Boolean>method35441(Class1034.class, Class7784.field33398);
   private static final Class9289<Boolean> field5742 = Class9361.<Boolean>method35441(Class1034.class, Class7784.field33398);
   private static final Class9289<Boolean> field5743 = Class9361.<Boolean>method35441(Class1034.class, Class7784.field33398);
   private static final UUID field5744 = UUID.fromString("766bfa64-11f3-11ea-8d71-362b9e155667");
   private static final Class9689 field5745 = new Class9689(field5744, "Baby speed boost", 0.2F, Class2045.field13353);
   private final Class927 field5746 = new Class927(8);
   private boolean field5747 = false;
   public static final ImmutableList<Class7963<? extends Class7882<? super Class1034>>> field5748 = ImmutableList.of(
      Class7963.field34239, Class7963.field34240, Class7963.field34238, Class7963.field34242, Class7963.field34247
   );
   public static final ImmutableList<Class8830<?>> field5749 = ImmutableList.of(
      Class8830.field39825,
      Class8830.field39833,
      Class8830.field39818,
      Class8830.field39819,
      Class8830.field39822,
      Class8830.field39823,
      Class8830.field39862,
      Class8830.field39861,
      Class8830.field39847,
      Class8830.field39835,
      Class8830.field39836,
      Class8830.field39824,
      new Class8830[]{
         Class8830.field39841,
         Class8830.field39826,
         Class8830.field39827,
         Class8830.field39828,
         Class8830.field39831,
         Class8830.field39849,
         Class8830.field39850,
         Class8830.field39837,
         Class8830.field39851,
         Class8830.field39852,
         Class8830.field39854,
         Class8830.field39853,
         Class8830.field39856,
         Class8830.field39857,
         Class8830.field39855,
         Class8830.field39859,
         Class8830.field39848,
         Class8830.field39865,
         Class8830.field39830,
         Class8830.field39866,
         Class8830.field39867,
         Class8830.field39858,
         Class8830.field39860,
         Class8830.field39868,
         Class8830.field39869,
         Class8830.field39870
      }
   );

   public Class1034(Class8992<? extends Class1035> var1, Class1655 var2) {
      super(var1, var2);
      this.field5594 = 5;
   }

   @Override
   public void method2724(Class39 var1) {
      super.method2724(var1);
      if (this.method3005()) {
         var1.method115("IsBaby", true);
      }

      if (this.field5747) {
         var1.method115("CannotHunt", true);
      }

      var1.method99("Inventory", this.field5746.method3683());
   }

   @Override
   public void method2723(Class39 var1) {
      super.method2723(var1);
      this.method4308(var1.method132("IsBaby"));
      this.method4617(var1.method132("CannotHunt"));
      this.field5746.method3682(var1.method131("Inventory", 10));
   }

   @Override
   public void method3054(Class8654 var1, int var2, boolean var3) {
      super.method3054(var1, var2, var3);
      this.field5746.method3674().forEach(this::method3302);
   }

   public ItemStack method4612(ItemStack var1) {
      return this.field5746.method3676(var1);
   }

   public boolean method4613(ItemStack var1) {
      return this.field5746.method3677(var1);
   }

   @Override
   public void method2850() {
      super.method2850();
      this.field5063.method35442(field5741, false);
      this.field5063.method35442(field5742, false);
      this.field5063.method35442(field5743, false);
   }

   @Override
   public void method3155(Class9289<?> var1) {
      super.method3155(var1);
      if (field5741.equals(var1)) {
         this.method3385();
      }
   }

   public static Class7037 method4614() {
      return Class1009.method4343().method21849(Class9173.field42105, 16.0).method21849(Class9173.field42108, 0.35F).method21849(Class9173.field42110, 5.0);
   }

   public static boolean method4615(Class8992<Class1034> var0, Class1660 var1, Class2202 var2, BlockPos var3, Random var4) {
      return !var1.method6738(var3.method8313()).method23448(Blocks.field36891);
   }

   @Nullable
   @Override
   public Class5093 method4276(Class1659 var1, Class9755 var2, Class2202 var3, Class5093 var4, Class39 var5) {
      if (var3 != Class2202.field14394) {
         if (!(var1.method6814().nextFloat() < 0.2F)) {
            if (this.method4635()) {
               this.method2944(Class2106.field13731, this.method4620());
            }
         } else {
            this.method4308(true);
         }
      }

      Class4388.method13799(this);
      this.method4270(var2);
      this.method4273(var2);
      return super.method4276(var1, var2, var3, var4, var5);
   }

   @Override
   public boolean method4256() {
      return false;
   }

   @Override
   public boolean method4254(double var1) {
      return !this.method4282();
   }

   @Override
   public void method4270(Class9755 var1) {
      if (this.method4635()) {
         this.method4616(Class2106.field13736, new ItemStack(Class8514.field37860));
         this.method4616(Class2106.field13735, new ItemStack(Class8514.field37861));
         this.method4616(Class2106.field13734, new ItemStack(Class8514.field37862));
         this.method4616(Class2106.field13733, new ItemStack(Class8514.field37863));
      }
   }

   private void method4616(Class2106 var1, ItemStack var2) {
      if (this.field5024.field9016.nextFloat() < 0.1F) {
         this.method2944(var1, var2);
      }
   }

   @Override
   public Class6971<Class1034> method2993() {
      return Class6947.<Class1034>method21400(field5749, field5748);
   }

   @Override
   public Class6947<?> method2994(Dynamic<?> var1) {
      return Class4388.method13798(this, this.method2993().method21513(var1));
   }

   @Override
   public Class6947<Class1034> method2992() {
      return (Class6947<Class1034>)super.method2992();
   }

   @Override
   public Class2274 method4285(PlayerEntity var1, Hand var2) {
      Class2274 var5 = super.method4285(var1, var2);
      if (!var5.method9000()) {
         if (!this.field5024.field9020) {
            return Class4388.method13833(this, var1, var2);
         } else {
            boolean var6 = Class4388.method13834(this, var1.method3094(var2)) && this.method4622() != Class2172.field14262;
            return !var6 ? Class2274.field14820 : Class2274.field14818;
         }
      } else {
         return var5;
      }
   }

   @Override
   public float method2957(Class2090 var1, Class8847 var2) {
      return !this.method3005() ? 1.74F : 0.93F;
   }

   @Override
   public double method3310() {
      return (double)this.method3430() * 0.92;
   }

   @Override
   public void method4308(boolean var1) {
      this.method3210().method35446(field5741, var1);
      if (!this.field5024.field9020) {
         Class9805 var4 = this.method3085(Class9173.field42108);
         var4.method38670(field5745);
         if (var1) {
            var4.method38667(field5745);
         }
      }
   }

   @Override
   public boolean method3005() {
      return this.method3210().<Boolean>method35445(field5741);
   }

   private void method4617(boolean var1) {
      this.field5747 = var1;
   }

   @Override
   public boolean method4618() {
      return !this.field5747;
   }

   @Override
   public void method4258() {
      this.field5024.method6820().method22503("piglinBrain");
      this.method2992().method21432((ServerWorld)this.field5024, this);
      this.field5024.method6820().method22505();
      Class4388.method13812(this);
      super.method4258();
   }

   @Override
   public int method2937(PlayerEntity var1) {
      return this.field5594;
   }

   @Override
   public void method4619(ServerWorld var1) {
      Class4388.method13818(this);
      this.field5746.method3674().forEach(this::method3302);
      super.method4619(var1);
   }

   private ItemStack method4620() {
      return !((double)this.field5054.nextFloat() < 0.5) ? new ItemStack(Class8514.field37815) : new ItemStack(Class8514.field38148);
   }

   private boolean method4621() {
      return this.field5063.<Boolean>method35445(field5742);
   }

   @Override
   public void method4535(boolean var1) {
      this.field5063.method35446(field5742, var1);
   }

   @Override
   public void method4537() {
      this.field4973 = 0;
   }

   @Override
   public Class2172 method4622() {
      if (!this.method4623()) {
         if (Class4388.method13827(this.method3091().method32107())) {
            return Class2172.field14262;
         } else if (this.method4307() && this.method4636()) {
            return Class2172.field14259;
         } else if (this.method4621()) {
            return Class2172.field14261;
         } else {
            return this.method4307() && this.method3092(Class8514.field38148) ? Class2172.field14260 : Class2172.field14264;
         }
      } else {
         return Class2172.field14263;
      }
   }

   public boolean method4623() {
      return this.field5063.<Boolean>method35445(field5743);
   }

   public void method4624(boolean var1) {
      this.field5063.method35446(field5743, var1);
   }

   @Override
   public boolean method2741(Class8654 var1, float var2) {
      boolean var5 = super.method2741(var1, var2);
      if (!this.field5024.field9020) {
         if (var5 && var1.method31109() instanceof Class880) {
            Class4388.method13835(this, (Class880)var1.method31109());
         }

         return var5;
      } else {
         return false;
      }
   }

   @Override
   public void method4530(Class880 var1, float var2) {
      this.method4538(this, 1.6F);
   }

   @Override
   public void method4536(Class880 var1, ItemStack var2, Class882 var3, float var4) {
      this.method4539(this, var1, var3, var4, 1.6F);
   }

   @Override
   public boolean method4234(Class3262 var1) {
      return var1 == Class8514.field38148;
   }

   public void method4625(ItemStack var1) {
      this.method4248(Class2106.field13731, var1);
   }

   public void method4626(ItemStack var1) {
      if (var1.method32107() != Class4388.field21458) {
         this.method4248(Class2106.field13732, var1);
      } else {
         this.method2944(Class2106.field13732, var1);
         this.method4249(Class2106.field13732);
      }
   }

   @Override
   public boolean method4253(ItemStack var1) {
      return this.field5024.method6789().method17135(Class5462.field24224) && this.method4280() && Class4388.method13826(this, var1);
   }

   public boolean method4627(ItemStack var1) {
      Class2106 var4 = Class1006.method4271(var1);
      ItemStack var5 = this.method2943(var4);
      return this.method4250(var1, var5);
   }

   @Override
   public boolean method4250(ItemStack var1, ItemStack var2) {
      if (Class7858.method26334(var2)) {
         return false;
      } else {
         boolean var5 = Class4388.method13827(var1.method32107()) || var1.method32107() == Class8514.field38148;
         boolean var6 = Class4388.method13827(var2.method32107()) || var2.method32107() == Class8514.field38148;
         if (var5 && !var6) {
            return true;
         } else if (!var5 && var6) {
            return false;
         } else {
            return this.method4635() && var1.method32107() != Class8514.field38148 && var2.method32107() == Class8514.field38148
               ? false
               : super.method4250(var1, var2);
         }
      }
   }

   @Override
   public void method4246(Class1000 var1) {
      this.method3134(var1);
      Class4388.method13814(this, var1);
   }

   @Override
   public boolean method2758(Entity var1, boolean var2) {
      if (this.method3005() && var1.method3204() == Class8992.field41037) {
         var1 = this.method4628(var1, 3);
      }

      return super.method2758(var1, var2);
   }

   private Entity method4628(Entity var1, int var2) {
      List var5 = var1.method3408();
      return var2 != 1 && !var5.isEmpty() ? this.method4628((Entity)var5.get(0), var2 - 1) : var1;
   }

   @Override
   public Class9455 method4241() {
      return !this.field5024.field9020 ? Class4388.method13837(this).orElse((Class9455)null) : null;
   }

   @Override
   public Class9455 method2879(Class8654 var1) {
      return Class6067.field26935;
   }

   @Override
   public Class9455 method2880() {
      return Class6067.field26933;
   }

   @Override
   public void method3241(BlockPos var1, Class7380 var2) {
      this.method2863(Class6067.field26937, 0.15F, 1.0F);
   }

   public void method4629(Class9455 var1) {
      this.method2863(var1, this.method3099(), this.method3100());
   }

   @Override
   public void method4630() {
      this.method4629(Class6067.field26938);
   }
}
