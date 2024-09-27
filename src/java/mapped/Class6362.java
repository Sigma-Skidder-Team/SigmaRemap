package mapped;

import java.util.List;

public class Class6362 extends ViaVersion7<Class1931, Class1931, Class1929, Class1929> {
   private static String[] field27926;
   public static final Class3032<Short, Float> field27927 = new Class3043(BruhMotha.field22532);
   public static final Class3032<List<Class8656>, List<Class8656>> field27928 = new Class3038(Class7593.field32598);

   public Class6362() {
      super(Class1931.class, Class1931.class, Class1929.class, Class1929.class);
   }

   @Override
   public void method19341() {
      this.method19356(Class187.field702, 25, 25, new Class4034(this));
      this.method19356(Class187.field702, 70, 70, new Class3931(this));
      this.method19356(Class187.field702, 57, 57, new Class3960(this));
      this.method19356(Class187.field702, 3, 3, new Class3761(this));
      this.method19356(Class187.field702, 5, 5, new Class3845(this));
      this.method19356(Class187.field702, 50, 50, new Class4045(this));
      this.method19351(Class187.field702, 22, 22, new Class4018(this));
   }

   public int method19380(int var1) {
      int var4 = var1;
      if (var1 >= 24) {
         var4 = var1 + 1;
      }

      if (var1 >= 248) {
         var4 += 4;
      }

      if (var1 >= 296) {
         var4 += 6;
      }

      if (var1 >= 354) {
         var4 += 4;
      }

      if (var1 >= 372) {
         var4 += 4;
      }

      return var4;
   }

   @Override
   public void method19342(Class7161 var1) {
      var1.method22440(new Class6048(var1));
   }
}
