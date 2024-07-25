package remapped;

import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public enum GameType {
   NOT_SET(-1, ""),
   SURVIVAL(0, "survival"),
   CREATIVE(1, "creative"),
   ADVENTURE(2, "adventure"),
   SPECTATOR(3, "spectator");

   private final int id;
   private final String name;

   private GameType(int gameTypeId, String gameTypeName)
   {
      this.id = gameTypeId;
      this.name = gameTypeName;
   }

   public int getID() {
      return this.id;
   }

   public String getName() {
      return this.name;
   }

   public ITextComponent getDisplayName() {
      return new TranslationTextComponent("gameMode." + this.name);
   }

   public void configurePlayerCapabilities(PlayerAbilities capabilities) {
      if (this != CREATIVE) {
         if (this != SPECTATOR) {
            capabilities.allowFlying = false;
            capabilities.isCreativeMode = false;
            capabilities.disableDamage = false;
            capabilities.isFlying = false;
         } else {
            capabilities.allowFlying = true;
            capabilities.isCreativeMode = false;
            capabilities.disableDamage = true;
            capabilities.isFlying = true;
         }
      } else {
         capabilities.allowFlying = true;
         capabilities.isCreativeMode = true;
         capabilities.disableDamage = true;
      }

      capabilities.allowEdit = !this.method_21591();
   }

   public boolean method_21591() {
      return this == ADVENTURE || this == SPECTATOR;
   }

   public boolean method_21587() {
      return this == CREATIVE;
   }

   public boolean method_21593() {
      return this == SURVIVAL || this == ADVENTURE;
   }

   public static GameType method_21590(int var0) {
      return method_21594(var0, SURVIVAL);
   }

   public static GameType method_21594(int var0, GameType var1) {
      for (GameType var7 : values()) {
         if (var7.id == var0) {
            return var7;
         }
      }

      return var1;
   }

   public static GameType method_21586(String var0) {
      return method_21595(var0, SURVIVAL);
   }

   public static GameType method_21595(String var0, GameType var1) {
      for (GameType var7 : values()) {
         if (var7.name.equals(var0)) {
            return var7;
         }
      }

      return var1;
   }
}
