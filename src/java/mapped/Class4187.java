package mapped;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.EntityType;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.Mirror;
import net.minecraft.util.Direction;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MutableBoundingBox;
import net.minecraft.world.gen.feature.template.TemplateManager;

import java.util.Random;

public class Class4187 extends Class4180 {
   private final String field20476;
   private final Rotation field20477;
   private final Mirror field20478;

   public Class4187(TemplateManager var1, String var2, BlockPos var3, Rotation var4) {
      this(var1, var2, var3, var4, Mirror.field13614);
   }

   public Class4187(TemplateManager var1, String var2, BlockPos var3, Rotation var4, Mirror var5) {
      super(Class7792.field33476, 0);
      this.field20476 = var2;
      this.field20455 = var3;
      this.field20477 = var4;
      this.field20478 = var5;
      this.method12966(var1);
   }

   public Class4187(TemplateManager var1, CompoundNBT var2) {
      super(Class7792.field33476, var2);
      this.field20476 = var2.getString("Template");
      this.field20477 = Rotation.valueOf(var2.getString("Rot"));
      this.field20478 = Mirror.valueOf(var2.getString("Mi"));
      this.method12966(var1);
   }

   private void method12966(TemplateManager var1) {
      Class8969 var4 = var1.method31603(new ResourceLocation("woodland_mansion/" + this.field20476));
      Class9463 var5 = new Class9463().method36428(true).method36426(this.field20477).method36425(this.field20478).method36434(Class7095.field30526);
      this.method12943(var4, this.field20455, var5);
   }

   @Override
   public void method12897(CompoundNBT var1) {
      super.method12897(var1);
      var1.putString("Template", this.field20476);
      var1.putString("Rot", this.field20454.method36437().name());
      var1.putString("Mi", this.field20454.method36436().name());
   }

   @Override
   public void method12944(String var1, BlockPos var2, ServerWorldAccess var3, Random var4, MutableBoundingBox var5) {
      if (var1.startsWith("Chest")) {
         Rotation var8 = this.field20454.method36437();
         BlockState var9 = Blocks.CHEST.getDefaultState();
         if ("ChestWest".equals(var1)) {
            var9 = var9.with(ChestBlock.field18865, var8.rotate(Direction.WEST));
         } else if ("ChestEast".equals(var1)) {
            var9 = var9.with(ChestBlock.field18865, var8.rotate(Direction.EAST));
         } else if ("ChestSouth".equals(var1)) {
            var9 = var9.with(ChestBlock.field18865, var8.rotate(Direction.SOUTH));
         } else if ("ChestNorth".equals(var1)) {
            var9 = var9.with(ChestBlock.field18865, var8.rotate(Direction.NORTH));
         }

         this.method12935(var3, var5, var4, var2, Class8793.field39562, var9);
      } else {
         Class1025 var11;
         switch (var1) {
            case "Mage":
               var11 = EntityType.EVOKER.create(var3.method6970());
               break;
            case "Warrior":
               var11 = EntityType.VINDICATOR.create(var3.method6970());
               break;
            default:
               return;
         }

         var11.method4278();
         var11.moveToBlockPosAndAngles(var2, 0.0F, 0.0F);
         var11.method4276(var3, var3.method6807(var11.getPosition()), SpawnReason.field14394, (Class5093)null, (CompoundNBT)null);
         var3.method6995(var11);
         var3.setBlockState(var2, Blocks.AIR.getDefaultState(), 2);
      }
   }
}
