package remapped;

import com.google.common.collect.Lists;
import java.io.IOException;
import java.util.Collection;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextFormatting;

public class class_8077 implements Packet<class_392> {
   private String field_41349 = "";
   private ITextComponent field_41340 = StringTextComponent.EMPTY;
   private ITextComponent field_41341 = StringTextComponent.EMPTY;
   private ITextComponent field_41339 = StringTextComponent.EMPTY;
   private String field_41345 = class_1014.field_5325.field_5324;
   private String field_41347 = class_5006.field_25901.field_25895;
   private TextFormatting field_41343 = TextFormatting.RESET;
   private final Collection<String> field_41348 = Lists.newArrayList();
   private int field_41342;
   private int field_41344;

   public class_8077() {
   }

   public class_8077(class_3903 var1, int var2) {
      this.field_41349 = var1.method_23383();
      this.field_41342 = var2;
      if (var2 == 0 || var2 == 2) {
         this.field_41340 = var1.method_18066();
         this.field_41344 = var1.method_18067();
         this.field_41345 = var1.method_23379().field_5324;
         this.field_41347 = var1.method_23382().field_25895;
         this.field_41343 = var1.method_23381();
         this.field_41341 = var1.method_18058();
         this.field_41339 = var1.method_18065();
      }

      if (var2 == 0) {
         this.field_41348.addAll(var1.method_23378());
      }
   }

   public class_8077(class_3903 var1, Collection<String> var2, int var3) {
      if (var3 != 3 && var3 != 4) {
         throw new IllegalArgumentException("Method must be join or leave for player constructor");
      } else if (var2 != null && !var2.isEmpty()) {
         this.field_41342 = var3;
         this.field_41349 = var1.method_23383();
         this.field_41348.addAll(var2);
      } else {
         throw new IllegalArgumentException("Players cannot be null/empty");
      }
   }

   @Override
   public void method_28775(class_8248 var1) throws IOException {
      this.field_41349 = var1.method_37784(16);
      this.field_41342 = var1.readByte();
      if (this.field_41342 == 0 || this.field_41342 == 2) {
         this.field_41340 = var1.method_37776();
         this.field_41344 = var1.readByte();
         this.field_41345 = var1.method_37784(40);
         this.field_41347 = var1.method_37784(40);
         this.field_41343 = var1.<TextFormatting>method_37787(TextFormatting.class);
         this.field_41341 = var1.method_37776();
         this.field_41339 = var1.method_37776();
      }

      if (this.field_41342 == 0 || this.field_41342 == 3 || this.field_41342 == 4) {
         int var4 = var1.method_37778();

         for (int var5 = 0; var5 < var4; var5++) {
            this.field_41348.add(var1.method_37784(40));
         }
      }
   }

   @Override
   public void method_28776(class_8248 var1) throws IOException {
      var1.method_37760(this.field_41349);
      var1.writeByte(this.field_41342);
      if (this.field_41342 == 0 || this.field_41342 == 2) {
         var1.method_37779(this.field_41340);
         var1.writeByte(this.field_41344);
         var1.method_37760(this.field_41345);
         var1.method_37760(this.field_41347);
         var1.method_37750(this.field_41343);
         var1.method_37779(this.field_41341);
         var1.method_37779(this.field_41339);
      }

      if (this.field_41342 == 0 || this.field_41342 == 3 || this.field_41342 == 4) {
         var1.method_37743(this.field_41348.size());

         for (String var5 : this.field_41348) {
            var1.method_37760(var5);
         }
      }
   }

   public void method_36693(class_392 var1) {
      var1.method_1938(this);
   }

   public String method_36690() {
      return this.field_41349;
   }

   public ITextComponent method_36688() {
      return this.field_41340;
   }

   public Collection<String> method_36692() {
      return this.field_41348;
   }

   public int method_36694() {
      return this.field_41342;
   }

   public int method_36689() {
      return this.field_41344;
   }

   public TextFormatting method_36684() {
      return this.field_41343;
   }

   public String method_36685() {
      return this.field_41345;
   }

   public String method_36695() {
      return this.field_41347;
   }

   public ITextComponent method_36687() {
      return this.field_41341;
   }

   public ITextComponent method_36686() {
      return this.field_41339;
   }
}
