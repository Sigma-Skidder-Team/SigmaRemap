package mapped;

import com.google.gson.JsonObject;
import java.util.Date;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class6110 extends Class6109 {
   private static final Logger field27369 = LogManager.getLogger();
   public String field27370;
   public String field27371;
   public String field27372;
   public String field27373;
   public Date field27374;

   public static Class6110 method18873(JsonObject var0) {
      Class6110 var3 = new Class6110();

      try {
         var3.field27370 = Class5420.method17016("invitationId", var0, "");
         var3.field27371 = Class5420.method17016("worldName", var0, "");
         var3.field27372 = Class5420.method17016("worldOwnerName", var0, "");
         var3.field27373 = Class5420.method17016("worldOwnerUuid", var0, "");
         var3.field27374 = Class5420.method17020("date", var0);
      } catch (Exception var5) {
         field27369.error("Could not parse PendingInvite: " + var5.getMessage());
      }

      return var3;
   }
}
