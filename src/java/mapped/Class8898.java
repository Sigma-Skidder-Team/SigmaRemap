package mapped;

import com.mojang.serialization.Dynamic;

public final class Class8898 {
   private final String field40268;
   private final Class1894 field40269;
   private final boolean field40270;
   private final Class2197 field40271;
   private final boolean field40272;
   private final Class5462 field40273;
   private final Class7818 field40274;

   public Class8898(String var1, Class1894 var2, boolean var3, Class2197 var4, boolean var5, Class5462 var6, Class7818 var7) {
      this.field40268 = var1;
      this.field40269 = var2;
      this.field40270 = var3;
      this.field40271 = var4;
      this.field40272 = var5;
      this.field40273 = var6;
      this.field40274 = var7;
   }

   public static Class8898 method32425(Dynamic<?> var0, Class7818 var1) {
      Class1894 var4 = Class1894.method8159(var0.get("GameType").asInt(0));
      return new Class8898(
         var0.get("LevelName").asString(""),
         var4,
         var0.get("hardcore").asBoolean(false),
         var0.get("Difficulty").asNumber().map(var0x -> Class2197.method8907(var0x.byteValue())).result().orElse(Class2197.field14353),
         var0.get("allowCommands").asBoolean(var4 == Class1894.field11103),
         new Class5462(var0.get("GameRules")),
         var1
      );
   }

   public String method32426() {
      return this.field40268;
   }

   public Class1894 method32427() {
      return this.field40269;
   }

   public boolean method32428() {
      return this.field40270;
   }

   public Class2197 method32429() {
      return this.field40271;
   }

   public boolean method32430() {
      return this.field40272;
   }

   public Class5462 method32431() {
      return this.field40273;
   }

   public Class7818 method32432() {
      return this.field40274;
   }

   public Class8898 method32433(Class1894 var1) {
      return new Class8898(this.field40268, var1, this.field40270, this.field40271, this.field40272, this.field40273, this.field40274);
   }

   public Class8898 method32434(Class2197 var1) {
      return new Class8898(this.field40268, this.field40269, this.field40270, var1, this.field40272, this.field40273, this.field40274);
   }

   public Class8898 method32435(Class7818 var1) {
      return new Class8898(this.field40268, this.field40269, this.field40270, this.field40271, this.field40272, this.field40273, var1);
   }

   public Class8898 clone() {
      return new Class8898(this.field40268, this.field40269, this.field40270, this.field40271, this.field40272, this.field40273.clone(), this.field40274);
   }
}
