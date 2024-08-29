package mapped;

import net.minecraft.util.math.BlockPos;

public class Class1995 implements Comparable<Class1995> {
   private static String[] field13015;
   private final int field13016;
   private final BlockPos field13017;
   private int field13018;
   private int field13019;

   public Class1995(int var1, BlockPos var2) {
      this.field13016 = var1;
      this.field13017 = var2;
   }

   public BlockPos method8283() {
      return this.field13017;
   }

   public void method8284(int var1) {
      if (var1 > 10) {
         var1 = 10;
      }

      this.field13018 = var1;
   }

   public int method8285() {
      return this.field13018;
   }

   public void method8286(int var1) {
      this.field13019 = var1;
   }

   public int method8287() {
      return this.field13019;
   }

   @Override
   public boolean equals(Object var1) {
      if (this != var1) {
         if (var1 != null && this.getClass() == var1.getClass()) {
            Class1995 var4 = (Class1995)var1;
            return this.field13016 == var4.field13016;
         } else {
            return false;
         }
      } else {
         return true;
      }
   }

   @Override
   public int hashCode() {
      return Integer.hashCode(this.field13016);
   }

   public int compareTo(Class1995 var1) {
      return this.field13018 == var1.field13018 ? Integer.compare(this.field13016, var1.field13016) : Integer.compare(this.field13018, var1.field13018);
   }
}
