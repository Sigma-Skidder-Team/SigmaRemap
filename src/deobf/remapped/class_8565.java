package remapped;

import com.google.gson.JsonObject;

public class class_8565 extends class_8273<class_4558> {
   private static final class_4639 field_43803 = new class_4639("cured_zombie_villager");

   @Override
   public class_4639 method_3899() {
      return field_43803;
   }

   public class_4558 method_39401(JsonObject var1, class_8938 var2, class_8096 var3) {
      class_8938 var6 = class_8938.method_41065(var1, "zombie", var3);
      class_8938 var7 = class_8938.method_41065(var1, "villager", var3);
      return new class_4558(var2, var6, var7);
   }

   public void method_39403(class_9359 var1, class_2811 var2, class_7666 var3) {
      class_2792 var6 = class_865.method_3739(var1, var2);
      class_2792 var7 = class_865.method_3739(var1, var3);
      this.method_38137(var1, var2x -> var2x.method_21125(var6, var7));
   }
}
