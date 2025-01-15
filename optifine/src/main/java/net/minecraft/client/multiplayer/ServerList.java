package net.minecraft.client.multiplayer;

import com.google.common.collect.Lists;
import java.io.File;
import java.util.List;
import net.minecraft.client.Minecraft;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.nbt.CompressedStreamTools;
import net.minecraft.nbt.ListNBT;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ServerList
{
    private static final Logger LOGGER = LogManager.getLogger();
    private final Minecraft mc;
    private final List<ServerData> servers = Lists.newArrayList();

    public ServerList(Minecraft p_i2322_1_)
    {
        this.mc = p_i2322_1_;
        this.loadServerList();
    }

    public void loadServerList()
    {
        try
        {
            this.servers.clear();
            CompoundNBT compoundnbt = CompressedStreamTools.read(new File(this.mc.gameDir, "servers.dat"));

            if (compoundnbt == null)
            {
                return;
            }

            ListNBT listnbt = compoundnbt.getList("servers", 10);

            for (int i = 0; i < listnbt.size(); ++i)
            {
                this.servers.add(ServerData.getServerDataFromNBTCompound(listnbt.getCompound(i)));
            }
        }
        catch (Exception exception)
        {
            LOGGER.error("Couldn't load server list", (Throwable)exception);
        }
    }

    public void saveServerList()
    {
        try
        {
            ListNBT listnbt = new ListNBT();

            for (ServerData serverdata : this.servers)
            {
                listnbt.add(serverdata.getNBTCompound());
            }

            CompoundNBT compoundnbt = new CompoundNBT();
            compoundnbt.put("servers", listnbt);
            CompressedStreamTools.safeWrite(compoundnbt, new File(this.mc.gameDir, "servers.dat"));
        }
        catch (Exception exception)
        {
            LOGGER.error("Couldn't save server list", (Throwable)exception);
        }
    }

    public ServerData getServerData(int index)
    {
        return this.servers.get(index);
    }

    public void func_217506_a(ServerData p_217506_1_)
    {
        this.servers.remove(p_217506_1_);
    }

    public void addServerData(ServerData server)
    {
        this.servers.add(server);
    }

    public int countServers()
    {
        return this.servers.size();
    }

    public void swapServers(int pos1, int pos2)
    {
        ServerData serverdata = this.getServerData(pos1);
        this.servers.set(pos1, this.getServerData(pos2));
        this.servers.set(pos2, serverdata);
        this.saveServerList();
    }

    public void set(int index, ServerData server)
    {
        this.servers.set(index, server);
    }

    public static void saveSingleServer(ServerData server)
    {
        ServerList serverlist = new ServerList(Minecraft.getInstance());
        serverlist.loadServerList();

        for (int i = 0; i < serverlist.countServers(); ++i)
        {
            ServerData serverdata = serverlist.getServerData(i);

            if (serverdata.serverName.equals(server.serverName) && serverdata.serverIP.equals(server.serverIP))
            {
                serverlist.set(i, server);
                break;
            }
        }

        serverlist.saveServerList();
    }
}
