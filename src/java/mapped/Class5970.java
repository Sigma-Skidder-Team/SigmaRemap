package mapped;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Supplier;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public abstract class Class5970 {
   public static final Class5970 field26025 = new Class5974("default");
   private static final Class5970 field26026 = new Class5972("flat");
   private static final Class5970 field26027 = new Class5973("large_biomes");
   public static final Class5970 field26028 = new Class5976("amplified");
   private static final Class5970 field26029 = new Class5969("single_biome_surface");
   private static final Class5970 field26030 = new Class5975("single_biome_caves");
   private static final Class5970 field26031 = new Class5971("single_biome_floating_islands");
   private static final Class5970 field26032 = new Class5977("debug_all_block_states");
   public static final List<Class5970> field26033 = Lists.newArrayList(
      new Class5970[]{field26025, field26026, field26027, field26028, field26029, field26030, field26031, field26032}
   );
   public static final Map<Optional<Class5970>, Class7837> field26034 = ImmutableMap.of(
      Optional.<Class5970>of(field26026),
      (Class7837)(var0, var1) -> {
         Class5646 var4 = var1.method26265();
         return new Class1324(
            var0,
            var2 -> var0.field7092
                  .method5782(
                     new Class7846(
                        var1.method26259(),
                        var1.method26260(),
                        var1.method26261(),
                        Class7846.method26262(var0.field7092.method5789().<Class9535>method32453(Registry.field16066), var1.method26264(), new Class5648(var2))
                     )
                  ),
            !(var4 instanceof Class5648)
               ? Class9733.method38132(var0.field7092.method5789().<Biome>method32453(Registry.BIOME_KEY))
               : ((Class5648)var4).method17837()
         );
      },
      Optional.<Class5970>of(field26029),
      (Class7837)(var0, var1) -> new Class1323(
            var0,
            var0.field7092.method5789(),
            var2 -> var0.field7092.method5782(method18502(var0.field7092.method5789(), var1, field26029, var2)),
            method18503(var0.field7092.method5789(), var1)
         ),
      Optional.<Class5970>of(field26030),
      (Class7837)(var0, var1) -> new Class1323(
            var0,
            var0.field7092.method5789(),
            var2 -> var0.field7092.method5782(method18502(var0.field7092.method5789(), var1, field26030, var2)),
            method18503(var0.field7092.method5789(), var1)
         ),
      Optional.<Class5970>of(field26031),
      (Class7837)(var0, var1) -> new Class1323(
            var0,
            var0.field7092.method5789(),
            var2 -> var0.field7092.method5782(method18502(var0.field7092.method5789(), var1, field26031, var2)),
            method18503(var0.field7092.method5789(), var1)
         )
   );
   private final ITextComponent field26035;

   private Class5970(String var1) {
      this.field26035 = new TranslationTextComponent("generator." + var1);
   }

   private static Class7846 method18502(Class8904 var0, Class7846 var1, Class5970 var2, Biome var3) {
      Class1688 var6 = new Class1688(var3);
      Class2349 var7 = var0.<Class9535>method32453(Registry.field16066);
      Class2349 var8 = var0.<Class9309>method32453(Registry.field16099);
      Supplier var9;
      if (var2 != field26030) {
         if (var2 != field26031) {
            var9 = () -> var8.method9189(Class9309.field43230);
         } else {
            var9 = () -> var8.method9189(Class9309.field43235);
         }
      } else {
         var9 = () -> var8.method9189(Class9309.field43234);
      }

      return new Class7846(
         var1.method26259(),
         var1.method26260(),
         var1.method26261(),
         Class7846.method26262(var7, var1.method26264(), new Class5645(var6, var1.method26259(), var9))
      );
   }

   private static Biome method18503(Class8904 var0, Class7846 var1) {
      return var1.method26265()
         .method17824()
         .method7201()
         .stream()
         .findFirst()
         .orElse(var0.<Biome>method32453(Registry.BIOME_KEY).method9189(Class9495.field44122));
   }

   public static Optional<Class5970> method18504(Class7846 var0) {
      Class5646 var3 = var0.method26265();
      if (!(var3 instanceof Class5648)) {
         return !(var3 instanceof Class5647) ? Optional.<Class5970>empty() : Optional.<Class5970>of(field26032);
      } else {
         return Optional.<Class5970>of(field26026);
      }
   }

   public ITextComponent method18505() {
      return this.field26035;
   }

   public Class7846 method18506(Class8905 var1, long var2, boolean var4, boolean var5) {
      Class2349 var8 = var1.<Biome>method32453(Registry.BIOME_KEY);
      Class2349 var9 = var1.<Class9535>method32453(Registry.field16066);
      Class2349 var10 = var1.<Class9309>method32453(Registry.field16099);
      return new Class7846(var2, var4, var5, Class7846.method26262(var9, Class9535.method36871(var9, var8, var10, var2), this.method18500(var8, var10, var2)));
   }

   public abstract Class5646 method18500(Registry<Biome> var1, Registry<Class9309> var2, long var3);

   // $VF: synthetic method
   public Class5970(String var1, Class5974 var2) {
      this(var1);
   }
}
