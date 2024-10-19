package mapped;

import net.minecraft.block.Blocks;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.util.math.MutableBoundingBox;
import net.minecraft.world.ISeedReader;
import net.minecraft.world.gen.ChunkGenerator;
import net.minecraft.world.gen.feature.structure.StructureManager;
import net.minecraft.world.gen.feature.template.TemplateManager;

import java.util.List;
import java.util.Random;

public class Class4195 extends Class4194 {
   private final boolean field20496;

   public Class4195(Class7792 var1, int var2, Random var3, int var4, int var5) {
      super(var1, var2);
      this.field20496 = true;
      this.method12939(Direction.Plane.HORIZONTAL.method247(var3));
      this.field20495 = Class2213.field14470;
      if (this.method12938().getAxis() != Direction.Axis.Z) {
         this.field20444 = new MutableBoundingBox(var4, 64, var5, var4 + 5 - 1, 74, var5 + 5 - 1);
      } else {
         this.field20444 = new MutableBoundingBox(var4, 64, var5, var4 + 5 - 1, 74, var5 + 5 - 1);
      }
   }

   public Class4195(int var1, Random var2, MutableBoundingBox var3, Direction var4) {
      super(Class7792.field33453, var1);
      this.field20496 = false;
      this.method12939(var4);
      this.field20495 = this.method12985(var2);
      this.field20444 = var3;
   }

   public Class4195(Class7792 var1, CompoundNBT var2) {
      super(var1, var2);
      this.field20496 = var2.getBoolean("Source");
   }

   public Class4195(TemplateManager var1, CompoundNBT var2) {
      this(Class7792.field33453, var2);
   }

   @Override
   public void method12897(CompoundNBT var1) {
      super.method12897(var1);
      var1.putBoolean("Source", this.field20496);
   }

   @Override
   public void method12894(Class4178 var1, List<Class4178> var2, Random var3) {
      if (this.field20496) {
         Class9331.method35289(Class4200.class);
      }

      this.method12986((Class4196)var1, var2, var3, 1, 1);
   }

   public static Class4195 method12990(List<Class4178> var0, Random var1, int var2, int var3, int var4, Direction var5, int var6) {
      MutableBoundingBox var9 = MutableBoundingBox.method38388(var2, var3, var4, -1, -7, 0, 5, 11, 5, var5);
      return method12989(var9) && Class4178.method12918(var0, var9) == null ? new Class4195(var6, var1, var9, var5) : null;
   }

   @Override
   public boolean method12896(ISeedReader var1, StructureManager var2, ChunkGenerator var3, Random var4, MutableBoundingBox var5, ChunkPos var6, BlockPos var7) {
      this.method12928(var1, var5, 0, 0, 0, 4, 10, 4, true, var4, Class9331.method35288());
      this.method12984(var1, var4, var5, this.field20495, 1, 7, 0);
      this.method12984(var1, var4, var5, Class2213.field14470, 1, 1, 4);
      this.method12923(var1, Blocks.field36615.getDefaultState(), 2, 6, 1, var5);
      this.method12923(var1, Blocks.field36615.getDefaultState(), 1, 5, 1, var5);
      this.method12923(var1, Blocks.field36846.getDefaultState(), 1, 6, 1, var5);
      this.method12923(var1, Blocks.field36615.getDefaultState(), 1, 5, 2, var5);
      this.method12923(var1, Blocks.field36615.getDefaultState(), 1, 4, 3, var5);
      this.method12923(var1, Blocks.field36846.getDefaultState(), 1, 5, 3, var5);
      this.method12923(var1, Blocks.field36615.getDefaultState(), 2, 4, 3, var5);
      this.method12923(var1, Blocks.field36615.getDefaultState(), 3, 3, 3, var5);
      this.method12923(var1, Blocks.field36846.getDefaultState(), 3, 4, 3, var5);
      this.method12923(var1, Blocks.field36615.getDefaultState(), 3, 3, 2, var5);
      this.method12923(var1, Blocks.field36615.getDefaultState(), 3, 2, 1, var5);
      this.method12923(var1, Blocks.field36846.getDefaultState(), 3, 3, 1, var5);
      this.method12923(var1, Blocks.field36615.getDefaultState(), 2, 2, 1, var5);
      this.method12923(var1, Blocks.field36615.getDefaultState(), 1, 1, 1, var5);
      this.method12923(var1, Blocks.field36846.getDefaultState(), 1, 2, 1, var5);
      this.method12923(var1, Blocks.field36615.getDefaultState(), 1, 1, 2, var5);
      this.method12923(var1, Blocks.field36846.getDefaultState(), 1, 1, 3, var5);
      return true;
   }
}
