package remapped;

import com.google.gson.JsonObject;

public class class_6087 extends class_8273<class_1492> {
   private static final class_4639 field_31144 = new class_4639("player_generates_container_loot");

   @Override
   public class_4639 method_3899() {
      return field_31144;
   }

   public class_1492 method_27869(JsonObject var1, class_8938 var2, class_8096 var3) {
      class_4639 var6 = new class_4639(class_6539.method_29796(var1, "loot_table"));
      return new class_1492(var2, var6);
   }

   public void method_27870(class_9359 var1, class_4639 var2) {
      this.method_38137(var1, var1x -> var1x.method_6887(var2));
   }
}
