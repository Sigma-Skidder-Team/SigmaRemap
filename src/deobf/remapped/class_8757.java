package remapped;

import java.util.List;
import java.util.Random;

public class class_8757 extends class_6315 {
   private static String[] field_44815;

   public class_8757(int var1, class_9616 var2, class_240 var3) {
      super(class_2746.field_13395, var1);
      this.method_32519(var3);
      this.field_36435 = var2;
   }

   public class_8757(Random var1, int var2, int var3) {
      super(class_2746.field_13395, 0);
      this.method_32519(class_9594.field_48893.method_44313(var1));
      if (this.method_32518().method_1029() != class_9249.field_47219) {
         this.field_36435 = new class_9616(var2, 64, var3, var2 + 19 - 1, 73, var3 + 19 - 1);
      } else {
         this.field_36435 = new class_9616(var2, 64, var3, var2 + 19 - 1, 73, var3 + 19 - 1);
      }
   }

   public class_8757(class_2746 var1, class_5734 var2) {
      super(var1, var2);
   }

   public class_8757(class_5799 var1, class_5734 var2) {
      this(class_2746.field_13395, var2);
   }

   @Override
   public void method_32527(class_7060 var1, List<class_7060> var2, Random var3) {
      this.method_28784((class_1695)var1, var2, var3, 8, 3, false);
      this.method_28785((class_1695)var1, var2, var3, 3, 8, false);
      this.method_28786((class_1695)var1, var2, var3, 3, 8, false);
   }

   public static class_8757 method_40202(List<class_7060> var0, int var1, int var2, int var3, class_240 var4, int var5) {
      class_9616 var8 = class_9616.method_44386(var1, var2, var3, -8, -3, 0, 19, 10, 19, var4);
      return method_28781(var8) && class_7060.method_32502(var0, var8) == null ? new class_8757(var5, var8, var4) : null;
   }

   @Override
   public boolean method_32501(class_700 var1, class_2033 var2, class_6541 var3, Random var4, class_9616 var5, class_2034 var6, class_1331 var7) {
      this.method_32500(var1, var5, 7, 3, 0, 11, 4, 18, class_4783.field_23484.method_29260(), class_4783.field_23484.method_29260(), false);
      this.method_32500(var1, var5, 0, 3, 7, 18, 4, 11, class_4783.field_23484.method_29260(), class_4783.field_23484.method_29260(), false);
      this.method_32500(var1, var5, 8, 5, 0, 10, 7, 18, class_4783.field_23184.method_29260(), class_4783.field_23184.method_29260(), false);
      this.method_32500(var1, var5, 0, 5, 8, 18, 7, 10, class_4783.field_23184.method_29260(), class_4783.field_23184.method_29260(), false);
      this.method_32500(var1, var5, 7, 5, 0, 7, 5, 7, class_4783.field_23484.method_29260(), class_4783.field_23484.method_29260(), false);
      this.method_32500(var1, var5, 7, 5, 11, 7, 5, 18, class_4783.field_23484.method_29260(), class_4783.field_23484.method_29260(), false);
      this.method_32500(var1, var5, 11, 5, 0, 11, 5, 7, class_4783.field_23484.method_29260(), class_4783.field_23484.method_29260(), false);
      this.method_32500(var1, var5, 11, 5, 11, 11, 5, 18, class_4783.field_23484.method_29260(), class_4783.field_23484.method_29260(), false);
      this.method_32500(var1, var5, 0, 5, 7, 7, 5, 7, class_4783.field_23484.method_29260(), class_4783.field_23484.method_29260(), false);
      this.method_32500(var1, var5, 11, 5, 7, 18, 5, 7, class_4783.field_23484.method_29260(), class_4783.field_23484.method_29260(), false);
      this.method_32500(var1, var5, 0, 5, 11, 7, 5, 11, class_4783.field_23484.method_29260(), class_4783.field_23484.method_29260(), false);
      this.method_32500(var1, var5, 11, 5, 11, 18, 5, 11, class_4783.field_23484.method_29260(), class_4783.field_23484.method_29260(), false);
      this.method_32500(var1, var5, 7, 2, 0, 11, 2, 5, class_4783.field_23484.method_29260(), class_4783.field_23484.method_29260(), false);
      this.method_32500(var1, var5, 7, 2, 13, 11, 2, 18, class_4783.field_23484.method_29260(), class_4783.field_23484.method_29260(), false);
      this.method_32500(var1, var5, 7, 0, 0, 11, 1, 3, class_4783.field_23484.method_29260(), class_4783.field_23484.method_29260(), false);
      this.method_32500(var1, var5, 7, 0, 15, 11, 1, 18, class_4783.field_23484.method_29260(), class_4783.field_23484.method_29260(), false);

      for (int var10 = 7; var10 <= 11; var10++) {
         for (int var11 = 0; var11 <= 2; var11++) {
            this.method_32499(var1, class_4783.field_23484.method_29260(), var10, -1, var11, var5);
            this.method_32499(var1, class_4783.field_23484.method_29260(), var10, -1, 18 - var11, var5);
         }
      }

      this.method_32500(var1, var5, 0, 2, 7, 5, 2, 11, class_4783.field_23484.method_29260(), class_4783.field_23484.method_29260(), false);
      this.method_32500(var1, var5, 13, 2, 7, 18, 2, 11, class_4783.field_23484.method_29260(), class_4783.field_23484.method_29260(), false);
      this.method_32500(var1, var5, 0, 0, 7, 3, 1, 11, class_4783.field_23484.method_29260(), class_4783.field_23484.method_29260(), false);
      this.method_32500(var1, var5, 15, 0, 7, 18, 1, 11, class_4783.field_23484.method_29260(), class_4783.field_23484.method_29260(), false);

      for (int var12 = 0; var12 <= 2; var12++) {
         for (int var13 = 7; var13 <= 11; var13++) {
            this.method_32499(var1, class_4783.field_23484.method_29260(), var12, -1, var13, var5);
            this.method_32499(var1, class_4783.field_23484.method_29260(), 18 - var12, -1, var13, var5);
         }
      }

      return true;
   }
}
