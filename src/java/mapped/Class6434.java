package mapped;

import com.mojang.serialization.Codec;
import java.util.Random;

public abstract class Class6434 {
   public static final Codec<Class6434> field28272 = Registry.field16082.dispatch("predicate_type", Class6434::method19541, Class9277::method34966);

   public abstract boolean method19540(Class7380 var1, Random var2);

   public abstract Class9277<?> method19541();
}
