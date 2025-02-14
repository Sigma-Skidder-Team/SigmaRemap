package mapped;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;

public class Class7188 implements Class7184 {
   private Color field30872 = Color.white;

   public Class7188() {
   }

   public Class7188(Color var1) {
      this.field30872 = var1;
   }

   @Override
   public void method22539(BufferedImage var1, Graphics2D var2, Class7431 var3, Class8140 var4) {
      var2.setColor(this.field30872);
      var2.fill(var4.method28224());
   }

   public Color method22562() {
      return this.field30872;
   }

   public void method22563(Color var1) {
      if (var1 != null) {
         this.field30872 = var1;
      } else {
         throw new IllegalArgumentException("color cannot be null.");
      }
   }

   @Override
   public String toString() {
      return "Color";
   }

   @Override
   public List method22540() {
      ArrayList var3 = new ArrayList();
      var3.add(Class9439.method36284("Color", this.field30872));
      return var3;
   }

   @Override
   public void method22541(List<Class5438> var1) {
      for (Class5438 var5 : var1) {
         if (var5.method17103().equals("Color")) {
            this.method22563((Color)var5.method17100());
         }
      }
   }
}
