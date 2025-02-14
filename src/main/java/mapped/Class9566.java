package mapped;

import org.newdawn.slick.Color;
import org.newdawn.slick.util.Log;
import org.newdawn.slick.util.ResourceLoader;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;


public class Class9566 {
   private Image field44549;
   private String field44550;
   private HashMap field44551 = new HashMap();
   private int field44552 = 2;

   public Class9566(String var1) throws Class2451 {
      this(var1, null);
   }

   public Class9566(String var1, Color var2) throws Class2451 {
      var1 = var1.replace('\\', '/');
      this.field44550 = var1.substring(0, var1.lastIndexOf("/") + 1);
      this.method37074(var1, var2);
   }

   public Class9566(String var1, int var2) throws Class2451 {
      this(var1, var2, null);
   }

   public Class9566(String var1, int var2, Color var3) throws Class2451 {
      this.field44552 = var2;
      var1 = var1.replace('\\', '/');
      this.field44550 = var1.substring(0, var1.lastIndexOf("/") + 1);
      this.method37074(var1, var3);
   }

   public Image method37071() {
      return this.field44549;
   }

   public Image method37072(String var1) {
      Class6464 var4 = (Class6464)this.field44551.get(var1);
      if (var4 != null) {
         return this.field44549.method23551(var4.field28405, var4.field28406, var4.field28407, var4.field28408);
      } else {
         throw new RuntimeException("Unknown sprite from packed sheet: " + var1);
      }
   }

   public Class7386 method37073(String var1) {
      Image var4 = this.method37072(var1);
      Class6464 var5 = (Class6464)this.field44551.get(var1);
      return new Class7386(var4, var5.field28407 / var5.field28409, var5.field28408 / var5.field28410);
   }

   private void method37074(String var1, Color var2) throws Class2451 {
      BufferedReader var5 = new BufferedReader(new InputStreamReader(ResourceLoader.getResourceAsStream(var1)));

      try {
         this.field44549 = new Image(this.field44550 + var5.readLine(), false, this.field44552, var2);

         while (var5.ready() && var5.readLine() != null) {
            Class6464 var6 = new Class6464(this, var5);
            this.field44551.put(var6.field28411, var6);
            if (var5.readLine() == null) {
               break;
            }
         }
      } catch (Exception var7) {
         Log.error(var7);
         throw new Class2451("Failed to process definitions file - invalid format?", var7);
      }
   }
}
