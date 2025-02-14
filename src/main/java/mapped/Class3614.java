package mapped;

import java.util.Arrays;

import net.optifine.shaders.Shaders;
import org.lwjgl.opengl.ARBShaderObjects;

public abstract class Class3614 {
   private String field19598;
   private int field19599 = 0;
   private int[] field19600 = new int[]{-1};
   private static final int field19601 = -1;
   private static final int field19602 = Integer.MIN_VALUE;

   public Class3614(String var1) {
      this.field19598 = var1;
   }

   public void method12237(int var1) {
      if (this.field19599 != var1) {
         this.field19599 = var1;
         this.method12238();
         this.method12235(var1);
      }
   }

   private void method12238() {
      if (this.field19599 >= this.field19600.length) {
         int[] var3 = new int[this.field19599 * 2];
         Arrays.fill(var3, Integer.MIN_VALUE);
         System.arraycopy(this.field19600, 0, var3, 0, this.field19600.length);
         this.field19600 = var3;
      }
   }

   public abstract void method12235(int var1);

   public String method12239() {
      return this.field19598;
   }

   public int method12240() {
      return this.field19599;
   }

   public int method12241() {
      if (this.field19599 > 0) {
         int var3 = this.field19600[this.field19599];
         if (var3 == Integer.MIN_VALUE) {
            var3 = ARBShaderObjects.glGetUniformLocationARB(this.field19599, this.field19598);
            this.field19600[this.field19599] = var3;
         }

         return var3;
      } else {
         return -1;
      }
   }

   public boolean method12242() {
      return this.method12241() >= 0;
   }

   public void method12243() {
      this.field19600[this.field19599] = -1;
   }

   public void method12244() {
      this.field19599 = 0;
      this.field19600 = new int[]{-1};
      this.method12236();
   }

   public abstract void method12236();

   public void method12245() {
      if (Shaders.method32984(this.field19598) != 0) {
         this.method12243();
      }
   }

   public static final void method12246() {
      Shaders.method33171();
   }

   @Override
   public String toString() {
      return this.field19598;
   }
}
