package remapped;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Stroke;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;

public class class_9196 implements class_9167 {
   private float field_47042 = 2.0F;
   private Color field_47045 = Color.black;
   private int field_47041 = 2;
   private Stroke field_47044;

   public class_9196() {
   }

   public class_9196(int var1, Color var2) {
      this.field_47042 = (float)var1;
      this.field_47045 = var2;
   }

   @Override
   public void method_6895(BufferedImage var1, Graphics2D var2, class_3786 var3, class_6060 var4) {
      var2 = (Graphics2D)var2.create();
      if (this.field_47044 == null) {
         var2.setStroke(this.method_42387());
      } else {
         var2.setStroke(this.field_47044);
      }

      var2.setColor(this.field_47045);
      var2.draw(var4.method_27714());
      var2.dispose();
   }

   public float method_42393() {
      return this.field_47042;
   }

   public void method_42392(int var1) {
      this.field_47042 = (float)var1;
   }

   public Color method_42390() {
      return this.field_47045;
   }

   public void method_42386(Color var1) {
      this.field_47045 = var1;
   }

   public int method_42389() {
      return this.field_47041;
   }

   public Stroke method_42387() {
      return (Stroke)(this.field_47044 != null ? this.field_47044 : new BasicStroke(this.field_47042, 2, this.field_47041));
   }

   public void method_42394(Stroke var1) {
      this.field_47044 = var1;
   }

   public void method_42391(int var1) {
      this.field_47041 = var1;
   }

   @Override
   public String toString() {
      return "Outline";
   }

   @Override
   public List method_42259() {
      ArrayList var3 = new ArrayList();
      var3.add(class_8391.method_38661("Color", this.field_47045));
      var3.add(
         class_8391.method_38657(
            "Width",
            this.field_47042,
            0.1F,
            999.0F,
            "This setting controls the width of the outline. The glyphs will need padding so the outline doesn't get clipped."
         )
      );
      var3.add(
         class_8391.method_38664(
            "Join",
            String.valueOf(this.field_47041),
            new String[][]{{"Bevel", "2"}, {"Miter", "0"}, {"Round", "1"}},
            "This setting defines how the corners of the outline are drawn. This is usually only noticeable at large outline widths."
         )
      );
      return var3;
   }

   @Override
   public void method_42258(List var1) {
      for (class_2278 var5 : var1) {
         if (!var5.method_10496().equals("Color")) {
            if (!var5.method_10496().equals("Width")) {
               if (var5.method_10496().equals("Join")) {
                  this.field_47041 = Integer.parseInt((String)var5.method_10500());
               }
            } else {
               this.field_47042 = (Float)var5.method_10500();
            }
         } else {
            this.field_47045 = (Color)var5.method_10500();
         }
      }
   }
}
