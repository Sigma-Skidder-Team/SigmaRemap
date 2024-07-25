package remapped;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.List;
import java.util.Set;
import java.util.UUID;

public class class_6388 {
   private static String[] field_32625;
   public final UUID field_32624;
   public final int field_32622;
   public final String field_32620;
   public final String field_32617;
   public final int field_32627;
   public final float field_32621;
   public final float field_32618;
   public final class_66 field_32616;
   public final String field_32615;
   public final class_3998 field_32613;
   public final boolean field_32619;
   public final List<String> field_32614 = Lists.newArrayList();
   public final List<String> field_32628 = Lists.newArrayList();
   public final List<String> field_32611 = Lists.newArrayList();
   public final List<String> field_32626 = Lists.newArrayList();
   public final Set<class_1331> field_32612 = Sets.newHashSet();
   public final Set<class_1331> field_32623 = Sets.newHashSet();

   public class_6388(
      UUID var1, int var2, String var3, String var4, int var5, float var6, float var7, class_66 var8, String var9, class_3998 var10, boolean var11
   ) {
      this.field_32624 = var1;
      this.field_32622 = var2;
      this.field_32620 = var3;
      this.field_32617 = var4;
      this.field_32627 = var5;
      this.field_32621 = var6;
      this.field_32618 = var7;
      this.field_32616 = var8;
      this.field_32615 = var9;
      this.field_32613 = var10;
      this.field_32619 = var11;
   }

   private boolean method_29178(class_1331 var1) {
      return this.field_32612.stream().anyMatch(var1::equals);
   }

   private boolean method_29182(class_1331 var1) {
      return this.field_32623.contains(var1);
   }

   public UUID method_29183() {
      return this.field_32624;
   }
}
