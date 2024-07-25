package remapped;

import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.ObjectArraySet;
import java.util.BitSet;
import java.util.List;
import java.util.Set;

public class class_8845 {
   private static String[] field_45233;
   public static final class_8845 field_45235 = new class_1978();
   private final Set<RenderLayer> field_45232 = new ObjectArraySet();
   private final Set<RenderLayer> field_45236 = new ObjectArraySet();
   private boolean field_45230 = true;
   private final List<class_3757> field_45238 = Lists.newArrayList();
   private class_6807 field_45234 = new class_6807();
   private class_7649 field_45237;
   private BitSet[] field_45231 = new BitSet[RenderLayer.field_17580.length];

   public boolean method_40691() {
      return this.field_45230;
   }

   public boolean method_40698(RenderLayer var1) {
      return !this.field_45232.contains(var1);
   }

   public List<class_3757> method_40699() {
      return this.field_45238;
   }

   public boolean method_40688(Direction var1, Direction var2) {
      return !XRayModule.field_37635.method_42015() ? this.field_45234.method_31246(var1, var2) : true;
   }

   public BitSet method_40690(RenderLayer var1) {
      return this.field_45231[var1.method_16704()];
   }

   public void method_40700(RenderLayer var1, BitSet var2) {
      this.field_45231[var1.method_16704()] = var2;
   }

   public boolean method_40693(RenderLayer var1) {
      return this.field_45236.contains(var1);
   }

   public void method_40689(RenderLayer var1) {
      this.field_45236.add(var1);
   }

   public void method_40697(RenderLayer var1) {
      this.field_45232.add(var1);
   }
}
