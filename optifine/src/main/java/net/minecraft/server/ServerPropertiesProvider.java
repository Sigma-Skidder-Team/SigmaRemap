package net.minecraft.server;

import java.nio.file.Path;
import java.util.function.UnaryOperator;
import net.minecraft.server.dedicated.ServerProperties;

public class ServerPropertiesProvider
{
    private final Path propertiesPath;
    private ServerProperties properties;

    public ServerPropertiesProvider(Path p_i1452_1_)
    {
        this.propertiesPath = p_i1452_1_;
        this.properties = ServerProperties.create(p_i1452_1_);
    }

    public ServerProperties getProperties()
    {
        return this.properties;
    }

    public void save()
    {
        this.properties.save(this.propertiesPath);
    }

    public ServerPropertiesProvider func_219033_a(UnaryOperator<ServerProperties> p_219033_1_)
    {
        (this.properties = p_219033_1_.apply(this.properties)).save(this.propertiesPath);
        return this;
    }
}
