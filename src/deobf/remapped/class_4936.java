package remapped;

import java.util.ArrayList;
import java.util.List;

public class class_4936 extends class_1859 {
   private static String[] field_25583;
   private float field_25584 = 1.0F;
   private boolean field_25586 = false;
   private final List<class_849> field_25585 = new ArrayList<class_849>();

   public class_4936(class_7038 var1, String var2, int var3, int var4, int var5, int var6) {
      super(var1, var2, var3, var4, var5, var6, false);
   }

   @Override
   public void method_32178(float var1) {
      FontManager.method_94(
         (float)this.field_36270,
         (float)this.field_36261,
         (float)(this.field_36270 + this.field_36278),
         (float)this.field_36261 + (float)this.field_36257 * this.field_25584,
         class_314.method_1444(class_1255.field_6929.field_6917, 0.2F)
      );
      FontManager.method_94(
         (float)this.field_36270,
         (float)(this.field_36261 + this.field_36257),
         (float)(this.field_36270 + this.field_36278),
         (float)this.field_36261 + (float)this.field_36257 * this.field_25584,
         class_314.method_1444(class_1255.field_6918.field_6917, 0.2F)
      );
      super.method_32178(var1);
   }

   @Override
   public boolean method_29508(int var1, int var2, int var3) {
      if (!super.method_29508(this.field_36270, this.field_36261, var3)) {
         this.field_25586 = true;
         return false;
      } else {
         return true;
      }
   }

   public float method_22634(int var1) {
      return (float)(var1 - this.method_32093()) / (float)this.field_36257;
   }

   @Override
   public void method_32145(int var1, int var2) {
      super.method_32145(var1, var2);
      if (this.field_25586) {
         this.method_22635(this.method_22634(var2));
         this.method_22636();
      }
   }

   @Override
   public void method_29505(int var1, int var2, int var3) {
      super.method_29505(var1, var2, var3);
      this.field_25586 = false;
   }

   @Override
   public void method_29510(float var1) {
      if (this.method_32183()) {
         this.method_22635(this.method_22637() - var1 / 2000.0F);
         this.method_22636();
      }

      super.method_29510(var1);
   }

   public float method_22637() {
      return this.field_25584;
   }

   public void method_22635(float var1) {
      this.field_25584 = Math.min(Math.max(var1, 0.0F), 1.0F);
   }

   public class_4178 method_22638(class_849 var1) {
      this.field_25585.add(var1);
      return this;
   }

   public void method_22636() {
      for (class_849 var4 : this.field_25585) {
         var4.method_3698(this);
      }
   }
}
