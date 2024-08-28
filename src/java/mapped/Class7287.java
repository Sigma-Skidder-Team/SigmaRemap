package mapped;

import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

public class Class7287 {
   private final Map<Class9588, ResourceLocation> field31264 = Maps.newHashMap();
   private final Set<Class9588> field31265 = Sets.newHashSet();

   public Class7287 method22991(Class9588 var1, ResourceLocation var2) {
      this.field31264.put(var1, var2);
      return this;
   }

   public Stream<Class9588> method22992() {
      return this.field31265.stream();
   }

   public Class7287 method22993(Class9588 var1, Class9588 var2) {
      this.field31264.put(var2, this.field31264.get(var1));
      this.field31265.add(var2);
      return this;
   }

   public ResourceLocation method22994(Class9588 var1) {
      for (Class9588 var4 = var1; var4 != null; var4 = var4.method37233()) {
         ResourceLocation var5 = this.field31264.get(var4);
         if (var5 != null) {
            return var5;
         }
      }

      throw new IllegalStateException("Can't find texture for slot " + var1);
   }

   public Class7287 method22995(Class9588 var1, ResourceLocation var2) {
      Class7287 var5 = new Class7287();
      var5.field31264.putAll(this.field31264);
      var5.field31265.addAll(this.field31265);
      var5.method22991(var1, var2);
      return var5;
   }

   public static Class7287 method22996(Class3209 var0) {
      ResourceLocation var3 = method23041(var0);
      return method22999(var3);
   }

   public static Class7287 method22997(Class3209 var0) {
      ResourceLocation var3 = method23041(var0);
      return method22998(var3);
   }

   public static Class7287 method22998(ResourceLocation var0) {
      return new Class7287().method22991(Class9588.field44826, var0);
   }

   public static Class7287 method22999(ResourceLocation var0) {
      return new Class7287().method22991(Class9588.field44825, var0);
   }

   public static Class7287 method23000(Class3209 var0) {
      return method23013(Class9588.field44840, method23041(var0));
   }

   public static Class7287 method23001(ResourceLocation var0) {
      return method23013(Class9588.field44840, var0);
   }

   public static Class7287 method23002(Class3209 var0) {
      return method23013(Class9588.field44841, method23041(var0));
   }

   public static Class7287 method23003(ResourceLocation var0) {
      return method23013(Class9588.field44841, var0);
   }

   public static Class7287 method23004(Class3209 var0) {
      return method23013(Class9588.field44843, method23041(var0));
   }

   public static Class7287 method23005(ResourceLocation var0) {
      return method23013(Class9588.field44843, var0);
   }

   public static Class7287 method23006(Class3209 var0) {
      return method23013(Class9588.field44844, method23041(var0));
   }

   public static Class7287 method23007(Class3209 var0) {
      return method23013(Class9588.field44849, method23041(var0));
   }

   public static Class7287 method23008(Class3209 var0, Class3209 var1) {
      return new Class7287().method22991(Class9588.field44849, method23041(var0)).method22991(Class9588.field44850, method23041(var1));
   }

   public static Class7287 method23009(Class3209 var0) {
      return method23013(Class9588.field44845, method23041(var0));
   }

   public static Class7287 method23010(Class3209 var0) {
      return method23013(Class9588.field44848, method23041(var0));
   }

   public static Class7287 method23011(ResourceLocation var0) {
      return method23013(Class9588.field44851, var0);
   }

   public static Class7287 method23012(Class3209 var0, Class3209 var1) {
      return new Class7287().method22991(Class9588.field44846, method23041(var0)).method22991(Class9588.field44847, method23042(var1, "_top"));
   }

   public static Class7287 method23013(Class9588 var0, ResourceLocation var1) {
      return new Class7287().method22991(var0, var1);
   }

   public static Class7287 method23014(Class3209 var0) {
      return new Class7287().method22991(Class9588.field44833, method23042(var0, "_side")).method22991(Class9588.field44828, method23042(var0, "_top"));
   }

   public static Class7287 method23015(Class3209 var0) {
      return new Class7287().method22991(Class9588.field44833, method23042(var0, "_side")).method22991(Class9588.field44830, method23042(var0, "_top"));
   }

   public static Class7287 method23016(Class3209 var0) {
      return new Class7287().method22991(Class9588.field44833, method23041(var0)).method22991(Class9588.field44828, method23042(var0, "_top"));
   }

   public static Class7287 method23017(ResourceLocation var0, ResourceLocation var1) {
      return new Class7287().method22991(Class9588.field44833, var0).method22991(Class9588.field44828, var1);
   }

   public static Class7287 method23018(Class3209 var0) {
      return new Class7287()
         .method22991(Class9588.field44833, method23042(var0, "_side"))
         .method22991(Class9588.field44830, method23042(var0, "_top"))
         .method22991(Class9588.field44829, method23042(var0, "_bottom"));
   }

   public static Class7287 method23019(Class3209 var0) {
      ResourceLocation var3 = method23041(var0);
      return new Class7287()
         .method22991(Class9588.field44842, var3)
         .method22991(Class9588.field44833, var3)
         .method22991(Class9588.field44830, method23042(var0, "_top"))
         .method22991(Class9588.field44829, method23042(var0, "_bottom"));
   }

   public static Class7287 method23020(Class3209 var0) {
      ResourceLocation var3 = method23041(var0);
      return new Class7287()
         .method22991(Class9588.field44842, var3)
         .method22991(Class9588.field44833, var3)
         .method22991(Class9588.field44828, method23042(var0, "_top"));
   }

   public static Class7287 method23021(Class3209 var0) {
      return new Class7287().method22991(Class9588.field44830, method23042(var0, "_top")).method22991(Class9588.field44829, method23042(var0, "_bottom"));
   }

   public static Class7287 method23022(Class3209 var0) {
      return new Class7287().method22991(Class9588.field44827, method23041(var0));
   }

   public static Class7287 method23023(ResourceLocation var0) {
      return new Class7287().method22991(Class9588.field44827, var0);
   }

   public static Class7287 method23024(Class3209 var0) {
      return new Class7287().method22991(Class9588.field44853, method23042(var0, "_0"));
   }

   public static Class7287 method23025(Class3209 var0) {
      return new Class7287().method22991(Class9588.field44853, method23042(var0, "_1"));
   }

   public static Class7287 method23026(Class3209 var0) {
      return new Class7287().method22991(Class9588.field44854, method23041(var0));
   }

   public static Class7287 method23027(Class3209 var0) {
      return new Class7287().method22991(Class9588.field44857, method23041(var0));
   }

   public static Class7287 method23028(ResourceLocation var0) {
      return new Class7287().method22991(Class9588.field44857, var0);
   }

   public static Class7287 method23029(Class3257 var0) {
      return new Class7287().method22991(Class9588.field44827, method23043(var0));
   }

   public static Class7287 method23030(Class3209 var0) {
      return new Class7287()
         .method22991(Class9588.field44833, method23042(var0, "_side"))
         .method22991(Class9588.field44831, method23042(var0, "_front"))
         .method22991(Class9588.field44832, method23042(var0, "_back"));
   }

   public static Class7287 method23031(Class3209 var0) {
      return new Class7287()
         .method22991(Class9588.field44833, method23042(var0, "_side"))
         .method22991(Class9588.field44831, method23042(var0, "_front"))
         .method22991(Class9588.field44830, method23042(var0, "_top"))
         .method22991(Class9588.field44829, method23042(var0, "_bottom"));
   }

   public static Class7287 method23032(Class3209 var0) {
      return new Class7287()
         .method22991(Class9588.field44833, method23042(var0, "_side"))
         .method22991(Class9588.field44831, method23042(var0, "_front"))
         .method22991(Class9588.field44830, method23042(var0, "_top"));
   }

   public static Class7287 method23033(Class3209 var0) {
      return new Class7287()
         .method22991(Class9588.field44833, method23042(var0, "_side"))
         .method22991(Class9588.field44831, method23042(var0, "_front"))
         .method22991(Class9588.field44828, method23042(var0, "_end"));
   }

   public static Class7287 method23034(Class3209 var0) {
      return new Class7287().method22991(Class9588.field44830, method23042(var0, "_top"));
   }

   public static Class7287 method23035(Class3209 var0, Class3209 var1) {
      return new Class7287()
         .method22991(Class9588.field44827, method23042(var0, "_front"))
         .method22991(Class9588.field44839, method23041(var1))
         .method22991(Class9588.field44838, method23042(var0, "_top"))
         .method22991(Class9588.field44834, method23042(var0, "_front"))
         .method22991(Class9588.field44836, method23042(var0, "_side"))
         .method22991(Class9588.field44835, method23042(var0, "_side"))
         .method22991(Class9588.field44837, method23042(var0, "_front"));
   }

   public static Class7287 method23036(Class3209 var0, Class3209 var1) {
      return new Class7287()
         .method22991(Class9588.field44827, method23042(var0, "_front"))
         .method22991(Class9588.field44839, method23041(var1))
         .method22991(Class9588.field44838, method23042(var0, "_top"))
         .method22991(Class9588.field44834, method23042(var0, "_front"))
         .method22991(Class9588.field44835, method23042(var0, "_front"))
         .method22991(Class9588.field44836, method23042(var0, "_side"))
         .method22991(Class9588.field44837, method23042(var0, "_side"));
   }

   public static Class7287 method23037(Class3209 var0) {
      return new Class7287().method22991(Class9588.field44859, method23042(var0, "_log_lit")).method22991(Class9588.field44853, method23042(var0, "_fire"));
   }

   public static Class7287 method23038(Class3257 var0) {
      return new Class7287().method22991(Class9588.field44858, method23043(var0));
   }

   public static Class7287 method23039(Class3209 var0) {
      return new Class7287().method22991(Class9588.field44858, method23041(var0));
   }

   public static Class7287 method23040(ResourceLocation var0) {
      return new Class7287().method22991(Class9588.field44858, var0);
   }

   public static ResourceLocation method23041(Class3209 var0) {
      ResourceLocation var3 = Class2348.field16072.method9181(var0);
      return new ResourceLocation(var3.method8293(), "block/" + var3.method8292());
   }

   public static ResourceLocation method23042(Class3209 var0, String var1) {
      ResourceLocation var4 = Class2348.field16072.method9181(var0);
      return new ResourceLocation(var4.method8293(), "block/" + var4.method8292() + var1);
   }

   public static ResourceLocation method23043(Class3257 var0) {
      ResourceLocation var3 = Class2348.field16075.method9181(var0);
      return new ResourceLocation(var3.method8293(), "item/" + var3.method8292());
   }

   public static ResourceLocation method23044(Class3257 var0, String var1) {
      ResourceLocation var4 = Class2348.field16075.method9181(var0);
      return new ResourceLocation(var4.method8293(), "item/" + var4.method8292() + var1);
   }
}
