package mapped;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.gui.GuiManager;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.resource.ResourceRegistry;
import com.mentalfrostbyte.jello.unmapped.Class4305;
import com.mentalfrostbyte.jello.util.animation.Animation;
import com.mentalfrostbyte.jello.util.animation.Direction;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Class4358 extends Class4247 {
   public Animation field21302;
   public int field21303;
   public int field21304;
   public int field21305;
   public int field21306;
   public String field21307;
   public Class4339 field21308;
   public Class6984 field21309;
   public Texture field21310;
   public boolean field21311 = false;
   private final List<Class7875> field21312 = new ArrayList<Class7875>();

   public Class4358(Class4305 var1, String var2, int var3, int var4, int var5, int var6) {
      super(var1, var2, var3, var4, var5, var6, false);
      this.field21305 = 500;
      this.field21306 = 600;
      this.field21304 = (var5 - this.field21305) / 2;
      this.field21303 = (var6 - this.field21306) / 2;
      byte var9 = 30;
      Class4281 var10;
      this.method13230(
         var10 = new Class4281(
            this, "search", this.field21304 + var9, this.field21303 + var9 + 50, this.field21305 - var9 * 2, 60, Class4281.field20741, "", "Search..."
         )
      );
      var10.method13151(var2x -> {
         this.field21307 = var10.method13303();
         this.field21308.method13512(0);
      });
      var10.method13242();
      this.method13230(
         this.field21308 = new Class4339(
            this, "mods", this.field21304 + var9, this.field21303 + var9 + 120, this.field21305 - var9 * 2, this.field21306 - var9 * 2 - 120
         )
      );
      int var11 = 10;

      for (Entry var13 : GuiManager.field41338.entrySet()) {
         Class6984 var14 = new Class6984((Class<? extends Screen>)var13.getKey());
         Class6387 var15 = new Class6387(Class5628.method17688(ClientColors.DEEP_TEAL.getColor, 0.02F), -986896)
            .method19410(Class5628.method17688(ClientColors.DEEP_TEAL.getColor, 0.5F))
            .method19412(Class2218.field14492);
         Class4240 var16;
         this.field21308
            .method13230(
               var16 = new Class4240(this.field21308, var14.method21596(), 0, var11++ * 55, this.field21308.method13267(), 55, var15, var14.method21596())
            );
         var16.method13251((var2x, var3x) -> {
            for (Entry var7 : GuiManager.field41338.entrySet()) {
               Class6984 var8 = new Class6984((Class<? extends Screen>)var7.getKey());
               if (var8.method21596().equals(var16.method13257()) && !this.field21311) {
                  this.field21309 = var8;
                  this.field21311 = true;
                  break;
               }
            }
         });
      }

      var11 += 50;

      for (Module var19 : Client.getInstance().getModuleManager().getModuleMap().values()) {
         Class6387 var20 = new Class6387(16777215, -986896).method19410(ClientColors.DEEP_TEAL.getColor).method19412(Class2218.field14488);
         Class4240 var21;
         this.field21308
            .method13230(
               var21 = new Class4240(
                  this.field21308, var19.getName(), 0, var11++ * 40, this.field21308.method13267(), 40, var20, new Class6984(var19).method21596()
               )
            );
         var21.method13034(10);
         var21.method13251((var2x, var3x) -> {
            for (Module var7 : Client.getInstance().getModuleManager().getModuleMap().values()) {
               if (var7.getName().equals(var21.method13303()) && !this.field21311) {
                  this.field21309 = new Class6984(var7);
                  this.field21311 = true;
                  break;
               }
            }
         });
      }

      this.field21302 = new Animation(200, 120);
      this.method13300(false);
   }

   @Override
   public void method13028(int var1, int var2) {
      if (this.method13212()
         && (var1 < this.field21304 || var2 < this.field21303 || var1 > this.field21304 + this.field21305 || var2 > this.field21303 + this.field21306)) {
         this.field21311 = true;
      }

      this.field21302.changeDirection(this.field21311 ? Direction.BACKWARDS : Direction.FORWARDS);
      Map<String, Class4240> var5 = new TreeMap();
      Map<String, Class4240> var6 = new TreeMap();
      Map<String, Class4240> var7 = new TreeMap();
      List<Class4240> var8 = new ArrayList();

      for (Class4305 var10 : this.field21308.method13241()) {
         if (!(var10 instanceof Class4292)) {
            for (Class4305 var12 : var10.method13241()) {
               if (var12 instanceof Class4240) {
                  Class4240 var13 = (Class4240)var12;
                  boolean var14 = var13.method13269() != 40;
                  if (!var14 || this.field21307 != null && (this.field21307 == null || this.field21307.length() != 0)) {
                     if (!var14 && this.method13622(this.field21307, var13.method13303())) {
                        var6.put(var13.method13303(), var13);
                     } else if (!var14 && this.method13621(this.field21307, var13.method13303())) {
                        var7.put(var13.method13303(), var13);
                     } else {
                        var8.add(var13);
                     }
                  } else {
                     var5.put(var13.method13303(), var13);
                  }
               }
            }
         }
      }

      int var15 = var5.size() <= 0 ? 0 : 10;

      for (Class4240 var20 : var5.values()) {
         var20.method13288(true);
         var20.method13266(var15);
         var15 += var20.method13269();
      }

      if (var5.size() > 0) {
         var15 += 10;
      }

      for (Class4240 var21 : var6.values()) {
         var21.method13288(true);
         var21.method13266(var15);
         var15 += var21.method13269();
      }

      for (Class4240 var22 : var7.values()) {
         var22.method13288(true);
         var22.method13266(var15);
         var15 += var22.method13269();
      }

      for (Class4240 var23 : var8) {
         var23.method13288(false);
      }

      super.method13028(var1, var2);
   }

   private boolean method13621(String var1, String var2) {
      return var1 != null && var1 != "" && var2 != null ? var2.toLowerCase().contains(var1.toLowerCase()) : true;
   }

   private boolean method13622(String var1, String var2) {
      return var1 != null && var1 != "" && var2 != null ? var2.toLowerCase().startsWith(var1.toLowerCase()) : true;
   }

   @Override
   public void method13027(float var1) {
      var1 = this.field21302.calcPercent();
      float var4 = Class9747.method38214(var1, 0.0F, 1.0F, 1.0F);
      if (this.field21311) {
         var4 = Class9782.method38557(var1, 0.0F, 1.0F, 1.0F);
      }

      this.method13279(0.8F + var4 * 0.2F, 0.8F + var4 * 0.2F);
      if (var1 == 0.0F && this.field21311) {
         this.method13624(this.field21309);
      }

      RenderUtil.method11426(
         (float)this.field20895,
         (float)this.field20896,
         (float)this.field20897,
         (float)this.field20898,
         Class5628.method17688(ClientColors.DEEP_TEAL.getColor, 0.3F * var1)
      );
      super.method13224();
      RenderUtil.method11475(
         (float)this.field21304,
         (float)this.field21303,
         (float)this.field21305,
         (float)this.field21306,
         10.0F,
         Class5628.method17688(ClientColors.LIGHT_GREYISH_BLUE.getColor, var1)
      );
      byte var5 = 30;
      RenderUtil.method11439(
         ResourceRegistry.field38860,
         (float)(var5 + this.field21304),
         (float)(var5 + this.field21303),
         "Select mod to bind",
         Class5628.method17688(ClientColors.DEEP_TEAL.getColor, var1 * 0.7F)
      );
      super.method13027(var1);
   }

   public final void method13623(Class7875 var1) {
      this.field21312.add(var1);
   }

   public final void method13624(Class6984 var1) {
      for (Class7875 var5 : this.field21312) {
         var5.method26411(this, var1);
      }
   }
}
