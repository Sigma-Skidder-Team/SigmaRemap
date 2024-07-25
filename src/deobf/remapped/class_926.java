package remapped;

import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import it.unimi.dsi.fastutil.objects.ObjectSet;
import java.util.List;

public enum class_926 {
   private final ThreadLocal<List<ObjectSet<class_1331>>> field_4757 = ThreadLocal.<List<ObjectSet<class_1331>>>withInitial(
      () -> Lists.newArrayListWithCapacity(7)
   );

   public class_926(boolean var3, class_6414... var4) {
   }

   @Override
   public class_2522 method_43653(class_2522 var1, class_240 var2, class_2522 var3, class_9379 var4, class_1331 var5, class_1331 var6) {
      class_2522 var9 = var1.method_8359(var2, var4.method_28262(var6), var4, var5, var6);
      if (var1 != var9) {
         int var10 = var9.<Integer>method_10313(class_6023.field_30689);
         List var11 = this.field_4757.get();
         if (var11.isEmpty()) {
            for (int var12 = 0; var12 < 7; var12++) {
               var11.add(new ObjectOpenHashSet());
            }
         }

         ((ObjectSet)var11.get(var10)).add(var5.method_6072());
      }

      return var1;
   }

   @Override
   public void method_43652(class_9379 var1) {
      class_2921 var4 = new class_2921();
      List var5 = this.field_4757.get();

      for (int var6 = 2; var6 < var5.size(); var6++) {
         int var7 = var6 - 1;
         ObjectSet var8 = (ObjectSet)var5.get(var7);
         ObjectSet var9 = (ObjectSet)var5.get(var6);
         ObjectIterator var10 = var8.iterator();

         while (var10.hasNext()) {
            class_1331 var11 = (class_1331)var10.next();
            class_2522 var12 = var1.method_28262(var11);
            if (var12.<Integer>method_10313(class_6023.field_30689) >= var7) {
               var1.method_7513(var11, var12.method_10308(class_6023.field_30689, Integer.valueOf(var7)), 18);
               if (var6 != 7) {
                  for (class_240 var16 : field_18694) {
                     var4.method_13371(var11, var16);
                     class_2522 var17 = var1.method_28262(var4);
                     if (var17.method_10307(class_6023.field_30689) && var12.<Integer>method_10313(class_6023.field_30689) > var6) {
                        var9.add(var4.method_6072());
                     }
                  }
               }
            }
         }
      }

      var5.clear();
   }
}
