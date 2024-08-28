package mapped;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;

import java.util.List;
import java.util.Optional;

public class Class1093 extends Class1009 implements Class1008, Class1092 {
   private static final Class9289<Boolean> field5982 = Class9361.<Boolean>method35441(Class1093.class, Class7784.field33398);
   private int field5983;
   public static final ImmutableList<? extends Class7963<? extends Class7882<? super Class1093>>> field5984 = ImmutableList.of(
      Class7963.field34239, Class7963.field34240
   );
   public static final ImmutableList<? extends Class8830<?>> field5985 = ImmutableList.of(
      Class8830.field39818,
      Class8830.field39819,
      Class8830.field39822,
      Class8830.field39823,
      Class8830.field39825,
      Class8830.field39824,
      Class8830.field39841,
      Class8830.field39831,
      Class8830.field39826,
      Class8830.field39827
   );

   public Class1093(Class8992<? extends Class1093> var1, Class1655 var2) {
      super(var1, var2);
      this.field5594 = 5;
   }

   @Override
   public Class6971<Class1093> method2993() {
      return Class6947.<Class1093>method21400(field5985, field5984);
   }

   @Override
   public Class6947<?> method2994(Dynamic<?> var1) {
      Class6947 var4 = this.method2993().method21513(var1);
      method5093(var4);
      method5094(var4);
      method5095(var4);
      var4.method21415(ImmutableSet.of(Class8890.field40219));
      var4.method21424(Class8890.field40220);
      var4.method21417();
      return var4;
   }

   private static void method5093(Class6947<Class1093> var0) {
      var0.method21425(Class8890.field40219, 0, ImmutableList.of(new Class3681(45, 90), new Class3735()));
   }

   private static void method5094(Class6947<Class1093> var0) {
      var0.method21425(
         Class8890.field40220,
         10,
         ImmutableList.<Class3676<? super Class1093>>of(
                 new Class3733<>(Class1093::method5096),
            new Class3702<>(new Class3738(8.0F), Class8369.method29318(30, 60)),
            new Class3693<>(ImmutableList.of(Pair.of(new Class3718(0.4F), 2),
                    Pair.of(new Class3694(0.4F, 3), 2), Pair.of(new Class3675(30, 60), 1)))
         )
      );
   }

   private static void method5095(Class6947<Class1093> var0) {
      var0.method21426(
         Class8890.field40229,
         10,
              ImmutableList.<Class3676<? super Class1093>>of(
            new Class3720(1.0F),
            new Class3740<>(Class1093::method5099, new Class3684(40)),
            new Class3740<>(Class1093::method3005, new Class3684(15)),
            new Class3685()
         ),
         Class8830.field39826
      );
   }

   private Optional<? extends Class880> method5096() {
      return this.method2992().<List<Class880>>method21410(Class8830.field39819).orElse(ImmutableList.of()).stream().filter(Class1093::method5097).findFirst();
   }

   private static boolean method5097(Class880 var0) {
      Class8992 var3 = var0.method3204();
      return var3 != Class8992.field41106 && var3 != Class8992.field41017 && Class8088.field34762.test(var0);
   }

   @Override
   public void method2850() {
      super.method2850();
      this.field5063.method35442(field5982, false);
   }

   @Override
   public void method3155(Class9289<?> var1) {
      super.method3155(var1);
      if (field5982.equals(var1)) {
         this.method3385();
      }
   }

   public static Class7037 method5098() {
      return Class1009.method4343()
         .method21849(Class9173.field42105, 40.0)
         .method21849(Class9173.field42108, 0.3F)
         .method21849(Class9173.field42107, 0.6F)
         .method21849(Class9173.field42111, 1.0)
         .method21849(Class9173.field42110, 6.0);
   }

   public boolean method5099() {
      return !this.method3005();
   }

   @Override
   public boolean method3114(Entity var1) {
      if (var1 instanceof Class880) {
         this.field5983 = 10;
         this.field5024.method6786(this, (byte)4);
         this.method2863(Class6067.field27278, 1.0F, this.method3100());
         return Class1092.method5091(this, (Class880)var1);
      } else {
         return false;
      }
   }

   @Override
   public boolean method4295(PlayerEntity var1) {
      return !this.method4296();
   }

   @Override
   public void method3045(Class880 var1) {
      if (!this.method3005()) {
         Class1092.method5092(this, var1);
      }
   }

   @Override
   public double method3310() {
      return (double)this.method3430() - (!this.method3005() ? 0.15 : 0.2);
   }

   @Override
   public boolean method2741(Class8654 var1, float var2) {
      boolean var5 = super.method2741(var1, var2);
      if (!this.field5024.field9020) {
         if (var5 && var1.method31109() instanceof Class880) {
            Class880 var6 = (Class880)var1.method31109();
            if (Class8088.field34762.test(var6) && !Class6983.method21582(this, var6, 4.0)) {
               this.method5100(var6);
            }

            return var5;
         } else {
            return var5;
         }
      } else {
         return false;
      }
   }

   private void method5100(Class880 var1) {
      this.field5011.method21405(Class8830.field39841);
      this.field5011.method21407(Class8830.field39826, var1, 200L);
   }

   @Override
   public Class6947<Class1093> method2992() {
      return (Class6947<Class1093>)super.method2992();
   }

   public void method5101() {
      Class8890 var3 = this.field5011.method21418().orElse((Class8890)null);
      this.field5011.method21423(ImmutableList.of(Class8890.field40229, Class8890.field40220));
      Class8890 var4 = this.field5011.method21418().orElse((Class8890)null);
      if (var4 == Class8890.field40229 && var3 != Class8890.field40229) {
         this.method5102();
      }

      this.method4304(this.field5011.method21404(Class8830.field39826));
   }

   @Override
   public void method4258() {
      this.field5024.method6820().method22503("zoglinBrain");
      this.method2992().method21432((Class1657)this.field5024, this);
      this.field5024.method6820().method22505();
      this.method5101();
   }

   @Override
   public void method4308(boolean var1) {
      this.method3210().method35446(field5982, var1);
      if (!this.field5024.field9020 && var1) {
         this.method3085(Class9173.field42110).method38661(0.5);
      }
   }

   @Override
   public boolean method3005() {
      return this.method3210().<Boolean>method35445(field5982);
   }

   @Override
   public void method2871() {
      if (this.field5983 > 0) {
         this.field5983--;
      }

      super.method2871();
   }

   @Override
   public void method2866(byte var1) {
      if (var1 != 4) {
         super.method2866(var1);
      } else {
         this.field5983 = 10;
         this.method2863(Class6067.field27278, 1.0F, this.method3100());
      }
   }

   @Override
   public int method5082() {
      return this.field5983;
   }

   @Override
   public Class9455 method4241() {
      if (!this.field5024.field9020) {
         return !this.field5011.method21404(Class8830.field39826) ? Class6067.field27276 : Class6067.field27277;
      } else {
         return null;
      }
   }

   @Override
   public Class9455 method2879(Class8654 var1) {
      return Class6067.field27280;
   }

   @Override
   public Class9455 method2880() {
      return Class6067.field27279;
   }

   @Override
   public void method3241(BlockPos var1, Class7380 var2) {
      this.method2863(Class6067.field27281, 0.15F, 1.0F);
   }

   public void method5102() {
      this.method2863(Class6067.field27277, 1.0F, this.method3100());
   }

   @Override
   public void method4257() {
      super.method4257();
      Class7393.method23622(this);
   }

   @Override
   public Class7809 method3089() {
      return Class7809.field33506;
   }

   @Override
   public void method2724(Class39 var1) {
      super.method2724(var1);
      if (this.method3005()) {
         var1.method115("IsBaby", true);
      }
   }

   @Override
   public void method2723(Class39 var1) {
      super.method2723(var1);
      if (var1.method132("IsBaby")) {
         this.method4308(true);
      }
   }
}
