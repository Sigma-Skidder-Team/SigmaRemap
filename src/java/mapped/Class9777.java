package mapped;

import com.google.common.collect.Lists;
import com.google.common.collect.Queues;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Random;

import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import org.apache.commons.lang3.mutable.MutableObject;

public final class Class9777 {
   private final Registry<Class9369> field45733;
   private final int field45734;
   private final Class6989 field45735;
   private final ChunkGenerator field45736;
   private final Class8761 field45737;
   private final List<? super Class4193> field45738;
   private final Random field45739;
   private final Deque<Class7213> field45740 = Queues.newArrayDeque();

   public Class9777(Registry<Class9369> var1, int var2, Class6989 var3, ChunkGenerator var4, Class8761 var5, List<? super Class4193> var6, Random var7) {
      this.field45733 = var1;
      this.field45734 = var2;
      this.field45735 = var3;
      this.field45736 = var4;
      this.field45737 = var5;
      this.field45738 = var6;
      this.field45739 = var7;
   }

   private void method38546(Class4193 var1, MutableObject<VoxelShape> var2, int var3, int var4, boolean var5) {
      Class7487 var8 = var1.method12977();
      BlockPos var9 = var1.method12978();
      Class80 var10 = var1.method12940();
      Class109 var11 = var8.method24382();
      boolean var12 = var11 == Class109.field367;
      MutableObject<VoxelShape> var13 = new MutableObject();
      Class9764 var14 = var1.method12915();
      int var15 = var14.field45679;

      label174:
      for (Class8266 var17 : var8.method24374(this.field45737, var9, var10, this.field45739)) {
         Direction var18 = Class3249.method11675(var17.field35531);
         BlockPos var19 = var17.field35530;
         BlockPos var20 = var19.method8349(var18);
         int var21 = var19.getY() - var15;
         int var22 = -1;
         ResourceLocation var23 = new ResourceLocation(var17.field35532.method126("pool"));
         Optional<Class9369> var24 = this.field45733.method9187(var23);
         if (!var24.isPresent() || ((Class9369)var24.get()).method35538() == 0 && !Objects.equals(var23, Class9837.field45937.getLocation())) {
            Class8814.method31822().warn("Empty or none existent pool: {}", var23);
         } else {
            ResourceLocation var25 = ((Class9369)var24.get()).method35534();
            Optional<Class9369> var26 = this.field45733.method9187(var25);
            if (var26.isPresent() && (((Class9369)var26.get()).method35538() != 0 || Objects.equals(var25, Class9837.field45937.getLocation()))) {
               boolean var27 = var14.method38396(var20);
               MutableObject<VoxelShape> var28;
               int var29;
               if (!var27) {
                  var28 = var2;
                  var29 = var3;
               } else {
                  var28 = var13;
                  var29 = var15;
                  if (var13.getValue() == null) {
                     var13.setValue(VoxelShapes.create(AxisAlignedBB.method19656(var14)));
                  }
               }

               ArrayList<Class7487> var30 = Lists.newArrayList();
               if (var4 != this.field45734) {
                  var30.addAll(((Class9369)var24.get()).method35536(this.field45739));
               }

               var30.addAll(((Class9369)var26.get()).method35536(this.field45739));

               for (Class7487 var32 : var30) {
                  if (var32 == Class7486.field32182) {
                     break;
                  }

                  for (Class80 var34 : Class80.method255(this.field45739)) {
                     List<Class8266> var35 = var32.method24374(this.field45737, BlockPos.ZERO, var34, this.field45739);
                     Class9764 var36 = var32.method24375(this.field45737, BlockPos.ZERO, var34);
                     int var37;
                     if (var5 && var36.method38399() <= 16) {
                        var37 = var35.stream().mapToInt(var2x -> {
                           if (var36.method38396(var2x.field35530.method8349(Class3249.method11675(var2x.field35531)))) {
                              ResourceLocation var5x = new ResourceLocation(var2x.field35532.method126("pool"));
                              Optional<Class9369> var6 = this.field45733.method9187(var5x);
                              Optional<Class9369> var7 = var6.<Class9369>flatMap(var1xx -> this.field45733.method9187(var1xx.method35534()));
                              int var8x = var6.<Integer>map(var1xx -> var1xx.method35533(this.field45737)).orElse(0);
                              int var9x = var7.<Integer>map(var1xx -> var1xx.method35533(this.field45737)).orElse(0);
                              return Math.max(var8x, var9x);
                           } else {
                              return 0;
                           }
                        }).max().orElse(0);
                     } else {
                        var37 = 0;
                     }

                     for (Class8266 var39 : var35) {
                        if (Class3249.method11674(var17, var39)) {
                           BlockPos var40 = var39.field35530;
                           BlockPos var41 = new BlockPos(
                              var20.getX() - var40.getX(), var20.getY() - var40.getY(), var20.getZ() - var40.getZ()
                           );
                           Class9764 var42 = var32.method24375(this.field45737, var41, var34);
                           int var43 = var42.field45679;
                           Class109 var44 = var32.method24382();
                           boolean var45 = var44 == Class109.field367;
                           int var46 = var40.getY();
                           int var47 = var21 - var46 + Class3249.method11675(var17.field35531).method540();
                           int var48;
                           if (var12 && var45) {
                              var48 = var15 + var47;
                           } else {
                              if (var22 == -1) {
                                 var22 = this.field45736.method17828(var19.getX(), var19.getZ(), Class101.field295);
                              }

                              var48 = var22 - var46;
                           }

                           int var49 = var48 - var43;
                           Class9764 var50 = var42.method38394(0, var49, 0);
                           BlockPos var51 = var41.method8336(0, var49, 0);
                           if (var37 > 0) {
                              int var52 = Math.max(var37 + 1, var50.field45682 - var50.field45679);
                              var50.field45682 = var50.field45679 + var52;
                           }

                           if (! VoxelShapes.compare(
                              (VoxelShape)var28.getValue(), VoxelShapes.create(AxisAlignedBB.method19656(var50).method19679(0.25)), IBooleanFunction.field44039
                           )) {
                              var28.setValue(
                                 VoxelShapes.method27434((VoxelShape)var28.getValue(), VoxelShapes.create(AxisAlignedBB.method19656(var50)), IBooleanFunction.ONLY_FIRST)
                              );
                              int var56 = var1.method12979();
                              int var53;
                              if (!var45) {
                                 var53 = var32.method24383();
                              } else {
                                 var53 = var56 - var47;
                              }

                              Class4193 var54 = this.field45735.method21640(this.field45737, var32, var51, var53, var34, var50);
                              int var55;
                              if (!var12) {
                                 if (!var45) {
                                    if (var22 == -1) {
                                       var22 = this.field45736.method17828(var19.getX(), var19.getZ(), Class101.field295);
                                    }

                                    var55 = var22 + var47 / 2;
                                 } else {
                                    var55 = var48 + var46;
                                 }
                              } else {
                                 var55 = var15 + var21;
                              }

                              var1.method12980(new Class3637(var20.getX(), var55 - var21 + var56, var20.getZ(), var47, var44));
                              var54.method12980(new Class3637(var19.getX(), var55 - var46 + var53, var19.getZ(), -var47, var11));
                              this.field45738.add(var54);
                              if (var4 + 1 <= this.field45734) {
                                 this.field45740.addLast(new Class7213(var54, var28, var29, var4 + 1));
                              }
                              continue label174;
                           }
                        }
                     }
                  }
               }
            } else {
               Class8814.method31822().warn("Empty or none existent fallback pool: {}", var25);
            }
         }
      }
   }

   // $VF: synthetic method
   public static Deque method38551(Class9777 var0) {
      return var0.field45740;
   }

   // $VF: synthetic method
   public static void method38552(Class9777 var0, Class4193 var1, MutableObject var2, int var3, int var4, boolean var5) {
      var0.method38546(var1, var2, var3, var4, var5);
   }
}
