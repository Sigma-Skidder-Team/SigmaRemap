package remapped;

import com.google.common.base.Predicate;

public class class_8528 implements Predicate<Entity> {
   private static String[] field_43642;

   public class_8528(class_3336 var1, float var2, Vector3d var3, Vector3d var4) {
      this.field_43641 = var1;
      this.field_43639 = var2;
      this.field_43640 = var3;
      this.field_43638 = var4;
   }

   public boolean apply(Entity var1) {
      Box var4 = var1.getBoundingBox().method_18928((double)this.field_43639, (double)this.field_43639, (double)this.field_43639);
      boolean var5 = var4.method_18908(this.field_43640, this.field_43638);
      return var1 != null && var1.method_37167() && var5 && !SigmaMainClass.getInstance().method_3331().method_20495(var1);
   }
}
