package mapped;

import net.minecraft.util.math.MathHelper;

import java.util.Arrays;
import java.util.Comparator;

public enum GraphicsFanciness {
   FAST(0, "options.graphics.fast"),
   FANCY(1, "options.graphics.fancy"),
   FABULOUS(2, "options.graphics.fabulous");

   private static final GraphicsFanciness[] field13606 = Arrays.<GraphicsFanciness>stream(values())
      .sorted(Comparator.comparingInt(GraphicsFanciness::func_238162_a_))
      .<GraphicsFanciness>toArray(GraphicsFanciness[]::new);
   private final int field13607;
   private final String field13608;
   private static final GraphicsFanciness[] field13609 = new GraphicsFanciness[]{FAST, FANCY, FABULOUS};

   private GraphicsFanciness(int var3, String var4) {
      this.field13607 = var3;
      this.field13608 = var4;
   }

   public int func_238162_a_() {
      return this.field13607;
   }

   public String func_238164_b_() {
      return this.field13608;
   }

   public GraphicsFanciness method8745() {
      return method8746(this.func_238162_a_() + 1);
   }

   @Override
   public String toString() {
      switch (Class7896.field33848[this.ordinal()]) {
         case 1:
            return "fast";
         case 2:
            return "fancy";
         case 3:
            return "fabulous";
         default:
            throw new IllegalArgumentException();
      }
   }

   public static GraphicsFanciness method8746(int var0) {
      return field13606[MathHelper.normalizeAngle(var0, field13606.length)];
   }
}
