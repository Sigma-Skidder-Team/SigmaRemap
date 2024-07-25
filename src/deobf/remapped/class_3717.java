package remapped;

public final class class_3717 extends class_3893 {
   private static String[] field_18213;

   public class_3717(class_6003 var1) {
      this.field_18214 = var1;
   }

   @Override
   public void method_18023() {
      this.method_18028(class_8039.field_41179);
      this.method_18025(var0 -> {
         short var3 = var0.<Short>method_23242(class_8039.field_41175);
         var0.method_23236(class_8039.field_41161, false);
         var3 = (short)(var3 & -9);
         var0.method_23236(class_8039.field_41175, var3);
      });
      this.method_18028(class_8039.field_41133);
      this.method_18028(class_8039.field_41152);
      this.method_18025(var1 -> {
         var1.<class_5531>method_23242(class_8039.field_41158);
         var1.method_23236(class_8039.field_41158, var0.method_27400().method_40673());
         String var4 = var1.<String>method_23242(class_8039.field_41171);
         var1.method_23236(class_8039.field_41158, class_7924.method_35838(var4));
      });
      this.method_18028(class_8039.field_41171);
      this.method_18028(class_8039.field_41141);
      this.method_18030(class_8039.field_41175, class_8039.field_41157);
      this.method_18025(
         var0 -> var0.method_23255()
               .<class_448>method_6746(class_448.class)
               .method_14878(var0.<Integer>method_23248(class_8039.field_41179, 0), class_9880.field_49982)
      );
   }
}
