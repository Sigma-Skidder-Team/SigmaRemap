package remapped;

import java.awt.BasicStroke;
import java.awt.Shape;
import java.awt.Stroke;
import java.awt.geom.FlatteningPathIterator;
import java.awt.geom.GeneralPath;

public class class_800 implements Stroke {
   private static String[] field_4289;
   private static final float field_4291 = 1.0F;

   private class_800(class_8648 var1) {
      this.field_4290 = var1;
   }

   @Override
   public Shape createStrokedShape(Shape var1) {
      GeneralPath var4 = new GeneralPath();
      var1 = new BasicStroke(this.field_4290.method_42393(), 2, this.field_4290.method_42389()).createStrokedShape(var1);
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
               var7 = var9 = this.method_3542(var6[0]);
               var8 = var10 = this.method_3542(var6[1]);
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

         var11 = this.method_3542(var6[0]);
         var12 = this.method_3542(var6[1]);
         float var15 = var11 - var9;
         float var16 = var12 - var10;
         float var17 = (float)Math.sqrt((double)(var15 * var15 + var16 * var16));
         if (var17 >= var14) {
            for (float var18 = 1.0F / var17; var17 >= var14; var14 += class_8648.method_39663(this.field_4290)) {
               float var19 = var9 + var14 * var15 * var18;
               float var20 = var10 + var14 * var16 * var18;
               var4.lineTo(this.method_3542(var19), this.method_3542(var20));
            }
         }

         var14 -= var17;
         var9 = var11;
         var10 = var12;
      }

      return var4;
   }

   private float method_3542(float var1) {
      return var1 + (float)Math.random() * class_8648.method_39665(this.field_4290) * 2.0F - 1.0F;
   }
}
