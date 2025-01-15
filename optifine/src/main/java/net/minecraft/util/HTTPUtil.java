package net.minecraft.util;

import com.google.common.util.concurrent.ListeningExecutorService;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.common.util.concurrent.ThreadFactoryBuilder;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.ServerSocket;
import java.net.URL;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executors;
import javax.annotation.Nullable;
import net.minecraft.util.text.TranslationTextComponent;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class HTTPUtil
{
    private static final Logger LOGGER = LogManager.getLogger();
    public static final ListeningExecutorService DOWNLOADER_EXECUTOR = MoreExecutors.listeningDecorator(Executors.newCachedThreadPool((new ThreadFactoryBuilder()).setDaemon(true).setUncaughtExceptionHandler(new DefaultUncaughtExceptionHandler(LOGGER)).setNameFormat("Downloader %d").build()));

    public static CompletableFuture<?> downloadResourcePack(File saveFile, String packUrl, Map<String, String> p_180192_2_, int maxSize, @Nullable IProgressUpdate p_180192_4_, Proxy p_180192_5_)
    {
        return CompletableFuture.supplyAsync(() ->
        {
            HttpURLConnection httpurlconnection = null;
            InputStream inputstream = null;
            OutputStream outputstream = null;

            if (p_180192_4_ != null)
            {
                p_180192_4_.resetProgressAndMessage(new TranslationTextComponent("resourcepack.downloading"));
                p_180192_4_.displayLoadingString(new TranslationTextComponent("resourcepack.requesting"));
            }

            try {
                try {
                    byte[] abyte = new byte[4096];
                    URL url = new URL(packUrl);
                    httpurlconnection = (HttpURLConnection)url.openConnection(p_180192_5_);
                    httpurlconnection.setInstanceFollowRedirects(true);
                    float f = 0.0F;
                    float f1 = (float)p_180192_2_.entrySet().size();

                    for (Entry<String, String> entry : p_180192_2_.entrySet())
                    {
                        httpurlconnection.setRequestProperty(entry.getKey(), entry.getValue());

                        if (p_180192_4_ != null)
                        {
                            p_180192_4_.setLoadingProgress((int)(++f / f1 * 100.0F));
                        }
                    }

                    inputstream = httpurlconnection.getInputStream();
                    f1 = (float)httpurlconnection.getContentLength();
                    int i = httpurlconnection.getContentLength();

                    if (p_180192_4_ != null)
                    {
                        p_180192_4_.displayLoadingString(new TranslationTextComponent("resourcepack.progress", String.format(Locale.ROOT, "%.2f", f1 / 1000.0F / 1000.0F)));
                    }

                    if (saveFile.exists())
                    {
                        long j = saveFile.length();

                        if (j == (long)i)
                        {
                            if (p_180192_4_ != null)
                            {
                                p_180192_4_.setDoneWorking();
                            }

                            Object object1 = null;
                            return object1;
                        }

                        LOGGER.warn("Deleting {} as it does not match what we currently have ({} vs our {}).", saveFile, i, j);
                        FileUtils.deleteQuietly(saveFile);
                    }
                    else if (saveFile.getParentFile() != null)
                    {
                        saveFile.getParentFile().mkdirs();
                    }

                    outputstream = new DataOutputStream(new FileOutputStream(saveFile));

                    if (maxSize > 0 && f1 > (float)maxSize)
                    {
                        if (p_180192_4_ != null)
                        {
                            p_180192_4_.setDoneWorking();
                        }

                        throw new IOException("Filesize is bigger than maximum allowed (file is " + f + ", limit is " + maxSize + ")");
                    }

                    int k;

                    while ((k = inputstream.read(abyte)) >= 0)
                    {
                        f += (float)k;

                        if (p_180192_4_ != null)
                        {
                            p_180192_4_.setLoadingProgress((int)(f / f1 * 100.0F));
                        }

                        if (maxSize > 0 && f > (float)maxSize)
                        {
                            if (p_180192_4_ != null)
                            {
                                p_180192_4_.setDoneWorking();
                            }

                            throw new IOException("Filesize was bigger than maximum allowed (got >= " + f + ", limit was " + maxSize + ")");
                        }

                        if (Thread.interrupted())
                        {
                            LOGGER.error("INTERRUPTED");

                            if (p_180192_4_ != null)
                            {
                                p_180192_4_.setDoneWorking();
                            }

                            Object object = null;
                            return object;
                        }

                        outputstream.write(abyte, 0, k);
                    }

                    if (p_180192_4_ != null)
                    {
                        p_180192_4_.setDoneWorking();
                        return null;
                    }
                }
                catch (Throwable throwable)
                {
                    throwable.printStackTrace();

                    if (httpurlconnection != null)
                    {
                        InputStream inputstream1 = httpurlconnection.getErrorStream();

                        try
                        {
                            LOGGER.error(IOUtils.toString(inputstream1));
                        }
                        catch (IOException ioexception)
                        {
                            ioexception.printStackTrace();
                        }
                    }

                    if (p_180192_4_ != null)
                    {
                        p_180192_4_.setDoneWorking();
                        return null;
                    }
                }

                return null;
            }
            finally {
                IOUtils.closeQuietly(inputstream);
                IOUtils.closeQuietly(outputstream);
            }
        }, DOWNLOADER_EXECUTOR);
    }

    public static int getSuitableLanPort()
    {
        try (ServerSocket serversocket = new ServerSocket(0))
        {
            int i = serversocket.getLocalPort();
            return i;
        }
        catch (IOException var14)
        {
            return 25564;
        }
    }
}
