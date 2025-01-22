package mapped;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.state.properties.StructureMode;
import net.minecraft.util.Direction;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.util.math.MutableBoundingBox;
import net.minecraft.world.ISeedReader;
import net.minecraft.world.gen.ChunkGenerator;
import net.minecraft.world.gen.feature.structure.StructureManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Random;

public abstract class Class4180 extends Class4178 {
   private static final Logger field20452 = LogManager.getLogger();
   public Class8969 field20453;
   public Class9463 field20454;
   public BlockPos field20455;

   public Class4180(Class7792 var1, int var2) {
      super(var1, var2);
   }

   public Class4180(Class7792 var1, CompoundNBT var2) {
      super(var1, var2);
      this.field20455 = new BlockPos(var2.getInt("TPX"), var2.getInt("TPY"), var2.getInt("TPZ"));
   }

   public void method12943(Class8969 var1, BlockPos var2, Class9463 var3) {
      this.field20453 = var1;
      this.method12939(Direction.NORTH);
      this.field20455 = var2;
      this.field20454 = var3;
      this.field20444 = var1.method32909(var3, var2);
   }

   @Override
   public void method12897(CompoundNBT var1) {
      var1.putInt("TPX", this.field20455.getX());
      var1.putInt("TPY", this.field20455.getY());
      var1.putInt("TPZ", this.field20455.getZ());
   }

   @Override
   public boolean method12896(ISeedReader var1, StructureManager var2, ChunkGenerator var3, Random var4, MutableBoundingBox var5, ChunkPos var6, BlockPos var7) {
      this.field20454.method36430(var5);
      this.field20444 = this.field20453.method32909(this.field20454, this.field20455);
      if (this.field20453.method32899(var1, this.field20455, var7, this.field20454, var4, 2)) {
         for (Class8266 var11 : this.field20453.method32893(this.field20455, this.field20454, Blocks.STRUCTURE_BLOCK)) {
            if (var11.field35532 != null) {
               StructureMode var12 = StructureMode.valueOf(var11.field35532.getString("mode"));
               if (var12 == StructureMode.field321) {
                  this.method12944(var11.field35532.getString("metadata"), var11.field35530, var1, var4, var5);
               }
            }
         }

         for (Class8266 var18 : this.field20453.method32893(this.field20455, this.field20454, Blocks.JIGSAW)) {
            if (var18.field35532 != null) {
               String var19 = var18.field35532.getString("final_state");
               Class8268 var13 = new Class8268(new StringReader(var19), false);
               BlockState var14 = Blocks.AIR.getDefaultState();

               try {
                  var13.method28840(true);
                  BlockState var15 = var13.method28837();
                  if (var15 != null) {
                     var14 = var15;
                  } else {
                     field20452.error("Error while parsing blockstate {} in jigsaw block @ {}", var19, var18.field35530);
                  }
               } catch (CommandSyntaxException var16) {
                  field20452.error("Error while parsing blockstate {} in jigsaw block @ {}", var19, var18.field35530);
               }

               var1.setBlockState(var18.field35530, var14, 3);
            }
         }
      }

      return true;
   }

   public abstract void method12944(String var1, BlockPos var2, ServerWorldAccess var3, Random var4, MutableBoundingBox var5);

   @Override
   public void method12937(int var1, int var2, int var3) {
      super.method12937(var1, var2, var3);
      this.field20455 = this.field20455.add(var1, var2, var3);
   }

   @Override
   public Rotation method12940() {
      return this.field20454.method36437();
   }
}
