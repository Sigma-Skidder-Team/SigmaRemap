package remapped;

import java.lang.reflect.Field;

public class class_1790 implements class_8861 {
   private static String[] field_9157;
   private class_5711 field_9156 = null;
   private boolean field_9154 = false;
   private Field field_9155 = null;

   public class_1790(class_9859 var1, String var2) {
      this(new class_8299(var1, var2));
   }

   public class_1790(class_9859 var1, Class var2) {
      this(var1, var2, 0);
   }

   public class_1790(class_9859 var1, Class var2, int var3) {
      this(new class_6841(var1, var2, var3));
   }

   public class_1790(Field var1) {
      this(new class_1391(var1));
   }

   public class_1790(class_5711 var1) {
      this.field_9156 = var1;
      class_9696.method_44804(this);
   }

   public Field method_7977() {
      if (!this.field_9154) {
         this.field_9154 = true;
         this.field_9155 = this.field_9156.method_25796();
         if (this.field_9155 != null) {
            this.field_9155.setAccessible(true);
         }

         return this.field_9155;
      } else {
         return this.field_9155;
      }
   }

   public Object method_7979() {
      return class_7860.method_35557(null, this);
   }

   public Object method_7980(Object var1) {
      return class_7860.method_35557(var1, this);
   }

   public void method_7981(Object var1) {
      class_7860.method_35561(null, this, var1);
   }

   public void method_7982(Object var1, Object var2) {
      class_7860.method_35561(var1, this, var2);
   }

   public boolean method_7978() {
      return this.method_7977() != null;
   }

   @Override
   public void method_40748() {
      Field var3 = this.method_7977();
   }
}
