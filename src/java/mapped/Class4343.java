package mapped;

import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.resource.ResourceRegistry;
import com.mentalfrostbyte.jello.unmapped.Class4305;
import com.mentalfrostbyte.jello.unmapped.Class6000;
import com.mentalfrostbyte.jello.unmapped.Class6001;
import com.mentalfrostbyte.jello.unmapped.Class6002;
import com.mentalfrostbyte.jello.util.animation.Animation;
import com.mentalfrostbyte.jello.util.animation.Direction;
import org.lwjgl.opengl.GL11;

import java.util.HashMap;
import java.util.Map.Entry;

public class Class4343 extends Class4339 implements Class4342 {
   private Module field21219;
   private boolean field21220;
   private boolean field21221;
   public int field21222 = 200;
   private HashMap<Class4287, Class6001> field21223 = new HashMap<Class4287, Class6001>();
   public HashMap<Module, Class4305> field21224 = new HashMap<Module, Class4305>();
   public Animation field21225 = new Animation(114, 114);
   private String field21226 = "";
   private String field21227 = "";

   public Class4343(Class4305 var1, String var2, int var3, int var4, int var5, int var6, Module var7) {
      super(var1, var2, var3, var4, var5, var6);
      this.field21219 = var7;
      this.method13300(false);
      this.method13511();
   }

   private int method13531(Class4305 var1, Class6001 var2, int var3, int var4, int var5) {
      switch (Class8666.field39049[var2.method18618().ordinal()]) {
         case 1:
            byte var21 = 24;
            byte var29 = 24;
            Class4287 var37 = new Class4287(var1, var2.method18625() + "lbl", var3, var4, this.field21222, 24, Class4287.field20778, var2.method18625());
            Class4373 var45 = new Class4373(var1, var2.method18625() + "checkbox", var1.method13267() - 24 - var5, var4 + 6, 24, 24);
            this.field21223.put(var37, var2);
            var45.method13705((Boolean)var2.method18619(), false);
            var2.method18616(var1x -> {
               if (var45.method13703() != (Boolean)var1x.method18619()) {
                  var45.method13705((Boolean)var1x.method18619(), false);
               }
            });
            var45.method13036(var1x -> var2.method18620(((Class4373)var1x).method13703()));
            var45.method13261((var1x, var2x) -> var1x.method13264(var2x.method13267() - 24 - var5));
            var1.method13230(var37);
            var1.method13230(var45);
            var4 += 24 + var5;
            break;
         case 2:
            byte var20 = 126;
            byte var28 = 24;
            Class4287 var36 = new Class4287(var1, var2.method18625() + "lbl", var3, var4, this.field21222, 24, Class4287.field20778, var2.method18625());
            this.field21223.put(var36, var2);
            Class6009 var44 = (Class6009)var2;
            Class4277 var47 = new Class4277(var1, var2.method18625() + "slider", var1.method13267() - 126 - var5, var4 + 6, 126, 24);
            var47.method13137().method13306(ResourceRegistry.JelloLightFont14);
            var47.method13304(Float.toString((Float)var2.method18619()));
            var47.method13140(Class4277.method13134(var44.method18637(), var44.method18639(), (Float)var44.method18619()), false);
            var47.method13143(-1.0F);
            int var13 = var44.method18636();
            var44.method18616(
               var3x -> {
                  if (Class4277.method13135(var47.method13138(), var44.method18637(), var44.method18639(), var44.method18641(), var13)
                     != (Float)var3x.method18619()) {
                     var47.method13304(Float.toString((Float)var3x.method18619()));
                     var47.method13140(Class4277.method13134(var44.method18637(), var44.method18639(), (Float)var3x.method18619()), false);
                  }
               }
            );
            var47.method13036(var4x -> {
               float var7 = ((Class4277)var4x).method13138();
               float var8x = Class4277.method13135(var7, var44.method18637(), var44.method18639(), var44.method18641(), var13);
               if (var8x != (Float)var2.method18619()) {
                  var47.method13304(Float.toString(var8x));
                  var2.method18620(var8x);
               }
            });
            var47.method13261((var1x, var2x) -> var1x.method13264(var2x.method13267() - 126 - var5));
            var1.method13230(var36);
            var1.method13230(var47);
            var4 += 24 + var5;
            break;
         case 3:
            byte var19 = 114;
            byte var27 = 27;
            Class4287 var43;
            this.method13230(
               var43 = new Class4287(var1, var2.method18625() + "lbl", var3, var4, this.field21222, var27, Class4287.field20778, var2.method18625())
            );
            this.field21223.put(var43, var2);
            Class4281 var35;
            this.method13230(
               var35 = new Class4281(
                  var1,
                  var2.method18625() + "txt",
                  var1.method13267() - var5 - var19,
                  var4 + var27 / 4 - 1,
                  var19,
                  var27,
                  Class4281.field20741,
                  (String)var2.method18619()
               )
            );
            var35.method13306(ResourceRegistry.JelloLightFont18);
            var35.method13151(var1x -> var2.method18620(var1x.method13303()));
            var2.method18616(var2x -> {
               if (var35.method13303() != ((Class6011)var2).method18619()) {
                  var35.method13304(((Class6011)var2).method18619());
               }
            });
            var4 += var27 + var5;
            break;
         case 4:
            byte var18 = 123;
            byte var26 = 27;
            Class4287 var34 = new Class4287(var1, var2.method18625() + "lbl", var3, var4 + 2, this.field21222, 27, Class4287.field20778, var2.method18625());
            Class4363 var42 = new Class4363(
               var1,
               var2.method18625() + "btn",
               var1.method13267() - var5,
               var4 + 6 - 1,
               123,
               27,
               ((Class6005)var2).method18634(),
               ((Class6005)var2).method18632()
            );
            this.field21223.put(var34, var2);
            var2.method18616(var2x -> {
               if (var42.method13655() != ((Class6005)var2).method18632()) {
                  var42.method13656(((Class6005)var2).method18632());
               }
            });
            var42.method13036(var2x -> {
               ((Class6005)var2).method18633(((Class4363)var2x).method13655());
               var42.method13656(((Class6005)var2).method18632());
            });
            var42.method13261((var2x, var3x) -> var2x.method13264(var1.method13267() - 123 - var5));
            var1.method13230(var34);
            var1.method13230(var42);
            var4 += 27 + var5;
         case 5:
         default:
            break;
         case 6:
            Class4305 var17 = new Class4305(var1, var2.method18625() + "view", var3, var4, var1.method13267(), 0);
            int var25 = 0;

            for (Class6001 var41 : ((Class6007)var2).method18635()) {
               var25 = this.method13531(var17, var41, 0, var25, var5);
            }

            new Class6665().method20320(var17, var1);
            var17.method13261((var1x, var2x) -> var1x.method13268(var2x.method13267() - var5));
            var1.method13230(var17);
            var4 += var17.method13269() + var5;
            break;
         case 7:
            byte var16 = 123;
            byte var24 = 27;
            Class4287 var32 = new Class4287(var1, var2.method18625() + "lbl", var3, var4, this.field21222, 27, Class4287.field20778, var2.method18625());
            Class4377 var40 = new Class4377(
               var1, var2.method18625() + "btn", var1.method13267() - var5, var4 + 6, 123, 27, ((Class6002)var2).method18627(), (Integer)var2.method18619()
            );
            this.field21223.put(var32, var2);
            var2.method18616(var1x -> {
               if (var40.method13720() != (Integer)var1x.method18619()) {
                  var40.method13722((Integer)var1x.method18619(), false);
               }
            });
            var40.method13036(var1x -> var2.method18620(((Class4377)var1x).method13720()));
            var40.method13261((var2x, var3x) -> var2x.method13264(var1.method13267() - 123 - var5));
            var1.method13230(var32);
            var1.method13230(var40);
            var4 += 27 + var5;
            break;
         case 8:
            short var15 = 175;
            short var23 = 200;
            Class4287 var31 = new Class4287(var1, var2.method18625() + "lbl", var3, var4, this.field21222, 200, Class4287.field20778, var2.method18625());
            Class4258 var39 = new Class4258(
               var1,
               var2.method18625() + "picker",
               var1.method13267() - var5,
               var4 + 5,
               175,
               200,
               ((Class6003)var2).method18628(),
               ((Class6003)var2).method18619().<String>toArray(new String[0])
            );
            this.field21223.put(var31, var2);
            var39.method13036(var2x -> var2.method18620(var39.method13072()));
            var39.method13261((var2x, var3x) -> var2x.method13264(var1.method13267() - 175 - var5));
            var1.method13230(var31);
            var1.method13230(var39);
            var4 += 200 + var5;
            break;
         case 9:
            short var14 = 160;
            byte var22 = 114;
            Class6010 var30 = (Class6010)var2;
            Class4287 var38 = new Class4287(var1, var2.method18625() + "lbl", var3, var4, this.field21222, 24, Class4287.field20778, var2.method18625());
            Class4252 var46 = new Class4252(
               var1, var2.method18625() + "color", var1.method13267() - 160 - var5 + 10, var4, 160, 114, (Integer)var2.method18619(), var30.method18643()
            );
            this.field21223.put(var38, var2);
            var2.method18616(var3x -> {
               var46.method13048((Integer)var2.method18619());
               var46.method13046(var30.method18643());
            });
            var46.method13036(var2x -> {
               var2.method18621(((Class4252)var2x).method13049(), false);
               var30.method18644(((Class4252)var2x).method13047());
            });
            var1.method13230(var38);
            var1.method13230(var46);
            var4 += 114 + var5 - 10;
            break;
         case 10:
            short var8 = 150;
            short var9 = 150;
            Class9318 var10 = (Class9318)var2.method18619();
            Class4287 var11 = new Class4287(var1, var2.method18625() + "lbl", var3, var4, this.field21222, 24, Class4287.field20778, var2.method18625());
            Class4250 var12 = new Class4250(
               var1,
               var2.method18625() + "color",
               var1.method13267() - 150 - var5 + 10,
               var4,
               150,
               150,
               20,
               var10.field43257,
               var10.field43258,
               var10.field43259,
               var10.field43260
            );
            this.field21223.put(var11, var2);
            var2.method18616(var2x -> {
               Class9318 var5x = (Class9318)var2.method18619();
               var12.method13041(var5x.field43257, var5x.field43258, var5x.field43259, var5x.field43260);
            });
            var12.method13036(
               var2x -> ((Class6000)var2).method18612(var12.method13040()[0], var12.method13040()[1], var12.method13040()[2], var12.method13040()[3])
            );
            var1.method13230(var11);
            var1.method13230(var12);
            var4 += 150 + var5 - 10;
      }

      return var4 - (var5 - 10);
   }

   private void method13511() {
      byte var3 = 20;
      int var4 = 20;

      for (Class6001 var6 : this.field21219.method15989().values()) {
         var4 = this.method13531(this, var6, 20, var4, 20);
      }

      int var17 = var4;
      if (this.field21219 instanceof Class5325) {
         Class5325 var18 = (Class5325)this.field21219;

         for (Module var10 : var18.field23878) {
            int var11 = 0;
            Class4305 var12 = new Class4305(this, var10.method15991() + "SubView", 0, var17, this.field20897, this.field20898 - var4);
            var12.method13261((var0, var1) -> var0.method13268(var1.method13267()));

            for (Class6001 var14 : var10.method15989().values()) {
               var11 = this.method13531(var12, var14, 20, var11, 20);
            }

            var4 = Math.max(var4 + var11, var4);

            for (Class4305 var20 : var12.method13241()) {
               if (var20 instanceof Class4363) {
                  Class4363 var15 = (Class4363)var20;
                  int var16 = var15.method13649() + var15.method13265() + var15.method13269() + 14;
                  var11 = Math.max(var11, var16);
               }
            }

            var12.method13270(var11);
            this.method13230(var12);
            this.field21224.put(var10, var12);
         }

         var18.method16727((var1, var2, var3x) -> this.field21224.get(var2).method13288(var3x));
         var18.method16724();
      }

      this.method13230(new Class4305(this, "extentionhack", 0, var4, 0, 20));
   }

   @Override
   public void method13028(int var1, int var2) {
      super.method13028(var1, var2);
   }

   @Override
   public void method13027(float var1) {
      boolean var4 = false;

      for (Entry var6 : this.field21223.entrySet()) {
         Class4287 var7 = (Class4287)var6.getKey();
         Class6001 var8 = (Class6001)var6.getValue();
         if (var7.method13298() && var7.method13289()) {
            var4 = true;
            this.field21226 = var8.method18626();
            this.field21227 = var8.method18625();
            break;
         }
      }

      GL11.glPushMatrix();
      super.method13027(var1);
      GL11.glPopMatrix();
      this.field21225.changeDirection(!var4 ? Direction.BACKWARDS : Direction.FORWARDS);
      Class3192.method11439(
         ResourceRegistry.JelloLightFont14,
         (float)(this.method13263() + 10),
         (float)(this.method13265() + this.method13269() + 24),
         this.field21227,
         Class5628.method17688(Class1979.field12896.field12910, 0.5F * this.field21225.calcPercent())
      );
      Class3192.method11439(
         ResourceRegistry.JelloLightFont14,
         (float)(this.method13263() + 11),
         (float)(this.method13265() + this.method13269() + 24),
         this.field21227,
         Class5628.method17688(Class1979.field12896.field12910, 0.5F * this.field21225.calcPercent())
      );
      Class3192.method11439(
         ResourceRegistry.JelloLightFont14,
         (float)(this.method13263() + 14 + ResourceRegistry.JelloLightFont14.method23942(this.field21227) + 2),
         (float)(this.method13265() + this.method13269() + 24),
         this.field21226,
         Class5628.method17688(Class1979.field12896.field12910, 0.5F * this.field21225.calcPercent())
      );
   }

   @Override
   public boolean method13525() {
      return this.field21220;
   }

   @Override
   public void method13526() {
      this.field21220 = true;
   }

   @Override
   public boolean method13527() {
      return this.field21221;
   }

   @Override
   public void method13528(boolean var1) {
      if (var1 != this.method13527()) {
         this.method13526();
      }
   }
}
