package mapped;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.List;
import java.util.Set;
import java.util.UUID;

public class Class8918 {
   private static String[] field40361;
   public final UUID field40362;
   public final int field40363;
   public final String field40364;
   public final String field40365;
   public final int field40366;
   public final float field40367;
   public final float field40368;
   public final Class2955 field40369;
   public final String field40370;
   public final Class8238 field40371;
   public final boolean field40372;
   public final List<String> field40373 = Lists.newArrayList();
   public final List<String> field40374 = Lists.newArrayList();
   public final List<String> field40375 = Lists.newArrayList();
   public final List<String> field40376 = Lists.newArrayList();
   public final Set<BlockPos> field40377 = Sets.newHashSet();
   public final Set<BlockPos> field40378 = Sets.newHashSet();

   public Class8918(
      UUID var1, int var2, String var3, String var4, int var5, float var6, float var7, Class2955 var8, String var9, Class8238 var10, boolean var11
   ) {
      this.field40362 = var1;
      this.field40363 = var2;
      this.field40364 = var3;
      this.field40365 = var4;
      this.field40366 = var5;
      this.field40367 = var6;
      this.field40368 = var7;
      this.field40369 = var8;
      this.field40370 = var9;
      this.field40371 = var10;
      this.field40372 = var11;
   }

   private boolean method32591(BlockPos var1) {
      return this.field40377.stream().anyMatch(var1::equals);
   }

   private boolean method32592(BlockPos var1) {
      return this.field40378.contains(var1);
   }

   public UUID method32593() {
      return this.field40362;
   }

   // $VF: synthetic method
   public static boolean method32594(Class8918 var0, BlockPos var1) {
      return var0.method32592(var1);
   }

   // $VF: synthetic method
   public static boolean method32595(Class8918 var0, BlockPos var1) {
      return var0.method32591(var1);
   }
}
