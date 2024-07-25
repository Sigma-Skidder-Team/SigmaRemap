package remapped;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public abstract class class_150 {
   public final Map<Class<?>, class_4650> field_441 = new HashMap<Class<?>, class_4650>();
   public class_4650 field_437;
   public final Map<Class<?>, class_4650> field_438 = new LinkedHashMap<Class<?>, class_4650>();
   public class_7587 field_443 = null;
   public class_435 field_440 = class_435.field_1823;
   public final Map<Object, class_1621> field_444 = new class_7563(this);
   public Object field_439;
   private class_6402 field_436;
   private boolean field_442 = false;

   public class_1621 method_600(Object var1) {
      class_1621 var4 = this.method_595(var1);
      this.field_444.clear();
      this.field_439 = null;
      return var4;
   }

   public final class_1621 method_595(Object var1) {
      this.field_439 = var1;
      if (!this.field_444.containsKey(this.field_439)) {
         if (var1 == null) {
            return this.field_437.method_21502(null);
         } else {
            Class var4 = var1.getClass();
            class_1621 var6;
            if (!this.field_441.containsKey(var4)) {
               for (Class var7 : this.field_438.keySet()) {
                  if (var7 != null && var7.isInstance(var1)) {
                     class_4650 var8 = this.field_438.get(var7);
                     return var8.method_21502(var1);
                  }
               }

               if (!this.field_438.containsKey(null)) {
                  class_4650 var9 = this.field_441.get(null);
                  var6 = var9.method_21502(var1);
               } else {
                  class_4650 var10 = this.field_438.get(null);
                  var6 = var10.method_21502(var1);
               }
            } else {
               class_4650 var11 = this.field_441.get(var4);
               var6 = var11.method_21502(var1);
            }

            return var6;
         }
      } else {
         return this.field_444.get(this.field_439);
      }
   }

   public class_1621 method_590(class_9592 var1, String var2, class_7587 var3) {
      if (var3 == null) {
         var3 = this.field_443;
      }

      return new class_8437(var1, var2, null, null, var3);
   }

   public class_1621 method_589(class_9592 var1, String var2) {
      return this.method_590(var1, var2, null);
   }

   public class_1621 method_596(class_9592 var1, Iterable<?> var2, class_435 var3) {
      int var6 = 10;
      if (var2 instanceof List) {
         var6 = ((List)var2).size();
      }

      ArrayList var7 = new ArrayList(var6);
      class_1596 var8 = new class_1596(var1, var7, var3);
      this.field_444.put(this.field_439, var8);
      class_435 var9 = class_435.field_1826;

      for (Object var11 : var2) {
         class_1621 var12 = this.method_595(var11);
         if (!(var12 instanceof class_8437) || !((class_8437)var12).method_38815()) {
            var9 = class_435.field_1822;
         }

         var7.add(var12);
      }

      if (var3 == class_435.field_1823) {
         if (this.field_440 == class_435.field_1823) {
            var8.method_10281(var9);
         } else {
            var8.method_10281(this.field_440);
         }
      }

      return var8;
   }

   public class_1621 method_588(class_9592 var1, Map<?, ?> var2, class_435 var3) {
      ArrayList var6 = new ArrayList(var2.size());
      class_7984 var7 = new class_7984(var1, var6, var3);
      this.field_444.put(this.field_439, var7);
      class_435 var8 = class_435.field_1826;

      for (Entry var10 : var2.entrySet()) {
         class_1621 var11 = this.method_595(var10.getKey());
         class_1621 var12 = this.method_595(var10.getValue());
         if (!(var11 instanceof class_8437) || !((class_8437)var11).method_38815()) {
            var8 = class_435.field_1822;
         }

         if (!(var12 instanceof class_8437) || !((class_8437)var12).method_38815()) {
            var8 = class_435.field_1822;
         }

         var6.add(new class_8473(var11, var12));
      }

      if (var3 == class_435.field_1823) {
         if (this.field_440 == class_435.field_1823) {
            var7.method_10281(var8);
         } else {
            var7.method_10281(this.field_440);
         }
      }

      return var7;
   }

   public void method_594(class_7587 var1) {
      this.field_443 = var1;
   }

   public class_7587 method_593() {
      return this.field_443 != null ? this.field_443 : class_7587.field_38646;
   }

   public void method_592(class_435 var1) {
      this.field_440 = var1;
   }

   public class_435 method_587() {
      return this.field_440;
   }

   public void method_599(class_6402 var1) {
      this.field_436 = var1;
      this.field_442 = true;
   }

   public final class_6402 method_597() {
      if (this.field_436 == null) {
         this.field_436 = new class_6402();
      }

      return this.field_436;
   }

   public final boolean method_591() {
      return this.field_442;
   }
}
