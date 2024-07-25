package remapped;

public class class_6856 {
   @Deprecated
   public static class_4639 method_31449(String var0) {
      return new class_4639("minecraft", "block/" + var0);
   }

   public static class_4639 method_31447(String var0) {
      return new class_4639("minecraft", "item/" + var0);
   }

   public static class_4639 method_31445(class_6414 var0, String var1) {
      class_4639 var4 = class_8669.field_44462.method_39797(var0);
      return new class_4639(var4.method_21461(), "block/" + var4.method_21456() + var1);
   }

   public static class_4639 method_31446(class_6414 var0) {
      class_4639 var3 = class_8669.field_44462.method_39797(var0);
      return new class_4639(var3.method_21461(), "block/" + var3.method_21456());
   }

   public static class_4639 method_31450(class_2451 var0) {
      class_4639 var3 = class_8669.field_44382.method_39797(var0);
      return new class_4639(var3.method_21461(), "item/" + var3.method_21456());
   }

   public static class_4639 method_31444(class_2451 var0, String var1) {
      class_4639 var4 = class_8669.field_44382.method_39797(var0);
      return new class_4639(var4.method_21461(), "item/" + var4.method_21456() + var1);
   }
}
