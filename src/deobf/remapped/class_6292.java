package remapped;

import com.mojang.serialization.Dynamic;

public final class class_6292 {
   private final String field_32160;
   private final GameType field_32158;
   private final boolean field_32162;
   private final class_423 field_32163;
   private final boolean field_32156;
   private final class_291 field_32157;
   private final class_2805 field_32159;

   public class_6292(String var1, GameType var2, boolean var3, class_423 var4, boolean var5, class_291 var6, class_2805 var7) {
      this.field_32160 = var1;
      this.field_32158 = var2;
      this.field_32162 = var3;
      this.field_32163 = var4;
      this.field_32156 = var5;
      this.field_32157 = var6;
      this.field_32159 = var7;
   }

   public static class_6292 method_28715(Dynamic<?> var0, class_2805 var1) {
      GameType var4 = GameType.method_21590(var0.get("GameType").asInt(0));
      return new class_6292(
         var0.get("LevelName").asString(""),
         var4,
         var0.get("hardcore").asBoolean(false),
         var0.get("Difficulty").asNumber().map(var0x -> class_423.method_2100(var0x.byteValue())).result().orElse(class_423.field_1789),
         var0.get("allowCommands").asBoolean(var4 == GameType.field_22761),
         new class_291(var0.get("GameRules")),
         var1
      );
   }

   public String method_28716() {
      return this.field_32160;
   }

   public GameType method_28720() {
      return this.field_32158;
   }

   public boolean method_28712() {
      return this.field_32162;
   }

   public class_423 method_28710() {
      return this.field_32163;
   }

   public boolean method_28719() {
      return this.field_32156;
   }

   public class_291 method_28709() {
      return this.field_32157;
   }

   public class_2805 method_28713() {
      return this.field_32159;
   }

   public class_6292 method_28711(GameType var1) {
      return new class_6292(this.field_32160, var1, this.field_32162, this.field_32163, this.field_32156, this.field_32157, this.field_32159);
   }

   public class_6292 method_28718(class_423 var1) {
      return new class_6292(this.field_32160, this.field_32158, this.field_32162, var1, this.field_32156, this.field_32157, this.field_32159);
   }

   public class_6292 method_28717(class_2805 var1) {
      return new class_6292(this.field_32160, this.field_32158, this.field_32162, this.field_32163, this.field_32156, this.field_32157, var1);
   }

   public class_6292 clone() {
      return new class_6292(
         this.field_32160, this.field_32158, this.field_32162, this.field_32163, this.field_32156, this.field_32157.clone(), this.field_32159
      );
   }
}
