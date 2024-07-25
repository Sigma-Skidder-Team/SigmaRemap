package remapped;

import java.util.Arrays;
import org.lwjgl.opengl.ARBShaderObjects;

public abstract class class_6045 {
   private String field_30916;
   private int field_30918 = 0;
   private int[] field_30917 = new int[]{-1};
   private static final int field_30920 = -1;
   private static final int field_30919 = Integer.MIN_VALUE;

   public class_6045(String var1) {
      this.field_30916 = var1;
   }

   public void method_27607(int var1) {
      if (this.field_30918 != var1) {
         this.field_30918 = var1;
         this.method_27610();
         this.method_27603(var1);
      }
   }

   private void method_27610() {
      if (this.field_30918 >= this.field_30917.length) {
         int[] var3 = new int[this.field_30918 * 2];
         Arrays.fill(var3, Integer.MIN_VALUE);
         System.arraycopy(this.field_30917, 0, var3, 0, this.field_30917.length);
         this.field_30917 = var3;
      }
   }

   public abstract void method_27603(int var1);

   public String method_27605() {
      return this.field_30916;
   }

   public int method_27608() {
      return this.field_30918;
   }

   public int method_27604() {
      if (this.field_30918 > 0) {
         int var3 = this.field_30917[this.field_30918];
         if (var3 == Integer.MIN_VALUE) {
            var3 = ARBShaderObjects.glGetUniformLocationARB(this.field_30918, this.field_30916);
            this.field_30917[this.field_30918] = var3;
         }

         return var3;
      } else {
         return -1;
      }
   }

   public boolean method_27601() {
      return this.method_27604() >= 0;
   }

   public void method_27600() {
      this.field_30917[this.field_30918] = -1;
   }

   public void method_27598() {
      this.field_30918 = 0;
      this.field_30917 = new int[]{-1};
      this.method_27606();
   }

   public abstract void method_27606();

   public void method_27599() {
      if (class_6588.method_30273(this.field_30916) != 0) {
         this.method_27600();
      }
   }

   public static final void method_27609() {
      class_6588.method_30320();
   }

   @Override
   public String toString() {
      return this.field_30916;
   }
}
