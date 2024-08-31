package mapped;

import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import net.minecraft.nbt.CompoundNBT;

public class Class7533 extends Class7530 {
   private LongSet field32337 = new LongOpenHashSet();
   private LongSet field32338 = new LongOpenHashSet();

   public Class7533(String var1) {
      super(var1);
   }

   @Override
   public void method24591(CompoundNBT var1) {
      this.field32337 = new LongOpenHashSet(var1.method129("All"));
      this.field32338 = new LongOpenHashSet(var1.method129("Remaining"));
   }

   @Override
   public CompoundNBT method24592(CompoundNBT var1) {
      var1.method113("All", this.field32337.toLongArray());
      var1.method113("Remaining", this.field32338.toLongArray());
      return var1;
   }

   public void method24619(long var1) {
      this.field32337.add(var1);
      this.field32338.add(var1);
   }

   public boolean method24620(long var1) {
      return this.field32337.contains(var1);
   }

   public boolean method24621(long var1) {
      return this.field32338.contains(var1);
   }

   public void method24622(long var1) {
      this.field32338.remove(var1);
   }

   public LongSet method24623() {
      return this.field32337;
   }
}
