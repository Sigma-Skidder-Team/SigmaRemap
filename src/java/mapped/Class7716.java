package mapped;

import net.minecraft.block.BlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.util.math.BlockPos;

import java.util.ArrayList;
import java.util.Collections;

public class Class7716 {
   private static String[] field33112;
   private Class9485 field33113;
   private Class9485 field33114;
   private ArrayList<Class7916> field33115 = new ArrayList<Class7916>();
   private ArrayList<Class7916> field33116 = new ArrayList<Class7916>();
   private ArrayList<Class7916> field33117 = new ArrayList<Class7916>();
   private double field33118 = 9.0;
   private boolean field33119 = true;
   private static Minecraft field33120 = Minecraft.getInstance();
   private static Class9485[] field33121 = new Class9485[]{
      new Class9485(1.0, 0.0, 0.0),
      new Class9485(-1.0, 0.0, 0.0),
      new Class9485(0.0, 0.0, 1.0),
      new Class9485(0.0, 0.0, -1.0),
      new Class9485(0.0, -1.0, 0.0),
      new Class9485(0.0, 1.0, 0.0)
   };

   public Class7716(Class9485 var1, Class9485 var2) {
      this.field33113 = var1.method36623(0.0, 0.0, 0.0).method36624();
      this.field33114 = var2.method36623(0.0, 0.0, 0.0).method36624();
   }

   public ArrayList<Class7916> method25489() {
      return this.field33115;
   }

   public void method25490() {
      this.method25491(2000, 4);
   }

   public void method25491(int var1, int var2) {
      this.field33115.clear();
      this.field33117.clear();
      ArrayList var5 = new ArrayList();
      var5.add(this.field33113);
      this.field33117.add(new Class7916(this.field33113, null, var5, this.field33113.method36626(this.field33114), Class2173.field14267, 0.0, 0.0));

      label60:
      for (int var6 = 0; var6 < var1; var6++) {
         Collections.sort(this.field33117, new Class3580(this));
         int var7 = 0;
         if (this.field33117.size() == 0) {
            break;
         }

         for (Class7916 var9 : new ArrayList<Class7916>(this.field33117)) {
            if (++var7 <= var2) {
               this.field33117.remove(var9);
               this.field33116.add(var9);

               for (Class9485 var13 : field33121) {
                  Class2173 var14 = this.method25496(var9, var13, false);
                  if (this.method25496(var9, var13, false) != Class2173.field14266
                     && this.method25501(var9, var13, var14, var14 != Class2173.field14268 ? 0.0 : 1.0)) {
                     break label60;
                  }
               }
               continue;
            }
         }
      }

      if (this.field33119) {
         Collections.sort(this.field33116, new Class3580(this));
         this.field33115 = this.method25492();
      }
   }

   public ArrayList<Class7916> method25492() {
      Collections.sort(this.field33116, new Class3580(this));
      Class7916 var3 = this.field33116.get(0);

      ArrayList var4;
      for (var4 = new ArrayList(); var3.method26547() != null; var3 = var3.method26547()) {
         var4.add(var3);
      }

      return var4;
   }

   public static ArrayList<Class7916> method25493(Class9485 var0, Class9485 var1) {
      Class7716 var4 = new Class7716(var0, var1);
      var4.method25490();
      return var4.method25489();
   }

   public boolean method25494(BlockPos var1) {
      for (Class9485 var7 : field33121) {
         BlockState var8 = field33120.world.getBlockState(var1.method8335(var7.field44096, var7.field44097, var7.field44098));
         if (var8.getBlock() == Blocks.WATER || var8.getBlock() == Blocks.LAVA) {
            return true;
         }
      }

      return false;
   }

   public boolean method25495(int var1, int var2, int var3) {
      BlockPos var6 = new BlockPos(var1, var2, var3);
      return field33120.world.getBlockState(new BlockPos(var1, var2 - 1, var3)).getBlock() != Blocks.AIR
         ? !this.method25494(var6) && !this.method25494(var6.up())
         : false;
   }

   public Class2173 method25496(Class7916 var1, Class9485 var2, boolean var3) {
      Class9485 var6 = var1.method26546().method36627(var2).method36624();
      if (method25499((int)var6.method36620(), (int)var6.method36621(), (int)var6.method36622())) {
         if (var1.method26547().method26545() == Class2173.field14267
            && this.method25495((int)var6.method36620(), (int)var6.method36621(), (int)var6.method36622())) {
            return Class2173.field14269;
         }
      } else {
         if (this.method25497(var6)) {
            return Class2173.field14267;
         }

         if (this.method25498(var1) && (var2.field44097 <= 0.0 || this.method25497(var1.method26546()))) {
            return Class2173.field14268;
         }
      }

      return Class2173.field14266;
   }

   public boolean method25497(Class9485 var1) {
      return field33120.world.getBlockState(new BlockPos((int)var1.method36620(), (int)var1.method36621() - 1, (int)var1.method36622())).getBlock()
         != Blocks.AIR;
   }

   public boolean method25498(Class7916 var1) {
      for (int var4 = 0; var4 < 2; var4++) {
         if (var1.method26547() == null || var1.method26547().method26545() == Class2173.field14267) {
            return true;
         }

         var1 = var1.method26547();
      }

      return false;
   }

   public static boolean method25499(int var0, int var1, int var2) {
      return field33120.world.getBlockState(new BlockPos(var0, var1 + 1, var2)).getBlock() != Blocks.AIR
         || field33120.world.getBlockState(new BlockPos(var0, var1, var2)).getBlock() != Blocks.AIR;
   }

   public Class7916 method25500(Class9485 var1, Class2173 var2) {
      for (Class7916 var6 : this.field33116) {
         if (var6.method26546().method36620() == var1.method36620()
            && var6.method26546().method36621() == var1.method36621()
            && var6.method26546().method36622() == var1.method36622()
            && var6.method26545() == var2) {
            return var6;
         }
      }

      for (Class7916 var8 : this.field33117) {
         if (var8.method26546().method36620() == var1.method36620()
            && var8.method26546().method36621() == var1.method36621()
            && var8.method26546().method36622() == var1.method36622()
            && var8.method26545() == var2) {
            return var8;
         }
      }

      return null;
   }

   public boolean method25501(Class7916 var1, Class9485 var2, Class2173 var3, double var4) {
      Class9485 var8 = var1.method26546().method36627(var2).method36624();
      Class7916 var9 = this.method25500(var8, var3);
      double var10 = var4;
      if (var1 != null) {
         var10 = var4 + var1.method26556();
      }

      if (var9 == null || var9.method26545() == Class2173.field14268) {
         if (var8.method36620() == this.field33114.method36620()
               && var8.method36621() == this.field33114.method36621()
               && var8.method36622() == this.field33114.method36622()
            || this.field33118 != 0.0 && var8.method36626(this.field33114) <= this.field33118) {
            return true;
         }

         ArrayList var13 = new ArrayList<Class9485>(var1.method26548());
         var13.add(var8);
         this.field33117.add(new Class7916(var8, var1, var13, var8.method36626(this.field33114), var3, var4, var10));
      } else if (var9.method26550() > var4) {
         ArrayList var12 = new ArrayList<Class9485>(var1.method26548());
         var12.add(var8);
         var9.method26551(var8);
         var9.method26552(var1);
         var9.method26553(var12);
         var9.method26554(var8.method36626(this.field33114));
         var9.method26555(var4);
         var9.method26557(var10);
      }

      return false;
   }
}
