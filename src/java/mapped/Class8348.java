package mapped;

import net.minecraft.block.Blocks;

import java.util.Random;

public class Class8348 extends Class8347 {
   private static String[] field35875;

   private Class8348() {
   }

   @Override
   public void method29258(Random var1, int var2, int var3, int var4, boolean var5) {
      if (!var5) {
         this.field35874 = Blocks.field37012.getDefaultState();
      } else {
         float var8 = var1.nextFloat();
         if (!(var8 < 0.2F)) {
            if (!(var8 < 0.5F)) {
               if (!(var8 < 0.55F)) {
                  this.field35874 = Blocks.field36615.getDefaultState();
               } else {
                  this.field35874 = Blocks.field36621.getDefaultState();
               }
            } else {
               this.field35874 = Blocks.field36616.getDefaultState();
            }
         } else {
            this.field35874 = Blocks.field36617.getDefaultState();
         }
      }
   }

   // $VF: synthetic method
   public Class8348(Class7337 var1) {
      this();
   }
}
