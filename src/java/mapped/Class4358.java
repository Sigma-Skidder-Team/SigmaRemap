package mapped;

import com.mentalfrostbyte.Client;
import com.mentalfrostbyte.jello.gui.GuiManager;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.resource.ResourceRegistry;
import com.mentalfrostbyte.jello.unmapped.CustomGuiScreen;
import com.mentalfrostbyte.jello.util.MultiUtilities;
import com.mentalfrostbyte.jello.util.render.animation.Animation;
import com.mentalfrostbyte.jello.util.render.animation.Direction;
import com.mentalfrostbyte.jello.util.ClientColors;
import org.newdawn.slick.opengl.Texture;
import net.minecraft.client.gui.screen.Screen;

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

   public Class4358(CustomGuiScreen var1, String var2, int var3, int var4, int var5, int var6) {
      super(var1, var2, var3, var4, var5, var6, false);
      this.field21305 = 500;
      this.field21306 = 600;
      this.field21304 = (var5 - this.field21305) / 2;
      this.field21303 = (var6 - this.field21306) / 2;
      byte var9 = 30;
      UIInput var10;
      this.addToList(
            var10 = new UIInput(
                  this, "search", this.field21304 + var9, this.field21303 + var9 + 50, this.field21305 - var9 * 2, 60,
                  UIInput.field20741, "", "Search..."));
      var10.method13151(var2x -> {
         this.field21307 = var10.getTypedText();
         this.field21308.method13512(0);
      });
      var10.method13242();
      this.addToList(
            this.field21308 = new Class4339(
                  this, "mods", this.field21304 + var9, this.field21303 + var9 + 120, this.field21305 - var9 * 2,
                  this.field21306 - var9 * 2 - 120));
      int var11 = 10;

      for (Entry var13 : GuiManager.field41338.entrySet()) {
         Class6984 var14 = new Class6984((Class<? extends Screen>) var13.getKey());
         ColorHelper var15 = new ColorHelper(MultiUtilities.applyAlpha(ClientColors.DEEP_TEAL.getColor(), 0.02F),
               -986896)
               .method19410(MultiUtilities.applyAlpha(ClientColors.DEEP_TEAL.getColor(), 0.5F))
               .method19412(Class2218.field14492);
         ButtonPanel var16;
         this.field21308
               .addToList(
                     var16 = new ButtonPanel(this.field21308, var14.method21596(), 0, var11++ * 55,
                           this.field21308.getWidthA(), 55, var15, var14.method21596()));
         var16.doThis((var2x, var3x) -> {
            for (Entry var7 : GuiManager.field41338.entrySet()) {
               Class6984 var8 = new Class6984((Class<? extends Screen>) var7.getKey());
               if (var8.method21596().equals(var16.method13257()) && !this.field21311) {
                  this.field21309 = var8;
                  this.field21311 = true;
                  break;
               }
            }
         });
      }

      var11 += 50;

      for (Module var19 : Client.getInstance().moduleManager.getModuleMap().values()) {
         ColorHelper var20 = new ColorHelper(16777215, -986896).method19410(ClientColors.DEEP_TEAL.getColor())
               .method19412(Class2218.field14488);
         ButtonPanel var21;
         this.field21308
               .addToList(
                     var21 = new ButtonPanel(
                           this.field21308, var19.getName(), 0, var11++ * 40, this.field21308.getWidthA(), 40, var20,
                           new Class6984(var19).method21596()));
         var21.method13034(10);
         var21.doThis((var2x, var3x) -> {
            for (Module var7 : Client.getInstance().moduleManager.getModuleMap().values()) {
               if (var7.getName().equals(var21.getTypedText()) && !this.field21311) {
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
   public void updatePanelDimensions(int newHeight, int newWidth) {
      if (this.method13212()
            && (newHeight < this.field21304 || newWidth < this.field21303 || newHeight > this.field21304 + this.field21305
                  || newWidth > this.field21303 + this.field21306)) {
         this.field21311 = true;
      }

      this.field21302.changeDirection(this.field21311 ? Direction.BACKWARDS : Direction.FORWARDS);
      Map<String, ButtonPanel> var5 = new TreeMap();
      Map<String, ButtonPanel> var6 = new TreeMap();
      Map<String, ButtonPanel> var7 = new TreeMap();
      List<ButtonPanel> var8 = new ArrayList();

      for (CustomGuiScreen var10 : this.field21308.method13241()) {
         if (!(var10 instanceof Class4292)) {
            for (CustomGuiScreen var12 : var10.method13241()) {
               if (var12 instanceof ButtonPanel) {
                  ButtonPanel var13 = (ButtonPanel) var12;
                  boolean var14 = var13.getHeightA() != 40;
                  if (!var14 || this.field21307 != null && (this.field21307 == null || this.field21307.length() != 0)) {
                     if (!var14 && this.method13622(this.field21307, var13.getTypedText())) {
                        var6.put(var13.getTypedText(), var13);
                     } else if (!var14 && this.method13621(this.field21307, var13.getTypedText())) {
                        var7.put(var13.getTypedText(), var13);
                     } else {
                        var8.add(var13);
                     }
                  } else {
                     var5.put(var13.getTypedText(), var13);
                  }
               }
            }
         }
      }

      int var15 = var5.size() <= 0 ? 0 : 10;

      for (ButtonPanel var20 : var5.values()) {
         var20.setEnabled(true);
         var20.setYA(var15);
         var15 += var20.getHeightA();
      }

      if (var5.size() > 0) {
         var15 += 10;
      }

      for (ButtonPanel var21 : var6.values()) {
         var21.setEnabled(true);
         var21.setYA(var15);
         var15 += var21.getHeightA();
      }

      for (ButtonPanel var22 : var7.values()) {
         var22.setEnabled(true);
         var22.setYA(var15);
         var15 += var22.getHeightA();
      }

      for (ButtonPanel var23 : var8) {
         var23.setEnabled(false);
      }

      super.updatePanelDimensions(newHeight, newWidth);
   }

   private boolean method13621(String var1, String var2) {
      return var1 != null && var1 != "" && var2 != null ? var2.toLowerCase().contains(var1.toLowerCase()) : true;
   }

   private boolean method13622(String var1, String var2) {
      return var1 != null && var1 != "" && var2 != null ? var2.toLowerCase().startsWith(var1.toLowerCase()) : true;
   }

   @Override
   public void draw(float partialTicks) {
      partialTicks = this.field21302.calcPercent();
      float var4 = EasingFunctions.easeOutBack(partialTicks, 0.0F, 1.0F, 1.0F);
      if (this.field21311) {
         var4 = QuadraticEasing.easeOutQuad(partialTicks, 0.0F, 1.0F, 1.0F);
      }

      this.method13279(0.8F + var4 * 0.2F, 0.8F + var4 * 0.2F);
      if (partialTicks == 0.0F && this.field21311) {
         this.method13624(this.field21309);
      }

      RenderUtil.drawRect(
            (float) this.xA,
            (float) this.yA,
            (float) this.widthA,
            (float) this.heightA,
            MultiUtilities.applyAlpha(ClientColors.DEEP_TEAL.getColor(), 0.3F * partialTicks));
      super.method13224();
      RenderUtil.drawRect(
            (float) this.field21304,
            (float) this.field21303,
            (float) this.field21305,
            (float) this.field21306,
            10.0F,
            MultiUtilities.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.getColor(), partialTicks));
      byte var5 = 30;
      RenderUtil.drawString(
            ResourceRegistry.JelloLightFont36,
            (float) (var5 + this.field21304),
            (float) (var5 + this.field21303),
            "Select mod to bind",
            MultiUtilities.applyAlpha(ClientColors.DEEP_TEAL.getColor(), partialTicks * 0.7F));
      super.draw(partialTicks);
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
