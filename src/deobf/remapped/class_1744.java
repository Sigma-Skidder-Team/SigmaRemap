package remapped;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.List;

public class class_1744 implements class_8740 {
   private final class_6414 field_8991;
   private final List<class_5980> field_8989 = Lists.newArrayList();

   private class_1744(class_6414 var1) {
      this.field_8991 = var1;
   }

   @Override
   public class_6414 method_40130() {
      return this.field_8991;
   }

   public static class_1744 method_7785(class_6414 var0) {
      return new class_1744(var0);
   }

   public class_1744 method_7788(List<class_265> var1) {
      this.field_8989.add(new class_5980(var1, null));
      return this;
   }

   public class_1744 method_7787(class_265 var1) {
      return this.method_7788(ImmutableList.of(var1));
   }

   public class_1744 method_7790(class_5496 var1, List<class_265> var2) {
      this.field_8989.add(new class_5585(var1, var2, null));
      return this;
   }

   public class_1744 method_7789(class_5496 var1, class_265... var2) {
      return this.method_7790(var1, ImmutableList.copyOf(var2));
   }

   public class_1744 method_7786(class_5496 var1, class_265 var2) {
      return this.method_7790(var1, ImmutableList.of(var2));
   }

   public JsonElement get() {
      class_8021 var3 = this.field_8991.method_29306();
      this.field_8989.forEach(var1 -> var1.method_27286(var3));
      JsonArray var4 = new JsonArray();
      this.field_8989.stream().<JsonElement>map(class_5980::get).forEach(var4::add);
      JsonObject var5 = new JsonObject();
      var5.add("multipart", var4);
      return var5;
   }
}
