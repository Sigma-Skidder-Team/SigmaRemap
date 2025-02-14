package net.minecraft.advancements;

import com.google.common.collect.Maps;
import mapped.*;
import net.minecraft.util.ResourceLocation;

import java.util.Map;
import javax.annotation.Nullable;

public class CriteriaTriggers {
   private static final Map<ResourceLocation, Class4907<?>> field44464 = Maps.newHashMap();
   public static final Class4908 field44465 = method36999(new Class4908());
   public static final Class4905 field44466 = method36999(new Class4905(new ResourceLocation("player_killed_entity")));
   public static final Class4905 field44467 = method36999(new Class4905(new ResourceLocation("entity_killed_player")));
   public static final Class4910 field44468 = method36999(new Class4910());
   public static final Class4883 field44469 = method36999(new Class4883());
   public static final Class4897 field44470 = method36999(new Class4897());
   public static final Class4885 PLAYER_HURT_ENTITY = method36999(new Class4885());
   public static final Class4909 ENTITY_HURT_PLAYER = method36999(new Class4909());
   public static final Class4912 field44473 = method36999(new Class4912());
   public static final Class4903 field44474 = method36999(new Class4903());
   public static final Class4879 field44475 = method36999(new Class4879());
   public static final Class4886 field44476 = method36999(new Class4886());
   public static final Class4877 field44477 = method36999(new Class4877());
   public static final Class4881 field44478 = method36999(new Class4881());
   public static final Class4891 field44479 = method36999(new Class4891());
   public static final Class4876 field44480 = method36999(new Class4876(new ResourceLocation("location")));
   public static final Class4876 field44481 = method36999(new Class4876(new ResourceLocation("slept_in_bed")));
   public static final Class4894 field44482 = method36999(new Class4894());
   public static final Class4898 field44483 = method36999(new Class4898());
   public static final Class4889 field44484 = method36999(new Class4889());
   public static final Class4893 field44485 = method36999(new Class4893());
   public static final Class4901 CHANGED_DIMENSION = method36999(new Class4901());
   public static final Class4873 field44487 = method36999(new Class4873());
   public static final Class4892 field44488 = method36999(new Class4892());
   public static final Class4899 field44489 = method36999(new Class4899());
   public static final Class4911 field44490 = method36999(new Class4911());
   public static final Class4882 field44491 = method36999(new Class4882());
   public static final Class4878 field44492 = method36999(new Class4878());
   public static final Class4900 field44493 = method36999(new Class4900());
   public static final Class4895 field44494 = method36999(new Class4895());
   public static final Class4887 field44495 = method36999(new Class4887());
   public static final Class4888 field44496 = method36999(new Class4888());
   public static final Class4902 field44497 = method36999(new Class4902());
   public static final Class4876 field44498 = method36999(new Class4876(new ResourceLocation("hero_of_the_village")));
   public static final Class4876 field44499 = method36999(new Class4876(new ResourceLocation("voluntary_exile")));
   public static final Class4875 field44500 = method36999(new Class4875());
   public static final Class4880 field44501 = method36999(new Class4880());
   public static final Class4906 field44502 = method36999(new Class4906());
   public static final Class4904 field44503 = method36999(new Class4904());
   public static final Class4890 field44504 = method36999(new Class4890());
   public static final Class4884 field44505 = method36999(new Class4884());
   public static final Class4896 PLAYER_ENTITY_INTERACTION = method36999(new Class4896());

   private static <T extends Class4907<?>> T method36999(T var0) {
      if (!field44464.containsKey(var0.method15044())) {
         field44464.put(var0.method15044(), var0);
         return (T)var0;
      } else {
         throw new IllegalArgumentException("Duplicate criterion id " + var0.method15044());
      }
   }

   @Nullable
   public static <T extends Class4477> Class4907<T> method37000(ResourceLocation var0) {
      return (Class4907<T>)field44464.get(var0);
   }

   public static Iterable<? extends Class4907<?>> method37001() {
      return field44464.values();
   }
}
