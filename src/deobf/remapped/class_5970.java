package remapped;

import java.util.Map;

public class class_5970 extends class_6414 {
   private static String[] field_30405;
   public static final class_6720 field_30404 = class_6169.field_31564;
   public static final class_6720 field_30408 = class_6169.field_31567;
   public static final class_6720 field_30403 = class_6169.field_31569;
   public static final class_6720 field_30402 = class_6169.field_31566;
   public static final class_6720 field_30406 = class_6169.field_31563;
   public static final class_6720 field_30409 = class_6169.field_31568;
   private static final Map<class_240, class_6720> field_30407 = class_6169.field_31571;

   public class_5970(class_3073 var1) {
      super(var1);
      this.method_29284(
         this.field_32751
            .method_36446()
            .method_10308(field_30404, Boolean.valueOf(true))
            .method_10308(field_30408, Boolean.valueOf(true))
            .method_10308(field_30403, Boolean.valueOf(true))
            .method_10308(field_30402, Boolean.valueOf(true))
            .method_10308(field_30406, Boolean.valueOf(true))
            .method_10308(field_30409, Boolean.valueOf(true))
      );
   }

   @Override
   public class_2522 method_29302(class_353 var1) {
      class_6486 var4 = var1.method_21862();
      class_1331 var5 = var1.method_21858();
      return this.method_29260()
         .method_10308(field_30409, Boolean.valueOf(this != var4.method_28262(var5.method_6100()).method_8360()))
         .method_10308(field_30406, Boolean.valueOf(this != var4.method_28262(var5.method_6081()).method_8360()))
         .method_10308(field_30404, Boolean.valueOf(this != var4.method_28262(var5.method_6094()).method_8360()))
         .method_10308(field_30408, Boolean.valueOf(this != var4.method_28262(var5.method_6090()).method_8360()))
         .method_10308(field_30403, Boolean.valueOf(this != var4.method_28262(var5.method_6073()).method_8360()))
         .method_10308(field_30402, Boolean.valueOf(this != var4.method_28262(var5.method_6108()).method_8360()));
   }

   @Override
   public class_2522 method_10763(class_2522 var1, class_240 var2, class_2522 var3, class_9379 var4, class_1331 var5, class_1331 var6) {
      return !var3.method_8350(this)
         ? super.method_10763(var1, var2, var3, var4, var5, var6)
         : var1.method_10308(field_30407.get(var2), Boolean.valueOf(false));
   }

   @Override
   public class_2522 method_10785(class_2522 var1, class_6631 var2) {
      return var1.method_10308(field_30407.get(var2.method_30489(class_240.field_818)), var1.<Boolean>method_10313(field_30404))
         .method_10308(field_30407.get(var2.method_30489(class_240.field_800)), var1.<Boolean>method_10313(field_30403))
         .method_10308(field_30407.get(var2.method_30489(class_240.field_804)), var1.<Boolean>method_10313(field_30408))
         .method_10308(field_30407.get(var2.method_30489(class_240.field_809)), var1.<Boolean>method_10313(field_30402))
         .method_10308(field_30407.get(var2.method_30489(class_240.field_817)), var1.<Boolean>method_10313(field_30406))
         .method_10308(field_30407.get(var2.method_30489(class_240.field_802)), var1.<Boolean>method_10313(field_30409));
   }

   @Override
   public class_2522 method_10773(class_2522 var1, class_9022 var2) {
      return var1.method_10308(field_30407.get(var2.method_41392(class_240.field_818)), var1.<Boolean>method_10313(field_30404))
         .method_10308(field_30407.get(var2.method_41392(class_240.field_800)), var1.<Boolean>method_10313(field_30403))
         .method_10308(field_30407.get(var2.method_41392(class_240.field_804)), var1.<Boolean>method_10313(field_30408))
         .method_10308(field_30407.get(var2.method_41392(class_240.field_809)), var1.<Boolean>method_10313(field_30402))
         .method_10308(field_30407.get(var2.method_41392(class_240.field_817)), var1.<Boolean>method_10313(field_30406))
         .method_10308(field_30407.get(var2.method_41392(class_240.field_802)), var1.<Boolean>method_10313(field_30409));
   }

   @Override
   public void method_29282(class_2203<class_6414, class_2522> var1) {
      var1.method_10162(field_30406, field_30409, field_30404, field_30408, field_30403, field_30402);
   }
}
