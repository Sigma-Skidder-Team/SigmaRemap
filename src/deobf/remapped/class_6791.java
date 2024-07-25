package remapped;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.io.IOException;
import java.util.Collection;
import java.util.List;

public class class_6791 implements class_6310<class_392> {
   private static String[] field_35016;
   private class_6265 field_35017;
   private List<Identifier> field_35018;
   private List<Identifier> field_35015;
   private class_7529 field_35014;

   public class_6791() {
   }

   public class_6791(class_6265 var1, Collection<Identifier> var2, Collection<Identifier> var3, class_7529 var4) {
      this.field_35017 = var1;
      this.field_35018 = ImmutableList.copyOf(var2);
      this.field_35015 = ImmutableList.copyOf(var3);
      this.field_35014 = var4;
   }

   public void method_31132(class_392 var1) {
      var1.method_1912(this);
   }

   @Override
   public void method_28775(class_8248 var1) throws IOException {
      this.field_35017 = var1.<class_6265>method_37787(class_6265.class);
      this.field_35014 = class_7529.method_34307(var1);
      int var4 = var1.method_37778();
      this.field_35018 = Lists.newArrayList();

      for (int var5 = 0; var5 < var4; var5++) {
         this.field_35018.add(var1.method_37768());
      }

      if (this.field_35017 == class_6265.field_32013) {
         var4 = var1.method_37778();
         this.field_35015 = Lists.newArrayList();

         for (int var7 = 0; var7 < var4; var7++) {
            this.field_35015.add(var1.method_37768());
         }
      }
   }

   @Override
   public void method_28776(class_8248 var1) throws IOException {
      var1.method_37750(this.field_35017);
      this.field_35014.method_34303(var1);
      var1.method_37743(this.field_35018.size());

      for (Identifier var5 : this.field_35018) {
         var1.method_37780(var5);
      }

      if (this.field_35017 == class_6265.field_32013) {
         var1.method_37743(this.field_35015.size());

         for (Identifier var7 : this.field_35015) {
            var1.method_37780(var7);
         }
      }
   }

   public List<Identifier> method_31127() {
      return this.field_35018;
   }

   public List<Identifier> method_31129() {
      return this.field_35015;
   }

   public class_7529 method_31130() {
      return this.field_35014;
   }

   public class_6265 method_31128() {
      return this.field_35017;
   }
}
