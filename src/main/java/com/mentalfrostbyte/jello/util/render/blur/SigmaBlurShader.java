package com.mentalfrostbyte.jello.util.render.blur;

import mapped.IResourceManager;
import mapped.IResourcePack;
import mapped.IResource;
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
   public Set<String> getResourceNamespaces() {
      return BlurEngine.method29975().getResourceManager().getResourceNamespaces();
   }

   @Override
   public IResource getResource(ResourceLocation var1) throws IOException {
      return (IResource)(!var1.getPath().equals("jelloblur") ? BlurEngine.method29975().getResourceManager().getResource(var1) : new JelloBlurJSON());
   }

   @Override
   public boolean hasResource(ResourceLocation var1) {
      return !var1.getPath().equals("jelloblur") ? BlurEngine.method29975().getResourceManager().hasResource(var1) : true;
   }

   @Override
   public List<IResource> getAllResources(ResourceLocation var1) throws IOException {
      return BlurEngine.method29975().getResourceManager().getAllResources(var1);
   }

   @Override
   public Collection<ResourceLocation> getAllResourceLocations(String var1, Predicate<String> var2) {
      return BlurEngine.method29975().getResourceManager().getAllResourceLocations(var1, var2);
   }

   @Override
   public Stream<IResourcePack> getResourcePackStream() {
      return null;
   }
}
