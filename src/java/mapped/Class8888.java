package mapped;

import com.google.common.collect.Lists;
import java.util.List;
import java.util.function.Consumer;

import net.minecraft.item.Item;
import net.minecraft.tags.ITag;
import net.minecraft.util.IItemProvider;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class8888 {
   private static final Logger field40209 = LogManager.getLogger();
   private final Item field40210;
   private final int field40211;
   private final List<Class120> field40212 = Lists.newArrayList();
   private final Class7999 field40213 = Class7999.method27304();
   private String field40214;

   public Class8888(IItemProvider var1, int var2) {
      this.field40210 = var1.asItem();
      this.field40211 = var2;
   }

   public static Class8888 method32341(IItemProvider var0) {
      return new Class8888(var0, 1);
   }

   public static Class8888 method32342(IItemProvider var0, int var1) {
      return new Class8888(var0, var1);
   }

   public Class8888 method32343(ITag<Item> var1) {
      return this.method32346(Class120.method342(var1));
   }

   public Class8888 method32344(IItemProvider var1) {
      return this.method32345(var1, 1);
   }

   public Class8888 method32345(IItemProvider var1, int var2) {
      for (int var5 = 0; var5 < var2; var5++) {
         this.method32346(Class120.method339(var1));
      }

      return this;
   }

   public Class8888 method32346(Class120 var1) {
      return this.method32347(var1, 1);
   }

   public Class8888 method32347(Class120 var1, int var2) {
      for (int var5 = 0; var5 < var2; var5++) {
         this.field40212.add(var1);
      }

      return this;
   }

   public Class8888 method32348(String var1, Class4477 var2) {
      this.field40213.method27312(var1, var2);
      return this;
   }

   public Class8888 method32349(String var1) {
      this.field40214 = var1;
      return this;
   }

   public void method32350(Consumer<Class4664> var1) {
      this.method32352(var1, Registry.ITEM.getKey(this.field40210));
   }

   public void method32351(Consumer<Class4664> var1, String var2) {
      ResourceLocation var5 = Registry.ITEM.getKey(this.field40210);
      if (!new ResourceLocation(var2).equals(var5)) {
         this.method32352(var1, new ResourceLocation(var2));
      } else {
         throw new IllegalStateException("Shapeless Recipe " + var2 + " should remove its 'save' argument");
      }
   }

   public void method32352(Consumer<Class4664> var1, ResourceLocation var2) {
      this.method32353(var2);
      this.field40213
         .method27306(new ResourceLocation("recipes/root"))
         .method27312("has_the_recipe", Class4897.method15131(var2))
         .method27310(Class9182.method34345(var2))
         .method27314(Class9014.field41221);
      var1.accept(
         new Class4666(
            var2,
            this.field40210,
            this.field40211,
            this.field40214 != null ? this.field40214 : "",
            this.field40212,
            this.field40213,
            new ResourceLocation(var2.getNamespace(), "recipes/" + this.field40210.getGroup().getPath() + "/" + var2.getPath())
         )
      );
   }

   private void method32353(ResourceLocation var1) {
      if (this.field40213.method27322().isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + var1);
      }
   }
}
