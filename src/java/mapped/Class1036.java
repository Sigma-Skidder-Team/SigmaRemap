package mapped;

import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;

import javax.annotation.Nullable;

public class Class1036 extends Class1035 {
   public static final ImmutableList<Class7963<? extends Class7882<? super Class1036>>> field5752 = ImmutableList.of(
      Class7963.field34239, Class7963.field34240, Class7963.field34238, Class7963.field34242, Class7963.field34248
   );
   public static final ImmutableList<Class8830<?>> field5753 = ImmutableList.of(
      Class8830.field39825,
      Class8830.field39833,
      Class8830.field39818,
      Class8830.field39819,
      Class8830.field39822,
      Class8830.field39823,
      Class8830.field39862,
      Class8830.field39861,
      Class8830.field39835,
      Class8830.field39836,
      Class8830.field39824,
      Class8830.field39841,
      new Class8830[]{
         Class8830.field39826,
         Class8830.field39827,
         Class8830.field39828,
         Class8830.field39831,
         Class8830.field39849,
         Class8830.field39848,
         Class8830.field39813
      }
   );

   public Class1036(Class8992<? extends Class1036> var1, World var2) {
      super(var1, var2);
      this.field5594 = 20;
   }

   public static Class7037 method4637() {
      return Class1009.method4343().method21849(Class9173.field42105, 50.0).method21849(Class9173.field42108, 0.35F).method21849(Class9173.field42110, 7.0);
   }

   @Nullable
   @Override
   public Class5093 method4276(Class1659 var1, Class9755 var2, Class2202 var3, Class5093 var4, Class39 var5) {
      Class9743.method38193(this);
      this.method4270(var2);
      return super.method4276(var1, var2, var3, var4, var5);
   }

   @Override
   public void method4270(Class9755 var1) {
      this.method2944(Class2106.field13731, new ItemStack(Class8514.field37818));
   }

   @Override
   public Class6971<Class1036> method2993() {
      return Class6947.<Class1036>method21400(field5753, field5752);
   }

   @Override
   public Class6947<?> method2994(Dynamic<?> var1) {
      return Class9743.method38192(this, this.method2993().method21513(var1));
   }

   @Override
   public Class6947<Class1036> method2992() {
      return (Class6947<Class1036>)super.method2992();
   }

   @Override
   public boolean method4618() {
      return false;
   }

   @Override
   public boolean method4253(ItemStack var1) {
      return var1.method32107() != Class8514.field37818 ? false : super.method4253(var1);
   }

   @Override
   public void method4258() {
      this.field5024.method6820().startSection("piglinBruteBrain");
      this.method2992().method21432((ServerWorld)this.field5024, this);
      this.field5024.method6820().endSection();
      Class9743.method38199(this);
      Class9743.method38205(this);
      super.method4258();
   }

   @Override
   public Class2172 method4622() {
      return this.method4307() && this.method4636() ? Class2172.field14259 : Class2172.field14264;
   }

   @Override
   public boolean method2741(Class8654 var1, float var2) {
      boolean var5 = super.method2741(var1, var2);
      if (!this.field5024.field9020) {
         if (var5 && var1.method31109() instanceof Class880) {
            Class9743.method38204(this, (Class880)var1.method31109());
         }

         return var5;
      } else {
         return false;
      }
   }

   @Override
   public Class9455 method4241() {
      return Class6067.field26939;
   }

   @Override
   public Class9455 method2879(Class8654 var1) {
      return Class6067.field26942;
   }

   @Override
   public Class9455 method2880() {
      return Class6067.field26941;
   }

   @Override
   public void method3241(BlockPos var1, Class7380 var2) {
      this.method2863(Class6067.field26943, 0.15F, 1.0F);
   }

   public void method4638() {
      this.method2863(Class6067.field26940, 1.0F, this.method3100());
   }

   @Override
   public void method4630() {
      this.method2863(Class6067.field26944, 1.0F, this.method3100());
   }
}