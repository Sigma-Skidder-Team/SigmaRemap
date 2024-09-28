package mapped;

import com.google.common.collect.Maps;
import net.minecraft.state.StateContainer;

import java.util.Collection;
import java.util.Map;
import java.util.function.Function;

public class Class7558<O, S extends Class7378<O, S>> {
   private final O field32410;
   private final Map<String, Class8550<?>> field32411 = Maps.newHashMap();

   public Class7558(O var1) {
      this.field32410 = (O)var1;
   }

   public Class7558<O, S> method24737(Class8550<?>... var1) {
      for (Class8550 var7 : var1) {
         this.method24738(var7);
         this.field32411.put(var7.method30472(), var7);
      }

      return this;
   }

   private <T extends Comparable<T>> void method24738(Class8550<T> var1) {
      String var4 = var1.method30472();
      if (!StateContainer.method35404().matcher(var4).matches()) {
         throw new IllegalArgumentException(this.field32410 + " has invalidly named property: " + var4);
      } else {
         Collection<T> var5 = var1.method30474();
         if (var5.size() <= 1) {
            throw new IllegalArgumentException(this.field32410 + " attempted use property " + var4 + " with <= 1 possible values");
         } else {
            for (Comparable var7 : var5) {
               String var8 = var1.method30475((T)var7);
               if (!StateContainer.method35404().matcher(var8).matches()) {
                  throw new IllegalArgumentException(this.field32410 + " has property: " + var4 + " with invalidly named value: " + var8);
               }
            }

            if (this.field32411.containsKey(var4)) {
               throw new IllegalArgumentException(this.field32410 + " has duplicate property: " + var4);
            }
         }
      }
   }

   public StateContainer<O, S> method24739(Function<O, S> var1, Class6967<O, S> var2) {
      return new StateContainer<O, S>(var1, this.field32410, var2, this.field32411);
   }
}
