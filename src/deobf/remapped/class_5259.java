package remapped;

import java.util.List;
import java.util.Random;

public class class_5259 extends class_8549 {
   private static String[] field_26909;

   public class_5259(int var1, Random var2, class_9616 var3, Direction var4) {
      super(class_2746.field_13436, var1);
      this.method_32519(var4);
      this.field_43750 = this.method_39333(var2);
      this.field_36435 = var3;
   }

   public class_5259(class_5799 var1, CompoundNBT var2) {
      super(class_2746.field_13436, var2);
   }

   @Override
   public void method_32527(class_7060 var1, List<class_7060> var2, Random var3) {
      this.method_39334((class_4960)var1, var2, var3, 1, 1);
   }

   public static class_5259 method_24025(List<class_7060> var0, Random var1, int var2, int var3, int var4, Direction var5, int var6) {
      class_9616 var9 = class_9616.method_44386(var2, var3, var4, -1, -7, 0, 5, 11, 8, var5);
      return method_39332(var9) && class_7060.method_32502(var0, var9) == null ? new class_5259(var6, var1, var9, var5) : null;
   }

   @Override
   public boolean method_32501(class_700 var1, class_2033 var2, class_6541 var3, Random var4, class_9616 var5, class_2034 var6, class_1331 var7) {
      this.method_32511(var1, var5, 0, 0, 0, 4, 10, 7, true, var4, class_7965.method_36051());
      this.method_39330(var1, var4, var5, this.field_43750, 1, 7, 0);
      this.method_39330(var1, var4, var5, class_4030.field_19578, 1, 1, 7);
      class_2522 var10 = class_4783.field_23364.method_29260().method_10308(class_3049.field_14946, Direction.field_800);

      for (int var11 = 0; var11 < 6; var11++) {
         this.method_32529(var1, var10, 1, 6 - var11, 1 + var11, var5);
         this.method_32529(var1, var10, 2, 6 - var11, 1 + var11, var5);
         this.method_32529(var1, var10, 3, 6 - var11, 1 + var11, var5);
         if (var11 < 5) {
            this.method_32529(var1, class_4783.field_23355.method_29260(), 1, 5 - var11, 1 + var11, var5);
            this.method_32529(var1, class_4783.field_23355.method_29260(), 2, 5 - var11, 1 + var11, var5);
            this.method_32529(var1, class_4783.field_23355.method_29260(), 3, 5 - var11, 1 + var11, var5);
         }
      }

      return true;
   }
}
