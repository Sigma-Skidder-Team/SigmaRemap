package remapped;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class class_6556 extends class_2609 {
   public static final Codec<class_6556> field_33418 = RecordCodecBuilder.create(
      var0 -> var0.group(class_2609.field_12888.listOf().fieldOf("elements").forGetter(var0x -> var0x.field_33416), method_11825())
            .apply(var0, class_6556::new)
   );
   private final List<class_2609> field_33416;

   public class_6556(List<class_2609> var1, class_7599 var2) {
      super(var2);
      if (!var1.isEmpty()) {
         this.field_33416 = var1;
         this.method_29905(var2);
      } else {
         throw new IllegalArgumentException("Elements are empty");
      }
   }

   @Override
   public List<class_4099> method_11829(class_5799 var1, class_1331 var2, class_6631 var3, Random var4) {
      return this.field_33416.get(0).method_11829(var1, var2, var3, var4);
   }

   @Override
   public class_9616 method_11832(class_5799 var1, class_1331 var2, class_6631 var3) {
      class_9616 var6 = class_9616.method_44397();

      for (class_2609 var8 : this.field_33416) {
         class_9616 var9 = var8.method_11832(var1, var2, var3);
         var6.method_44392(var9);
      }

      return var6;
   }

   @Override
   public boolean method_11827(
      class_5799 var1,
      class_700 var2,
      class_2033 var3,
      class_6541 var4,
      class_1331 var5,
      class_1331 var6,
      class_6631 var7,
      class_9616 var8,
      Random var9,
      boolean var10
   ) {
      for (class_2609 var14 : this.field_33416) {
         if (!var14.method_11827(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10)) {
            return false;
         }
      }

      return true;
   }

   @Override
   public class_4263<?> method_11836() {
      return class_4263.field_20662;
   }

   @Override
   public class_2609 method_11828(class_7599 var1) {
      super.method_11828(var1);
      this.method_29905(var1);
      return this;
   }

   @Override
   public String toString() {
      return "List[" + this.field_33416.stream().<CharSequence>map(Object::toString).collect(Collectors.joining(", ")) + "]";
   }

   private void method_29905(class_7599 var1) {
      this.field_33416.forEach(var1x -> var1x.method_11828(var1));
   }
}
