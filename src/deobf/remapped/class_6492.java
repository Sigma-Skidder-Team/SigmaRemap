package remapped;

import com.google.common.hash.Hashing;
import com.google.common.io.Files;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;

public class class_6492 implements ActionListener {
   private final File field_33069;
   private final class_1432 field_33070;
   private final class_8105 field_33068;

   private class_6492(class_8531 var1, File var2, class_1432 var3, class_8105 var4) {
      this.field_33067 = var1;
      this.field_33069 = var2;
      this.field_33070 = var3;
      this.field_33068 = var4;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      this.field_33070.field_7734 = ((class_9796)var1.getSource()).getByteCount();
      if (this.field_33070.field_7734 >= this.field_33070.field_7732 && !class_8531.method_39273(this.field_33067)) {
         try {
            String var4 = Hashing.sha1().hashBytes(Files.toByteArray(this.field_33069)).toString();
            if (var4.equals(this.field_33068.field_41510)) {
               FileUtils.copyFile(this.field_33069, class_8531.method_39277(this.field_33067));
               class_8531.method_39268(this.field_33067, true);
            } else {
               class_8531.method_39275().error("Resourcepack had wrong hash (expected " + this.field_33068.field_41510 + ", found " + var4 + "). Deleting it.");
               FileUtils.deleteQuietly(this.field_33069);
               class_8531.method_39263(this.field_33067, true);
            }
         } catch (IOException var5) {
            class_8531.method_39275().error("Error copying resourcepack file", var5.getMessage());
            class_8531.method_39263(this.field_33067, true);
         }
      }
   }
}
