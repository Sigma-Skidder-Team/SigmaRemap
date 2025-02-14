package mapped;

import com.google.gson.JsonObject;
import java.util.Objects;

public class Class6125 extends Class6109 {
   public Boolean field27421;
   public Boolean field27422;
   public Boolean field27423;
   public Boolean field27424;
   public Integer field27425;
   public Boolean field27426;
   public Boolean field27427;
   public Integer field27428;
   public Integer field27429;
   public String field27430;
   public long field27431;
   public String field27432;
   public boolean field27433;
   public boolean field27434;
   private static final String field27435 = null;

   public Class6125(Boolean var1, Boolean var2, Boolean var3, Boolean var4, Integer var5, Boolean var6, Integer var7, Integer var8, Boolean var9, String var10) {
      this.field27421 = var1;
      this.field27422 = var2;
      this.field27423 = var3;
      this.field27424 = var4;
      this.field27425 = var5;
      this.field27426 = var6;
      this.field27428 = var7;
      this.field27429 = var8;
      this.field27427 = var9;
      this.field27430 = var10;
   }

   public static Class6125 method18897() {
      return new Class6125(true, true, true, true, 0, false, 2, 0, false, "");
   }

   public static Class6125 method18898() {
      Class6125 var2 = method18897();
      var2.method18899(true);
      return var2;
   }

   public void method18899(boolean var1) {
      this.field27434 = var1;
   }

   public static Class6125 method18900(JsonObject var0) {
      Class6125 var3 = new Class6125(
         Class5420.method17019("pvp", var0, true),
         Class5420.method17019("spawnAnimals", var0, true),
         Class5420.method17019("spawnMonsters", var0, true),
         Class5420.method17019("spawnNPCs", var0, true),
         Class5420.method17017("spawnProtection", var0, 0),
         Class5420.method17019("commandBlocks", var0, false),
         Class5420.method17017("difficulty", var0, 2),
         Class5420.method17017("gameMode", var0, 0),
         Class5420.method17019("forceGameMode", var0, false),
         Class5420.method17016("slotName", var0, "")
      );
      var3.field27431 = Class5420.method17018("worldTemplateId", var0, -1L);
      var3.field27432 = Class5420.method17016("worldTemplateImage", var0, field27435);
      var3.field27433 = Class5420.method17019("adventureMap", var0, false);
      return var3;
   }

   public String method18901(int var1) {
      if (this.field27430 != null && !this.field27430.isEmpty()) {
         return this.field27430;
      } else {
         return !this.field27434 ? this.method18902(var1) : I18n.format("mco.configure.world.slot.empty");
      }
   }

   public String method18902(int var1) {
      return I18n.format("mco.configure.world.slot", var1);
   }

   public String method18903() {
      JsonObject var3 = new JsonObject();
      if (!this.field27421) {
         var3.addProperty("pvp", this.field27421);
      }

      if (!this.field27422) {
         var3.addProperty("spawnAnimals", this.field27422);
      }

      if (!this.field27423) {
         var3.addProperty("spawnMonsters", this.field27423);
      }

      if (!this.field27424) {
         var3.addProperty("spawnNPCs", this.field27424);
      }

      if (this.field27425 != 0) {
         var3.addProperty("spawnProtection", this.field27425);
      }

      if (this.field27426) {
         var3.addProperty("commandBlocks", this.field27426);
      }

      if (this.field27428 != 2) {
         var3.addProperty("difficulty", this.field27428);
      }

      if (this.field27429 != 0) {
         var3.addProperty("gameMode", this.field27429);
      }

      if (this.field27427) {
         var3.addProperty("forceGameMode", this.field27427);
      }

      if (!Objects.equals(this.field27430, "")) {
         var3.addProperty("slotName", this.field27430);
      }

      return var3.toString();
   }

   public Class6125 clone() {
      return new Class6125(
         this.field27421,
         this.field27422,
         this.field27423,
         this.field27424,
         this.field27425,
         this.field27426,
         this.field27428,
         this.field27429,
         this.field27427,
         this.field27430
      );
   }
}
