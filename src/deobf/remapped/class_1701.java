package remapped;

import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.font.FontRenderContext;
import java.awt.image.BufferedImage;
import java.awt.image.WritableRaster;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import org.newdawn.slick.SlickException;

public class class_1701 {
   private static String[] field_8805;
   private static final class_1299 field_8806 = class_3980.method_18363();
   public static final int field_8795 = 256;
   private static ByteBuffer field_8808 = ByteBuffer.allocateDirect(262144);
   private static IntBuffer field_8798 = field_8808.asIntBuffer();
   private static BufferedImage field_8794 = new BufferedImage(256, 256, 2);
   private static Graphics2D field_8799 = (Graphics2D)field_8794.getGraphics();
   public static FontRenderContext field_8796 = field_8799.getFontRenderContext();
   private final class_3786 field_8792;
   private final int field_8803;
   private final int field_8802;
   private final class_8112 field_8807;
   private int field_8797;
   private int field_8800;
   private int field_8804;
   private boolean field_8801;
   private final List field_8793 = new ArrayList(32);

   public static Graphics2D method_7637() {
      return field_8799;
   }

   public class_1701(class_3786 var1, int var2, int var3) throws SlickException {
      this.field_8792 = var1;
      this.field_8803 = var2;
      this.field_8802 = var3;
      this.field_8807 = new class_8112(var2, var3);
   }

   public int method_7633(List var1, int var2) throws SlickException {
      if (this.field_8804 != 0 && var2 == -1) {
         int var5 = this.field_8797;
         int var6 = this.field_8800;
         int var7 = this.field_8804;
         Iterator var8 = this.method_7635(var1);

         while (var8.hasNext()) {
            class_6060 var9 = (class_6060)var8.next();
            int var10 = var9.method_27708();
            int var11 = var9.method_27712();
            if (var5 + var10 < this.field_8803) {
               if (var11 > var7) {
                  var7 = var11;
               }
            } else {
               var5 = 0;
               var6 += var7;
               var7 = var11;
            }

            if (var6 + var7 >= this.field_8803) {
               return 0;
            }

            var5 += var10;
         }
      }

      class_8709.field_44646.method_40021();
      this.field_8807.method_36849();
      int var12 = 0;
      Iterator var13 = this.method_7635(var1);

      while (var13.hasNext()) {
         class_6060 var14 = (class_6060)var13.next();
         int var15 = Math.min(256, var14.method_27708());
         int var16 = Math.min(256, var14.method_27712());
         if (this.field_8804 != 0) {
            if (this.field_8797 + var15 < this.field_8803) {
               if (var16 > this.field_8804) {
                  if (this.field_8800 + var16 >= this.field_8802) {
                     break;
                  }

                  this.field_8804 = var16;
               }
            } else {
               if (this.field_8800 + this.field_8804 + var16 >= this.field_8802) {
                  break;
               }

               this.field_8797 = 0;
               this.field_8800 = this.field_8800 + this.field_8804;
               this.field_8804 = var16;
            }
         } else {
            this.field_8804 = var16;
         }

         this.method_7632(var14, var15, var16);
         this.field_8793.add(var14);
         this.field_8797 += var15;
         var13.remove();
         if (++var12 == var2) {
            this.field_8801 = !this.field_8801;
            break;
         }
      }

      class_9162.method_42217();
      this.field_8801 = !this.field_8801;
      return var12;
   }

   private void method_7632(class_6060 var1, int var2, int var3) throws SlickException {
      field_8799.setComposite(AlphaComposite.Clear);
      field_8799.fillRect(0, 0, 256, 256);
      field_8799.setComposite(AlphaComposite.SrcOver);
      field_8799.setColor(Color.white);
      Iterator var6 = this.field_8792.method_17589().iterator();

      while (var6.hasNext()) {
         ((class_1496)var6.next()).method_6895(field_8794, field_8799, this.field_8792, var1);
      }

      var1.method_27717(null);
      WritableRaster var9 = field_8794.getRaster();
      int[] var7 = new int[var2];

      for (int var8 = 0; var8 < var3; var8++) {
         var9.getDataElements(0, var8, var2, 1, var7);
         field_8798.put(var7);
      }

      field_8806.method_5909(3553, 0, this.field_8797, this.field_8800, var2, var3, 32993, 5121, field_8808);
      ((Buffer)field_8798).clear();
      var1.method_27710(this.field_8807.method_36858(this.field_8797, this.field_8800, var2, var3));
   }

   private Iterator method_7635(List var1) {
      if (!this.field_8801) {
         ListIterator var4 = var1.listIterator(var1.size());
         return new class_3318(this, var4);
      } else {
         return var1.iterator();
      }
   }

   public List method_7634() {
      return this.field_8793;
   }

   public class_8112 method_7636() {
      return this.field_8807;
   }

   static {
      field_8808.order(ByteOrder.LITTLE_ENDIAN);
      field_8799.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
      field_8799.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
      field_8799.setRenderingHint(RenderingHints.KEY_FRACTIONALMETRICS, RenderingHints.VALUE_FRACTIONALMETRICS_ON);
   }
}
