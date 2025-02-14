package mapped;

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

public class Class7190 implements Class7184 {
   public static final int field30878 = 16;
   public static final float[][] field30879 = method22587(16);
   private Color field30880 = Color.black;
   private float field30881 = 0.6F;
   private float field30882 = 2.0F;
   private float field30883 = 2.0F;
   private int field30884 = 0;
   private int field30885 = 1;

   public Class7190() {
   }

   public Class7190(Color var1, int var2, int var3, float var4) {
      this.field30880 = var1;
      this.field30882 = (float)var2;
      this.field30883 = (float)var3;
      this.field30881 = var4;
   }

   @Override
   public void method22539(BufferedImage var1, Graphics2D var2, Class7431 var3, Class8140 var4) {
      var2 = (Graphics2D)var2.create();
      var2.translate((double)this.field30882, (double)this.field30883);
      var2.setColor(new Color(this.field30880.getRed(), this.field30880.getGreen(), this.field30880.getBlue(), Math.round(this.field30881 * 255.0F)));
      var2.fill(var4.method28224());

      for (Class7183 var8 : var3.method23990()) {
         if (var8 instanceof Class7185) {
            Composite var9 = var2.getComposite();
            var2.setComposite(AlphaComposite.Src);
            var2.setStroke(((Class7185)var8).method22547());
            var2.draw(var4.method28224());
            var2.setComposite(var9);
            break;
         }
      }

      var2.dispose();
      if (this.field30884 > 1 && this.field30884 < 16 && this.field30885 > 0) {
         this.method22574(var1);
      }
   }

   private void method22574(BufferedImage var1) {
      float[] var4 = field30879[this.field30884 - 1];
      Kernel var5 = new Kernel(var4.length, 1, var4);
      Kernel var6 = new Kernel(1, var4.length, var4);
      RenderingHints var7 = new RenderingHints(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_SPEED);
      ConvolveOp var8 = new ConvolveOp(var5, 1, var7);
      ConvolveOp var9 = new ConvolveOp(var6, 1, var7);
      BufferedImage var10 = Class9439.method36283();

      for (int var11 = 0; var11 < this.field30885; var11++) {
         var8.filter(var1, var10);
         var9.filter(var10, var1);
      }
   }

   public Color method22575() {
      return this.field30880;
   }

   public void method22576(Color var1) {
      this.field30880 = var1;
   }

   public float method22577() {
      return this.field30882;
   }

   public void method22578(float var1) {
      this.field30882 = var1;
   }

   public float method22579() {
      return this.field30883;
   }

   public void method22580(float var1) {
      this.field30883 = var1;
   }

   public int method22581() {
      return this.field30884;
   }

   public void method22582(int var1) {
      this.field30884 = var1;
   }

   public int method22583() {
      return this.field30885;
   }

   public void method22584(int var1) {
      this.field30885 = var1;
   }

   public float method22585() {
      return this.field30881;
   }

   public void method22586(float var1) {
      this.field30881 = var1;
   }

   @Override
   public String toString() {
      return "Shadow";
   }

   @Override
   public List method22540() {
      ArrayList var3 = new ArrayList();
      var3.add(Class9439.method36284("Color", this.field30880));
      var3.add(Class9439.method36286("Opacity", this.field30881, 0.0F, 1.0F, "This setting sets the translucency of the shadow."));
      var3.add(
         Class9439.method36286(
            "X distance",
            this.field30882,
            Float.MIN_VALUE,
            Float.MAX_VALUE,
            "This setting is the amount of pixels to offset the shadow on the x axis. The glyphs will need padding so the shadow doesn't get clipped."
         )
      );
      var3.add(
         Class9439.method36286(
            "Y distance",
            this.field30883,
            Float.MIN_VALUE,
            Float.MAX_VALUE,
            "This setting is the amount of pixels to offset the shadow on the y axis. The glyphs will need padding so the shadow doesn't get clipped."
         )
      );
      List<String[]> var4 = new ArrayList<>();
      var4.add(new String[]{"None", "0"});

      for (int var5 = 2; var5 < 16; var5++) {
         var4.add(new String[]{String.valueOf(var5)});
      }

      String[][] var6 = var4.toArray(new String[var4.size()][]);
      var3.add(
         Class9439.method36288(
            "Blur kernel size",
            String.valueOf(this.field30884),
            var6,
            "This setting controls how many neighboring pixels are used to blur the shadow. Set to \"None\" for no blur."
         )
      );
      var3.add(
         Class9439.method36285("Blur passes", this.field30885, "The setting is the number of times to apply a blur to the shadow. Set to \"0\" for no blur.")
      );
      return var3;
   }

   @Override
   public void method22541(List<Class5438> var1) {
      for (Class5438 var5 : var1) {
         if (!var5.method17103().equals("Color")) {
            if (!var5.method17103().equals("Opacity")) {
               if (!var5.method17103().equals("X distance")) {
                  if (!var5.method17103().equals("Y distance")) {
                     if (!var5.method17103().equals("Blur kernel size")) {
                        if (var5.method17103().equals("Blur passes")) {
                           this.field30885 = (Integer)var5.method17100();
                        }
                     } else {
                        this.field30884 = Integer.parseInt((String)var5.method17100());
                     }
                  } else {
                     this.field30883 = (Float)var5.method17100();
                  }
               } else {
                  this.field30882 = (Float)var5.method17100();
               }
            } else {
               this.field30881 = (Float)var5.method17100();
            }
         } else {
            this.field30880 = (Color)var5.method17100();
         }
      }
   }

   private static float[][] method22587(int var0) {
      float[][] var3 = method22588(var0);
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

   private static float[][] method22588(int var0) {
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
