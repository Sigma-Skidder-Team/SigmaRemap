package remapped;

import java.util.List;
import java.util.Random;
import javax.annotation.Nullable;

public abstract class class_8549 extends class_7060 {
   public class_4030 field_43750 = class_4030.field_19578;

   public class_8549(class_2746 var1, int var2) {
      super(var1, var2);
   }

   public class_8549(class_2746 var1, class_5734 var2) {
      super(var1, var2);
      this.field_43750 = class_4030.valueOf(var2.method_25965("EntryDoor"));
   }

   @Override
   public void method_32517(class_5734 var1) {
      var1.method_25941("EntryDoor", this.field_43750.name());
   }

   public void method_39330(class_700 var1, Random var2, class_9616 var3, class_4030 var4, int var5, int var6, int var7) {
      switch (var4) {
         case field_19578:
            this.method_32500(var1, var3, var5, var6, var7, var5 + 3 - 1, var6 + 3 - 1, var7, field_36439, field_36439, false);
            break;
         case field_19581:
            this.method_32529(var1, class_4783.field_23355.method_29260(), var5, var6, var7, var3);
            this.method_32529(var1, class_4783.field_23355.method_29260(), var5, var6 + 1, var7, var3);
            this.method_32529(var1, class_4783.field_23355.method_29260(), var5, var6 + 2, var7, var3);
            this.method_32529(var1, class_4783.field_23355.method_29260(), var5 + 1, var6 + 2, var7, var3);
            this.method_32529(var1, class_4783.field_23355.method_29260(), var5 + 2, var6 + 2, var7, var3);
            this.method_32529(var1, class_4783.field_23355.method_29260(), var5 + 2, var6 + 1, var7, var3);
            this.method_32529(var1, class_4783.field_23355.method_29260(), var5 + 2, var6, var7, var3);
            this.method_32529(var1, class_4783.field_23746.method_29260(), var5 + 1, var6, var7, var3);
            this.method_32529(
               var1, class_4783.field_23746.method_29260().method_10308(class_4115.field_20045, class_7422.field_37874), var5 + 1, var6 + 1, var7, var3
            );
            break;
         case field_19580:
            this.method_32529(var1, class_4783.field_23765.method_29260(), var5 + 1, var6, var7, var3);
            this.method_32529(var1, class_4783.field_23765.method_29260(), var5 + 1, var6 + 1, var7, var3);
            this.method_32529(var1, class_4783.field_23817.method_29260().method_10308(class_6498.field_49664, Boolean.valueOf(true)), var5, var6, var7, var3);
            this.method_32529(
               var1, class_4783.field_23817.method_29260().method_10308(class_6498.field_49664, Boolean.valueOf(true)), var5, var6 + 1, var7, var3
            );
            this.method_32529(
               var1,
               class_4783.field_23817
                  .method_29260()
                  .method_10308(class_6498.field_49667, Boolean.valueOf(true))
                  .method_10308(class_6498.field_49664, Boolean.valueOf(true)),
               var5,
               var6 + 2,
               var7,
               var3
            );
            this.method_32529(
               var1,
               class_4783.field_23817
                  .method_29260()
                  .method_10308(class_6498.field_49667, Boolean.valueOf(true))
                  .method_10308(class_6498.field_49664, Boolean.valueOf(true)),
               var5 + 1,
               var6 + 2,
               var7,
               var3
            );
            this.method_32529(
               var1,
               class_4783.field_23817
                  .method_29260()
                  .method_10308(class_6498.field_49667, Boolean.valueOf(true))
                  .method_10308(class_6498.field_49664, Boolean.valueOf(true)),
               var5 + 2,
               var6 + 2,
               var7,
               var3
            );
            this.method_32529(
               var1, class_4783.field_23817.method_29260().method_10308(class_6498.field_49667, Boolean.valueOf(true)), var5 + 2, var6 + 1, var7, var3
            );
            this.method_32529(
               var1, class_4783.field_23817.method_29260().method_10308(class_6498.field_49667, Boolean.valueOf(true)), var5 + 2, var6, var7, var3
            );
            break;
         case field_19577:
            this.method_32529(var1, class_4783.field_23355.method_29260(), var5, var6, var7, var3);
            this.method_32529(var1, class_4783.field_23355.method_29260(), var5, var6 + 1, var7, var3);
            this.method_32529(var1, class_4783.field_23355.method_29260(), var5, var6 + 2, var7, var3);
            this.method_32529(var1, class_4783.field_23355.method_29260(), var5 + 1, var6 + 2, var7, var3);
            this.method_32529(var1, class_4783.field_23355.method_29260(), var5 + 2, var6 + 2, var7, var3);
            this.method_32529(var1, class_4783.field_23355.method_29260(), var5 + 2, var6 + 1, var7, var3);
            this.method_32529(var1, class_4783.field_23355.method_29260(), var5 + 2, var6, var7, var3);
            this.method_32529(var1, class_4783.field_23847.method_29260(), var5 + 1, var6, var7, var3);
            this.method_32529(
               var1, class_4783.field_23847.method_29260().method_10308(class_4115.field_20045, class_7422.field_37874), var5 + 1, var6 + 1, var7, var3
            );
            this.method_32529(
               var1, class_4783.field_23448.method_29260().method_10308(class_7812.field_1543, class_240.field_818), var5 + 2, var6 + 1, var7 + 1, var3
            );
            this.method_32529(
               var1, class_4783.field_23448.method_29260().method_10308(class_7812.field_1543, class_240.field_800), var5 + 2, var6 + 1, var7 - 1, var3
            );
      }
   }

   public class_4030 method_39333(Random var1) {
      int var4 = var1.nextInt(5);
      switch (var4) {
         case 0:
         case 1:
         default:
            return class_4030.field_19578;
         case 2:
            return class_4030.field_19581;
         case 3:
            return class_4030.field_19580;
         case 4:
            return class_4030.field_19577;
      }
   }

   @Nullable
   public class_7060 method_39334(class_4960 var1, List<class_7060> var2, Random var3, int var4, int var5) {
      class_240 var8 = this.method_32518();
      if (var8 != null) {
         switch (var8) {
            case field_818:
               return class_7965.method_36052(
                  var1,
                  var2,
                  var3,
                  this.field_36435.field_48996 + var4,
                  this.field_36435.field_48995 + var5,
                  this.field_36435.field_48992 - 1,
                  var8,
                  this.method_32515()
               );
            case field_800:
               return class_7965.method_36052(
                  var1,
                  var2,
                  var3,
                  this.field_36435.field_48996 + var4,
                  this.field_36435.field_48995 + var5,
                  this.field_36435.field_48994 + 1,
                  var8,
                  this.method_32515()
               );
            case field_809:
               return class_7965.method_36052(
                  var1,
                  var2,
                  var3,
                  this.field_36435.field_48996 - 1,
                  this.field_36435.field_48995 + var5,
                  this.field_36435.field_48992 + var4,
                  var8,
                  this.method_32515()
               );
            case field_804:
               return class_7965.method_36052(
                  var1,
                  var2,
                  var3,
                  this.field_36435.field_48991 + 1,
                  this.field_36435.field_48995 + var5,
                  this.field_36435.field_48992 + var4,
                  var8,
                  this.method_32515()
               );
         }
      }

      return null;
   }

   @Nullable
   public class_7060 method_39331(class_4960 var1, List<class_7060> var2, Random var3, int var4, int var5) {
      class_240 var8 = this.method_32518();
      if (var8 != null) {
         switch (var8) {
            case field_818:
               return class_7965.method_36052(
                  var1,
                  var2,
                  var3,
                  this.field_36435.field_48996 - 1,
                  this.field_36435.field_48995 + var4,
                  this.field_36435.field_48992 + var5,
                  class_240.field_809,
                  this.method_32515()
               );
            case field_800:
               return class_7965.method_36052(
                  var1,
                  var2,
                  var3,
                  this.field_36435.field_48996 - 1,
                  this.field_36435.field_48995 + var4,
                  this.field_36435.field_48992 + var5,
                  class_240.field_809,
                  this.method_32515()
               );
            case field_809:
               return class_7965.method_36052(
                  var1,
                  var2,
                  var3,
                  this.field_36435.field_48996 + var5,
                  this.field_36435.field_48995 + var4,
                  this.field_36435.field_48992 - 1,
                  class_240.field_818,
                  this.method_32515()
               );
            case field_804:
               return class_7965.method_36052(
                  var1,
                  var2,
                  var3,
                  this.field_36435.field_48996 + var5,
                  this.field_36435.field_48995 + var4,
                  this.field_36435.field_48992 - 1,
                  class_240.field_818,
                  this.method_32515()
               );
         }
      }

      return null;
   }

   @Nullable
   public class_7060 method_39335(class_4960 var1, List<class_7060> var2, Random var3, int var4, int var5) {
      class_240 var8 = this.method_32518();
      if (var8 != null) {
         switch (var8) {
            case field_818:
               return class_7965.method_36052(
                  var1,
                  var2,
                  var3,
                  this.field_36435.field_48991 + 1,
                  this.field_36435.field_48995 + var4,
                  this.field_36435.field_48992 + var5,
                  class_240.field_804,
                  this.method_32515()
               );
            case field_800:
               return class_7965.method_36052(
                  var1,
                  var2,
                  var3,
                  this.field_36435.field_48991 + 1,
                  this.field_36435.field_48995 + var4,
                  this.field_36435.field_48992 + var5,
                  class_240.field_804,
                  this.method_32515()
               );
            case field_809:
               return class_7965.method_36052(
                  var1,
                  var2,
                  var3,
                  this.field_36435.field_48996 + var5,
                  this.field_36435.field_48995 + var4,
                  this.field_36435.field_48994 + 1,
                  class_240.field_800,
                  this.method_32515()
               );
            case field_804:
               return class_7965.method_36052(
                  var1,
                  var2,
                  var3,
                  this.field_36435.field_48996 + var5,
                  this.field_36435.field_48995 + var4,
                  this.field_36435.field_48994 + 1,
                  class_240.field_800,
                  this.method_32515()
               );
         }
      }

      return null;
   }

   public static boolean method_39332(class_9616 var0) {
      return var0 != null && var0.field_48995 > 10;
   }
}
