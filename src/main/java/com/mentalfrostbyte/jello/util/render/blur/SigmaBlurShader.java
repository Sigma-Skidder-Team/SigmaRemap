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
      return BlurEngine.getMC().getResourceManager().getResourceNamespaces();
   }

   @Override
   public IResource getResource(ResourceLocation resource) throws IOException {
      return (IResource)(!resource.getPath().equals("jelloblur") ? BlurEngine.getMC().getResourceManager().getResource(resource) : new JelloBlurJSON());
   }

   @Override
   public boolean hasResource(ResourceLocation resource) {
      return !resource.getPath().equals("jelloblur") ? BlurEngine.getMC().getResourceManager().hasResource(resource) : true;
   }

   @Override
   public List<IResource> getAllResources(ResourceLocation resource) throws IOException {
      return BlurEngine.getMC().getResourceManager().getAllResources(resource);
   }

   @Override
   public Collection<ResourceLocation> getAllResourceLocations(String var1, Predicate<String> var2) {
      return BlurEngine.getMC().getResourceManager().getAllResourceLocations(var1, var2);
   }

   @Override
   public Stream<IResourcePack> getResourcePackStream() {
      return null;
   }
}
