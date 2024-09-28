package mapped;

import java.util.List;
import java.util.Random;

import net.minecraft.util.Rotation;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.gen.feature.template.TemplateManager;
import org.apache.commons.lang3.mutable.MutableObject;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class8814 {
   private static String[] field39651;
   private static final Logger field39652 = LogManager.getLogger();

   public static void method31820(
      DynamicRegistries var0,
      Class4700 var1,
      Class6989 var2,
      ChunkGenerator var3,
      TemplateManager var4,
      BlockPos var5,
      List<? super Class4193> var6,
      Random var7,
      boolean var8,
      boolean var9
   ) {
      Structure.method11365();
      MutableRegistry var12 = var0.<Class9369>getRegistry(Registry.field16105);
      Rotation var13 = Rotation.method254(var7);
      Class9369 var14 = var1.method14743().get();
      Class7487 var15 = var14.method35535(var7);
      Class4193 var16 = var2.method21640(var4, var15, var5, var15.method24383(), var13, var15.method24375(var4, var5, var13));
      Class9764 var17 = var16.method12915();
      int var18 = (var17.field45681 + var17.field45678) / 2;
      int var19 = (var17.field45683 + var17.field45680) / 2;
      int var20;
      if (!var9) {
         var20 = var5.getY();
      } else {
         var20 = var5.getY() + var3.method17828(var18, var19, Heightmap.Type.WORLD_SURFACE_WG);
      }

      int var21 = var17.field45679 + var16.method12979();
      var16.method12937(0, var20 - var21, 0);
      var6.add(var16);
      if (var1.method14742() > 0) {
         AxisAlignedBB var23 = new AxisAlignedBB(
            (double)(var18 - 80), (double)(var20 - 80), (double)(var19 - 80), (double)(var18 + 80 + 1), (double)(var20 + 80 + 1), (double)(var19 + 80 + 1)
         );
         Class9777 var24 = new Class9777(var12, var1.method14742(), var2, var3, var4, var6, var7);
         Class9777.method38551(var24)
            .addLast(
               new Class7213(
                  var16,
                  new MutableObject(
                     VoxelShapes.combineAndSimplify(VoxelShapes.create(var23), VoxelShapes.create(AxisAlignedBB.method19656(var17)), IBooleanFunction.ONLY_FIRST)
                  ),
                  var20 + 80,
                  0
               )
            );

         while (!Class9777.method38551(var24).isEmpty()) {
            Class7213 var25 = (Class7213)Class9777.method38551(var24).removeFirst();
            Class9777.method38552(
               var24, Class7213.method22654(var25), Class7213.method22655(var25), Class7213.method22656(var25), Class7213.method22657(var25), var8
            );
         }
      }
   }

   public static void method31821(
           DynamicRegistries var0, Class4193 var1, int var2, Class6989 var3, ChunkGenerator var4, TemplateManager var5, List<? super Class4193> var6, Random var7
   ) {
      MutableRegistry var10 = var0.<Class9369>getRegistry(Registry.field16105);
      Class9777 var11 = new Class9777(var10, var2, var3, var4, var5, var6, var7);
      Class9777.method38551(var11).addLast(new Class7213(var1, new MutableObject(VoxelShapes.INFINITY), 0, 0));

      while (!Class9777.method38551(var11).isEmpty()) {
         Class7213 var12 = (Class7213)Class9777.method38551(var11).removeFirst();
         Class9777.method38552(
            var11, Class7213.method22654(var12), Class7213.method22655(var12), Class7213.method22656(var12), Class7213.method22657(var12), false
         );
      }
   }

   // $VF: synthetic method
   public static Logger method31822() {
      return field39652;
   }
}
