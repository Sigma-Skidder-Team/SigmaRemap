package remapped;

import com.mojang.authlib.GameProfile;
import java.util.Date;

public class class_9499 {
   private static String[] field_48383;
   private final GameProfile field_48386;
   private final Date field_48385;
   private volatile long field_48384;

   private class_9499(GameProfile var1, Date var2) {
      this.field_48386 = var1;
      this.field_48385 = var2;
   }

   public GameProfile method_43857() {
      return this.field_48386;
   }

   public Date method_43862() {
      return this.field_48385;
   }

   public void method_43858(long var1) {
      this.field_48384 = var1;
   }

   public long method_43860() {
      return this.field_48384;
   }
}
