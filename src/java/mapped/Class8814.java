package mapped;

import java.util.List;
import java.util.Random;
import org.apache.commons.lang3.mutable.MutableObject;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class8814 {
   private static String[] field39651;
   private static final Logger field39652 = LogManager.getLogger();

   public static void method31820(
      Class8904 var0,
      Class4700 var1,
      Class6989 var2,
      Class5646 var3,
      Class8761 var4,
      BlockPos var5,
      List<? super Class4193> var6,
      Random var7,
      boolean var8,
      boolean var9
   ) {
      Class2961.method11365();
      Class2349 var12 = var0.<Class9369>method32453(Class2348.field16105);
      Class80 var13 = Class80.method254(var7);
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
         var20 = var5.getY() + var3.method17828(var18, var19, Class101.field295);
      }

      int var21 = var17.field45679 + var16.method12979();
      var16.method12937(0, var20 - var21, 0);
      var6.add(var16);
      if (var1.method14742() > 0) {
         Class6488 var23 = new Class6488(
            (double)(var18 - 80), (double)(var20 - 80), (double)(var19 - 80), (double)(var18 + 80 + 1), (double)(var20 + 80 + 1), (double)(var19 + 80 + 1)
         );
         Class9777 var24 = new Class9777(var12, var1.method14742(), var2, var3, var4, var6, var7);
         Class9777.method38551(var24)
            .addLast(
               new Class7213(
                  var16,
                  new MutableObject(
                     Class8022.method27433(Class8022.method27428(var23), Class8022.method27428(Class6488.method19656(var17)), Class9477.field44041)
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
      Class8904 var0, Class4193 var1, int var2, Class6989 var3, Class5646 var4, Class8761 var5, List<? super Class4193> var6, Random var7
   ) {
      Class2349 var10 = var0.<Class9369>method32453(Class2348.field16105);
      Class9777 var11 = new Class9777(var10, var2, var3, var4, var5, var6, var7);
      Class9777.method38551(var11).addLast(new Class7213(var1, new MutableObject(Class8022.field34463), 0, 0));

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
