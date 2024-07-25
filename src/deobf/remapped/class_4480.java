package remapped;

import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public class class_4480 {
   private static String[] field_21846;
   public final Int2ObjectMap<class_454> field_21844 = new Int2ObjectOpenHashMap(256);
   private final Int2ObjectMap<class_7373> field_21843 = new Int2ObjectOpenHashMap(256);
   private final class_7458 field_21845;

   public class_4480(class_7458 var1) {
      this.field_21845 = var1;
   }

   public class_5155 method_20800(class_8525 var1) {
      return this.method_20799(new class_6098(var1));
   }

   public class_5155 method_20799(class_6098 var1) {
      class_7373 var4 = this.method_20806(var1);
      return var4 == this.field_21845.method_33942() && var1.method_27960() instanceof class_6201
         ? this.field_21845.method_33946().method_43938(((class_6201)var1.method_27960()).method_28392().method_29260())
         : var4.method_33587();
   }

   public class_7373 method_20806(class_6098 var1) {
      class_7373 var4 = this.method_20805(var1.method_27960());
      return var4 != null ? var4 : this.field_21845.method_33942();
   }

   @Nullable
   public class_7373 method_20805(class_2451 var1) {
      return (class_7373)this.field_21843.get(method_20802(var1));
   }

   private static int method_20802(class_2451 var0) {
      return class_2451.method_11244(var0);
   }

   public void method_20804(class_2451 var1, class_454 var2) {
      this.field_21844.put(method_20802(var1), var2);
   }

   public class_7458 method_20803() {
      return this.field_21845;
   }

   public void method_20801() {
      this.field_21843.clear();
      ObjectIterator var3 = this.field_21844.entrySet().iterator();

      while (var3.hasNext()) {
         Entry var4 = (Entry)var3.next();
         this.field_21843.put((Integer)var4.getKey(), this.field_21845.method_33943((class_454)var4.getValue()));
      }
   }
}
