package remapped;

import com.google.gson.JsonObject;

public class class_1141 implements class_2994<class_667> {
   public class_667 method_4999(class_4639 var1, JsonObject var2) {
      class_8137 var5 = class_8137.method_37024(class_6539.method_29783(var2, "base"));
      class_8137 var6 = class_8137.method_37024(class_6539.method_29783(var2, "addition"));
      class_6098 var7 = class_644.method_2961(class_6539.method_29783(var2, "result"));
      return new class_667(var1, var5, var6, var7);
   }

   public class_667 method_5000(class_4639 var1, class_8248 var2) {
      class_8137 var5 = class_8137.method_37026(var2);
      class_8137 var6 = class_8137.method_37026(var2);
      class_6098 var7 = var2.method_37755();
      return new class_667(var1, var5, var6, var7);
   }

   public void method_4998(class_8248 var1, class_667 var2) {
      class_667.method_3042(var2).method_37028(var1);
      class_667.method_3044(var2).method_37028(var1);
      var1.method_37764(class_667.method_3041(var2));
   }
}
