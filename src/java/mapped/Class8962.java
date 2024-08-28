package mapped;

import com.google.common.collect.Maps;
import java.util.Map;
import java.util.stream.Stream;

public class Class8962 {
   private final Map<String, Class7534> field40484 = Maps.newHashMap();
   private final Class8250 field40485;

   public Class8962(Class8250 var1) {
      this.field40485 = var1;
   }

   private Class7534 method32747(String var1, String var2) {
      Class7534 var5 = new Class7534(var2);
      this.field40484.put(var1, var5);
      return var5;
   }

   public Class39 method32748(ResourceLocation var1) {
      String var4 = var1.method8293();
      String var5 = method32751(var4);
      Class7534 var6 = this.field40485.<Class7534>method28768(() -> this.method32747(var4, var5), var5);
      return var6 == null ? new Class39() : var6.method24624(var1.method8292());
   }

   public void method32749(ResourceLocation var1, Class39 var2) {
      String var5 = var1.method8293();
      String var6 = method32751(var5);
      this.field40485.<Class7534>method28767(() -> this.method32747(var5, var6), var6).method24625(var1.method8292(), var2);
   }

   public Stream<ResourceLocation> method32750() {
      return this.field40484.entrySet().stream().<ResourceLocation>flatMap(var0 -> var0.getValue().method24626(var0.getKey()));
   }

   private static String method32751(String var0) {
      return "command_storage_" + var0;
   }
}
