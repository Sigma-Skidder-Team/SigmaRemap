package com.mentalfrostbyte.jello.util.render.blur;

import mapped.IResourceManager;
import mapped.IResourcePack;
import mapped.JSonShader;
import mapped.JelloBlurJSON;
import net.minecraft.util.ResourceLocation;

import java.io.IOException;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class SigmaBlurShader implements IResourceManager {
   @Override
   public Set<String> method579() {
      return BlurEngine.method29975().getResourceManager().method579();
   }

   @Override
   public JSonShader getShader(ResourceLocation var1) throws IOException {
      return (JSonShader)(!var1.getPath().equals("jelloblur") ? BlurEngine.method29975().getResourceManager().getShader(var1) : new JelloBlurJSON());
   }

   @Override
   public boolean method581(ResourceLocation var1) {
      return !var1.getPath().equals("jelloblur") ? BlurEngine.method29975().getResourceManager().method581(var1) : true;
   }

   @Override
   public List<JSonShader> method582(ResourceLocation var1) throws IOException {
      return BlurEngine.method29975().getResourceManager().method582(var1);
   }

   @Override
   public Collection<ResourceLocation> method583(String var1, Predicate<String> var2) {
      return BlurEngine.method29975().getResourceManager().method583(var1, var2);
   }

   @Override
   public Stream<IResourcePack> method584() {
      return null;
   }
}
