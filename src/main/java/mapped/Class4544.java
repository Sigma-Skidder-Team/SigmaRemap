package mapped;

import net.minecraft.util.math.BlockPos;

import java.util.Iterator;

public class Class4544 implements Iterator<Class8066> {
   private Class9242 field21894;
   private Class4558 field21895;
   private Class2001 field21896 = new Class2001(0, 0, 0);

   public Class4544(Class9242 var1, BlockPos var2, BlockPos var3, int var4, int var5) {
      this.field21894 = var1;
      this.field21895 = new Class4558(var2, var3, var4, var5);
   }

   @Override
   public boolean hasNext() {
      return this.field21895.hasNext();
   }

   public Class8066 next() {
      BlockPos var3 = this.field21895.next();
      this.field21896.method8384(var3.getX() << 4, var3.getY() << 4, var3.getZ() << 4);
      return this.field21894.method34761(this.field21896);
   }

   @Override
   public void remove() {
      throw new RuntimeException("Not implemented");
   }
}
