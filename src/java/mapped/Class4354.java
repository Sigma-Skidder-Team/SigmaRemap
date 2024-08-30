package mapped;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.resource.ResourceRegistry;
import com.mentalfrostbyte.jello.unmapped.Class4305;
import com.mentalfrostbyte.jello.util.ImageUtil;
import com.mentalfrostbyte.jello.util.TextureUtil;
import com.mentalfrostbyte.jello.util.animation.Animation;
import com.mentalfrostbyte.jello.util.animation.Direction;
import net.minecraft.client.Minecraft;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Class4354 extends Class4247 {
   public Class4305 field21279;
   public String field21280;
   public Texture field21281;
   private Animation field21282 = new Animation(285, 100);
   public boolean field21283;
   public int field21284 = 240;
   public int field21285 = 0;
   private Map<String, String> field21286;
   private final List<Class9448> field21287 = new ArrayList<Class9448>();

   public Class4354(Class4305 var1, String var2, boolean var3, String var4, Class9577... var5) {
      super(var1, var2, 0, 0, Minecraft.getInstance().mainWindow.getWidth(), Minecraft.getInstance().mainWindow.getHeight(), false);
      this.field21283 = var3;
      this.field21280 = var4;
      this.method13296(false);
      this.method13292(false);
      this.method13243();
      Class4281 var8 = null;
      Class4281 var9 = null;

      for (Class9577 var13 : var5) {
         this.field21285 = this.field21285 + var13.field44773 + 10;
      }

      this.field21285 -= 10;
      this.method13230(
         this.field21279 = new Class4305(
            this, "modalContent", (this.field20897 - this.field21284) / 2, (this.field20898 - this.field21285) / 2, this.field21284, this.field21285
         )
      );
      int var17 = 0;
      int var18 = 0;

      for (Class9577 var15 : var5) {
         var17++;
         if (var15.field44771 != Class2189.field14311) {
            if (var15.field44771 != Class2189.field14312) {
               if (var15.field44771 != Class2189.field14313) {
                  if (var15.field44771 == Class2189.field14314) {
                     this.field21279
                        .method13230(
                           new Class4287(
                              this.field21279,
                              "Item" + var17,
                              0,
                              var18,
                              this.field21284,
                              var15.field44773,
                              new Class6387(
                                 ClientColors.DEEP_TEAL.getColor,
                                 ClientColors.DEEP_TEAL.getColor,
                                 ClientColors.DEEP_TEAL.getColor,
                                 ClientColors.DEEP_TEAL.getColor
                              ),
                              var15.field44772,
                              ResourceRegistry.JelloLightFont36
                           )
                        );
                  }
               } else {
                  Class4240 var16;
                  this.field21279
                     .method13230(
                        var16 = new Class4240(
                           this.field21279, "Item" + var17, 0, var18, this.field21284, var15.field44773, Class6387.field27961, var15.field44772
                        )
                     );
                  var16.field20586 = 4;
                  var16.method13251((var1x, var2x) -> this.method13601());
               }
            } else {
               Class4281 var22;
               this.field21279
                  .method13230(
                     var22 = new Class4281(
                        this.field21279, "Item" + var17, 0, var18, this.field21284, var15.field44773, Class4281.field20741, "", var15.field44772
                     )
                  );
               if (!var15.field44772.contains("Password")) {
                  if (var15.field44772.contains("Email")) {
                     var8 = var22;
                  }
               } else {
                  var9 = var22;
                  var22.method13155(true);
               }
            }
         } else {
            this.field21279
               .method13230(
                  new Class4287(
                     this.field21279,
                     "Item" + var17,
                     0,
                     var18,
                     this.field21284,
                     var15.field44773,
                     new Class6387(
                        ClientColors.MID_GREY.getColor, ClientColors.MID_GREY.getColor, ClientColors.MID_GREY.getColor, ClientColors.MID_GREY.getColor
                     ),
                     var15.field44772,
                     ResourceRegistry.JelloLightFont20
                  )
               );
         }

         var18 += var15.field44773 + 10;
      }

      if (var8 != null && var9 != null) {
         Class4281 var20 = var9;
         var8.method13151(var2x -> {
            String var5x = var2x.method13303();
            if (var5x != null && var5x.contains(":")) {
               String[] var6 = var5x.split(":");
               if (var6.length <= 2) {
                  if (var6.length > 0) {
                     var2x.method13304(var6[0].replace("\n", ""));
                     if (var6.length == 2) {
                        var20.method13304(var6[1].replace("\n", ""));
                     }
                  }
               } else {
                  this.method13601();
               }
            }
         });
      }
   }

   @Override
   public void method13296(boolean var1) {
      if (var1) {
         for (Class4305 var5 : this.field21279.method13241()) {
            if (var5 instanceof Class4281) {
               ((Class4281)var5).method13304("");
               ((Class4281)var5).method13146();
            }
         }
      }

      this.field21282.changeDirection(!var1 ? Direction.BACKWARDS : Direction.FORWARDS);
      super.method13296(var1);
   }

   public Class4305 method13598() {
      return this.field21279;
   }

   private Map<String, String> method13599() {
      HashMap var3 = new HashMap();

      for (Class4305 var5 : this.field21279.method13241()) {
         Class4278 var6 = (Class4278)var5;
         if (var6 instanceof Class4281) {
            Class4281 var7 = (Class4281)var6;
            var3.put(var7.method13153(), var7.method13303());
         }
      }

      return var3;
   }

   public Map<String, String> method13600() {
      return this.field21286;
   }

   public void method13601() {
      this.field21286 = this.method13599();
      this.method13603(false);
      this.method13037();
   }

   @Override
   public void method13089(int var1, int var2, int var3) {
      super.method13089(var1, var2, var3);
   }

   public float method13602(float var1, float var2) {
      return this.field21282.getDirection() != Direction.BACKWARDS
         ? (float)(Math.pow(2.0, (double)(-10.0F * var1)) * Math.sin((double)(var1 - var2 / 4.0F) * (Math.PI * 2) / (double)var2) + 1.0)
         : 0.5F + Class9782.method38557(var1, 0.0F, 1.0F, 1.0F) * 0.5F;
   }

   @Override
   public void draw(float var1) {
      if (this.field21282.calcPercent() != 0.0F) {
         int var4 = this.field21284 + 60;
         int var5 = this.field21285 + 60;
         byte var6 = 30;
         float var7 = !this.isHovered() ? this.field21282.calcPercent() : Math.min(this.field21282.calcPercent() / 0.25F, 1.0F);
         float var8 = this.method13602(this.field21282.calcPercent(), 1.0F);
         var4 = (int)((float)var4 * var8);
         var5 = (int)((float)var5 * var8);
         RenderUtil.method11448(
            -5.0F,
            -5.0F,
            (float)(this.method13267() + 10),
            (float)(this.method13269() + 10),
            this.field21281,
            ColorUtils.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.getColor, var7)
         );
         RenderUtil.method11426(
            0.0F, 0.0F, (float)this.method13267(), (float)this.method13269(), ColorUtils.applyAlpha(ClientColors.DEEP_TEAL.getColor, 0.1F * var7)
         );
         if (var4 > 0) {
            RenderUtil.method11465(
               (this.field20897 - var4) / 2, (this.field20898 - var5) / 2, var4, var5, ColorUtils.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.getColor, var7)
            );
         }

         super.method13279(var8, var8);
         super.method13224();
         super.draw(var7);
      } else {
         if (this.method13297()) {
            this.method13145(false);
            this.method13288(false);
            this.method13243();
         }
      }
   }

   @Override
   public boolean method13078(int var1, int var2, int var3) {
      if (!super.method13078(var1, var2, var3)) {
         int var6 = this.field21284 + 60;
         int var7 = this.field21285 + 60;
         if (var1 > (this.field20897 - var6) / 2
            && var1 < (this.field20897 - var6) / 2 + var6
            && var2 > (this.field20898 - var7) / 2
            && var2 < (this.field20898 - var7) / 2 + var7) {
            return false;
         } else {
            this.method13603(false);
            return false;
         }
      } else {
         return true;
      }
   }

   public void method13603(boolean var1) {
      if (var1 && !this.isHovered()) {
         try {
            if (this.field21281 != null) {
               this.field21281.release();
            }

            this.field21281 = TextureUtil.method32933(
               "blur", ImageUtil.method35036(0, 0, this.method13267(), this.method13269(), 5, 10, ClientColors.LIGHT_GREYISH_BLUE.getColor, true)
            );
         } catch (IOException var5) {
            Client.getInstance().getLogger().error(var5.getMessage());
         }
      }

      if (this.isHovered() != var1 && !var1) {
         this.method13605();
      }

      this.method13296(var1);
      if (var1) {
         this.method13288(true);
      }

      this.method13292(var1);
   }

   @Override
   public void finalize() throws Throwable {
      try {
         if (this.field21281 != null) {
            Client.getInstance().method19927(this.field21281);
         }
      } finally {
         super.finalize();
      }
   }

   public final void method13604(Class9448 var1) {
      this.field21287.add(var1);
   }

   public final void method13605() {
      for (Class9448 var4 : this.field21287) {
         var4.method36327(this);
      }
   }
}
