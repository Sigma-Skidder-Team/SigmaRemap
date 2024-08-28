package mapped;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Class7491 extends Class7487 {
   public static final Codec<Class7491> field32193 = RecordCodecBuilder.create(
      var0 -> var0.group(Class7487.field32183.listOf().fieldOf("elements").forGetter(var0x -> var0x.field32194), method24379()).apply(var0, Class7491::new)
   );
   private final List<Class7487> field32194;

   public Class7491(List<Class7487> var1, Class109 var2) {
      super(var2);
      if (!var1.isEmpty()) {
         this.field32194 = var1;
         this.method24418(var2);
      } else {
         throw new IllegalArgumentException("Elements are empty");
      }
   }

   @Override
   public List<Class8266> method24374(Class8761 var1, BlockPos var2, Class80 var3, Random var4) {
      return this.field32194.get(0).method24374(var1, var2, var3, var4);
   }

   @Override
   public Class9764 method24375(Class8761 var1, BlockPos var2, Class80 var3) {
      Class9764 var6 = Class9764.method38386();

      for (Class7487 var8 : this.field32194) {
         Class9764 var9 = var8.method24375(var1, var2, var3);
         var6.method38392(var9);
      }

      return var6;
   }

   @Override
   public boolean method24376(
           Class8761 var1, Class1658 var2, Class7480 var3, Class5646 var4, BlockPos var5, BlockPos var6, Class80 var7, Class9764 var8, Random var9, boolean var10
   ) {
      for (Class7487 var14 : this.field32194) {
         if (!var14.method24376(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10)) {
            return false;
         }
      }

      return true;
   }

   @Override
   public Class8325<?> method24377() {
      return Class8325.field35771;
   }

   @Override
   public Class7487 method24381(Class109 var1) {
      super.method24381(var1);
      this.method24418(var1);
      return this;
   }

   @Override
   public String toString() {
      return "List[" + this.field32194.stream().<CharSequence>map(Object::toString).collect(Collectors.joining(", ")) + "]";
   }

   private void method24418(Class109 var1) {
      this.field32194.forEach(var1x -> var1x.method24381(var1));
   }
}
