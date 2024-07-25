package remapped;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import java.util.List;

public class class_6004 {
   private static String[] field_30578;
   private final String field_30580;
   private final ImmutableList<class_2250> field_30579;

   public static class_6004 method_27403(String var0) {
      return class_8669.field_44365.method_39806(class_4639.method_21455(var0));
   }

   public class_6004(class_2250... var1) {
      this((String)null, var1);
   }

   public class_6004(String var1, class_2250... var2) {
      this.field_30580 = var1;
      this.field_30579 = ImmutableList.copyOf(var2);
   }

   public String method_27405(String var1) {
      return var1 + (this.field_30580 != null ? this.field_30580 : class_8669.field_44365.method_39797(this).method_21456());
   }

   public List<class_2250> method_27404() {
      return this.field_30579;
   }

   public boolean method_27402() {
      if (!this.field_30579.isEmpty()) {
         UnmodifiableIterator var3 = this.field_30579.iterator();

         while (var3.hasNext()) {
            class_2250 var4 = (class_2250)var3.next();
            if (var4.method_10339().method_6535()) {
               return true;
            }
         }
      }

      return false;
   }
}
