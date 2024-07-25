package remapped;

import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class class_9461 implements ChangeListener {
   private static String[] field_48274;

   public class_9461(class_5680 var1, class_9084 var2, JSlider var3) {
      this.field_48272 = var1;
      this.field_48273 = var2;
      this.field_48271 = var3;
   }

   @Override
   public void stateChanged(ChangeEvent var1) {
      this.field_48273.method_41847(this.field_48271.getValue());
   }
}
