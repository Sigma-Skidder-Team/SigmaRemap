package mapped;

import com.google.common.collect.ImmutableMap;
import net.minecraft.entity.EntityType;

import java.util.List;
import java.util.Optional;

public class Class3736 extends Class3676<Class1018> {
   private static String[] field19854;
   private final EntityType<? extends Class1018> field19855;
   private final float field19856;
   private long field19857;

   public Class3736(EntityType<? extends Class1018> var1, float var2) {
      super(
         ImmutableMap.of(
            Class8830.field39819,
            Class2217.field14484,
            Class8830.field39829,
            Class2217.field14485,
            Class8830.field39824,
            Class2217.field14486,
            Class8830.field39825,
            Class2217.field14486
         ),
         325
      );
      this.field19855 = var1;
      this.field19856 = var2;
   }

   public boolean method12508(ServerWorld var1, Class1018 var2) {
      return var2.method4507() && this.method12666(var2).isPresent();
   }

   public void method12502(ServerWorld var1, Class1018 var2, long var3) {
      Class1018 var7 = this.method12666(var2).get();
      var2.method2992().method21406(Class8830.field39829, var7);
      var7.method2992().method21406(Class8830.field39829, var2);
      Class6983.method21569(var2, var7, this.field19856);
      int var8 = 275 + var2.method3013().nextInt(50);
      this.field19857 = var3 + (long)var8;
   }

   public boolean method12499(ServerWorld var1, Class1018 var2, long var3) {
      if (!this.method12665(var2)) {
         return false;
      } else {
         Class1018 var7 = this.method12664(var2);
         return var7.method3066() && var2.method4386(var7) && Class6983.method21570(var2.method2992(), var7) && var3 <= this.field19857;
      }
   }

   public void method12504(ServerWorld var1, Class1018 var2, long var3) {
      Class1018 var7 = this.method12664(var2);
      Class6983.method21569(var2, var7, this.field19856);
      if (var2.method3213(var7, 3.0) && var3 >= this.field19857) {
         var2.method4509(var1, var7);
         var2.method2992().method21405(Class8830.field39829);
         var7.method2992().method21405(Class8830.field39829);
      }
   }

   public void method12506(ServerWorld var1, Class1018 var2, long var3) {
      var2.method2992().method21405(Class8830.field39829);
      var2.method2992().method21405(Class8830.field39824);
      var2.method2992().method21405(Class8830.field39825);
      this.field19857 = 0L;
   }

   private Class1018 method12664(Class1018 var1) {
      return (Class1018)var1.method2992().<Class1045>method21410(Class8830.field39829).get();
   }

   private boolean method12665(Class1018 var1) {
      Class6947<?> var4 = var1.method2992();
      return var4.method21404(Class8830.field39829) && var4.method21410(Class8830.field39829).get().getType() == this.field19855;
   }

   private Optional<? extends Class1018> method12666(Class1018 var1) {
      return var1.method2992()
         .<List<Class880>>method21410(Class8830.field39819)
         .get()
         .stream()
         .filter(var1x -> var1x.getType() == this.field19855)
         .<Class1018>map(var0 -> (Class1018)var0)
         .filter(var1::method4386)
         .findFirst();
   }
}
