package remapped;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;

public class class_6290 implements class_9167 {
   private Color field_32154 = Color.cyan;
   private Color field_32150 = Color.blue;
   private int field_32151 = 0;
   private float field_32149 = 1.0F;
   private boolean field_32152;

   public class_6290() {
   }

   public class_6290(Color var1, Color var2, float var3) {
      this.field_32154 = var1;
      this.field_32150 = var2;
      this.field_32149 = var3;
   }

   @Override
   public void method_6895(BufferedImage var1, Graphics2D var2, class_3786 var3, class_6060 var4) {
      int var7 = var3.method_17553();
      float var8 = (float)var7 * this.field_32149;
      float var9 = (float)(-var4.method_27715() + var3.method_17577() + this.field_32151 + var7 / 2) - var8 / 2.0F;
      var2.setPaint(new GradientPaint(0.0F, var9, this.field_32154, 0.0F, var9 + var8, this.field_32150, this.field_32152));
      var2.fill(var4.method_27714());
   }

   public Color method_28694() {
      return this.field_32154;
   }

   public void method_28699(Color var1) {
      this.field_32154 = var1;
   }

   public Color method_28697() {
      return this.field_32150;
   }

   public void method_28695(Color var1) {
      this.field_32150 = var1;
   }

   public int method_28693() {
      return this.field_32151;
   }

   public void method_28692(int var1) {
      this.field_32151 = var1;
   }

   public float method_28701() {
      return this.field_32149;
   }

   public void method_28700(float var1) {
      this.field_32149 = var1;
   }

   public boolean method_28696() {
      return this.field_32152;
   }

   public void method_28702(boolean var1) {
      this.field_32152 = var1;
   }

   @Override
   public String toString() {
      return "Gradient";
   }

   @Override
   public List method_42259() {
      ArrayList var3 = new ArrayList();
      var3.add(class_8391.method_38661("Top color", this.field_32154));
      var3.add(class_8391.method_38661("Bottom color", this.field_32150));
      var3.add(
         class_8391.method_38660(
            "Offset", this.field_32151, "This setting allows you to move the gradient up or down. The gradient is normally centered on the glyph."
         )
      );
      var3.add(
         class_8391.method_38657(
            "Scale",
            this.field_32149,
            0.0F,
            1.0F,
            "This setting allows you to change the height of the gradient by apercentage. The gradient is normally the height of most glyphs in the font."
         )
      );
      var3.add(class_8391.method_38658("Cyclic", this.field_32152, "If this setting is checked, the gradient will repeat."));
      return var3;
   }

   @Override
   public void method_42258(List var1) {
      for (class_2278 var5 : var1) {
         if (!var5.method_10496().equals("Top color")) {
            if (!var5.method_10496().equals("Bottom color")) {
               if (!var5.method_10496().equals("Offset")) {
                  if (!var5.method_10496().equals("Scale")) {
                     if (var5.method_10496().equals("Cyclic")) {
                        this.field_32152 = (Boolean)var5.method_10500();
                     }
                  } else {
                     this.field_32149 = (Float)var5.method_10500();
                  }
               } else {
                  this.field_32151 = (Integer)var5.method_10500();
               }
            } else {
               this.field_32150 = (Color)var5.method_10500();
            }
         } else {
            this.field_32154 = (Color)var5.method_10500();
         }
      }
   }
}
