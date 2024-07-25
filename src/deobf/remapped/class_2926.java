package remapped;

import com.google.gson.JsonObject;
import java.util.Date;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_2926 extends class_8958 {
   private static final Logger field_14262 = LogManager.getLogger();
   public String field_14264;
   public String field_14265;
   public String field_14261;
   public String field_14260;
   public Date field_14263;

   public static class_2926 method_13379(JsonObject var0) {
      class_2926 var3 = new class_2926();

      try {
         var3.field_14264 = class_274.method_1243("invitationId", var0, "");
         var3.field_14265 = class_274.method_1243("worldName", var0, "");
         var3.field_14261 = class_274.method_1243("worldOwnerName", var0, "");
         var3.field_14260 = class_274.method_1243("worldOwnerUuid", var0, "");
         var3.field_14263 = class_274.method_1242("date", var0);
      } catch (Exception var5) {
         field_14262.error("Could not parse PendingInvite: " + var5.getMessage());
      }

      return var3;
   }
}
