package mapped;

import net.minecraft.nbt.CompoundNBT;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Class8817 {
   private File field39664;
   public Class2020 field39665 = null;
   private short field39666;
   private short field39667;
   private short field39668;
   private String field39669;
   private List<Class5432> field39670 = new ArrayList<Class5432>();

   public Class8817(File var1) {
      this.field39664 = var1;
   }

   public boolean method31836() {
      CompoundNBT var3 = null;

      try {
         var3 = Class8799.method31766(new FileInputStream(this.field39664));
      } catch (IOException var16) {
         var16.printStackTrace();
         return false;
      }

      this.field39666 = var3.method121("Width");
      this.field39667 = var3.method121("Height");
      this.field39668 = var3.method121("Length");

      try {
         int var4 = var3.method122("WEOriginX");
         int var5 = var3.method122("WEOriginY");
         int var6 = var3.method122("WEOriginZ");
         Class2020 var7 = new Class2020(var4, var5, var6);
         int var8 = var3.method122("WEOffsetX");
         int var9 = var3.method122("WEOffsetY");
         int var10 = var3.method122("WEOffsetZ");
         Class2020 var11 = new Class2020(var8, var9, var10);
         this.field39665 = var7.method8568(var11);
      } catch (Exception var15) {
         this.field39665 = new Class2020(0, 0, 0);
         System.out.println("Whoops, not alpha schematic?");
      }

      this.field39669 = var3.method126("Materials");
      byte[] var18 = var3.method127("Blocks");
      byte[] var19 = var3.method127("Data");
      byte[] var20 = new byte[0];
      short[] var21 = new short[var18.length];
      if (var3.contains("AddBlocks")) {
         var20 = var3.method127("AddBlocks");
      }

      for (int var22 = 0; var22 < var18.length; var22++) {
         if (var22 >> 1 >= var20.length) {
            var21[var22] = (short)(var18[var22] & 255);
         } else if ((var22 & 1) == 0) {
            var21[var22] = (short)(((var20[var22 >> 1] & 15) << 8) + (var18[var22] & 255));
         } else {
            var21[var22] = (short)(((var20[var22 >> 1] & 240) << 4) + (var18[var22] & 255));
         }
      }

      for (int var23 = 0; var23 < this.field39667; var23++) {
         for (int var24 = 0; var24 < this.field39666; var24++) {
            for (int var25 = 0; var25 < this.field39668; var25++) {
               int var26 = var23 * this.field39666 * this.field39668 + var25 * this.field39666 + var24;
               Class2021 var12 = new Class2021(var24, var23, var25);
               short var13 = var21[var26];
               byte var14 = var19[var26];
               if (var13 != 0) {
                  this.field39670.add(new Class5432(var13, var14, var12));
               }
            }
         }
      }

      return true;
   }

   public File method31837() {
      return this.field39664;
   }

   public short method31838() {
      return this.field39666;
   }

   public short method31839() {
      return this.field39667;
   }

   public short method31840() {
      return this.field39668;
   }

   public String method31841() {
      return this.field39669;
   }

   public Class2020 method31842() {
      return this.field39665;
   }

   public List<Class5432> method31843() {
      return this.field39670;
   }
}
