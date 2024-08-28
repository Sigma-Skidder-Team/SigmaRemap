package mapped;

import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.Random;

public class Class8969 {
   private final List<Class7285> field40545 = Lists.newArrayList();
   private final List<Class9559> field40546 = Lists.newArrayList();
   private BlockPos field40547 = BlockPos.field13032;
   private String field40548 = "?";

   public BlockPos method32886() {
      return this.field40547;
   }

   public void method32887(String var1) {
      this.field40548 = var1;
   }

   public String method32888() {
      return this.field40548;
   }

   public void method32889(Class1655 var1, BlockPos var2, BlockPos var3, boolean var4, Class3209 var5) {
      if (var3.method8304() >= 1 && var3.getY() >= 1 && var3.method8306() >= 1) {
         BlockPos var8 = var2.method8337(var3).method8336(-1, -1, -1);
         ArrayList var9 = Lists.newArrayList();
         ArrayList var10 = Lists.newArrayList();
         ArrayList var11 = Lists.newArrayList();
         BlockPos var12 = new BlockPos(
            Math.min(var2.method8304(), var8.method8304()), Math.min(var2.getY(), var8.getY()), Math.min(var2.method8306(), var8.method8306())
         );
         BlockPos var13 = new BlockPos(
            Math.max(var2.method8304(), var8.method8304()), Math.max(var2.getY(), var8.getY()), Math.max(var2.method8306(), var8.method8306())
         );
         this.field40547 = var3;

         for (BlockPos var15 : BlockPos.method8359(var12, var13)) {
            BlockPos var16 = var15.method8338(var12);
            Class7380 var17 = var1.method6738(var15);
            if (var5 == null || var5 != var17.method23383()) {
               Class944 var18 = var1.method6759(var15);
               Class8266 var19;
               if (var18 == null) {
                  var19 = new Class8266(var16, var17, (Class39)null);
               } else {
                  Class39 var20 = var18.method3646(new Class39());
                  var20.method133("x");
                  var20.method133("y");
                  var20.method133("z");
                  var19 = new Class8266(var16, var17, var20.method79());
               }

               method32890(var19, var9, var10, var11);
            }
         }

         List var21 = method32891(var9, var10, var11);
         this.field40545.clear();
         this.field40545.add(new Class7285(var21));
         if (!var4) {
            this.field40546.clear();
         } else {
            this.method32892(var1, var12, var13.method8336(1, 1, 1));
         }
      }
   }

   private static void method32890(Class8266 var0, List<Class8266> var1, List<Class8266> var2, List<Class8266> var3) {
      if (var0.field35532 == null) {
         if (!var0.field35531.method23383().method11582() && var0.field35531.method23456(Class1666.field9078, BlockPos.field13032)) {
            var1.add(var0);
         } else {
            var3.add(var0);
         }
      } else {
         var2.add(var0);
      }
   }

   private static List<Class8266> method32891(List<Class8266> var0, List<Class8266> var1, List<Class8266> var2) {
      Comparator var5 = Comparator.<Class8266>comparingInt(var0x -> var0x.field35530.getY())
         .thenComparingInt(var0x -> var0x.field35530.method8304())
         .thenComparingInt(var0x -> var0x.field35530.method8306());
      var0.sort(var5);
      var2.sort(var5);
      var1.sort(var5);
      ArrayList var6 = Lists.newArrayList();
      var6.addAll(var0);
      var6.addAll(var2);
      var6.addAll(var1);
      return var6;
   }

   private void method32892(Class1655 var1, BlockPos var2, BlockPos var3) {
      List<Entity> var6 = var1.<Entity>method6772(Entity.class, new Class6488(var2, var3), var0 -> !(var0 instanceof PlayerEntity));
      this.field40546.clear();

      for (Entity var8 : var6) {
         Vector3d var9 = new Vector3d(
            var8.getPosX() - (double)var2.method8304(), var8.getPosY() - (double)var2.getY(), var8.getPosZ() - (double)var2.method8306()
         );
         Class39 var10 = new Class39();
         var8.method3293(var10);
         BlockPos var11;
         if (!(var8 instanceof Class998)) {
            var11 = new BlockPos(var9);
         } else {
            var11 = ((Class998)var8).method4085().method8338(var2);
         }

         this.field40546.add(new Class9559(var9, var11, var10.method79()));
      }
   }

   public List<Class8266> method32893(BlockPos var1, Class9463 var2, Class3209 var3) {
      return this.method32894(var1, var2, var3, true);
   }

   public List<Class8266> method32894(BlockPos var1, Class9463 var2, Class3209 var3, boolean var4) {
      ArrayList var7 = Lists.newArrayList();
      Class9764 var8 = var2.method36441();
      if (this.field40545.isEmpty()) {
         return Collections.<Class8266>emptyList();
      } else {
         for (Class8266 var10 : var2.method36446(this.field40545, var1).method22981(var3)) {
            BlockPos var11 = !var4 ? var10.field35530 : method32896(var2, var10.field35530).method8337(var1);
            if (var8 == null || var8.method38396(var11)) {
               var7.add(new Class8266(var11, var10.field35531.method23395(var2.method36437()), var10.field35532));
            }
         }

         return var7;
      }
   }

   public BlockPos method32895(Class9463 var1, BlockPos var2, Class9463 var3, BlockPos var4) {
      BlockPos var7 = method32896(var1, var2);
      BlockPos var8 = method32896(var3, var4);
      return var7.method8338(var8);
   }

   public static BlockPos method32896(Class9463 var0, BlockPos var1) {
      return method32905(var1, var0.method36436(), var0.method36437(), var0.method36438());
   }

   public void method32897(Class1659 var1, BlockPos var2, Class9463 var3, Random var4) {
      var3.method36444();
      this.method32898(var1, var2, var3, var4);
   }

   public void method32898(Class1659 var1, BlockPos var2, Class9463 var3, Random var4) {
      this.method32899(var1, var2, var2, var3, var4, 2);
   }

   public boolean method32899(Class1659 var1, BlockPos var2, BlockPos var3, Class9463 var4, Random var5, int var6) {
      if (this.field40545.isEmpty()) {
         return false;
      } else {
         List<Class8266> var9 = var4.method36446(this.field40545, var2).method22980();
         if ((!var9.isEmpty() || !var4.method36440() && !this.field40546.isEmpty())
            && this.field40547.method8304() >= 1
            && this.field40547.getY() >= 1
            && this.field40547.method8306() >= 1) {
            Class9764 var10 = var4.method36441();
            List<BlockPos> var11 = Lists.newArrayListWithCapacity(!var4.method36445() ? 0 : var9.size());
            List<Pair> var12 = Lists.newArrayListWithCapacity(var9.size());
            int var13 = Integer.MAX_VALUE;
            int var14 = Integer.MAX_VALUE;
            int var15 = Integer.MAX_VALUE;
            int var16 = Integer.MIN_VALUE;
            int var17 = Integer.MIN_VALUE;
            int var18 = Integer.MIN_VALUE;

            for (Class8266 var20 : method32901(var1, var2, var3, var4, var9)) {
               BlockPos var21 = var20.field35530;
               if (var10 == null || var10.method38396(var21)) {
                  Class7379 var22 = !var4.method36445() ? null : var1.method6739(var21);
                  Class7380 var23 = var20.field35531.method23396(var4.method36436()).method23395(var4.method36437());
                  if (var20.field35532 != null) {
                     Class944 var24 = var1.method6759(var21);
                     Class946.method3802(var24);
                     var1.method6725(var21, Class8487.field36765.method11579(), 20);
                  }

                  if (var1.method6725(var21, var23, var6)) {
                     var13 = Math.min(var13, var21.method8304());
                     var14 = Math.min(var14, var21.getY());
                     var15 = Math.min(var15, var21.method8306());
                     var16 = Math.max(var16, var21.method8304());
                     var17 = Math.max(var17, var21.getY());
                     var18 = Math.max(var18, var21.method8306());
                     var12.add(Pair.of(var21, var20.field35532));
                     if (var20.field35532 != null) {
                        Class944 var39 = var1.method6759(var21);
                        if (var39 != null) {
                           var20.field35532.method102("x", var21.method8304());
                           var20.field35532.method102("y", var21.getY());
                           var20.field35532.method102("z", var21.method8306());
                           if (var39 instanceof Class939) {
                              var20.field35532.method103("LootTableSeed", var5.nextLong());
                           }

                           var39.method3645(var20.field35531, var20.field35532);
                           var39.method3785(var4.method36436());
                           var39.method3784(var4.method36437());
                        }
                     }

                     if (var22 != null && var23.method23383() instanceof Class3449) {
                        ((Class3449)var23.method23383()).method11532(var1, var21, var23, var22);
                        if (!var22.method23473()) {
                           var11.add(var21);
                        }
                     }
                  }
               }
            }

            boolean var28 = true;
            Direction[] var29 = new Direction[]{Direction.field673, Direction.NORTH, Direction.EAST, Direction.SOUTH, Direction.WEST};

            while (var28 && !var11.isEmpty()) {
               var28 = false;
               Iterator var30 = var11.iterator();

               while (var30.hasNext()) {
                  BlockPos var33 = (BlockPos)var30.next();
                  BlockPos var36 = var33;
                  Class7379 var40 = var1.method6739(var33);

                  for (int var25 = 0; var25 < var29.length && !var40.method23473(); var25++) {
                     BlockPos var26 = var36.method8349(var29[var25]);
                     Class7379 var27 = var1.method6739(var26);
                     if (var27.method23475(var1, var26) > var40.method23475(var1, var36) || var27.method23473() && !var40.method23473()) {
                        var40 = var27;
                        var36 = var26;
                     }
                  }

                  if (var40.method23473()) {
                     Class7380 var44 = var1.method6738(var33);
                     Class3209 var47 = var44.method23383();
                     if (var47 instanceof Class3449) {
                        ((Class3449)var47).method11532(var1, var33, var44, var40);
                        var28 = true;
                        var30.remove();
                     }
                  }
               }
            }

            if (var13 <= var16) {
               if (!var4.method36442()) {
                  Class7937 var31 = new Class7937(var16 - var13 + 1, var17 - var14 + 1, var18 - var15 + 1);
                  int var34 = var13;
                  int var37 = var14;
                  int var41 = var15;

                  for (Pair var48 : var12) {
                     BlockPos var49 = (BlockPos)var48.getFirst();
                     var31.method26718(var49.method8304() - var34, var49.getY() - var37, var49.method8306() - var41, true, true);
                  }

                  method32900(var1, var6, var31, var34, var37, var41);
               }

               for (Pair var35 : var12) {
                  BlockPos var38 = (BlockPos)var35.getFirst();
                  if (!var4.method36442()) {
                     Class7380 var42 = var1.method6738(var38);
                     Class7380 var46 = Class3209.method11542(var42, var1, var38);
                     if (var42 != var46) {
                        var1.method6725(var38, var46, var6 & -2 | 16);
                     }

                     var1.method6964(var38, var46.method23383());
                  }

                  if (var35.getSecond() != null) {
                     Class944 var43 = var1.method6759(var38);
                     if (var43 != null) {
                        var43.method3622();
                     }
                  }
               }
            }

            if (!var4.method36440()) {
               this.method32902(var1, var2, var4.method36436(), var4.method36437(), var4.method36438(), var10, var4.method36449());
            }

            return true;
         } else {
            return false;
         }
      }
   }

   public static void method32900(Class1660 var0, int var1, Class7938 var2, int var3, int var4, int var5) {
      var2.method26740((var5x, var6, var7, var8) -> {
         BlockPos var11 = new BlockPos(var3 + var6, var4 + var7, var5 + var8);
         BlockPos var12 = var11.method8349(var5x);
         Class7380 var13 = var0.method6738(var11);
         Class7380 var14 = var0.method6738(var12);
         Class7380 var15 = var13.method23439(var5x, var14, var0, var11, var12);
         if (var13 != var15) {
            var0.method6725(var11, var15, var1 & -2);
         }

         Class7380 var16 = var14.method23439(var5x.method536(), var15, var0, var12, var11);
         if (var14 != var16) {
            var0.method6725(var12, var16, var1 & -2);
         }
      });
   }

   public static List<Class8266> method32901(Class1660 var0, BlockPos var1, BlockPos var2, Class9463 var3, List<Class8266> var4) {
      List<Class8266> var7 = Lists.newArrayList();

      for (Class8266 var9 : var4) {
         BlockPos var10 = method32896(var3, var9.field35530).method8337(var1);
         Class8266 var11 = new Class8266(var10, var9.field35531, var9.field35532 == null ? null : var9.field35532.method79());
         Iterator<Class7092> var12 = var3.method36443().iterator();

         while (var11 != null && var12.hasNext()) {
            var11 = var12.next().method22068(var0, var1, var2, var9, var11, var3);
         }

         if (var11 != null) {
            var7.add(var11);
         }
      }

      return var7;
   }

   private void method32902(Class1659 var1, BlockPos var2, Class2089 var3, Class80 var4, BlockPos var5, Class9764 var6, boolean var7) {
      for (Class9559 var11 : this.field40546) {
         BlockPos var12 = method32905(var11.field44528, var3, var4, var5).method8337(var2);
         if (var6 == null || var6.method38396(var12)) {
            Class39 var13 = var11.field44529.method79();
            Vector3d var14 = method32906(var11.field44527, var3, var4, var5);
            Vector3d var15 = var14.method11339((double)var2.method8304(), (double)var2.getY(), (double)var2.method8306());
            Class41 var16 = new Class41();
            var16.add(Class34.method93(var15.field18048));
            var16.add(Class34.method93(var15.field18049));
            var16.add(Class34.method93(var15.field18050));
            var13.method99("Pos", var16);
            var13.method133("UUID");
            method32903(var1, var13).ifPresent(var6x -> {
               float var9 = var6x.method3403(var3);
               var9 += var6x.field5031 - var6x.method3402(var4);
               var6x.method3273(var15.field18048, var15.field18049, var15.field18050, var9, var6x.field5032);
               if (var7 && var6x instanceof Class1006) {
                  ((Class1006)var6x).method4276(var1, var1.method6807(new BlockPos(var15)), Class2202.field14394, (Class5093)null, var13);
               }

               var1.method6995(var6x);
            });
         }
      }
   }

   private static Optional<Entity> method32903(Class1659 var0, Class39 var1) {
      try {
         return Class8992.method33217(var1, var0.method6970());
      } catch (Exception var5) {
         return Optional.<Entity>empty();
      }
   }

   public BlockPos method32904(Class80 var1) {
      switch (Class9051.field41436[var1.ordinal()]) {
         case 1:
         case 2:
            return new BlockPos(this.field40547.method8306(), this.field40547.getY(), this.field40547.method8304());
         default:
            return this.field40547;
      }
   }

   public static BlockPos method32905(BlockPos var0, Class2089 var1, Class80 var2, BlockPos var3) {
      int var6 = var0.method8304();
      int var7 = var0.getY();
      int var8 = var0.method8306();
      boolean var9 = true;
      switch (Class9051.field41437[var1.ordinal()]) {
         case 1:
            var8 = -var8;
            break;
         case 2:
            var6 = -var6;
            break;
         default:
            var9 = false;
      }

      int var10 = var3.method8304();
      int var11 = var3.method8306();
      switch (Class9051.field41436[var2.ordinal()]) {
         case 1:
            return new BlockPos(var10 - var11 + var8, var7, var10 + var11 - var6);
         case 2:
            return new BlockPos(var10 + var11 - var8, var7, var11 - var10 + var6);
         case 3:
            return new BlockPos(var10 + var10 - var6, var7, var11 + var11 - var8);
         default:
            return var9 ? new BlockPos(var6, var7, var8) : var0;
      }
   }

   public static Vector3d method32906(Vector3d var0, Class2089 var1, Class80 var2, BlockPos var3) {
      double var6 = var0.field18048;
      double var8 = var0.field18049;
      double var10 = var0.field18050;
      boolean var12 = true;
      switch (Class9051.field41437[var1.ordinal()]) {
         case 1:
            var10 = 1.0 - var10;
            break;
         case 2:
            var6 = 1.0 - var6;
            break;
         default:
            var12 = false;
      }

      int var13 = var3.method8304();
      int var14 = var3.method8306();
      switch (Class9051.field41436[var2.ordinal()]) {
         case 1:
            return new Vector3d((double)(var13 - var14) + var10, var8, (double)(var13 + var14 + 1) - var6);
         case 2:
            return new Vector3d((double)(var13 + var14 + 1) - var10, var8, (double)(var14 - var13) + var6);
         case 3:
            return new Vector3d((double)(var13 + var13 + 1) - var6, var8, (double)(var14 + var14 + 1) - var10);
         default:
            return var12 ? new Vector3d(var6, var8, var10) : var0;
      }
   }

   public BlockPos method32907(BlockPos var1, Class2089 var2, Class80 var3) {
      return method32908(var1, var2, var3, this.method32886().method8304(), this.method32886().method8306());
   }

   public static BlockPos method32908(BlockPos var0, Class2089 var1, Class80 var2, int var3, int var4) {
      var3--;
      var4--;
      int var7 = var1 == Class2089.field13616 ? var3 : 0;
      int var8 = var1 == Class2089.field13615 ? var4 : 0;
      BlockPos var9 = var0;
      switch (Class9051.field41436[var2.ordinal()]) {
         case 1:
            var9 = var0.method8336(var8, 0, var3 - var7);
            break;
         case 2:
            var9 = var0.method8336(var4 - var8, 0, var7);
            break;
         case 3:
            var9 = var0.method8336(var3 - var7, 0, var4 - var8);
            break;
         case 4:
            var9 = var0.method8336(var7, 0, var8);
      }

      return var9;
   }

   public Class9764 method32909(Class9463 var1, BlockPos var2) {
      return this.method32910(var2, var1.method36437(), var1.method36438(), var1.method36436());
   }

   public Class9764 method32910(BlockPos var1, Class80 var2, BlockPos var3, Class2089 var4) {
      BlockPos var7 = this.method32904(var2);
      int var8 = var3.method8304();
      int var9 = var3.method8306();
      int var10 = var7.method8304() - 1;
      int var11 = var7.getY() - 1;
      int var12 = var7.method8306() - 1;
      Class9764 var13 = new Class9764(0, 0, 0, 0, 0, 0);
      switch (Class9051.field41436[var2.ordinal()]) {
         case 1:
            var13 = new Class9764(var8 - var9, 0, var8 + var9 - var12, var8 - var9 + var10, var11, var8 + var9);
            break;
         case 2:
            var13 = new Class9764(var8 + var9 - var10, 0, var9 - var8, var8 + var9, var11, var9 - var8 + var12);
            break;
         case 3:
            var13 = new Class9764(var8 + var8 - var10, 0, var9 + var9 - var12, var8 + var8, var11, var9 + var9);
            break;
         case 4:
            var13 = new Class9764(0, 0, 0, var10, var11, var12);
      }

      switch (Class9051.field41437[var4.ordinal()]) {
         case 1:
            this.method32911(var2, var12, var10, var13, Direction.NORTH, Direction.SOUTH);
            break;
         case 2:
            this.method32911(var2, var10, var12, var13, Direction.WEST, Direction.EAST);
         case 3:
      }

      var13.method38393(var1.method8304(), var1.getY(), var1.method8306());
      return var13;
   }

   private void method32911(Class80 var1, int var2, int var3, Class9764 var4, Direction var5, Direction var6) {
      BlockPos var9 = BlockPos.field13032;
      if (var1 == Class80.field186 || var1 == Class80.field188) {
         var9 = var9.method8350(var1.method252(var5), var3);
      } else if (var1 != Class80.field187) {
         var9 = var9.method8350(var5, var2);
      } else {
         var9 = var9.method8350(var6, var2);
      }

      var4.method38393(var9.method8304(), 0, var9.method8306());
   }

   public Class39 method32912(Class39 var1) {
      if (!this.field40545.isEmpty()) {
         List<Class2354> var4 = Lists.newArrayList();
         Class2354 var5 = new Class2354();
         var4.add(var5);

         for (int var6 = 1; var6 < this.field40545.size(); var6++) {
            var4.add(new Class2354());
         }

         Class41 var16 = new Class41();
         List var7 = this.field40545.get(0).method22980();

         for (int var8 = 0; var8 < var7.size(); var8++) {
            Class8266 var9 = (Class8266)var7.get(var8);
            Class39 var10 = new Class39();
            var10.method99("pos", this.method32915(var9.field35530.method8304(), var9.field35530.getY(), var9.field35530.method8306()));
            int var11 = var5.method9281(var9.field35531);
            var10.method102("state", var11);
            if (var9.field35532 != null) {
               var10.method99("nbt", var9.field35532);
            }

            var16.add(var10);

            for (int var12 = 1; var12 < this.field40545.size(); var12++) {
               Class2354 var13 = (Class2354)var4.get(var12);
               var13.method9283(this.field40545.get(var12).method22980().get(var8).field35531, var11);
            }
         }

         var1.method99("blocks", var16);
         if (var4.size() != 1) {
            Class41 var19 = new Class41();

            for (Class2354 var23 : var4) {
               Class41 var25 = new Class41();

               for (Class7380 var27 : var23) {
                  var25.add(Class8354.method29287(var27));
               }

               var19.add(var25);
            }

            var1.method99("palettes", var19);
         } else {
            Class41 var20 = new Class41();

            for (Class7380 var24 : var5) {
               var20.add(Class8354.method29287(var24));
            }

            var1.method99("palette", var20);
         }
      } else {
         var1.method99("blocks", new Class41());
         var1.method99("palette", new Class41());
      }

      Class41 var14 = new Class41();

      for (Class9559 var17 : this.field40546) {
         Class39 var18 = new Class39();
         var18.method99("pos", this.method32916(var17.field44527.field18048, var17.field44527.field18049, var17.field44527.field18050));
         var18.method99("blockPos", this.method32915(var17.field44528.method8304(), var17.field44528.getY(), var17.field44528.method8306()));
         if (var17.field44529 != null) {
            var18.method99("nbt", var17.field44529);
         }

         var14.add(var18);
      }

      var1.method99("entities", var14);
      var1.method99("size", this.method32915(this.field40547.method8304(), this.field40547.getY(), this.field40547.method8306()));
      var1.method102("DataVersion", Class9246.method34773().getWorldVersion());
      return var1;
   }

   public void method32913(Class39 var1) {
      this.field40545.clear();
      this.field40546.clear();
      Class41 var4 = var1.method131("size", 3);
      this.field40547 = new BlockPos(var4.method156(0), var4.method156(1), var4.method156(2));
      Class41 var5 = var1.method131("blocks", 10);
      if (!var1.method119("palettes", 9)) {
         this.method32914(var1.method131("palette", 10), var5);
      } else {
         Class41 var6 = var1.method131("palettes", 9);

         for (int var7 = 0; var7 < var6.size(); var7++) {
            this.method32914(var6.method154(var7), var5);
         }
      }

      Class41 var14 = var1.method131("entities", 10);

      for (int var15 = 0; var15 < var14.size(); var15++) {
         Class39 var8 = var14.method153(var15);
         Class41 var9 = var8.method131("pos", 6);
         Vector3d var10 = new Vector3d(var9.method158(0), var9.method158(1), var9.method158(2));
         Class41 var11 = var8.method131("blockPos", 3);
         BlockPos var12 = new BlockPos(var11.method156(0), var11.method156(1), var11.method156(2));
         if (var8.method118("nbt")) {
            Class39 var13 = var8.method130("nbt");
            this.field40546.add(new Class9559(var10, var12, var13));
         }
      }
   }

   private void method32914(Class41 var1, Class41 var2) {
      Class2354 var5 = new Class2354();

      for (int var6 = 0; var6 < var1.size(); var6++) {
         var5.method9283(Class8354.method29285(var1.method153(var6)), var6);
      }

      ArrayList var16 = Lists.newArrayList();
      ArrayList var7 = Lists.newArrayList();
      ArrayList var8 = Lists.newArrayList();

      for (int var9 = 0; var9 < var2.size(); var9++) {
         Class39 var10 = var2.method153(var9);
         Class41 var11 = var10.method131("pos", 3);
         BlockPos var12 = new BlockPos(var11.method156(0), var11.method156(1), var11.method156(2));
         Class7380 var13 = var5.method9282(var10.method122("state"));
         Class39 var14;
         if (!var10.method118("nbt")) {
            var14 = null;
         } else {
            var14 = var10.method130("nbt");
         }

         Class8266 var15 = new Class8266(var12, var13, var14);
         method32890(var15, var16, var7, var8);
      }

      List var17 = method32891(var16, var7, var8);
      this.field40545.add(new Class7285(var17));
   }

   private Class41 method32915(int... var1) {
      Class41 var4 = new Class41();

      for (int var8 : var1) {
         var4.add(Class36.method95(var8));
      }

      return var4;
   }

   private Class41 method32916(double... var1) {
      Class41 var4 = new Class41();

      for (double var8 : var1) {
         var4.add(Class34.method93(var8));
      }

      return var4;
   }
}
