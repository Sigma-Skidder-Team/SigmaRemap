package remapped;

import com.google.gson.JsonElement;

public class class_3267 implements class_5041 {
   @Override
   public int method_23214(class_1455 var1, class_5531 var2) {
      class_5287 var5 = var2.<class_5287>method_25123("CustomName");
      if (var5 instanceof class_887) {
         ((class_887)var5).method_3808(class_68.method_69(((class_887)var5).method_3809()));
      }

      class_5287 var6 = var2.<class_5287>method_25123("LastOutput");
      if (var6 instanceof class_887) {
         JsonElement var7 = class_9012.method_41352().parse(((class_887)var6).method_3809());
         class_68.method_71(var7);
         ((class_887)var6).method_3808(var7.toString());
      }

      return -1;
   }
}
