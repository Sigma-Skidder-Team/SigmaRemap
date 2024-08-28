package mapped;

import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

import javax.annotation.Nullable;
import java.util.Arrays;
import java.util.Comparator;

public enum Class2197 {
   field14351(0, "peaceful"),
   field14352(1, "easy"),
   field14353(2, "normal"),
   field14354(3, "hard");

   private static final Class2197[] field14355 = Arrays.<Class2197>stream(values())
      .sorted(Comparator.comparingInt(Class2197::method8905))
      .<Class2197>toArray(Class2197[]::new);
   private final int field14356;
   private final String field14357;
   private static final Class2197[] field14358 = new Class2197[]{field14351, field14352, field14353, field14354};

   private Class2197(int var3, String var4) {
      this.field14356 = var3;
      this.field14357 = var4;
   }

   public int method8905() {
      return this.field14356;
   }

   public ITextComponent method8906() {
      return new TranslationTextComponent("options.difficulty." + this.field14357);
   }

   public static Class2197 method8907(int var0) {
      return field14355[var0 % field14355.length];
   }

   @Nullable
   public static Class2197 method8908(String var0) {
      for (Class2197 var6 : values()) {
         if (var6.field14357.equals(var0)) {
            return var6;
         }
      }

      return null;
   }

   public String method8909() {
      return this.field14357;
   }

   public Class2197 method8910() {
      return field14355[(this.field14356 + 1) % field14355.length];
   }
}
