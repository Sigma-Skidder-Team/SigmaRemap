package remapped;

import java.awt.BasicStroke;
import java.awt.Shape;
import java.awt.Stroke;
import java.awt.geom.FlatteningPathIterator;
import java.awt.geom.GeneralPath;

public class class_6385 implements Stroke {
   private static String[] field_32605;
   private static final float field_32606 = 1.0F;

   private class_6385(class_8918 var1) {
      this.field_32604 = var1;
   }

   @Override
   public Shape createStrokedShape(Shape var1) {
      GeneralPath var4 = new GeneralPath();
      FlatteningPathIterator var5 = new FlatteningPathIterator(var1.getPathIterator(null), 1.0);
      float[] var6 = new float[6];
      float var7 = 0.0F;
      float var8 = 0.0F;
      float var9 = 0.0F;
      float var10 = 0.0F;
      float var11 = 0.0F;
      float var12 = 0.0F;
      int var13 = 0;
      float var14 = 0.0F;

      for (int var15 = 0; !var5.isDone(); var5.next()) {
         var13 = var5.currentSegment(var6);
         switch (var13) {
            case 0:
               var7 = var9 = var6[0];
               var8 = var10 = var6[1];
               var4.moveTo(var7, var8);
               var14 = class_8918.method_41014(this.field_32604) / 2.0F;
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

         var11 = var6[0];
         var12 = var6[1];
         float var16 = var11 - var9;
         float var17 = var12 - var10;
         float var18 = (float)Math.sqrt((double)(var16 * var16 + var17 * var17));
         if (var18 >= var14) {
            for (float var19 = 1.0F / var18; var18 >= var14; var15++) {
               float var20 = var9 + var14 * var16 * var19;
               float var21 = var10 + var14 * var17 * var19;
               if ((var15 & 1) == 0) {
                  var4.lineTo(
                     var20 + class_8918.method_41018(this.field_32604) * var17 * var19, var21 - class_8918.method_41018(this.field_32604) * var16 * var19
                  );
               } else {
                  var4.lineTo(
                     var20 - class_8918.method_41018(this.field_32604) * var17 * var19, var21 + class_8918.method_41018(this.field_32604) * var16 * var19
                  );
               }

               var14 += class_8918.method_41014(this.field_32604);
            }
         }

         var14 -= var18;
         var9 = var11;
         var10 = var12;
         if (var13 == 4) {
            var4.closePath();
         }
      }

      return new BasicStroke(this.field_32604.method_42393(), 2, this.field_32604.method_42389()).createStrokedShape(var4);
   }
}
