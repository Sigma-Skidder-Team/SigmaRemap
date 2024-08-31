package mapped;

import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;

public class ServerData {
   public String field33188;
   public String field33189;
   public ITextComponent field33190;
   public ITextComponent field33191;
   public long field33192;
   public int field33193 = SharedConstants.getVersion().getProtocolVersion();
   public ITextComponent field33194 = new StringTextComponent(SharedConstants.getVersion().getName());
   public boolean field33195;
   public List<ITextComponent> field33196 = Collections.<ITextComponent>emptyList();
   private Class2168 field33197 = Class2168.field14236;
   private String field33198;
   private boolean field33199;

   public ServerData(String var1, String var2, boolean var3) {
      this.field33188 = var1;
      this.field33189 = var2;
      this.field33199 = var3;
   }

   public CompoundNBT method25576() {
      CompoundNBT var3 = new CompoundNBT();
      var3.method109("name", this.field33188);
      var3.method109("ip", this.field33189);
      if (this.field33198 != null) {
         var3.method109("icon", this.field33198);
      }

      if (this.field33197 != Class2168.field14234) {
         if (this.field33197 == Class2168.field14235) {
            var3.method115("acceptTextures", false);
         }
      } else {
         var3.method115("acceptTextures", true);
      }

      return var3;
   }

   public Class2168 method25577() {
      return this.field33197;
   }

   public void method25578(Class2168 var1) {
      this.field33197 = var1;
   }

   public static ServerData method25579(CompoundNBT var0) {
      ServerData var3 = new ServerData(var0.method126("name"), var0.method126("ip"), false);
      if (var0.method119("icon", 8)) {
         var3.method25581(var0.method126("icon"));
      }

      if (!var0.method119("acceptTextures", 1)) {
         var3.method25578(Class2168.field14236);
      } else if (!var0.method132("acceptTextures")) {
         var3.method25578(Class2168.field14235);
      } else {
         var3.method25578(Class2168.field14234);
      }

      return var3;
   }

   @Nullable
   public String method25580() {
      return this.field33198;
   }

   public void method25581(String var1) {
      this.field33198 = var1;
   }

   public boolean isOnLAN() {
      return this.field33199;
   }

   public void method25583(ServerData var1) {
      this.field33189 = var1.field33189;
      this.field33188 = var1.field33188;
      this.method25578(var1.method25577());
      this.field33198 = var1.field33198;
      this.field33199 = var1.field33199;
   }
}
