package mapped;

import com.google.common.collect.ImmutableMap;
import java.util.Optional;
import java.util.function.Predicate;

public class Class3685<E extends Class1006> extends Class3676<E> {
   private static String[] field19701;
   private final Predicate<Class880> field19702;

   public Class3685(Predicate<Class880> var1) {
      super(ImmutableMap.of(Class8830.field39826, Class2217.field14484, Class8830.field39841, Class2217.field14486));
      this.field19702 = var1;
   }

   public Class3685() {
      this(var0 -> false);
   }

   public void method12502(Class1657 var1, E var2, long var3) {
      if (!method12528(var2)) {
         if (!this.method12529((E)var2)) {
            if (!this.method12526((E)var2)) {
               if (Class8088.field34762.test(this.method12527((E)var2))) {
                  if (this.field19702.test(this.method12527((E)var2))) {
                     this.method12530((E)var2);
                  }
               } else {
                  this.method12530((E)var2);
               }
            } else {
               this.method12530((E)var2);
            }
         } else {
            this.method12530((E)var2);
         }
      } else {
         this.method12530((E)var2);
      }
   }

   private boolean method12526(E var1) {
      return this.method12527((E)var1).field5024 != var1.field5024;
   }

   private Class880 method12527(E var1) {
      return var1.method2992().<Class880>method21410(Class8830.field39826).get();
   }

   private static <E extends Class880> boolean method12528(E var0) {
      Optional var3 = var0.method2992().<Long>method21410(Class8830.field39841);
      return var3.isPresent() && var0.field5024.method6783() - (Long)var3.get() > 200L;
   }

   private boolean method12529(E var1) {
      Optional var4 = var1.method2992().<Class880>method21410(Class8830.field39826);
      return var4.isPresent() && !((Class880)var4.get()).method3066();
   }

   private void method12530(E var1) {
      var1.method2992().method21405(Class8830.field39826);
   }
}
