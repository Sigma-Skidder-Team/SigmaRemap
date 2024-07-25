package remapped;

import java.util.ArrayList;
import java.util.List;

public class class_9350 extends class_1859 {
   private List<class_6220> field_47707 = new ArrayList<class_6220>();
   public int field_47709;

   public class_9350(class_7038 var1, String var2, int var3, int var4) {
      super(var1, var2, var3, var4, 200, 18, class_590.field_3421, false);
      byte var13 = 0;
      boolean var7 = true;

      for (class_1828 var11 : class_1828.values()) {
         String var10004 = "badge" + var11.field_9278;
         var13 += 25;
         class_1816 var12;
         this.method_32148(var12 = new class_1816(this, var10004, var13, 0, var11));
         if (var7) {
            var12.field_9223 = true;
            this.field_47709 = var11.field_9273;
         }

         var12.method_32100((var1x, var2x) -> {
            for (class_7038 var6 : var1x.method_32167().method_32134()) {
               if (var6 instanceof class_1816) {
                  ((class_1816)var6).field_9223 = false;
                  ((class_1816)var6).field_9222.method_11119(class_4043.field_19618);
               }
            }

            ((class_1816)var1x).field_9223 = true;
            ((class_1816)var1x).field_9222.method_11119(class_4043.field_19620);
            this.field_47709 = ((class_1816)var1x).field_9220.field_9273;
         });
         var7 = false;
      }
   }
}
