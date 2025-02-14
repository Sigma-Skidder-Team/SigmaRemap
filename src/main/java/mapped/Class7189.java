package mapped;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;

public class Class7189 implements Class7184 {
   private Color field30873 = Color.cyan;
   private Color field30874 = Color.blue;
   private int field30875 = 0;
   private float field30876 = 1.0F;
   private boolean field30877;

   public Class7189() {
   }

   public Class7189(Color var1, Color var2, float var3) {
      this.field30873 = var1;
      this.field30874 = var2;
      this.field30876 = var3;
   }

   @Override
   public void method22539(BufferedImage var1, Graphics2D var2, Class7431 var3, Class8140 var4) {
      int var7 = var3.method23982();
      float var8 = (float)var7 * this.field30876;
      float var9 = (float)(-var4.method28228() + var3.method23983() + this.field30875 + var7 / 2) - var8 / 2.0F;
      var2.setPaint(new GradientPaint(0.0F, var9, this.field30873, 0.0F, var9 + var8, this.field30874, this.field30877));
      var2.fill(var4.method28224());
   }

   public Color method22564() {
      return this.field30873;
   }

   public void method22565(Color var1) {
      this.field30873 = var1;
   }

   public Color method22566() {
      return this.field30874;
   }

   public void method22567(Color var1) {
      this.field30874 = var1;
   }

   public int method22568() {
      return this.field30875;
   }

   public void method22569(int var1) {
      this.field30875 = var1;
   }

   public float method22570() {
      return this.field30876;
   }

   public void method22571(float var1) {
      this.field30876 = var1;
   }

   public boolean method22572() {
      return this.field30877;
   }

   public void method22573(boolean var1) {
      this.field30877 = var1;
   }

   @Override
   public String toString() {
      return "Gradient";
   }

   @Override
   public List method22540() {
      ArrayList var3 = new ArrayList();
      var3.add(Class9439.method36284("Top color", this.field30873));
      var3.add(Class9439.method36284("Bottom color", this.field30874));
      var3.add(
         Class9439.method36285(
            "Offset", this.field30875, "This setting allows you to move the gradient up or down. The gradient is normally centered on the glyph."
         )
      );
      var3.add(
         Class9439.method36286(
            "Scale",
            this.field30876,
            0.0F,
            1.0F,
            "This setting allows you to change the height of the gradient by apercentage. The gradient is normally the height of most glyphs in the font."
         )
      );
      var3.add(Class9439.method36287("Cyclic", this.field30877, "If this setting is checked, the gradient will repeat."));
      return var3;
   }

   @Override
   public void method22541(List<Class5438> var1) {
      for (Class5438 var5 : var1) {
         if (!var5.method17103().equals("Top color")) {
            if (!var5.method17103().equals("Bottom color")) {
               if (!var5.method17103().equals("Offset")) {
                  if (!var5.method17103().equals("Scale")) {
                     if (var5.method17103().equals("Cyclic")) {
                        this.field30877 = (Boolean)var5.method17100();
                     }
                  } else {
                     this.field30876 = (Float)var5.method17100();
                  }
               } else {
                  this.field30875 = (Integer)var5.method17100();
               }
            } else {
               this.field30874 = (Color)var5.method17100();
            }
         } else {
            this.field30873 = (Color)var5.method17100();
         }
      }
   }
}
