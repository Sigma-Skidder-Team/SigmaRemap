package remapped;

import com.google.common.collect.Lists;
import java.util.List;
import java.util.function.Consumer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_6272 {
   private static final Logger field_32033 = LogManager.getLogger();
   private final class_2451 field_32031;
   private final int field_32032;
   private final List<class_8137> field_32036 = Lists.newArrayList();
   private final class_3321 field_32034 = class_3321.method_15269();
   private String field_32030;

   public class_6272(class_8525 var1, int var2) {
      this.field_32031 = var1.method_10803();
      this.field_32032 = var2;
   }

   public static class_6272 method_28588(class_8525 var0) {
      return new class_6272(var0, 1);
   }

   public static class_6272 method_28589(class_8525 var0, int var1) {
      return new class_6272(var0, var1);
   }

   public class_6272 method_28590(class_2307<class_2451> var1) {
      return this.method_28591(class_8137.method_37022(var1));
   }

   public class_6272 method_28593(class_8525 var1) {
      return this.method_28594(var1, 1);
   }

   public class_6272 method_28594(class_8525 var1, int var2) {
      for (int var5 = 0; var5 < var2; var5++) {
         this.method_28591(class_8137.method_37019(var1));
      }

      return this;
   }

   public class_6272 method_28591(class_8137 var1) {
      return this.method_28592(var1, 1);
   }

   public class_6272 method_28592(class_8137 var1, int var2) {
      for (int var5 = 0; var5 < var2; var5++) {
         this.field_32036.add(var1);
      }

      return this;
   }

   public class_6272 method_28595(String var1, class_5154 var2) {
      this.field_32034.method_15272(var1, var2);
      return this;
   }

   public class_6272 method_28596(String var1) {
      this.field_32030 = var1;
      return this;
   }

   public void method_28597(Consumer<class_4219> var1) {
      this.method_28599(var1, class_8669.field_44382.method_39797(this.field_32031));
   }

   public void method_28598(Consumer<class_4219> var1, String var2) {
      class_4639 var5 = class_8669.field_44382.method_39797(this.field_32031);
      if (!new class_4639(var2).equals(var5)) {
         this.method_28599(var1, new class_4639(var2));
      } else {
         throw new IllegalStateException("Shapeless Recipe " + var2 + " should remove its 'save' argument");
      }
   }

   public void method_28599(Consumer<class_4219> var1, class_4639 var2) {
      this.method_28587(var2);
      this.field_32034
         .method_15260(new class_4639("recipes/root"))
         .method_15272("has_the_recipe", class_8435.method_38807(var2))
         .method_15258(class_7365.method_33536(var2))
         .method_15271(class_6701.field_34598);
      var1.accept(
         new class_1619(
            var2,
            this.field_32031,
            this.field_32032,
            this.field_32030 != null ? this.field_32030 : "",
            this.field_32036,
            this.field_32034,
            new class_4639(var2.method_21461(), "recipes/" + this.field_32031.method_11226().method_37691() + "/" + var2.method_21456())
         )
      );
   }

   private void method_28587(class_4639 var1) {
      if (this.field_32034.method_15255().isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + var1);
      }
   }
}
