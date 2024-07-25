package remapped;

import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class class_9478<T> implements Iterable<class_6676<T>> {
   private final class_8669<T> field_48313;
   private final Map<T, class_6676<T>> field_48311 = new IdentityHashMap<T, class_6676<T>>();
   private ITextComponent field_48312;

   public class_9478(class_8669<T> var1) {
      this.field_48313 = var1;
   }

   public boolean method_43793(T var1) {
      return this.field_48311.containsKey(var1);
   }

   public class_6676<T> method_43791(T var1, class_5802 var2) {
      return this.field_48311.computeIfAbsent((T)var1, var2x -> new class_6676<T>(this, (T)var2x, var2));
   }

   public class_8669<T> method_43788() {
      return this.field_48313;
   }

   @Override
   public Iterator<class_6676<T>> iterator() {
      return this.field_48311.values().iterator();
   }

   public class_6676<T> method_43790(T var1) {
      return this.method_43791((T)var1, class_5802.field_29298);
   }

   public String method_43794() {
      return "stat_type." + class_8669.field_44376.method_39797(this).toString().replace(':', '.');
   }

   public ITextComponent method_43789() {
      if (this.field_48312 == null) {
         this.field_48312 = new TranslationTextComponent(this.method_43794());
      }

      return this.field_48312;
   }
}
