package remapped;

import com.google.gson.JsonObject;

public class class_8435 extends class_8273<class_3789> {
   private static final class_4639 field_43162 = new class_4639("recipe_unlocked");

   @Override
   public class_4639 method_3899() {
      return field_43162;
   }

   public class_3789 method_38805(JsonObject var1, class_8938 var2, class_8096 var3) {
      class_4639 var6 = new class_4639(class_6539.method_29796(var1, "recipe"));
      return new class_3789(var2, var6);
   }

   public void method_38806(class_9359 var1, class_8932<?> var2) {
      this.method_38137(var1, var1x -> var1x.method_17593(var2));
   }

   public static class_3789 method_38807(class_4639 var0) {
      return new class_3789(class_8938.field_45798, var0);
   }
}
