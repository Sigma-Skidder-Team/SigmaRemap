package mapped;

import com.google.common.collect.Lists;
import java.io.IOException;
import java.util.Collection;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextFormatting;

public class Class5581 implements Packet<Class5116> {
   private String field24749 = "";
   private ITextComponent field24750 = StringTextComponent.EMPTY;
   private ITextComponent field24751 = StringTextComponent.EMPTY;
   private ITextComponent field24752 = StringTextComponent.EMPTY;
   private String field24753 = Class2225.field14554.field14559;
   private String field24754 = Class2212.field14462.field14467;
   private TextFormatting field24755 = TextFormatting.RESET;
   private final Collection<String> field24756 = Lists.newArrayList();
   private int field24757;
   private int field24758;

   public Class5581() {
   }

   public Class5581(Class8218 var1, int var2) {
      this.field24749 = var1.method28567();
      this.field24757 = var2;
      if (var2 == 0 || var2 == 2) {
         this.field24750 = var1.method28568();
         this.field24758 = var1.method28588();
         this.field24753 = var1.method28582().field14559;
         this.field24754 = var1.method28586().field14467;
         this.field24755 = var1.getColor();
         this.field24751 = var1.method28572();
         this.field24752 = var1.method28574();
      }

      if (var2 == 0) {
         this.field24756.addAll(var1.method28575());
      }
   }

   public Class5581(Class8218 var1, Collection<String> var2, int var3) {
      if (var3 != 3 && var3 != 4) {
         throw new IllegalArgumentException("Method must be join or leave for player constructor");
      } else if (var2 != null && !var2.isEmpty()) {
         this.field24757 = var3;
         this.field24749 = var1.method28567();
         this.field24756.addAll(var2);
      } else {
         throw new IllegalArgumentException("Players cannot be null/empty");
      }
   }

   @Override
   public void method17175(PacketBuffer var1) throws IOException {
      this.field24749 = var1.method35728(16);
      this.field24757 = var1.readByte();
      if (this.field24757 == 0 || this.field24757 == 2) {
         this.field24750 = var1.method35710();
         this.field24758 = var1.readByte();
         this.field24753 = var1.method35728(40);
         this.field24754 = var1.method35728(40);
         this.field24755 = var1.<TextFormatting>method35712(TextFormatting.class);
         this.field24751 = var1.method35710();
         this.field24752 = var1.method35710();
      }

      if (this.field24757 == 0 || this.field24757 == 3 || this.field24757 == 4) {
         int var4 = var1.method35714();

         for (int var5 = 0; var5 < var4; var5++) {
            this.field24756.add(var1.method35728(40));
         }
      }
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.method35729(this.field24749);
      var1.writeByte(this.field24757);
      if (this.field24757 == 0 || this.field24757 == 2) {
         var1.method35711(this.field24750);
         var1.writeByte(this.field24758);
         var1.method35729(this.field24753);
         var1.method35729(this.field24754);
         var1.method35713(this.field24755);
         var1.method35711(this.field24751);
         var1.method35711(this.field24752);
      }

      if (this.field24757 == 0 || this.field24757 == 3 || this.field24757 == 4) {
         var1.writeVarInt(this.field24756.size());

         for (String var5 : this.field24756) {
            var1.method35729(var5);
         }
      }
   }

   public void method17180(Class5116 var1) {
      var1.method15743(this);
   }

   public String method17525() {
      return this.field24749;
   }

   public ITextComponent method17526() {
      return this.field24750;
   }

   public Collection<String> method17527() {
      return this.field24756;
   }

   public int method17528() {
      return this.field24757;
   }

   public int method17529() {
      return this.field24758;
   }

   public TextFormatting method17530() {
      return this.field24755;
   }

   public String method17531() {
      return this.field24753;
   }

   public String method17532() {
      return this.field24754;
   }

   public ITextComponent method17533() {
      return this.field24751;
   }

   public ITextComponent method17534() {
      return this.field24752;
   }
}
