package remapped;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Random;

public class class_6267 extends class_5920<class_7666> {
   private class_2452 field_32017;

   public class_6267(int var1, int var2) {
      super(ImmutableMap.of(), var1, var2);
   }

   public boolean method_28583(class_6331 var1, class_7666 var2) {
      class_1331 var5 = var2.method_37075();
      this.field_32017 = var1.method_28984(var5);
      return this.field_32017 != null && this.field_32017.method_11303() && class_5212.method_23890(var1, var2, var5);
   }

   public boolean method_28582(class_6331 var1, class_7666 var2, long var3) {
      return this.field_32017 != null && !this.field_32017.method_11277();
   }

   public void method_28580(class_6331 var1, class_7666 var2, long var3) {
      this.field_32017 = null;
      var2.method_26525().method_5132(var1.method_29584(), var1.method_29546());
   }

   public void method_28579(class_6331 var1, class_7666 var2, long var3) {
      Random var7 = var2.method_26594();
      if (var7.nextInt(100) == 0) {
         var2.method_2020();
      }

      if (var7.nextInt(200) == 0 && class_5212.method_23890(var1, var2, var2.method_37075())) {
         class_9077 var8 = class_9665.<class_9077>method_44697(class_9077.values(), var7);
         int var9 = var7.nextInt(3);
         class_6098 var10 = this.method_28581(var8, var9);
         class_8612 var11 = new class_8612(var2.field_41768, var2, var2.method_37302(), var2.method_37388(), var2.method_37156(), var10);
         var2.field_41768.method_7509(var11);
      }
   }

   private class_6098 method_28581(class_9077 var1, int var2) {
      class_6098 var5 = new class_6098(class_4897.field_24479, 1);
      class_6098 var6 = new class_6098(class_4897.field_24554);
      class_5734 var7 = var6.method_27978("Explosion");
      ArrayList var8 = Lists.newArrayList();
      var8.add(var1.method_41793());
      var7.method_25968("Colors", var8);
      var7.method_25921("Type", (byte)class_3917.field_19027.method_18131());
      class_5734 var9 = var5.method_27978("Fireworks");
      class_3416 var10 = new class_3416();
      class_5734 var11 = var6.method_28021("Explosion");
      if (var11 != null) {
         var10.add(var11);
      }

      var9.method_25921("Flight", (byte)var2);
      if (!var10.isEmpty()) {
         var9.method_25946("Explosions", var10);
      }

      return var5;
   }
}
