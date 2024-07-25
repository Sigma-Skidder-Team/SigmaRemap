package remapped;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;

public class class_4082 implements class_9167 {
   private Color field_19864 = Color.white;

   public class_4082() {
   }

   public class_4082(Color var1) {
      this.field_19864 = var1;
   }

   @Override
   public void method_6895(BufferedImage var1, Graphics2D var2, class_3786 var3, class_6060 var4) {
      var2.setColor(this.field_19864);
      var2.fill(var4.method_27714());
   }

   public Color method_18817() {
      return this.field_19864;
   }

   public void method_18815(Color var1) {
      if (var1 != null) {
         this.field_19864 = var1;
      } else {
         throw new IllegalArgumentException("color cannot be null.");
      }
   }

   @Override
   public String toString() {
      return "Color";
   }

   @Override
   public List method_42259() {
      ArrayList var3 = new ArrayList();
      var3.add(class_8391.method_38661("Color", this.field_19864));
      return var3;
   }

   @Override
   public void method_42258(List var1) {
      for (class_2278 var5 : var1) {
         if (var5.method_10496().equals("Color")) {
            this.method_18815((Color)var5.method_10500());
         }
      }
   }
}
