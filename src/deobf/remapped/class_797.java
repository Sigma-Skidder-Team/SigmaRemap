package remapped;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Iterables;
import java.util.Map;
import java.util.Random;
import java.util.Map.Entry;

public class class_797 extends class_5837 {
   private static String[] field_4281;
   private final Map<class_1425, class_7986> field_4280;

   private class_797(class_7279[] var1, Map<class_1425, class_7986> var2) {
      super(var1);
      this.field_4280 = ImmutableMap.copyOf(var2);
   }

   @Override
   public class_1404 method_13321() {
      return class_5116.field_26381;
   }

   @Override
   public class_6098 method_26627(class_6098 var1, class_2792 var2) {
      if (var1.method_27960() == class_4897.field_24846 && !this.field_4280.isEmpty()) {
         Random var5 = var2.method_12693();
         int var6 = var5.nextInt(this.field_4280.size());
         Entry var7 = (Entry)Iterables.get(this.field_4280.entrySet(), var6);
         class_1425 var8 = (class_1425)var7.getKey();
         int var9 = ((class_7986)var7.getValue()).method_14868(var5);
         if (!var8.method_6535()) {
            var9 *= 20;
         }

         class_4699.method_21671(var1, var8, var9);
         return var1;
      } else {
         return var1;
      }
   }

   public static class_9020 method_3537() {
      return new class_9020();
   }
}
