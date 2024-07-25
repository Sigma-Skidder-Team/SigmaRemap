package remapped;

import java.util.BitSet;
import java.util.Set;

public class class_6807 {
   private BitSet field_35114;
   private static final int field_35116 = Direction.values().length;
   private long field_35115;

   public void method_31245(Set<Direction> var1) {
      for (Direction var5 : var1) {
         for (Direction var7 : var1) {
            this.method_31247(var5, var7, true);
         }
      }
   }

   public void method_31247(Direction var1, Direction var2, boolean var3) {
      this.method_31252(var1.ordinal() + var2.ordinal() * field_35116, var3);
      this.method_31252(var2.ordinal() + var1.ordinal() * field_35116, var3);
   }

   public void method_31248(boolean var1) {
      if (!var1) {
         this.field_35115 = 0L;
      } else {
         this.field_35115 = -1L;
      }
   }

   public boolean method_31246(Direction var1, Direction var2) {
      return this.method_31244(var1.ordinal() + var2.ordinal() * field_35116);
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
               boolean var12 = this.method_31246(var16, var11);
               var3.append(' ').append((char)(!var12 ? 'n' : 'Y'));
            } else {
               var3.append("  ");
            }
         }

         var3.append('\n');
      }

      return var3.toString();
   }

   private boolean method_31244(int var1) {
      return (this.field_35115 & (long)(1 << var1)) != 0L;
   }

   private void method_31252(int var1, boolean var2) {
      if (!var2) {
         this.method_31250(var1);
      } else {
         this.method_31251(var1);
      }
   }

   private void method_31251(int var1) {
      this.field_35115 |= (long)(1 << var1);
   }

   private void method_31250(int var1) {
      this.field_35115 &= (long)(~(1 << var1));
   }
}
