package mapped;

import com.mentalfrostbyte.jello.resource.ClientResource;
import com.mentalfrostbyte.jello.resource.ResourceRegistry;
import com.mentalfrostbyte.jello.unmapped.IconPanel;
import com.mentalfrostbyte.jello.util.MultiUtilities;
import com.mentalfrostbyte.jello.util.animation.Animation;
import com.mentalfrostbyte.jello.util.animation.Direction;
import com.mentalfrostbyte.jello.util.animation.MathHelper;
import org.lwjgl.opengl.GL11;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Class4363 extends Class4247 {
   public static final ColorHelper field21325 = new ColorHelper(1250067, -15329770).method19410(ClientColors.DEEP_TEAL.getColor).method19414(Class2218.field14492);
   public List<String> values;
   public int field21327 = 0;
   public boolean field21328;
   public boolean field21329;
   private Animation field21330 = new Animation(220, 220);
   private Map<Integer, Class4362> field21331 = new HashMap<Integer, Class4362>();

   public Class4363(IconPanel var1, String var2, int var3, int var4, int var5, int var6, List<String> var7, int var8) {
      super(var1, var2, var3, var4, var5, var6, field21325, false);
      this.values = var7;
      this.field21327 = var8;
      this.method13646();
   }

   public Class4363(IconPanel var1, String var2, int var3, int var4, int var5, int var6, List<String> var7, int var8, ColorHelper var9) {
      super(var1, var2, var3, var4, var5, var6, var9, false);
      this.values = var7;
      this.field21327 = var8;
      this.method13646();
   }

   public Class4363(IconPanel var1, String var2, int var3, int var4, int var5, int var6, List<String> var7, int var8, ColorHelper var9, String var10) {
      super(var1, var2, var3, var4, var5, var6, var9, var10, false);
      this.values = var7;
      this.field21327 = var8;
      this.method13646();
   }

   public Class4363(
           IconPanel var1, String var2, int var3, int var4, int var5, int var6, List<String> var7, int var8, ColorHelper var9, String var10, ClientResource var11
   ) {
      super(var1, var2, var3, var4, var5, var6, var9, var10, var11, false);
      this.values = var7;
      this.field21327 = var8;
      this.method13646();
   }

   public void method13643(List<String> var1, int var2) {
      Class4362 var5 = new Class4362(this, "sub" + var2, this.widthA + 10, this.getHeightA() * (var2 + 1), 200, this.getHeightA(), var1, 0);
      this.field21331.put(var2, var5);
      var5.setEnabled(false);
      var5.method13036(var2x -> {
         this.method13656(var2);
         this.method13658(false);
         this.method13037();
      });
      this.addToList(var5);
   }

   public int method13644(int var1) {
      Class4362 var4 = this.method13645(var1);
      return var4 == null ? 0 : var4.field21324;
   }

   public Class4362 method13645(int var1) {
      for (Entry var5 : this.field21331.entrySet()) {
         if ((Integer)var5.getKey() == var1) {
            return (Class4362)var5.getValue();
         }
      }

      return null;
   }

   private void method13646() {
      this.method13241().clear();
      this.font = ResourceRegistry.JelloLightFont18;
      ButtonPanel dropdownButton;
      this.addToList(dropdownButton = new ButtonPanel(this, "dropdownButton", 0, 0, this.getHeightA(), this.getHeightA(), this.textColor));
      dropdownButton.setSize((var1, var2) -> {
         var1.setXA(0);
         var1.setYA(0);
         var1.setWidthA(this.getWidthA());
         var1.setHeightA(this.getHeightA());
      });
      dropdownButton.doThis((var1, var2) -> this.method13658(!this.method13657()));

      for (String mode : this.values) {
         ButtonPanel buttonPanel;
         this.addToList(
            buttonPanel = new ButtonPanel(
               this,
               mode,
               0,
               this.getHeightA(),
               this.getWidthA(),
               this.getHeightA(),
               new ColorHelper(
                  ClientColors.LIGHT_GREYISH_BLUE.getColor,
                  -1381654,
                  this.textColor.method19405(),
                  this.textColor.method19405(),
                  Class2218.field14488,
                  Class2218.field14492
               ),
               mode,
               this.getFont()
            )
         );
         buttonPanel.method13034(10);
         buttonPanel.doThis((var2, var3x) -> {
            int var6x = this.method13655();
            this.method13656(this.values.indexOf(mode));
            this.method13658(false);
            if (var6x != this.method13655()) {
               this.method13037();
            }
         });
      }

      this.field21330.changeDirection(Direction.BACKWARDS);
      this.method13246(new Class7262(1));
   }

   private int method13647() {
      int var3 = this.method13648();

      for (Entry var5 : this.field21331.entrySet()) {
         if (((Class4362)var5.getValue()).method13287()) {
            var3 = Math.max(
               var3,
               (((Class4362)var5.getValue()).field21323.size() - 1) * ((Class4362)var5.getValue()).getHeightA() + ((Class4362)var5.getValue()).getYA()
            );
         }
      }

      return var3;
   }

   private int method13648() {
      float var3 = MathHelper.calculateTransition(this.field21330.calcPercent(), 0.0F, 1.0F, 1.0F);
      if (this.field21330.getDirection() != Direction.FORWARDS) {
         var3 = QuadraticEasing.easeInQuad(this.field21330.calcPercent(), 0.0F, 1.0F, 1.0F);
      }

      return (int)((float)(this.getHeightA() * this.values.size() + 1) * var3);
   }

   public int method13649() {
      return (int)((float)(this.getHeightA() * this.values.size() + 1));
   }

   private int method13650() {
      int var3 = 0;

      for (Entry var5 : this.field21331.entrySet()) {
         if (((Class4362)var5.getValue()).method13287()) {
            var3 = Math.max(var3, ((Class4362)var5.getValue()).getWidthA() + ((Class4362)var5.getValue()).getXA() - this.getWidthA());
         }
      }

      return var3;
   }

   @Override
   public void method13028(int var1, int var2) {
      super.method13028(var1, var2);
      if (!this.method13114(var1, var2) && this.field21330.getDirection() == Direction.FORWARDS) {
         this.method13658(false);
      }

      int var5 = (var2 - this.method13272()) / this.getHeightA() - 1;
      if (var5 >= 0
         && var5 < this.values.size()
         && this.field21330.getDirection() == Direction.FORWARDS
         && this.field21330.calcPercent() == 1.0F
         && var1 - this.method13271() < this.getWidthA()) {
         for (Entry var9 : this.field21331.entrySet()) {
            ((Class4362)var9.getValue()).setEnabled((Integer)var9.getKey() == var5);
         }
      } else if (!this.method13114(var1, var2) || this.field21330.getDirection() == Direction.BACKWARDS) {
         for (Entry var7 : this.field21331.entrySet()) {
            ((Class4362)var7.getValue()).setEnabled(false);
         }
      }
   }

   @Override
   public void draw(float var1) {
      RenderUtil.drawRect(
         (float)this.getXA(),
         (float)this.getYA(),
         (float)(this.getXA() + this.getWidthA()),
         (float)(this.getYA() + this.getHeightA()),
         MultiUtilities.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.getColor, var1 * this.field21330.calcPercent())
      );
      RenderUtil.drawRoundedRect(
         (float)this.getXA(),
         (float)this.getYA(),
         (float)this.getWidthA(),
         (float)(this.getHeightA() + this.method13648() - 1),
         6.0F,
         var1 * 0.1F * this.field21330.calcPercent()
      );
      RenderUtil.drawRoundedRect(
         (float)this.getXA(),
         (float)this.getYA(),
         (float)this.getWidthA(),
         (float)(this.getHeightA() + this.method13648() - 1),
         20.0F,
         var1 * 0.2F * this.field21330.calcPercent()
      );
      if (this.getTypedText() != null) {
         RenderUtil.method11415(this);
         String var4 = "";

         for (Entry var6 : this.field21331.entrySet()) {
            if (this.field21327 == (Integer)var6.getKey()) {
               var4 = " (" + ((Class4362)var6.getValue()).field21323.get(((Class4362)var6.getValue()).field21324) + ")";
            }
         }

         RenderUtil.drawString(
            this.getFont(),
            (float)(this.getXA() + 10),
            (float)(this.getYA() + (this.getHeightA() - this.getFont().method23952()) / 2 + 1),
            this.getTypedText() + var4,
            MultiUtilities.applyAlpha(this.textColor.method19405(), var1 * 0.7F)
         );
         RenderUtil.endScissor();
      }

      boolean var8 = this.field21330.calcPercent() < 1.0F;
      if (var8) {
         RenderUtil.drawPortalBackground(
            this.method13271(), this.method13272(), this.method13271() + this.getWidthA() + 140, this.method13272() + this.getHeightA() + this.method13647()
         );
      }

      GL11.glPushMatrix();
      if (this.field21330.calcPercent() > 0.0F) {
         super.draw(var1);
      }

      GL11.glPopMatrix();
      if (var8) {
         RenderUtil.endScissor();
      }

      int var9 = this.getWidthA() - (int)((float)this.getHeightA() / 2.0F + 0.5F);
      int var10 = (int)((float)this.getHeightA() / 2.0F + 0.5F) + 1;
      int var7 = (int)((float)this.getHeightA() / 6.0F + 0.5F);
      GL11.glTranslatef((float)(this.getXA() + var9), (float)(this.getYA() + var10), 0.0F);
      GL11.glRotatef(90.0F * this.field21330.calcPercent(), 0.0F, 0.0F, 1.0F);
      GL11.glTranslatef((float)(-this.getXA() - var9), (float)(-this.getYA() - var10), 0.0F);
      RenderUtil.drawString(
         this.font,
         (float)(this.getXA() + var9 - 6),
         (float)(this.getYA() + var10 - 14),
         ">",
         MultiUtilities.applyAlpha(this.textColor.method19405(), var1 * 0.7F * (!this.method13114(this.method13309(), this.method13310()) ? 0.5F : 1.0F))
      );
   }

   public List<String> method13651() {
      return this.values;
   }

   public void method13652(String var1, int var2) {
      this.method13651().add(var2, var1);
      this.method13646();
   }

   public void method13653(String var1) {
      this.method13652(var1, this.values.size());
   }

   public <E extends Enum<E>> void method13654(Class<E> var1) {
      this.values.clear();

      for (Enum var7 : (Enum[])var1.getEnumConstants()) {
         String var8 = var7.toString().substring(0, 1).toUpperCase() + var7.toString().substring(1, var7.toString().length()).toLowerCase();
         this.method13652(var8, var7.ordinal());
      }
   }

   public int method13655() {
      return this.field21327;
   }

   public void method13656(int var1) {
      this.field21327 = var1;
   }

   public boolean method13657() {
      return this.field21328;
   }

   public void method13658(boolean var1) {
      this.field21328 = var1;
      this.field21330.changeDirection(!this.method13657() ? Direction.BACKWARDS : Direction.FORWARDS);
   }

   @Override
   public String getTypedText() {
      return this.method13651().size() <= 0 ? null : this.method13651().get(this.method13655());
   }

   @Override
   public boolean method13114(int var1, int var2) {
      for (Entry var6 : this.field21331.entrySet()) {
         if (((Class4362)var6.getValue()).method13287() && ((Class4362)var6.getValue()).method13114(var1, var2)) {
            return true;
         }
      }

      var1 -= this.method13271();
      var2 -= this.method13272();
      return var1 >= 0 && var1 <= this.getWidthA() && var2 >= 0 && var2 <= this.getHeightA() + this.method13648();
   }
}
