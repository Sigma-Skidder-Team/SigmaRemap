package remapped;

import java.util.ArrayList;
import java.util.List;

public abstract class Setting<T> {
   public final class_5195 field_25888;
   public T field_25890;
   public T field_25891;
   public final String field_25889;
   public final String field_25892;
   private final List<class_9712> field_25887 = new ArrayList<class_9712>();

   public Setting(String var1, String var2, class_5195 var3, T var4) {
      this.field_25888 = var3;
      this.field_25890 = this.field_25891 = (T)var4;
      this.field_25889 = var1;
      this.field_25892 = var2;
   }

   public abstract JSONObjectImpl saveDataToJson(JSONObjectImpl var1);

   public JSONObjectImpl loadDataFromJson(JSONObjectImpl var1) {
      var1.method_5820("name", this.method_23032());
      var1.method_5820("value", this.field_25890);
      return var1;
   }

   public void method_23041() {
      this.field_25890 = this.field_25891;
   }

   public final Setting method_23029(class_9712 var1) {
      this.field_25887.add(var1);
      return this;
   }

   public final void method_23034() {
      for (class_9712 var4 : this.field_25887) {
         var4.method_44858(this);
      }
   }

   public class_5195 method_23030() {
      return this.field_25888;
   }

   public T method_23031() {
      return this.field_25890;
   }

   public void method_23037(T var1) {
      this.method_23038((T)var1, true);
   }

   public void method_23038(T var1, boolean var2) {
      if (this.field_25890 != var1) {
         this.field_25890 = (T)var1;
         if (var2) {
            this.method_23034();
         }
      }
   }

   public void method_23040() {
   }

   public boolean method_23043() {
      return false;
   }

   public T method_23039() {
      return this.field_25891;
   }

   public String method_23032() {
      return this.field_25889;
   }

   public String method_23033() {
      return this.field_25892;
   }

   @Override
   public String toString() {
      return this.method_23031().toString();
   }
}
