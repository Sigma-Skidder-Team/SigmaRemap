package mapped;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import java.util.List;

public class Class5147 implements Class5146 {
   private final Block field23370;
   private final List<Class5144> field23371 = Lists.newArrayList();

   private Class5147(Block var1) {
      this.field23370 = var1;
   }

   @Override
   public Block method15931() {
      return this.field23370;
   }

   public static Class5147 method15932(Block var0) {
      return new Class5147(var0);
   }

   public Class5147 method15933(List<Class5138> var1) {
      this.field23371.add(new Class5144(var1));
      return this;
   }

   public Class5147 method15934(Class5138 var1) {
      return this.method15933(ImmutableList.of(var1));
   }

   public Class5147 method15935(Class5141 var1, List<Class5138> var2) {
      this.field23371.add(new Class5145(var1, var2));
      return this;
   }

   public Class5147 method15936(Class5141 var1, Class5138... var2) {
      return this.method15935(var1, ImmutableList.copyOf(var2));
   }

   public Class5147 method15937(Class5141 var1, Class5138 var2) {
      return this.method15935(var1, ImmutableList.of(var2));
   }

   public JsonElement get() {
      Class9348 var3 = this.field23370.method11577();
      this.field23371.forEach(var1 -> var1.method15929(var3));
      JsonArray var4 = new JsonArray();
      this.field23371.stream().<JsonElement>map(Class5144::get).forEach(var4::add);
      JsonObject var5 = new JsonObject();
      var5.add("multipart", var4);
      return var5;
   }
}
