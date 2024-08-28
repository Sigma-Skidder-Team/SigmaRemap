package mapped;

import java.awt.BasicStroke;
import java.awt.Shape;
import java.awt.Stroke;
import java.awt.geom.FlatteningPathIterator;
import java.awt.geom.GeneralPath;

public class Class6620 implements Stroke {
   private static String[] field29136;
   private static final float field29137 = 1.0F;
   public final Class7186 field29138;

   public Class6620(Class7186 var1) {
      this.field29138 = var1;
   }

   @Override
   public Shape createStrokedShape(Shape var1) {
      GeneralPath var4 = new GeneralPath();
      var1 = new BasicStroke(this.field29138.method22542(), 2, this.field29138.method22546()).createStrokedShape(var1);
      FlatteningPathIterator var5 = new FlatteningPathIterator(var1.getPathIterator(null), 1.0);
      float[] var6 = new float[6];
      float var7 = 0.0F;
      float var8 = 0.0F;
      float var9 = 0.0F;
      float var10 = 0.0F;
      float var11 = 0.0F;
      float var12 = 0.0F;
      int var13 = 0;

      for (float var14 = 0.0F; !var5.isDone(); var5.next()) {
         var13 = var5.currentSegment(var6);
         switch (var13) {
            case 0:
               var7 = var9 = this.method20184(var6[0]);
               var8 = var10 = this.method20184(var6[1]);
               var4.moveTo(var7, var8);
               var14 = 0.0F;
               continue;
            case 1:
               break;
            case 2:
            case 3:
            default:
               continue;
            case 4:
               var6[0] = var7;
               var6[1] = var8;
         }

         var11 = this.method20184(var6[0]);
         var12 = this.method20184(var6[1]);
         float var15 = var11 - var9;
         float var16 = var12 - var10;
         float var17 = (float)Math.sqrt((double)(var15 * var15 + var16 * var16));
         if (var17 >= var14) {
            for (float var18 = 1.0F / var17; var17 >= var14; var14 += Class7186.method22554(this.field29138)) {
               float var19 = var9 + var14 * var15 * var18;
               float var20 = var10 + var14 * var16 * var18;
               var4.lineTo(this.method20184(var19), this.method20184(var20));
            }
         }

         var14 -= var17;
         var9 = var11;
         var10 = var12;
      }

      return var4;
   }

   private float method20184(float var1) {
      return var1 + (float)Math.random() * Class7186.method22555(this.field29138) * 2.0F - 1.0F;
   }
}
