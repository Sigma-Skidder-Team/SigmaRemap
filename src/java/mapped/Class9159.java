package mapped;

import com.mentalfrostbyte.jello.resource.ResourceRegistry;
import com.mentalfrostbyte.jello.util.MultiUtilities;

import java.util.Date;

public class Class9159 {
   private static String[] field42045;
   public boolean field42046;
   public String[] field42047;
   public Date field42048 = new Date();

   public Class9159(String var1, boolean var2) {
      this.field42046 = var2;
      this.field42047 = MultiUtilities.method17745(var1, 200, ResourceRegistry.JelloLightFont18);
   }

   public int method34192() {
      return Class4346.method13574().method23952() * this.field42047.length + 20;
   }

   public int method34193() {
      return this.field42047.length != 1 ? 225 : Class4346.method13574().getStringWidth(this.field42047[0]) + 20;
   }
}
