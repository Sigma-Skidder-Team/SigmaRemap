package remapped;

import java.util.ArrayList;
import java.util.Collections;

public class class_6306 {
   private static String[] field_32227;
   private class_4714 field_32229;
   private class_4714 field_32225;
   private ArrayList<class_4714> field_32224 = new ArrayList<class_4714>();
   private ArrayList<class_4967> field_32231 = new ArrayList<class_4967>();
   private ArrayList<class_4967> field_32233 = new ArrayList<class_4967>();
   private double field_32232 = 9.0;
   private boolean field_32226 = true;
   private static MinecraftClient field_32228 = MinecraftClient.getInstance();
   private static class_4714[] field_32230 = new class_4714[]{
      new class_4714(1.0, 0.0, 0.0), new class_4714(-1.0, 0.0, 0.0), new class_4714(0.0, 0.0, 1.0), new class_4714(0.0, 0.0, -1.0)
   };

   public class_6306(class_4714 var1, class_4714 var2) {
      this.field_32229 = var1.method_21797(0.0, 0.0, 0.0).method_21798();
      this.field_32225 = var2.method_21797(0.0, 0.0, 0.0).method_21798();
   }

   public ArrayList<class_4714> method_28763() {
      return this.field_32224;
   }

   public void method_28764() {
      this.method_28765(1000, 4);
   }

   public void method_28765(int var1, int var2) {
      this.field_32224.clear();
      this.field_32233.clear();
      ArrayList var5 = new ArrayList();
      var5.add(this.field_32229);
      this.field_32233.add(new class_4967(this.field_32229, null, var5, this.field_32229.method_21795(this.field_32225), 0.0, 0.0));

      label72:
      for (int var6 = 0; var6 < var1; var6++) {
         Collections.sort(this.field_32233, new class_7402(this));
         int var7 = 0;
         if (this.field_32233.size() == 0) {
            break;
         }

         for (class_4967 var9 : new ArrayList<class_4967>(this.field_32233)) {
            if (++var7 <= var2) {
               this.field_32233.remove(var9);
               this.field_32231.add(var9);

               for (class_4714 var13 : field_32230) {
                  class_4714 var14 = var9.method_22821().method_21802(var13).method_21798();
                  if (method_28767(var14, false) && this.method_28762(var9, var14, 0.0)) {
                     break label72;
                  }
               }

               class_4714 var15 = var9.method_22821().method_21797(0.0, 1.0, 0.0).method_21798();
               if (method_28767(var15, false) && this.method_28762(var9, var15, 0.0)) {
                  break label72;
               }

               class_4714 var16 = var9.method_22821().method_21797(0.0, -1.0, 0.0).method_21798();
               if (method_28767(var16, false) && this.method_28762(var9, var16, 0.0)) {
                  break label72;
               }
               continue;
            }
         }
      }

      if (this.field_32226) {
         Collections.sort(this.field_32231, new class_7402(this));
         this.field_32224 = this.field_32231.get(0).method_22819();
      }
   }

   public static ArrayList<class_4714> method_28770(class_4714 var0, class_4714 var1) {
      class_6306 var4 = new class_6306(var0, var1);
      var4.method_28764();
      byte var5 = 5;
      int var6 = 0;
      class_4714 var7 = null;
      class_4714 var8 = null;
      ArrayList var9 = new ArrayList();
      ArrayList var10 = var4.method_28763();

      for (class_4714 var12 : var10) {
         if (var6 != 0 && var6 != var10.size() - 1) {
            boolean var13 = true;
            if (!(var12.method_21795(var8) > (double)(var5 * var5))) {
               double var14 = Math.min(var8.method_21803(), var12.method_21803());
               double var16 = Math.min(var8.method_21801(), var12.method_21801());
               double var18 = Math.min(var8.method_21799(), var12.method_21799());
               double var20 = Math.max(var8.method_21803(), var12.method_21803());
               double var22 = Math.max(var8.method_21801(), var12.method_21801());
               double var24 = Math.max(var8.method_21799(), var12.method_21799());

               label62:
               for (int var26 = (int)var14; (double)var26 <= var20; var26++) {
                  for (int var27 = (int)var16; (double)var27 <= var22; var27++) {
                     for (int var28 = (int)var18; (double)var28 <= var24; var28++) {
                        if (!method_28766(var26, var27, var28, false)) {
                           var13 = false;
                           break label62;
                        }
                     }
                  }
               }
            } else {
               var13 = false;
            }

            if (!var13) {
               var9.add(var7.method_21797(0.5, 0.0, 0.5));
               var8 = var7;
            }
         } else {
            if (var7 != null) {
               var9.add(var7.method_21797(0.5, 0.0, 0.5));
            }

            var9.add(var12.method_21797(0.5, 0.0, 0.5));
            var8 = var12;
         }

         var7 = var12;
         var6++;
      }

      return var9;
   }

   public static boolean method_28767(class_4714 var0, boolean var1) {
      return method_28766((int)var0.method_21803(), (int)var0.method_21801(), (int)var0.method_21799(), var1);
   }

   public static boolean method_28766(int var0, int var1, int var2, boolean var3) {
      class_4092 var6 = field_32228.thePlayer.method_37243() != null
         ? field_32228.thePlayer.method_37243().method_37241()
         : field_32228.thePlayer.method_37241();
      class_4092 var7 = new class_4092(
         (double)((float)var0 + 0.5F) - var6.method_18910() / 2.0,
         (double)var1,
         (double)((float)var2 + 0.5F) - var6.method_18921() / 2.0,
         (double)((float)var0 + 0.5F) + var6.method_18910() / 2.0,
         (double)var1 + var6.method_18901(),
         (double)((float)var2 + 0.5F) + var6.method_18921() / 2.0
      );
      return field_32228.theWorld.method_6680(field_32228.thePlayer, var7).count() == 0L;
   }

   public class_4967 method_28769(class_4714 var1) {
      for (class_4967 var5 : this.field_32231) {
         if (var5.method_22821().method_21803() == var1.method_21803()
            && var5.method_22821().method_21801() == var1.method_21801()
            && var5.method_22821().method_21799() == var1.method_21799()) {
            return var5;
         }
      }

      for (class_4967 var7 : this.field_32233) {
         if (var7.method_22821().method_21803() == var1.method_21803()
            && var7.method_22821().method_21801() == var1.method_21801()
            && var7.method_22821().method_21799() == var1.method_21799()) {
            return var7;
         }
      }

      return null;
   }

   public boolean method_28762(class_4967 var1, class_4714 var2, double var3) {
      class_4967 var7 = this.method_28769(var2);
      double var8 = var3;
      if (var1 != null) {
         var8 = var3 + var1.method_22812();
      }

      if (var7 != null) {
         if (var7.method_22820() > var3) {
            ArrayList var11 = new ArrayList<class_4714>(var1.method_22819());
            var11.add(var2);
            var7.method_22817(var2);
            var7.method_22818(var1);
            var7.method_22822(var11);
            var7.method_22824(var2.method_21795(this.field_32225));
            var7.method_22816(var3);
            var7.method_22823(var8);
         }
      } else {
         if (var2.method_21803() == this.field_32225.method_21803()
               && var2.method_21801() == this.field_32225.method_21801()
               && var2.method_21799() == this.field_32225.method_21799()
            || this.field_32232 != 0.0 && var2.method_21795(this.field_32225) <= this.field_32232) {
            this.field_32224.clear();
            this.field_32224 = var1.method_22819();
            this.field_32224.add(var2);
            return true;
         }

         ArrayList var10 = new ArrayList<class_4714>(var1.method_22819());
         var10.add(var2);
         this.field_32233.add(new class_4967(var2, var1, var10, var2.method_21795(this.field_32225), var3, var8));
      }

      return false;
   }
}
