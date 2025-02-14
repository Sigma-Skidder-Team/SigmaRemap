package mapped;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Stroke;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;

public class Class7185 implements Class7184 {
   private float field30864 = 2.0F;
   private Color field30865 = Color.black;
   private int field30866 = 2;
   private Stroke field30867;

   public Class7185() {
   }

   public Class7185(int var1, Color var2) {
      this.field30864 = (float)var1;
      this.field30865 = var2;
   }

   @Override
   public void method22539(BufferedImage var1, Graphics2D var2, Class7431 var3, Class8140 var4) {
      var2 = (Graphics2D)var2.create();
      if (this.field30867 == null) {
         var2.setStroke(this.method22547());
      } else {
         var2.setStroke(this.field30867);
      }

      var2.setColor(this.field30865);
      var2.draw(var4.method28224());
      var2.dispose();
   }

   public float method22542() {
      return this.field30864;
   }

   public void method22543(int var1) {
      this.field30864 = (float)var1;
   }

   public Color method22544() {
      return this.field30865;
   }

   public void method22545(Color var1) {
      this.field30865 = var1;
   }

   public int method22546() {
      return this.field30866;
   }

   public Stroke method22547() {
      return (Stroke)(this.field30867 != null ? this.field30867 : new BasicStroke(this.field30864, 2, this.field30866));
   }

   public void method22548(Stroke var1) {
      this.field30867 = var1;
   }

   public void method22549(int var1) {
      this.field30866 = var1;
   }

   @Override
   public String toString() {
      return "Outline";
   }

   @Override
   public List method22540() {
      ArrayList var3 = new ArrayList();
      var3.add(Class9439.method36284("Color", this.field30865));
      var3.add(
         Class9439.method36286(
            "Width",
            this.field30864,
            0.1F,
            999.0F,
            "This setting controls the width of the outline. The glyphs will need padding so the outline doesn't get clipped."
         )
      );
      var3.add(
         Class9439.method36288(
            "Join",
            String.valueOf(this.field30866),
            new String[][]{{"Bevel", "2"}, {"Miter", "0"}, {"Round", "1"}},
            "This setting defines how the corners of the outline are drawn. This is usually only noticeable at large outline widths."
         )
      );
      return var3;
   }

   @Override
   public void method22541(List<Class5438> var1) {
      for (Class5438 var5 : var1) {
         if (!var5.method17103().equals("Color")) {
            if (!var5.method17103().equals("Width")) {
               if (var5.method17103().equals("Join")) {
                  this.field30866 = Integer.parseInt((String)var5.method17100());
               }
            } else {
               this.field30864 = (Float)var5.method17100();
            }
         } else {
            this.field30865 = (Color)var5.method17100();
         }
      }
   }
}
