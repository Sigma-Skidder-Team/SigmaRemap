package remapped;

public class class_6856 {
   @Deprecated
   public static Identifier method_31449(String var0) {
      return new Identifier("minecraft", "block/" + var0);
   }

   public static Identifier method_31447(String var0) {
      return new Identifier("minecraft", "item/" + var0);
   }

   public static Identifier method_31445(class_6414 var0, String var1) {
      Identifier var4 = class_8669.field_44462.method_39797(var0);
      return new Identifier(var4.method_21461(), "block/" + var4.method_21456() + var1);
   }

   public static Identifier method_31446(class_6414 var0) {
      Identifier var3 = class_8669.field_44462.method_39797(var0);
      return new Identifier(var3.method_21461(), "block/" + var3.method_21456());
   }

   public static Identifier method_31450(class_2451 var0) {
      Identifier var3 = class_8669.field_44382.method_39797(var0);
      return new Identifier(var3.method_21461(), "item/" + var3.method_21456());
   }

   public static Identifier method_31444(class_2451 var0, String var1) {
      Identifier var4 = class_8669.field_44382.method_39797(var0);
      return new Identifier(var4.method_21461(), "item/" + var4.method_21456() + var1);
   }
}
