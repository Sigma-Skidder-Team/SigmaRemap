package net.minecraft.world;

import net.minecraft.network.play.client.PlayerAbilities;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public enum GameType {
   field11101(-1, ""),
   field11102(0, "survival"),
   CREATIVE(1, "creative"),
   field11104(2, "adventure"),
   SPECTATOR(3, "spectator");

   private final int field11106;
   private final String field11107;
   private static final GameType[] field11108 = new GameType[]{field11101, field11102, CREATIVE, field11104, SPECTATOR};

   private GameType(int var3, String var4) {
      this.field11106 = var3;
      this.field11107 = var4;
   }

   public int getID() {
      return this.field11106;
   }

   public String method8153() {
      return this.field11107;
   }

   public ITextComponent method8154() {
      return new TranslationTextComponent("gameMode." + this.field11107);
   }

   public void method8155(PlayerAbilities var1) {
      if (this != CREATIVE) {
         if (this != SPECTATOR) {
            var1.allowFlying = false;
            var1.isCreativeMode = false;
            var1.disableDamage = false;
            var1.isFlying = false;
         } else {
            var1.allowFlying = true;
            var1.isCreativeMode = false;
            var1.disableDamage = true;
            var1.isFlying = true;
         }
      } else {
         var1.allowFlying = true;
         var1.isCreativeMode = true;
         var1.disableDamage = true;
      }

      var1.allowEdit = !this.method8156();
   }

   public boolean method8156() {
      return this == field11104 || this == SPECTATOR;
   }

   public boolean isCreative() {
      return this == CREATIVE;
   }

   public boolean method8158() {
      return this == field11102 || this == field11104;
   }

   public static GameType getByID(int var0) {
      return method8160(var0, field11102);
   }

   public static GameType method8160(int var0, GameType var1) {
      for (GameType var7 : values()) {
         if (var7.field11106 == var0) {
            return var7;
         }
      }

      return var1;
   }

   public static GameType method8161(String var0) {
      return method8162(var0, field11102);
   }

   public static GameType method8162(String var0, GameType var1) {
      for (GameType var7 : values()) {
         if (var7.field11107.equals(var0)) {
            return var7;
         }
      }

      return var1;
   }
}
