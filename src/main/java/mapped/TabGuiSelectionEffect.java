package mapped;

import com.mentalfrostbyte.jello.util.render.animation.Animation;

public class TabGuiSelectionEffect {
   public boolean submenu;
   public Animation animation;

   public TabGuiSelectionEffect(boolean submenu) {
      this.animation = new Animation(250, 0);
      this.submenu = submenu;
   }
}
