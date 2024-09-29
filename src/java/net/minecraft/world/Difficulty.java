package net.minecraft.world;

import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

import javax.annotation.Nullable;
import java.util.Arrays;
import java.util.Comparator;

public enum Difficulty {
   PEACEFUL(0, "peaceful"),
   EASY(1, "easy"),
   NORMAL(2, "normal"),
   HARD(3, "hard");

   private static final Difficulty[] ID_MAPPING = Arrays.stream(values()).sorted(Comparator.comparingInt(Difficulty::getId)).toArray((size) -> {
      return new Difficulty[size];
   });
   private final int id;
   private final String translationKey;

   private Difficulty(int difficultyIdIn, String difficultyResourceKeyIn) {
      this.id = difficultyIdIn;
      this.translationKey = difficultyResourceKeyIn;
   }

   public int getId() {
      return this.id;
   }

   public ITextComponent getDisplayName() {
      return new TranslationTextComponent("options.difficulty." + this.translationKey);
   }

   public static Difficulty byId(int var0) {
      return ID_MAPPING[var0 % ID_MAPPING.length];
   }

   @Nullable
   public static Difficulty byName(String var0) {
      for (Difficulty var6 : values()) {
         if (var6.translationKey.equals(var0)) {
            return var6;
         }
      }

      return null;
   }

   public String getTranslationKey() {
      return this.translationKey;
   }

   public Difficulty getNextDifficulty() {
      return ID_MAPPING[(this.id + 1) % ID_MAPPING.length];
   }
}
