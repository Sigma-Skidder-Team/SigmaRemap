package remapped;

import java.util.concurrent.atomic.AtomicReferenceArray;
import javax.annotation.Nullable;

public final class class_6007 {
   private static String[] field_30587;
   public final AtomicReferenceArray<class_2654> field_30586;
   private final int field_30589;
   private final int field_30591;
   private volatile int field_30590;
   private volatile int field_30592;
   private int field_30585;

   private class_6007(class_5360 var1, int var2) {
      this.field_30588 = var1;
      this.field_30589 = var2;
      this.field_30591 = var2 * 2 + 1;
      this.field_30586 = new AtomicReferenceArray<class_2654>(this.field_30591 * this.field_30591);
   }

   public int method_27420(int var1, int var2) {
      return Math.floorMod(var2, this.field_30591) * this.field_30591 + Math.floorMod(var1, this.field_30591);
   }

   public void method_27423(int var1, class_2654 var2) {
      class_2654 var5 = this.field_30586.getAndSet(var1, var2);
      if (var5 != null) {
         this.field_30585--;
         class_5360.method_24469(this.field_30588).method_740(var5);
      }

      if (var2 != null) {
         this.field_30585++;
      }
   }

   public class_2654 method_27421(int var1, class_2654 var2, class_2654 var3) {
      if (this.field_30586.compareAndSet(var1, var2, var3) && var3 == null) {
         this.field_30585--;
      }

      class_5360.method_24469(this.field_30588).method_740(var2);
      return var2;
   }

   private boolean method_27424(int var1, int var2) {
      return Math.abs(var1 - this.field_30590) <= this.field_30589 && Math.abs(var2 - this.field_30592) <= this.field_30589;
   }

   @Nullable
   public class_2654 method_27416(int var1) {
      return this.field_30586.get(var1);
   }
}
