package remapped;

import com.google.gson.JsonObject;

public class class_4950 extends class_8273<class_146> {
   private static final Identifier field_25613 = new Identifier("summoned_entity");

   @Override
   public Identifier method_3899() {
      return field_25613;
   }

   public class_146 method_22684(JsonObject var1, class_8938 var2, class_8096 var3) {
      class_8938 var6 = class_8938.method_41065(var1, "entity", var3);
      return new class_146(var2, var6);
   }

   public void method_22685(class_9359 var1, Entity var2) {
      class_2792 var5 = class_865.method_3739(var1, var2);
      this.method_38137(var1, var1x -> var1x.method_567(var5));
   }
}
