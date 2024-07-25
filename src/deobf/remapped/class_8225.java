package remapped;

import java.util.List;
import java.util.Random;

public class class_8225 extends class_8549 {
   private final int field_42225;

   public class_8225(int var1, class_9616 var2, Direction var3) {
      super(class_2746.field_13435, var1);
      this.method_32519(var3);
      this.field_36435 = var2;
      this.field_42225 = var3 != Direction.field_818 && var3 != Direction.field_800 ? var2.method_44393() : var2.method_44387();
   }

   public class_8225(class_5799 var1, class_5734 var2) {
      super(class_2746.field_13435, var2);
      this.field_42225 = var2.method_25947("Steps");
   }

   @Override
   public void method_32517(class_5734 var1) {
      super.method_32517(var1);
      var1.method_25931("Steps", this.field_42225);
   }

   public static class_9616 method_37659(List<class_7060> var0, Random var1, int var2, int var3, int var4, Direction var5) {
      byte var8 = 3;
      class_9616 var9 = class_9616.method_44386(var2, var3, var4, -1, -1, 0, 5, 5, 4, var5);
      class_7060 var10 = class_7060.method_32502(var0, var9);
      if (var10 == null) {
         return null;
      } else {
         if (var10.method_32512().field_48995 == var9.field_48995) {
            for (int var11 = 3; var11 >= 1; var11--) {
               var9 = class_9616.method_44386(var2, var3, var4, -1, -1, 0, 5, 5, var11 - 1, var5);
               if (!var10.method_32512().method_44402(var9)) {
                  return class_9616.method_44386(var2, var3, var4, -1, -1, 0, 5, 5, var11, var5);
               }
            }
         }

         return null;
      }
   }

   @Override
   public boolean method_32501(class_700 var1, class_2033 var2, class_6541 var3, Random var4, class_9616 var5, class_2034 var6, class_1331 var7) {
      for (int var10 = 0; var10 < this.field_42225; var10++) {
         this.method_32529(var1, class_4783.field_23355.method_29260(), 0, 0, var10, var5);
         this.method_32529(var1, class_4783.field_23355.method_29260(), 1, 0, var10, var5);
         this.method_32529(var1, class_4783.field_23355.method_29260(), 2, 0, var10, var5);
         this.method_32529(var1, class_4783.field_23355.method_29260(), 3, 0, var10, var5);
         this.method_32529(var1, class_4783.field_23355.method_29260(), 4, 0, var10, var5);

         for (int var11 = 1; var11 <= 3; var11++) {
            this.method_32529(var1, class_4783.field_23355.method_29260(), 0, var11, var10, var5);
            this.method_32529(var1, class_4783.field_23765.method_29260(), 1, var11, var10, var5);
            this.method_32529(var1, class_4783.field_23765.method_29260(), 2, var11, var10, var5);
            this.method_32529(var1, class_4783.field_23765.method_29260(), 3, var11, var10, var5);
            this.method_32529(var1, class_4783.field_23355.method_29260(), 4, var11, var10, var5);
         }

         this.method_32529(var1, class_4783.field_23355.method_29260(), 0, 4, var10, var5);
         this.method_32529(var1, class_4783.field_23355.method_29260(), 1, 4, var10, var5);
         this.method_32529(var1, class_4783.field_23355.method_29260(), 2, 4, var10, var5);
         this.method_32529(var1, class_4783.field_23355.method_29260(), 3, 4, var10, var5);
         this.method_32529(var1, class_4783.field_23355.method_29260(), 4, 4, var10, var5);
      }

      return true;
   }
}
