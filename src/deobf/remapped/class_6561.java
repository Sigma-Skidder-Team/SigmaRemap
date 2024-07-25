package remapped;

import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.Random;

public class class_6561 {
   private final List<class_1673> field_33468 = Lists.newArrayList();
   private final List<class_8833> field_33470 = Lists.newArrayList();
   private BlockPos field_33472 = BlockPos.field_7306;
   private String field_33471 = "?";

   public BlockPos method_29975() {
      return this.field_33472;
   }

   public void method_29995(String var1) {
      this.field_33471 = var1;
   }

   public String method_29982() {
      return this.field_33471;
   }

   public void method_29976(World var1, BlockPos var2, BlockPos var3, boolean var4, class_6414 var5) {
      if (var3.method_12173() >= 1 && var3.method_12165() >= 1 && var3.method_12185() >= 1) {
         BlockPos var8 = var2.method_6105(var3).method_6104(-1, -1, -1);
         ArrayList var9 = Lists.newArrayList();
         ArrayList var10 = Lists.newArrayList();
         ArrayList var11 = Lists.newArrayList();
         BlockPos var12 = new BlockPos(
            Math.min(var2.method_12173(), var8.method_12173()),
            Math.min(var2.method_12165(), var8.method_12165()),
            Math.min(var2.method_12185(), var8.method_12185())
         );
         BlockPos var13 = new BlockPos(
            Math.max(var2.method_12173(), var8.method_12173()),
            Math.max(var2.method_12165(), var8.method_12165()),
            Math.max(var2.method_12185(), var8.method_12185())
         );
         this.field_33472 = var3;

         for (BlockPos var15 : BlockPos.method_6076(var12, var13)) {
            BlockPos var16 = var15.method_6093(var12);
            class_2522 var17 = var1.method_28262(var15);
            if (var5 == null || var5 != var17.method_8360()) {
               class_3757 var18 = var1.method_28260(var15);
               class_4099 var19;
               if (var18 == null) {
                  var19 = new class_4099(var16, var17, (CompoundNBT)null);
               } else {
                  CompoundNBT var20 = var18.method_17396(new CompoundNBT());
                  var20.method_25959("x");
                  var20.method_25959("y");
                  var20.method_25959("z");
                  var19 = new class_4099(var16, var17, var20.method_25944());
               }

               method_29974(var19, var9, var10, var11);
            }
         }

         List var21 = method_29979(var9, var10, var11);
         this.field_33468.clear();
         this.field_33468.add(new class_1673(var21, null));
         if (!var4) {
            this.field_33470.clear();
         } else {
            this.method_29964(var1, var12, var13.method_6104(1, 1, 1));
         }
      }
   }

   private static void method_29974(class_4099 var0, List<class_4099> var1, List<class_4099> var2, List<class_4099> var3) {
      if (var0.field_19968 == null) {
         if (!var0.field_19967.method_8360().method_29281() && var0.field_19967.method_8306(class_8034.field_41115, BlockPos.field_7306)) {
            var1.add(var0);
         } else {
            var3.add(var0);
         }
      } else {
         var2.add(var0);
      }
   }

   private static List<class_4099> method_29979(List<class_4099> var0, List<class_4099> var1, List<class_4099> var2) {
      Comparator var5 = Comparator.<class_4099>comparingInt(var0x -> var0x.field_19965.method_12165())
         .thenComparingInt(var0x -> var0x.field_19965.method_12173())
         .thenComparingInt(var0x -> var0x.field_19965.method_12185());
      var0.sort(var5);
      var2.sort(var5);
      var1.sort(var5);
      ArrayList var6 = Lists.newArrayList();
      var6.addAll(var0);
      var6.addAll(var2);
      var6.addAll(var1);
      return var6;
   }

   private void method_29964(World var1, BlockPos var2, BlockPos var3) {
      List var6 = var1.<Entity>method_25869(Entity.class, new class_4092(var2, var3), var0 -> !(var0 instanceof class_704));
      this.field_33470.clear();

      for (Entity var8 : var6) {
         class_1343 var9 = new class_1343(
            var8.method_37302() - (double)var2.method_12173(),
            var8.method_37309() - (double)var2.method_12165(),
            var8.method_37156() - (double)var2.method_12185()
         );
         CompoundNBT var10 = new CompoundNBT();
         var8.method_37350(var10);
         BlockPos var11;
         if (!(var8 instanceof class_5490)) {
            var11 = new BlockPos(var9);
         } else {
            var11 = ((class_5490)var8).method_21469().method_6093(var2);
         }

         this.field_33470.add(new class_8833(var9, var11, var10.method_25944()));
      }
   }

   public List<class_4099> method_29969(BlockPos var1, class_8478 var2, class_6414 var3) {
      return this.method_29987(var1, var2, var3, true);
   }

   public List<class_4099> method_29987(BlockPos var1, class_8478 var2, class_6414 var3, boolean var4) {
      ArrayList var7 = Lists.newArrayList();
      class_9616 var8 = var2.method_39050();
      if (this.field_33468.isEmpty()) {
         return Collections.<class_4099>emptyList();
      } else {
         for (class_4099 var10 : var2.method_39057(this.field_33468, var1).method_7495(var3)) {
            BlockPos var11 = !var4 ? var10.field_19965 : method_29968(var2, var10.field_19965).method_6105(var1);
            if (var8 == null || var8.method_44395(var11)) {
               var7.add(new class_4099(var11, var10.field_19967.method_8318(var2.method_39056()), var10.field_19968));
            }
         }

         return var7;
      }
   }

   public BlockPos method_29981(class_8478 var1, BlockPos var2, class_8478 var3, BlockPos var4) {
      BlockPos var7 = method_29968(var1, var2);
      BlockPos var8 = method_29968(var3, var4);
      return var7.method_6093(var8);
   }

   public static BlockPos method_29968(class_8478 var0, BlockPos var1) {
      return method_29966(var1, var0.method_39054(), var0.method_39056(), var0.method_39036());
   }

   public void method_29984(class_1556 var1, BlockPos var2, class_8478 var3, Random var4) {
      var3.method_39038();
      this.method_29994(var1, var2, var3, var4);
   }

   public void method_29994(class_1556 var1, BlockPos var2, class_8478 var3, Random var4) {
      this.method_29965(var1, var2, var2, var3, var4, 2);
   }

   public boolean method_29965(class_1556 var1, BlockPos var2, BlockPos var3, class_8478 var4, Random var5, int var6) {
      if (this.field_33468.isEmpty()) {
         return false;
      } else {
         List var9 = var4.method_39057(this.field_33468, var2).method_7496();
         if ((!var9.isEmpty() || !var4.method_39032() && !this.field_33470.isEmpty())
            && this.field_33472.method_12173() >= 1
            && this.field_33472.method_12165() >= 1
            && this.field_33472.method_12185() >= 1) {
            class_9616 var10 = var4.method_39050();
            ArrayList var11 = Lists.newArrayListWithCapacity(!var4.method_39040() ? 0 : var9.size());
            ArrayList var12 = Lists.newArrayListWithCapacity(var9.size());
            int var13 = Integer.MAX_VALUE;
            int var14 = Integer.MAX_VALUE;
            int var15 = Integer.MAX_VALUE;
            int var16 = Integer.MIN_VALUE;
            int var17 = Integer.MIN_VALUE;
            int var18 = Integer.MIN_VALUE;

            for (class_4099 var20 : method_29988(var1, var2, var3, var4, var9)) {
               BlockPos var21 = var20.field_19965;
               if (var10 == null || var10.method_44395(var21)) {
                  class_4774 var22 = !var4.method_39040() ? null : var1.method_28258(var21);
                  class_2522 var23 = var20.field_19967.method_8372(var4.method_39054()).method_8318(var4.method_39056());
                  if (var20.field_19968 != null) {
                     class_3757 var24 = var1.method_28260(var21);
                     class_5507.method_24976(var24);
                     var1.method_7513(var21, class_4783.field_23207.method_29260(), 20);
                  }

                  if (var1.method_7513(var21, var23, var6)) {
                     var13 = Math.min(var13, var21.method_12173());
                     var14 = Math.min(var14, var21.method_12165());
                     var15 = Math.min(var15, var21.method_12185());
                     var16 = Math.max(var16, var21.method_12173());
                     var17 = Math.max(var17, var21.method_12165());
                     var18 = Math.max(var18, var21.method_12185());
                     var12.add(Pair.of(var21, var20.field_19968));
                     if (var20.field_19968 != null) {
                        class_3757 var39 = var1.method_28260(var21);
                        if (var39 != null) {
                           var20.field_19968.method_25931("x", var21.method_12173());
                           var20.field_19968.method_25931("y", var21.method_12165());
                           var20.field_19968.method_25931("z", var21.method_12185());
                           if (var39 instanceof class_2358) {
                              var20.field_19968.method_25949("LootTableSeed", var5.nextLong());
                           }

                           var39.method_17394(var20.field_19967, var20.field_19968);
                           var39.method_17389(var4.method_39054());
                           var39.method_17391(var4.method_39056());
                        }
                     }

                     if (var22 != null && var23.method_8360() instanceof class_4582) {
                        ((class_4582)var23.method_8360()).method_21237(var1, var21, var23, var22);
                        if (!var22.method_21993()) {
                           var11.add(var21);
                        }
                     }
                  }
               }
            }

            boolean var28 = true;
            Direction[] var29 = new Direction[]{Direction.field_817, Direction.field_818, Direction.field_804, Direction.field_800, Direction.field_809};

            while (var28 && !var11.isEmpty()) {
               var28 = false;
               Iterator var30 = var11.iterator();

               while (var30.hasNext()) {
                  BlockPos var33 = (BlockPos)var30.next();
                  BlockPos var36 = var33;
                  class_4774 var40 = var1.method_28258(var33);

                  for (int var25 = 0; var25 < var29.length && !var40.method_21993(); var25++) {
                     BlockPos var26 = var36.method_6098(var29[var25]);
                     class_4774 var27 = var1.method_28258(var26);
                     if (var27.method_22008(var1, var26) > var40.method_22008(var1, var36) || var27.method_21993() && !var40.method_21993()) {
                        var40 = var27;
                        var36 = var26;
                     }
                  }

                  if (var40.method_21993()) {
                     class_2522 var44 = var1.method_28262(var33);
                     class_6414 var47 = var44.method_8360();
                     if (var47 instanceof class_4582) {
                        ((class_4582)var47).method_21237(var1, var33, var44, var40);
                        var28 = true;
                        var30.remove();
                     }
                  }
               }
            }

            if (var13 <= var16) {
               if (!var4.method_39031()) {
                  class_3087 var31 = new class_3087(var16 - var13 + 1, var17 - var14 + 1, var18 - var15 + 1);
                  int var34 = var13;
                  int var37 = var14;
                  int var41 = var15;

                  for (Pair var48 : var12) {
                     BlockPos var49 = (BlockPos)var48.getFirst();
                     var31.method_26202(var49.method_12173() - var34, var49.method_12165() - var37, var49.method_12185() - var41, true, true);
                  }

                  method_29985(var1, var6, var31, var34, var37, var41);
               }

               for (Pair var35 : var12) {
                  BlockPos var38 = (BlockPos)var35.getFirst();
                  if (!var4.method_39031()) {
                     class_2522 var42 = var1.method_28262(var38);
                     class_2522 var46 = class_6414.method_29274(var42, var1, var38);
                     if (var42 != var46) {
                        var1.method_7513(var38, var46, var6 & -2 | 16);
                     }

                     var1.method_43369(var38, var46.method_8360());
                  }

                  if (var35.getSecond() != null) {
                     class_3757 var43 = var1.method_28260(var38);
                     if (var43 != null) {
                        var43.method_17407();
                     }
                  }
               }
            }

            if (!var4.method_39032()) {
               this.method_29992(var1, var2, var4.method_39054(), var4.method_39056(), var4.method_39036(), var10, var4.method_39046());
            }

            return true;
         } else {
            return false;
         }
      }
   }

   public static void method_29985(class_9379 var0, int var1, class_5791 var2, int var3, int var4, int var5) {
      var2.method_26195((var5x, var6, var7, var8) -> {
         BlockPos var11 = new BlockPos(var3 + var6, var4 + var7, var5 + var8);
         BlockPos var12 = var11.method_6098(var5x);
         class_2522 var13 = var0.method_28262(var11);
         class_2522 var14 = var0.method_28262(var12);
         class_2522 var15 = var13.method_8359(var5x, var14, var0, var11, var12);
         if (var13 != var15) {
            var0.method_7513(var11, var15, var1 & -2);
         }

         class_2522 var16 = var14.method_8359(var5x.method_1046(), var15, var0, var12, var11);
         if (var14 != var16) {
            var0.method_7513(var12, var16, var1 & -2);
         }
      });
   }

   public static List<class_4099> method_29988(class_9379 var0, BlockPos var1, BlockPos var2, class_8478 var3, List<class_4099> var4) {
      ArrayList var7 = Lists.newArrayList();

      for (class_4099 var9 : var4) {
         BlockPos var10 = method_29968(var3, var9.field_19965).method_6105(var1);
         class_4099 var11 = new class_4099(var10, var9.field_19967, var9.field_19968 == null ? null : var9.field_19968.method_25944());
         Iterator var12 = var3.method_39034().iterator();

         while (var11 != null && var12.hasNext()) {
            var11 = ((class_2103)var12.next()).method_9859(var0, var1, var2, var9, var11, var3);
         }

         if (var11 != null) {
            var7.add(var11);
         }
      }

      return var7;
   }

   private void method_29992(class_1556 var1, BlockPos var2, class_9022 var3, class_6631 var4, BlockPos var5, class_9616 var6, boolean var7) {
      for (class_8833 var11 : this.field_33470) {
         BlockPos var12 = method_29966(var11.field_45183, var3, var4, var5).method_6105(var2);
         if (var6 == null || var6.method_44395(var12)) {
            CompoundNBT var13 = var11.field_45182.method_25944();
            class_1343 var14 = method_29967(var11.field_45180, var3, var4, var5);
            class_1343 var15 = var14.method_6214((double)var2.method_12173(), (double)var2.method_12165(), (double)var2.method_12185());
            class_3416 var16 = new class_3416();
            var16.add(class_9708.method_44846(var15.field_7336));
            var16.add(class_9708.method_44846(var15.field_7333));
            var16.add(class_9708.method_44846(var15.field_7334));
            var13.put("Pos", var16);
            var13.method_25959("UUID");
            method_29991(var1, var13).ifPresent(var6x -> {
               float var9 = var6x.method_37152(var3);
               var9 += var6x.rotationYaw - var6x.method_37317(var4);
               var6x.method_37144(var15.field_7336, var15.field_7333, var15.field_7334, var9, var6x.rotationPitch);
               if (var7 && var6x instanceof class_5886) {
                  ((class_5886)var6x).method_26864(var1, var1.method_43368(new BlockPos(var15)), class_2417.field_12033, (class_8733)null, var13);
               }

               var1.method_7065(var6x);
            });
         }
      }
   }

   private static Optional<Entity> method_29991(class_1556 var0, CompoundNBT var1) {
      try {
         return class_6629.method_30475(var1, var0.method_7066());
      } catch (Exception var5) {
         return Optional.<Entity>empty();
      }
   }

   public BlockPos method_29970(class_6631 var1) {
      switch (var1) {
         case field_34335:
         case field_34334:
            return new BlockPos(this.field_33472.method_12185(), this.field_33472.method_12165(), this.field_33472.method_12173());
         default:
            return this.field_33472;
      }
   }

   public static BlockPos method_29966(BlockPos var0, class_9022 var1, class_6631 var2, BlockPos var3) {
      int var6 = var0.method_12173();
      int var7 = var0.method_12165();
      int var8 = var0.method_12185();
      boolean var9 = true;
      switch (var1) {
         case field_46148:
            var8 = -var8;
            break;
         case field_46144:
            var6 = -var6;
            break;
         default:
            var9 = false;
      }

      int var10 = var3.method_12173();
      int var11 = var3.method_12185();
      switch (var2) {
         case field_34335:
            return new BlockPos(var10 - var11 + var8, var7, var10 + var11 - var6);
         case field_34334:
            return new BlockPos(var10 + var11 - var8, var7, var11 - var10 + var6);
         case field_34338:
            return new BlockPos(var10 + var10 - var6, var7, var11 + var11 - var8);
         default:
            return var9 ? new BlockPos(var6, var7, var8) : var0;
      }
   }

   public static class_1343 method_29967(class_1343 var0, class_9022 var1, class_6631 var2, BlockPos var3) {
      double var6 = var0.field_7336;
      double var8 = var0.field_7333;
      double var10 = var0.field_7334;
      boolean var12 = true;
      switch (var1) {
         case field_46148:
            var10 = 1.0 - var10;
            break;
         case field_46144:
            var6 = 1.0 - var6;
            break;
         default:
            var12 = false;
      }

      int var13 = var3.method_12173();
      int var14 = var3.method_12185();
      switch (var2) {
         case field_34335:
            return new class_1343((double)(var13 - var14) + var10, var8, (double)(var13 + var14 + 1) - var6);
         case field_34334:
            return new class_1343((double)(var13 + var14 + 1) - var10, var8, (double)(var14 - var13) + var6);
         case field_34338:
            return new class_1343((double)(var13 + var13 + 1) - var6, var8, (double)(var14 + var14 + 1) - var10);
         default:
            return var12 ? new class_1343(var6, var8, var10) : var0;
      }
   }

   public BlockPos method_29977(BlockPos var1, class_9022 var2, class_6631 var3) {
      return method_29978(var1, var2, var3, this.method_29975().method_12173(), this.method_29975().method_12185());
   }

   public static BlockPos method_29978(BlockPos var0, class_9022 var1, class_6631 var2, int var3, int var4) {
      var3--;
      var4--;
      int var7 = var1 == class_9022.field_46144 ? var3 : 0;
      int var8 = var1 == class_9022.field_46148 ? var4 : 0;
      BlockPos var9 = var0;
      switch (var2) {
         case field_34335:
            var9 = var0.method_6104(var8, 0, var3 - var7);
            break;
         case field_34334:
            var9 = var0.method_6104(var4 - var8, 0, var7);
            break;
         case field_34338:
            var9 = var0.method_6104(var3 - var7, 0, var4 - var8);
            break;
         case field_34340:
            var9 = var0.method_6104(var7, 0, var8);
      }

      return var9;
   }

   public class_9616 method_29986(class_8478 var1, BlockPos var2) {
      return this.method_29973(var2, var1.method_39056(), var1.method_39036(), var1.method_39054());
   }

   public class_9616 method_29973(BlockPos var1, class_6631 var2, BlockPos var3, class_9022 var4) {
      BlockPos var7 = this.method_29970(var2);
      int var8 = var3.method_12173();
      int var9 = var3.method_12185();
      int var10 = var7.method_12173() - 1;
      int var11 = var7.method_12165() - 1;
      int var12 = var7.method_12185() - 1;
      class_9616 var13 = new class_9616(0, 0, 0, 0, 0, 0);
      switch (var2) {
         case field_34335:
            var13 = new class_9616(var8 - var9, 0, var8 + var9 - var12, var8 - var9 + var10, var11, var8 + var9);
            break;
         case field_34334:
            var13 = new class_9616(var8 + var9 - var10, 0, var9 - var8, var8 + var9, var11, var9 - var8 + var12);
            break;
         case field_34338:
            var13 = new class_9616(var8 + var8 - var10, 0, var9 + var9 - var12, var8 + var8, var11, var9 + var9);
            break;
         case field_34340:
            var13 = new class_9616(0, 0, 0, var10, var11, var12);
      }

      switch (var4) {
         case field_46148:
            this.method_29989(var2, var12, var10, var13, Direction.field_818, Direction.field_800);
            break;
         case field_46144:
            this.method_29989(var2, var10, var12, var13, Direction.field_809, Direction.field_804);
         case field_46145:
      }

      var13.method_44391(var1.method_12173(), var1.method_12165(), var1.method_12185());
      return var13;
   }

   private void method_29989(class_6631 var1, int var2, int var3, class_9616 var4, Direction var5, Direction var6) {
      BlockPos var9 = BlockPos.field_7306;
      if (var1 == class_6631.field_34334 || var1 == class_6631.field_34335) {
         var9 = var9.method_6099(var1.method_30489(var5), var3);
      } else if (var1 != class_6631.field_34338) {
         var9 = var9.method_6099(var5, var2);
      } else {
         var9 = var9.method_6099(var6, var2);
      }

      var4.method_44391(var9.method_12173(), 0, var9.method_12185());
   }

   public CompoundNBT method_29993(CompoundNBT var1) {
      if (!this.field_33468.isEmpty()) {
         ArrayList var4 = Lists.newArrayList();
         class_2947 var5 = new class_2947(null);
         var4.add(var5);

         for (int var6 = 1; var6 < this.field_33468.size(); var6++) {
            var4.add(new class_2947(null));
         }

         class_3416 var16 = new class_3416();
         List var7 = this.field_33468.get(0).method_7496();

         for (int var8 = 0; var8 < var7.size(); var8++) {
            class_4099 var9 = (class_4099)var7.get(var8);
            CompoundNBT var10 = new CompoundNBT();
            var10.put("pos", this.method_29983(var9.field_19965.method_12173(), var9.field_19965.method_12165(), var9.field_19965.method_12185()));
            int var11 = var5.method_13475(var9.field_19967);
            var10.method_25931("state", var11);
            if (var9.field_19968 != null) {
               var10.put("nbt", var9.field_19968);
            }

            var16.add(var10);

            for (int var12 = 1; var12 < this.field_33468.size(); var12++) {
               class_2947 var13 = (class_2947)var4.get(var12);
               var13.method_13476(this.field_33468.get(var12).method_7496().get(var8).field_19967, var11);
            }
         }

         var1.put("blocks", var16);
         if (var4.size() != 1) {
            class_3416 var19 = new class_3416();

            for (class_2947 var23 : var4) {
               class_3416 var25 = new class_3416();

               for (class_2522 var27 : var23) {
                  var25.add(class_4338.method_20187(var27));
               }

               var19.add(var25);
            }

            var1.put("palettes", var19);
         } else {
            class_3416 var20 = new class_3416();

            for (class_2522 var24 : var5) {
               var20.add(class_4338.method_20187(var24));
            }

            var1.put("palette", var20);
         }
      } else {
         var1.put("blocks", new class_3416());
         var1.put("palette", new class_3416());
      }

      class_3416 var14 = new class_3416();

      for (class_8833 var17 : this.field_33470) {
         CompoundNBT var18 = new CompoundNBT();
         var18.put("pos", this.method_29972(var17.field_45180.field_7336, var17.field_45180.field_7333, var17.field_45180.field_7334));
         var18.put("blockPos", this.method_29983(var17.field_45183.method_12173(), var17.field_45183.method_12165(), var17.field_45183.method_12185()));
         if (var17.field_45182 != null) {
            var18.put("nbt", var17.field_45182);
         }

         var14.add(var18);
      }

      var1.put("entities", var14);
      var1.put("size", this.method_29983(this.field_33472.method_12173(), this.field_33472.method_12165(), this.field_33472.method_12185()));
      var1.method_25931("DataVersion", class_7665.method_34674().getWorldVersion());
      return var1;
   }

   public void method_29990(CompoundNBT var1) {
      this.field_33468.clear();
      this.field_33470.clear();
      class_3416 var4 = var1.method_25927("size", 3);
      this.field_33472 = new BlockPos(var4.method_15762(0), var4.method_15762(1), var4.method_15762(2));
      class_3416 var5 = var1.method_25927("blocks", 10);
      if (!var1.contains("palettes", 9)) {
         this.method_29980(var1.method_25927("palette", 10), var5);
      } else {
         class_3416 var6 = var1.method_25927("palettes", 9);

         for (int var7 = 0; var7 < var6.size(); var7++) {
            this.method_29980(var6.method_15760(var7), var5);
         }
      }

      class_3416 var14 = var1.method_25927("entities", 10);

      for (int var15 = 0; var15 < var14.size(); var15++) {
         CompoundNBT var8 = var14.method_15764(var15);
         class_3416 var9 = var8.method_25927("pos", 6);
         class_1343 var10 = new class_1343(var9.method_15763(0), var9.method_15763(1), var9.method_15763(2));
         class_3416 var11 = var8.method_25927("blockPos", 3);
         BlockPos var12 = new BlockPos(var11.method_15762(0), var11.method_15762(1), var11.method_15762(2));
         if (var8.method_25938("nbt")) {
            CompoundNBT var13 = var8.getCompound("nbt");
            this.field_33470.add(new class_8833(var10, var12, var13));
         }
      }
   }

   private void method_29980(class_3416 var1, class_3416 var2) {
      class_2947 var5 = new class_2947(null);

      for (int var6 = 0; var6 < var1.size(); var6++) {
         var5.method_13476(class_4338.method_20185(var1.method_15764(var6)), var6);
      }

      ArrayList var16 = Lists.newArrayList();
      ArrayList var7 = Lists.newArrayList();
      ArrayList var8 = Lists.newArrayList();

      for (int var9 = 0; var9 < var2.size(); var9++) {
         CompoundNBT var10 = var2.method_15764(var9);
         class_3416 var11 = var10.method_25927("pos", 3);
         BlockPos var12 = new BlockPos(var11.method_15762(0), var11.method_15762(1), var11.method_15762(2));
         class_2522 var13 = var5.method_13477(var10.method_25947("state"));
         CompoundNBT var14;
         if (!var10.method_25938("nbt")) {
            var14 = null;
         } else {
            var14 = var10.getCompound("nbt");
         }

         class_4099 var15 = new class_4099(var12, var13, var14);
         method_29974(var15, var16, var7, var8);
      }

      List var17 = method_29979(var16, var7, var8);
      this.field_33468.add(new class_1673(var17, null));
   }

   private class_3416 method_29983(int... var1) {
      class_3416 var4 = new class_3416();

      for (int var8 : var1) {
         var4.add(class_9413.method_43597(var8));
      }

      return var4;
   }

   private class_3416 method_29972(double... var1) {
      class_3416 var4 = new class_3416();

      for (double var8 : var1) {
         var4.add(class_9708.method_44846(var8));
      }

      return var4;
   }
}
