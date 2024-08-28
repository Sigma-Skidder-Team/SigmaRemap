package mapped;

import java.util.Random;

public class Class8348 extends Class8347 {
   private static String[] field35875;

   private Class8348() {
   }

   @Override
   public void method29258(Random var1, int var2, int var3, int var4, boolean var5) {
      if (!var5) {
         this.field35874 = Class8487.field37012.method11579();
      } else {
         float var8 = var1.nextFloat();
         if (!(var8 < 0.2F)) {
            if (!(var8 < 0.5F)) {
               if (!(var8 < 0.55F)) {
                  this.field35874 = Class8487.field36615.method11579();
               } else {
                  this.field35874 = Class8487.field36621.method11579();
               }
            } else {
               this.field35874 = Class8487.field36616.method11579();
            }
         } else {
            this.field35874 = Class8487.field36617.method11579();
         }
      }
   }

   // $VF: synthetic method
   public Class8348(Class7337 var1) {
      this();
   }
}
