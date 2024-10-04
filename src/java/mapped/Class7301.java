package mapped;

import lol.Renderer;
import lol.SGL;
import lol.TextureImpl;

import java.awt.AlphaComposite;
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



public class Class7301 {
   private static String[] field31282;
   private static final SGL field31283 = Renderer.get();
   public static final int field31284 = 256;
   private static ByteBuffer field31285 = ByteBuffer.allocateDirect(262144);
   private static IntBuffer field31286 = field31285.asIntBuffer();
   private static BufferedImage field31287 = new BufferedImage(256, 256, 2);
   private static Graphics2D field31288 = (Graphics2D)field31287.getGraphics();
   public static FontRenderContext field31289 = field31288.getFontRenderContext();
   private final Class7431 field31290;
   private final int field31291;
   private final int field31292;
   private final Image field31293;
   private int field31294;
   private int field31295;
   private int field31296;
   private boolean field31297;
   private final List field31298 = new ArrayList(32);

   public static Graphics2D method23072() {
      return field31288;
   }

   public Class7301(Class7431 var1, int var2, int var3) throws Class2451 {
      this.field31290 = var1;
      this.field31291 = var2;
      this.field31292 = var3;
      this.field31293 = new Image(var2, var3);
   }

   public int method23073(List var1, int var2) throws Class2451 {
      if (this.field31296 != 0 && var2 == -1) {
         int var5 = this.field31294;
         int var6 = this.field31295;
         int var7 = this.field31296;
         Iterator var8 = this.method23075(var1);

         while (var8.hasNext()) {
            Class8140 var9 = (Class8140)var8.next();
            int var10 = var9.method28222();
            int var11 = var9.method28223();
            if (var5 + var10 < this.field31291) {
               if (var11 > var7) {
                  var7 = var11;
               }
            } else {
               var5 = 0;
               var6 += var7;
               var7 = var11;
            }

            if (var6 + var7 >= this.field31291) {
               return 0;
            }

            var5 += var10;
         }
      }

      Color.field16442.method10392();
      this.field31293.method23522();
      int var12 = 0;
      Iterator var13 = this.method23075(var1);

      while (var13.hasNext()) {
         Class8140 var14 = (Class8140)var13.next();
         int var15 = Math.min(256, var14.method28222());
         int var16 = Math.min(256, var14.method28223());
         if (this.field31296 != 0) {
            if (this.field31294 + var15 < this.field31291) {
               if (var16 > this.field31296) {
                  if (this.field31295 + var16 >= this.field31292) {
                     break;
                  }

                  this.field31296 = var16;
               }
            } else {
               if (this.field31295 + this.field31296 + var16 >= this.field31292) {
                  break;
               }

               this.field31294 = 0;
               this.field31295 = this.field31295 + this.field31296;
               this.field31296 = var16;
            }
         } else {
            this.field31296 = var16;
         }

         this.method23074(var14, var15, var16);
         this.field31298.add(var14);
         this.field31294 += var15;
         var13.remove();
         if (++var12 == var2) {
            this.field31297 = !this.field31297;
            break;
         }
      }

      TextureImpl.bindNone();
      this.field31297 = !this.field31297;
      return var12;
   }

   private void method23074(Class8140 var1, int var2, int var3) throws Class2451 {
      field31288.setComposite(AlphaComposite.Clear);
      field31288.fillRect(0, 0, 256, 256);
      field31288.setComposite(AlphaComposite.SrcOver);
      field31288.setColor(java.awt.Color.white);
      Iterator var6 = this.field31290.method23990().iterator();

      while (var6.hasNext()) {
         ((Class7183)var6.next()).method22539(field31287, field31288, this.field31290, var1);
      }

      var1.method28225(null);
      WritableRaster var9 = field31287.getRaster();
      int[] var7 = new int[var2];

      for (int var8 = 0; var8 < var3; var8++) {
         var9.getDataElements(0, var8, var2, 1, var7);
         field31286.put(var7);
      }

      field31283.method18415(3553, 0, this.field31294, this.field31295, var2, var3, 32993, 5121, field31285);
      ((Buffer)field31286).clear();
      var1.method28227(this.field31293.method23551(this.field31294, this.field31295, var2, var3));
   }

   private Iterator method23075(List var1) {
      if (!this.field31297) {
         ListIterator var4 = var1.listIterator(var1.size());
         return new Class4557(this, var4);
      } else {
         return var1.iterator();
      }
   }

   public List method23076() {
      return this.field31298;
   }

   public Image method23077() {
      return this.field31293;
   }

   static {
      field31285.order(ByteOrder.LITTLE_ENDIAN);
      field31288.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
      field31288.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
      field31288.setRenderingHint(RenderingHints.KEY_FRACTIONALMETRICS, RenderingHints.VALUE_FRACTIONALMETRICS_ON);
   }
}
