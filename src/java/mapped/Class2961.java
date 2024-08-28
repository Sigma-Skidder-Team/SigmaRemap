package mapped;

import com.google.common.collect.*;
import com.mojang.serialization.Codec;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.annotation.Nullable;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public abstract class Class2961<C extends Class4698> {
   public static final BiMap<String, Class2961<?>> field18055 = HashBiMap.create();
   private static final Map<Class2961<?>, Class1993> field18056 = Maps.newHashMap();
   private static final Logger field18057 = LogManager.getLogger();
   public static final Class2961<Class4700> field18058 = method11363("Pillager_Outpost", new Class2968(Class4700.field22296), Class1993.field13002);
   public static final Class2961<Class4735> field18059 = method11363("Mineshaft", new Class2972(Class4735.field22425), Class1993.field13001);
   public static final Class2961<Class4712> field18060 = method11363("Mansion", new Class2976(Class4712.field22349), Class1993.field13002);
   public static final Class2961<Class4712> field18061 = method11363("Jungle_Pyramid", new Class2977(Class4712.field22349), Class1993.field13002);
   public static final Class2961<Class4712> field18062 = method11363("Desert_Pyramid", new Class2975(Class4712.field22349), Class1993.field13002);
   public static final Class2961<Class4712> field18063 = method11363("Igloo", new Class2966(Class4712.field22349), Class1993.field13002);
   public static final Class2961<Class4726> field18064 = method11363("Ruined_Portal", new Class2978(Class4726.field22392), Class1993.field13002);
   public static final Class2961<Class4737> field18065 = method11363("Shipwreck", new Class2964(Class4737.field22431), Class1993.field13002);
   public static final Class2974 field18066 = method11363("Swamp_Hut", new Class2974(Class4712.field22349), Class1993.field13002);
   public static final Class2961<Class4712> field18067 = method11363("Stronghold", new Class2962(Class4712.field22349), Class1993.field13003);
   public static final Class2961<Class4712> field18068 = method11363("Monument", new Class2971(Class4712.field22349), Class1993.field13002);
   public static final Class2961<Class4711> field18069 = method11363("Ocean_Ruin", new Class2965(Class4711.field22344), Class1993.field13002);
   public static final Class2961<Class4712> field18070 = method11363("Fortress", new Class2973(Class4712.field22349), Class1993.field13005);
   public static final Class2961<Class4712> field18071 = method11363("EndCity", new Class2960(Class4712.field22349), Class1993.field13002);
   public static final Class2961<Class4728> field18072 = method11363("Buried_Treasure", new Class2963(Class4728.field22398), Class1993.field13001);
   public static final Class2961<Class4700> field18073 = method11363("Village", new Class2969(Class4700.field22296), Class1993.field13002);
   public static final Class2961<Class4712> field18074 = method11363("Nether_Fossil", new Class2979(Class4712.field22349), Class1993.field13005);
   public static final Class2961<Class4700> field18075 = method11363("Bastion_Remnant", new Class2970(Class4700.field22296), Class1993.field13002);
   public static final List<Class2961<?>> field18076 = ImmutableList.of(field18058, field18073, field18074);
   private static final ResourceLocation field18077 = new ResourceLocation("jigsaw");
   private static final Map<ResourceLocation, ResourceLocation> field18078 = ImmutableMap.<ResourceLocation, ResourceLocation>builder()
      .put(new ResourceLocation("nvi"), field18077)
      .put(new ResourceLocation("pcp"), field18077)
      .put(new ResourceLocation("bastionremnant"), field18077)
      .put(new ResourceLocation("runtime"), field18077)
      .build();
   private final Codec<Class9300<C, Class2961<C>>> field18079;

   private static <F extends Class2961<?>> F method11363(String var0, F var1, Class1993 var2) {
      field18055.put(var0.toLowerCase(Locale.ROOT), var1);
      field18056.put(var1, var2);
      return Class2348.<F>method9194(Class2348.field16114, var0.toLowerCase(Locale.ROOT), (F)var1);
   }

   public Class2961(Codec<C> var1) {
      this.field18079 = var1.fieldOf("config").xmap(var1x -> new Class9300<C, Class2961<C>>(this, (C)var1x), var0 -> var0.field43175).codec();
   }

   public Class1993 method11364() {
      return field18056.get(this);
   }

   public static void method11365() {
   }

   @Nullable
   public static Class5444<?> method11366(Class8761 var0, Class39 var1, long var2) {
      String var6 = var1.method126("id");
      if ("INVALID".equals(var6)) {
         return Class5444.field24194;
      } else {
         Class2961 var7 = Class2348.field16114.method9184(new ResourceLocation(var6.toLowerCase(Locale.ROOT)));
         if (var7 == null) {
            field18057.error("Unknown feature id: {}", var6);
            return null;
         } else {
            int var8 = var1.method122("ChunkX");
            int var9 = var1.method122("ChunkZ");
            int var10 = var1.method122("references");
            Class9764 var11 = var1.method118("BB") ? new Class9764(var1.method128("BB")) : Class9764.method38386();
            Class41 var12 = var1.method131("Children", 10);

            try {
               Class5444 var13 = var7.method11371(var8, var9, var11, var10, var2);

               for (int var14 = 0; var14 < var12.size(); var14++) {
                  Class39 var15 = var12.method153(var14);
                  String var16 = var15.method126("id").toLowerCase(Locale.ROOT);
                  ResourceLocation var17 = new ResourceLocation(var16);
                  ResourceLocation var18 = field18078.getOrDefault(var17, var17);
                  Class7792 var19 = Class2348.field16116.method9184(var18);
                  if (var19 == null) {
                     field18057.error("Unknown structure piece id: {}", var18);
                  } else {
                     try {
                        Class4178 var20 = var19.method25881(var0, var15);
                        var13.method17111().add(var20);
                     } catch (Exception var21) {
                        field18057.error("Exception loading structure piece with id {}", var18, var21);
                     }
                  }
               }

               return var13;
            } catch (Exception var22) {
               field18057.error("Failed Start with id {}", var6, var22);
               return null;
            }
         }
      }
   }

   public Codec<Class9300<C, Class2961<C>>> method11367() {
      return this.field18079;
   }

   public Class9300<C, ? extends Class2961<C>> method11368(C var1) {
      return new Class9300(this, (C)var1);
   }

   @Nullable
   public BlockPos method11369(Class1662 var1, Class7480 var2, BlockPos var3, int var4, boolean var5, long var6, Class8483 var8) {
      int var11 = var8.method29980();
      int var12 = var3.method8304() >> 4;
      int var13 = var3.method8306() >> 4;
      int var14 = 0;

      for (Class2420 var15 = new Class2420(); var14 <= var4; var14++) {
         for (int var16 = -var14; var16 <= var14; var16++) {
            boolean var17 = var16 == -var14 || var16 == var14;

            for (int var18 = -var14; var18 <= var14; var18++) {
               boolean var19 = var18 == -var14 || var18 == var14;
               if (var17 || var19) {
                  int var20 = var12 + var11 * var16;
                  int var21 = var13 + var11 * var18;
                  Class7481 var22 = this.method11370(var8, var6, var15, var20, var21);
                  Class1670 var23 = var1.method7012(var22.field32174, var22.field32175, Class9176.field42134);
                  Class5444 var24 = var2.method24341(Class2002.method8391(var23.method7072(), 0), this, var23);
                  if (var24 != null && var24.method17117()) {
                     if (var5 && var24.method17121()) {
                        var24.method17122();
                        return var24.method17120();
                     }

                     if (!var5) {
                        return var24.method17120();
                     }
                  }

                  if (var14 == 0) {
                     break;
                  }
               }
            }

            if (var14 == 0) {
               break;
            }
         }
      }

      return null;
   }

   public boolean method11357() {
      return true;
   }

   public final Class7481 method11370(Class8483 var1, long var2, Class2420 var4, int var5, int var6) {
      int var9 = var1.method29980();
      int var10 = var1.method29981();
      int var11 = Math.floorDiv(var5, var9);
      int var12 = Math.floorDiv(var6, var9);
      var4.method10374(var2, var11, var12, var1.method29982());
      int var13;
      int var14;
      if (!this.method11357()) {
         var13 = (var4.nextInt(var9 - var10) + var4.nextInt(var9 - var10)) / 2;
         var14 = (var4.nextInt(var9 - var10) + var4.nextInt(var9 - var10)) / 2;
      } else {
         var13 = var4.nextInt(var9 - var10);
         var14 = var4.nextInt(var9 - var10);
      }

      return new Class7481(var11 * var9 + var13, var12 * var9 + var14);
   }

   public boolean method11361(Class5646 var1, Class1685 var2, long var3, Class2420 var5, int var6, int var7, Class8907 var8, Class7481 var9, C var10) {
      return true;
   }

   private Class5444<C> method11371(int var1, int var2, Class9764 var3, int var4, long var5) {
      return this.method11359().method21988(this, var1, var2, var3, var4, var5);
   }

   public Class5444<?> method11372(
      Class8904 var1,
      Class5646 var2,
      Class1685 var3,
      Class8761 var4,
      long var5,
      Class7481 var7,
      Class8907 var8,
      int var9,
      Class2420 var10,
      Class8483 var11,
      C var12
   ) {
      Class7481 var15 = this.method11370(var11, var5, var10, var7.field32174, var7.field32175);
      if (var7.field32174 == var15.field32174
         && var7.field32175 == var15.field32175
         && this.method11361(var2, var3, var5, var10, var7.field32174, var7.field32175, var8, var15, (C)var12)) {
         Class5444 var16 = this.method11371(var7.field32174, var7.field32175, Class9764.method38386(), var9, var5);
         var16.method17109(var1, var2, var4, var7.field32174, var7.field32175, var8, var12);
         if (var16.method17117()) {
            return var16;
         }
      }

      return Class5444.field24194;
   }

   public abstract Class7072<C> method11359();

   public String method11373() {
      return (String)field18055.inverse().get(this);
   }

   public List<Class6692> method11374() {
      return ImmutableList.of();
   }

   public List<Class6692> method11375() {
      return ImmutableList.of();
   }
}
