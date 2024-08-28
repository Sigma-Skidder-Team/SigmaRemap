package mapped;

import java.util.BitSet;
import java.util.Set;

public class Class9045 {
   private BitSet field41417;
   private static final int field41418 = Direction.values().length;
   private long field41419;

   public void method33632(Set<Direction> var1) {
      for (Direction var5 : var1) {
         for (Direction var7 : var1) {
            this.method33633(var5, var7, true);
         }
      }
   }

   public void method33633(Direction var1, Direction var2, boolean var3) {
      this.method33637(var1.ordinal() + var2.ordinal() * field41418, var3);
      this.method33637(var2.ordinal() + var1.ordinal() * field41418, var3);
   }

   public void method33634(boolean var1) {
      if (!var1) {
         this.field41419 = 0L;
      } else {
         this.field41419 = -1L;
      }
   }

   public boolean method33635(Direction var1, Direction var2) {
      return this.method33636(var1.ordinal() + var2.ordinal() * field41418);
   }

   @Override
   public String toString() {
      StringBuilder var3 = new StringBuilder();
      var3.append(' ');

      for (Direction var7 : Direction.values()) {
         var3.append(' ').append(var7.toString().toUpperCase().charAt(0));
      }

      var3.append('\n');

      for (Direction var16 : Direction.values()) {
         var3.append(var16.toString().toUpperCase().charAt(0));

         for (Direction var11 : Direction.values()) {
            if (var16 != var11) {
               boolean var12 = this.method33635(var16, var11);
               var3.append(' ').append((char)(!var12 ? 'n' : 'Y'));
            } else {
               var3.append("  ");
            }
         }

         var3.append('\n');
      }

      return var3.toString();
   }

   private boolean method33636(int var1) {
      return (this.field41419 & (long)(1 << var1)) != 0L;
   }

   private void method33637(int var1, boolean var2) {
      if (!var2) {
         this.method33639(var1);
      } else {
         this.method33638(var1);
      }
   }

   private void method33638(int var1) {
      this.field41419 |= (long)(1 << var1);
   }

   private void method33639(int var1) {
      this.field41419 &= (long)(~(1 << var1));
   }
}
