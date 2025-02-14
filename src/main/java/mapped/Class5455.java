package mapped;

import net.minecraft.util.math.MutableBoundingBox;
import net.minecraft.world.gen.feature.structure.StructureStart;

public abstract class Class5455<C extends Class4698> extends StructureStart<C> {
   public Class5455(Structure<C> var1, int var2, int var3, MutableBoundingBox var4, int var5, long var6) {
      super(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public void method17113() {
      super.method17113();
      byte var3 = 12;
      this.field24197.minX -= 12;
      this.field24197.minY -= 12;
      this.field24197.minZ -= 12;
      this.field24197.maxX += 12;
      this.field24197.maxY += 12;
      this.field24197.maxZ += 12;
   }
}
