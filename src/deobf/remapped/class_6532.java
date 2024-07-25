package remapped;

import com.google.common.collect.Maps;
import java.util.Map;
import java.util.stream.Stream;

public class class_6532 {
   private final Map<String, class_7711> field_33229 = Maps.newHashMap();
   private final class_4050 field_33230;

   public class_6532(class_4050 var1) {
      this.field_33230 = var1;
   }

   private class_7711 method_29744(String var1, String var2) {
      class_7711 var5 = new class_7711(var2);
      this.field_33229.put(var1, var5);
      return var5;
   }

   public CompoundNBT method_29742(Identifier var1) {
      String var4 = var1.method_21461();
      String var5 = method_29740(var4);
      class_7711 var6 = this.field_33230.<class_7711>method_18707(() -> this.method_29744(var4, var5), var5);
      return var6 == null ? new CompoundNBT() : var6.method_34898(var1.method_21456());
   }

   public void method_29743(Identifier var1, CompoundNBT var2) {
      String var5 = var1.method_21461();
      String var6 = method_29740(var5);
      this.field_33230.<class_7711>method_18708(() -> this.method_29744(var5, var6), var6).method_34896(var1.method_21456(), var2);
   }

   public Stream<Identifier> method_29741() {
      return this.field_33229.entrySet().stream().<Identifier>flatMap(var0 -> var0.getValue().method_34897(var0.getKey()));
   }

   private static String method_29740(String var0) {
      return "command_storage_" + var0;
   }
}
