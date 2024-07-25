package remapped;

import com.google.gson.JsonObject;

public class class_8435 extends class_8273<class_3789> {
   private static final Identifier field_43162 = new Identifier("recipe_unlocked");

   @Override
   public Identifier method_3899() {
      return field_43162;
   }

   public class_3789 method_38805(JsonObject var1, class_8938 var2, class_8096 var3) {
      Identifier var6 = new Identifier(class_6539.method_29796(var1, "recipe"));
      return new class_3789(var2, var6);
   }

   public void method_38806(class_9359 var1, class_8932<?> var2) {
      this.method_38137(var1, var1x -> var1x.method_17593(var2));
   }

   public static class_3789 method_38807(Identifier var0) {
      return new class_3789(class_8938.field_45798, var0);
   }
}
