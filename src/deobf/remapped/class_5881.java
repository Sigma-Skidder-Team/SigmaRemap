package remapped;

import java.util.List;
import java.util.Random;

public class class_5881 extends class_6315 {
   private static String[] field_29864;

   public class_5881(int var1, class_9616 var2, Direction var3) {
      super(class_2746.field_13444, var1);
      this.method_32519(var3);
      this.field_36435 = var2;
   }

   public class_5881(class_5799 var1, class_5734 var2) {
      super(class_2746.field_13444, var2);
   }

   @Override
   public void method_32527(class_7060 var1, List<class_7060> var2, Random var3) {
      byte var6 = 1;
      Direction var7 = this.method_32518();
      if (var7 == Direction.field_809 || var7 == Direction.field_818) {
         var6 = 5;
      }

      this.method_28785((class_1695)var1, var2, var3, 0, var6, var3.nextInt(8) > 0);
      this.method_28786((class_1695)var1, var2, var3, 0, var6, var3.nextInt(8) > 0);
   }

   public static class_5881 method_26822(List<class_7060> var0, int var1, int var2, int var3, Direction var4, int var5) {
      class_9616 var8 = class_9616.method_44386(var1, var2, var3, -3, 0, 0, 9, 7, 9, var4);
      return method_28781(var8) && class_7060.method_32502(var0, var8) == null ? new class_5881(var5, var8, var4) : null;
   }

   @Override
   public boolean method_32501(class_700 var1, class_2033 var2, class_6541 var3, Random var4, class_9616 var5, class_2034 var6, class_1331 var7) {
      class_2522 var10 = class_4783.field_23587
         .method_29260()
         .method_10308(class_3821.field_49671, Boolean.valueOf(true))
         .method_10308(class_3821.field_49670, Boolean.valueOf(true));
      class_2522 var11 = class_4783.field_23587
         .method_29260()
         .method_10308(class_3821.field_49664, Boolean.valueOf(true))
         .method_10308(class_3821.field_49667, Boolean.valueOf(true));
      this.method_32500(var1, var5, 0, 0, 0, 8, 1, 8, class_4783.field_23484.method_29260(), class_4783.field_23484.method_29260(), false);
      this.method_32500(var1, var5, 0, 2, 0, 8, 5, 8, class_4783.field_23184.method_29260(), class_4783.field_23184.method_29260(), false);
      this.method_32500(var1, var5, 0, 6, 0, 8, 6, 5, class_4783.field_23484.method_29260(), class_4783.field_23484.method_29260(), false);
      this.method_32500(var1, var5, 0, 2, 0, 2, 5, 0, class_4783.field_23484.method_29260(), class_4783.field_23484.method_29260(), false);
      this.method_32500(var1, var5, 6, 2, 0, 8, 5, 0, class_4783.field_23484.method_29260(), class_4783.field_23484.method_29260(), false);
      this.method_32500(var1, var5, 1, 3, 0, 1, 4, 0, var11, var11, false);
      this.method_32500(var1, var5, 7, 3, 0, 7, 4, 0, var11, var11, false);
      this.method_32500(var1, var5, 0, 2, 4, 8, 2, 8, class_4783.field_23484.method_29260(), class_4783.field_23484.method_29260(), false);
      this.method_32500(var1, var5, 1, 1, 4, 2, 2, 4, class_4783.field_23184.method_29260(), class_4783.field_23184.method_29260(), false);
      this.method_32500(var1, var5, 6, 1, 4, 7, 2, 4, class_4783.field_23184.method_29260(), class_4783.field_23184.method_29260(), false);
      this.method_32500(var1, var5, 1, 3, 8, 7, 3, 8, var11, var11, false);
      this.method_32529(
         var1,
         class_4783.field_23587
            .method_29260()
            .method_10308(class_3821.field_49667, Boolean.valueOf(true))
            .method_10308(class_3821.field_49670, Boolean.valueOf(true)),
         0,
         3,
         8,
         var5
      );
      this.method_32529(
         var1,
         class_4783.field_23587
            .method_29260()
            .method_10308(class_3821.field_49664, Boolean.valueOf(true))
            .method_10308(class_3821.field_49670, Boolean.valueOf(true)),
         8,
         3,
         8,
         var5
      );
      this.method_32500(var1, var5, 0, 3, 6, 0, 3, 7, var10, var10, false);
      this.method_32500(var1, var5, 8, 3, 6, 8, 3, 7, var10, var10, false);
      this.method_32500(var1, var5, 0, 3, 4, 0, 5, 5, class_4783.field_23484.method_29260(), class_4783.field_23484.method_29260(), false);
      this.method_32500(var1, var5, 8, 3, 4, 8, 5, 5, class_4783.field_23484.method_29260(), class_4783.field_23484.method_29260(), false);
      this.method_32500(var1, var5, 1, 3, 5, 2, 5, 5, class_4783.field_23484.method_29260(), class_4783.field_23484.method_29260(), false);
      this.method_32500(var1, var5, 6, 3, 5, 7, 5, 5, class_4783.field_23484.method_29260(), class_4783.field_23484.method_29260(), false);
      this.method_32500(var1, var5, 1, 4, 5, 1, 5, 5, var11, var11, false);
      this.method_32500(var1, var5, 7, 4, 5, 7, 5, 5, var11, var11, false);

      for (int var12 = 0; var12 <= 5; var12++) {
         for (int var13 = 0; var13 <= 8; var13++) {
            this.method_32499(var1, class_4783.field_23484.method_29260(), var13, -1, var12, var5);
         }
      }

      return true;
   }
}
