package mapped;

public class Class697 implements Runnable {
   private static String[] field3558;

   @Override
   public void run() {
      for (Class7161 var4 : Class8042.method27614().method34417()) {
         Class6038 var5 = var4.method22465();
         if (var5 != null && var5.method18683().method19390(Class6363.class)) {
            Class6042 var6 = var4.<Class6042>method22438(Class6042.class);
            if (var6 != null) {
               long var7 = var6.method18705();
               if (var7 <= System.currentTimeMillis() && var4.method22464().isOpen()) {
                  Class8042.method27614().method34424().<Class5410>method31084(Class5410.class).method16998(var4);
               }
            }
         }
      }
   }
}
