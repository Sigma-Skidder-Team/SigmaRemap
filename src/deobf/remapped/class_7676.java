package remapped;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class class_7676 {
   private static Map<String, class_2733> field_39021 = method_34786();

   private static Map<String, class_2733> method_34786() {
      LinkedHashMap var2 = new LinkedHashMap();
      method_34784(var2, new class_577());
      method_34784(var2, new class_2761());
      method_34784(var2, new class_1971());
      method_34784(var2, new class_775());
      method_34784(var2, new class_9432());
      method_34784(var2, new class_1468());
      method_34784(var2, new class_6502());
      method_34784(var2, new class_681());
      method_34784(var2, new class_6913());
      method_34784(var2, new class_6611());
      method_34784(var2, new class_7811());
      method_34784(var2, new class_5514());
      method_34784(var2, new class_5669());
      method_34784(var2, new class_2641());
      method_34784(var2, new class_1442());
      method_34784(var2, new class_6447());
      method_34784(var2, new class_2621());
      method_34784(var2, new class_1554());
      method_34784(var2, new class_4164());
      method_34784(var2, new class_3901());
      method_34784(var2, new class_4857());
      method_34784(var2, new class_9770());
      method_34784(var2, new class_5546());
      method_34784(var2, new class_1179());
      method_34784(var2, new class_3602());
      method_34784(var2, new class_4435());
      method_34784(var2, new class_7415());
      method_34784(var2, new class_5288());
      method_34784(var2, new class_8319());
      method_34784(var2, new class_6158());
      method_34784(var2, new class_694());
      method_34784(var2, new class_716());
      method_34784(var2, new class_7879());
      method_34784(var2, new class_2602());
      method_34784(var2, new class_9064());
      method_34784(var2, new class_2272());
      method_34784(var2, new class_3179());
      method_34784(var2, new class_8184());
      method_34784(var2, new class_7654());
      method_34784(var2, new class_3214());
      method_34784(var2, new class_5236());
      method_34784(var2, new class_1727());
      method_34784(var2, new class_2510());
      method_34784(var2, new class_1348());
      method_34784(var2, new class_8357());
      method_34784(var2, new class_1258());
      method_34784(var2, new class_9511());
      method_34784(var2, new class_3777());
      method_34784(var2, new class_1190());
      method_34784(var2, new class_7148());
      method_34784(var2, new class_632());
      method_34784(var2, new class_9156());
      method_34784(var2, new class_2781());
      method_34784(var2, new class_8682());
      method_34784(var2, new class_1220());
      method_34784(var2, new class_517());
      method_34784(var2, new class_9174());
      method_34784(var2, new class_8882());
      method_34784(var2, new class_3056());
      method_34784(var2, new class_9229());
      method_34784(var2, new class_1160());
      method_34784(var2, new class_7757());
      method_34784(var2, new class_3110());
      method_34784(var2, new class_110());
      method_34784(var2, new class_4283());
      method_34784(var2, new class_6641());
      method_34784(var2, new class_1357());
      method_34784(var2, new class_4540());
      method_34784(var2, new class_1197());
      method_34784(var2, new class_6773());
      method_34784(var2, new class_5817());
      method_34784(var2, new class_3584());
      method_34784(var2, new class_5369());
      method_34784(var2, new class_4720());
      method_34784(var2, new class_3977());
      method_34784(var2, new class_7184());
      method_34784(var2, new class_735());
      method_34784(var2, new class_7601());
      method_34784(var2, new class_8785());
      method_34784(var2, new class_9619());
      method_34784(var2, new class_1908());
      method_34784(var2, new class_9553());
      method_34784(var2, new class_1885());
      method_34784(var2, new class_7040());
      method_34784(var2, new class_227());
      method_34784(var2, new class_228());
      method_34784(var2, new class_7577());
      method_34784(var2, new class_5608());
      method_34784(var2, new class_778());
      method_34784(var2, new class_746());
      method_34784(var2, new class_6875());
      method_34784(var2, new class_3233());
      method_34784(var2, new class_8776());
      return var2;
   }

   private static void method_34784(Map<String, class_2733> var0, class_2733 var1) {
      method_34785(var0, var1, var1.method_12290());
      String[] var4 = var1.method_12294();
      if (var4 != null) {
         for (int var5 = 0; var5 < var4.length; var5++) {
            String var6 = var4[var5];
            method_34785(var0, var1, var6);
         }
      }

      class_9873 var10 = var1.method_12295();
      String[] var11 = var1.method_12292();

      for (int var7 = 0; var7 < var11.length; var7++) {
         String var8 = var11[var7];
         class_1549 var9 = var1.method_12291(var10, var8);
         if (var9 == null) {
            class_3111.method_14317("Model renderer not found, model: " + var1.method_12290() + ", name: " + var8);
         }
      }
   }

   private static void method_34785(Map<String, class_2733> var0, class_2733 var1, String var2) {
      if (var0.containsKey(var2)) {
         String var5 = "?";
         class_222 var6 = var1.method_12298();
         if (var6.method_940().isPresent()) {
            var5 = ((class_6629)var6.method_940().get()).method_30469();
         }

         if (var6.method_942().isPresent()) {
            var5 = "" + class_133.method_445((class_133<?>)var6.method_942().get());
         }

         class_3111.method_14317("Model adapter already registered for id: " + var2 + ", type: " + var5);
      }

      var0.put(var2, var1);
   }

   public static class_2733 method_34789(String var0) {
      return field_39021.get(var0);
   }

   public static String[] method_34788() {
      Set var2 = field_39021.keySet();
      return var2.<String>toArray(new String[var2.size()]);
   }
}
