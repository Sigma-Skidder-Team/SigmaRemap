package net.minecraft.resources;

import java.io.File;
import java.io.FileNotFoundException;

public class ResourcePackFileNotFoundException extends FileNotFoundException
{
    public ResourcePackFileNotFoundException(File p_i3699_1_, String p_i3699_2_)
    {
        super(String.format("'%s' in ResourcePack '%s'", p_i3699_2_, p_i3699_1_));
    }
}
