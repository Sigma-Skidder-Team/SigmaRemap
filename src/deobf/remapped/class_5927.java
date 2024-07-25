package remapped;

import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_5927<FC extends class_6157, F extends class_4285<FC>> implements class_3988<class_5927<?, ?>> {
   private static String[] field_30064;
   public static final Codec<class_5927<?, ?>> field_30063 = class_8669.field_44417.dispatch(var0 -> var0.field_30065, class_4285::method_19905);
   public static final Codec<Supplier<class_5927<?, ?>>> field_30061 = class_6833.<Supplier<class_5927<?, ?>>>method_31333(class_8669.field_44453, field_30063);
   public static final Codec<List<Supplier<class_5927<?, ?>>>> field_30067 = class_6833.<class_5927<?, ?>>method_31334(class_8669.field_44453, field_30063);
   public static final Logger field_30066 = LogManager.getLogger();
   public final F field_30065;
   public final FC field_30062;

   public class_5927(F var1, FC var2) {
      this.field_30065 = (F)var1;
      this.field_30062 = (FC)var2;
   }

   public F method_27103() {
      return this.field_30065;
   }

   public FC method_27102() {
      return this.field_30062;
   }

   public class_5927<?, ?> method_27108(class_3010<?> var1) {
      return class_4285.field_20744.method_19909(new class_9658(() -> this, var1));
   }

   public class_2642 method_27105(float var1) {
      return new class_2642(this, var1);
   }

   public boolean method_27104(class_700 var1, class_6541 var2, Random var3, class_1331 var4) {
      return this.field_30065.method_19907(var1, var2, var3, var4, this.field_30062);
   }

   public Stream<class_5927<?, ?>> method_27106() {
      return Stream.<class_5927<?, ?>>concat(Stream.of(this), this.field_30062.method_28248());
   }
}
