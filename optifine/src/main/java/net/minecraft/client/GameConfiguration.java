package net.minecraft.client;

import com.mojang.authlib.properties.PropertyMap;
import java.io.File;
import java.net.Proxy;
import javax.annotation.Nullable;
import net.minecraft.client.renderer.ScreenSize;
import net.minecraft.client.resources.FolderResourceIndex;
import net.minecraft.client.resources.ResourceIndex;
import net.minecraft.util.Session;

public class GameConfiguration
{
    public final GameConfiguration.UserInformation userInfo;
    public final ScreenSize displayInfo;
    public final GameConfiguration.FolderInformation folderInfo;
    public final GameConfiguration.GameInformation gameInfo;
    public final GameConfiguration.ServerInformation serverInfo;

    public GameConfiguration(GameConfiguration.UserInformation p_i411_1_, ScreenSize p_i411_2_, GameConfiguration.FolderInformation p_i411_3_, GameConfiguration.GameInformation p_i411_4_, GameConfiguration.ServerInformation p_i411_5_)
    {
        this.userInfo = p_i411_1_;
        this.displayInfo = p_i411_2_;
        this.folderInfo = p_i411_3_;
        this.gameInfo = p_i411_4_;
        this.serverInfo = p_i411_5_;
    }

    public static class FolderInformation
    {
        public final File gameDir;
        public final File resourcePacksDir;
        public final File assetsDir;
        @Nullable
        public final String assetIndex;

        public FolderInformation(File p_i4084_1_, File p_i4084_2_, File p_i4084_3_, @Nullable String p_i4084_4_)
        {
            this.gameDir = p_i4084_1_;
            this.resourcePacksDir = p_i4084_2_;
            this.assetsDir = p_i4084_3_;
            this.assetIndex = p_i4084_4_;
        }

        public ResourceIndex getAssetsIndex()
        {
            return (ResourceIndex)(this.assetIndex == null ? new FolderResourceIndex(this.assetsDir) : new ResourceIndex(this.assetsDir, this.assetIndex));
        }
    }

    public static class GameInformation
    {
        public final boolean isDemo;
        public final String version;
        public final String versionType;

        public GameInformation(boolean p_i3325_1_, String p_i3325_2_, String p_i3325_3_)
        {
            this.isDemo = p_i3325_1_;
            this.version = p_i3325_2_;
            this.versionType = p_i3325_3_;
        }
    }

    public static class ServerInformation
    {
        @Nullable
        public final String serverName;
        public final int serverPort;

        public ServerInformation(@Nullable String mcIn, int p_i1194_2_)
        {
            this.serverName = mcIn;
            this.serverPort = p_i1194_2_;
        }
    }

    public static class UserInformation
    {
        public final Session session;
        public final PropertyMap userProperties;
        public final PropertyMap profileProperties;
        public final Proxy proxy;

        public UserInformation(Session p_i2969_1_, PropertyMap p_i2969_2_, PropertyMap p_i2969_3_, Proxy p_i2969_4_)
        {
            this.session = p_i2969_1_;
            this.userProperties = p_i2969_2_;
            this.profileProperties = p_i2969_3_;
            this.proxy = p_i2969_4_;
        }
    }
}
