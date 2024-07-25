package remapped;

import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Composite;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.awt.image.ConvolveOp;
import java.awt.image.Kernel;
import java.util.ArrayList;
import java.util.List;

public class class_8689 implements class_9167 {
   public static final int field_44570 = 16;
   public static final float[][] field_44571 = method_39890(16);
   private Color field_44577 = Color.black;
   private float field_44572 = 0.6F;
   private float field_44576 = 2.0F;
   private float field_44575 = 2.0F;
   private int field_44573 = 0;
   private int field_44574 = 1;

   public class_8689() {
   }

   public class_8689(Color var1, int var2, int var3, float var4) {
      this.field_44577 = var1;
      this.field_44576 = (float)var2;
      this.field_44575 = (float)var3;
      this.field_44572 = var4;
   }

   @Override
   public void method_6895(BufferedImage var1, Graphics2D var2, class_3786 var3, class_6060 var4) {
      var2 = (Graphics2D)var2.create();
      var2.translate((double)this.field_44576, (double)this.field_44575);
      var2.setColor(new Color(this.field_44577.getRed(), this.field_44577.getGreen(), this.field_44577.getBlue(), Math.round(this.field_44572 * 255.0F)));
      var2.fill(var4.method_27714());

      for (class_1496 var8 : var3.method_17589()) {
         if (var8 instanceof class_9196) {
            Composite var9 = var2.getComposite();
            var2.setComposite(AlphaComposite.Src);
            var2.setStroke(((class_9196)var8).method_42387());
            var2.draw(var4.method_27714());
            var2.setComposite(var9);
            break;
         }
      }

      var2.dispose();
      if (this.field_44573 > 1 && this.field_44573 < 16 && this.field_44574 > 0) {
         this.method_39893(var1);
      }
   }

   private void method_39893(BufferedImage var1) {
      float[] var4 = field_44571[this.field_44573 - 1];
      Kernel var5 = new Kernel(var4.length, 1, var4);
      Kernel var6 = new Kernel(1, var4.length, var4);
      RenderingHints var7 = new RenderingHints(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_SPEED);
      ConvolveOp var8 = new ConvolveOp(var5, 1, var7);
      ConvolveOp var9 = new ConvolveOp(var6, 1, var7);
      BufferedImage var10 = class_8391.method_38663();

      for (int var11 = 0; var11 < this.field_44574; var11++) {
         var8.filter(var1, var10);
         var9.filter(var10, var1);
      }
   }

   public Color method_39898() {
      return this.field_44577;
   }

   public void method_39895(Color var1) {
      this.field_44577 = var1;
   }

   public float method_39887() {
      return this.field_44576;
   }

   public void method_39885(float var1) {
      this.field_44576 = var1;
   }

   public float method_39899() {
      return this.field_44575;
   }

   public void method_39884(float var1) {
      this.field_44575 = var1;
   }

   public int method_39892() {
      return this.field_44573;
   }

   public void method_39894(int var1) {
      this.field_44573 = var1;
   }

   public int method_39897() {
      return this.field_44574;
   }

   public void method_39896(int var1) {
      this.field_44574 = var1;
   }

   public float method_39891() {
      return this.field_44572;
   }

   public void method_39889(float var1) {
      this.field_44572 = var1;
   }

   @Override
   public String toString() {
      return "Shadow";
   }

   @Override
   public List method_42259() {
      ArrayList var3 = new ArrayList();
      var3.add(class_8391.method_38661("Color", this.field_44577));
      var3.add(class_8391.method_38657("Opacity", this.field_44572, 0.0F, 1.0F, "This setting sets the translucency of the shadow."));
      var3.add(
         class_8391.method_38657(
            "X distance",
            this.field_44576,
            Float.MIN_VALUE,
            Float.MAX_VALUE,
            "This setting is the amount of pixels to offset the shadow on the x axis. The glyphs will need padding so the shadow doesn't get clipped."
         )
      );
      var3.add(
         class_8391.method_38657(
            "Y distance",
            this.field_44575,
            Float.MIN_VALUE,
            Float.MAX_VALUE,
            "This setting is the amount of pixels to offset the shadow on the y axis. The glyphs will need padding so the shadow doesn't get clipped."
         )
      );
      ArrayList var4 = new ArrayList();
      var4.add(new String[]{"None", "0"});

      for (int var5 = 2; var5 < 16; var5++) {
         var4.add(new String[]{String.valueOf(var5)});
      }

      String[][] var6 = var4.<String[]>toArray(new String[var4.size()][]);
      var3.add(
         class_8391.method_38664(
            "Blur kernel size",
            String.valueOf(this.field_44573),
            var6,
            "This setting controls how many neighboring pixels are used to blur the shadow. Set to \"None\" for no blur."
         )
      );
      var3.add(
         class_8391.method_38660("Blur passes", this.field_44574, "The setting is the number of times to apply a blur to the shadow. Set to \"0\" for no blur.")
      );
      return var3;
   }

   @Override
   public void method_42258(List var1) {
      for (class_2278 var5 : var1) {
         if (!var5.method_10496().equals("Color")) {
            if (!var5.method_10496().equals("Opacity")) {
               if (!var5.method_10496().equals("X distance")) {
                  if (!var5.method_10496().equals("Y distance")) {
                     if (!var5.method_10496().equals("Blur kernel size")) {
                        if (var5.method_10496().equals("Blur passes")) {
                           this.field_44574 = (Integer)var5.method_10500();
                        }
                     } else {
                        this.field_44573 = Integer.parseInt((String)var5.method_10500());
                     }
                  } else {
                     this.field_44575 = (Float)var5.method_10500();
                  }
               } else {
                  this.field_44576 = (Float)var5.method_10500();
               }
            } else {
               this.field_44572 = (Float)var5.method_10500();
            }
         } else {
            this.field_44577 = (Color)var5.method_10500();
         }
      }
   }

   private static float[][] method_39890(int var0) {
      float[][] var3 = method_39888(var0);
      float[][] var4 = new float[var3.length][];

      for (int var5 = 0; var5 < var4.length; var5++) {
         float var6 = 0.0F;
         var4[var5] = new float[var3[var5].length];

         for (int var7 = 0; var7 < var3[var5].length; var7++) {
            var6 += var3[var5][var7];
         }

         float var9 = 1.0F / var6;

         for (int var8 = 0; var8 < var3[var5].length; var8++) {
            var4[var5][var8] = var9 * var3[var5][var8];
         }
      }

      return var4;
   }

   private static float[][] method_39888(int var0) {
      if (var0 < 2) {
         var0 = 2;
      }

      float[][] var3 = new float[var0][];
      var3[0] = new float[1];
      var3[1] = new float[2];
      var3[0][0] = 1.0F;
      var3[1][0] = 1.0F;
      var3[1][1] = 1.0F;

      for (int var4 = 2; var4 < var0; var4++) {
         var3[var4] = new float[var4 + 1];
         var3[var4][0] = 1.0F;
         var3[var4][var4] = 1.0F;

         for (int var5 = 1; var5 < var3[var4].length - 1; var5++) {
            var3[var4][var5] = var3[var4 - 1][var5 - 1] + var3[var4 - 1][var5];
         }
      }

      return var3;
   }
}
