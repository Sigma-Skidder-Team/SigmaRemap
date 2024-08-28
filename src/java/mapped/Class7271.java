package mapped;

import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class Class7271<U> {
   public final List<Class9030<U>> field31192;
   private final Random field31193 = new Random();

   public Class7271() {
      this(Lists.newArrayList());
   }

   private Class7271(List<Class9030<U>> var1) {
      this.field31192 = Lists.newArrayList(var1);
   }

   public static <U> Codec<Class7271<U>> method22836(Codec<U> var0) {
      return Class9030.method33435(var0).listOf().xmap(Class7271::new, var0x -> var0x.field31192);
   }

   public Class7271<U> method22837(U var1, int var2) {
      this.field31192.add(new Class9030<>(var1, var2));
      return this;
   }

   public Class7271<U> method22838() {
      return this.method22839(this.field31193);
   }

   public Class7271<U> method22839(Random var1) {
      this.field31192.forEach(var1x -> Class9030.method33439(var1x, var1.nextFloat()));
      this.field31192.sort(Comparator.comparingDouble(var0 -> Class9030.method33438(var0)));
      return this;
   }

   public boolean method22840() {
      return this.field31192.isEmpty();
   }

   public Stream<U> method22841() {
      return this.field31192.stream().<U>map(Class9030::method33434);
   }

   public U method22842(Random var1) {
      return this.method22839(var1).method22841().findFirst().orElseThrow(RuntimeException::new);
   }

   @Override
   public String toString() {
      return "WeightedList[" + this.field31192 + "]";
   }
}
