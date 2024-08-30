package mapped;

import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleWithModuleSettings;
import com.mentalfrostbyte.jello.resource.ClientResource;
import com.mentalfrostbyte.jello.resource.ResourceRegistry;
import com.mentalfrostbyte.jello.unmapped.Class2314;
import com.mentalfrostbyte.jello.unmapped.Class4305;
import com.mentalfrostbyte.jello.unmapped.Setting;
import com.mentalfrostbyte.jello.unmapped.Class6002;
import com.mentalfrostbyte.jello.util.animation.Animation;
import com.mentalfrostbyte.jello.util.animation.Direction;

import java.util.HashMap;

public class Class4345 extends Class4339 {
   private Module field21229;
   public ClientResource field21230 = ClassicDecryption.regular20;
   public Animation field21231 = new Animation(150, 150);
   public HashMap<Module, Class4305> field21232 = new HashMap<Module, Class4305>();

   public Class4345(Class4305 var1, String var2, int var3, int var4, int var5, int var6, Module var7) {
      super(var1, var2, var3, var4, var5, var6);
      this.field21229 = var7;
      this.method13300(false);
      this.method13511();
   }

   private int method13555(Class4305 var1, Setting var2, int var3, int var4, int var5) {
      Class4287 var8 = new Class4287(var1, var2.getName() + "lbl", var3, var4, 0, 0, Class4287.field20778, var2.getName(), this.field21230);
      Class4248 var9 = new Class4248(var1, var2.getName() + "desc", var3 + 195, var4 + 4, 330, 18, var2);
      var1.method13230(var8);
      var1.method13230(var9);
      switch (Class9820.field45882[var2.method18618().ordinal()]) {
         case 1:
            Class4262 var26 = new Class4262(var1, var2.getName() + "checkbox", var3 + 135, var4 + 4, 40, 18);
            var26.method13094((Boolean)var2.getCurrentValue(), false);
            var2.method18616(var1x -> {
               if (var26.method13092() != (Boolean)var1x.getCurrentValue()) {
                  var26.method13094((Boolean)var1x.getCurrentValue(), false);
               }
            });
            var26.method13036(var1x -> var2.method18620(((Class4262)var1x).method13092()));
            var1.method13230(var26);
            var4 += 18 + var5;
            break;
         case 2:
            short var17 = 240;
            byte var21 = 4;
            NumberSetting var25 = (NumberSetting)var2;
            Class4370 var13 = new Class4370(var1, var2.getName() + "slider", var3, var4 + 31, 240, 4);
            var13.method13304(Float.toString((Float)var2.getCurrentValue()));
            var8.method13304(var2.getName() + ": " + Float.toString((Float)var2.getCurrentValue()));
            var13.method13699(Class4277.method13134(var25.getMin(), var25.getMax(), (Float)var25.getCurrentValue()), false);
            int var14 = var25.method18636();
            var25.method18616(
               var5x -> {
                  if (Class4370.method13694(var13.method13697(), var25.getMin(), var25.getMax(), var25.getIncrement(), var14)
                     != (Float)var5x.getCurrentValue()) {
                     var13.method13304(Float.toString((Float)var5x.getCurrentValue()));
                     var13.method13699(Class4370.method13693(var25.getMin(), var25.getMax(), (Float)var5x.getCurrentValue()), false);
                     var8.method13304(var2.getName() + ": " + Float.toString((Float)var2.getCurrentValue()));
                  }
               }
            );
            var13.method13036(var5x -> {
               float var8x = ((Class4370)var5x).method13697();
               float var9x = Class4370.method13694(var8x, var25.getMin(), var25.getMax(), var25.getIncrement(), var14);
               if (var9x != (Float)var2.getCurrentValue()) {
                  var13.method13304(Float.toString(var9x));
                  var2.method18620(var9x);
               }

               var8.method13304(var2.getName() + ": " + Float.toString((Float)var2.getCurrentValue()));
            });
            var1.method13230(var13);
            var4 += 54;
            break;
         case 3:
            int var16 = 114;
            int var20 = 27;
            Class4282 var24;
            this.method13230(
               var24 = new Class4282(
                  var1,
                  var2.getName() + "txt",
                  var3,
                  var4 + 27,
                  var16,
                  var20,
                  Class4281.field20741,
                  (String)var2.getCurrentValue(),
                  var2.getName(),
                  ResourceRegistry.field38868
               )
            );
            var24.method13306(ResourceRegistry.JelloLightFont18);
            var24.method13151(var1x -> var2.method18620(var1x.method13303()));
            var2.method18616(var2x -> {
               if (var24.method13303() != ((InputSetting)var2).getCurrentValue()) {
                  var24.method13304(((InputSetting)var2).getCurrentValue());
               }
            });
            var4 += var20 + var5;
            break;
         case 4:
            int var15 = 80;
            int var19 = 20;
            Class4366 var23 = new Class4366(
               var1, var2.getName() + "btn", var3, var4 + 27, 80, 20, ((ModeSetting)var2).method18634(), ((ModeSetting)var2).method18632()
            );
            var2.method18616(var2x -> {
               if (var23.method13671() != ((ModeSetting)var2).method18632()) {
                  var23.method13672(((ModeSetting)var2).method18632());
               }
            });
            var23.method13036(var1x -> ((ModeSetting)var2).method18633(((Class4366)var1x).method13671()));
            var1.method13230(var23);
            var4 += 65;
            break;
         case 5:
            byte var10 = 123;
            byte var11 = 27;
            Class4377 var12 = new Class4377(
               var1, var2.getName() + "btn", var1.method13267() - var5, var4 + 6, 123, 27, ((Class6002)var2).method18627(), (Integer)var2.getCurrentValue()
            );
            var2.method18616(var1x -> {
               if (var12.method13720() != (Integer)var1x.getCurrentValue()) {
                  var12.method13722((Integer)var1x.getCurrentValue(), false);
               }
            });
            var12.method13036(var1x -> var2.method18620(((Class4377)var1x).method13720()));
            var12.method13261((var2x, var3x) -> var2x.method13264(var1.method13267() - 123 - var5));
            var1.method13230(var12);
            var4 += 27 + var5;
         case 6:
         case 7:
         case 8:
      }

      return var4 - (var5 - 10);
   }

   private void method13511() {
      Class4287 var3 = new Class4287(
         this, "settingsname", 12, 2, this.field20897, 20, Class4287.field20778, this.field21229.getSuffix() + " Settings", this.field21230
      );
      this.method13230(var3);
      byte var4 = 20;
      byte var5 = 30;
      int var6 = 35;

      for (Setting var8 : this.field21229.getSettingMap().values()) {
         if (var8.method18618() != Class2314.field15860 && var8.method18618() != Class2314.field15859) {
            var6 = this.method13555(this, var8, 30, var6, 20);
         }
      }

      if (this.field21229 instanceof ModuleWithModuleSettings) {
         ModuleWithModuleSettings var16 = (ModuleWithModuleSettings)this.field21229;

         for (Module var11 : var16.moduleArray) {
            int var12 = 10;
            Class4305 var13 = new Class4305(this, var11.getName() + "SubView", 0, var6, this.field20897, this.field20898 - var6);
            var13.method13261((var0, var1) -> var0.method13268(var1.method13267()));

            for (Setting var15 : var11.getSettingMap().values()) {
               var12 = this.method13555(var13, var15, 30, var12, 20);
            }

            this.method13230(var13);
            this.field21232.put(var11, var13);
         }

         var16.method16727((var1, var2, var3x) -> this.field21232.get(var2).method13288(var3x));
         var16.method16724();
      }

      this.method13230(new Class4287(this, "lbl", 5, 200, 0, 33, Class4287.field20778, this.field20912));
   }

   public void method13556() {
      this.field21231.changeDirection(Direction.BACKWARDS);
   }

   public boolean method13557() {
      return this.field21231.getDirection() == Direction.BACKWARDS && this.field21231.calcPercent() == 0.0F;
   }

   @Override
   public void method13028(int var1, int var2) {
      super.method13028(var1, var2);
   }

   @Override
   public void draw(float var1) {
      int var4 = Math.round((float)this.method13269() * Class8056.method27664(this.field21231.calcPercent(), 0.0F, 1.0F, 1.0F));
      if (this.field21231.getDirection() == Direction.BACKWARDS) {
         var4 = Math.round((float)this.method13269() * Class8056.method27663(this.field21231.calcPercent(), 0.0F, 1.0F, 1.0F));
      }

      RenderUtil.method11419((float)this.field20895, (float)(70 + this.method13269() - var4), (float)this.method13267(), (float)var4);
      RenderUtil.method11424((float)this.field20895, (float)(70 + this.method13269() - var4), (float)this.method13267(), (float)var4, -2631721);
      super.draw(var1);
      RenderUtil.method11422();
   }
}
