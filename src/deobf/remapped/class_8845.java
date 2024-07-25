package remapped;

import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.ObjectArraySet;
import java.util.BitSet;
import java.util.List;
import java.util.Set;

public class class_8845 {
   private static String[] field_45233;
   public static final class_8845 field_45235 = new class_1978();
   private final Set<class_3581> field_45232 = new ObjectArraySet();
   private final Set<class_3581> field_45236 = new ObjectArraySet();
   private boolean field_45230 = true;
   private final List<class_3757> field_45238 = Lists.newArrayList();
   private class_6807 field_45234 = new class_6807();
   private class_7649 field_45237;
   private BitSet[] field_45231 = new BitSet[class_3581.field_17580.length];

   public boolean method_40691() {
      return this.field_45230;
   }

   public boolean method_40698(class_3581 var1) {
      return !this.field_45232.contains(var1);
   }

   public List<class_3757> method_40699() {
      return this.field_45238;
   }

   public boolean method_40688(class_240 var1, class_240 var2) {
      return !class_7366.field_37635.method_42015() ? this.field_45234.method_31246(var1, var2) : true;
   }

   public BitSet method_40690(class_3581 var1) {
      return this.field_45231[var1.method_16704()];
   }

   public void method_40700(class_3581 var1, BitSet var2) {
      this.field_45231[var1.method_16704()] = var2;
   }

   public boolean method_40693(class_3581 var1) {
      return this.field_45236.contains(var1);
   }

   public void method_40689(class_3581 var1) {
      this.field_45236.add(var1);
   }

   public void method_40697(class_3581 var1) {
      this.field_45232.add(var1);
   }
}
