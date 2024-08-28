package mapped;

import java.util.Arrays;
import java.util.Comparator;

public enum Class2087 {
   field13603(0, "options.graphics.fast"),
   field13604(1, "options.graphics.fancy"),
   field13605(2, "options.graphics.fabulous");

   private static final Class2087[] field13606 = Arrays.<Class2087>stream(values())
      .sorted(Comparator.comparingInt(Class2087::method8743))
      .<Class2087>toArray(Class2087[]::new);
   private final int field13607;
   private final String field13608;
   private static final Class2087[] field13609 = new Class2087[]{field13603, field13604, field13605};

   private Class2087(int var3, String var4) {
      this.field13607 = var3;
      this.field13608 = var4;
   }

   public int method8743() {
      return this.field13607;
   }

   public String method8744() {
      return this.field13608;
   }

   public Class2087 method8745() {
      return method8746(this.method8743() + 1);
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

   public static Class2087 method8746(int var0) {
      return field13606[MathHelper.normalizeAngle(var0, field13606.length)];
   }
}
