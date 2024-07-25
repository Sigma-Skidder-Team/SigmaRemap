package remapped;

import java.util.Iterator;

public class class_4857 extends class_2733 {
   public class_4857() {
      super(class_6629.field_34281, "ghast", 0.5F);
   }

   @Override
   public class_9873 method_12295() {
      return new class_1898();
   }

   @Override
   public class_1549 method_12291(class_9873 var1, String var2) {
      if (var1 instanceof class_1898) {
         class_1898 var5 = (class_1898)var1;
         Iterator var6 = var5.method_24058().iterator();
         if (!var2.equals("body")) {
            String var7 = "tentacle";
            if (!var2.startsWith(var7)) {
               return null;
            } else {
               String var8 = var2.substring(var7.length());
               int var9 = class_3111.method_14361(var8, -1);
               return class_4992.method_22956(var6, var9);
            }
         } else {
            return class_4992.method_22956(var6, 0);
         }
      } else {
         return null;
      }
   }

   @Override
   public String[] method_12292() {
      return new String[]{"body", "tentacle1", "tentacle2", "tentacle3", "tentacle4", "tentacle5", "tentacle6", "tentacle7", "tentacle8", "tentacle9"};
   }

   @Override
   public class_8599 method_12293(class_9873 var1, float var2) {
      class_6122 var5 = class_1893.method_8510().method_8587();
      class_481 var6 = new class_481(var5);
      var6.field_32487 = (class_1898<class_4206>)var1;
      var6.field_36492 = var2;
      return (class_8599)var6;
   }
}
