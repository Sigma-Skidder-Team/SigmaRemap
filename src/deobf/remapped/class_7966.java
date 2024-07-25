package remapped;

import com.google.common.collect.Queues;
import java.util.ArrayDeque;
import java.util.Deque;

public class class_7966 {
   private static String[] field_40813;
   public Deque<class_6279> field_40811 = new ArrayDeque<class_6279>();
   private final Deque<class_6279> field_40812 = Util.<Deque<class_6279>>method_44659(Queues.newArrayDeque(), var0 -> {
      class_8107 var3 = new class_8107();
      var3.method_36817();
      class_6555 var4 = new class_6555();
      var4.method_29888();
      var0.add(new class_6279(var3, var4, null));
   });

   public void method_36065(double var1, double var3, double var5) {
      class_6279 var9 = this.field_40812.getLast();
      class_6279.method_28617(var9).method_36829((float)var1, (float)var3, (float)var5);
   }

   public void method_36062(float var1, float var2, float var3) {
      class_6279 var6 = this.field_40812.getLast();
      class_6279.method_28617(var6).method_36826(var1, var2, var3);
      if (var1 == var2 && var2 == var3) {
         if (var1 > 0.0F) {
            return;
         }

         class_6279.method_28619(var6).method_29889(-1.0F);
      }

      float var7 = 1.0F / var1;
      float var8 = 1.0F / var2;
      float var9 = 1.0F / var3;
      float var10 = class_9299.method_42817(var7 * var8 * var9);
      class_6279.method_28619(var6).method_29891(class_6555.method_29884(var10 * var7, var10 * var8, var10 * var9));
   }

   public void method_36060(class_5422 var1) {
      class_6279 var4 = this.field_40812.getLast();
      class_6279.method_28617(var4).method_36831(var1);
      class_6279.method_28619(var4).method_29890(var1);
   }

   public void method_36063() {
      class_6279 var3 = this.field_40812.getLast();
      class_6279 var4 = this.field_40811.pollLast();
      if (var4 != null) {
         class_6279.method_28617(var4).method_36804(class_6279.method_28617(var3));
         class_6279.method_28619(var4).method_29901(class_6279.method_28619(var3));
      } else {
         var4 = new class_6279(class_6279.method_28617(var3).method_36824(), class_6279.method_28619(var3).method_29882(), null);
      }

      this.field_40812.addLast(var4);
   }

   public void method_36064() {
      class_6279 var3 = this.field_40812.removeLast();
      if (var3 != null) {
         this.field_40811.add(var3);
      }
   }

   public class_6279 method_36058() {
      return this.field_40812.getLast();
   }

   public boolean method_36059() {
      return this.field_40812.size() == 1;
   }

   @Override
   public String toString() {
      return this.method_36058().toString();
   }
}
