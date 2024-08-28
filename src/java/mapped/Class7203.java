package mapped;

import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Class7203 implements Class7202 {
   private static String[] field30917;
   private final Class9264 field30918;
   private final Class6391 field30919;
   private final Class1713 field30920;
   private final boolean field30921;

   public Class7203(Class9264 var1, Class6391 var2, Class1713 var3, boolean var4) {
      this.field30918 = var1;
      this.field30919 = var2;
      this.field30920 = var3;
      this.field30921 = var4;
   }

   @Override
   public List<Class8557> method22619(Class7380 var1, Direction var2, Random var3) {
      return Collections.<Class8557>emptyList();
   }

   @Override
   public boolean method22620() {
      return false;
   }

   @Override
   public boolean method22621() {
      return true;
   }

   @Override
   public boolean method22622() {
      return this.field30921;
   }

   @Override
   public boolean method22623() {
      return true;
   }

   @Override
   public Class1713 method22624() {
      return this.field30920;
   }

   @Override
   public Class9264 method22625() {
      return this.field30918;
   }

   @Override
   public Class6391 method22626() {
      return this.field30919;
   }
}
