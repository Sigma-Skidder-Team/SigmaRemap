package mapped;

import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import net.minecraft.potion.EffectInstance;

import java.util.List;

public class Food {
   private static String[] field43728;
   private final int field43729;
   private final float field43730;
   private final boolean field43731;
   private final boolean field43732;
   private final boolean field43733;
   private final List<Pair<EffectInstance, Float>> field43734;

   public Food(int var1, float var2, boolean var3, boolean var4, boolean var5, List<Pair<EffectInstance, Float>> var6) {
      this.field43729 = var1;
      this.field43730 = var2;
      this.field43731 = var3;
      this.field43732 = var4;
      this.field43733 = var5;
      this.field43734 = var6;
   }

   public int method36157() {
      return this.field43729;
   }

   public float method36158() {
      return this.field43730;
   }

   public boolean method36159() {
      return this.field43731;
   }

   public boolean method36160() {
      return this.field43732;
   }

   public boolean method36161() {
      return this.field43733;
   }

   public List<Pair<EffectInstance, Float>> method36162() {
      return this.field43734;
   }

   public static class Builder {
      private static String[] field35033;
      private int field35034;
      private float field35035;
      private boolean field35036;
      private boolean field35037;
      private boolean field35038;
      private final List<Pair<EffectInstance, Float>> field35039 = Lists.newArrayList();

      public Builder method28229(int var1) {
         this.field35034 = var1;
         return this;
      }

      public Builder method28230(float var1) {
         this.field35035 = var1;
         return this;
      }

      public Builder method28231() {
         this.field35036 = true;
         return this;
      }

      public Builder method28232() {
         this.field35037 = true;
         return this;
      }

      public Builder method28233() {
         this.field35038 = true;
         return this;
      }

      public Builder method28234(EffectInstance var1, float var2) {
         this.field35039.add(Pair.of(var1, var2));
         return this;
      }

      public Food method28235() {
         return new Food(this.field35034, this.field35035, this.field35036, this.field35037, this.field35038, this.field35039);
      }
   }
}
