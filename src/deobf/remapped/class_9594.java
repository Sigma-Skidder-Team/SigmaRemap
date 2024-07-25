package remapped;

import com.google.common.collect.Iterators;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;
import java.util.function.Predicate;
import java.util.stream.Stream;

public enum class_9594 implements Iterable<class_240>, Predicate<class_240> {
   field_48893(
      new class_240[]{class_240.field_818, class_240.field_804, class_240.field_800, class_240.field_809},
      new class_9249[]{class_9249.field_47215, class_9249.field_47219}
   ),
   field_48896(new class_240[]{class_240.field_817, class_240.field_802}, new class_9249[]{class_9249.field_47216});

   private final class_240[] field_48898;
   private final class_9249[] field_48894;

   private class_9594(class_240[] var3, class_9249[] var4) {
      this.field_48898 = var3;
      this.field_48894 = var4;
   }

   public class_240 method_44313(Random var1) {
      return class_9665.<class_240>method_44697(this.field_48898, var1);
   }

   public boolean test(class_240 var1) {
      return var1 != null && var1.method_1029().method_42628() == this;
   }

   @Override
   public Iterator<class_240> iterator() {
      return Iterators.forArray(this.field_48898);
   }

   public Stream<class_240> method_44315() {
      return Arrays.<class_240>stream(this.field_48898);
   }
}
