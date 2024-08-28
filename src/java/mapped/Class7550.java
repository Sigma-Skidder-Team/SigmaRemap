package mapped;

import java.awt.Rectangle;

public class Class7550 implements Class7547 {
   @Override
   public Rectangle method24668(Screen var1, int var2, int var3) {
      int var6 = var1.field4564 - 450;
      int var7 = 35;
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

   @Override
   public boolean method24670() {
      return true;
   }

   @Override
   public String[] method24669(Class1197 var1, int var2) {
      if (!(var1 instanceof Class1212)) {
         if (var1 instanceof Class1215) {
            Class1215 var5 = (Class1215)var1;
            Class2160 var6 = var5.method5772();
            return this.method24675(var6);
         } else {
            return null;
         }
      } else {
         return Class7548.method24671("of.options.shaders.DOWNLOAD");
      }
   }

   private String[] method24675(Class2160 var1) {
      return Class7548.method24671(var1.method8877());
   }
}
