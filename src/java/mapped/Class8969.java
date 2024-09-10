package mapped;

import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Direction;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.World;

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
   private BlockPos field40547 = BlockPos.ZERO;
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

   public void method32889(World var1, BlockPos var2, BlockPos var3, boolean var4, Block var5) {
      if (var3.getX() >= 1 && var3.getY() >= 1 && var3.getZ() >= 1) {
         BlockPos var8 = var2.method8337(var3).method8336(-1, -1, -1);
         ArrayList var9 = Lists.newArrayList();
         ArrayList var10 = Lists.newArrayList();
         ArrayList var11 = Lists.newArrayList();
         BlockPos var12 = new BlockPos(
            Math.min(var2.getX(), var8.getX()), Math.min(var2.getY(), var8.getY()), Math.min(var2.getZ(), var8.getZ())
         );
         BlockPos var13 = new BlockPos(
            Math.max(var2.getX(), var8.getX()), Math.max(var2.getY(), var8.getY()), Math.max(var2.getZ(), var8.getZ())
         );
         this.field40547 = var3;

         for (BlockPos var15 : BlockPos.method8359(var12, var13)) {
            BlockPos var16 = var15.method8338(var12);
            BlockState var17 = var1.getBlockState(var15);
            if (var5 == null || var5 != var17.getBlock()) {
               TileEntity var18 = var1.getTileEntity(var15);
               Class8266 var19;
               if (var18 == null) {
                  var19 = new Class8266(var16, var17, (CompoundNBT)null);
               } else {
                  CompoundNBT var20 = var18.write(new CompoundNBT());
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
         if (!var0.field35531.getBlock().method11582() && var0.field35531.method23456(Class1666.field9078, BlockPos.ZERO)) {
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
         .thenComparingInt(var0x -> var0x.field35530.getX())
         .thenComparingInt(var0x -> var0x.field35530.getZ());
      var0.sort(var5);
      var2.sort(var5);
      var1.sort(var5);
      ArrayList var6 = Lists.newArrayList();
      var6.addAll(var0);
      var6.addAll(var2);
      var6.addAll(var1);
      return var6;
   }

   private void method32892(World var1, BlockPos var2, BlockPos var3) {
      List<Entity> var6 = var1.<Entity>method6772(Entity.class, new AxisAlignedBB(var2, var3), var0 -> !(var0 instanceof PlayerEntity));
      this.field40546.clear();

      for (Entity var8 : var6) {
         Vector3d var9 = new Vector3d(
            var8.getPosX() - (double)var2.getX(), var8.getPosY() - (double)var2.getY(), var8.getPosZ() - (double)var2.getZ()
         );
         CompoundNBT var10 = new CompoundNBT();
         var8.writeUnlessPassenger(var10);
         BlockPos var11;
         if (!(var8 instanceof PaintingEntity)) {
            var11 = new BlockPos(var9);
         } else {
            var11 = ((PaintingEntity)var8).method4085().method8338(var2);
         }

         this.field40546.add(new Class9559(var9, var11, var10.method79()));
      }
   }

   public List<Class8266> method32893(BlockPos var1, Class9463 var2, Block var3) {
      return this.method32894(var1, var2, var3, true);
   }

   public List<Class8266> method32894(BlockPos var1, Class9463 var2, Block var3, boolean var4) {
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
            && this.field40547.getX() >= 1
            && this.field40547.getY() >= 1
            && this.field40547.getZ() >= 1) {
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
                  FluidState var22 = !var4.method36445() ? null : var1.getFluidState(var21);
                  BlockState var23 = var20.field35531.method23396(var4.method36436()).method23395(var4.method36437());
                  if (var20.field35532 != null) {
                     TileEntity var24 = var1.getTileEntity(var21);
                     IClearable.method3802(var24);
                     var1.setBlockState(var21, Blocks.field36765.method11579(), 20);
                  }

                  if (var1.setBlockState(var21, var23, var6)) {
                     var13 = Math.min(var13, var21.getX());
                     var14 = Math.min(var14, var21.getY());
                     var15 = Math.min(var15, var21.getZ());
                     var16 = Math.max(var16, var21.getX());
                     var17 = Math.max(var17, var21.getY());
                     var18 = Math.max(var18, var21.getZ());
                     var12.add(Pair.of(var21, var20.field35532));
                     if (var20.field35532 != null) {
                        TileEntity var39 = var1.getTileEntity(var21);
                        if (var39 != null) {
                           var20.field35532.putInt("x", var21.getX());
                           var20.field35532.putInt("y", var21.getY());
                           var20.field35532.putInt("z", var21.getZ());
                           if (var39 instanceof Class939) {
                              var20.field35532.method103("LootTableSeed", var5.nextLong());
                           }

                           var39.method3645(var20.field35531, var20.field35532);
                           var39.method3785(var4.method36436());
                           var39.method3784(var4.method36437());
                        }
                     }

                     if (var22 != null && var23.getBlock() instanceof Class3449) {
                        ((Class3449)var23.getBlock()).method11532(var1, var21, var23, var22);
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
                  FluidState var40 = var1.getFluidState(var33);

                  for (int var25 = 0; var25 < var29.length && !var40.method23473(); var25++) {
                     BlockPos var26 = var36.method8349(var29[var25]);
                     FluidState var27 = var1.getFluidState(var26);
                     if (var27.method23475(var1, var26) > var40.method23475(var1, var36) || var27.method23473() && !var40.method23473()) {
                        var40 = var27;
                        var36 = var26;
                     }
                  }

                  if (var40.method23473()) {
                     BlockState var44 = var1.getBlockState(var33);
                     Block var47 = var44.getBlock();
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
                     var31.method26718(var49.getX() - var34, var49.getY() - var37, var49.getZ() - var41, true, true);
                  }

                  method32900(var1, var6, var31, var34, var37, var41);
               }

               for (Pair var35 : var12) {
                  BlockPos var38 = (BlockPos)var35.getFirst();
                  if (!var4.method36442()) {
                     BlockState var42 = var1.getBlockState(var38);
                     BlockState var46 = Block.method11542(var42, var1, var38);
                     if (var42 != var46) {
                        var1.setBlockState(var38, var46, var6 & -2 | 16);
                     }

                     var1.func_230547_a_(var38, var46.getBlock());
                  }

                  if (var35.getSecond() != null) {
                     TileEntity var43 = var1.getTileEntity(var38);
                     if (var43 != null) {
                        var43.markDirty();
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
         BlockState var13 = var0.getBlockState(var11);
         BlockState var14 = var0.getBlockState(var12);
         BlockState var15 = var13.method23439(var5x, var14, var0, var11, var12);
         if (var13 != var15) {
            var0.setBlockState(var11, var15, var1 & -2);
         }

         BlockState var16 = var14.method23439(var5x.method536(), var15, var0, var12, var11);
         if (var14 != var16) {
            var0.setBlockState(var12, var16, var1 & -2);
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
            CompoundNBT var13 = var11.field44529.method79();
            Vector3d var14 = method32906(var11.field44527, var3, var4, var5);
            Vector3d var15 = var14.add((double)var2.getX(), (double)var2.getY(), (double)var2.getZ());
            ListNBT var16 = new ListNBT();
            var16.add(Class34.method93(var15.x));
            var16.add(Class34.method93(var15.y));
            var16.add(Class34.method93(var15.z));
            var13.put("Pos", var16);
            var13.method133("UUID");
            method32903(var1, var13).ifPresent(var6x -> {
               float var9 = var6x.getMirroredYaw(var3);
               var9 += var6x.rotationYaw - var6x.getRotatedYaw(var4);
               var6x.setLocationAndAngles(var15.x, var15.y, var15.z, var9, var6x.rotationPitch);
               if (var7 && var6x instanceof MobEntity) {
                  ((MobEntity)var6x).method4276(var1, var1.method6807(new BlockPos(var15)), Class2202.field14394, (Class5093)null, var13);
               }

               var1.method6995(var6x);
            });
         }
      }
   }

   private static Optional<Entity> method32903(Class1659 var0, CompoundNBT var1) {
      try {
         return EntityType.method33217(var1, var0.method6970());
      } catch (Exception var5) {
         return Optional.<Entity>empty();
      }
   }

   public BlockPos method32904(Class80 var1) {
      switch (Class9051.field41436[var1.ordinal()]) {
         case 1:
         case 2:
            return new BlockPos(this.field40547.getZ(), this.field40547.getY(), this.field40547.getX());
         default:
            return this.field40547;
      }
   }

   public static BlockPos method32905(BlockPos var0, Class2089 var1, Class80 var2, BlockPos var3) {
      int var6 = var0.getX();
      int var7 = var0.getY();
      int var8 = var0.getZ();
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

      int var10 = var3.getX();
      int var11 = var3.getZ();
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
      double var6 = var0.x;
      double var8 = var0.y;
      double var10 = var0.z;
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

      int var13 = var3.getX();
      int var14 = var3.getZ();
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
      return method32908(var1, var2, var3, this.method32886().getX(), this.method32886().getZ());
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
      int var8 = var3.getX();
      int var9 = var3.getZ();
      int var10 = var7.getX() - 1;
      int var11 = var7.getY() - 1;
      int var12 = var7.getZ() - 1;
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

      var13.method38393(var1.getX(), var1.getY(), var1.getZ());
      return var13;
   }

   private void method32911(Class80 var1, int var2, int var3, Class9764 var4, Direction var5, Direction var6) {
      BlockPos var9 = BlockPos.ZERO;
      if (var1 == Class80.field186 || var1 == Class80.field188) {
         var9 = var9.method8350(var1.method252(var5), var3);
      } else if (var1 != Class80.field187) {
         var9 = var9.method8350(var5, var2);
      } else {
         var9 = var9.method8350(var6, var2);
      }

      var4.method38393(var9.getX(), 0, var9.getZ());
   }

   public CompoundNBT method32912(CompoundNBT var1) {
      if (!this.field40545.isEmpty()) {
         List<Class2354> var4 = Lists.newArrayList();
         Class2354 var5 = new Class2354();
         var4.add(var5);

         for (int var6 = 1; var6 < this.field40545.size(); var6++) {
            var4.add(new Class2354());
         }

         ListNBT var16 = new ListNBT();
         List var7 = this.field40545.get(0).method22980();

         for (int var8 = 0; var8 < var7.size(); var8++) {
            Class8266 var9 = (Class8266)var7.get(var8);
            CompoundNBT var10 = new CompoundNBT();
            var10.put("pos", this.method32915(var9.field35530.getX(), var9.field35530.getY(), var9.field35530.getZ()));
            int var11 = var5.method9281(var9.field35531);
            var10.putInt("state", var11);
            if (var9.field35532 != null) {
               var10.put("nbt", var9.field35532);
            }

            var16.add(var10);

            for (int var12 = 1; var12 < this.field40545.size(); var12++) {
               Class2354 var13 = (Class2354)var4.get(var12);
               var13.method9283(this.field40545.get(var12).method22980().get(var8).field35531, var11);
            }
         }

         var1.put("blocks", var16);
         if (var4.size() != 1) {
            ListNBT var19 = new ListNBT();

            for (Class2354 var23 : var4) {
               ListNBT var25 = new ListNBT();

               for (BlockState var27 : var23) {
                  var25.add(Class8354.method29287(var27));
               }

               var19.add(var25);
            }

            var1.put("palettes", var19);
         } else {
            ListNBT var20 = new ListNBT();

            for (BlockState var24 : var5) {
               var20.add(Class8354.method29287(var24));
            }

            var1.put("palette", var20);
         }
      } else {
         var1.put("blocks", new ListNBT());
         var1.put("palette", new ListNBT());
      }

      ListNBT var14 = new ListNBT();

      for (Class9559 var17 : this.field40546) {
         CompoundNBT var18 = new CompoundNBT();
         var18.put("pos", this.method32916(var17.field44527.x, var17.field44527.y, var17.field44527.z));
         var18.put("blockPos", this.method32915(var17.field44528.getX(), var17.field44528.getY(), var17.field44528.getZ()));
         if (var17.field44529 != null) {
            var18.put("nbt", var17.field44529);
         }

         var14.add(var18);
      }

      var1.put("entities", var14);
      var1.put("size", this.method32915(this.field40547.getX(), this.field40547.getY(), this.field40547.getZ()));
      var1.putInt("DataVersion", SharedConstants.getVersion().getWorldVersion());
      return var1;
   }

   public void method32913(CompoundNBT var1) {
      this.field40545.clear();
      this.field40546.clear();
      ListNBT var4 = var1.method131("size", 3);
      this.field40547 = new BlockPos(var4.method156(0), var4.method156(1), var4.method156(2));
      ListNBT var5 = var1.method131("blocks", 10);
      if (!var1.contains("palettes", 9)) {
         this.method32914(var1.method131("palette", 10), var5);
      } else {
         ListNBT var6 = var1.method131("palettes", 9);

         for (int var7 = 0; var7 < var6.size(); var7++) {
            this.method32914(var6.method154(var7), var5);
         }
      }

      ListNBT var14 = var1.method131("entities", 10);

      for (int var15 = 0; var15 < var14.size(); var15++) {
         CompoundNBT var8 = var14.method153(var15);
         ListNBT var9 = var8.method131("pos", 6);
         Vector3d var10 = new Vector3d(var9.method158(0), var9.method158(1), var9.method158(2));
         ListNBT var11 = var8.method131("blockPos", 3);
         BlockPos var12 = new BlockPos(var11.method156(0), var11.method156(1), var11.method156(2));
         if (var8.contains("nbt")) {
            CompoundNBT var13 = var8.getCompound("nbt");
            this.field40546.add(new Class9559(var10, var12, var13));
         }
      }
   }

   private void method32914(ListNBT var1, ListNBT var2) {
      Class2354 var5 = new Class2354();

      for (int var6 = 0; var6 < var1.size(); var6++) {
         var5.method9283(Class8354.method29285(var1.method153(var6)), var6);
      }

      ArrayList var16 = Lists.newArrayList();
      ArrayList var7 = Lists.newArrayList();
      ArrayList var8 = Lists.newArrayList();

      for (int var9 = 0; var9 < var2.size(); var9++) {
         CompoundNBT var10 = var2.method153(var9);
         ListNBT var11 = var10.method131("pos", 3);
         BlockPos var12 = new BlockPos(var11.method156(0), var11.method156(1), var11.method156(2));
         BlockState var13 = var5.method9282(var10.getInt("state"));
         CompoundNBT var14;
         if (!var10.contains("nbt")) {
            var14 = null;
         } else {
            var14 = var10.getCompound("nbt");
         }

         Class8266 var15 = new Class8266(var12, var13, var14);
         method32890(var15, var16, var7, var8);
      }

      List var17 = method32891(var16, var7, var8);
      this.field40545.add(new Class7285(var17));
   }

   private ListNBT method32915(int... var1) {
      ListNBT var4 = new ListNBT();

      for (int var8 : var1) {
         var4.add(Class36.method95(var8));
      }

      return var4;
   }

   private ListNBT method32916(double... var1) {
      ListNBT var4 = new ListNBT();

      for (double var8 : var1) {
         var4.add(Class34.method93(var8));
      }

      return var4;
   }
}
