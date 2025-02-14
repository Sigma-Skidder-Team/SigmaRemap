package mapped;

import com.google.common.hash.Hashing;
import com.google.common.io.Files;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;

public class Class6313 implements ActionListener {
   private final File field27809;
   private final Class7155 field27810;
   private final Class6120 field27811;
   public final Class9478 field27812;

   public Class6313(Class9478 var1, File var2, Class7155 var3, Class6120 var4) {
      this.field27812 = var1;
      this.field27809 = var2;
      this.field27810 = var3;
      this.field27811 = var4;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      this.field27810.field30735 = ((Class1760)var1.getSource()).getByteCount();
      if (this.field27810.field30735 >= this.field27810.field30736 && !Class9478.method36596(this.field27812)) {
         try {
            String var4 = Hashing.sha1().hashBytes(Files.toByteArray(this.field27809)).toString();
            if (var4.equals(this.field27811.field27404)) {
               FileUtils.copyFile(this.field27809, Class9478.method36602(this.field27812));
               Class9478.method36603(this.field27812, true);
            } else {
               Class9478.method36600().error("Resourcepack had wrong hash (expected " + this.field27811.field27404 + ", found " + var4 + "). Deleting it.");
               FileUtils.deleteQuietly(this.field27809);
               Class9478.method36601(this.field27812, true);
            }
         } catch (IOException var5) {
            Class9478.method36600().error("Error copying resourcepack file", var5.getMessage());
            Class9478.method36601(this.field27812, true);
         }
      }
   }
}
