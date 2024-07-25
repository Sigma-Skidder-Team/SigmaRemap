package remapped;

import com.thizzer.jtouchbar.item.view.TouchBarButton;
import com.thizzer.jtouchbar.item.view.TouchBarView;
import com.thizzer.jtouchbar.item.view.action.TouchBarViewAction;

public class class_6285 implements TouchBarViewAction {
   private static String[] field_32124;

   public class_6285(JelloTouch var1, class_3158 var2) {
      this.field_32125 = var1;
      this.field_32123 = var2;
   }

   @Override
   public void onCall(TouchBarView var1) {
      this.field_32123.method_14560().method_41999();
      ((TouchBarButton)var1).setBezelColor(this.field_32125.method_371(this.field_32123.method_14560()));
   }
}
