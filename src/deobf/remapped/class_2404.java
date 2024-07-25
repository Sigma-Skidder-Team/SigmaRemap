package remapped;

import java.io.IOException;
import org.apache.commons.lang3.Validate;

public class class_2404 implements class_6310<class_392> {
   private class_8461 field_11981;
   private class_562 field_11983;
   private int field_11982;
   private float field_11978;
   private float field_11979;

   public class_2404() {
   }

   public class_2404(class_8461 var1, class_562 var2, Entity var3, float var4, float var5) {
      Validate.notNull(var1, "sound", new Object[0]);
      this.field_11981 = var1;
      this.field_11983 = var2;
      this.field_11982 = var3.method_37145();
      this.field_11978 = var4;
      this.field_11979 = var5;
   }

   @Override
   public void method_28775(class_8248 var1) throws IOException {
      this.field_11981 = class_8669.field_44369.method_14040(var1.method_37778());
      this.field_11983 = var1.<class_562>method_37787(class_562.class);
      this.field_11982 = var1.method_37778();
      this.field_11978 = var1.readFloat();
      this.field_11979 = var1.readFloat();
   }

   @Override
   public void method_28776(class_8248 var1) throws IOException {
      var1.method_37743(class_8669.field_44369.method_14041(this.field_11981));
      var1.method_37750(this.field_11983);
      var1.method_37743(this.field_11982);
      var1.writeFloat(this.field_11978);
      var1.writeFloat(this.field_11979);
   }

   public class_8461 method_10931() {
      return this.field_11981;
   }

   public class_562 method_10936() {
      return this.field_11983;
   }

   public int method_10932() {
      return this.field_11982;
   }

   public float method_10933() {
      return this.field_11978;
   }

   public float method_10930() {
      return this.field_11979;
   }

   public void method_10935(class_392 var1) {
      var1.method_1949(this);
   }
}
