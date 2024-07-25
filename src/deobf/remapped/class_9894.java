package remapped;

import java.nio.IntBuffer;
import java.util.Arrays;

public class class_9894 {
   private static String[] field_50169;
   private IntBuffer field_50170;
   private int field_50172;
   private boolean[] field_50171;
   private boolean[] field_50173;

   public class_9894(IntBuffer var1, int var2) {
      this.field_50170 = var1;
      this.field_50172 = var2;
      this.field_50171 = new boolean[var1.capacity()];
      this.field_50173 = new boolean[var1.capacity()];
   }

   public int method_45577(int var1) {
      return this.method_45578(var1, this.field_50171[var1]);
   }

   public int method_45576(int var1) {
      return this.method_45578(var1, !this.field_50171[var1]);
   }

   private int method_45578(int var1, boolean var2) {
      int var5 = !var2 ? 0 : this.field_50172;
      return this.field_50170.get(var5 + var1);
   }

   public void method_45579(int var1) {
      this.field_50171[var1] = !this.field_50171[var1];
      this.field_50173[var1] = true;
   }

   public boolean method_45580(int var1) {
      return this.field_50173[var1];
   }

   public void method_45575() {
      Arrays.fill(this.field_50171, false);
      Arrays.fill(this.field_50173, false);
   }
}
