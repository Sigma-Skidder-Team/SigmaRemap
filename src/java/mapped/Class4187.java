package mapped;

import net.minecraft.block.BlockState;
import net.minecraft.entity.EntityType;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.Direction;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;

import java.util.Random;

public class Class4187 extends Class4180 {
   private final String field20476;
   private final Class80 field20477;
   private final Class2089 field20478;

   public Class4187(Class8761 var1, String var2, BlockPos var3, Class80 var4) {
      this(var1, var2, var3, var4, Class2089.field13614);
   }

   public Class4187(Class8761 var1, String var2, BlockPos var3, Class80 var4, Class2089 var5) {
      super(Class7792.field33476, 0);
      this.field20476 = var2;
      this.field20455 = var3;
      this.field20477 = var4;
      this.field20478 = var5;
      this.method12966(var1);
   }

   public Class4187(Class8761 var1, CompoundNBT var2) {
      super(Class7792.field33476, var2);
      this.field20476 = var2.method126("Template");
      this.field20477 = Class80.valueOf(var2.method126("Rot"));
      this.field20478 = Class2089.valueOf(var2.method126("Mi"));
      this.method12966(var1);
   }

   private void method12966(Class8761 var1) {
      Class8969 var4 = var1.method31603(new ResourceLocation("woodland_mansion/" + this.field20476));
      Class9463 var5 = new Class9463().method36428(true).method36426(this.field20477).method36425(this.field20478).method36434(Class7095.field30526);
      this.method12943(var4, this.field20455, var5);
   }

   @Override
   public void method12897(CompoundNBT var1) {
      super.method12897(var1);
      var1.method109("Template", this.field20476);
      var1.method109("Rot", this.field20454.method36437().name());
      var1.method109("Mi", this.field20454.method36436().name());
   }

   @Override
   public void method12944(String var1, BlockPos var2, Class1659 var3, Random var4, Class9764 var5) {
      if (var1.startsWith("Chest")) {
         Class80 var8 = this.field20454.method36437();
         BlockState var9 = Blocks.CHEST.method11579();
         if ("ChestWest".equals(var1)) {
            var9 = var9.method23465(Class3348.field18865, var8.method252(Direction.WEST));
         } else if ("ChestEast".equals(var1)) {
            var9 = var9.method23465(Class3348.field18865, var8.method252(Direction.EAST));
         } else if ("ChestSouth".equals(var1)) {
            var9 = var9.method23465(Class3348.field18865, var8.method252(Direction.SOUTH));
         } else if ("ChestNorth".equals(var1)) {
            var9 = var9.method23465(Class3348.field18865, var8.method252(Direction.NORTH));
         }

         this.method12935(var3, var5, var4, var2, Class8793.field39562, var9);
      } else {
         Class1025 var11;
         switch (var1) {
            case "Mage":
               var11 = EntityType.field41027.method33215(var3.method6970());
               break;
            case "Warrior":
               var11 = EntityType.field41099.method33215(var3.method6970());
               break;
            default:
               return;
         }

         var11.method4278();
         var11.method3272(var2, 0.0F, 0.0F);
         var11.method4276(var3, var3.method6807(var11.getPosition()), Class2202.field14394, (Class5093)null, (CompoundNBT)null);
         var3.method6995(var11);
         var3.setBlockState(var2, Blocks.AIR.method11579(), 2);
      }
   }
}
