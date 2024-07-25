package remapped;

import com.google.gson.JsonObject;

public class class_8459 extends class_8273<class_7888> {
   private static final Identifier field_43243 = new Identifier("changed_dimension");

   @Override
   public Identifier method_3899() {
      return field_43243;
   }

   public class_7888 method_38904(JsonObject var1, class_8938 var2, class_8096 var3) {
      class_5621 var6 = !var1.has("from")
         ? null
         : class_5621.<World>method_25497(class_8669.field_44372, new Identifier(class_6539.method_29796(var1, "from")));
      class_5621 var7 = !var1.has("to")
         ? null
         : class_5621.<World>method_25497(class_8669.field_44372, new Identifier(class_6539.method_29796(var1, "to")));
      return new class_7888(var2, var6, var7);
   }

   public void method_38905(class_9359 var1, class_5621<World> var2, class_5621<World> var3) {
      this.method_38137(var1, var2x -> var2x.method_35666(var2, var3));
   }
}
