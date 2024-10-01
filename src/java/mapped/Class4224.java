package mapped;

import com.google.common.collect.Lists;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.world.ISeedReader;
import net.minecraft.world.gen.feature.structure.StructureManager;
import net.minecraft.world.gen.feature.template.TemplateManager;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Class4224 extends Class4213 {
   private static String[] field20552;
   private Class9312 field20553;
   private Class9312 field20554;
   private final List<Class4213> field20555 = Lists.newArrayList();

   public Class4224(Random var1, int var2, int var3, Direction var4) {
      super(Class7792.field33463, 0);
      this.method12939(var4);
      Direction var7 = this.method12938();
      if (var7.getAxis() != Direction.Axis.Z) {
         this.field20444 = new Class9764(var2, 39, var3, var2 + 58 - 1, 61, var3 + 58 - 1);
      } else {
         this.field20444 = new Class9764(var2, 39, var3, var2 + 58 - 1, 61, var3 + 58 - 1);
      }

      List<Class9312> var8 = this.method13010(var1);
      Class9312.method35194(this.field20553, true);
      this.field20555.add(new Class4222(var7, this.field20553));
      this.field20555.add(new Class4215(var7, this.field20554));
      ArrayList<Class6580> var9 = Lists.newArrayList();
      var9.add(new Class6584());
      var9.add(new Class6583());
      var9.add(new Class6582());
      var9.add(new Class6585());
      var9.add(new Class6579());
      var9.add(new Class6581());
      var9.add(new Class6586());

      for (Class9312 var11 : var8) {
         if (!Class9312.method35195(var11) && !var11.method35189()) {
            for (Class6580 var13 : var9) {
               if (var13.method19958(var11)) {
                  this.field20555.add(var13.method19959(var7, var11, var1));
                  break;
               }
            }
         }
      }

      int var17 = this.field20444.field45679;
      int var18 = this.method12920(9, 22);
      int var19 = this.method12922(9, 22);

      for (Class4213 var14 : this.field20555) {
         var14.method12915().method38393(var18, var17, var19);
      }

      Class9764 var21 = Class9764.method38389(
         this.method12920(1, 1), this.method12921(1), this.method12922(1, 1), this.method12920(23, 21), this.method12921(8), this.method12922(23, 21)
      );
      Class9764 var22 = Class9764.method38389(
         this.method12920(34, 1), this.method12921(1), this.method12922(34, 1), this.method12920(56, 21), this.method12921(8), this.method12922(56, 21)
      );
      Class9764 var15 = Class9764.method38389(
         this.method12920(22, 22), this.method12921(13), this.method12922(22, 22), this.method12920(35, 35), this.method12921(17), this.method12922(35, 35)
      );
      int var16 = var1.nextInt();
      this.field20555.add(new Class4216(var7, var21, var16++));
      this.field20555.add(new Class4216(var7, var22, var16++));
      this.field20555.add(new Class4225(var7, var15));
   }

   public Class4224(TemplateManager var1, CompoundNBT var2) {
      super(Class7792.field33463, var2);
   }

   private List<Class9312> method13010(Random var1) {
      Class9312[] var4 = new Class9312[75];

      for (int var5 = 0; var5 < 5; var5++) {
         for (int var6 = 0; var6 < 4; var6++) {
            boolean var7 = false;
            int var8 = method13004(var5, 0, var6);
            var4[var8] = new Class9312(var8);
         }
      }

      for (int var17 = 0; var17 < 5; var17++) {
         for (int var21 = 0; var21 < 4; var21++) {
            boolean var25 = true;
            int var29 = method13004(var17, 1, var21);
            var4[var29] = new Class9312(var29);
         }
      }

      for (int var18 = 1; var18 < 4; var18++) {
         for (int var22 = 0; var22 < 2; var22++) {
            int var30 = method13004(var18, 2, var22);
            var4[var30] = new Class9312(var30);
         }
      }

      this.field20553 = var4[field20535];

      for (int var19 = 0; var19 < 5; var19++) {
         for (int var23 = 0; var23 < 5; var23++) {
            for (int var27 = 0; var27 < 3; var27++) {
               int var31 = method13004(var19, var27, var23);
               if (var4[var31] != null) {
                  for (Direction var12 : Direction.values()) {
                     int var13 = var19 + var12.getXOffset();
                     int var14 = var27 + var12.getYOffset();
                     int var15 = var23 + var12.getZOffset();
                     if (var13 >= 0 && var13 < 5 && var15 >= 0 && var15 < 5 && var14 >= 0 && var14 < 3) {
                        int var16 = method13004(var13, var14, var15);
                        if (var4[var16] != null) {
                           if (var15 != var23) {
                              var4[var31].method35186(var12.getOpposite(), var4[var16]);
                           } else {
                              var4[var31].method35186(var12, var4[var16]);
                           }
                        }
                     }
                  }
               }
            }
         }
      }

      Class9312 var20 = new Class9312(1003);
      Class9312 var24 = new Class9312(1001);
      Class9312 var28 = new Class9312(1002);
      var4[field20536].method35186(Direction.UP, var20);
      var4[field20537].method35186(Direction.SOUTH, var24);
      var4[field20538].method35186(Direction.SOUTH, var28);
      Class9312.method35194(var20, true);
      Class9312.method35194(var24, true);
      Class9312.method35194(var28, true);
      Class9312.method35196(this.field20553, true);
      this.field20554 = var4[method13004(var1.nextInt(4), 0, 2)];
      Class9312.method35194(this.field20554, true);
      Class9312.method35194(Class9312.method35191(this.field20554)[Direction.EAST.getIndex()], true);
      Class9312.method35194(Class9312.method35191(this.field20554)[Direction.NORTH.getIndex()], true);
      Class9312.method35194(Class9312.method35191(Class9312.method35191(this.field20554)[Direction.EAST.getIndex()])[Direction.NORTH.getIndex()], true);
      Class9312.method35194(Class9312.method35191(this.field20554)[Direction.UP.getIndex()], true);
      Class9312.method35194(Class9312.method35191(Class9312.method35191(this.field20554)[Direction.EAST.getIndex()])[Direction.UP.getIndex()], true);
      Class9312.method35194(Class9312.method35191(Class9312.method35191(this.field20554)[Direction.NORTH.getIndex()])[Direction.UP.getIndex()], true);
      Class9312.method35194(
         Class9312.method35191(Class9312.method35191(Class9312.method35191(this.field20554)[Direction.EAST.getIndex()])[Direction.NORTH.getIndex()])[Direction.UP
            .getIndex()],
         true
      );
      ArrayList<Class9312> var32 = Lists.newArrayList();

      for (Class9312 var39 : var4) {
         if (var39 != null) {
            var39.method35187();
            var32.add(var39);
         }
      }

      var20.method35187();
      Collections.shuffle(var32, var1);
      int var34 = 1;

      for (Class9312 var38 : var32) {
         int var40 = 0;
         int var41 = 0;

         while (var40 < 2 && var41 < 5) {
            var41++;
            int var42 = var1.nextInt(6);
            if (Class9312.method35193(var38)[var42]) {
               int var43 = Direction.byIndex(var42).getOpposite().getIndex();
               Class9312.method35193(var38)[var42] = false;
               Class9312.method35193(Class9312.method35191(var38)[var42])[var43] = false;
               if (var38.method35188(var34++) && Class9312.method35191(var38)[var42].method35188(var34++)) {
                  var40++;
               } else {
                  Class9312.method35193(var38)[var42] = true;
                  Class9312.method35193(Class9312.method35191(var38)[var42])[var43] = true;
               }
            }
         }
      }

      var32.add(var20);
      var32.add(var24);
      var32.add(var28);
      return var32;
   }

   @Override
   public boolean method12896(ISeedReader var1, StructureManager var2, ChunkGenerator var3, Random var4, Class9764 var5, ChunkPos var6, BlockPos var7) {
      int var10 = Math.max(var1.getSeaLevel(), 64) - this.field20444.field45679;
      this.method13005(var1, var5, 0, 0, 0, 58, var10, 58);
      this.method13011(false, 0, var1, var4, var5);
      this.method13011(true, 33, var1, var4, var5);
      this.method13012(var1, var4, var5);
      this.method13013(var1, var4, var5);
      this.method13014(var1, var4, var5);
      this.method13015(var1, var4, var5);
      this.method13016(var1, var4, var5);
      this.method13017(var1, var4, var5);

      for (int var11 = 0; var11 < 7; var11++) {
         int var12 = 0;

         while (var12 < 7) {
            if (var12 == 0 && var11 == 3) {
               var12 = 6;
            }

            int var13 = var11 * 9;
            int var14 = var12 * 9;

            for (int var15 = 0; var15 < 4; var15++) {
               for (int var16 = 0; var16 < 4; var16++) {
                  this.method12923(var1, field20529, var13 + var15, 0, var14 + var16, var5);
                  this.method12932(var1, field20529, var13 + var15, -1, var14 + var16, var5);
               }
            }

            if (var11 != 0 && var11 != 6) {
               var12 += 6;
            } else {
               var12++;
            }
         }
      }

      for (int var17 = 0; var17 < 5; var17++) {
         this.method13005(var1, var5, -1 - var17, 0 + var17 * 2, -1 - var17, -1 - var17, 23, 58 + var17);
         this.method13005(var1, var5, 58 + var17, 0 + var17 * 2, -1 - var17, 58 + var17, 23, 58 + var17);
         this.method13005(var1, var5, 0 - var17, 0 + var17 * 2, -1 - var17, 57 + var17, 23, -1 - var17);
         this.method13005(var1, var5, 0 - var17, 0 + var17 * 2, 58 + var17, 57 + var17, 23, 58 + var17);
      }

      for (Class4213 var19 : this.field20555) {
         if (var19.method12915().method38390(var5)) {
            var19.method12896(var1, var2, var3, var4, var5, var6, var7);
         }
      }

      return true;
   }

   private void method13011(boolean var1, int var2, ISeedReader var3, Random var4, Class9764 var5) {
      if (this.method13008(var5, var2, 0, var2 + 23, 20)) {
         this.method12927(var3, var5, var2 + 0, 0, 0, var2 + 24, 0, 20, field20528, field20528, false);
         this.method13005(var3, var5, var2 + 0, 1, 0, var2 + 24, 10, 20);

         for (int var9 = 0; var9 < 4; var9++) {
            this.method12927(var3, var5, var2 + var9, var9 + 1, var9, var2 + var9, var9 + 1, 20, field20529, field20529, false);
            this.method12927(var3, var5, var2 + var9 + 7, var9 + 5, var9 + 7, var2 + var9 + 7, var9 + 5, 20, field20529, field20529, false);
            this.method12927(var3, var5, var2 + 17 - var9, var9 + 5, var9 + 7, var2 + 17 - var9, var9 + 5, 20, field20529, field20529, false);
            this.method12927(var3, var5, var2 + 24 - var9, var9 + 1, var9, var2 + 24 - var9, var9 + 1, 20, field20529, field20529, false);
            this.method12927(var3, var5, var2 + var9 + 1, var9 + 1, var9, var2 + 23 - var9, var9 + 1, var9, field20529, field20529, false);
            this.method12927(var3, var5, var2 + var9 + 8, var9 + 5, var9 + 7, var2 + 16 - var9, var9 + 5, var9 + 7, field20529, field20529, false);
         }

         this.method12927(var3, var5, var2 + 4, 4, 4, var2 + 6, 4, 20, field20528, field20528, false);
         this.method12927(var3, var5, var2 + 7, 4, 4, var2 + 17, 4, 6, field20528, field20528, false);
         this.method12927(var3, var5, var2 + 18, 4, 4, var2 + 20, 4, 20, field20528, field20528, false);
         this.method12927(var3, var5, var2 + 11, 8, 11, var2 + 13, 8, 20, field20528, field20528, false);
         this.method12923(var3, field20531, var2 + 12, 9, 12, var5);
         this.method12923(var3, field20531, var2 + 12, 9, 15, var5);
         this.method12923(var3, field20531, var2 + 12, 9, 18, var5);
         int var13 = var2 + (!var1 ? 5 : 19);
         int var10 = var2 + (!var1 ? 19 : 5);

         for (int var11 = 20; var11 >= 5; var11 -= 3) {
            this.method12923(var3, field20531, var13, 5, var11, var5);
         }

         for (int var14 = 19; var14 >= 7; var14 -= 3) {
            this.method12923(var3, field20531, var10, 5, var14, var5);
         }

         for (int var15 = 0; var15 < 4; var15++) {
            int var12 = !var1 ? var2 + 17 - var15 * 3 : var2 + 24 - (17 - var15 * 3);
            this.method12923(var3, field20531, var12, 5, 5, var5);
         }

         this.method12923(var3, field20531, var10, 5, 5, var5);
         this.method12927(var3, var5, var2 + 11, 1, 12, var2 + 13, 7, 12, field20528, field20528, false);
         this.method12927(var3, var5, var2 + 12, 1, 11, var2 + 12, 7, 13, field20528, field20528, false);
      }
   }

   private void method13012(ISeedReader var1, Random var2, Class9764 var3) {
      if (this.method13008(var3, 22, 5, 35, 17)) {
         this.method13005(var1, var3, 25, 0, 0, 32, 8, 20);

         for (int var6 = 0; var6 < 4; var6++) {
            this.method12927(var1, var3, 24, 2, 5 + var6 * 4, 24, 4, 5 + var6 * 4, field20529, field20529, false);
            this.method12927(var1, var3, 22, 4, 5 + var6 * 4, 23, 4, 5 + var6 * 4, field20529, field20529, false);
            this.method12923(var1, field20529, 25, 5, 5 + var6 * 4, var3);
            this.method12923(var1, field20529, 26, 6, 5 + var6 * 4, var3);
            this.method12923(var1, field20532, 26, 5, 5 + var6 * 4, var3);
            this.method12927(var1, var3, 33, 2, 5 + var6 * 4, 33, 4, 5 + var6 * 4, field20529, field20529, false);
            this.method12927(var1, var3, 34, 4, 5 + var6 * 4, 35, 4, 5 + var6 * 4, field20529, field20529, false);
            this.method12923(var1, field20529, 32, 5, 5 + var6 * 4, var3);
            this.method12923(var1, field20529, 31, 6, 5 + var6 * 4, var3);
            this.method12923(var1, field20532, 31, 5, 5 + var6 * 4, var3);
            this.method12927(var1, var3, 27, 6, 5 + var6 * 4, 30, 6, 5 + var6 * 4, field20528, field20528, false);
         }
      }
   }

   private void method13013(ISeedReader var1, Random var2, Class9764 var3) {
      if (this.method13008(var3, 15, 20, 42, 21)) {
         this.method12927(var1, var3, 15, 0, 21, 42, 0, 21, field20528, field20528, false);
         this.method13005(var1, var3, 26, 1, 21, 31, 3, 21);
         this.method12927(var1, var3, 21, 12, 21, 36, 12, 21, field20528, field20528, false);
         this.method12927(var1, var3, 17, 11, 21, 40, 11, 21, field20528, field20528, false);
         this.method12927(var1, var3, 16, 10, 21, 41, 10, 21, field20528, field20528, false);
         this.method12927(var1, var3, 15, 7, 21, 42, 9, 21, field20528, field20528, false);
         this.method12927(var1, var3, 16, 6, 21, 41, 6, 21, field20528, field20528, false);
         this.method12927(var1, var3, 17, 5, 21, 40, 5, 21, field20528, field20528, false);
         this.method12927(var1, var3, 21, 4, 21, 36, 4, 21, field20528, field20528, false);
         this.method12927(var1, var3, 22, 3, 21, 26, 3, 21, field20528, field20528, false);
         this.method12927(var1, var3, 31, 3, 21, 35, 3, 21, field20528, field20528, false);
         this.method12927(var1, var3, 23, 2, 21, 25, 2, 21, field20528, field20528, false);
         this.method12927(var1, var3, 32, 2, 21, 34, 2, 21, field20528, field20528, false);
         this.method12927(var1, var3, 28, 4, 20, 29, 4, 21, field20529, field20529, false);
         this.method12923(var1, field20529, 27, 3, 21, var3);
         this.method12923(var1, field20529, 30, 3, 21, var3);
         this.method12923(var1, field20529, 26, 2, 21, var3);
         this.method12923(var1, field20529, 31, 2, 21, var3);
         this.method12923(var1, field20529, 25, 1, 21, var3);
         this.method12923(var1, field20529, 32, 1, 21, var3);

         for (int var6 = 0; var6 < 7; var6++) {
            this.method12923(var1, field20530, 28 - var6, 6 + var6, 21, var3);
            this.method12923(var1, field20530, 29 + var6, 6 + var6, 21, var3);
         }

         for (int var7 = 0; var7 < 4; var7++) {
            this.method12923(var1, field20530, 28 - var7, 9 + var7, 21, var3);
            this.method12923(var1, field20530, 29 + var7, 9 + var7, 21, var3);
         }

         this.method12923(var1, field20530, 28, 12, 21, var3);
         this.method12923(var1, field20530, 29, 12, 21, var3);

         for (int var8 = 0; var8 < 3; var8++) {
            this.method12923(var1, field20530, 22 - var8 * 2, 8, 21, var3);
            this.method12923(var1, field20530, 22 - var8 * 2, 9, 21, var3);
            this.method12923(var1, field20530, 35 + var8 * 2, 8, 21, var3);
            this.method12923(var1, field20530, 35 + var8 * 2, 9, 21, var3);
         }

         this.method13005(var1, var3, 15, 13, 21, 42, 15, 21);
         this.method13005(var1, var3, 15, 1, 21, 15, 6, 21);
         this.method13005(var1, var3, 16, 1, 21, 16, 5, 21);
         this.method13005(var1, var3, 17, 1, 21, 20, 4, 21);
         this.method13005(var1, var3, 21, 1, 21, 21, 3, 21);
         this.method13005(var1, var3, 22, 1, 21, 22, 2, 21);
         this.method13005(var1, var3, 23, 1, 21, 24, 1, 21);
         this.method13005(var1, var3, 42, 1, 21, 42, 6, 21);
         this.method13005(var1, var3, 41, 1, 21, 41, 5, 21);
         this.method13005(var1, var3, 37, 1, 21, 40, 4, 21);
         this.method13005(var1, var3, 36, 1, 21, 36, 3, 21);
         this.method13005(var1, var3, 33, 1, 21, 34, 1, 21);
         this.method13005(var1, var3, 35, 1, 21, 35, 2, 21);
      }
   }

   private void method13014(ISeedReader var1, Random var2, Class9764 var3) {
      if (this.method13008(var3, 21, 21, 36, 36)) {
         this.method12927(var1, var3, 21, 0, 22, 36, 0, 36, field20528, field20528, false);
         this.method13005(var1, var3, 21, 1, 22, 36, 23, 36);

         for (int var6 = 0; var6 < 4; var6++) {
            this.method12927(var1, var3, 21 + var6, 13 + var6, 21 + var6, 36 - var6, 13 + var6, 21 + var6, field20529, field20529, false);
            this.method12927(var1, var3, 21 + var6, 13 + var6, 36 - var6, 36 - var6, 13 + var6, 36 - var6, field20529, field20529, false);
            this.method12927(var1, var3, 21 + var6, 13 + var6, 22 + var6, 21 + var6, 13 + var6, 35 - var6, field20529, field20529, false);
            this.method12927(var1, var3, 36 - var6, 13 + var6, 22 + var6, 36 - var6, 13 + var6, 35 - var6, field20529, field20529, false);
         }

         this.method12927(var1, var3, 25, 16, 25, 32, 16, 32, field20528, field20528, false);
         this.method12927(var1, var3, 25, 17, 25, 25, 19, 25, field20529, field20529, false);
         this.method12927(var1, var3, 32, 17, 25, 32, 19, 25, field20529, field20529, false);
         this.method12927(var1, var3, 25, 17, 32, 25, 19, 32, field20529, field20529, false);
         this.method12927(var1, var3, 32, 17, 32, 32, 19, 32, field20529, field20529, false);
         this.method12923(var1, field20529, 26, 20, 26, var3);
         this.method12923(var1, field20529, 27, 21, 27, var3);
         this.method12923(var1, field20532, 27, 20, 27, var3);
         this.method12923(var1, field20529, 26, 20, 31, var3);
         this.method12923(var1, field20529, 27, 21, 30, var3);
         this.method12923(var1, field20532, 27, 20, 30, var3);
         this.method12923(var1, field20529, 31, 20, 31, var3);
         this.method12923(var1, field20529, 30, 21, 30, var3);
         this.method12923(var1, field20532, 30, 20, 30, var3);
         this.method12923(var1, field20529, 31, 20, 26, var3);
         this.method12923(var1, field20529, 30, 21, 27, var3);
         this.method12923(var1, field20532, 30, 20, 27, var3);
         this.method12927(var1, var3, 28, 21, 27, 29, 21, 27, field20528, field20528, false);
         this.method12927(var1, var3, 27, 21, 28, 27, 21, 29, field20528, field20528, false);
         this.method12927(var1, var3, 28, 21, 30, 29, 21, 30, field20528, field20528, false);
         this.method12927(var1, var3, 30, 21, 28, 30, 21, 29, field20528, field20528, false);
      }
   }

   private void method13015(ISeedReader var1, Random var2, Class9764 var3) {
      if (this.method13008(var3, 0, 21, 6, 58)) {
         this.method12927(var1, var3, 0, 0, 21, 6, 0, 57, field20528, field20528, false);
         this.method13005(var1, var3, 0, 1, 21, 6, 7, 57);
         this.method12927(var1, var3, 4, 4, 21, 6, 4, 53, field20528, field20528, false);

         for (int var6 = 0; var6 < 4; var6++) {
            this.method12927(var1, var3, var6, var6 + 1, 21, var6, var6 + 1, 57 - var6, field20529, field20529, false);
         }

         for (int var7 = 23; var7 < 53; var7 += 3) {
            this.method12923(var1, field20531, 5, 5, var7, var3);
         }

         this.method12923(var1, field20531, 5, 5, 52, var3);

         for (int var8 = 0; var8 < 4; var8++) {
            this.method12927(var1, var3, var8, var8 + 1, 21, var8, var8 + 1, 57 - var8, field20529, field20529, false);
         }

         this.method12927(var1, var3, 4, 1, 52, 6, 3, 52, field20528, field20528, false);
         this.method12927(var1, var3, 5, 1, 51, 5, 3, 53, field20528, field20528, false);
      }

      if (this.method13008(var3, 51, 21, 58, 58)) {
         this.method12927(var1, var3, 51, 0, 21, 57, 0, 57, field20528, field20528, false);
         this.method13005(var1, var3, 51, 1, 21, 57, 7, 57);
         this.method12927(var1, var3, 51, 4, 21, 53, 4, 53, field20528, field20528, false);

         for (int var9 = 0; var9 < 4; var9++) {
            this.method12927(var1, var3, 57 - var9, var9 + 1, 21, 57 - var9, var9 + 1, 57 - var9, field20529, field20529, false);
         }

         for (int var10 = 23; var10 < 53; var10 += 3) {
            this.method12923(var1, field20531, 52, 5, var10, var3);
         }

         this.method12923(var1, field20531, 52, 5, 52, var3);
         this.method12927(var1, var3, 51, 1, 52, 53, 3, 52, field20528, field20528, false);
         this.method12927(var1, var3, 52, 1, 51, 52, 3, 53, field20528, field20528, false);
      }

      if (this.method13008(var3, 0, 51, 57, 57)) {
         this.method12927(var1, var3, 7, 0, 51, 50, 0, 57, field20528, field20528, false);
         this.method13005(var1, var3, 7, 1, 51, 50, 10, 57);

         for (int var11 = 0; var11 < 4; var11++) {
            this.method12927(var1, var3, var11 + 1, var11 + 1, 57 - var11, 56 - var11, var11 + 1, 57 - var11, field20529, field20529, false);
         }
      }
   }

   private void method13016(ISeedReader var1, Random var2, Class9764 var3) {
      if (this.method13008(var3, 7, 21, 13, 50)) {
         this.method12927(var1, var3, 7, 0, 21, 13, 0, 50, field20528, field20528, false);
         this.method13005(var1, var3, 7, 1, 21, 13, 10, 50);
         this.method12927(var1, var3, 11, 8, 21, 13, 8, 53, field20528, field20528, false);

         for (int var6 = 0; var6 < 4; var6++) {
            this.method12927(var1, var3, var6 + 7, var6 + 5, 21, var6 + 7, var6 + 5, 54, field20529, field20529, false);
         }

         for (int var7 = 21; var7 <= 45; var7 += 3) {
            this.method12923(var1, field20531, 12, 9, var7, var3);
         }
      }

      if (this.method13008(var3, 44, 21, 50, 54)) {
         this.method12927(var1, var3, 44, 0, 21, 50, 0, 50, field20528, field20528, false);
         this.method13005(var1, var3, 44, 1, 21, 50, 10, 50);
         this.method12927(var1, var3, 44, 8, 21, 46, 8, 53, field20528, field20528, false);

         for (int var8 = 0; var8 < 4; var8++) {
            this.method12927(var1, var3, 50 - var8, var8 + 5, 21, 50 - var8, var8 + 5, 54, field20529, field20529, false);
         }

         for (int var9 = 21; var9 <= 45; var9 += 3) {
            this.method12923(var1, field20531, 45, 9, var9, var3);
         }
      }

      if (this.method13008(var3, 8, 44, 49, 54)) {
         this.method12927(var1, var3, 14, 0, 44, 43, 0, 50, field20528, field20528, false);
         this.method13005(var1, var3, 14, 1, 44, 43, 10, 50);

         for (int var10 = 12; var10 <= 45; var10 += 3) {
            this.method12923(var1, field20531, var10, 9, 45, var3);
            this.method12923(var1, field20531, var10, 9, 52, var3);
            if (var10 == 12 || var10 == 18 || var10 == 24 || var10 == 33 || var10 == 39 || var10 == 45) {
               this.method12923(var1, field20531, var10, 9, 47, var3);
               this.method12923(var1, field20531, var10, 9, 50, var3);
               this.method12923(var1, field20531, var10, 10, 45, var3);
               this.method12923(var1, field20531, var10, 10, 46, var3);
               this.method12923(var1, field20531, var10, 10, 51, var3);
               this.method12923(var1, field20531, var10, 10, 52, var3);
               this.method12923(var1, field20531, var10, 11, 47, var3);
               this.method12923(var1, field20531, var10, 11, 50, var3);
               this.method12923(var1, field20531, var10, 12, 48, var3);
               this.method12923(var1, field20531, var10, 12, 49, var3);
            }
         }

         for (int var11 = 0; var11 < 3; var11++) {
            this.method12927(var1, var3, 8 + var11, 5 + var11, 54, 49 - var11, 5 + var11, 54, field20528, field20528, false);
         }

         this.method12927(var1, var3, 11, 8, 54, 46, 8, 54, field20529, field20529, false);
         this.method12927(var1, var3, 14, 8, 44, 43, 8, 53, field20528, field20528, false);
      }
   }

   private void method13017(ISeedReader var1, Random var2, Class9764 var3) {
      if (this.method13008(var3, 14, 21, 20, 43)) {
         this.method12927(var1, var3, 14, 0, 21, 20, 0, 43, field20528, field20528, false);
         this.method13005(var1, var3, 14, 1, 22, 20, 14, 43);
         this.method12927(var1, var3, 18, 12, 22, 20, 12, 39, field20528, field20528, false);
         this.method12927(var1, var3, 18, 12, 21, 20, 12, 21, field20529, field20529, false);

         for (int var6 = 0; var6 < 4; var6++) {
            this.method12927(var1, var3, var6 + 14, var6 + 9, 21, var6 + 14, var6 + 9, 43 - var6, field20529, field20529, false);
         }

         for (int var7 = 23; var7 <= 39; var7 += 3) {
            this.method12923(var1, field20531, 19, 13, var7, var3);
         }
      }

      if (this.method13008(var3, 37, 21, 43, 43)) {
         this.method12927(var1, var3, 37, 0, 21, 43, 0, 43, field20528, field20528, false);
         this.method13005(var1, var3, 37, 1, 22, 43, 14, 43);
         this.method12927(var1, var3, 37, 12, 22, 39, 12, 39, field20528, field20528, false);
         this.method12927(var1, var3, 37, 12, 21, 39, 12, 21, field20529, field20529, false);

         for (int var8 = 0; var8 < 4; var8++) {
            this.method12927(var1, var3, 43 - var8, var8 + 9, 21, 43 - var8, var8 + 9, 43 - var8, field20529, field20529, false);
         }

         for (int var9 = 23; var9 <= 39; var9 += 3) {
            this.method12923(var1, field20531, 38, 13, var9, var3);
         }
      }

      if (this.method13008(var3, 15, 37, 42, 43)) {
         this.method12927(var1, var3, 21, 0, 37, 36, 0, 43, field20528, field20528, false);
         this.method13005(var1, var3, 21, 1, 37, 36, 14, 43);
         this.method12927(var1, var3, 21, 12, 37, 36, 12, 39, field20528, field20528, false);

         for (int var10 = 0; var10 < 4; var10++) {
            this.method12927(var1, var3, 15 + var10, var10 + 9, 43 - var10, 42 - var10, var10 + 9, 43 - var10, field20529, field20529, false);
         }

         for (int var11 = 21; var11 <= 36; var11 += 3) {
            this.method12923(var1, field20531, var11, 13, 38, var3);
         }
      }
   }
}
