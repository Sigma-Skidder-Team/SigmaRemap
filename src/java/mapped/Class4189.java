package mapped;

import com.google.common.collect.Lists;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.ISeedReader;

import java.util.List;
import java.util.Random;

public class Class4189 extends Class4188 {
   private final List<Class9764> field20480 = Lists.newLinkedList();

   public Class4189(int var1, Random var2, int var3, int var4, Class102 var5) {
      super(Class7792.field33427, var1, var5);
      this.field20479 = var5;
      this.field20444 = new Class9764(var3, 50, var4, var3 + 7 + var2.nextInt(6), 54 + var2.nextInt(6), var4 + 7 + var2.nextInt(6));
   }

   public Class4189(TemplateManager var1, CompoundNBT var2) {
      super(Class7792.field33427, var2);
      ListNBT var5 = var2.method131("Entrances", 11);

      for (int var6 = 0; var6 < var5.size(); var6++) {
         this.field20480.add(new Class9764(var5.method157(var6)));
      }
   }

   @Override
   public void method12894(Class4178 var1, List<Class4178> var2, Random var3) {
      int var6 = this.method12916();
      int var7 = this.field20444.method38399() - 3 - 1;
      if (var7 <= 0) {
         var7 = 1;
      }

      int var8 = 0;

      while (var8 < this.field20444.method38398()) {
         var8 += var3.nextInt(this.field20444.method38398());
         if (var8 + 3 > this.field20444.method38398()) {
            break;
         }

         Class4188 var9 = Class6883.method20959(
            var1,
            var2,
            var3,
            this.field20444.field45678 + var8,
            this.field20444.field45679 + var3.nextInt(var7) + 1,
            this.field20444.field45680 - 1,
            Direction.NORTH,
            var6
         );
         if (var9 != null) {
            Class9764 var10 = var9.method12915();
            this.field20480
               .add(
                  new Class9764(
                     var10.field45678, var10.field45679, this.field20444.field45680, var10.field45681, var10.field45682, this.field20444.field45680 + 1
                  )
               );
         }

         var8 += 4;
      }

      var8 = 0;

      while (var8 < this.field20444.method38398()) {
         var8 += var3.nextInt(this.field20444.method38398());
         if (var8 + 3 > this.field20444.method38398()) {
            break;
         }

         Class4188 var18 = Class6883.method20959(
            var1,
            var2,
            var3,
            this.field20444.field45678 + var8,
            this.field20444.field45679 + var3.nextInt(var7) + 1,
            this.field20444.field45683 + 1,
            Direction.SOUTH,
            var6
         );
         if (var18 != null) {
            Class9764 var21 = var18.method12915();
            this.field20480
               .add(
                  new Class9764(
                     var21.field45678, var21.field45679, this.field20444.field45683 - 1, var21.field45681, var21.field45682, this.field20444.field45683
                  )
               );
         }

         var8 += 4;
      }

      var8 = 0;

      while (var8 < this.field20444.method38400()) {
         var8 += var3.nextInt(this.field20444.method38400());
         if (var8 + 3 > this.field20444.method38400()) {
            break;
         }

         Class4188 var19 = Class6883.method20959(
            var1,
            var2,
            var3,
            this.field20444.field45678 - 1,
            this.field20444.field45679 + var3.nextInt(var7) + 1,
            this.field20444.field45680 + var8,
            Direction.WEST,
            var6
         );
         if (var19 != null) {
            Class9764 var22 = var19.method12915();
            this.field20480
               .add(
                  new Class9764(
                     this.field20444.field45678, var22.field45679, var22.field45680, this.field20444.field45678 + 1, var22.field45682, var22.field45683
                  )
               );
         }

         var8 += 4;
      }

      var8 = 0;

      while (var8 < this.field20444.method38400()) {
         var8 += var3.nextInt(this.field20444.method38400());
         if (var8 + 3 > this.field20444.method38400()) {
            break;
         }

         Class4188 var20 = Class6883.method20959(
            var1,
            var2,
            var3,
            this.field20444.field45681 + 1,
            this.field20444.field45679 + var3.nextInt(var7) + 1,
            this.field20444.field45680 + var8,
            Direction.EAST,
            var6
         );
         if (var20 != null) {
            Class9764 var23 = var20.method12915();
            this.field20480
               .add(
                  new Class9764(
                     this.field20444.field45681 - 1, var23.field45679, var23.field45680, this.field20444.field45681, var23.field45682, var23.field45683
                  )
               );
         }

         var8 += 4;
      }
   }

   @Override
   public boolean method12896(ISeedReader var1, Class7480 var2, ChunkGenerator var3, Random var4, Class9764 var5, ChunkPos var6, BlockPos var7) {
      if (this.method12919(var1, var5)) {
         return false;
      } else {
         this.method12927(
            var1,
            var5,
            this.field20444.field45678,
            this.field20444.field45679,
            this.field20444.field45680,
            this.field20444.field45681,
            this.field20444.field45679,
            this.field20444.field45683,
            Blocks.field36396.method11579(),
            field20443,
            true
         );
         this.method12927(
            var1,
            var5,
            this.field20444.field45678,
            this.field20444.field45679 + 1,
            this.field20444.field45680,
            this.field20444.field45681,
            Math.min(this.field20444.field45679 + 3, this.field20444.field45682),
            this.field20444.field45683,
            field20443,
            field20443,
            false
         );

         for (Class9764 var11 : this.field20480) {
            this.method12927(
               var1,
               var5,
               var11.field45678,
               var11.field45682 - 2,
               var11.field45680,
               var11.field45681,
               var11.field45682,
               var11.field45683,
               field20443,
               field20443,
               false
            );
         }

         this.method12931(
            var1,
            var5,
            this.field20444.field45678,
            this.field20444.field45679 + 4,
            this.field20444.field45680,
            this.field20444.field45681,
            this.field20444.field45682,
            this.field20444.field45683,
            field20443,
            false
         );
         return true;
      }
   }

   @Override
   public void method12937(int var1, int var2, int var3) {
      super.method12937(var1, var2, var3);

      for (Class9764 var7 : this.field20480) {
         var7.method38393(var1, var2, var3);
      }
   }

   @Override
   public void method12897(CompoundNBT var1) {
      super.method12897(var1);
      ListNBT var4 = new ListNBT();

      for (Class9764 var6 : this.field20480) {
         var4.add(var6.method38402());
      }

      var1.put("Entrances", var4);
   }
}
