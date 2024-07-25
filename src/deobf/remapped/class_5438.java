package remapped;

import java.util.List;

public final class class_5438<T> extends class_4610 {
   private final String field_27696;
   private final List<T> field_27698;

   public class_5438(String var1, List<T> var2, class_404 var3, class_404 var4) {
      super(var3, var4);
      this.field_27696 = var1;
      if (var2 != null && var2.size() != 2) {
         throw new class_5251("Two strings must be provided instead of " + String.valueOf(var2.size()));
      } else {
         this.field_27698 = var2;
      }
   }

   public String method_24775() {
      return this.field_27696;
   }

   public List<T> method_24774() {
      return this.field_27698;
   }

   @Override
   public class_7523 method_21371() {
      return class_7523.field_38413;
   }
}
