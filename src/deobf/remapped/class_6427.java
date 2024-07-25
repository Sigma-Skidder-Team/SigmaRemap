package remapped;

import java.util.HashMap;

public class class_6427 {
   private static String[] field_32836;
   private MinecraftClient mcInstance = MinecraftClient.getInstance();
   private SigmaIRC irc;
   private HashMap<String, class_4828> field_32837 = new HashMap<String, class_4828>();

   public class_6427(SigmaIRC var1) {
      this.irc = var1;
   }

   public void method_29367(String var1, String var2, long var3) {
      this.field_32837.computeIfAbsent(var1, var0 -> new class_4828()).method_22220(var3, var2);
      System.out.println(this.field_32837.get(var1).field_24104);
   }

   public class_4828 method_29368(String var1) {
      return this.field_32837.computeIfAbsent(var1, var0 -> new class_4828());
   }
}
