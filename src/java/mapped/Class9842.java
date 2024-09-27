package mapped;

import net.minecraft.block.BlockState;
import net.minecraft.util.Direction;
import net.optifine.Config;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class Class9842 {
   private static final Random field45941 = new Random(0L);

   public static void method38896(IBakedModel var0) {
      if (var0 != null) {
         Config.method26810(
            "Model: "
               + var0
               + ", ao: "
               + var0.method22620()
               + ", gui3d: "
               + var0.method22621()
               + ", builtIn: "
               + var0.method22623()
               + ", particle: "
               + var0.getParticleTexture()
         );
         Direction[] var3 = Direction.field685;

         for (int var4 = 0; var4 < var3.length; var4++) {
            Direction var5 = var3[var4];
            List var6 = var0.method22619((BlockState)null, var5, field45941);
            method38897(var5.getString(), var6, "  ");
         }

         List var7 = var0.method22619((BlockState)null, (Direction)null, field45941);
         method38897("General", var7, "  ");
      }
   }

   private static void method38897(String var0, List<Class8557> var1, String var2) {
      for (Class8557 var6 : var1) {
         method38898(var0, var6, var2);
      }
   }

   public static void method38898(String var0, Class8557 var1, String var2) {
      Config.method26810(
         var2
            + "Quad: "
            + var1.getClass().getName()
            + ", type: "
            + var0
            + ", face: "
            + var1.method30514()
            + ", tint: "
            + var1.method30513()
            + ", sprite: "
            + var1.method30516()
      );
      method38899(var1.method30511(), "  " + var2);
   }

   public static void method38899(int[] var0, String var1) {
      int var4 = var0.length / 4;
      Config.method26810(var1 + "Length: " + var0.length + ", step: " + var4);

      for (int var5 = 0; var5 < 4; var5++) {
         int var6 = var5 * var4;
         float var7 = Float.intBitsToFloat(var0[var6 + 0]);
         float var8 = Float.intBitsToFloat(var0[var6 + 1]);
         float var9 = Float.intBitsToFloat(var0[var6 + 2]);
         int var10 = var0[var6 + 3];
         float var11 = Float.intBitsToFloat(var0[var6 + 4]);
         float var12 = Float.intBitsToFloat(var0[var6 + 5]);
         Config.method26810(var1 + var5 + " xyz: " + var7 + "," + var8 + "," + var9 + " col: " + var10 + " u,v: " + var11 + "," + var12);
      }
   }

   public static IBakedModel method38900(IBakedModel var0) {
      List var3 = method38901(var0.method22619((BlockState)null, (Direction)null, field45941));
      Direction[] var4 = Direction.field685;
      HashMap var5 = new HashMap();

      for (int var6 = 0; var6 < var4.length; var6++) {
         Direction var7 = var4[var6];
         List var8 = var0.method22619((BlockState)null, var7, field45941);
         List var9 = method38901(var8);
         var5.put(var7, var9);
      }

      return new Class7206(var3, var5, var0.method22620(), var0.method22621(), true, var0.getParticleTexture(), var0.method22625(), var0.method22626());
   }

   public static List method38901(List<Class8557> var0) {
      ArrayList var3 = new ArrayList();

      for (Class8557 var5 : var0) {
         Class8557 var6 = method38902(var5);
         var3.add(var6);
      }

      return var3;
   }

   public static Class8557 method38902(Class8557 var0) {
      return new Class8557((int[])var0.method30511().clone(), var0.method30513(), var0.method30514(), var0.method30516(), var0.method30515());
   }
}
