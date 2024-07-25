package remapped;

import java.util.Map;

public class class_1714 extends class_4403 {
   @Override
   public String method_20527() {
      return "dump";
   }

   @Override
   public String method_20529() {
      return "Dump information about your server, this is helpful if you report bugs.";
   }

   @Override
   public boolean method_20525(class_7235 var1, String[] var2) {
      class_1409 var5 = new class_1409(
         System.getProperty("java.version"),
         System.getProperty("os.name"),
         class_6710.field_34660,
         class_6710.method_30787(),
         class_3446.method_15886().method_34620(),
         class_3446.method_15886().method_34616(),
         class_3446.method_15886().method_34619(),
         class_7405.class.getPackage().getImplementationVersion(),
         class_3446.method_15883().method_33729()
      );
      Map var6 = class_3446.method_15886().method_34621().method_24115();
      class_2763 var7 = new class_2763(var5, var6, class_3446.method_15886().method_34635(), class_3446.method_15883().method_33738().method_3877());
      class_3446.method_15886().method_34627(new class_9032(this, var1, var5, var7));
      return true;
   }

   private String method_7691(String var1) {
      return String.format("https://dump.viaversion.com/%s", var1);
   }
}
