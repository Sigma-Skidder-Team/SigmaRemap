package remapped;

import java.util.List;
import java.util.Random;

public class class_7153 extends class_8549 {
   private static String[] field_36841;

   public class_7153(int var1, Random var2, class_9616 var3, Direction var4) {
      super(class_2746.field_13433, var1);
      this.method_32519(var4);
      this.field_43750 = this.method_39333(var2);
      this.field_36435 = var3;
   }

   public class_7153(class_5799 var1, class_5734 var2) {
      super(class_2746.field_13433, var2);
   }

   @Override
   public void method_32527(class_7060 var1, List<class_7060> var2, Random var3) {
      this.method_39334((class_4960)var1, var2, var3, 1, 1);
   }

   public static class_7153 method_32844(List<class_7060> var0, Random var1, int var2, int var3, int var4, Direction var5, int var6) {
      class_9616 var9 = class_9616.method_44386(var2, var3, var4, -1, -1, 0, 9, 5, 11, var5);
      return method_39332(var9) && class_7060.method_32502(var0, var9) == null ? new class_7153(var6, var1, var9, var5) : null;
   }

   @Override
   public boolean method_32501(class_700 var1, class_2033 var2, class_6541 var3, Random var4, class_9616 var5, class_2034 var6, class_1331 var7) {
      this.method_32511(var1, var5, 0, 0, 0, 8, 4, 10, true, var4, class_7965.method_36051());
      this.method_39330(var1, var4, var5, this.field_43750, 1, 1, 0);
      this.method_32500(var1, var5, 1, 1, 10, 3, 3, 10, field_36439, field_36439, false);
      this.method_32511(var1, var5, 4, 1, 1, 4, 3, 1, false, var4, class_7965.method_36051());
      this.method_32511(var1, var5, 4, 1, 3, 4, 3, 3, false, var4, class_7965.method_36051());
      this.method_32511(var1, var5, 4, 1, 7, 4, 3, 7, false, var4, class_7965.method_36051());
      this.method_32511(var1, var5, 4, 1, 9, 4, 3, 9, false, var4, class_7965.method_36051());

      for (int var10 = 1; var10 <= 3; var10++) {
         this.method_32529(
            var1,
            class_4783.field_23817
               .method_29260()
               .method_10308(class_6498.field_49671, Boolean.valueOf(true))
               .method_10308(class_6498.field_49670, Boolean.valueOf(true)),
            4,
            var10,
            4,
            var5
         );
         this.method_32529(
            var1,
            class_4783.field_23817
               .method_29260()
               .method_10308(class_6498.field_49671, Boolean.valueOf(true))
               .method_10308(class_6498.field_49670, Boolean.valueOf(true))
               .method_10308(class_6498.field_49667, Boolean.valueOf(true)),
            4,
            var10,
            5,
            var5
         );
         this.method_32529(
            var1,
            class_4783.field_23817
               .method_29260()
               .method_10308(class_6498.field_49671, Boolean.valueOf(true))
               .method_10308(class_6498.field_49670, Boolean.valueOf(true)),
            4,
            var10,
            6,
            var5
         );
         this.method_32529(
            var1,
            class_4783.field_23817
               .method_29260()
               .method_10308(class_6498.field_49664, Boolean.valueOf(true))
               .method_10308(class_6498.field_49667, Boolean.valueOf(true)),
            5,
            var10,
            5,
            var5
         );
         this.method_32529(
            var1,
            class_4783.field_23817
               .method_29260()
               .method_10308(class_6498.field_49664, Boolean.valueOf(true))
               .method_10308(class_6498.field_49667, Boolean.valueOf(true)),
            6,
            var10,
            5,
            var5
         );
         this.method_32529(
            var1,
            class_4783.field_23817
               .method_29260()
               .method_10308(class_6498.field_49664, Boolean.valueOf(true))
               .method_10308(class_6498.field_49667, Boolean.valueOf(true)),
            7,
            var10,
            5,
            var5
         );
      }

      this.method_32529(
         var1,
         class_4783.field_23817
            .method_29260()
            .method_10308(class_6498.field_49671, Boolean.valueOf(true))
            .method_10308(class_6498.field_49670, Boolean.valueOf(true)),
         4,
         3,
         2,
         var5
      );
      this.method_32529(
         var1,
         class_4783.field_23817
            .method_29260()
            .method_10308(class_6498.field_49671, Boolean.valueOf(true))
            .method_10308(class_6498.field_49670, Boolean.valueOf(true)),
         4,
         3,
         8,
         var5
      );
      class_2522 var12 = class_4783.field_23847.method_29260().method_10308(class_4115.field_20050, Direction.field_809);
      class_2522 var11 = class_4783.field_23847
         .method_29260()
         .method_10308(class_4115.field_20050, Direction.field_809)
         .method_10308(class_4115.field_20045, class_7422.field_37874);
      this.method_32529(var1, var12, 4, 1, 2, var5);
      this.method_32529(var1, var11, 4, 2, 2, var5);
      this.method_32529(var1, var12, 4, 1, 8, var5);
      this.method_32529(var1, var11, 4, 2, 8, var5);
      return true;
   }
}
