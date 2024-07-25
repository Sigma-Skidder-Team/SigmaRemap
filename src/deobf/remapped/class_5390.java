package remapped;

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import javax.annotation.Nullable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class class_5390<C extends class_6157> {
   public static final BiMap<String, class_5390<?>> field_27500 = HashBiMap.create();
   private static final Map<class_5390<?>, class_1841> field_27497 = Maps.newHashMap();
   private static final Logger field_27496 = LogManager.getLogger();
   public static final class_5390<class_7805> field_27518 = method_24553("Pillager_Outpost", new class_6293(class_7805.field_39518), class_1841.field_9349);
   public static final class_5390<class_9507> field_27498 = method_24553("Mineshaft", new class_2463(class_9507.field_48407), class_1841.field_9353);
   public static final class_5390<class_1941> field_27513 = method_24553("Mansion", new class_7134(class_1941.field_9913), class_1841.field_9349);
   public static final class_5390<class_1941> field_27517 = method_24553("Jungle_Pyramid", new class_7301(class_1941.field_9913), class_1841.field_9349);
   public static final class_5390<class_1941> field_27506 = method_24553("Desert_Pyramid", new class_7551(class_1941.field_9913), class_1841.field_9349);
   public static final class_5390<class_1941> field_27519 = method_24553("Igloo", new class_7299(class_1941.field_9913), class_1841.field_9349);
   public static final class_5390<class_1267> field_27512 = method_24553("Ruined_Portal", new class_4721(class_1267.field_6970), class_1841.field_9349);
   public static final class_5390<class_3294> field_27508 = method_24553("Shipwreck", new class_9188(class_3294.field_16304), class_1841.field_9349);
   public static final class_2664 field_27515 = method_24553("Swamp_Hut", new class_2664(class_1941.field_9913), class_1841.field_9349);
   public static final class_5390<class_1941> field_27511 = method_24553("Stronghold", new class_1009(class_1941.field_9913), class_1841.field_9344);
   public static final class_5390<class_1941> field_27509 = method_24553("Monument", new class_5202(class_1941.field_9913), class_1841.field_9349);
   public static final class_5390<class_8401> field_27495 = method_24553("Ocean_Ruin", new class_871(class_8401.field_42980), class_1841.field_9349);
   public static final class_5390<class_1941> field_27510 = method_24553("Fortress", new class_1019(class_1941.field_9913), class_1841.field_9352);
   public static final class_5390<class_1941> field_27504 = method_24553("EndCity", new class_67(class_1941.field_9913), class_1841.field_9349);
   public static final class_5390<class_4080> field_27501 = method_24553("Buried_Treasure", new class_6148(class_4080.field_19858), class_1841.field_9353);
   public static final class_5390<class_7805> field_27516 = method_24553("Village", new class_6994(class_7805.field_39518), class_1841.field_9349);
   public static final class_5390<class_1941> field_27503 = method_24553("Nether_Fossil", new class_1769(class_1941.field_9913), class_1841.field_9352);
   public static final class_5390<class_7805> field_27514 = method_24553("Bastion_Remnant", new class_5827(class_7805.field_39518), class_1841.field_9349);
   public static final List<class_5390<?>> field_27502 = ImmutableList.of(field_27518, field_27516, field_27503);
   private static final Identifier field_27505 = new Identifier("jigsaw");
   private static final Map<Identifier, Identifier> field_27499 = ImmutableMap.builder()
      .put(new Identifier("nvi"), field_27505)
      .put(new Identifier("pcp"), field_27505)
      .put(new Identifier("bastionremnant"), field_27505)
      .put(new Identifier("runtime"), field_27505)
      .build();
   private final Codec<class_7865<C, class_5390<C>>> field_27507;

   private static <F extends class_5390<?>> F method_24553(String var0, F var1, class_1841 var2) {
      field_27500.put(var0.toLowerCase(Locale.ROOT), var1);
      field_27497.put(var1, var2);
      return class_8669.<F>method_39791(class_8669.field_44457, var0.toLowerCase(Locale.ROOT), (F)var1);
   }

   public class_5390(Codec<C> var1) {
      this.field_27507 = var1.fieldOf("config").xmap(var1x -> new class_7865<C, class_5390<C>>(this, (C)var1x), var0 -> var0.field_40271).codec();
   }

   public class_1841 method_24546() {
      return field_27497.get(this);
   }

   public static void method_24549() {
   }

   @Nullable
   public static class_3200<?> method_24555(class_5799 var0, CompoundNBT var1, long var2) {
      String var6 = var1.method_25965("id");
      if ("INVALID".equals(var6)) {
         return class_3200.field_15991;
      } else {
         class_5390 var7 = class_8669.field_44457.method_39806(new Identifier(var6.toLowerCase(Locale.ROOT)));
         if (var7 == null) {
            field_27496.error("Unknown feature id: {}", var6);
            return null;
         } else {
            int var8 = var1.method_25947("ChunkX");
            int var9 = var1.method_25947("ChunkZ");
            int var10 = var1.method_25947("references");
            class_9616 var11 = var1.method_25938("BB") ? new class_9616(var1.method_25922("BB")) : class_9616.method_44397();
            class_3416 var12 = var1.method_25927("Children", 10);

            try {
               class_3200 var13 = var7.method_24545(var8, var9, var11, var10, var2);

               for (int var14 = 0; var14 < var12.size(); var14++) {
                  CompoundNBT var15 = var12.method_15764(var14);
                  String var16 = var15.method_25965("id").toLowerCase(Locale.ROOT);
                  Identifier var17 = new Identifier(var16);
                  Identifier var18 = field_27499.getOrDefault(var17, var17);
                  class_2746 var19 = class_8669.field_44364.method_39806(var18);
                  if (var19 == null) {
                     field_27496.error("Unknown structure piece id: {}", var18);
                  } else {
                     try {
                        class_7060 var20 = var19.method_12378(var0, var15);
                        var13.method_14736().add(var20);
                     } catch (Exception var21) {
                        field_27496.error("Exception loading structure piece with id {}", var18, var21);
                     }
                  }
               }

               return var13;
            } catch (Exception var22) {
               field_27496.error("Failed Start with id {}", var6, var22);
               return null;
            }
         }
      }
   }

   public Codec<class_7865<C, class_5390<C>>> method_24542() {
      return this.field_27507;
   }

   public class_7865<C, ? extends class_5390<C>> method_24551(C var1) {
      return new class_7865(this, (C)var1);
   }

   @Nullable
   public class_1331 method_24548(class_4924 var1, class_2033 var2, class_1331 var3, int var4, boolean var5, long var6, class_4757 var8) {
      int var11 = var8.method_21953();
      int var12 = var3.method_12173() >> 4;
      int var13 = var3.method_12185() >> 4;
      int var14 = 0;

      for (class_8679 var15 = new class_8679(); var14 <= var4; var14++) {
         for (int var16 = -var14; var16 <= var14; var16++) {
            boolean var17 = var16 == -var14 || var16 == var14;

            for (int var18 = -var14; var18 <= var14; var18++) {
               boolean var19 = var18 == -var14 || var18 == var14;
               if (var17 || var19) {
                  int var20 = var12 + var11 * var16;
                  int var21 = var13 + var11 * var18;
                  class_2034 var22 = this.method_24552(var8, var6, var15, var20, var21);
                  class_5990 var23 = var1.method_22554(var22.field_10328, var22.field_10327, class_7335.field_37491);
                  class_3200 var24 = var2.method_9528(class_6979.method_31922(var23.method_27352(), 0), this, var23);
                  if (var24 != null && var24.method_14731()) {
                     if (var5 && var24.method_14725()) {
                        var24.method_14721();
                        return var24.method_14730();
                     }

                     if (!var5) {
                        return var24.method_14730();
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

   public boolean method_24544() {
      return true;
   }

   public final class_2034 method_24552(class_4757 var1, long var2, class_8679 var4, int var5, int var6) {
      int var9 = var1.method_21953();
      int var10 = var1.method_21952();
      int var11 = Math.floorDiv(var5, var9);
      int var12 = Math.floorDiv(var6, var9);
      var4.method_39865(var2, var11, var12, var1.method_21951());
      int var13;
      int var14;
      if (!this.method_24544()) {
         var13 = (var4.nextInt(var9 - var10) + var4.nextInt(var9 - var10)) / 2;
         var14 = (var4.nextInt(var9 - var10) + var4.nextInt(var9 - var10)) / 2;
      } else {
         var13 = var4.nextInt(var9 - var10);
         var14 = var4.nextInt(var9 - var10);
      }

      return new class_2034(var11 * var9 + var13, var12 * var9 + var14);
   }

   public boolean method_24543(class_6541 var1, class_3498 var2, long var3, class_8679 var5, int var6, int var7, class_6325 var8, class_2034 var9, C var10) {
      return true;
   }

   private class_3200<C> method_24545(int var1, int var2, class_9616 var3, int var4, long var5) {
      return this.method_24558().method_6057(this, var1, var2, var3, var4, var5);
   }

   public class_3200<?> method_24554(
      class_6322 var1,
      class_6541 var2,
      class_3498 var3,
      class_5799 var4,
      long var5,
      class_2034 var7,
      class_6325 var8,
      int var9,
      class_8679 var10,
      class_4757 var11,
      C var12
   ) {
      class_2034 var15 = this.method_24552(var11, var5, var10, var7.field_10328, var7.field_10327);
      if (var7.field_10328 == var15.field_10328
         && var7.field_10327 == var15.field_10327
         && this.method_24543(var2, var3, var5, var10, var7.field_10328, var7.field_10327, var8, var15, (C)var12)) {
         class_3200 var16 = this.method_24545(var7.field_10328, var7.field_10327, class_9616.method_44397(), var9, var5);
         var16.method_14733(var1, var2, var4, var7.field_10328, var7.field_10327, var8, var12);
         if (var16.method_14731()) {
            return var16;
         }
      }

      return class_3200.field_15991;
   }

   public abstract class_1329<C> method_24558();

   public String method_24556() {
      return (String)field_27500.inverse().get(this);
   }

   public List<class_3222> method_24557() {
      return ImmutableList.of();
   }

   public List<class_3222> method_24550() {
      return ImmutableList.of();
   }
}
