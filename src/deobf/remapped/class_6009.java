package remapped;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class class_6009 {
   private File field_30603;
   public class_4215 field_30600 = null;
   private short field_30598;
   private short field_30597;
   private short field_30596;
   private String field_30599;
   private List<class_278> field_30602 = new ArrayList<class_278>();

   public class_6009(File var1) {
      this.field_30603 = var1;
   }

   public boolean method_27431() {
      class_5734 var3 = null;

      try {
         var3 = class_5957.method_27219(new FileInputStream(this.field_30603));
      } catch (IOException var16) {
         var16.printStackTrace();
         return false;
      }

      this.field_30598 = var3.method_25956("Width");
      this.field_30597 = var3.method_25956("Height");
      this.field_30596 = var3.method_25956("Length");

      try {
         int var4 = var3.method_25947("WEOriginX");
         int var5 = var3.method_25947("WEOriginY");
         int var6 = var3.method_25947("WEOriginZ");
         class_4215 var7 = new class_4215(var4, var5, var6);
         int var8 = var3.method_25947("WEOffsetX");
         int var9 = var3.method_25947("WEOffsetY");
         int var10 = var3.method_25947("WEOffsetZ");
         class_4215 var11 = new class_4215(var8, var9, var10);
         this.field_30600 = var7.method_19598(var11);
      } catch (Exception var15) {
         this.field_30600 = new class_4215(0, 0, 0);
         System.out.println("Whoops, not alpha schematic?");
      }

      this.field_30599 = var3.method_25965("Materials");
      byte[] var18 = var3.method_25930("Blocks");
      byte[] var19 = var3.method_25930("Data");
      byte[] var20 = new byte[0];
      short[] var21 = new short[var18.length];
      if (var3.method_25938("AddBlocks")) {
         var20 = var3.method_25930("AddBlocks");
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

      for (int var23 = 0; var23 < this.field_30597; var23++) {
         for (int var24 = 0; var24 < this.field_30598; var24++) {
            for (int var25 = 0; var25 < this.field_30596; var25++) {
               int var26 = var23 * this.field_30598 * this.field_30596 + var25 * this.field_30598 + var24;
               class_8003 var12 = new class_8003(var24, var23, var25);
               short var13 = var21[var26];
               byte var14 = var19[var26];
               if (var13 != 0) {
                  this.field_30602.add(new class_278(var13, var14, var12));
               }
            }
         }
      }

      return true;
   }

   public File method_27429() {
      return this.field_30603;
   }

   public short method_27434() {
      return this.field_30598;
   }

   public short method_27428() {
      return this.field_30597;
   }

   public short method_27436() {
      return this.field_30596;
   }

   public String method_27433() {
      return this.field_30599;
   }

   public class_4215 method_27435() {
      return this.field_30600;
   }

   public List<class_278> method_27432() {
      return this.field_30602;
   }
}
