package remapped;

import com.google.gson.JsonObject;

public class class_7121 extends class_8273<class_3324> {
   private static final Identifier field_36707 = new Identifier("player_hurt_entity");

   @Override
   public Identifier method_3899() {
      return field_36707;
   }

   public class_3324 method_32724(JsonObject var1, class_8938 var2, class_8096 var3) {
      class_8255 var6 = class_8255.method_37841(var1.get("damage"));
      class_8938 var7 = class_8938.method_41065(var1, "entity", var3);
      return new class_3324(var2, var6, var7);
   }

   public void method_32725(class_9359 var1, Entity var2, class_6199 var3, float var4, float var5, boolean var6) {
      class_2792 var9 = class_865.method_3739(var1, var2);
      this.method_38137(var1, var6x -> var6x.method_15277(var1, var9, var3, var4, var5, var6));
   }
}
