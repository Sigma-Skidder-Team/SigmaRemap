package remapped;

import com.google.gson.JsonObject;

public class class_3242 extends class_8273<class_7695> {
   private static final Identifier field_16112 = new Identifier("entity_hurt_player");

   @Override
   public Identifier method_3899() {
      return field_16112;
   }

   public class_7695 method_14839(JsonObject var1, class_8938 var2, class_8096 var3) {
      class_8255 var6 = class_8255.method_37841(var1.get("damage"));
      return new class_7695(var2, var6);
   }

   public void method_14841(class_9359 var1, DamageSource var2, float var3, float var4, boolean var5) {
      this.method_38137(var1, var5x -> var5x.method_34865(var1, var2, var3, var4, var5));
   }
}
