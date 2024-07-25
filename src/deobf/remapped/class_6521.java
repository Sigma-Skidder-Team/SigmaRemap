package remapped;

import java.util.function.Function;

public abstract class class_6521<T extends class_8145> extends class_9873 {
   public float field_33202;
   public boolean field_33203;
   public boolean field_33204 = true;

   public class_6521() {
      this(class_3581::method_16755);
   }

   public class_6521(Function<class_4639, class_3581> var1) {
      super(var1);
   }

   public abstract void method_29700(T var1, float var2, float var3, float var4, float var5, float var6);

   public void method_29702(T var1, float var2, float var3, float var4) {
   }

   public void method_29701(class_6521<T> var1) {
      var1.field_33202 = this.field_33202;
      var1.field_33203 = this.field_33203;
      var1.field_33204 = this.field_33204;
   }
}
