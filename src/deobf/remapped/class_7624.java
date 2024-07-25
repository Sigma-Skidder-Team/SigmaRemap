package remapped;

import com.google.common.collect.Lists;
import com.mojang.serialization.Dynamic;
import java.util.List;
import java.util.Random;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_7624 extends class_7060 {
   private static final Logger field_38788 = LogManager.getLogger();
   public final class_2609 field_38789;
   public class_1331 field_38792;
   private final int field_38795;
   public final class_6631 field_38790;
   private final List<class_98> field_38794 = Lists.newArrayList();
   private final class_5799 field_38793;

   public class_7624(class_5799 var1, class_2609 var2, class_1331 var3, int var4, class_6631 var5, class_9616 var6) {
      super(class_2746.field_13430, 0);
      this.field_38793 = var1;
      this.field_38789 = var2;
      this.field_38792 = var3;
      this.field_38795 = var4;
      this.field_38790 = var5;
      this.field_36435 = var6;
   }

   public class_7624(class_5799 var1, CompoundNBT var2) {
      super(class_2746.field_13430, var2);
      this.field_38793 = var1;
      this.field_38792 = new class_1331(var2.method_25947("PosX"), var2.method_25947("PosY"), var2.method_25947("PosZ"));
      this.field_38795 = var2.method_25947("ground_level_delta");
      this.field_38789 = class_2609.field_12888
         .parse(class_3504.field_17178, var2.method_25937("pool_element"))
         .resultOrPartial(field_38788::error)
         .orElse(class_2044.field_10352);
      this.field_38790 = class_6631.valueOf(var2.method_25965("rotation"));
      this.field_36435 = this.field_38789.method_11832(var1, this.field_38792, this.field_38790);
      class_3416 var5 = var2.method_25927("junctions", 10);
      this.field_38794.clear();
      var5.forEach(var1x -> this.field_38794.add(class_98.method_287(new Dynamic(class_3504.field_17178, var1x))));
   }

   @Override
   public void method_32517(CompoundNBT var1) {
      var1.method_25931("PosX", this.field_38792.method_12173());
      var1.method_25931("PosY", this.field_38792.method_12165());
      var1.method_25931("PosZ", this.field_38792.method_12185());
      var1.method_25931("ground_level_delta", this.field_38795);
      class_2609.field_12888
         .encodeStart(class_3504.field_17178, this.field_38789)
         .resultOrPartial(field_38788::error)
         .ifPresent(var1x -> var1.method_25946("pool_element", var1x));
      var1.method_25941("rotation", this.field_38790.name());
      class_3416 var4 = new class_3416();

      for (class_98 var6 : this.field_38794) {
         var4.add((class_8406)var6.method_289(class_3504.field_17178).getValue());
      }

      var1.method_25946("junctions", var4);
   }

   @Override
   public boolean method_32501(class_700 var1, class_2033 var2, class_6541 var3, Random var4, class_9616 var5, class_2034 var6, class_1331 var7) {
      return this.method_34557(var1, var2, var3, var4, var5, var7, false);
   }

   public boolean method_34557(class_700 var1, class_2033 var2, class_6541 var3, Random var4, class_9616 var5, class_1331 var6, boolean var7) {
      return this.field_38789.method_11827(this.field_38793, var1, var2, var3, this.field_38792, var6, this.field_38790, var5, var4, var7);
   }

   @Override
   public void method_32508(int var1, int var2, int var3) {
      super.method_32508(var1, var2, var3);
      this.field_38792 = this.field_38792.method_6104(var1, var2, var3);
   }

   @Override
   public class_6631 method_32528() {
      return this.field_38790;
   }

   @Override
   public String toString() {
      return String.format("<%s | %s | %s | %s>", this.getClass().getSimpleName(), this.field_38792, this.field_38790, this.field_38789);
   }

   public class_2609 method_34553() {
      return this.field_38789;
   }

   public class_1331 method_34555() {
      return this.field_38792;
   }

   public int method_34558() {
      return this.field_38795;
   }

   public void method_34556(class_98 var1) {
      this.field_38794.add(var1);
   }

   public List<class_98> method_34554() {
      return this.field_38794;
   }
}
