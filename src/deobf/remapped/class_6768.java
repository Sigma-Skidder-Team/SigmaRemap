package remapped;

import com.google.gson.JsonObject;
import java.util.Objects;

public class class_6768 extends class_8958 {
   public Boolean field_34927;
   public Boolean field_34939;
   public Boolean field_34936;
   public Boolean field_34931;
   public Integer field_34937;
   public Boolean field_34938;
   public Boolean field_34940;
   public Integer field_34934;
   public Integer field_34935;
   public String field_34929;
   public long field_34928;
   public String field_34926;
   public boolean field_34930;
   public boolean field_34933;
   private static final String field_34941 = null;

   public class_6768(Boolean var1, Boolean var2, Boolean var3, Boolean var4, Integer var5, Boolean var6, Integer var7, Integer var8, Boolean var9, String var10) {
      this.field_34927 = var1;
      this.field_34939 = var2;
      this.field_34936 = var3;
      this.field_34931 = var4;
      this.field_34937 = var5;
      this.field_34938 = var6;
      this.field_34934 = var7;
      this.field_34935 = var8;
      this.field_34940 = var9;
      this.field_34929 = var10;
   }

   public static class_6768 method_31026() {
      return new class_6768(true, true, true, true, 0, false, 2, 0, false, "");
   }

   public static class_6768 method_31024() {
      class_6768 var2 = method_31026();
      var2.method_31022(true);
      return var2;
   }

   public void method_31022(boolean var1) {
      this.field_34933 = var1;
   }

   public static class_6768 method_31025(JsonObject var0) {
      class_6768 var3 = new class_6768(
         class_274.method_1246("pvp", var0, true),
         class_274.method_1246("spawnAnimals", var0, true),
         class_274.method_1246("spawnMonsters", var0, true),
         class_274.method_1246("spawnNPCs", var0, true),
         class_274.method_1245("spawnProtection", var0, 0),
         class_274.method_1246("commandBlocks", var0, false),
         class_274.method_1245("difficulty", var0, 2),
         class_274.method_1245("gameMode", var0, 0),
         class_274.method_1246("forceGameMode", var0, false),
         class_274.method_1243("slotName", var0, "")
      );
      var3.field_34928 = class_274.method_1244("worldTemplateId", var0, -1L);
      var3.field_34926 = class_274.method_1243("worldTemplateImage", var0, field_34941);
      var3.field_34930 = class_274.method_1246("adventureMap", var0, false);
      return var3;
   }

   public String method_31027(int var1) {
      if (this.field_34929 != null && !this.field_34929.isEmpty()) {
         return this.field_34929;
      } else {
         return !this.field_34933 ? this.method_31023(var1) : class_6956.method_31803("mco.configure.world.slot.empty");
      }
   }

   public String method_31023(int var1) {
      return class_6956.method_31803("mco.configure.world.slot", var1);
   }

   public String method_31028() {
      JsonObject var3 = new JsonObject();
      if (!this.field_34927) {
         var3.addProperty("pvp", this.field_34927);
      }

      if (!this.field_34939) {
         var3.addProperty("spawnAnimals", this.field_34939);
      }

      if (!this.field_34936) {
         var3.addProperty("spawnMonsters", this.field_34936);
      }

      if (!this.field_34931) {
         var3.addProperty("spawnNPCs", this.field_34931);
      }

      if (this.field_34937 != 0) {
         var3.addProperty("spawnProtection", this.field_34937);
      }

      if (this.field_34938) {
         var3.addProperty("commandBlocks", this.field_34938);
      }

      if (this.field_34934 != 2) {
         var3.addProperty("difficulty", this.field_34934);
      }

      if (this.field_34935 != 0) {
         var3.addProperty("gameMode", this.field_34935);
      }

      if (this.field_34940) {
         var3.addProperty("forceGameMode", this.field_34940);
      }

      if (!Objects.equals(this.field_34929, "")) {
         var3.addProperty("slotName", this.field_34929);
      }

      return var3.toString();
   }

   public class_6768 clone() {
      return new class_6768(
         this.field_34927,
         this.field_34939,
         this.field_34936,
         this.field_34931,
         this.field_34937,
         this.field_34938,
         this.field_34934,
         this.field_34935,
         this.field_34940,
         this.field_34929
      );
   }
}
