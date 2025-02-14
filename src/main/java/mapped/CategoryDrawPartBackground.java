package mapped;

import com.mentalfrostbyte.jello.module.impl.gui.classic.TabGUI;
import org.newdawn.slick.TrueTypeFont;
import com.mentalfrostbyte.jello.unmapped.ResourceList;
import com.mentalfrostbyte.jello.util.render.animation.Animation;
import com.mentalfrostbyte.jello.util.render.animation.MathHelper;

public class CategoryDrawPartBackground {
   public final TrueTypeFont fontRenderer;
   public final int field32395;
   private boolean expanded = false;
   public Animation field32398 = new Animation(300, 300);

   public CategoryDrawPartBackground(int var1) {
      this.fontRenderer = ResourceList.bold16;
      this.field32395 = var1;
   }

   public int getWidth() {
      return 106;
   }

   public int getStartX() {
      return TabGUI.method15961(this.field32395);
   }

   public int getStartY() {
      return 30;
   }

   public void expand() {
      this.expanded = true;
      this.field32398.changeDirection(Animation.Direction.BACKWARDS);
   }

   public boolean isExpanded() {
      return this.expanded;
   }

   public boolean method24724() {
      return this.expanded && this.field32398.calcPercent() == 0.0F;
   }

   public int method24725() {
      return 100;
   }

   public void method24726(float partialTicks) {
      float var4 = MathHelper.calculateTransition(this.field32398.calcPercent(), 0.0F, 1.0F, 1.0F);
      if (this.field32398.getDirection() == Animation.Direction.BACKWARDS) {
         var4 = MathHelper.calculateBackwardTransition(this.field32398.calcPercent(), 0.0F, 1.0F, 1.0F);
      }

      RenderUtil.startScissor((float)this.getStartX(), (float)this.getStartY(), (float)this.getWidth() * var4, (float)this.method24725());
      this.method24718(partialTicks);
      RenderUtil.endScissor();
   }

   public void method24718(float partialTicks) {
   }
}
