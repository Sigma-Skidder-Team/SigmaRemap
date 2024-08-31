package mapped;

import com.google.common.base.Joiner;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.mojang.datafixers.util.Either;
import com.mojang.datafixers.util.Pair;
import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

import net.minecraft.util.ResourceLocation;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class7496 implements Class7495 {
   private static final Logger field32199 = LogManager.getLogger();
   private static final Class9155 field32200 = new Class9155();
   public static final Gson field32201 = new GsonBuilder()
      .registerTypeAdapter(Class7496.class, new Class2553())
      .registerTypeAdapter(Class9726.class, new Class2579())
      .registerTypeAdapter(Class9163.class, new Class2558())
      .registerTypeAdapter(Class9840.class, new Class2572())
      .registerTypeAdapter(Class6792.class, new Class2561())
      .registerTypeAdapter(Class9264.class, new Class2566())
      .registerTypeAdapter(Class7781.class, new Class2560())
      .create();
   private final List<Class9726> field32202;
   private final Class2129 field32203;
   private final boolean field32204;
   private final Class9264 field32205;
   private final List<Class7781> field32206;
   public String field32207 = "";
   public final Map<String, Either<Class7826, String>> field32208;
   public Class7496 field32209;
   public ResourceLocation field32210;

   public static Class7496 method24426(Reader var0) {
      return JSONUtils.<Class7496>method32796(field32201, var0, Class7496.class);
   }

   public static Class7496 method24427(String var0) {
      return method24426(new StringReader(var0));
   }

   public Class7496(
           ResourceLocation var1, List<Class9726> var2, Map<String, Either<Class7826, String>> var3, boolean var4, Class2129 var5, Class9264 var6, List<Class7781> var7
   ) {
      this.field32202 = var2;
      this.field32204 = var4;
      this.field32203 = var5;
      this.field32208 = var3;
      this.field32210 = var1;
      this.field32205 = var6;
      this.field32206 = var7;
   }

   public List<Class9726> method24428() {
      return this.field32202.isEmpty() && this.field32209 != null ? this.field32209.method24428() : this.field32202;
   }

   public boolean method24429() {
      return this.field32209 == null ? this.field32204 : this.field32209.method24429();
   }

   public Class2129 method24430() {
      if (this.field32203 == null) {
         return this.field32209 == null ? Class2129.field13892 : this.field32209.method24430();
      } else {
         return this.field32203;
      }
   }

   public List<Class7781> method24431() {
      return this.field32206;
   }

   private Class6391 method24432(ModelBakery var1, Class7496 var2) {
      return !this.field32206.isEmpty() ? new Class6391(var1, var2, var1::method32841, this.field32206) : Class6391.field27973;
   }

   @Override
   public Collection<ResourceLocation> method24423() {
      HashSet var3 = Sets.newHashSet();

      for (Class7781 var5 : this.field32206) {
         var3.add(var5.method25780());
      }

      if (this.field32210 != null) {
         var3.add(this.field32210);
      }

      return var3;
   }

   @Override
   public Collection<Class7826> method24424(Function<ResourceLocation, Class7495> var1, Set<Pair<String, String>> var2) {
      LinkedHashSet var5 = Sets.newLinkedHashSet();

      for (Class7496 var6 = this; var6.field32210 != null && var6.field32209 == null; var6 = var6.field32209) {
         var5.add(var6);
         Class7495 var7 = (Class7495)var1.apply(var6.field32210);
         if (var7 == null) {
            field32199.warn("No parent '{}' while loading model '{}'", this.field32210, var6);
         }

         if (var5.contains(var7)) {
            field32199.warn(
               "Found 'parent' loop while loading model '{}' in chain: {} -> {}",
               var6,
               var5.stream().<CharSequence>map(Object::toString).collect(Collectors.joining(" -> ")),
               this.field32210
            );
            var7 = null;
         }

         if (var7 == null) {
            var6.field32210 = ModelBakery.field40521;
            var7 = (Class7495)var1.apply(var6.field32210);
         }

         if (!(var7 instanceof Class7496)) {
            throw new IllegalStateException("BlockModel parent has to be a block model.");
         }

         var6.field32209 = (Class7496)var7;
      }

      HashSet var12 = Sets.newHashSet(new Class7826[]{this.method24436("particle")});

      for (Class9726 var8 : this.method24428()) {
         for (Class9163 var10 : var8.field45425.values()) {
            Class7826 var11 = this.method24436(var10.field42068);
            if (Objects.equals(var11.method26197(), Class1714.method7513())) {
               var2.add(Pair.of(var10.field42068, this.field32207));
            }

            var12.add(var11);
         }
      }

      this.field32206.forEach(var4 -> {
         Class7495 var7x = (Class7495)var1.apply(var4.method25780());
         if (!Objects.equals(var7x, this)) {
            var12.addAll(var7x.method24424(var1, var2));
         }
      });
      if (this.method24439() == ModelBakery.field40527) {
         Class8451.field36258.forEach(var2x -> var12.add(this.method24436(var2x)));
      }

      return var12;
   }

   @Override
   public IBakedModel method24425(ModelBakery var1, Function<Class7826, TextureAtlasSprite> var2, Class1902 var3, ResourceLocation var4) {
      return this.method24433(var1, this, var2, var3, var4, true);
   }

   public IBakedModel method24433(ModelBakery var1, Class7496 var2, Function<Class7826, TextureAtlasSprite> var3, Class1902 var4, ResourceLocation var5, boolean var6) {
      TextureAtlasSprite var9 = (TextureAtlasSprite)var3.apply(this.method24436("particle"));
      if (this.method24439() == ModelBakery.field40528) {
         return new Class7203(this.method24440(), this.method24432(var1, var2), var9, this.method24430().method8812());
      } else {
         Class9071 var10 = new Class9071(this, this.method24432(var1, var2), var6).method33812(var9);

         for (Class9726 var12 : this.method24428()) {
            for (Direction var14 : var12.field45425.keySet()) {
               Class9163 var15 = var12.field45425.get(var14);
               TextureAtlasSprite var16 = (TextureAtlasSprite)var3.apply(this.method24436(var15.field42068));
               if (var15.field42066 != null) {
                  var10.method33810(Direction.method531(var4.method8166().method21548(), var15.field42066), method24434(var12, var15, var16, var14, var4, var5));
               } else {
                  var10.method33811(method24434(var12, var15, var16, var14, var4, var5));
               }
            }
         }

         return var10.method33813();
      }
   }

   private static Class8557 method24434(Class9726 var0, Class9163 var1, TextureAtlasSprite var2, Direction var3, Class1902 var4, ResourceLocation var5) {
      return field32200.method34175(var0.field45423, var0.field45424, var1, var2, var3, var4, var0.field45426, var0.field45427, var5);
   }

   public boolean method24435(String var1) {
      return !Class1714.method7513().equals(this.method24436(var1).method26197());
   }

   public Class7826 method24436(String var1) {
      if (method24438(var1)) {
         var1 = var1.substring(1);
      }

      ArrayList var4 = Lists.newArrayList();

      while (true) {
         Either var5 = this.method24437(var1);
         Optional var6 = var5.left();
         if (var6.isPresent()) {
            return (Class7826)var6.get();
         }

         var1 = (String)var5.right().get();
         if (var4.contains(var1)) {
            field32199.warn("Unable to resolve texture due to reference chain {}->{} in {}", Joiner.on("->").join(var4), var1, this.field32207);
            return new Class7826(AtlasTexture.LOCATION_BLOCKS_TEXTURE, Class1714.method7513());
         }

         var4.add(var1);
      }
   }

   private Either<Class7826, String> method24437(String var1) {
      for (Class7496 var4 = this; var4 != null; var4 = var4.field32209) {
         Either var5 = var4.field32208.get(var1);
         if (var5 != null) {
            return var5;
         }
      }

      return Either.left(new Class7826(AtlasTexture.LOCATION_BLOCKS_TEXTURE, Class1714.method7513()));
   }

   private static boolean method24438(String var0) {
      return var0.charAt(0) == '#';
   }

   public Class7496 method24439() {
      return this.field32209 != null ? this.field32209.method24439() : this;
   }

   public Class9264 method24440() {
      Class6792 var3 = this.method24441(Class2327.field15925);
      Class6792 var4 = this.method24441(Class2327.field15926);
      Class6792 var5 = this.method24441(Class2327.field15927);
      Class6792 var6 = this.method24441(Class2327.field15928);
      Class6792 var7 = this.method24441(Class2327.field15929);
      Class6792 var8 = this.method24441(Class2327.field15930);
      Class6792 var9 = this.method24441(Class2327.field15931);
      Class6792 var10 = this.method24441(Class2327.field15932);
      return new Class9264(var3, var4, var5, var6, var7, var8, var9, var10);
   }

   private Class6792 method24441(Class2327 var1) {
      return this.field32209 != null && !this.field32205.method34867(var1) ? this.field32209.method24441(var1) : this.field32205.method34866(var1);
   }

   @Override
   public String toString() {
      return this.field32207;
   }

   // $VF: synthetic method
   public static boolean method24444(String var0) {
      return method24438(var0);
   }
}
