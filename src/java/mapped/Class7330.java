package mapped;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Objects;

public class Class7330 implements Class7329 {
   private static String[] field31411;
   private final double field31412;
   private final double field31413;
   private final double field31414;

   public Class7330(double var1, double var3, double var5) {
      this.field31412 = var1;
      this.field31413 = var3;
      this.field31414 = var5;
   }

   @Override
   public Vector3d method23228(Class6619 var1) {
      Class8513 var4 = var1.method20176();
      Vector3d var5 = var1.method20178().method8712(var1);
      float var6 = MathHelper.cos((var4.field37221 + 90.0F) * (float) (Math.PI / 180.0));
      float var7 = MathHelper.sin((var4.field37221 + 90.0F) * (float) (Math.PI / 180.0));
      float var8 = MathHelper.cos(-var4.field37220 * (float) (Math.PI / 180.0));
      float var9 = MathHelper.sin(-var4.field37220 * (float) (Math.PI / 180.0));
      float var10 = MathHelper.cos((-var4.field37220 + 90.0F) * (float) (Math.PI / 180.0));
      float var11 = MathHelper.sin((-var4.field37220 + 90.0F) * (float) (Math.PI / 180.0));
      Vector3d var12 = new Vector3d((double)(var6 * var8), (double)var9, (double)(var7 * var8));
      Vector3d var13 = new Vector3d((double)(var6 * var10), (double)var11, (double)(var7 * var10));
      Vector3d var14 = var12.method11335(var13).method11344(-1.0);
      double var15 = var12.field18048 * this.field31414 + var13.field18048 * this.field31413 + var14.field18048 * this.field31412;
      double var17 = var12.field18049 * this.field31414 + var13.field18049 * this.field31413 + var14.field18049 * this.field31412;
      double var19 = var12.field18050 * this.field31414 + var13.field18050 * this.field31413 + var14.field18050 * this.field31412;
      return new Vector3d(var5.field18048 + var15, var5.field18049 + var17, var5.field18050 + var19);
   }

   @Override
   public Class8513 method23229(Class6619 var1) {
      return Class8513.field37212;
   }

   @Override
   public boolean method23231() {
      return true;
   }

   @Override
   public boolean method23232() {
      return true;
   }

   @Override
   public boolean method23233() {
      return true;
   }

   public static Class7330 method23234(StringReader var0) throws CommandSyntaxException {
      int var3 = var0.getCursor();
      double var4 = method23235(var0, var3);
      if (var0.canRead() && var0.peek() == ' ') {
         var0.skip();
         double var6 = method23235(var0, var3);
         if (var0.canRead() && var0.peek() == ' ') {
            var0.skip();
            double var8 = method23235(var0, var3);
            return new Class7330(var4, var6, var8);
         } else {
            var0.setCursor(var3);
            throw Class6851.field29766.createWithContext(var0);
         }
      } else {
         var0.setCursor(var3);
         throw Class6851.field29766.createWithContext(var0);
      }
   }

   private static double method23235(StringReader var0, int var1) throws CommandSyntaxException {
      if (var0.canRead()) {
         if (var0.peek() != '^') {
            var0.setCursor(var1);
            throw Class6851.field29767.createWithContext(var0);
         } else {
            var0.skip();
            return var0.canRead() && var0.peek() != ' ' ? var0.readDouble() : 0.0;
         }
      } else {
         throw Class8796.field39619.createWithContext(var0);
      }
   }

   @Override
   public boolean equals(Object var1) {
      if (this != var1) {
         if (!(var1 instanceof Class7330)) {
            return false;
         } else {
            Class7330 var4 = (Class7330)var1;
            return this.field31412 == var4.field31412 && this.field31413 == var4.field31413 && this.field31414 == var4.field31414;
         }
      } else {
         return true;
      }
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.field31412, this.field31413, this.field31414);
   }
}
