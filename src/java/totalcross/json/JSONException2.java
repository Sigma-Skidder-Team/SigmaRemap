package totalcross.json;

/**
 * Idk what happened here but this seems to be a second JSONException
 * - Raca
 *
 * no shit nigga it says "2"
 */
public class JSONException2 extends RuntimeException {
   public JSONException2(String var1) {
      super(var1);
   }

   public JSONException2(String var1, Throwable var2) {
      super(var1, var2);
   }

   public JSONException2(Throwable var1) {
      super(var1.getMessage(), var1);
   }
}
