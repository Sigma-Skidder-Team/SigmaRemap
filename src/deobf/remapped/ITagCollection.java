package remapped;

import com.google.common.collect.ImmutableBiMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableSet.Builder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public interface ITagCollection<T> {
   Map<Identifier, class_2307<T>> method_43137();

   @Nullable
   default class_2307<T> method_43140(Identifier var1) {
      return this.method_43137().get(var1);
   }

   class_2307<T> method_43145(Identifier var1);

   @Nullable
   Identifier method_43144(class_2307<T> var1);

   default Identifier method_43147(class_2307<T> var1) {
      Identifier var4 = this.method_43144(var1);
      if (var4 != null) {
         return var4;
      } else {
         throw new IllegalStateException("Unrecognized tag");
      }
   }

   default Collection<Identifier> method_43141() {
      return this.method_43137().keySet();
   }

   default Collection<Identifier> method_43143(T var1) {
      ArrayList var4 = Lists.newArrayList();

      for (Entry var6 : this.method_43137().entrySet()) {
         if (((class_2307)var6.getValue()).method_10609(var1)) {
            var4.add(var6.getKey());
         }
      }

      return var4;
   }

   default void method_43139(class_8248 var1, class_3991<T> var2) {
      Map var5 = this.method_43137();
      var1.method_37743(var5.size());

      for (Entry var7 : var5.entrySet()) {
         var1.method_37780((Identifier)var7.getKey());
         var1.method_37743(((class_2307)var7.getValue()).method_10608().size());

         for (Object var9 : ((class_2307)var7.getValue()).method_10608()) {
            var1.method_37743(var2.method_14041(var9));
         }
      }
   }

   static <T> ITagCollection<T> method_43142(class_8248 var0, class_8669<T> var1) {
      HashMap var4 = Maps.newHashMap();
      int var5 = var0.method_37778();

      for (int var6 = 0; var6 < var5; var6++) {
         Identifier var7 = var0.method_37768();
         int var8 = var0.method_37778();
         Builder var9 = ImmutableSet.builder();

         for (int var10 = 0; var10 < var8; var10++) {
            var9.add(var1.method_14040(var0.method_37778()));
         }

         var4.put(var7, class_2307.method_10607(var9.build()));
      }

      return method_43138(var4);
   }

   static <T> ITagCollection<T> method_43146() {
      return method_43138(ImmutableBiMap.of());
   }

   static <T> ITagCollection<T> method_43138(Map<Identifier, class_2307<T>> var0) {
      ImmutableBiMap var3 = ImmutableBiMap.copyOf(var0);
      return new class_3247(var3);
   }
}
