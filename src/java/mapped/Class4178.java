package mapped;

import com.google.common.collect.ImmutableSet;
import net.minecraft.block.BlockState;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Direction;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.ISeedReader;

import javax.annotation.Nullable;
import java.util.List;
import java.util.Random;
import java.util.Set;

public abstract class Class4178 {
   public static final BlockState field20443 = Blocks.field37012.method11579();
   public Class9764 field20444;
   private Direction field20445;
   private Class2089 field20446;
   private Class80 field20447;
   public int field20448;
   private final Class7792 field20449;
   private static final Set<Block> field20450 = ImmutableSet.<Block>builder()
      .add(Blocks.NETHER_BRICK_FENCE)
      .add(Blocks.TORCH)
      .add(Blocks.WALL_TORCH)
      .add(Blocks.OAK_FENCE)
      .add(Blocks.field36867)
      .add(Blocks.field36871)
      .add(Blocks.field36870)
      .add(Blocks.field36868)
      .add(Blocks.field36869)
      .add(Blocks.LADDER)
      .add(Blocks.IRON_BARS)
      .build();

   public Class4178(Class7792 var1, int var2) {
      this.field20449 = var1;
      this.field20448 = var2;
   }

   public Class4178(Class7792 var1, CompoundNBT var2) {
      this(var1, var2.getInt("GD"));
      if (var2.contains("BB")) {
         this.field20444 = new Class9764(var2.getIntArray("BB"));
      }

      int var5 = var2.getInt("O");
      this.method12939(var5 != -1 ? Direction.method547(var5) : null);
   }

   public final CompoundNBT method12914() {
      CompoundNBT var3 = new CompoundNBT();
      var3.method109("id", Registry.field16116.getKey(this.method12941()).toString());
      var3.put("BB", this.field20444.method38402());
      Direction var4 = this.method12938();
      var3.method102("O", var4 != null ? var4.method534() : -1);
      var3.method102("GD", this.field20448);
      this.method12897(var3);
      return var3;
   }

   public abstract void method12897(CompoundNBT var1);

   public void method12894(Class4178 var1, List<Class4178> var2, Random var3) {
   }

   public abstract boolean method12896(ISeedReader var1, Class7480 var2, ChunkGenerator var3, Random var4, Class9764 var5, Class7481 var6, BlockPos var7);

   public Class9764 method12915() {
      return this.field20444;
   }

   public int method12916() {
      return this.field20448;
   }

   public boolean method12917(Class7481 var1, int var2) {
      int var5 = var1.field32174 << 4;
      int var6 = var1.field32175 << 4;
      return this.field20444.method38391(var5 - var2, var6 - var2, var5 + 15 + var2, var6 + 15 + var2);
   }

   public static Class4178 method12918(List<Class4178> var0, Class9764 var1) {
      for (Class4178 var5 : var0) {
         if (var5.method12915() != null && var5.method12915().method38390(var1)) {
            return var5;
         }
      }

      return null;
   }

   public boolean method12919(IBlockReader var1, Class9764 var2) {
      int var5 = Math.max(this.field20444.field45678 - 1, var2.field45678);
      int var6 = Math.max(this.field20444.field45679 - 1, var2.field45679);
      int var7 = Math.max(this.field20444.field45680 - 1, var2.field45680);
      int var8 = Math.min(this.field20444.field45681 + 1, var2.field45681);
      int var9 = Math.min(this.field20444.field45682 + 1, var2.field45682);
      int var10 = Math.min(this.field20444.field45683 + 1, var2.field45683);
      BlockPos.Mutable var11 = new BlockPos.Mutable();

      for (int var12 = var5; var12 <= var8; var12++) {
         for (int var13 = var7; var13 <= var10; var13++) {
            if (var1.getBlockState(var11.method8372(var12, var6, var13)).method23384().method31085()) {
               return true;
            }

            if (var1.getBlockState(var11.method8372(var12, var9, var13)).method23384().method31085()) {
               return true;
            }
         }
      }

      for (int var14 = var5; var14 <= var8; var14++) {
         for (int var16 = var6; var16 <= var9; var16++) {
            if (var1.getBlockState(var11.method8372(var14, var16, var7)).method23384().method31085()) {
               return true;
            }

            if (var1.getBlockState(var11.method8372(var14, var16, var10)).method23384().method31085()) {
               return true;
            }
         }
      }

      for (int var15 = var7; var15 <= var10; var15++) {
         for (int var17 = var6; var17 <= var9; var17++) {
            if (var1.getBlockState(var11.method8372(var5, var17, var15)).method23384().method31085()) {
               return true;
            }

            if (var1.getBlockState(var11.method8372(var8, var17, var15)).method23384().method31085()) {
               return true;
            }
         }
      }

      return false;
   }

   public int method12920(int var1, int var2) {
      Direction var5 = this.method12938();
      if (var5 == null) {
         return var1;
      } else {
         switch (Class8727.field39366[var5.ordinal()]) {
            case 1:
            case 2:
               return this.field20444.field45678 + var1;
            case 3:
               return this.field20444.field45681 - var2;
            case 4:
               return this.field20444.field45678 + var2;
            default:
               return var1;
         }
      }
   }

   public int method12921(int var1) {
      return this.method12938() != null ? var1 + this.field20444.field45679 : var1;
   }

   public int method12922(int var1, int var2) {
      Direction var5 = this.method12938();
      if (var5 == null) {
         return var2;
      } else {
         switch (Class8727.field39366[var5.ordinal()]) {
            case 1:
               return this.field20444.field45683 - var2;
            case 2:
               return this.field20444.field45680 + var2;
            case 3:
            case 4:
               return this.field20444.field45680 + var1;
            default:
               return var2;
         }
      }
   }

   public void method12923(ISeedReader var1, BlockState var2, int var3, int var4, int var5, Class9764 var6) {
      BlockPos var9 = new BlockPos(this.method12920(var3, var5), this.method12921(var4), this.method12922(var3, var5));
      if (var6.method38396(var9)) {
         if (this.field20446 != Class2089.field13614) {
            var2 = var2.method23396(this.field20446);
         }

         if (this.field20447 != Class80.field185) {
            var2 = var2.method23395(this.field20447);
         }

         var1.setBlockState(var9, var2, 2);
         FluidState var10 = var1.getFluidState(var9);
         if (!var10.method23474()) {
            var1.method6861().method20726(var9, var10.method23472(), 0);
         }

         if (field20450.contains(var2.getBlock())) {
            var1.method7011(var9).method7082(var9);
         }
      }
   }

   public BlockState method12924(IBlockReader var1, int var2, int var3, int var4, Class9764 var5) {
      int var8 = this.method12920(var2, var4);
      int var9 = this.method12921(var3);
      int var10 = this.method12922(var2, var4);
      BlockPos var11 = new BlockPos(var8, var9, var10);
      return var5.method38396(var11) ? var1.getBlockState(var11) : Blocks.AIR.method11579();
   }

   public boolean method12925(Class1662 var1, int var2, int var3, int var4, Class9764 var5) {
      int var8 = this.method12920(var2, var4);
      int var9 = this.method12921(var3 + 1);
      int var10 = this.method12922(var2, var4);
      BlockPos var11 = new BlockPos(var8, var9, var10);
      return var5.method38396(var11) ? var9 < var1.method6736(Class101.field297, var8, var10) : false;
   }

   public void method12926(ISeedReader var1, Class9764 var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      for (int var11 = var4; var11 <= var7; var11++) {
         for (int var12 = var3; var12 <= var6; var12++) {
            for (int var13 = var5; var13 <= var8; var13++) {
               this.method12923(var1, Blocks.AIR.method11579(), var12, var11, var13, var2);
            }
         }
      }
   }

   public void method12927(
           ISeedReader var1, Class9764 var2, int var3, int var4, int var5, int var6, int var7, int var8, BlockState var9, BlockState var10, boolean var11
   ) {
      for (int var14 = var4; var14 <= var7; var14++) {
         for (int var15 = var3; var15 <= var6; var15++) {
            for (int var16 = var5; var16 <= var8; var16++) {
               if (!var11 || !this.method12924(var1, var15, var14, var16, var2).isAir()) {
                  if (var14 != var4 && var14 != var7 && var15 != var3 && var15 != var6 && var16 != var5 && var16 != var8) {
                     this.method12923(var1, var10, var15, var14, var16, var2);
                  } else {
                     this.method12923(var1, var9, var15, var14, var16, var2);
                  }
               }
            }
         }
      }
   }

   public void method12928(
           ISeedReader var1, Class9764 var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9, Random var10, Class8347 var11
   ) {
      for (int var14 = var4; var14 <= var7; var14++) {
         for (int var15 = var3; var15 <= var6; var15++) {
            for (int var16 = var5; var16 <= var8; var16++) {
               if (!var9 || !this.method12924(var1, var15, var14, var16, var2).isAir()) {
                  var11.method29258(
                     var10, var15, var14, var16, var14 == var4 || var14 == var7 || var15 == var3 || var15 == var6 || var16 == var5 || var16 == var8
                  );
                  this.method12923(var1, var11.method29259(), var15, var14, var16, var2);
               }
            }
         }
      }
   }

   public void method12929(
      ISeedReader var1,
      Class9764 var2,
      Random var3,
      float var4,
      int var5,
      int var6,
      int var7,
      int var8,
      int var9,
      int var10,
      BlockState var11,
      BlockState var12,
      boolean var13,
      boolean var14
   ) {
      for (int var17 = var6; var17 <= var9; var17++) {
         for (int var18 = var5; var18 <= var8; var18++) {
            for (int var19 = var7; var19 <= var10; var19++) {
               if (!(var3.nextFloat() > var4)
                  && (!var13 || !this.method12924(var1, var18, var17, var19, var2).isAir())
                  && (!var14 || this.method12925(var1, var18, var17, var19, var2))) {
                  if (var17 != var6 && var17 != var9 && var18 != var5 && var18 != var8 && var19 != var7 && var19 != var10) {
                     this.method12923(var1, var12, var18, var17, var19, var2);
                  } else {
                     this.method12923(var1, var11, var18, var17, var19, var2);
                  }
               }
            }
         }
      }
   }

   public void method12930(ISeedReader var1, Class9764 var2, Random var3, float var4, int var5, int var6, int var7, BlockState var8) {
      if (var3.nextFloat() < var4) {
         this.method12923(var1, var8, var5, var6, var7, var2);
      }
   }

   public void method12931(ISeedReader var1, Class9764 var2, int var3, int var4, int var5, int var6, int var7, int var8, BlockState var9, boolean var10) {
      float var13 = (float)(var6 - var3 + 1);
      float var14 = (float)(var7 - var4 + 1);
      float var15 = (float)(var8 - var5 + 1);
      float var16 = (float)var3 + var13 / 2.0F;
      float var17 = (float)var5 + var15 / 2.0F;

      for (int var18 = var4; var18 <= var7; var18++) {
         float var19 = (float)(var18 - var4) / var14;

         for (int var20 = var3; var20 <= var6; var20++) {
            float var21 = ((float)var20 - var16) / (var13 * 0.5F);

            for (int var22 = var5; var22 <= var8; var22++) {
               float var23 = ((float)var22 - var17) / (var15 * 0.5F);
               if (!var10 || !this.method12924(var1, var20, var18, var22, var2).isAir()) {
                  float var24 = var21 * var21 + var19 * var19 + var23 * var23;
                  if (var24 <= 1.05F) {
                     this.method12923(var1, var9, var20, var18, var22, var2);
                  }
               }
            }
         }
      }
   }

   public void method12932(ISeedReader var1, BlockState var2, int var3, int var4, int var5, Class9764 var6) {
      int var9 = this.method12920(var3, var5);
      int var10 = this.method12921(var4);
      int var11 = this.method12922(var3, var5);
      if (var6.method38396(new BlockPos(var9, var10, var11))) {
         while (
            (var1.method7007(new BlockPos(var9, var10, var11)) || var1.getBlockState(new BlockPos(var9, var10, var11)).method23384().method31085()) && var10 > 1
         ) {
            var1.setBlockState(new BlockPos(var9, var10, var11), var2, 2);
            var10--;
         }
      }
   }

   public boolean method12933(ISeedReader var1, Class9764 var2, Random var3, int var4, int var5, int var6, ResourceLocation var7) {
      BlockPos var10 = new BlockPos(this.method12920(var4, var6), this.method12921(var5), this.method12922(var4, var6));
      return this.method12935(var1, var2, var3, var10, var7, (BlockState)null);
   }

   public static BlockState method12934(IBlockReader var0, BlockPos var1, BlockState var2) {
      Direction var5 = null;

      for (Direction var7 : Class76.field161) {
         BlockPos var8 = var1.method8349(var7);
         BlockState var9 = var0.getBlockState(var8);
         if (var9.method23448(Blocks.CHEST)) {
            return var2;
         }

         if (var9.method23409(var0, var8)) {
            if (var5 != null) {
               var5 = null;
               break;
            }

            var5 = var7;
         }
      }

      if (var5 == null) {
         Direction var10 = var2.<Direction>method23463(Class3198.field18484);
         BlockPos var11 = var1.method8349(var10);
         if (var0.getBlockState(var11).method23409(var0, var11)) {
            var10 = var10.method536();
            var11 = var1.method8349(var10);
         }

         if (var0.getBlockState(var11).method23409(var0, var11)) {
            var10 = var10.method537();
            var11 = var1.method8349(var10);
         }

         if (var0.getBlockState(var11).method23409(var0, var11)) {
            var10 = var10.method536();
            var1.method8349(var10);
         }

         return var2.method23465(Class3198.field18484, var10);
      } else {
         return var2.method23465(Class3198.field18484, var5.method536());
      }
   }

   public boolean method12935(Class1659 var1, Class9764 var2, Random var3, BlockPos var4, ResourceLocation var5, BlockState var6) {
      if (var2.method38396(var4) && !var1.getBlockState(var4).method23448(Blocks.CHEST)) {
         if (var6 == null) {
            var6 = method12934(var1, var4, Blocks.CHEST.method11579());
         }

         var1.setBlockState(var4, var6, 2);
         TileEntity var9 = var1.getTileEntity(var4);
         if (var9 instanceof Class941) {
            ((Class941)var9).method3744(var5, var3.nextLong());
         }

         return true;
      } else {
         return false;
      }
   }

   public boolean method12936(ISeedReader var1, Class9764 var2, Random var3, int var4, int var5, int var6, Direction var7, ResourceLocation var8) {
      BlockPos var11 = new BlockPos(this.method12920(var4, var6), this.method12921(var5), this.method12922(var4, var6));
      if (var2.method38396(var11) && !var1.getBlockState(var11).method23448(Blocks.DISPENSER)) {
         this.method12923(var1, Blocks.DISPENSER.method11579().method23465(Class3357.field18899, var7), var4, var5, var6, var2);
         TileEntity var12 = var1.getTileEntity(var11);
         if (var12 instanceof Class971) {
            ((Class971)var12).method3744(var8, var3.nextLong());
         }

         return true;
      } else {
         return false;
      }
   }

   public void method12937(int var1, int var2, int var3) {
      this.field20444.method38393(var1, var2, var3);
   }

   @Nullable
   public Direction method12938() {
      return this.field20445;
   }

   public void method12939(Direction var1) {
      this.field20445 = var1;
      if (var1 == null) {
         this.field20447 = Class80.field185;
         this.field20446 = Class2089.field13614;
      } else {
         switch (Class8727.field39366[var1.ordinal()]) {
            case 2:
               this.field20446 = Class2089.field13615;
               this.field20447 = Class80.field185;
               break;
            case 3:
               this.field20446 = Class2089.field13615;
               this.field20447 = Class80.field186;
               break;
            case 4:
               this.field20446 = Class2089.field13614;
               this.field20447 = Class80.field186;
               break;
            default:
               this.field20446 = Class2089.field13614;
               this.field20447 = Class80.field185;
         }
      }
   }

   public Class80 method12940() {
      return this.field20447;
   }

   public Class7792 method12941() {
      return this.field20449;
   }
}
