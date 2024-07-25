package remapped;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_1758 {
   private static final Logger field_9025 = LogManager.getLogger();
   public static final class_1758 field_9032 = new class_1758(class_4933.field_25569, new class_6282[0], new class_2913[0]);
   public static final class_2144 field_9026 = class_4933.field_25571;
   private final class_2144 field_9031;
   private final class_6282[] field_9030;
   private final class_2913[] field_9027;
   private final BiFunction<class_6098, class_2792, class_6098> field_9028;

   private class_1758(class_2144 var1, class_6282[] var2, class_2913[] var3) {
      this.field_9031 = var1;
      this.field_9030 = var2;
      this.field_9027 = var3;
      this.field_9028 = class_5116.method_23457(var3);
   }

   public static Consumer<class_6098> method_7861(Consumer<class_6098> var0) {
      return var1 -> {
         if (var1.method_27997() >= var1.method_28016()) {
            int var4 = var1.method_27997();

            while (var4 > 0) {
               class_6098 var5 = var1.method_27973();
               var5.method_28017(Math.min(var1.method_28016(), var4));
               var4 -= var5.method_27997();
               var0.accept(var5);
            }
         } else {
            var0.accept(var1);
         }
      };
   }

   public void method_7874(class_2792 var1, Consumer<class_6098> var2) {
      if (!var1.method_12688(this)) {
         field_9025.warn("Detected infinite loop in loot tables");
      } else {
         Consumer var5 = class_2913.method_13320(this.field_9028, var2, var1);

         for (class_6282 var9 : this.field_9030) {
            var9.method_28635(var5, var1);
         }

         var1.method_12695(this);
      }
   }

   public void method_7863(class_2792 var1, Consumer<class_6098> var2) {
      this.method_7874(var1, method_7861(var2));
   }

   public List<class_6098> method_7862(class_2792 var1) {
      ArrayList var4 = Lists.newArrayList();
      this.method_7863(var1, var4::add);
      return var4;
   }

   public class_2144 method_7860() {
      return this.field_9031;
   }

   public void method_7867(class_4737 var1) {
      for (int var4 = 0; var4 < this.field_9030.length; var4++) {
         this.field_9030[var4].method_28637(var1.method_21888(".pools[" + var4 + "]"));
      }

      for (int var5 = 0; var5 < this.field_9027.length; var5++) {
         this.field_9027[var5].method_12680(var1.method_21888(".functions[" + var5 + "]"));
      }
   }

   public void method_7872(class_6867 var1, class_2792 var2) {
      List var5 = this.method_7862(var2);
      Random var6 = var2.method_12693();
      List var7 = this.method_7865(var1, var6);
      this.method_7870(var5, var7.size(), var6);

      for (class_6098 var9 : var5) {
         if (var7.isEmpty()) {
            field_9025.warn("Tried to over-fill a container");
            return;
         }

         if (!var9.method_28022()) {
            var1.method_31503((Integer)var7.remove(var7.size() - 1), var9);
         } else {
            var1.method_31503((Integer)var7.remove(var7.size() - 1), class_6098.field_31203);
         }
      }
   }

   private void method_7870(List<class_6098> var1, int var2, Random var3) {
      ArrayList var6 = Lists.newArrayList();
      Iterator var7 = var1.iterator();

      while (var7.hasNext()) {
         class_6098 var8 = (class_6098)var7.next();
         if (!var8.method_28022()) {
            if (var8.method_27997() > 1) {
               var6.add(var8);
               var7.remove();
            }
         } else {
            var7.remove();
         }
      }

      while (var2 - var1.size() - var6.size() > 0 && !var6.isEmpty()) {
         class_6098 var11 = (class_6098)var6.remove(class_9299.method_42824(var3, 0, var6.size() - 1));
         int var9 = class_9299.method_42824(var3, 1, var11.method_27997() / 2);
         class_6098 var10 = var11.method_27953(var9);
         if (var11.method_27997() > 1 && var3.nextBoolean()) {
            var6.add(var11);
         } else {
            var1.add(var11);
         }

         if (var10.method_27997() > 1 && var3.nextBoolean()) {
            var6.add(var10);
         } else {
            var1.add(var10);
         }
      }

      var1.addAll(var6);
      Collections.shuffle(var1, var3);
   }

   private List<Integer> method_7865(class_6867 var1, Random var2) {
      ArrayList var5 = Lists.newArrayList();

      for (int var6 = 0; var6 < var1.method_31505(); var6++) {
         if (var1.method_31498(var6).method_28022()) {
            var5.add(var6);
         }
      }

      Collections.shuffle(var5, var2);
      return var5;
   }

   public static class_8843 method_7864() {
      return new class_8843();
   }
}
