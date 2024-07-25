package remapped;

import java.awt.Rectangle;

public class class_9657 implements class_2168 {
   public Rectangle 酭浣属홵ぶ娍(Screen var1, int var2, int var3) {
      int var6 = var1.field_941 - 450;
      byte var7 = 35;
      if (var6 < 10) {
         var6 = 10;
      }

      if (var3 <= var7 + 94) {
         var7 += 100;
      }

      int var8 = var6 + 150 + 150;
      int var9 = var7 + 84 + 10;
      return new Rectangle(var6, var7, var8 - var6, var9 - var7);
   }

   public boolean 쥅聛罡䬹釒唟() {
      return true;
   }

   public String[] 郝뫤竬鼒좯蛊(class_7114 var1, int var2) {
      if (!(var1 instanceof class_112)) {
         if (var1 instanceof class_6213) {
            class_6213 var5 = (class_6213)var1;
            class_4368 var6 = var5.method_28415();
            return this.method_44575(var6);
         } else {
            return null;
         }
      } else {
         return class_3403.method_15717("of.options.shaders.DOWNLOAD");
      }
   }

   private String[] method_44575(class_4368 var1) {
      return class_3403.method_15717(var1.method_20249());
   }
}
