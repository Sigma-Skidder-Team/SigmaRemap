package remapped;

import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;

public class class_4453 extends class_7186 {
   private LongSet field_21699 = new LongOpenHashSet();
   private LongSet field_21697 = new LongOpenHashSet();

   public class_4453(String var1) {
      super(var1);
   }

   @Override
   public void method_32924(CompoundNBT var1) {
      this.field_21699 = new LongOpenHashSet(var1.method_25942("All"));
      this.field_21697 = new LongOpenHashSet(var1.method_25942("Remaining"));
   }

   @Override
   public CompoundNBT method_32920(CompoundNBT var1) {
      var1.method_25962("All", this.field_21699.toLongArray());
      var1.method_25962("Remaining", this.field_21697.toLongArray());
      return var1;
   }

   public void method_20642(long var1) {
      this.field_21699.add(var1);
      this.field_21697.add(var1);
   }

   public boolean method_20641(long var1) {
      return this.field_21699.contains(var1);
   }

   public boolean method_20640(long var1) {
      return this.field_21697.contains(var1);
   }

   public void method_20639(long var1) {
      this.field_21697.remove(var1);
   }

   public LongSet method_20643() {
      return this.field_21699;
   }
}
