package net.minecraft.world;

import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

import javax.annotation.Nullable;
import java.util.Arrays;
import java.util.Comparator;

public enum Difficulty {
   field14351(0, "peaceful"),
   field14352(1, "easy"),
   field14353(2, "normal"),
   field14354(3, "hard");

   private static final Difficulty[] field14355 = Arrays.<Difficulty>stream(values())
      .sorted(Comparator.comparingInt(Difficulty::getId))
      .<Difficulty>toArray(Difficulty[]::new);
   private final int field14356;
   private final String field14357;
   private static final Difficulty[] field14358 = new Difficulty[]{field14351, field14352, field14353, field14354};

   private Difficulty(int var3, String var4) {
      this.field14356 = var3;
      this.field14357 = var4;
   }

   public int getId() {
      return this.field14356;
   }

   public ITextComponent getDisplayName() {
      return new TranslationTextComponent("options.difficulty." + this.field14357);
   }

   public static Difficulty method8907(int var0) {
      return field14355[var0 % field14355.length];
   }

   @Nullable
   public static Difficulty method8908(String var0) {
      for (Difficulty var6 : values()) {
         if (var6.field14357.equals(var0)) {
            return var6;
         }
      }

      return null;
   }

   public String method8909() {
      return this.field14357;
   }

   public Difficulty method8910() {
      return field14355[(this.field14356 + 1) % field14355.length];
   }
}
