package remapped;

import com.google.common.collect.Lists;
import java.io.IOException;
import java.util.Collection;
import java.util.List;

public class class_6621 implements class_6310<class_392> {
   private List<class_8932<?>> field_34190;

   public class_6621() {
   }

   public class_6621(Collection<class_8932<?>> var1) {
      this.field_34190 = Lists.newArrayList(var1);
   }

   public void method_30441(class_392 var1) {
      var1.method_1946(this);
   }

   @Override
   public void method_28775(class_8248 var1) throws IOException {
      this.field_34190 = Lists.newArrayList();
      int var4 = var1.method_37778();

      for (int var5 = 0; var5 < var4; var5++) {
         this.field_34190.add(method_30437(var1));
      }
   }

   @Override
   public void method_28776(class_8248 var1) throws IOException {
      var1.method_37743(this.field_34190.size());

      for (class_8932 var5 : this.field_34190) {
         method_30438(var5, var1);
      }
   }

   public List<class_8932<?>> method_30439() {
      return this.field_34190;
   }

   public static class_8932<?> method_30437(class_8248 var0) {
      class_4639 var3 = var0.method_37768();
      class_4639 var4 = var0.method_37768();
      return class_8669.field_44414
         .method_39794(var3)
         .orElseThrow(() -> new IllegalArgumentException("Unknown recipe serializer " + var3))
         .method_13697(var4, var0);
   }

   public static <T extends class_8932<?>> void method_30438(T var0, class_8248 var1) {
      var1.method_37780(class_8669.field_44414.method_39797(var0.method_41048()));
      var1.method_37780(var0.method_41050());
      ((class_2994<class_8932>)var0.method_41048()).method_13694(var1, var0);
   }
}
