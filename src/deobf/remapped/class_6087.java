package remapped;

import com.google.gson.JsonObject;

public class class_6087 extends class_8273<class_1492> {
   private static final Identifier field_31144 = new Identifier("player_generates_container_loot");

   @Override
   public Identifier method_3899() {
      return field_31144;
   }

   public class_1492 method_27869(JsonObject var1, class_8938 var2, class_8096 var3) {
      Identifier var6 = new Identifier(class_6539.method_29796(var1, "loot_table"));
      return new class_1492(var2, var6);
   }

   public void method_27870(class_9359 var1, Identifier var2) {
      this.method_38137(var1, var1x -> var1x.method_6887(var2));
   }
}
