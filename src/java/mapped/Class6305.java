package mapped;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

public class Class6305 implements ActionListener {
   private final String field27784;
   private final File field27785;
   private final Class9774 field27786;
   private final Class7155 field27787;
   public final Class9478 field27788;

   public Class6305(Class9478 var1, String var2, File var3, Class9774 var4, Class7155 var5) {
      this.field27788 = var1;
      this.field27784 = var2;
      this.field27785 = var3;
      this.field27786 = var4;
      this.field27787 = var5;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      this.field27787.field30735 = ((Class1760)var1.getSource()).getByteCount();
      if (this.field27787.field30735 >= this.field27787.field30736 && !Class9478.method36596(this.field27788) && !Class9478.method36597(this.field27788)) {
         try {
            Class9478.method36598(this.field27788, true);
            Class9478.method36599(this.field27788, this.field27784, this.field27785, this.field27786);
         } catch (IOException var5) {
            Class9478.method36600().error("Error extracting archive", var5);
            Class9478.method36601(this.field27788, true);
         }
      }
   }
}
