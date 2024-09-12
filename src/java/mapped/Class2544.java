package mapped;

import com.thizzer.jtouchbar.item.view.TouchBarButton;
import com.thizzer.jtouchbar.item.view.TouchBarView;
import com.thizzer.jtouchbar.item.view.action.TouchBarViewAction;

public class Class2544 implements TouchBarViewAction {
   private static String[] field16766;
   public final Class7957 field16767;
   public final Class4378 field16768;

   public Class2544(Class4378 var1, Class7957 var2) {
      this.field16768 = var1;
      this.field16767 = var2;
   }

   @Override
   public void onCall(TouchBarView var1) {
      this.field16767.method27058().toggle();
      ((TouchBarButton)var1).setBezelColor(this.field16768.method13740(this.field16767.method27058()));
   }
}
