package mapped;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.function.Supplier;

import net.minecraft.block.BlockState;
import net.minecraft.client.util.Util;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class9733 {
   private static final Logger field45442 = LogManager.getLogger();
   public static final Codec<Class9733> field45443 = RecordCodecBuilder.<Class9733>create(
         var0 -> var0.group(
                  Class8611.<Biome>method30859(Registry.BIOME_KEY).forGetter(var0x -> var0x.field45445),
                  Class9763.field45673.fieldOf("structures").forGetter(Class9733::method38126),
                  Class9537.field44402.listOf().fieldOf("layers").forGetter(Class9733::method38129),
                  Codec.BOOL.fieldOf("lakes").orElse(false).forGetter(var0x -> var0x.field45452),
                  Codec.BOOL.fieldOf("features").orElse(false).forGetter(var0x -> var0x.field45451),
                  Biome.field40309
                     .optionalFieldOf("biome")
                     .orElseGet(Optional::empty)
                     .forGetter(var0x -> Optional.<Supplier<Biome>>of(var0x.field45448))
               )
               .apply(var0, Class9733::new)
      )
      .stable();
   private static final Map<Structure<?>, Class9300<?, ?>> field45444 = Util.<Map<Structure<?>, Class9300<?, ?>>>make(Maps.newHashMap(), var0 -> {
      var0.put(Structure.field18059, Class9438.field43835);
      var0.put(Structure.field18073, Class9438.field43853);
      var0.put(Structure.field18067, Class9438.field43844);
      var0.put(Structure.field18066, Class9438.field43843);
      var0.put(Structure.field18062, Class9438.field43839);
      var0.put(Structure.field18061, Class9438.field43838);
      var0.put(Structure.field18063, Class9438.field43840);
      var0.put(Structure.field18069, Class9438.field43846);
      var0.put(Structure.field18065, Class9438.field43841);
      var0.put(Structure.field18068, Class9438.field43845);
      var0.put(Structure.field18071, Class9438.field43850);
      var0.put(Structure.field18060, Class9438.field43837);
      var0.put(Structure.field18070, Class9438.field43848);
      var0.put(Structure.field18058, Class9438.field43834);
      var0.put(Structure.field18064, Class9438.field43858);
      var0.put(Structure.field18075, Class9438.field43852);
   });
   private final Registry<Biome> field45445;
   private final Class9763 field45446;
   private final List<Class9537> field45447 = Lists.newArrayList();
   private Supplier<Biome> field45448;
   private final BlockState[] field45449 = new BlockState[256];
   private boolean field45450;
   private boolean field45451 = false;
   private boolean field45452 = false;

   public Class9733(Registry<Biome> var1, Class9763 var2, List<Class9537> var3, boolean var4, boolean var5, Optional<Supplier<Biome>> var6) {
      this(var2, var1);
      if (var4) {
         this.method38124();
      }

      if (var5) {
         this.method38123();
      }

      this.field45447.addAll(var3);
      this.method38131();
      if (var6.isPresent()) {
         this.field45448 = (Supplier<Biome>)var6.get();
      } else {
         field45442.error("Unknown biome, defaulting to plains");
         this.field45448 = () -> var1.getOrThrow(Class9495.field44122);
      }
   }

   public Class9733(Class9763 var1, Registry<Biome> var2) {
      this.field45445 = var2;
      this.field45446 = var1;
      this.field45448 = () -> var2.getOrThrow(Class9495.field44122);
   }

   public Class9733 method38121(Class9763 var1) {
      return this.method38122(this.field45447, var1);
   }

   public Class9733 method38122(List<Class9537> var1, Class9763 var2) {
      Class9733 var5 = new Class9733(var2, this.field45445);

      for (Class9537 var7 : var1) {
         var5.field45447.add(new Class9537(var7.method36905(), var7.method36906().getBlock()));
         var5.method38131();
      }

      var5.method38128(this.field45448);
      if (this.field45451) {
         var5.method38123();
      }

      if (this.field45452) {
         var5.method38124();
      }

      return var5;
   }

   public void method38123() {
      this.field45451 = true;
   }

   public void method38124() {
      this.field45452 = true;
   }

   public Biome method38125() {
      Biome var3 = this.method38127();
      Class7478 var4 = var3.method32507();
      Class7935 var5 = new Class7935().method26689(var4.method24282());
      if (this.field45452) {
         var5.method26690(Class1993.field12999, Class9104.field41673);
         var5.method26690(Class1993.field12999, Class9104.field41674);
      }

      for (Entry var7 : this.field45446.method38380().entrySet()) {
         var5.method26693(var4.method24279(field45444.get(var7.getKey())));
      }

      boolean var11 = (!this.field45450 || this.field45445.method9182(var3).equals(Optional.<RegistryKey<Biome>>of(Class9495.field44172))) && this.field45451;
      if (var11) {
         List<List<Supplier<Class7909<?, ?>>>> var12 = var4.method24281();

         for (int var8 = 0; var8 < var12.size(); var8++) {
            if (var8 != Class1993.field13001.ordinal() && var8 != Class1993.field13002.ordinal()) {
               for (Supplier var10 : var12.get(var8)) {
                  var5.method26691(var8, var10);
               }
            }
         }
      }

      BlockState[] var13 = this.method38130();

      for (int var14 = 0; var14 < var13.length; var14++) {
         BlockState var15 = var13[var14];
         if (var15 != null && !Class101.field299.method287().test(var15)) {
            this.field45449[var14] = null;
            var5.method26690(Class1993.field13007, Class2898.field17980.method11216(new Class4732(var14, var15)));
         }
      }

      return new Class9684()
         .method37911(var3.method32500())
         .method37912(var3.getCategory())
         .method37913(var3.method32515())
         .method37914(var3.method32517())
         .method37915(var3.method32518())
         .method37916(var3.method32516())
         .method37917(var3.method32519())
         .method37919(var5.method26695())
         .method37918(var3.method32499())
         .method37921();
   }

   public Class9763 method38126() {
      return this.field45446;
   }

   public Biome method38127() {
      return this.field45448.get();
   }

   public void method38128(Supplier<Biome> var1) {
      this.field45448 = var1;
   }

   public List<Class9537> method38129() {
      return this.field45447;
   }

   public BlockState[] method38130() {
      return this.field45449;
   }

   public void method38131() {
      Arrays.fill(this.field45449, 0, this.field45449.length, null);
      int var3 = 0;

      for (Class9537 var5 : this.field45447) {
         var5.method36908(var3);
         var3 += var5.method36905();
      }

      this.field45450 = true;

      for (Class9537 var9 : this.field45447) {
         for (int var6 = var9.method36907(); var6 < var9.method36907() + var9.method36905(); var6++) {
            BlockState var7 = var9.method36906();
            if (!var7.isIn(Blocks.AIR)) {
               this.field45450 = false;
               this.field45449[var6] = var7;
            }
         }
      }
   }

   public static Class9733 method38132(Registry<Biome> var0) {
      Class9763 var3 = new Class9763(
         Optional.<Class9245>of(Class9763.field45675), Maps.newHashMap(ImmutableMap.of(Structure.field18073, Class9763.field45674.get(Structure.field18073)))
      );
      Class9733 var4 = new Class9733(var3, var0);
      var4.field45448 = () -> var0.getOrThrow(Class9495.field44122);
      var4.method38129().add(new Class9537(1, Blocks.BEDROCK));
      var4.method38129().add(new Class9537(2, Blocks.field36396));
      var4.method38129().add(new Class9537(1, Blocks.field36395));
      var4.method38131();
      return var4;
   }
}
