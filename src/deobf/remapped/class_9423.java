package remapped;

import com.google.gson.JsonObject;

public class class_9423<T extends class_5822> implements class_2994<T> {
   public final class_318<T> field_48148;

   public class_9423(class_318<T> var1) {
      this.field_48148 = var1;
   }

   public T method_43617(Identifier var1, JsonObject var2) {
      String var5 = class_6539.method_29797(var2, "group", "");
      class_8137 var6;
      if (!class_6539.method_29763(var2, "ingredient")) {
         var6 = class_8137.method_37024(class_6539.method_29783(var2, "ingredient"));
      } else {
         var6 = class_8137.method_37024(class_6539.method_29787(var2, "ingredient"));
      }

      String var7 = class_6539.method_29796(var2, "result");
      int var8 = class_6539.method_29767(var2, "count");
      ItemStack var9 = new ItemStack(class_8669.field_44382.method_39806(new Identifier(var7)), var8);
      return this.field_48148.method_1487(var1, var5, var6, var9);
   }

   public T method_43618(Identifier var1, class_8248 var2) {
      String var5 = var2.method_37784(32767);
      class_8137 var6 = class_8137.method_37026(var2);
      ItemStack var7 = var2.method_37755();
      return this.field_48148.method_1487(var1, var5, var6, var7);
   }

   public void method_43615(class_8248 var1, T var2) {
      var1.method_37760(var2.field_29538);
      var2.field_29533.method_37028(var1);
      var1.method_37764(var2.field_29534);
   }
}
