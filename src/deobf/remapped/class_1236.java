package remapped;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.List;
import java.util.Set;
import java.util.UUID;

public class class_1236 {
   private static String[] field_6818;
   public final UUID field_6814;
   public final int field_6815;
   public final class_66 field_6819;
   public final class_3998 field_6820;
   public final class_1331 field_6821;
   public final class_1331 field_6816;
   public final int field_6823;
   public final List<String> field_6817 = Lists.newArrayList();
   public final Set<class_1331> field_6822 = Sets.newHashSet();

   public class_1236(UUID var1, int var2, class_66 var3, class_3998 var4, class_1331 var5, class_1331 var6, int var7) {
      this.field_6814 = var1;
      this.field_6815 = var2;
      this.field_6819 = var3;
      this.field_6820 = var4;
      this.field_6821 = var5;
      this.field_6816 = var6;
      this.field_6823 = var7;
   }

   public boolean method_5488(class_1331 var1) {
      return this.field_6821 != null && this.field_6821.equals(var1);
   }

   public UUID method_5489() {
      return this.field_6814;
   }

   public String method_5486() {
      return class_4045.method_18611(this.field_6814);
   }

   @Override
   public String toString() {
      return this.method_5486();
   }

   public boolean method_5487() {
      return this.field_6816 != null;
   }
}
