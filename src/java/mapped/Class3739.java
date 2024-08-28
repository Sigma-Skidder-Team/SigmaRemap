package mapped;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;

import javax.annotation.Nullable;
import java.util.*;
import java.util.Map.Entry;

public class Class3739 extends Class3676<Class1046> {
   private static String[] field19863;

   public Class3739() {
      super(
         ImmutableMap.of(
            Class8830.field39820,
            Class2217.field14484,
            Class8830.field39824,
            Class2217.field14485,
            Class8830.field39825,
            Class2217.field14486,
            Class8830.field39828,
            Class2217.field14486
         )
      );
   }

   public boolean method12508(Class1657 var1, Class1046 var2) {
      return var1.method6814().nextInt(10) == 0 && this.method12691(var2);
   }

   public void method12502(Class1657 var1, Class1046 var2, long var3) {
      Class880 var7 = this.method12688(var2);
      if (var7 == null) {
         Optional var8 = this.method12684(var2);
         if (!var8.isPresent()) {
            this.method12683(var2).ifPresent(var1x -> method12682(var2, var1x));
         } else {
            method12682(var2, (Class880)var8.get());
         }
      } else {
         this.method12681(var1, var2, var7);
      }
   }

   private void method12681(Class1657 var1, Class1046 var2, Class880 var3) {
      for (int var6 = 0; var6 < 10; var6++) {
         Vector3d var7 = Class8037.method27583(var2, 20, 8);
         if (var7 != null && var1.method6952(new BlockPos(var7))) {
            var2.method2992().method21406(Class8830.field39824, new Class8999(var7, 0.6F, 0));
            return;
         }
      }
   }

   private static void method12682(Class1046 var0, Class880 var1) {
      Class6947 var4 = var0.method2992();
      var4.method21406(Class8830.field39828, var1);
      var4.method21406(Class8830.field39825, new Class7865(var1, true));
      var4.method21406(Class8830.field39824, new Class8999(new Class7865(var1, false), 0.6F, 1));
   }

   private Optional<Class880> method12683(Class1046 var1) {
      return this.method12686(var1).stream().findAny();
   }

   private Optional<Class880> method12684(Class1046 var1) {
      Map<Class880, Integer> var4 = this.method12685(var1);
      return var4.entrySet()
         .stream()
         .sorted(Comparator.comparingInt(Entry::getValue))
         .filter(var0 -> (Integer)var0.getValue() > 0 && (Integer)var0.getValue() <= 5)
         .<Class880>map(Entry::getKey)
         .findFirst();
   }

   private Map<Class880, Integer> method12685(Class1046 var1) {
      HashMap<Class880, Integer> var4 = Maps.newHashMap();
      this.method12686(var1).stream().filter(this::method12689).forEach(var2 -> {
         Integer var5 = var4.compute(this.method12687(var2), (var0, var1xx) -> (var1xx != null ? var1xx + 1 : 1));
      });
      return var4;
   }

   private List<Class880> method12686(Class1046 var1) {
      return var1.method2992().<List<Class880>>method21410(Class8830.field39820).get();
   }

   private Class880 method12687(Class880 var1) {
      return var1.method2992().<Class880>method21410(Class8830.field39828).get();
   }

   @Nullable
   private Class880 method12688(Class880 var1) {
      return var1.method2992()
         .<List<Class880>>method21410(Class8830.field39820)
         .get()
         .stream()
         .filter(var2 -> this.method12690(var1, var2))
         .findAny()
         .orElse((Class880)null);
   }

   private boolean method12689(Class880 var1) {
      return var1.method2992().<Class880>method21410(Class8830.field39828).isPresent();
   }

   private boolean method12690(Class880 var1, Class880 var2) {
      return var2.method2992().<Class880>method21410(Class8830.field39828).filter(var1x -> var1x == var1).isPresent();
   }

   private boolean method12691(Class1046 var1) {
      return var1.method2992().method21404(Class8830.field39820);
   }
}
