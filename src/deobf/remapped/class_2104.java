package remapped;

import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_2104 extends class_5837 {
   private static final Logger field_10545 = LogManager.getLogger();
   private final List<class_4382> field_10546;

   private class_2104(class_7279[] var1, Collection<class_4382> var2) {
      super(var1);
      this.field_10546 = ImmutableList.copyOf(var2);
   }

   @Override
   public class_1404 method_13321() {
      return class_5116.field_26389;
   }

   @Override
   public ItemStack method_26627(ItemStack var1, class_2792 var2) {
      Random var5 = var2.method_12693();
      class_4382 var6;
      if (!this.field_10546.isEmpty()) {
         var6 = this.field_10546.get(var5.nextInt(this.field_10546.size()));
      } else {
         boolean var7 = var1.method_27960() == class_4897.field_24551;
         List var8 = class_8669.field_44445
            .method_39801()
            .filter(class_4382::method_20434)
            .filter(var2x -> var7 || var2x.method_20430(var1))
            .collect(Collectors.toList());
         if (var8.isEmpty()) {
            field_10545.warn("Couldn't find a compatible enchantment for {}", var1);
            return var1;
         }

         var6 = (class_4382)var8.get(var5.nextInt(var8.size()));
      }

      return method_9864(var1, var6, var5);
   }

   private static ItemStack method_9864(ItemStack var0, class_4382 var1, Random var2) {
      int var5 = class_9299.method_42824(var2, var1.method_20425(), var1.method_20417());
      if (var0.method_27960() != class_4897.field_24551) {
         var0.method_28031(var1, var5);
      } else {
         var0 = new ItemStack(class_4897.field_24879);
         class_7597.method_34503(var0, new class_9693(var1, var5));
      }

      return var0;
   }

   public static class_5363<?> method_9863() {
      return method_26628(var0 -> new class_2104(var0, ImmutableList.of()));
   }
}
