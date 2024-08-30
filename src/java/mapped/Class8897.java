package mapped;

import com.mentalfrostbyte.jello.module.impl.world.disabler.ViperDisabler;

public class Class8897 {
   private static String[] field40264;
   private long field40265;
   private Packet field40266;
   public final ViperDisabler field40267;

   public Class8897(ViperDisabler var1, Packet<?> var2, long var3) {
      this.field40267 = var1;
      this.field40266 = var2;
      this.field40265 = System.currentTimeMillis() + var3;
   }

   public boolean method32423() {
      return this.field40265 - System.currentTimeMillis() < 0L;
   }

   public Packet method32424() {
      return this.field40266;
   }
}
