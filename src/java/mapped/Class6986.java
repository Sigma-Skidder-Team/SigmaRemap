package mapped;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.List;
import java.util.Set;
import java.util.UUID;

public class Class6986 {
   private static String[] field30218;
   public final UUID field30219;
   public final int field30220;
   public final Class2955 field30221;
   public final Class8238 field30222;
   public final BlockPos field30223;
   public final BlockPos field30224;
   public final int field30225;
   public final List<String> field30226 = Lists.newArrayList();
   public final Set<BlockPos> field30227 = Sets.newHashSet();

   public Class6986(UUID var1, int var2, Class2955 var3, Class8238 var4, BlockPos var5, BlockPos var6, int var7) {
      this.field30219 = var1;
      this.field30220 = var2;
      this.field30221 = var3;
      this.field30222 = var4;
      this.field30223 = var5;
      this.field30224 = var6;
      this.field30225 = var7;
   }

   public boolean method21606(BlockPos var1) {
      return this.field30223 != null && this.field30223.equals(var1);
   }

   public UUID method21607() {
      return this.field30219;
   }

   public String method21608() {
      return Class8249.method28763(this.field30219);
   }

   @Override
   public String toString() {
      return this.method21608();
   }

   public boolean method21609() {
      return this.field30224 != null;
   }
}
