package remapped;

import com.google.common.collect.ImmutableSet;

public class class_6238<T extends Entity> {
   private static String[] field_31918;
   private final class_7792<T> field_31922;
   private final class_4565 field_31925;
   private ImmutableSet<class_6414> field_31917 = ImmutableSet.of();
   private boolean field_31920 = true;
   private boolean field_31919 = true;
   private boolean field_31926;
   private boolean field_31923;
   private int field_31916 = 5;
   private int field_31924 = 3;
   private class_6097 field_31921 = class_6097.method_27938(0.6F, 1.8F);

   private class_6238(class_7792<T> var1, class_4565 var2) {
      this.field_31922 = var1;
      this.field_31925 = var2;
      this.field_31923 = var2 == class_4565.field_22239 || var2 == class_4565.field_22251;
   }

   public static <T extends Entity> class_6238<T> method_28492(class_7792<T> var0, class_4565 var1) {
      return new class_6238<T>(var0, var1);
   }

   public static <T extends Entity> class_6238<T> method_28491(class_4565 var0) {
      return new class_6238<T>((var0x, var1) -> (Entity)null, var0);
   }

   public class_6238<T> method_28489(float var1, float var2) {
      this.field_31921 = class_6097.method_27938(var1, var2);
      return this;
   }

   public class_6238<T> method_28494() {
      this.field_31919 = false;
      return this;
   }

   public class_6238<T> method_28495() {
      this.field_31920 = false;
      return this;
   }

   public class_6238<T> method_28490() {
      this.field_31926 = true;
      return this;
   }

   public class_6238<T> method_28498(class_6414... var1) {
      this.field_31917 = ImmutableSet.copyOf(var1);
      return this;
   }

   public class_6238<T> method_28497() {
      this.field_31923 = true;
      return this;
   }

   public class_6238<T> method_28499(int var1) {
      this.field_31916 = var1;
      return this;
   }

   public class_6238<T> method_28500(int var1) {
      this.field_31924 = var1;
      return this;
   }

   public EntityType<T> method_28496(String var1) {
      if (this.field_31920) {
         Util.getChoiceType(class_4002.field_19451, var1);
      }

      return new EntityType<T>(
         this.field_31922,
         this.field_31925,
         this.field_31920,
         this.field_31919,
         this.field_31926,
         this.field_31923,
         this.field_31917,
         this.field_31921,
         this.field_31916,
         this.field_31924
      );
   }
}
