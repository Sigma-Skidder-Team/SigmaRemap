package mapped;

import com.mojang.authlib.GameProfile;
import java.util.Date;

public class Class9731 {
   private static String[] field45434;
   private final GameProfile field45435;
   private final Date field45436;
   private volatile long field45437;

   private Class9731(GameProfile var1, Date var2) {
      this.field45435 = var1;
      this.field45436 = var2;
   }

   public GameProfile method38116() {
      return this.field45435;
   }

   public Date method38117() {
      return this.field45436;
   }

   public void method38118(long var1) {
      this.field45437 = var1;
   }

   public long method38119() {
      return this.field45437;
   }

   // $VF: synthetic method
   public Class9731(GameProfile var1, Date var2, Class8461 var3) {
      this(var1, var2);
   }

   // $VF: synthetic method
   public static Date method38120(Class9731 var0) {
      return var0.field45436;
   }
}
